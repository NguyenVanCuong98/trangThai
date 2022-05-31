package com.bezkoder.spring.hibernate.onetomany.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.hibernate.onetomany.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findByTutorialId(Long postId);

  @Query(value = "select * from comments order by tutorial_id asc ",nativeQuery = true)
  List<Comment> findByTutorialIdOrderByTutorialIdAsc();
  @Transactional
  void deleteByTutorialId(long tutorialId);
}
