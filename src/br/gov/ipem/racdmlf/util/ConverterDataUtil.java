package br.gov.ipem.racdmlf.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ConverterDataUtil {

	public static Date parseData(String dataEntrada) {

		try {
		
			SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
			return formatoEntrada.parse(dataEntrada);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String parseData(Date date) {

		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String parseData(LocalDate date) {

		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static LocalDate parseLocalDate(Date date) {

		try {
			ZoneId defaultZoneId = ZoneId.systemDefault();
			return date.toInstant().atZone(defaultZoneId).toLocalDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static LocalDate parseLocalDate(Long date) {

		try {
			ZoneId defaultZoneId = ZoneId.systemDefault();
			return Instant.ofEpochMilli(date).atZone(defaultZoneId).toLocalDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
