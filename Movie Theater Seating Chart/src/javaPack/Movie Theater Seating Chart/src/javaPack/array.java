package javaPack;

public class array 
{

	public static void main(String[] args) 
	{
		seatsetup();

	}
	
	private static void seatsetup()
	{
		String[][] seatstp = 
			{
				{"ROW A","ROW B","ROW C","ROW D","ROW E","ROW F","ROW G","ROW H","ROW I","ROW J",},
				{"1A   ","1B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"2A   ","2B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"3A   ","3B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"4A   ","4B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"5A   ","5B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"6A   ","6B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"7A   ","7B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"8A   ","8B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"9A   ","9B   ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"10A  ","10B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"11A  ","11B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"12A  ","12B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"13A  ","13B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"14A  ","14B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"15A  ","1B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"16A  ","1B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"17A  ","1B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"18A  ","1B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"19A  ","1B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				{"20A  ","1B ","1C   ","1D   ","1E   ","1F   ","1G   ","1H   ","1I   ","1J   ",},
				
		};
		for (int i=0; i<=seatstp.length-1;i++)
		{
			for(int j=0; j<=seatstp[i].length-1;j++)
			{
				System.out.print(seatstp[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}

