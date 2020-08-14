package k.andorid.retrofit.apiinterface;



import k.andorid.retrofit.pojo.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Apis {
    String base_url = "http://komal89.epizy.com/new/";

    /*  $name = $_GET['name'];
      $email = $_GET['email'];
      $password = $_GET['password'];
      $phone = $_GET['phone'];*/
    @FormUrlEncoded
    @POST("insert.php")
    Call<User> registerUser(@Field("name") String name,
                            @Field("email") String email,
                            @Field("password") String password,
                            @Field("phone") String phone);
}
