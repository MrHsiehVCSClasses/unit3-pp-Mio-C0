package u3pp;

/**
 *
 * 
 * @author //Mio.C
 *
 */

public class LeapYear {
	/**
	 * Building a program that will determine whether the given year is a leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year > 1582)
		{

			if (year % 100 != 0)
			{

				if (year % 4 == 0)
				{
					return true;
				}
				return false;
			}
			else if (year % 400 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		}
	}
