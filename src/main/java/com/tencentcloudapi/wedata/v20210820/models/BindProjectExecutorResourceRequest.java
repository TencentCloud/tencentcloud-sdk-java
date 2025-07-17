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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindProjectExecutorResourceRequest extends AbstractModel {

    /**
    * 执行资源组id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 需要绑定项目的资源包id集合，为空则绑定整个资源组
    */
    @SerializedName("ExecutorResourcePackageIds")
    @Expose
    private String [] ExecutorResourcePackageIds;

    /**
    * 可选: 需要绑定的多个项目id, 若申明将带上ProjectId一起绑定
    */
    @SerializedName("ProjectIdList")
    @Expose
    private String [] ProjectIdList;

    /**
     * Get 执行资源组id 
     * @return ExecutorGroupId 执行资源组id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组id
     * @param ExecutorGroupId 执行资源组id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
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

    /**
     * Get 需要绑定项目的资源包id集合，为空则绑定整个资源组 
     * @return ExecutorResourcePackageIds 需要绑定项目的资源包id集合，为空则绑定整个资源组
     */
    public String [] getExecutorResourcePackageIds() {
        return this.ExecutorResourcePackageIds;
    }

    /**
     * Set 需要绑定项目的资源包id集合，为空则绑定整个资源组
     * @param ExecutorResourcePackageIds 需要绑定项目的资源包id集合，为空则绑定整个资源组
     */
    public void setExecutorResourcePackageIds(String [] ExecutorResourcePackageIds) {
        this.ExecutorResourcePackageIds = ExecutorResourcePackageIds;
    }

    /**
     * Get 可选: 需要绑定的多个项目id, 若申明将带上ProjectId一起绑定 
     * @return ProjectIdList 可选: 需要绑定的多个项目id, 若申明将带上ProjectId一起绑定
     */
    public String [] getProjectIdList() {
        return this.ProjectIdList;
    }

    /**
     * Set 可选: 需要绑定的多个项目id, 若申明将带上ProjectId一起绑定
     * @param ProjectIdList 可选: 需要绑定的多个项目id, 若申明将带上ProjectId一起绑定
     */
    public void setProjectIdList(String [] ProjectIdList) {
        this.ProjectIdList = ProjectIdList;
    }

    public BindProjectExecutorResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindProjectExecutorResourceRequest(BindProjectExecutorResourceRequest source) {
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ExecutorResourcePackageIds != null) {
            this.ExecutorResourcePackageIds = new String[source.ExecutorResourcePackageIds.length];
            for (int i = 0; i < source.ExecutorResourcePackageIds.length; i++) {
                this.ExecutorResourcePackageIds[i] = new String(source.ExecutorResourcePackageIds[i]);
            }
        }
        if (source.ProjectIdList != null) {
            this.ProjectIdList = new String[source.ProjectIdList.length];
            for (int i = 0; i < source.ProjectIdList.length; i++) {
                this.ProjectIdList[i] = new String(source.ProjectIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "ExecutorResourcePackageIds.", this.ExecutorResourcePackageIds);
        this.setParamArraySimple(map, prefix + "ProjectIdList.", this.ProjectIdList);

    }
}

