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

public class DeleteFilePathRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 使用状态
    */
    @SerializedName("UseStatus")
    @Expose
    private String UseStatus;

    /**
    * 文件路径
    */
    @SerializedName("FilePaths")
    @Expose
    private String [] FilePaths;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源ID 
     * @return ResourceIds 资源ID
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源ID
     * @param ResourceIds 资源ID
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 使用状态 
     * @return UseStatus 使用状态
     */
    public String getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set 使用状态
     * @param UseStatus 使用状态
     */
    public void setUseStatus(String UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get 文件路径 
     * @return FilePaths 文件路径
     */
    public String [] getFilePaths() {
        return this.FilePaths;
    }

    /**
     * Set 文件路径
     * @param FilePaths 文件路径
     */
    public void setFilePaths(String [] FilePaths) {
        this.FilePaths = FilePaths;
    }

    public DeleteFilePathRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFilePathRequest(DeleteFilePathRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.UseStatus != null) {
            this.UseStatus = new String(source.UseStatus);
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
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamArraySimple(map, prefix + "FilePaths.", this.FilePaths);

    }
}

