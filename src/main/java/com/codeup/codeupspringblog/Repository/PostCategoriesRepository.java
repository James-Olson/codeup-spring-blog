package com.codeup.codeupspringblog.Repository;

import com.codeup.codeupspringblog.models.PostCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCategoriesRepository extends JpaRepository<PostCategories, Long> {
}
