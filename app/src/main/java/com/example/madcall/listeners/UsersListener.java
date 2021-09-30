package com.example.madcall.listeners;

import com.example.madcall.models.User;

public interface UsersListener {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);
}
