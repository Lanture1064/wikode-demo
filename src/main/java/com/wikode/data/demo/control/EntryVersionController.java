package com.wikode.data.demo.control;

import com.wikode.data.demo.service.EntryVersionRepository;
import com.wikode.data.demo.entity.EntryVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/version")
public class EntryVersionController {
    @Autowired
    private EntryVersionRepository entryVersionRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewVersion(@RequestParam Integer lastVersionID,@RequestParam String content) {
        EntryVersion n = new EntryVersion();
        return "Saved.";
    }
}
