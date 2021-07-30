package com.mila.sfpetclinic.repositories;

import com.mila.sfpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository  extends CrudRepository<Speciality,
        Long> {
}

