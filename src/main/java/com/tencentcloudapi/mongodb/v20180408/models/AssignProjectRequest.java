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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignProjectRequest extends AbstractModel {

    /**
    * 实例 ID 列表。格式如：cmgo-p8vn****，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 项目ID。项目 ID 具有唯一性，请[登录 MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息的下拉菜单中，选择**项目管理**，即可获取项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 实例 ID 列表。格式如：cmgo-p8vn****，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceIds 实例 ID 列表。格式如：cmgo-p8vn****，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表。格式如：cmgo-p8vn****，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceIds 实例 ID 列表。格式如：cmgo-p8vn****，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 项目ID。项目 ID 具有唯一性，请[登录 MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息的下拉菜单中，选择**项目管理**，即可获取项目ID。 
     * @return ProjectId 项目ID。项目 ID 具有唯一性，请[登录 MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息的下拉菜单中，选择**项目管理**，即可获取项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。项目 ID 具有唯一性，请[登录 MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息的下拉菜单中，选择**项目管理**，即可获取项目ID。
     * @param ProjectId 项目ID。项目 ID 具有唯一性，请[登录 MongoDB 控制台](https://console.cloud.tencent.com/mongodb)，在右上角的账户信息的下拉菜单中，选择**项目管理**，即可获取项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public AssignProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignProjectRequest(AssignProjectRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

