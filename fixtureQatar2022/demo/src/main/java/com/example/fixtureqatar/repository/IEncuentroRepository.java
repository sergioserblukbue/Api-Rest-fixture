package com.example.fixtureqatar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fixtureqatar.entity.Encuentro;

@Repository
public interface IEncuentroRepository extends JpaRepository<Encuentro,Integer> {

}
