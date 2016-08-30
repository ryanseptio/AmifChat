package com.badoo.chateau.example.usecases.session;

import android.support.annotation.NonNull;

import com.badoo.amif.data.repo.Repository;
import com.badoo.amif.usecase.UseCase;
import com.badoo.chateau.core.model.User;
import com.badoo.chateau.example.data.repos.session.SessionQuery;

import rx.Observable;

@UseCase
public class SignIn<U extends User> {

    private final Repository<U> mRepository;

    public SignIn(@NonNull Repository<U> repository) {
        mRepository = repository;
    }

    public Observable<U> execute(@NonNull String userName, @NonNull String password) {
        return mRepository.query(new SessionQuery.SignIn<>(userName, password));
    }
}
