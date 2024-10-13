package ru.geekbrains.springhw6.service;
import ru.geekbrains.springhw6.aspects.TrackUserAction;
import ru.geekbrains.springhw6.model.Note;

import java.util.List;

public interface NoteService {

    Note createNote(Note note);

    List<Note> getAllNotes();

    Note getNoteById(Long id);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
