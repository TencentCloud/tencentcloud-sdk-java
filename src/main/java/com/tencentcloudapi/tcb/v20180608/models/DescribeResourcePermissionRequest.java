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

public class DescribeResourcePermissionRequest extends AbstractModel {

    /**
    * 环境 ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表 `<br>`示例值：`table`。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源标识列表。云函数不传或传空数组、云存储传存储桶名、数据库表传表名，不能超过100条。
    */
    @SerializedName("Resources")
    @Expose
    private String [] Resources;

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
     * Get 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表 `<br>`示例值：`table`。 
     * @return ResourceType 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表 `<br>`示例值：`table`。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表 `<br>`示例值：`table`。
     * @param ResourceType 资源类型：`function`-云函数、`storage`-云存储、`table`-SQL型数据库表、`collection`-文档型数据库表 `<br>`示例值：`table`。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源标识列表。云函数不传或传空数组、云存储传存储桶名、数据库表传表名，不能超过100条。 
     * @return Resources 资源标识列表。云函数不传或传空数组、云存储传存储桶名、数据库表传表名，不能超过100条。
     */
    public String [] getResources() {
        return this.Resources;
    }

    /**
     * Set 资源标识列表。云函数不传或传空数组、云存储传存储桶名、数据库表传表名，不能超过100条。
     * @param Resources 资源标识列表。云函数不传或传空数组、云存储传存储桶名、数据库表传表名，不能超过100条。
     */
    public void setResources(String [] Resources) {
        this.Resources = Resources;
    }

    public DescribeResourcePermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePermissionRequest(DescribeResourcePermissionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Resources != null) {
            this.Resources = new String[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new String(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "Resources.", this.Resources);

    }
}

