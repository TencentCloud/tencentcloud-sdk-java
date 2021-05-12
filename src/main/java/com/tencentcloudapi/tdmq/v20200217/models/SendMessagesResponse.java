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

public class SendMessagesResponse extends AbstractModel{

    /**
    * 消息的messageID, 是全局唯一的，用来标识消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 返回的错误消息，如果返回为 “”，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 消息的messageID, 是全局唯一的，用来标识消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageId 消息的messageID, 是全局唯一的，用来标识消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set 消息的messageID, 是全局唯一的，用来标识消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageId 消息的messageID, 是全局唯一的，用来标识消息的元数据信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 返回的错误消息，如果返回为 “”，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 返回的错误消息，如果返回为 “”，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 返回的错误消息，如果返回为 “”，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 返回的错误消息，如果返回为 “”，说明没有错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
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

    public SendMessagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMessagesResponse(SendMessagesResponse source) {
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
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
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

