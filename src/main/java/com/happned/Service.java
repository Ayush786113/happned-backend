package com.happned;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

@Component
public class Service {
//    public static void main(String[] args) throws Exception {
//        Service service = new Service();
//        String token = "OAuth=\"eyJhbGciOiJIUzI1NiJ9.eyJzY29wZSI6WyJ1c2VyX2RlbGV0ZSIsInVzZXJfcmVwb3J0X3JlYWQiLCJ1c2VyX3RyYWl0X2Fuc3dlcl93cml0ZSIsInVzZXJfdXBkYXRlIiwiYm9vc3RfY3JlYXRlIiwiYm9vc3RfcmVhZCIsInVzZXJfc29jaWFsX2RlbGV0ZSIsInVzZXJfY29udmVyc2F0aW9uX3JlYWQiLCJ1c2VyX2FjY2VwdGVkX3JlYWQiLCJ1c2VyX2NvbnZlcnNhdGlvbl9jcmVhdGUiLCJhbGxfdXNlcl90cmFpdF9hbnN3ZXJfcmVhZCIsInVzZXJfcmVqZWN0ZWRfY3JlYXRlIiwidXNlcl9ibG9ja2VkX3JlYWQiLCJzaG9ydGxpc3RfcmVhZCIsInVzZXJfcmVwb3J0X3VwZGF0ZSIsInVzZXJfYWNoaWV2ZW1lbnRfcmVhZCIsInJld2FyZGVkX2Fkc191cGRhdGUiLCJ1c2VyX2FjaGlldmVtZW50X2RlbGV0ZSIsInVzZXJfcmVwb3J0X2RlbGV0ZSIsInVzZXJfYXVkaW9jYWxsX2NyZWF0ZSIsInVzZXJfYWNoaWV2ZW1lbnRfdXBkYXRlIiwidXNlcl92aWRlb2NhbGxfdXBkYXRlIiwidXNlcl9hcHBsaWNhdGlvbnNfcmVhZCIsInVzZXJfYmxvY2tlZF9kZWxldGUiLCJ1c2VyX3N1YnNjcmlwdGlvbl9jcmVhdGUiLCJwYWNrX3JlYWQiLCJ1c2VyX29yZGVyX3VwZGF0ZSIsInVzZXJfcmVhZCIsIm5vdGlmaWNhdGlvbl90eXBlX3JlYWQiLCJ1c2VyX2FjaGlldmVtZW50X2NyZWF0ZSIsInVzZXJfbWVzc2FnZV9yZWFkIiwidXNlcl9pbWFnZV9jcmVhdGUiLCJ1c2VyX2NvbnZlcnNhdGlvbl9kZWxldGUiLCJ1c2VyX3NvY2lhbF91cGRhdGUiLCJ1c2VyX2RldmljZV9kZWxldGUiLCJ1c2VyX2FjY2VwdGVkX2NyZWF0ZSIsInN1YnNjcmlwdGlvbl90eXBlX3JlYWQiLCJ1c2VyX3Bva2VfY3JlYXRlIiwidHJhaXRfcmVhZCIsInVzZXJfYXBwbGljYXRpb25zX3VwZGF0ZSIsInVzZXJfcmVwb3J0X2NyZWF0ZSIsInVzZXJfb3JkZXJfY3JlYXRlIiwidXNlcl9kZXZpY2VfdXBkYXRlIiwidXNlcl9zaG9wX3JlYWQiLCJhcmNoaXZlX2NyZWF0ZSIsInVzZXJfcmVqZWN0ZWRfcmVhZCIsInVzZXJfYXBwbGljYXRpb25zX2RlbGV0ZSIsInVzZXJfc3Vic2NyaXB0aW9uX2RlbGV0ZSIsInVzZXJfYXVkaW9jYWxsX3JlYWQiLCJ1c2VyX3N1YnNjcmlwdGlvbl9yZWFkIiwidXNlcl92aWRlb2NhbGxfcmVhZCIsInVzZXJfYmxvY2tlZF9jcmVhdGUiLCJ1c2VyX3N1YnNjcmlwdGlvbl91cGRhdGUiLCJ1c2VyX21lc3NhZ2VfY3JlYXRlIiwidXNlcl9tZXNzYWdlX2RlbGV0ZSIsInVzZXJfbW9kZV9yZWFkIiwidXNlcl9zb2NpYWxfY3JlYXRlIiwidXNlcl9pbWFnZV91cGRhdGUiLCJsb2NhbGVfcmVhZCIsInVzZXJfbm90aWZpY2F0aW9uc19yZWFkIiwiYWNoaWV2ZW1lbnRfdHlwZV9yZWFkIiwic2VhcmNoX3VzZXIiLCJ1c2VyX2ltYWdlX2RlbGV0ZSIsInVzZXJfZGV2aWNlX3JlYWQiLCJhbGxfdXNlcl9yZWFkIiwicmV3YXJkZWRfYWRzX3JlYWQiLCJ1c2VyX3NvY2lhbF9yZWFkIiwiYXJjaGl2ZV9yZWFkIiwidXNlcl9kZXZpY2VfY3JlYXRlIiwidXNlcl9wb3NpdGlvbl9yZWFkIiwicGF5bWVudF9wb3J0YWxfcmVhZCIsInVzZXJfYWNjZXB0ZWRfZGVsZXRlIiwidXNlcl9tZXNzYWdlX3VwZGF0ZSIsInVzZXJfYXVkaW9jYWxsX3VwZGF0ZSIsInVzZXJfb3JkZXJfcmVhZCIsInVzZXJfdmlkZW9jYWxsX2NyZWF0ZSIsImxhbmd1YWdlX3JlYWQiLCJhbGxfaW1hZ2VfcmVhZCIsInVzZXJfY29udmVyc2F0aW9uX3VwZGF0ZSIsInVzZXJfaW1hZ2VfcmVhZCIsImNoZWNrb3V0X2NyZWF0ZSIsInVzZXJfcmVqZWN0ZWRfZGVsZXRlIiwicmVwb3J0X3R5cGVfcmVhZCIsInVzZXJfcG9zaXRpb25fdXBkYXRlIl0sImp0aSI6ImIwY2I2YjkyLWVhZGMtNGRiNC05NTU3LTVjYmU3YTY4OGNjMSIsInN1YiI6IjJkYjZiMWU2LTczZmItNGExMC04M2UzLTZiNWY5ZmExM2RjZSIsImF1ZCI6IlNxSFNQcW02anlvRlhTMnNBaEU2TmNjNUR2azlYUWp4MG1Ud2x3Q0tMdCIsImV4cCI6MTcwNjAxOTE4MywiaWF0IjoxNzA1OTMyNzgzfQ.sMsDvmCQF_SRN5wJVYytAbjzLHbpE3lwiqnuZKqnNoQ\"";
//        String id = service.decodeJWT(token);
//        System.out.println(service.getRecommendations(token));
//    }
    private String decodeJWT(String token){
        String [] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String payload = new String(decoder.decode(chunks[1]));
        return getIDFromJWT(payload);
    }
    private String getIDFromJWT(String data) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = null;
        try{
            map = objectMapper.readValue(data, new TypeReference<Map<String, Object>>() {});
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return String.valueOf(map.get("sub"));
    }
    private String getIDFromURL(String url){
        return url.split("/")[4].trim();
    }
    public Object getProfile(String token) throws Exception{
        String id = decodeJWT(token);
        return getProfile(token, id);
    }
    public Object getProfile(String token, String id) throws Exception{
        Personal personal = null;
        User user = new User();
        HttpResponse<String> response = null;
        List<String> ids = new ArrayList<>();
        List<String> photos = new ArrayList<>();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.happn.fr/api/users/"+id+"?fields=id%2Cfirst_name%2Clast_name%2Cgender%2Cage%2Cabout%2Cresidence_city%2Cprofiles.mode(1).width(1400).height(1600).fields(id%2Cis_default%2Curl%2Cwidth%2Cheight)%2Cverification.fields(status%2Creason)%2Cresidence_city%2Cpending_likers%2Cuser_balance"))
                .header("Authorization", token)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        if(response.statusCode() == 200)
            personal = objectMapper.readValue(response.body(), Personal.class);
        else {
            Error error = objectMapper.readValue(response.body(), Error.class);
            throw new Exception(error.data.message);
        }
        user.setId(personal.data.id);
        user.setName(((personal.data.first_name == null ? "" : personal.data.first_name)+" "+(personal.data.last_name == null ? "" : personal.data.last_name)).trim());
        user.setAbout(personal.data.about.trim());
        user.setAge(personal.data.age);
        user.setCity(personal.data.residence_city != null ? personal.data.residence_city.city : null);
        user.setBirth(personal.data.birth_date);
        user.setGender(personal.data.gender);
        user.setLikes(personal.data.user_balance.get(2).renewable);
        user.setCooldown(personal.data.user_balance.get(2).cooldown_time_left);
        user.setVerified(personal.data.verification.status.equals("verified"));
        user.setLogin(personal.data.login);
        user.setNophotos(personal.data.nb_photos);
        for(Profile profile: personal.data.profiles){
            ids.add(profile.id);
            photos.add(profile.url);
        }
        user.setIds(ids);
        user.setPhotos(photos);
        if(personal.data.pending_likers == null)
            return user;
        if(personal.data.pending_likers.counter_label != null)
            user.setLiker((User) getProfile(token, getIDFromURL(personal.data.pending_likers.icon.url)));
        return user;
    }
    public Object likeProfile(String token, String id) throws Exception{
        HttpResponse<String> response = null;
        ObjectMapper objectMapper = new ObjectMapper();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.happn.fr/api/users/me/accepted/"+id))
                .header("Authorization", token)
                .method("POST", HttpRequest.BodyPublishers.ofString("{\"reaction\":{\"id\":\"heart\"},\"container\":{\"type\":\"PHOTO\",\"content\":{\"id\":\"ae285170-83f8-11ee-ab54-db2f1607ee50\"}},\"tracking_custom_data\":{\"reaction_index\":0,\"container_index\":0,\"content_index\":0}}"))
                .build();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        Error error = objectMapper.readValue(response.body(), Error.class);
        return error.status;
    }
    public Object getRecommendations(String token) throws Exception{
        List<User> users = new ArrayList<>();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.happn.fr/api/v1/users/me/recommendations?fields=content.fields(user.fields(id%2Cfirst_name%2Clast_name%2Cgender%2Cage%2Cabout%2Cresidence_city%2Cprofiles.mode(1).width(1400).height(1600).fields(id%2Cis_default%2Curl%2Cwidth%2Cheight)%2Cverification.fields(status%2Creason)%2Cresidence_city%2Cpending_likers%2Clogin%2Cuser_balance))&scroll_id_from="))
                .header("Authorization", token)
                .header("x-happn-did", "")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();
        Recommendations recommendations = objectMapper.readValue(response.body(), Recommendations.class);
        for(Datum datum: recommendations.data){
            users.add((User) getProfile(token, datum.content.user.id));
        }
        return users;
    }
}
