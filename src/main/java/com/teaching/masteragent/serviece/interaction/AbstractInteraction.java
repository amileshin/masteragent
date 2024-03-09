package com.teaching.masteragent.serviece.interaction;

public abstract class AbstractInteraction {
    public abstract boolean isThisInteractionType();
    public abstract String interactionType();
    public abstract String getMasterUrl();
}
