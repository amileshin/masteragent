package com.teaching.masteragent.serviece;

import com.teaching.masteragent.serviece.interaction.AgentInteractionService;
import com.teaching.masteragent.serviece.interaction.InteractionService;
import com.teaching.masteragent.serviece.interaction.MasterInteractionService;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    private final InteractionService interactionService;

    public BaseService(MasterInteractionService masterInteractionService, AgentInteractionService agentInteractionService) {
        if (masterInteractionService.isThisInteractionType()) {
            this.interactionService = masterInteractionService;
        }
        else {
            this.interactionService = agentInteractionService;
        }
    }

    public String getMasterUrl() {
        return interactionService.getMasterUrl();
    }

    public String getInteractionType() {
        return  interactionService.interactionType();
    }
}
