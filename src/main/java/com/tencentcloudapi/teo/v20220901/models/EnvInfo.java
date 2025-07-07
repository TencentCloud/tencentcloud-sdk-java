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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInfo extends AbstractModel {

    /**
    * 环境 ID。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 环境类型，取值有：
<li>production: 生产环境；</li><li>staging: 测试环境。</li>
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 环境状态，取值有：
<li>creating：创建中；</li>
<li>running：稳定运行中，可进行版本变更；</li>
<li>version_deploying：版本部署中，不能进行新的变更。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当前环境的配置生效范围：
<li>当 EnvType 取值为 production 时，该参数值为 ["ALL"]，代表全网生效；</li>
<li>当 EnvType 取值为 staging 时，会返回测试节点 IP，可用于绑定 host 测试。</li>
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * 当前环境中各配置组实际生效的版本，根据 Status 的取值有以下两种情况：
<li>当 Status 取值为 version_deploying 时，本字段返回的值为执行变更动作之前生效的版本，即新版本部署期间，实际生效的版本为执行变更动作之前的版本；</li>
<li>当 Status 取值为 running 时，本字段返回的值即为当前实际生效的版本。</li>
    */
    @SerializedName("CurrentConfigGroupVersionInfos")
    @Expose
    private ConfigGroupVersionInfo [] CurrentConfigGroupVersionInfos;

    /**
    * 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 环境 ID。 
     * @return EnvId 环境 ID。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 ID。
     * @param EnvId 环境 ID。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 环境类型，取值有：
<li>production: 生产环境；</li><li>staging: 测试环境。</li> 
     * @return EnvType 环境类型，取值有：
<li>production: 生产环境；</li><li>staging: 测试环境。</li>
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型，取值有：
<li>production: 生产环境；</li><li>staging: 测试环境。</li>
     * @param EnvType 环境类型，取值有：
<li>production: 生产环境；</li><li>staging: 测试环境。</li>
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 环境状态，取值有：
<li>creating：创建中；</li>
<li>running：稳定运行中，可进行版本变更；</li>
<li>version_deploying：版本部署中，不能进行新的变更。</li> 
     * @return Status 环境状态，取值有：
<li>creating：创建中；</li>
<li>running：稳定运行中，可进行版本变更；</li>
<li>version_deploying：版本部署中，不能进行新的变更。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 环境状态，取值有：
<li>creating：创建中；</li>
<li>running：稳定运行中，可进行版本变更；</li>
<li>version_deploying：版本部署中，不能进行新的变更。</li>
     * @param Status 环境状态，取值有：
<li>creating：创建中；</li>
<li>running：稳定运行中，可进行版本变更；</li>
<li>version_deploying：版本部署中，不能进行新的变更。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当前环境的配置生效范围：
<li>当 EnvType 取值为 production 时，该参数值为 ["ALL"]，代表全网生效；</li>
<li>当 EnvType 取值为 staging 时，会返回测试节点 IP，可用于绑定 host 测试。</li> 
     * @return Scope 当前环境的配置生效范围：
<li>当 EnvType 取值为 production 时，该参数值为 ["ALL"]，代表全网生效；</li>
<li>当 EnvType 取值为 staging 时，会返回测试节点 IP，可用于绑定 host 测试。</li>
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set 当前环境的配置生效范围：
<li>当 EnvType 取值为 production 时，该参数值为 ["ALL"]，代表全网生效；</li>
<li>当 EnvType 取值为 staging 时，会返回测试节点 IP，可用于绑定 host 测试。</li>
     * @param Scope 当前环境的配置生效范围：
<li>当 EnvType 取值为 production 时，该参数值为 ["ALL"]，代表全网生效；</li>
<li>当 EnvType 取值为 staging 时，会返回测试节点 IP，可用于绑定 host 测试。</li>
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 当前环境中各配置组实际生效的版本，根据 Status 的取值有以下两种情况：
<li>当 Status 取值为 version_deploying 时，本字段返回的值为执行变更动作之前生效的版本，即新版本部署期间，实际生效的版本为执行变更动作之前的版本；</li>
<li>当 Status 取值为 running 时，本字段返回的值即为当前实际生效的版本。</li> 
     * @return CurrentConfigGroupVersionInfos 当前环境中各配置组实际生效的版本，根据 Status 的取值有以下两种情况：
<li>当 Status 取值为 version_deploying 时，本字段返回的值为执行变更动作之前生效的版本，即新版本部署期间，实际生效的版本为执行变更动作之前的版本；</li>
<li>当 Status 取值为 running 时，本字段返回的值即为当前实际生效的版本。</li>
     */
    public ConfigGroupVersionInfo [] getCurrentConfigGroupVersionInfos() {
        return this.CurrentConfigGroupVersionInfos;
    }

    /**
     * Set 当前环境中各配置组实际生效的版本，根据 Status 的取值有以下两种情况：
<li>当 Status 取值为 version_deploying 时，本字段返回的值为执行变更动作之前生效的版本，即新版本部署期间，实际生效的版本为执行变更动作之前的版本；</li>
<li>当 Status 取值为 running 时，本字段返回的值即为当前实际生效的版本。</li>
     * @param CurrentConfigGroupVersionInfos 当前环境中各配置组实际生效的版本，根据 Status 的取值有以下两种情况：
<li>当 Status 取值为 version_deploying 时，本字段返回的值为执行变更动作之前生效的版本，即新版本部署期间，实际生效的版本为执行变更动作之前的版本；</li>
<li>当 Status 取值为 running 时，本字段返回的值即为当前实际生效的版本。</li>
     */
    public void setCurrentConfigGroupVersionInfos(ConfigGroupVersionInfo [] CurrentConfigGroupVersionInfos) {
        this.CurrentConfigGroupVersionInfos = CurrentConfigGroupVersionInfos;
    }

    /**
     * Get 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return CreateTime 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param CreateTime 创建时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。 
     * @return UpdateTime 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     * @param UpdateTime 更新时间。时间为世界标准时间（UTC）， 遵循 ISO 8601 标准的日期和时间格式。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public EnvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvInfo(EnvInfo source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.CurrentConfigGroupVersionInfos != null) {
            this.CurrentConfigGroupVersionInfos = new ConfigGroupVersionInfo[source.CurrentConfigGroupVersionInfos.length];
            for (int i = 0; i < source.CurrentConfigGroupVersionInfos.length; i++) {
                this.CurrentConfigGroupVersionInfos[i] = new ConfigGroupVersionInfo(source.CurrentConfigGroupVersionInfos[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamArrayObj(map, prefix + "CurrentConfigGroupVersionInfos.", this.CurrentConfigGroupVersionInfos);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

