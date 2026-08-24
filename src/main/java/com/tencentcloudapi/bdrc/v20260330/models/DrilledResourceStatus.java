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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrilledResourceStatus extends AbstractModel {

    /**
    * 演练组关联的演练资源的状态
    */
    @SerializedName("ResourceStatus")
    @Expose
    private String ResourceStatus;

    /**
    * 演练组关联演练资源处于某个状态的数量
    */
    @SerializedName("ResourceCount")
    @Expose
    private Long ResourceCount;

    /**
     * Get 演练组关联的演练资源的状态 
     * @return ResourceStatus 演练组关联的演练资源的状态
     */
    public String getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 演练组关联的演练资源的状态
     * @param ResourceStatus 演练组关联的演练资源的状态
     */
    public void setResourceStatus(String ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get 演练组关联演练资源处于某个状态的数量 
     * @return ResourceCount 演练组关联演练资源处于某个状态的数量
     */
    public Long getResourceCount() {
        return this.ResourceCount;
    }

    /**
     * Set 演练组关联演练资源处于某个状态的数量
     * @param ResourceCount 演练组关联演练资源处于某个状态的数量
     */
    public void setResourceCount(Long ResourceCount) {
        this.ResourceCount = ResourceCount;
    }

    public DrilledResourceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrilledResourceStatus(DrilledResourceStatus source) {
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new String(source.ResourceStatus);
        }
        if (source.ResourceCount != null) {
            this.ResourceCount = new Long(source.ResourceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "ResourceCount", this.ResourceCount);

    }
}

