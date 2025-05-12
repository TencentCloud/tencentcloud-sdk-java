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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceRequest extends AbstractModel {

    /**
    * 修改实例操作。如填写：
- rename：表示实例重命名。
- modifyProject：修改实例所属项目。
- modifyAutoRenew：修改实例续费标记。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。每次请求的实例数量的上限为10。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例的新名称。
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 项目 ID，请登录[Redis控制台的项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 自动续费标识。
- 0：默认状态，指手动续费。
- 1：自动续费。
- 2：明确不自动续费。
    */
    @SerializedName("AutoRenews")
    @Expose
    private Long [] AutoRenews;

    /**
    * 目前在废弃中，存量用户还可以使用，建议新用户使用 InstanceIds。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 已经废弃
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 已经废弃。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
     * Get 修改实例操作。如填写：
- rename：表示实例重命名。
- modifyProject：修改实例所属项目。
- modifyAutoRenew：修改实例续费标记。 
     * @return Operation 修改实例操作。如填写：
- rename：表示实例重命名。
- modifyProject：修改实例所属项目。
- modifyAutoRenew：修改实例续费标记。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 修改实例操作。如填写：
- rename：表示实例重命名。
- modifyProject：修改实例所属项目。
- modifyAutoRenew：修改实例续费标记。
     * @param Operation 修改实例操作。如填写：
- rename：表示实例重命名。
- modifyProject：修改实例所属项目。
- modifyAutoRenew：修改实例续费标记。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。每次请求的实例数量的上限为10。 
     * @return InstanceIds 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。每次请求的实例数量的上限为10。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。每次请求的实例数量的上限为10。
     * @param InstanceIds 实例 ID，请登录[Redis控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。每次请求的实例数量的上限为10。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例的新名称。 
     * @return InstanceNames 实例的新名称。
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 实例的新名称。
     * @param InstanceNames 实例的新名称。
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 项目 ID，请登录[Redis控制台的项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。 
     * @return ProjectId 项目 ID，请登录[Redis控制台的项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，请登录[Redis控制台的项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
     * @param ProjectId 项目 ID，请登录[Redis控制台的项目管理](https://console.cloud.tencent.com/project)页面，在**项目名称**中复制项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 自动续费标识。
- 0：默认状态，指手动续费。
- 1：自动续费。
- 2：明确不自动续费。 
     * @return AutoRenews 自动续费标识。
- 0：默认状态，指手动续费。
- 1：自动续费。
- 2：明确不自动续费。
     */
    public Long [] getAutoRenews() {
        return this.AutoRenews;
    }

    /**
     * Set 自动续费标识。
- 0：默认状态，指手动续费。
- 1：自动续费。
- 2：明确不自动续费。
     * @param AutoRenews 自动续费标识。
- 0：默认状态，指手动续费。
- 1：自动续费。
- 2：明确不自动续费。
     */
    public void setAutoRenews(Long [] AutoRenews) {
        this.AutoRenews = AutoRenews;
    }

    /**
     * Get 目前在废弃中，存量用户还可以使用，建议新用户使用 InstanceIds。 
     * @return InstanceId 目前在废弃中，存量用户还可以使用，建议新用户使用 InstanceIds。
     * @deprecated
     */
    @Deprecated
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 目前在废弃中，存量用户还可以使用，建议新用户使用 InstanceIds。
     * @param InstanceId 目前在废弃中，存量用户还可以使用，建议新用户使用 InstanceIds。
     * @deprecated
     */
    @Deprecated
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 已经废弃 
     * @return InstanceName 已经废弃
     * @deprecated
     */
    @Deprecated
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 已经废弃
     * @param InstanceName 已经废弃
     * @deprecated
     */
    @Deprecated
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 已经废弃。 
     * @return AutoRenew 已经废弃。
     * @deprecated
     */
    @Deprecated
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 已经废弃。
     * @param AutoRenew 已经废弃。
     * @deprecated
     */
    @Deprecated
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    public ModifyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceRequest(ModifyInstanceRequest source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoRenews != null) {
            this.AutoRenews = new Long[source.AutoRenews.length];
            for (int i = 0; i < source.AutoRenews.length; i++) {
                this.AutoRenews[i] = new Long(source.AutoRenews[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "AutoRenews.", this.AutoRenews);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);

    }
}

