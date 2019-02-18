package theo2.door2.mileage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WickedControllers {

	@RequestMapping("/")
		public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showAddForm() {
		return  new ModelAndView("mileage-form");
		
	}

	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(
			@RequestParam("mpg") int mpg, @RequestParam("gallons") int gallons){
				int result = mpg * gallons;
				ModelAndView mav = new ModelAndView("mileage-result");
				mav.addObject("mpg", mpg);
				mav.addObject("gallons", gallons);
				mav.addObject("result", result);
				return mav;
			}
	@RequestMapping("/oil-calc")
	public ModelAndView showOilCalc() {
		return  new ModelAndView("/oil-calc");
		
	}
	@RequestMapping("/oil-calc-result")
	public ModelAndView showOilCalcResult(
			@RequestParam("oilGallons") int oilGallons){
				int result = oilGallons / 5;
				int donation = oilGallons % 5;
				ModelAndView mav = new ModelAndView("oil-calc-result");
				mav.addObject("oilGallons", oilGallons);
				mav.addObject("donation", donation);
				mav.addObject("result", result);
				return mav;
	
		}
	@RequestMapping("/rtg")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("rtg");
		return mav;
	}
	
	
	@RequestMapping("/rtg-result")
	public ModelAndView showStory(
			@RequestParam("adj") String adj,
			@RequestParam("noun") String noun
			
			) {
		ModelAndView mav = new ModelAndView("rtg-result");
		mav.addObject("adj", adj);
		mav.addObject("noun", noun);
		return mav;
	}
	@RequestMapping("/ptg")
	public ModelAndView showWordForm() {
		ModelAndView mav = new ModelAndView("ptg");
		return mav;
	}
	@RequestMapping("/ptg-result")
	public ModelAndView showWordStory(
			@RequestParam("adj") String adj,
			@RequestParam("wordCount") int wordCount
			
			) {
		ModelAndView mav = new ModelAndView("ptg-result");
		String repeatMe = "";
		
		
		for(int i = 0; i< wordCount; i++) {
			repeatMe = repeatMe+ " " + adj;
		}
		
		mav.addObject("adj", adj);
		mav.addObject("wordCount", wordCount);
		mav.addObject("repeatMe", repeatMe);
		
		
		
		return mav;
}
}
