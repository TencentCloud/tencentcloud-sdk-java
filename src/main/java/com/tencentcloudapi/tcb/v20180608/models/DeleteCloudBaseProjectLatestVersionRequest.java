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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudBaseProjectLatestVersionRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 项目名
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 是否保留资源
    */
    @SerializedName("KeepResource")
    @Expose
    private Boolean KeepResource;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 项目名 
     * @return ProjectName 项目名
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名
     * @param ProjectName 项目名
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 是否保留资源 
     * @return KeepResource 是否保留资源
     */
    public Boolean getKeepResource() {
        return this.KeepResource;
    }

    /**
     * Set 是否保留资源
     * @param KeepResource 是否保留资源
     */
    public void setKeepResource(Boolean KeepResource) {
        this.KeepResource = KeepResource;
    }

    public DeleteCloudBaseProjectLatestVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudBaseProjectLatestVersionRequest(DeleteCloudBaseProjectLatestVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.KeepResource != null) {
            this.KeepResource = new Boolean(source.KeepResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "KeepResource", this.KeepResource);

    }
}

