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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceStatisticsItem extends AbstractModel{

    /**
    * 资源类型。比如，CVM，ENI等。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源名称。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源个数。
    */
    @SerializedName("ResourceCount")
    @Expose
    private Long ResourceCount;

    /**
     * Get 资源类型。比如，CVM，ENI等。 
     * @return ResourceType 资源类型。比如，CVM，ENI等。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。比如，CVM，ENI等。
     * @param ResourceType 资源类型。比如，CVM，ENI等。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源名称。 
     * @return ResourceName 资源名称。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称。
     * @param ResourceName 资源名称。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源个数。 
     * @return ResourceCount 资源个数。
     */
    public Long getResourceCount() {
        return this.ResourceCount;
    }

    /**
     * Set 资源个数。
     * @param ResourceCount 资源个数。
     */
    public void setResourceCount(Long ResourceCount) {
        this.ResourceCount = ResourceCount;
    }

    public ResourceStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceStatisticsItem(ResourceStatisticsItem source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceCount != null) {
            this.ResourceCount = new Long(source.ResourceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceCount", this.ResourceCount);

    }
}

