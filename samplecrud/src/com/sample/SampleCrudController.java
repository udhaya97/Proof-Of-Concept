package com.sample;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sample.dao.SampleMapper;
import com.sample.model.Sample;

@RestController

public class SampleCrudController {
	
	
	
	@Autowired
	
	SampleMapper sm;
	
	@RequestMapping("/")
	public ModelAndView hel()
	{
		return new ModelAndView("first");
	}
	@RequestMapping("/hai")
	public ModelAndView hell()
	{
		return new ModelAndView("second");
	}
	@RequestMapping("/addSample")
	public ModelAndView saveSamp()
	{
		
		ModelAndView mdv = new ModelAndView("addsample");
		
		mdv.addObject("samp", new Sample());
		
		return mdv;
	}
	@PostMapping("/saveSamples")
	public ModelAndView saveSamples(@ModelAttribute("samp") Sample sample)
	{
		if(sample.getrNo() == 0)
		{
		System.out.println("value is :"+sample.getName());
		
			sm.saveSample(sample);
		}
		else
		{
			sm.updateSample(sample);
		}
		
		
		return new ModelAndView("redirect:/listSample");
	}
	@GetMapping("/listSample")
	public ModelAndView listSamp()
	{
		
		ModelAndView mdv = new ModelAndView("listsample");
		
		List<Sample> list = sm.getAllSamples();
		
		mdv.addObject("lis", list);
		
		return mdv;
	}

	@RequestMapping("/deletesamp/{rNo}")
	public ModelAndView deleteSample(@PathVariable("rNo") int rNo)
	{
		sm.deleteSample(rNo);
		
		return new ModelAndView("redirect:/listSample");
	}
	
	@RequestMapping("/updatesamp/{rNo}")
	public ModelAndView updateSample(@ModelAttribute("samp") Sample sam, @PathVariable("rNo") int rNo)
	{
		
		
	
		
		Sample sample = sm.getSample(rNo);
		ModelAndView mdv = new ModelAndView("addsample","samp",sample);
		
		return mdv;
	}
	@PostMapping("/saveSamplestwo/{rNo")
	public ModelAndView saveSamplesTwo(@ModelAttribute("sampl") Sample sample,@PathVariable("rNo") int rNo)
	{
		Sample samplee = sm.getSample(rNo);
		if(samplee.getrNo() == rNo)
		{
			sm.updateSample(sample);
		}
		
		return new ModelAndView("redirect:/listSample");
	}
}
