package com.example.module14Hw;

import com.example.module14Hw.entity.Note;
import com.example.module14Hw.service.NoteService;
import com.example.module14Hw.service.NoteServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NoteServiceTest {

    public static void main(String[] args) {

        NoteServiceImpl noteService = new NoteServiceImpl();

        Note note = new Note();
        note.setTitle("title 1");
        note.setContent("content 1");
        noteService.add(note);

        System.out.println("note = " + note);

    }


}
