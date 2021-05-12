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

public class DescribeFlowServiceDetailRequest extends AbstractModel{

    /**
    * 状态机所属服务资源名
    */
    @SerializedName("FlowServiceResource")
    @Expose
    private String FlowServiceResource;

    /**
     * Get 状态机所属服务资源名 
     * @return FlowServiceResource 状态机所属服务资源名
     */
    public String getFlowServiceResource() {
        return this.FlowServiceResource;
    }

    /**
     * Set 状态机所属服务资源名
     * @param FlowServiceResource 状态机所属服务资源名
     */
    public void setFlowServiceResource(String FlowServiceResource) {
        this.FlowServiceResource = FlowServiceResource;
    }

    public DescribeFlowServiceDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowServiceDetailRequest(DescribeFlowServiceDetailRequest source) {
        if (source.FlowServiceResource != null) {
            this.FlowServiceResource = new String(source.FlowServiceResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowServiceResource", this.FlowServiceResource);

    }
}

