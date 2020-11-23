package com.osi.note.repository;

import com.osi.note.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
