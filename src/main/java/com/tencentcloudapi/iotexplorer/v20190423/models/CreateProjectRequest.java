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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel{

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目描述
    */
    @SerializedName("ProjectDesc")
    @Expose
    private String ProjectDesc;

    /**
    * 实例ID，不带实例ID，默认为公共实例
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目描述 
     * @return ProjectDesc 项目描述
     */
    public String getProjectDesc() {
        return this.ProjectDesc;
    }

    /**
     * Set 项目描述
     * @param ProjectDesc 项目描述
     */
    public void setProjectDesc(String ProjectDesc) {
        this.ProjectDesc = ProjectDesc;
    }

    /**
     * Get 实例ID，不带实例ID，默认为公共实例 
     * @return InstanceId 实例ID，不带实例ID，默认为公共实例
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，不带实例ID，默认为公共实例
     * @param InstanceId 实例ID，不带实例ID，默认为公共实例
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDesc != null) {
            this.ProjectDesc = new String(source.ProjectDesc);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDesc", this.ProjectDesc);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

