/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallDeviceRRPCSyncResponse extends AbstractModel {

    /**
    * <p>平台为本次调用分配的关联 token（v2{instanceId}::{reqId} 形式）</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>调用状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>平台分配的 messageID</p>
    */
    @SerializedName("MessageId")
    @Expose
    private Long MessageId;

    /**
    * <p>设备回包原始字节的 base64 编码（仅 Status=Replied 有值）</p>
    */
    @SerializedName("PayloadBase64")
    @Expose
    private String PayloadBase64;

    /**
    * <p>实际生效的 reply topic 模板（默认模式由平台生成，自定义模式为入参原值）</p>
    */
    @SerializedName("ReplyTopic")
    @Expose
    private String ReplyTopic;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>平台为本次调用分配的关联 token（v2{instanceId}::{reqId} 形式）</p> 
     * @return ClientToken <p>平台为本次调用分配的关联 token（v2{instanceId}::{reqId} 形式）</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>平台为本次调用分配的关联 token（v2{instanceId}::{reqId} 形式）</p>
     * @param ClientToken <p>平台为本次调用分配的关联 token（v2{instanceId}::{reqId} 形式）</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>调用状态</p> 
     * @return Status <p>调用状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>调用状态</p>
     * @param Status <p>调用状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>平台分配的 messageID</p> 
     * @return MessageId <p>平台分配的 messageID</p>
     */
    public Long getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>平台分配的 messageID</p>
     * @param MessageId <p>平台分配的 messageID</p>
     */
    public void setMessageId(Long MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>设备回包原始字节的 base64 编码（仅 Status=Replied 有值）</p> 
     * @return PayloadBase64 <p>设备回包原始字节的 base64 编码（仅 Status=Replied 有值）</p>
     */
    public String getPayloadBase64() {
        return this.PayloadBase64;
    }

    /**
     * Set <p>设备回包原始字节的 base64 编码（仅 Status=Replied 有值）</p>
     * @param PayloadBase64 <p>设备回包原始字节的 base64 编码（仅 Status=Replied 有值）</p>
     */
    public void setPayloadBase64(String PayloadBase64) {
        this.PayloadBase64 = PayloadBase64;
    }

    /**
     * Get <p>实际生效的 reply topic 模板（默认模式由平台生成，自定义模式为入参原值）</p> 
     * @return ReplyTopic <p>实际生效的 reply topic 模板（默认模式由平台生成，自定义模式为入参原值）</p>
     */
    public String getReplyTopic() {
        return this.ReplyTopic;
    }

    /**
     * Set <p>实际生效的 reply topic 模板（默认模式由平台生成，自定义模式为入参原值）</p>
     * @param ReplyTopic <p>实际生效的 reply topic 模板（默认模式由平台生成，自定义模式为入参原值）</p>
     */
    public void setReplyTopic(String ReplyTopic) {
        this.ReplyTopic = ReplyTopic;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CallDeviceRRPCSyncResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallDeviceRRPCSyncResponse(CallDeviceRRPCSyncResponse source) {
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MessageId != null) {
            this.MessageId = new Long(source.MessageId);
        }
        if (source.PayloadBase64 != null) {
            this.PayloadBase64 = new String(source.PayloadBase64);
        }
        if (source.ReplyTopic != null) {
            this.ReplyTopic = new String(source.ReplyTopic);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "PayloadBase64", this.PayloadBase64);
        this.setParamSimple(map, prefix + "ReplyTopic", this.ReplyTopic);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

