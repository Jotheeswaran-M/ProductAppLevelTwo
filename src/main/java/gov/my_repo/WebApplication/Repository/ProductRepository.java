package gov.my_repo.WebApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.my_repo.WebApplication.Model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

