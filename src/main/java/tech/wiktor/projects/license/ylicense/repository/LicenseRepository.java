package tech.wiktor.projects.license.ylicense.repository;

import org.springframework.data.repository.CrudRepository;
import tech.wiktor.projects.license.ylicense.model.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

}