package api.nasa.gov.sound.rest.client;

import api.nasa.gov.sound.config.SoundConfig;
import api.nasa.gov.sound.constant.TestConstant;
import api.nasa.gov.sound.setup.AbstractSoundBaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by pbaid on 8/31/16.
 */
public class GetAllSoundsNegativeIT extends AbstractSoundBaseTest{


    @DataProvider(name = "getAllSoundsWithMissingApiKey")
    public Object[][] getAllSoundsWithMissingApiKey() {

        return new Object[][]

                {

                        {null,403},
                        {"",403},
                        {" ",403},
                };
    }

    @Test(groups = "negativeSoundTest", dataProvider = "getAllSoundsWithMissingApiKey")
    public void shouldFailToGetAllSoundsWithMissingApiKey()
    {
        try{
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStartTestSeparator(testName);

            response = soundServiceClient.getAllSounds();
            printObject.printObject(response);
            response.then().assertThat().statusCode(403).and().
                    assertThat().body("error.code", equalTo(TestConstant.API_KEY_MISSING)).and().
                    assertThat().body("error.message", equalTo(TestConstant.API_KEY_MISSING_MSG + baseURI));
        }catch (Exception e) {
            System.out.println(e);
            Assert.fail();
        } finally {
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStopTestSeparator(testName);
        }

    }

    @DataProvider(name = "getAllSoundsWithInvalidApiKey")
    public Object[][] getAllSoundsWithInvalidApiKey() {

        return new Object[][]

                {

                        {"1234",403},
                        {"abcd",403},
                        {"abc@123",403},
                        {" ",403},
                        {"&&",403},
                        {SoundConfig.apiKey+"&limit=100",403},
                        {SoundConfig.apiKey+"&q=dummy",403},
                };
    }

    @Test(groups = "negativeSoundTest", dataProvider = "getAllSoundsWithInvalidApiKey")
    public void shouldFailToGetAllSoundsBecauseOfInvalidApiKey(String apikey, Integer responsecode)
    {
        try{
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStartTestSeparator(testName);


            queryParams.clear();
            queryParams.put(TestConstant.APIKEY_QUERY_PARAM, apikey);
            response = soundServiceClient.getAllSoundsUsingQueryParam(queryParams);
            printObject.printObject(response);
            response.then().assertThat().statusCode(responsecode).and().
                    assertThat().body("error.code", equalTo(TestConstant.API_KEY_INVALID)).and().
                    assertThat().body("error.message", equalTo(TestConstant.API_KEY_INVALID_MSG + baseURI));
        }catch (Exception e) {
            System.out.println(e);
            Assert.fail();
        } finally {
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStopTestSeparator(testName);
        }

    }


    @DataProvider(name = "getAllSoundsWithInvalidLimit")
    public Object[][] getAllSoundsWithInvalidLimit() {

        return new Object[][]

                {

                        {"0",400},
                        {null,400},
                        {"-1",400},
                        {"0.0",400},
                        {"1L",400},
                        {"100000000000",500},
                        {"-100",400},
                        {"abcd",400},
                        {"&&@@",400},
                        {"a",400},
                        {"A",400},
                        {"",400},
                        {" ",400},
                };
    }

    @Test(groups = "negativeSoundTest", dataProvider = "getAllSoundsWithInvalidLimit")
    public void shouldFailToGetAllSoundsBecauseOfValidApiKeyAndInvalidLimit(String limit, Integer responsecode)
    {
        try{
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStartTestSeparator(testName);


            queryParams.clear();
            queryParams.put(TestConstant.APIKEY_QUERY_PARAM, SoundConfig.apiKey);
            queryParams.put(TestConstant.LIMIT_QUERY_PARAM, limit);
            response = soundServiceClient.getAllSoundsUsingQueryParam(queryParams);
            printObject.printObject(response);
            response.then().assertThat().statusCode(responsecode).and().
                    assertThat().body("error.code", equalTo(TestConstant.LIMIT_INVALID)).and().
                    assertThat().body("error.message", equalTo(TestConstant.LIMIT_INVALID_MSG + baseURI));
        }catch (Exception e) {
            System.out.println(e);
            Assert.fail();
        } finally {
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStopTestSeparator(testName);
        }

    }


}
