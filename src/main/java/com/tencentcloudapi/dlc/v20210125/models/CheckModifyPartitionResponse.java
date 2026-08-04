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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckModifyPartitionResponse extends AbstractModel {

    /**
    * <p>是否允许变配：true-允许，false-不允许</p>
    */
    @SerializedName("CanModify")
    @Expose
    private Boolean CanModify;

    /**
    * <p>校验失败时的不足资源描述信息列表，校验通过时为null</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageList")
    @Expose
    private MessageItem [] MessageList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否允许变配：true-允许，false-不允许</p> 
     * @return CanModify <p>是否允许变配：true-允许，false-不允许</p>
     */
    public Boolean getCanModify() {
        return this.CanModify;
    }

    /**
     * Set <p>是否允许变配：true-允许，false-不允许</p>
     * @param CanModify <p>是否允许变配：true-允许，false-不允许</p>
     */
    public void setCanModify(Boolean CanModify) {
        this.CanModify = CanModify;
    }

    /**
     * Get <p>校验失败时的不足资源描述信息列表，校验通过时为null</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageList <p>校验失败时的不足资源描述信息列表，校验通过时为null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageItem [] getMessageList() {
        return this.MessageList;
    }

    /**
     * Set <p>校验失败时的不足资源描述信息列表，校验通过时为null</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageList <p>校验失败时的不足资源描述信息列表，校验通过时为null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageList(MessageItem [] MessageList) {
        this.MessageList = MessageList;
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

    public CheckModifyPartitionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckModifyPartitionResponse(CheckModifyPartitionResponse source) {
        if (source.CanModify != null) {
            this.CanModify = new Boolean(source.CanModify);
        }
        if (source.MessageList != null) {
            this.MessageList = new MessageItem[source.MessageList.length];
            for (int i = 0; i < source.MessageList.length; i++) {
                this.MessageList[i] = new MessageItem(source.MessageList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanModify", this.CanModify);
        this.setParamArrayObj(map, prefix + "MessageList.", this.MessageList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

