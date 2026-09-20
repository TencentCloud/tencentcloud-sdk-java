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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BundleResource extends AbstractModel {

    /**
    * <p>资源类型，取值范围：</p>
<ul>
<li>WORKFLOW 工作流</li>
<li>TASK 任务</li>
<li>CODE_TEMPLATE 代码模版</li>
<li>RESOURCE 资源信息</li>
<li>EVENT 事件</li>
<li>PROJECT_PARAM 项目参数</li>
</ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get <p>资源类型，取值范围：</p>
<ul>
<li>WORKFLOW 工作流</li>
<li>TASK 任务</li>
<li>CODE_TEMPLATE 代码模版</li>
<li>RESOURCE 资源信息</li>
<li>EVENT 事件</li>
<li>PROJECT_PARAM 项目参数</li>
</ul> 
     * @return ResourceType <p>资源类型，取值范围：</p>
<ul>
<li>WORKFLOW 工作流</li>
<li>TASK 任务</li>
<li>CODE_TEMPLATE 代码模版</li>
<li>RESOURCE 资源信息</li>
<li>EVENT 事件</li>
<li>PROJECT_PARAM 项目参数</li>
</ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型，取值范围：</p>
<ul>
<li>WORKFLOW 工作流</li>
<li>TASK 任务</li>
<li>CODE_TEMPLATE 代码模版</li>
<li>RESOURCE 资源信息</li>
<li>EVENT 事件</li>
<li>PROJECT_PARAM 项目参数</li>
</ul>
     * @param ResourceType <p>资源类型，取值范围：</p>
<ul>
<li>WORKFLOW 工作流</li>
<li>TASK 任务</li>
<li>CODE_TEMPLATE 代码模版</li>
<li>RESOURCE 资源信息</li>
<li>EVENT 事件</li>
<li>PROJECT_PARAM 项目参数</li>
</ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public BundleResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BundleResource(BundleResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

