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
    * 资源 ID（模型 ID 或服务 ID）。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型。取值：endpoint（服务）、model（模型）。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 资源 ID（模型 ID 或服务 ID）。 
     * @return ResourceId 资源 ID（模型 ID 或服务 ID）。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID（模型 ID 或服务 ID）。
     * @param ResourceId 资源 ID（模型 ID 或服务 ID）。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型。取值：endpoint（服务）、model（模型）。 
     * @return ResourceType 资源类型。取值：endpoint（服务）、model（模型）。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型。取值：endpoint（服务）、model（模型）。
     * @param ResourceType 资源类型。取值：endpoint（服务）、model（模型）。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源状态 
     * @return Status 资源状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态
     * @param Status 资源状态
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

