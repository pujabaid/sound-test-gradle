package api.nasa.gov.sound.rest.client;

import api.nasa.gov.sound.config.SoundConfig;
import api.nasa.gov.sound.constant.TestConstant;
import api.nasa.gov.sound.setup.AbstractSoundBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by pbaid on 8/31/16.
 */
public class GetAllSoundsPositiveIT extends AbstractSoundBaseTest{

    @Test(groups = "positiveSoundTest")
    public void shouldGetAllSoundsWithoutQueryParamAndDefaultLimitAndSucceed()
    {
        try{
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStartTestSeparator(testName);

            queryParams.clear();
            queryParams.put(TestConstant.APIKEY_QUERY_PARAM,SoundConfig.apiKey);
            response = soundServiceClient.getAllSoundsUsingQueryParam(queryParams);
            printObject.printObject(response);
            response.then().assertThat().statusCode(200).and().
                    assertThat().body("count", equalTo(SoundConfig.defaultLimit)).and().
                    assertThat().body("results["+(SoundConfig.defaultLimit-1)+"].description", notNullValue());


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
