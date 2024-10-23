public class EnumExample {
	
	enum TrafficLight {
		GREEN,RED,YELLOW,ORANGE
	}
	enum Level {
		LOW,MEDIUM, HIGH
	}
	enum DaysOfWeek {
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY, SATURDAY  
	}
	enum Direction {
		 NORTH,SOUTH,EAST,WEST
	}
	enum Seasons {
		SPRING, SUMMER, WINTER
	}
	enum Gender {
        MALE ,FEMALE
	}
	enum Fruit {
		APPLE, ORANGE, BANANA
	}
	enum Rank {
		FIRST, SECOND, THIRD
	}
	enum Switch {
		ON , OFF
	}
	enum Transport {
		CAR, BUS, TRAIN, PLANE, BICYCLE, WALK
	}
	public static void main(String[] args) {
		
		TrafficLight  trafficlight = TrafficLight.RED;
		System.out.println( trafficlight);
		
		Level level = Level.HIGH;
		System.out.println(level);
		
		DaysOfWeek daysofweek = DaysOfWeek.MONDAY;
		System.out.println(daysofweek);
		
		Direction direction = Direction.NORTH;
		System.out.println(direction);
		
		Seasons season = Seasons.WINTER;
		System.out.println(season);
		
		Gender gender = Gender.FEMALE;
		System.out.println(gender);
		
		Fruit fruit = Fruit.APPLE;
		System.out.println(fruit);
		
		Rank rank = Rank.FIRST;
		System.out.println(rank);
		
		Switch switchs = Switch.ON;
		System.out.println(switchs);
		
		Transport transport = Transport.CAR;
		System.out.println(transport);
	}

}
