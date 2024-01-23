package com.happned;

import java.util.ArrayList;
import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
class Answer{
    public String type;
    public Single single;
    public FloatRange float_range;
}

class BiometricPreferences{
    public ProfileVerification profile_verification;
}

class Country{
    public String id;
    public String name;
}

class Data{
    public String role;
    public String type;
    public String birth_date;
    public String id;
    public ArrayList<Object> audios;
    public String first_name;
    public Object last_name;
    public String gender;
    public GenderAlias gender_alias;
    public int age;
    public String about;
    public Object job;
    public Object workplace;
    public String school;
    public Date modification_date;
    public boolean is_moderator;
    public boolean is_admin;
    public String status;
    public Date last_position_update;
    public Date register_date;
    public SensitiveTraitsPreferences sensitive_traits_preferences;
    public MysteriousModePreferences mysterious_mode_preferences;
    public ResidenceCity residence_city;
    public Picture picture;
    public ArrayList<Profile> profiles;
    public int nb_photos;
    public Object spotify_tracks;
    public SocialSynchronization social_synchronization;
    public ArrayList<Trait> traits;
    public Verification verification;
    public int unread_conversations;
    public int unread_notifications;
    public boolean is_premium;
    public ArrayList<UserBalance> user_balance;
    public Object subscription;
    public int renewable_credits_per_period;
    public Object cooldown_credits_period;
    public int credits;
    public int permanent_credits;
    public int renewable_credits;
    public Object cooldown_credits_time_left;
    public String subscription_level;
    public MatchingPreferences matching_preferences;
    public LocationPreferences location_preferences;
    public MarketingPreferences marketing_preferences;
    public NotificationSettings notification_settings;
    public BiometricPreferences biometric_preferences;
    public String last_tos_version_accepted;
    public String last_sdc_version_accepted;
    public String last_cookie_v1_version_accepted;
    public Object last_cookie_v2_version_accepted;
    public Object last_cookie_v3_version_accepted;
    public Object location_city;
    public PendingLikers pending_likers;
    public String login;
    public int device_info;
    public Country country;
    public Language language;
}

class EmojiLocalized{
    public String value;
    public ArrayList<String> tags;
}

class FloatRange{
    public double value;
    public String metric;
    public double min_value;
    public double max_value;
    public double default_value;
    public double step;
}

class GenderAlias{
    public Object id;
    public Object default_label;
    public Object gender;
    public Object label_localized;
}

class GoogleSignIn{
    public String id;
    public String email;
}

class Icon{
    public String url;
    public boolean is_rendered;
}

class LabelLocalized{
    public String value;
    public ArrayList<String> tags;
}

class Language{
    public String id;
    public String name;
}

class LocationPreferences{
    public boolean hide_location;
}

class MarketingPreferences{
    public boolean audience_measurement;
    public boolean targeted_ads;
    public boolean marketing_operations;
    public boolean recommended_in_emails;
}

class MatchingPreferences{
    public int female;
    public int male;
    public int non_binary;
    public int distance;
    public int age_min;
    public int age_max;
    public MatchingTraits matching_traits;
}

class MatchingTraits{
    public boolean enabled;
    public ArrayList<Trait> traits;
}

class MysteriousModePreferences{
    public boolean hide_age;
    public boolean hide_distance;
    public boolean hide_last_activity_date;
    public boolean hide_gender_alias;
}

class NotificationSettings{
    public int charms;
    public int messages;
    public int reminders;
    public int dates;
    public int near;
    public int visit;
    public int match;
    public int likes;
    public int daily_recap;
    public int weekly_recap;
    public int news;
    public int shortlist;
    public int crush_time;
    public int others;
}

class Option{
    public String type;
    public Single single;
    public FloatRange float_range;
}

class PendingLikers{
    public String counter_label;
    public Icon icon;
}

class Picture{
    public String id;
    public boolean is_default;
    public String url;
    public int width;
    public int height;
}

class Position{
    public double latitude;
    public double longitude;
}

class Profile{
    public String id;
    public boolean is_default;
    public String url;
    public int width;
    public int height;
}

class ProfileVerification{
    public boolean accepted;
}

class ResidenceCity{
    public String id;
    public String city;
    public String county;
    public String country;
    public Position position;
    public Date modification_date;
}

public class Personal{
    public boolean success;
    public int status;
    public Object error;
    public Data data;
    public int error_code;
}

class SensitiveTraitsPreferences{
    public boolean sensitive_traits_accepted;
}

class ShortLabelLocalized{
    public String value;
    public ArrayList<Object> tags;
}

class Single{
    public String id;
    public String default_label;
    public ArrayList<LabelLocalized> label_localized;
    public ArrayList<Value> values;
}

class SocialSynchronization{
    public GoogleSignIn google_sign_in;
}

class Trait{
    public String id;
    public String default_emoji;
    public String default_label;
    public String default_short_label;
    public ArrayList<ShortLabelLocalized> short_label_localized;
    public ArrayList<EmojiLocalized> emoji_localized;
    public ArrayList<LabelLocalized> label_localized;
    public boolean sensitive_trait;
    public Answer answer;
    public Option option;
}

class UserBalance{
    public String type;
    public int total;
    public int permanent;
    public int renewable;
    public int renewable_per_period;
    public int cooldown_period;
    public int cooldown_time_left;
}

class Value{
    public String id;
    public String single_value_type;
    public String default_label;
    public ArrayList<LabelLocalized> label_localized;
}

class Verification{
    public String status;
    public String reason;
}

