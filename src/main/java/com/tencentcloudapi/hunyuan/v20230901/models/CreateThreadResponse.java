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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateThreadResponse extends SSEResponseModel {

    /**
    * 会话 ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 对象类型
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 创建时间，Unix 时间戳，单位为秒。
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 提供给工具的资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolResources")
    @Expose
    private ThreadToolResources ToolResources;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 会话 ID 
     * @return ID 会话 ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 会话 ID
     * @param ID 会话 ID
     */
    public void setID(String ID) {
        this.ID = ID;
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
     * Get 创建时间，Unix 时间戳，单位为秒。 
     * @return CreatedAt 创建时间，Unix 时间戳，单位为秒。
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间，Unix 时间戳，单位为秒。
     * @param CreatedAt 创建时间，Unix 时间戳，单位为秒。
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 提供给工具的资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolResources 提供给工具的资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThreadToolResources getToolResources() {
        return this.ToolResources;
    }

    /**
     * Set 提供给工具的资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolResources 提供给工具的资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolResources(ThreadToolResources ToolResources) {
        this.ToolResources = ToolResources;
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

    public CreateThreadResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateThreadResponse(CreateThreadResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.ToolResources != null) {
            this.ToolResources = new ThreadToolResources(source.ToolResources);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamObj(map, prefix + "ToolResources.", this.ToolResources);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

