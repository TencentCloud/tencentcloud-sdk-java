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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowServiceResponse extends AbstractModel{

    /**
    * 状态机所属服务资源
    */
    @SerializedName("FlowServiceResource")
    @Expose
    private String FlowServiceResource;

    /**
    * 生成日期
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态机所属服务资源 
     * @return FlowServiceResource 状态机所属服务资源
     */
    public String getFlowServiceResource() {
        return this.FlowServiceResource;
    }

    /**
     * Set 状态机所属服务资源
     * @param FlowServiceResource 状态机所属服务资源
     */
    public void setFlowServiceResource(String FlowServiceResource) {
        this.FlowServiceResource = FlowServiceResource;
    }

    /**
     * Get 生成日期 
     * @return CreateDate 生成日期
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 生成日期
     * @param CreateDate 生成日期
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
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

    public CreateFlowServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowServiceResponse(CreateFlowServiceResponse source) {
        if (source.FlowServiceResource != null) {
            this.FlowServiceResource = new String(source.FlowServiceResource);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowServiceResource", this.FlowServiceResource);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

