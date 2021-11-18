package com.github.tt4g.lean.cucumber;

import edu.umd.cs.findbugs.annotations.NonNull;

public class IsItFriday {

    @NonNull
    static String isItFriday(@NonNull String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

}
