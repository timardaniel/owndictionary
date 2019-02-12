package com.codecool.owndictionary.Repository;

import com.codecool.owndictionary.Model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {
}
