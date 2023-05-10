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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyJobItem extends AbstractModel{

    /**
    * 需要复制的作业serial id
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 目标集群的cluster serial id
    */
    @SerializedName("TargetClusterId")
    @Expose
    private String TargetClusterId;

    /**
    * 需要复制的作业名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 新作业的名称
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 新作业的目录id
    */
    @SerializedName("TargetFolderId")
    @Expose
    private String TargetFolderId;

    /**
    * 源作业类型
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
     * Get 需要复制的作业serial id 
     * @return SourceId 需要复制的作业serial id
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 需要复制的作业serial id
     * @param SourceId 需要复制的作业serial id
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 目标集群的cluster serial id 
     * @return TargetClusterId 目标集群的cluster serial id
     */
    public String getTargetClusterId() {
        return this.TargetClusterId;
    }

    /**
     * Set 目标集群的cluster serial id
     * @param TargetClusterId 目标集群的cluster serial id
     */
    public void setTargetClusterId(String TargetClusterId) {
        this.TargetClusterId = TargetClusterId;
    }

    /**
     * Get 需要复制的作业名称 
     * @return SourceName 需要复制的作业名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 需要复制的作业名称
     * @param SourceName 需要复制的作业名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 新作业的名称 
     * @return TargetName 新作业的名称
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 新作业的名称
     * @param TargetName 新作业的名称
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 新作业的目录id 
     * @return TargetFolderId 新作业的目录id
     */
    public String getTargetFolderId() {
        return this.TargetFolderId;
    }

    /**
     * Set 新作业的目录id
     * @param TargetFolderId 新作业的目录id
     */
    public void setTargetFolderId(String TargetFolderId) {
        this.TargetFolderId = TargetFolderId;
    }

    /**
     * Get 源作业类型 
     * @return JobType 源作业类型
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set 源作业类型
     * @param JobType 源作业类型
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    public CopyJobItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyJobItem(CopyJobItem source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.TargetClusterId != null) {
            this.TargetClusterId = new String(source.TargetClusterId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.TargetFolderId != null) {
            this.TargetFolderId = new String(source.TargetFolderId);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "TargetClusterId", this.TargetClusterId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "TargetFolderId", this.TargetFolderId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);

    }
}

