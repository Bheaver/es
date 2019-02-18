package com.bheaver.es.conf

import com.bheaver.ngl4.util.mongoUtils.{DBConnection, DBConnectionImpl}
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.{Bean, Scope}

object UtilBeanFactory {

  @Bean(Array("MongoClient"))
  @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
  def mongoConnection: DBConnection = {
    new DBConnectionImpl
  }

}
