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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceConfig extends AbstractModel {

    /**
    * 规格管理类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 规格管理数据
    */
    @SerializedName("ResourceData")
    @Expose
    private NodeResource [] ResourceData;

    /**
     * Get 规格管理类型 
     * @return ResourceType 规格管理类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 规格管理类型
     * @param ResourceType 规格管理类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 规格管理数据 
     * @return ResourceData 规格管理数据
     */
    public NodeResource [] getResourceData() {
        return this.ResourceData;
    }

    /**
     * Set 规格管理数据
     * @param ResourceData 规格管理数据
     */
    public void setResourceData(NodeResource [] ResourceData) {
        this.ResourceData = ResourceData;
    }

    public DescribeResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceConfig(DescribeResourceConfig source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceData != null) {
            this.ResourceData = new NodeResource[source.ResourceData.length];
            for (int i = 0; i < source.ResourceData.length; i++) {
                this.ResourceData[i] = new NodeResource(source.ResourceData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "ResourceData.", this.ResourceData);

    }
}

