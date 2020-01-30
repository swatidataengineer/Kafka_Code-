package com.kafka;
//import org.omg.CORBA.PUBLIC_MEMBER;
import java.util.Date;

public class JSONData {
	private int deviceId;
	private int temperature;
	private int latitude;
	private int longitude;
	private String time;
	public JSONData(int deviceId,int temperature,int latitude,int longitude,Date time)
	{
		this.deviceId =deviceId;
		this.temperature=temperature;
		this.latitude =latitude;
		this.longitude=longitude;
		this.time =time.toString();	
	}
	public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("************************************");
        sb.append("\n deviceId: ").append(deviceId);
        sb.append("\n temperature: ").append(temperature);
        sb.append("\n latitude: ").append(latitude);
        sb.append("\n longitude: ").append(longitude);
        sb.append("\n time: ").append(time);
        sb.append("\n************************************");
        return sb.toString();
	}
	public int getdeviceId()
	{
		return deviceId;
	}
	public int getTemperature()
	{
		return temperature;
	}
	public int getId()
	{
		return latitude;
	}
	public int getLongitude()
	{
		return longitude;
	}
	public String getTime()
	{
		return time.toString();
	}


}
