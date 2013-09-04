package com.zipcode_util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class ZipcodeComponent {

	private static final String ZIPCODE_FILE = "zipcode.json";
	private static JsonObject jsonObject;

	/**
	 * Json file io
	 * @return JsonObject jsonObject
	 */
	private JsonObject getJsonObject()
	{
		if (jsonObject == null) {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(ZipcodeComponent.class
							.getClassLoader().getResourceAsStream(
									ZipcodeComponent.ZIPCODE_FILE)));
			jsonObject = new Gson().fromJson(br, JsonObject.class);

			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return jsonObject;
	}

	/**
	 * Get city name
	 * @return List<String> citys
	 */
	public String[] listCities()
	{
		JsonArray jsonArray = getJsonObject().getAsJsonArray("city");

		String[] cities = new String[jsonArray.size()];
		int i;
		for (i=0; i<jsonArray.size(); i++)
		{
			cities[i] = jsonArray.get(i).getAsJsonObject().get("name").getAsString();
		}
		return cities;
	}

	public String getCityName(Integer cityCode) {
		JsonArray jsonArray = getJsonObject().getAsJsonArray("city");
		return jsonArray.get(cityCode).getAsJsonObject().get("name")
				.getAsString();
	}

}
