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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationItem extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>应用 Key</p>
    */
    @SerializedName("ProjectKey")
    @Expose
    private String ProjectKey;

    /**
    * <p>业务系统 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>业务系统名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>端类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>描述</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>是否排除已忽略错误</p>
    */
    @SerializedName("ExcludeIgnoredErrors")
    @Expose
    private Boolean ExcludeIgnoredErrors;

    /**
    * <p>状态：2 运行 / 6 停止 / 7 删除</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>该应用绑定的腾讯云 APM 实例 ID 列表。空数组表示未绑定。</p>
    */
    @SerializedName("ApmInstanceIds")
    @Expose
    private String [] ApmInstanceIds;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>应用 Key</p> 
     * @return ProjectKey <p>应用 Key</p>
     */
    public String getProjectKey() {
        return this.ProjectKey;
    }

    /**
     * Set <p>应用 Key</p>
     * @param ProjectKey <p>应用 Key</p>
     */
    public void setProjectKey(String ProjectKey) {
        this.ProjectKey = ProjectKey;
    }

    /**
     * Get <p>业务系统 ID</p> 
     * @return InstanceId <p>业务系统 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID</p>
     * @param InstanceId <p>业务系统 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>业务系统名称</p> 
     * @return InstanceName <p>业务系统名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>业务系统名称</p>
     * @param InstanceName <p>业务系统名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>应用名称</p> 
     * @return Name <p>应用名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>应用名称</p>
     * @param Name <p>应用名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>端类型</p> 
     * @return Type <p>端类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>端类型</p>
     * @param Type <p>端类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>描述</p> 
     * @return Desc <p>描述</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>描述</p>
     * @param Desc <p>描述</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>是否排除已忽略错误</p> 
     * @return ExcludeIgnoredErrors <p>是否排除已忽略错误</p>
     */
    public Boolean getExcludeIgnoredErrors() {
        return this.ExcludeIgnoredErrors;
    }

    /**
     * Set <p>是否排除已忽略错误</p>
     * @param ExcludeIgnoredErrors <p>是否排除已忽略错误</p>
     */
    public void setExcludeIgnoredErrors(Boolean ExcludeIgnoredErrors) {
        this.ExcludeIgnoredErrors = ExcludeIgnoredErrors;
    }

    /**
     * Get <p>状态：2 运行 / 6 停止 / 7 删除</p> 
     * @return Status <p>状态：2 运行 / 6 停止 / 7 删除</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：2 运行 / 6 停止 / 7 删除</p>
     * @param Status <p>状态：2 运行 / 6 停止 / 7 删除</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>该应用绑定的腾讯云 APM 实例 ID 列表。空数组表示未绑定。</p> 
     * @return ApmInstanceIds <p>该应用绑定的腾讯云 APM 实例 ID 列表。空数组表示未绑定。</p>
     */
    public String [] getApmInstanceIds() {
        return this.ApmInstanceIds;
    }

    /**
     * Set <p>该应用绑定的腾讯云 APM 实例 ID 列表。空数组表示未绑定。</p>
     * @param ApmInstanceIds <p>该应用绑定的腾讯云 APM 实例 ID 列表。空数组表示未绑定。</p>
     */
    public void setApmInstanceIds(String [] ApmInstanceIds) {
        this.ApmInstanceIds = ApmInstanceIds;
    }

    public ApplicationItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationItem(ApplicationItem source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectKey != null) {
            this.ProjectKey = new String(source.ProjectKey);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ExcludeIgnoredErrors != null) {
            this.ExcludeIgnoredErrors = new Boolean(source.ExcludeIgnoredErrors);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ApmInstanceIds != null) {
            this.ApmInstanceIds = new String[source.ApmInstanceIds.length];
            for (int i = 0; i < source.ApmInstanceIds.length; i++) {
                this.ApmInstanceIds[i] = new String(source.ApmInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectKey", this.ProjectKey);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ExcludeIgnoredErrors", this.ExcludeIgnoredErrors);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamArraySimple(map, prefix + "ApmInstanceIds.", this.ApmInstanceIds);

    }
}

