package fao.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fao.org.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
