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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiveMessageResponse extends AbstractModel{

    /**
    * 用作标识消息的唯一主键
    */
    @SerializedName("MessageID")
    @Expose
    private String MessageID;

    /**
    * 接收消息的内容
    */
    @SerializedName("MessagePayload")
    @Expose
    private String MessagePayload;

    /**
    * 提供给 Ack 接口，用来Ack哪一个topic中的消息
    */
    @SerializedName("AckTopic")
    @Expose
    private String AckTopic;

    /**
    * 返回的错误信息，如果为空，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 返回订阅者的名字，用来创建 ack consumer时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubName")
    @Expose
    private String SubName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用作标识消息的唯一主键 
     * @return MessageID 用作标识消息的唯一主键
     */
    public String getMessageID() {
        return this.MessageID;
    }

    /**
     * Set 用作标识消息的唯一主键
     * @param MessageID 用作标识消息的唯一主键
     */
    public void setMessageID(String MessageID) {
        this.MessageID = MessageID;
    }

    /**
     * Get 接收消息的内容 
     * @return MessagePayload 接收消息的内容
     */
    public String getMessagePayload() {
        return this.MessagePayload;
    }

    /**
     * Set 接收消息的内容
     * @param MessagePayload 接收消息的内容
     */
    public void setMessagePayload(String MessagePayload) {
        this.MessagePayload = MessagePayload;
    }

    /**
     * Get 提供给 Ack 接口，用来Ack哪一个topic中的消息 
     * @return AckTopic 提供给 Ack 接口，用来Ack哪一个topic中的消息
     */
    public String getAckTopic() {
        return this.AckTopic;
    }

    /**
     * Set 提供给 Ack 接口，用来Ack哪一个topic中的消息
     * @param AckTopic 提供给 Ack 接口，用来Ack哪一个topic中的消息
     */
    public void setAckTopic(String AckTopic) {
        this.AckTopic = AckTopic;
    }

    /**
     * Get 返回的错误信息，如果为空，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 返回的错误信息，如果为空，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 返回的错误信息，如果为空，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 返回的错误信息，如果为空，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 返回订阅者的名字，用来创建 ack consumer时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubName 返回订阅者的名字，用来创建 ack consumer时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubName() {
        return this.SubName;
    }

    /**
     * Set 返回订阅者的名字，用来创建 ack consumer时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubName 返回订阅者的名字，用来创建 ack consumer时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubName(String SubName) {
        this.SubName = SubName;
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

    public ReceiveMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiveMessageResponse(ReceiveMessageResponse source) {
        if (source.MessageID != null) {
            this.MessageID = new String(source.MessageID);
        }
        if (source.MessagePayload != null) {
            this.MessagePayload = new String(source.MessagePayload);
        }
        if (source.AckTopic != null) {
            this.AckTopic = new String(source.AckTopic);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.SubName != null) {
            this.SubName = new String(source.SubName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageID", this.MessageID);
        this.setParamSimple(map, prefix + "MessagePayload", this.MessagePayload);
        this.setParamSimple(map, prefix + "AckTopic", this.AckTopic);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "SubName", this.SubName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

