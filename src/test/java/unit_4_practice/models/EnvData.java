package unit_4_practice.models;

import lombok.Getter;

@Getter
public class EnvData {
    private String protocol;
    private String domain;
    private int wait;
    private String host;

    public String getHost() {
        return protocol + "://" + domain;
    }
}