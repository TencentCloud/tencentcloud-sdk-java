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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectorKnowledgeScope extends AbstractModel {

    /**
    * <p>是否启用知识范围</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>已选资源列表，Enabled 为 true 时至少 1 项</p>
    */
    @SerializedName("ResourceList")
    @Expose
    private ConnectorResource [] ResourceList;

    /**
     * Get <p>是否启用知识范围</p> 
     * @return Enabled <p>是否启用知识范围</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用知识范围</p>
     * @param Enabled <p>是否启用知识范围</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>已选资源列表，Enabled 为 true 时至少 1 项</p> 
     * @return ResourceList <p>已选资源列表，Enabled 为 true 时至少 1 项</p>
     */
    public ConnectorResource [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set <p>已选资源列表，Enabled 为 true 时至少 1 项</p>
     * @param ResourceList <p>已选资源列表，Enabled 为 true 时至少 1 项</p>
     */
    public void setResourceList(ConnectorResource [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    public ConnectorKnowledgeScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectorKnowledgeScope(ConnectorKnowledgeScope source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new ConnectorResource[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new ConnectorResource(source.ResourceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);

    }
}

