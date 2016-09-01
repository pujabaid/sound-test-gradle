package api.nasa.gov.sound.rest.client;

import api.nasa.gov.sound.config.SoundConfig;
import api.nasa.gov.sound.constant.TestConstant;
import api.nasa.gov.sound.setup.AbstractSoundBaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

/**
 * Created by pbaid on 8/31/16.
 */
public class GetAllSoundsPositiveIT extends AbstractSoundBaseTest{

    // test plan (for a positive test plan)
    // possible query param & combinations
    // limit : depending
//    q
//    apikey

    @DataProvider(name = "getAllSoundsWithValidLimit")
    public Object[][] getAllSoundsWithValidLimit() {

        return new Object[][]

                {

                        {"", SoundConfig.defaultLimit, 200},
                        {"0", 0, 200},
//                        {"-1", SoundConfig.defaultLimit, 200},
                        {"44",44,200},
                        {"100000000",64,200},
//                        {"-100",64,200},
//                        {"-100",64,200},
                        {"a",64,200},
                };
    } 
    
    @Test(groups = "positiveSoundTest", dataProvider = "getAllSoundsWithValidLimit")
    public void shouldGetAllSoundsWithValidApiKeyAndValidLimit(String limit, Integer returnedRecordCount, Integer responsecode)
    {
        try{
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStartTestSeparator(testName);

            queryParams.clear();
            queryParams.put(TestConstant.APIKEY_QUERY_PARAM,SoundConfig.apiKey);
            queryParams.put(TestConstant.LIMIT_QUERY_PARAM,limit);
            response = soundServiceClient.getAllSoundsUsingQueryParam(queryParams);
            printObject.printObject(response);
            response.then().assertThat().statusCode(responsecode).and().
                    assertThat().body("count", equalTo(returnedRecordCount));


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

//TODO getSoundWithInvalidApiKey (integer,special characters, javascript, null)
//https://api.nasa.gov/planetary/sounds?q=Voyager&api_key=DEMO_KEY
