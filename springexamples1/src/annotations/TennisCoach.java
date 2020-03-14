package annotations;
import org.springframework.stereotype.*;

@Component("myCoach")
public class TennisCoach
{
	private FortuneService fortuneService;
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	public String getDailyWorkout()
	{
		return "Practise ur backhand volley";
	}
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
}
