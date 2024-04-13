package com.example.module14Hw.service;

import com.example.module14Hw.entity.Note;
import com.example.module14Hw.service.NoteDBService;
import com.example.module14Hw.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteDBService noteDBService;
     @Override
    public List<Note> listAll() {
        return noteDBService.getNoteList();
    }

    @Override
    public Note add(Note note) {
      return noteDBService.addNote(note);
    }

    @Override
    public void deleteById(long id) {
        noteDBService.deleteNoteById(id);
    }

    @Override
    public void update(Note note) {
         noteDBService.updateNote(note);
    }

    @Override
    public Note getById(long id) {
        return noteDBService.getNoteById(id);
    }
}
