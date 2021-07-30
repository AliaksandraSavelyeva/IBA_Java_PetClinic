package com.mila.sfpetclinic.services;

import com.mila.sfpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    List<Owner> findAllByLastNameLike(String lastName);

}
