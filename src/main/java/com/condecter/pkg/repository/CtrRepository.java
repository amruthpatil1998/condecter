package com.condecter.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.condecter.pkg.entity.Condecter;

public interface CtrRepository extends JpaRepository<Condecter, Integer> {

}
