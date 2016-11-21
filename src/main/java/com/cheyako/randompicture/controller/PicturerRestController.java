package com.cheyako.randompicture.controller;

import com.cheyako.randompicture.dto.Image;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

@Controller
public class PicturerRestController {
    public static final String FULL_SCREEN_PICTURE_PAGE = "picture_page";
    public static final String URL_PARAM = "URL";
    public static final String PUG_URL = "/api/pug";
    public static final String MEOW_URL = "/api/meow";
    private static final String RANDOM_PUG_SERVICE_URL = "http://pugme.herokuapp.com/random";
    private static final String RANDOM_CAT_SERVICE_URL = "http://meowme.herokuapp.com/random";

    @RequestMapping({"/api/pug"})
    @ResponseBody
    public Object getPugImage()
    {
        JSONObject json = getJsonFromUrl(RANDOM_PUG_SERVICE_URL);
        String imageUrl = json.getString("pug");
        return new Image("random PUG", imageUrl);
    }

    @RequestMapping({"/api/meow"})
    @ResponseBody
    public Object getMeowImage()
    {
        JSONObject json = getJsonFromUrl(RANDOM_CAT_SERVICE_URL);
        String imageUrl = json.getString("cat");
        return new Image("random PUG", imageUrl);
    }

    @RequestMapping({"/api/gify"})
    @ResponseBody
    public Object getGifyImage(@RequestParam(name="search") String search)
    {
        JSONObject json = getJsonFromUrl("http://api.giphy.com/v1/gifs/random?api_key=dc6zaTOxFJmzC&rating=G&tag="+search);
        String imageUrl = json.getJSONObject("data").getString("image_url");
        return new Image("random PUG", imageUrl);
    }

    private JSONObject getJsonFromUrl(String urlString)
    {
        StringBuilder sb = new StringBuilder();
        try
        {
            URL url = new URL(urlString);
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            is.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return new JSONObject(sb.toString());
    }

    private String getPropertyStringValueFromJson(JSONObject json, String propertyName)
    {
        return json.getString(propertyName);
    }
}
