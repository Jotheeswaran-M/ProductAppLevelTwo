package gov.my_repo.WebApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.my_repo.WebApplication.Model.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}

