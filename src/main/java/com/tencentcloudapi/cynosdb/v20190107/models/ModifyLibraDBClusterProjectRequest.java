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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraDBClusterProjectRequest extends AbstractModel {

    /**
    * 分析集群 ID 列表
    */
    @SerializedName("ClusterIdSet")
    @Expose
    private String [] ClusterIdSet;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 分析集群 ID 列表 
     * @return ClusterIdSet 分析集群 ID 列表
     */
    public String [] getClusterIdSet() {
        return this.ClusterIdSet;
    }

    /**
     * Set 分析集群 ID 列表
     * @param ClusterIdSet 分析集群 ID 列表
     */
    public void setClusterIdSet(String [] ClusterIdSet) {
        this.ClusterIdSet = ClusterIdSet;
    }

    /**
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyLibraDBClusterProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterProjectRequest(ModifyLibraDBClusterProjectRequest source) {
        if (source.ClusterIdSet != null) {
            this.ClusterIdSet = new String[source.ClusterIdSet.length];
            for (int i = 0; i < source.ClusterIdSet.length; i++) {
                this.ClusterIdSet[i] = new String(source.ClusterIdSet[i]);
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
        this.setParamArraySimple(map, prefix + "ClusterIdSet.", this.ClusterIdSet);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

