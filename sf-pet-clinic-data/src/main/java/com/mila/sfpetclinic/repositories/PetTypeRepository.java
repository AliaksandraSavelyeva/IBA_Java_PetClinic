package com.mila.sfpetclinic.repositories;

import com.mila.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
