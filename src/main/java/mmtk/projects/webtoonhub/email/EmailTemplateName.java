package mmtk.projects.webtoonhub.email;

import lombok.Getter;

/**
 * Author : Name
 * Created At : 05/11/2024, Nov ,08, 38
 * Project Name : WebtoonHub
 **/
@Getter
public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activate_account");

    private final String name;

    EmailTemplateName(final String name) {
        this.name = name;
    }
}
