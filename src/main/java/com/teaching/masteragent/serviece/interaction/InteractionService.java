package com.teaching.masteragent.serviece.interaction;

public abstract class InteractionService {
    public abstract boolean isThisInteractionType();
    public abstract String interactionType();
    public abstract String getMasterUrl();
}
