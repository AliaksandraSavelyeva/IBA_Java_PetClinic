package com.mila.sfpetclinic.services.map;

import com.mila.sfpetclinic.model.BaseEntity;
import org.springframework.context.annotation.Profile;

import java.util.*;
@Profile({"default", "map"})
public abstract class AbstractMapService <T extends BaseEntity, ID extends
        Long>{
    protected Map<Long, T> map = new HashMap<>();
    
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById (ID id){
        return map.get(id);
    }
    T save (T object ){
        if (object!=null){
            if (object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }
        else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete (T object){
        map.entrySet().removeIf(entity->entity.getValue().equals(object)); /*удаление по условию, если из множества Entity удалить объекты которые удовлетворяют значениям*/
    }
    private Long getNextId(){
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) +1;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}

