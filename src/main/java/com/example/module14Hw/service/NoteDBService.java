package com.example.module14Hw.service;

import com.example.module14Hw.entity.Note;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class NoteDBService {

    private List<Note> noteList = new ArrayList<>();


    public List<Note> getNoteList() {
        return this.noteList;
    }

    public Note addNote(Note note) {
        note.setId(UUID.randomUUID());
        noteList.add(note);
        return note;
    }

    public void deleteNoteById(long id) {
        boolean isFound = false;
       for (Note n: noteList){
           if (n.getId().equals(id)){
               isFound = true;
               noteList.remove(n);
           }
       }

        if (!isFound) {
            throw new IllegalArgumentException("Note with ID " + id + "not found");
        }
    }

    public void updateNote(Note note) {
        boolean isFound = false;
        for (Note n : noteList) {
            if (n.getId().equals(note.getId())) {
                n.setTitle(note.getTitle());
                n.setContent(note.getContent());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new IllegalArgumentException("Note with ID " + note.getId() + "not found");
        }
    }

    public Note getNoteById(long id) {
        boolean isFound = false;
        Note resultNote = null;
        for (Note n : noteList) {
            if (n.getId().equals(id)) {
                isFound = true;
                resultNote = n;
            }

        }
        if (!isFound) {
            throw new IllegalArgumentException("Note with ID " + id + "not found");
        }
        return resultNote;
    }

}
