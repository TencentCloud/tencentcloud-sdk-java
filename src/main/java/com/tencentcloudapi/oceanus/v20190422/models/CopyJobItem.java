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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyJobItem extends AbstractModel {

    /**
    * <p>需要复制的作业serial id</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>目标集群的cluster serial id</p>
    */
    @SerializedName("TargetClusterId")
    @Expose
    private String TargetClusterId;

    /**
    * <p>需要复制的作业名称</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>新作业的名称</p>
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * <p>新作业的目录id</p>
    */
    @SerializedName("TargetFolderId")
    @Expose
    private String TargetFolderId;

    /**
    * <p>作业类型</p><p>枚举值：</p><ul><li>1： sql作业</li><li>2： jar作业</li><li>4： python作业</li></ul>
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
     * Get <p>需要复制的作业serial id</p> 
     * @return SourceId <p>需要复制的作业serial id</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>需要复制的作业serial id</p>
     * @param SourceId <p>需要复制的作业serial id</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>目标集群的cluster serial id</p> 
     * @return TargetClusterId <p>目标集群的cluster serial id</p>
     */
    public String getTargetClusterId() {
        return this.TargetClusterId;
    }

    /**
     * Set <p>目标集群的cluster serial id</p>
     * @param TargetClusterId <p>目标集群的cluster serial id</p>
     */
    public void setTargetClusterId(String TargetClusterId) {
        this.TargetClusterId = TargetClusterId;
    }

    /**
     * Get <p>需要复制的作业名称</p> 
     * @return SourceName <p>需要复制的作业名称</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>需要复制的作业名称</p>
     * @param SourceName <p>需要复制的作业名称</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>新作业的名称</p> 
     * @return TargetName <p>新作业的名称</p>
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set <p>新作业的名称</p>
     * @param TargetName <p>新作业的名称</p>
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get <p>新作业的目录id</p> 
     * @return TargetFolderId <p>新作业的目录id</p>
     */
    public String getTargetFolderId() {
        return this.TargetFolderId;
    }

    /**
     * Set <p>新作业的目录id</p>
     * @param TargetFolderId <p>新作业的目录id</p>
     */
    public void setTargetFolderId(String TargetFolderId) {
        this.TargetFolderId = TargetFolderId;
    }

    /**
     * Get <p>作业类型</p><p>枚举值：</p><ul><li>1： sql作业</li><li>2： jar作业</li><li>4： python作业</li></ul> 
     * @return JobType <p>作业类型</p><p>枚举值：</p><ul><li>1： sql作业</li><li>2： jar作业</li><li>4： python作业</li></ul>
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>作业类型</p><p>枚举值：</p><ul><li>1： sql作业</li><li>2： jar作业</li><li>4： python作业</li></ul>
     * @param JobType <p>作业类型</p><p>枚举值：</p><ul><li>1： sql作业</li><li>2： jar作业</li><li>4： python作业</li></ul>
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

