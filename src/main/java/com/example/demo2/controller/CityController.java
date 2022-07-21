package com.example.demo2.controller;

import com.example.demo2.model.City;
import com.example.demo2.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    CityRepository cityRepository;

    @GetMapping("cities")
    String cities(Model model) {
        List<City> cities = cityRepository.findAll();
        model.addAttribute("cities", cities);
        return "cities";
    }

    @GetMapping("delete")
    String delete(int id) {
        cityRepository.deleteById(id);
        return "redirect:cities";
    }

    @GetMapping("create")
    String create() {
        return "create";
    }

    @PostMapping("create")
    String create(City city) {
        cityRepository.save(city);
        return "redirect:cities";
    }

    @GetMapping("update")
    String update(Model model, int id) {
        City city = cityRepository.findById(id).get();
        model.addAttribute("city", city);
        return "update";
    }

    @PostMapping("update")
    String update(City city) {
        cityRepository.save(city);
        return "redirect:cities";
    }
}
