package com.happned;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.Data;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String id, name, about, gender, city, birth, login;
    private int age, likes, cooldown, nophotos;
    private List<String> ids, photos;
    private User liker;
    private boolean verified;
}

// id,audios,first_name,last_name,gender,gender_alias,age,about,job,workplace,school,modification_date,is_moderator,is_admin,type,status,last_position_update,register_date,sensitive_traits_preferences,mysterious_mode_preferences,residence_city,picture.mode(1).width(1400).height(1600).fields(id,is_default,url,width,height),profiles.mode(1).width(1400).height(1600).fields(id,is_default,url,width,height),spotify_tracks,social_synchronization.fields(facebook,vk,apple_sign_in,instagram,google_sign_in),traits,verification.fields(status,reason),unread_conversations,unread_notifications,is_premium,user_balance,credits,subscription_level,matching_preferences.fields(matching_traits.fields(enabled,traits)),location_preferences,mysterious_mode_preferences,marketing_preferences,notification_settings,biometric_preferences,last_tos_version_accepted,last_sdc_version_accepted,last_cookie_v1_version_accepted,last_cookie_v2_version_accepted,last_cookie_v3_version_accepted,location_city,residence_city,pending_likers,login,device_info,first_ip,country,language
// id,first_name,last_name,gender,age,about,residence_city,profiles.mode(1).width(1400).height(1600).fields(id,is_default,url,width,height),verification.fields(status,reason),residence_city,pending_likers,login,user_balance
// type,content.fields(crossing_nb_times,position.fields(lat,lon,modification_date),user.fields(id,audios,first_name,last_name,gender,gender_alias,age,about,job,workplace,school,modification_date,is_moderator,is_admin,type,status,last_position_update,register_date,sensitive_traits_preferences,mysterious_mode_preferences,residence_city,picture.mode(1).width(1400).height(1600).fields(id,is_default,url,width,height),profiles.mode(1).width(1400).height(1600).fields(id,is_default,url,width,height),spotify_tracks,social_synchronization.fields(facebook,vk,apple_sign_in,instagram,google_sign_in),traits,verification.fields(status,reason),unread_conversations,unread_notifications,is_premium,user_balance,credits,subscription_level,matching_preferences.fields(matching_traits.fields(enabled,traits)),location_preferences,mysterious_mode_preferences,marketing_preferences,notification_settings,biometric_preferences,last_tos_version_accepted,last_sdc_version_accepted,last_cookie_v1_version_accepted,last_cookie_v2_version_accepted,last_cookie_v3_version_accepted,location_city,residence_city,pending_likers,login,device_info,first_ip,country,language))&scroll_id_from=
// content.fields(user.fields(id,first_name,last_name,gender,age,about,residence_city,profiles.mode(1).width(1400).height(1600).fields(id,is_default,url,width,height),verification.fields(status,reason),residence_city,pending_likers,login,user_balance))&scroll_id_from=
