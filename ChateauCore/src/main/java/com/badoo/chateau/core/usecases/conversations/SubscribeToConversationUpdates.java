package com.badoo.chateau.core.usecases.conversations;

import com.badoo.amif.data.repo.Repository;
import com.badoo.amif.usecase.UseCase;
import com.badoo.chateau.core.model.Conversation;
import com.badoo.chateau.core.repos.conversations.ConversationQueries;

import rx.Observable;

/**
 * Use case for subscribing to conversation updates
 */
@UseCase
public class SubscribeToConversationUpdates {

    private Repository<?> mConversationRepository;

    public SubscribeToConversationUpdates(Repository<? extends Conversation> conversationRepository) {
        mConversationRepository = conversationRepository;
    }

    public Observable<Boolean> execute() {
        return mConversationRepository.query(new ConversationQueries.SubscribeToUpdatesQuery());
    }
}
