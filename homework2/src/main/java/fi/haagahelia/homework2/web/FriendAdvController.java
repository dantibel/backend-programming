package fi.haagahelia.homework2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fi.haagahelia.homework2.domain.Friend;

@Controller
public class FriendAdvController {

    private List<Friend> friends = new ArrayList<>();

    @GetMapping(value = "/friends-adv")
	public String getFriends(Model model) {
        model.addAttribute("friend", new Friend());
		return "friend-adv";
	}

    @PostMapping(value = "/add-adv")
    public String addFriend(@ModelAttribute Friend friend, Model model) {
        friends.add(friend);
        model.addAttribute("friends", friends);
        return "friend-adv";
    }

}