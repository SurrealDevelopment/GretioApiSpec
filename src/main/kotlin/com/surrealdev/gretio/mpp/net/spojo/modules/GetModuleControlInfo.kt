package com.surrealdev.gretio.mpp.net.spojo.modules

import com.surrealdev.gretio.mpp.net.spojo.GeneralRequest
import com.surrealdev.gretio.mpp.net.spojo.MESSAGE_ID_GET_MODULE_CONTROLS_INFO
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
class GetModuleControlInfo(
    override val cseq: Int? = null,
    var moduleName: String = "",
    var groupId: Int = -1,
    var controlName: String = ""
) : GeneralRequest() {
    @Required
    override val id: Int = MESSAGE_ID_GET_MODULE_CONTROLS_INFO
}
