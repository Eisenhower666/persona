package com.thoughtworks.xbyi.persona.application.restful;

import com.thoughtworks.xbyi.persona.domain.entity.ConsumeFeature;
import com.thoughtworks.xbyi.persona.domain.entity.Credit;
import com.thoughtworks.xbyi.persona.domain.entity.Demographic;
import com.thoughtworks.xbyi.persona.domain.repository.DemographicRepository;
import com.thoughtworks.xbyi.persona.domain.repository.IConsumeRepository;
import com.thoughtworks.xbyi.persona.domain.repository.ICreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaProfileEndPoint {
    @Autowired
    private DemographicRepository demographicRepository;

    @Autowired
    private ICreditRepository creditRepository;

    @Autowired
    private IConsumeRepository consumeRepository;

    @GetMapping("/demographics")
    List<Demographic> getDemographics() {
        return demographicRepository.findAll();
    }

    @GetMapping("/credit")
    List<Credit> getCredit() {return creditRepository.findAll();}

    @GetMapping("/consume")
    List<ConsumeFeature> getConsume() {return consumeRepository.findAll();}
}
