package com.teaching.masteragent.serviece;

import com.teaching.masteragent.serviece.interaction.AgentInteractionService;
import com.teaching.masteragent.serviece.interaction.AbstractInteraction;
import com.teaching.masteragent.serviece.interaction.MasterInteractionService;
import org.springframework.stereotype.Service;

@Service
public class InteractionService {
    private final AbstractInteraction interactionTypeService;

    public InteractionService(MasterInteractionService masterInteractionService, AgentInteractionService agentInteractionService) {
        if (masterInteractionService.isThisInteractionType()) {
            this.interactionTypeService = masterInteractionService;
        }
        else {
            this.interactionTypeService = agentInteractionService;
        }
    }

    public String getMasterUrl() {
        return interactionTypeService.getMasterUrl();
    }

    public String getInteractionType() {
        return  interactionTypeService.interactionType();
    }
}
