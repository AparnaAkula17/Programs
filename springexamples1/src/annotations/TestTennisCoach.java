package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTennisCoach
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContextTennis.xml");
		TennisCoach tcoach=context.getBean(TennisCoach.class);
		FootBallCoach fcoach=context.getBean(FootBallCoach.class);
		System.out.println(tcoach.getDailyWorkout());
		System.out.println(tcoach.getDailyFortune());
		fcoach.show();
		context.close();
	}
}

