package com.ucb.ucbtest.di

import android.content.Context
import com.ucb.data.PlanRepository
import com.ucb.data.PushNotificationRepository
import com.ucb.data.plan.IPlanRemoteDataSource
import com.ucb.data.push.IPushDataSource
import com.ucb.framework.service.RetrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.ucb.framework.plan.PlanRemoteDataSource
import com.ucb.framework.push.FirebaseNotificationDataSource
import com.ucb.usecases.plan.GetPlans

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providerRetrofitBuilder(@ApplicationContext context: Context) : RetrofitBuilder {
        return RetrofitBuilder(context)
    }

    @Provides
    @Singleton
    fun providePushNotificationRepository( pushDataSource: IPushDataSource): PushNotificationRepository {
        return PushNotificationRepository(pushDataSource)
    }

    @Provides
    @Singleton
    fun provideIPushDataSource(): IPushDataSource {
        return FirebaseNotificationDataSource()
    }


    //Tercer parcial
    @Provides
    @Singleton
    fun provideGetPlans(planRepository: PlanRepository, @ApplicationContext context: Context): GetPlans {
        return GetPlans(planRepository)
    }
    @Provides
    @Singleton
    fun planRemoteDataSource(retrofiService: RetrofitBuilder): IPlanRemoteDataSource {
        return PlanRemoteDataSource(retrofiService)
    }
    @Provides
    @Singleton
    fun planRepository(remoteDataSource: IPlanRemoteDataSource): PlanRepository {
        return PlanRepository(remoteDataSource)
    }
}