package com.wikode.data.demo.control;

import com.wikode.data.demo.mapper.EntryRepository;
import com.wikode.data.demo.entity.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/entry")
public class EntryController {
    @Autowired
    private EntryRepository entryRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addEntry (@RequestParam String title) {
        Entry n = new Entry();
        n.setTitle(title);
        entryRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/getByID")
    public @ResponseBody Optional<Entry> getEntryByID (@RequestParam Integer id) {
        return entryRepository.findById(id);
    }
}
