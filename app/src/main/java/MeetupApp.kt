import android.app.Application
import network.EventAPI
import network.EventFromJson

class MeetupApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        eventApi = EventFromJson(this)
    }

    companion object {
        private var instance: MeetupApp? = null
        private var eventApi: EventAPI? = null
        fun getEventApi(): EventAPI? {
            return eventApi
        }
    }
}