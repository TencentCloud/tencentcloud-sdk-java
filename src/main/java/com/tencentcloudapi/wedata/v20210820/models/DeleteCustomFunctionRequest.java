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

public class DeleteCustomFunctionRequest extends AbstractModel{

    /**
    * 集群实例 ID
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
    * 函数 ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 项目ID，必须填
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 集群实例 ID 
     * @return ClusterIdentifier 集群实例 ID
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set 集群实例 ID
     * @param ClusterIdentifier 集群实例 ID
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    /**
     * Get 函数 ID 
     * @return FunctionId 函数 ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID
     * @param FunctionId 函数 ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 项目ID，必须填 
     * @return ProjectId 项目ID，必须填
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，必须填
     * @param ProjectId 项目ID，必须填
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DeleteCustomFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomFunctionRequest(DeleteCustomFunctionRequest source) {
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

