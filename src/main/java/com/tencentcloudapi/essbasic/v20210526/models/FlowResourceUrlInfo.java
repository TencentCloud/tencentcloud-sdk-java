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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowResourceUrlInfo extends AbstractModel {

    /**
    * 合同流程的ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 对应的合同流程的PDF下载链接
    */
    @SerializedName("ResourceUrlInfos")
    @Expose
    private ResourceUrlInfo [] ResourceUrlInfos;

    /**
     * Get 合同流程的ID 
     * @return FlowId 合同流程的ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程的ID
     * @param FlowId 合同流程的ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 对应的合同流程的PDF下载链接 
     * @return ResourceUrlInfos 对应的合同流程的PDF下载链接
     */
    public ResourceUrlInfo [] getResourceUrlInfos() {
        return this.ResourceUrlInfos;
    }

    /**
     * Set 对应的合同流程的PDF下载链接
     * @param ResourceUrlInfos 对应的合同流程的PDF下载链接
     */
    public void setResourceUrlInfos(ResourceUrlInfo [] ResourceUrlInfos) {
        this.ResourceUrlInfos = ResourceUrlInfos;
    }

    public FlowResourceUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowResourceUrlInfo(FlowResourceUrlInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ResourceUrlInfos != null) {
            this.ResourceUrlInfos = new ResourceUrlInfo[source.ResourceUrlInfos.length];
            for (int i = 0; i < source.ResourceUrlInfos.length; i++) {
                this.ResourceUrlInfos[i] = new ResourceUrlInfo(source.ResourceUrlInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "ResourceUrlInfos.", this.ResourceUrlInfos);

    }
}

