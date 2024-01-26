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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcquireLockRequest extends AbstractModel {

    /**
    * 资源唯一路径
    */
    @SerializedName("ResourcePath")
    @Expose
    private String ResourcePath;

    /**
    * TASK/FILE
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 资源唯一路径 
     * @return ResourcePath 资源唯一路径
     */
    public String getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set 资源唯一路径
     * @param ResourcePath 资源唯一路径
     */
    public void setResourcePath(String ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    /**
     * Get TASK/FILE 
     * @return ResourceType TASK/FILE
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set TASK/FILE
     * @param ResourceType TASK/FILE
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public AcquireLockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcquireLockRequest(AcquireLockRequest source) {
        if (source.ResourcePath != null) {
            this.ResourcePath = new String(source.ResourcePath);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourcePath", this.ResourcePath);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

