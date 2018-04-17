package at.refugeescode.mp13_the_magic_8_ball.logic;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class Magic8Ball {

    private List<String> createMessages () {
        return Stream.of("NEVER TRY TO GO BACK AND REPAIR THE PAST…",
                "BE PREPARED TO CONSTRUCT THE FUTURE WHICH IS PREDICTABLE...",
                "LIFE ENDS WHEN YOU STOP DREAMING...",
                "HOPE ENDS WHEN YOU STOP BELIEVING...",
                "LOVE ENDS WHEN YOU STOP CARING...")
                .collect(Collectors.toList());
    }

    public String getMessageRandomly() {
        List<String> message = createMessages();
        Collections.shuffle(message);
        String randomMessage = message.get(0);
        return randomMessage;
    }
}


