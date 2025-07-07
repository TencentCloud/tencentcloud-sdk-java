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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowId extends AbstractModel {

    /**
    * FlowId，唯一标识一个flow。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * flow所在的区域名称。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get FlowId，唯一标识一个flow。 
     * @return FlowId FlowId，唯一标识一个flow。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set FlowId，唯一标识一个flow。
     * @param FlowId FlowId，唯一标识一个flow。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get flow所在的区域名称。 
     * @return Region flow所在的区域名称。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set flow所在的区域名称。
     * @param Region flow所在的区域名称。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DescribeFlowId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowId(DescribeFlowId source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

