package com.mila.sfpetclinic.repositories;

import com.mila.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository  extends CrudRepository<Pet, Long> {
}

