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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcePermissionRequest extends AbstractModel {

    /**
    * 环境 ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 权限级别。可选值：- SQL型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限 。- 文档型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限；`CUSTOM`-自定义安全规则 。- 云函数：`CUSTOM`-自定义安全规则 。- 云存储（权限标签）：`READONLY`-所有用户可读，仅创建者和管理员可写；`PRIVATE`-仅创建者及管理员可读写；`ADMINWRITE`-所有用户可读，仅管理员可写；`ADMINONLY`-仅管理员可读写；`CUSTOM`-自定义安全规则。
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 资源标识。云函数可不传、云存储传存储桶名、数据库表传表名。
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 自定义安全规则配置，当Permission为 `CUSTOM`时必传。JSON字符串格式的规则表达式。配置参考：[云函数安全规则](https://docs.cloudbase.net/cloud-function/security-rules)、[云存储安全规则](https://docs.cloudbase.net/storage/security-rules)、[文档型数据库安全规则](https://docs.cloudbase.net/database/security-rules)。
    */
    @SerializedName("SecurityRule")
    @Expose
    private String SecurityRule;

    /**
     * Get 环境 ID 
     * @return EnvId 环境 ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 ID
     * @param EnvId 环境 ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表。 
     * @return ResourceType 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表。
     * @param ResourceType 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 权限级别。可选值：- SQL型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限 。- 文档型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限；`CUSTOM`-自定义安全规则 。- 云函数：`CUSTOM`-自定义安全规则 。- 云存储（权限标签）：`READONLY`-所有用户可读，仅创建者和管理员可写；`PRIVATE`-仅创建者及管理员可读写；`ADMINWRITE`-所有用户可读，仅管理员可写；`ADMINONLY`-仅管理员可读写；`CUSTOM`-自定义安全规则。 
     * @return Permission 权限级别。可选值：- SQL型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限 。- 文档型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限；`CUSTOM`-自定义安全规则 。- 云函数：`CUSTOM`-自定义安全规则 。- 云存储（权限标签）：`READONLY`-所有用户可读，仅创建者和管理员可写；`PRIVATE`-仅创建者及管理员可读写；`ADMINWRITE`-所有用户可读，仅管理员可写；`ADMINONLY`-仅管理员可读写；`CUSTOM`-自定义安全规则。
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 权限级别。可选值：- SQL型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限 。- 文档型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限；`CUSTOM`-自定义安全规则 。- 云函数：`CUSTOM`-自定义安全规则 。- 云存储（权限标签）：`READONLY`-所有用户可读，仅创建者和管理员可写；`PRIVATE`-仅创建者及管理员可读写；`ADMINWRITE`-所有用户可读，仅管理员可写；`ADMINONLY`-仅管理员可读写；`CUSTOM`-自定义安全规则。
     * @param Permission 权限级别。可选值：- SQL型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限 。- 文档型数据库表：`READONLY`-读取全部数据，修改本人数据；`PRIVATE`-读取和修改本人数据；`ADMINWRITE`-读取全部数据，不可修改数据；`ADMINONLY`-无权限；`CUSTOM`-自定义安全规则 。- 云函数：`CUSTOM`-自定义安全规则 。- 云存储（权限标签）：`READONLY`-所有用户可读，仅创建者和管理员可写；`PRIVATE`-仅创建者及管理员可读写；`ADMINWRITE`-所有用户可读，仅管理员可写；`ADMINONLY`-仅管理员可读写；`CUSTOM`-自定义安全规则。
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 资源标识。云函数可不传、云存储传存储桶名、数据库表传表名。 
     * @return Resource 资源标识。云函数可不传、云存储传存储桶名、数据库表传表名。
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源标识。云函数可不传、云存储传存储桶名、数据库表传表名。
     * @param Resource 资源标识。云函数可不传、云存储传存储桶名、数据库表传表名。
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 自定义安全规则配置，当Permission为 `CUSTOM`时必传。JSON字符串格式的规则表达式。配置参考：[云函数安全规则](https://docs.cloudbase.net/cloud-function/security-rules)、[云存储安全规则](https://docs.cloudbase.net/storage/security-rules)、[文档型数据库安全规则](https://docs.cloudbase.net/database/security-rules)。 
     * @return SecurityRule 自定义安全规则配置，当Permission为 `CUSTOM`时必传。JSON字符串格式的规则表达式。配置参考：[云函数安全规则](https://docs.cloudbase.net/cloud-function/security-rules)、[云存储安全规则](https://docs.cloudbase.net/storage/security-rules)、[文档型数据库安全规则](https://docs.cloudbase.net/database/security-rules)。
     */
    public String getSecurityRule() {
        return this.SecurityRule;
    }

    /**
     * Set 自定义安全规则配置，当Permission为 `CUSTOM`时必传。JSON字符串格式的规则表达式。配置参考：[云函数安全规则](https://docs.cloudbase.net/cloud-function/security-rules)、[云存储安全规则](https://docs.cloudbase.net/storage/security-rules)、[文档型数据库安全规则](https://docs.cloudbase.net/database/security-rules)。
     * @param SecurityRule 自定义安全规则配置，当Permission为 `CUSTOM`时必传。JSON字符串格式的规则表达式。配置参考：[云函数安全规则](https://docs.cloudbase.net/cloud-function/security-rules)、[云存储安全规则](https://docs.cloudbase.net/storage/security-rules)、[文档型数据库安全规则](https://docs.cloudbase.net/database/security-rules)。
     */
    public void setSecurityRule(String SecurityRule) {
        this.SecurityRule = SecurityRule;
    }

    public ModifyResourcePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePermissionRequest(ModifyResourcePermissionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.SecurityRule != null) {
            this.SecurityRule = new String(source.SecurityRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "SecurityRule", this.SecurityRule);

    }
}

