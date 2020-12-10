package org.sid.inventoryservice.Repository;

import org.sid.inventoryservice.Entity.Prodect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;


@RepositoryRestController
public interface ProdectRepository extends JpaRepository<Prodect,Long> {

}
