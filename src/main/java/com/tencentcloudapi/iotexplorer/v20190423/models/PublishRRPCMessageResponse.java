/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishRRPCMessageResponse extends AbstractModel{

    /**
    * RRPC消息ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageId")
    @Expose
    private Long MessageId;

    /**
    * 设备回复的消息内容，采用base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayloadBase64")
    @Expose
    private String PayloadBase64;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get RRPC消息ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageId RRPC消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMessageId() {
        return this.MessageId;
    }

    /**
     * Set RRPC消息ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageId RRPC消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageId(Long MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 设备回复的消息内容，采用base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayloadBase64 设备回复的消息内容，采用base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayloadBase64() {
        return this.PayloadBase64;
    }

    /**
     * Set 设备回复的消息内容，采用base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayloadBase64 设备回复的消息内容，采用base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayloadBase64(String PayloadBase64) {
        this.PayloadBase64 = PayloadBase64;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public PublishRRPCMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishRRPCMessageResponse(PublishRRPCMessageResponse source) {
        if (source.MessageId != null) {
            this.MessageId = new Long(source.MessageId);
        }
        if (source.PayloadBase64 != null) {
            this.PayloadBase64 = new String(source.PayloadBase64);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "PayloadBase64", this.PayloadBase64);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

