package com.example.quizbee;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.quizbee.Api.QuizApi;
import com.example.quizbee.Api.QuizApiService;
import com.example.quizbee.module.QuizModule;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        assertEquals(4, 2 + 2);
    }
    @Test
    public void getShop() throws IOException {
        QuizApiService quizApiService = new QuizApi().createModelApiService();
        Call<List<QuizModule>> call = quizApiService.getItems();
        List<QuizModule> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}