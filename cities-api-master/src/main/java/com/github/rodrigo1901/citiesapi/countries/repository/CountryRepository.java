package com.github.rodrigo1901.citiesapi.countries.repository;

import com.github.rodrigo1901.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
