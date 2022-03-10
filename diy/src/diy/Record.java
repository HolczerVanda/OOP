package diy;

public class Record {

	String singer;
	String title;
	int playTime;
	
	Record(String singer, String title, int playTime)
	{
		this.singer=singer;
		this.title=title;
		this.playTime=playTime;
	}
	
	@Override
	public String toString()
	{
		return singer+": "+ title+", "+playTime+" min";
	}
	
	public int isLonger(int givenTime)
	{
		if(playTime>givenTime)
		{
			return 1;
		}
		else if(playTime<givenTime)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public boolean sameSinger(String givenSinger)
	{
		if(singer.equals(givenSinger))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String getSinger()
	{
		return singer;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getPlayTime()
	{
		return playTime;
	}
	
}
