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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignProjectRequest extends AbstractModel{

    /**
    * 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceIds 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceIds 实例ID列表，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

