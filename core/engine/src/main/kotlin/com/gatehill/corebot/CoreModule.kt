package com.gatehill.corebot

import com.gatehill.corebot.chat.filter.RegexFilter
import com.gatehill.corebot.chat.filter.StringFilter
import com.gatehill.corebot.chat.template.TemplateService
import com.google.inject.AbstractModule

/**
 * Core bindings.
 *
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
class CoreModule : AbstractModule() {
    override fun configure() {
        bind(TemplateService::class.java).asSingleton()
        bind(StringFilter::class.java).asSingleton()
        bind(RegexFilter::class.java).asSingleton()
    }
}
