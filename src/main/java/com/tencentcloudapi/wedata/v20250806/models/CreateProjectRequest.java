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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel {

    /**
    * 项目基本信息
    */
    @SerializedName("Project")
    @Expose
    private ProjectRequest Project;

    /**
    * DLC绑定集群信息
    */
    @SerializedName("DLCInfo")
    @Expose
    private DLCClusterInfo DLCInfo;

    /**
    * 绑定资源组的id列表
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get 项目基本信息 
     * @return Project 项目基本信息
     */
    public ProjectRequest getProject() {
        return this.Project;
    }

    /**
     * Set 项目基本信息
     * @param Project 项目基本信息
     */
    public void setProject(ProjectRequest Project) {
        this.Project = Project;
    }

    /**
     * Get DLC绑定集群信息 
     * @return DLCInfo DLC绑定集群信息
     */
    public DLCClusterInfo getDLCInfo() {
        return this.DLCInfo;
    }

    /**
     * Set DLC绑定集群信息
     * @param DLCInfo DLC绑定集群信息
     */
    public void setDLCInfo(DLCClusterInfo DLCInfo) {
        this.DLCInfo = DLCInfo;
    }

    /**
     * Get 绑定资源组的id列表 
     * @return ResourceIds 绑定资源组的id列表
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 绑定资源组的id列表
     * @param ResourceIds 绑定资源组的id列表
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Project != null) {
            this.Project = new ProjectRequest(source.Project);
        }
        if (source.DLCInfo != null) {
            this.DLCInfo = new DLCClusterInfo(source.DLCInfo);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Project.", this.Project);
        this.setParamObj(map, prefix + "DLCInfo.", this.DLCInfo);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

