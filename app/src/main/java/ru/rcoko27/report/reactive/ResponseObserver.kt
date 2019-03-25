package ru.rcoko27.report.reactive

import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import ru.rcoko27.report.api.responses.BaseResponse

class ResponseObserver(val next: (message: BaseResponse) -> Unit) : Observer<BaseResponse> {

    private lateinit var mDisposable: Disposable

    override fun onComplete() {
        mDisposable.dispose()
    }

    override fun onSubscribe(d: Disposable) {
        mDisposable = d
    }

    override fun onNext(message: BaseResponse) {
        next(message)
    }

    override fun onError(e: Throwable) {

    }
}