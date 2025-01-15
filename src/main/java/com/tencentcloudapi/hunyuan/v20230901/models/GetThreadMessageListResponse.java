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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetThreadMessageListResponse extends SSEResponseModel {

    /**
    * 消息列表
    */
    @SerializedName("Data")
    @Expose
    private ThreadMessage [] Data;

    /**
    * 第一条消息 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstID")
    @Expose
    private String FirstID;

    /**
    * 已废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastID")
    @Expose
    private Long LastID;

    /**
    * 是否还有更多消息
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * 对象类型
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 第一条消息 ID
    */
    @SerializedName("FirstMsgID")
    @Expose
    private String FirstMsgID;

    /**
    * 最后一条消息 ID
    */
    @SerializedName("LastMsgID")
    @Expose
    private String LastMsgID;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 消息列表 
     * @return Data 消息列表
     */
    public ThreadMessage [] getData() {
        return this.Data;
    }

    /**
     * Set 消息列表
     * @param Data 消息列表
     */
    public void setData(ThreadMessage [] Data) {
        this.Data = Data;
    }

    /**
     * Get 第一条消息 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstID 第一条消息 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getFirstID() {
        return this.FirstID;
    }

    /**
     * Set 第一条消息 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstID 第一条消息 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setFirstID(String FirstID) {
        this.FirstID = FirstID;
    }

    /**
     * Get 已废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastID 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getLastID() {
        return this.LastID;
    }

    /**
     * Set 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastID 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setLastID(Long LastID) {
        this.LastID = LastID;
    }

    /**
     * Get 是否还有更多消息 
     * @return HasMore 是否还有更多消息
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set 是否还有更多消息
     * @param HasMore 是否还有更多消息
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
    }

    /**
     * Get 对象类型 
     * @return Object 对象类型
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 对象类型
     * @param Object 对象类型
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get 第一条消息 ID 
     * @return FirstMsgID 第一条消息 ID
     */
    public String getFirstMsgID() {
        return this.FirstMsgID;
    }

    /**
     * Set 第一条消息 ID
     * @param FirstMsgID 第一条消息 ID
     */
    public void setFirstMsgID(String FirstMsgID) {
        this.FirstMsgID = FirstMsgID;
    }

    /**
     * Get 最后一条消息 ID 
     * @return LastMsgID 最后一条消息 ID
     */
    public String getLastMsgID() {
        return this.LastMsgID;
    }

    /**
     * Set 最后一条消息 ID
     * @param LastMsgID 最后一条消息 ID
     */
    public void setLastMsgID(String LastMsgID) {
        this.LastMsgID = LastMsgID;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetThreadMessageListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetThreadMessageListResponse(GetThreadMessageListResponse source) {
        if (source.Data != null) {
            this.Data = new ThreadMessage[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ThreadMessage(source.Data[i]);
            }
        }
        if (source.FirstID != null) {
            this.FirstID = new String(source.FirstID);
        }
        if (source.LastID != null) {
            this.LastID = new Long(source.LastID);
        }
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.FirstMsgID != null) {
            this.FirstMsgID = new String(source.FirstMsgID);
        }
        if (source.LastMsgID != null) {
            this.LastMsgID = new String(source.LastMsgID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "FirstID", this.FirstID);
        this.setParamSimple(map, prefix + "LastID", this.LastID);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "FirstMsgID", this.FirstMsgID);
        this.setParamSimple(map, prefix + "LastMsgID", this.LastMsgID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

