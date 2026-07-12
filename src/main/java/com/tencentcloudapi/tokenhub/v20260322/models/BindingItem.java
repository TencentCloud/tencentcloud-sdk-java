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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindingItem extends AbstractModel {

    /**
    * <p>资源 ID（模型 ID 或服务 ID）。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源类型。取值：endpoint（推理服务）、model（模型）。推荐绑定endpoint，绑定model即将下线。已绑定model的apikey仍可使用，但控制台回显将不会展示模型绑定列表。</p><p>枚举值：</p><ul><li>endpoint： 绑定到endpoint（默认推理服务或自定义推理服务）</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>资源 ID（模型 ID 或服务 ID）。</p> 
     * @return ResourceId <p>资源 ID（模型 ID 或服务 ID）。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源 ID（模型 ID 或服务 ID）。</p>
     * @param ResourceId <p>资源 ID（模型 ID 或服务 ID）。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源类型。取值：endpoint（推理服务）、model（模型）。推荐绑定endpoint，绑定model即将下线。已绑定model的apikey仍可使用，但控制台回显将不会展示模型绑定列表。</p><p>枚举值：</p><ul><li>endpoint： 绑定到endpoint（默认推理服务或自定义推理服务）</li></ul> 
     * @return ResourceType <p>资源类型。取值：endpoint（推理服务）、model（模型）。推荐绑定endpoint，绑定model即将下线。已绑定model的apikey仍可使用，但控制台回显将不会展示模型绑定列表。</p><p>枚举值：</p><ul><li>endpoint： 绑定到endpoint（默认推理服务或自定义推理服务）</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型。取值：endpoint（推理服务）、model（模型）。推荐绑定endpoint，绑定model即将下线。已绑定model的apikey仍可使用，但控制台回显将不会展示模型绑定列表。</p><p>枚举值：</p><ul><li>endpoint： 绑定到endpoint（默认推理服务或自定义推理服务）</li></ul>
     * @param ResourceType <p>资源类型。取值：endpoint（推理服务）、model（模型）。推荐绑定endpoint，绑定model即将下线。已绑定model的apikey仍可使用，但控制台回显将不会展示模型绑定列表。</p><p>枚举值：</p><ul><li>endpoint： 绑定到endpoint（默认推理服务或自定义推理服务）</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源状态</p> 
     * @return Status <p>资源状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>资源状态</p>
     * @param Status <p>资源状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BindingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingItem(BindingItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

