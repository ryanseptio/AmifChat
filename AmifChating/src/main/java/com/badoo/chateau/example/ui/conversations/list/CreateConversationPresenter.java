package com.badoo.chateau.example.ui.conversations.list;

import com.badoo.amif.mvp.FlowListener;
import com.badoo.amif.mvp.MvpPresenter;
import com.badoo.amif.mvp.MvpView;

/**
 * Component presenter for handling creating new conversations (this is not handled by the base ConversationListPresenter as this is often
 * application dependent).
 */
interface CreateConversationPresenter extends MvpPresenter {

    /**
     * Called when a new conversation is requested.
     */
    void onCreateNewConversationClicked();

    interface CreateConversationFlowListener extends FlowListener {

        /**
         * Called when a new conversation is required.
         */
        void requestCreateNewConversation();
    }

    interface CreateConversationView extends MvpView {
    }
}
