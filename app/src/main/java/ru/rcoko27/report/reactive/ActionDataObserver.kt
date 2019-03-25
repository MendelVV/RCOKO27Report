package ru.rcoko27.report.reactive

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import ru.rcoko27.report.data.ActionData


open class ActionDataObserver(val next: (message: ActionData) -> Unit) : Observer<ActionData> {

    private lateinit var mDisposable: Disposable

    override fun onComplete() {
        mDisposable.dispose()
    }

    override fun onSubscribe(d: Disposable) {
        mDisposable = d
    }

    override fun onNext(message: ActionData) {
        next(message)
    }

    override fun onError(e: Throwable) {

    }
}