package api.nasa.gov.sound.rest.client;

import api.nasa.gov.sound.setup.AbstractSoundBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;

/**
 * Created by pbaid on 8/31/16.
 */
public class GetAllSoundsNegativeIT extends AbstractSoundBaseTest{

    @Test(groups = "negativeSoundTest")
    public void shouldGetAllSoundsWithoutQueryParamAndDefaultLimit()
    {
        try{
            String testName = new Object() {
            }.getClass().getEnclosingMethod().getName();
            printObject.printStartTestSeparator(testName);

            response = soundServiceClient.getAllSounds();
            printObject.printObject(response);
            response.then().assertThat().statusCode(403).and().
                    assertThat().body("error.code", equalTo("API_KEY_MISSING")).and().
                    assertThat().body("error.message", equalTo("No api_key was supplied. Get one at " + baseURI));
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
