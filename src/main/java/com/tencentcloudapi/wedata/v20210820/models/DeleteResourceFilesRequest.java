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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteResourceFilesRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 使用状态
    */
    @SerializedName("UseStatus")
    @Expose
    private Boolean UseStatus;

    /**
    * 资源id列表
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 资源路径列表
    */
    @SerializedName("FilePaths")
    @Expose
    private String [] FilePaths;

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

    /**
     * Get 使用状态 
     * @return UseStatus 使用状态
     */
    public Boolean getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set 使用状态
     * @param UseStatus 使用状态
     */
    public void setUseStatus(Boolean UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get 资源id列表 
     * @return ResourceIds 资源id列表
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源id列表
     * @param ResourceIds 资源id列表
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 资源路径列表 
     * @return FilePaths 资源路径列表
     */
    public String [] getFilePaths() {
        return this.FilePaths;
    }

    /**
     * Set 资源路径列表
     * @param FilePaths 资源路径列表
     */
    public void setFilePaths(String [] FilePaths) {
        this.FilePaths = FilePaths;
    }

    public DeleteResourceFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteResourceFilesRequest(DeleteResourceFilesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UseStatus != null) {
            this.UseStatus = new Boolean(source.UseStatus);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.FilePaths != null) {
            this.FilePaths = new String[source.FilePaths.length];
            for (int i = 0; i < source.FilePaths.length; i++) {
                this.FilePaths[i] = new String(source.FilePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "FilePaths.", this.FilePaths);

    }
}

