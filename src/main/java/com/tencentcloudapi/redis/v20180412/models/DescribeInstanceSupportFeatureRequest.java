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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSupportFeatureRequest extends AbstractModel {

    /**
    * 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 支持查询的功能特性如下所示。
- read-local-node-only：就近接入。
- multi-account：多账号管理。
- auto-failback：故障恢复场景，主节点是否开启自动回切。
    */
    @SerializedName("FeatureName")
    @Expose
    private String FeatureName;

    /**
     * Get 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 支持查询的功能特性如下所示。
- read-local-node-only：就近接入。
- multi-account：多账号管理。
- auto-failback：故障恢复场景，主节点是否开启自动回切。 
     * @return FeatureName 支持查询的功能特性如下所示。
- read-local-node-only：就近接入。
- multi-account：多账号管理。
- auto-failback：故障恢复场景，主节点是否开启自动回切。
     */
    public String getFeatureName() {
        return this.FeatureName;
    }

    /**
     * Set 支持查询的功能特性如下所示。
- read-local-node-only：就近接入。
- multi-account：多账号管理。
- auto-failback：故障恢复场景，主节点是否开启自动回切。
     * @param FeatureName 支持查询的功能特性如下所示。
- read-local-node-only：就近接入。
- multi-account：多账号管理。
- auto-failback：故障恢复场景，主节点是否开启自动回切。
     */
    public void setFeatureName(String FeatureName) {
        this.FeatureName = FeatureName;
    }

    public DescribeInstanceSupportFeatureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSupportFeatureRequest(DescribeInstanceSupportFeatureRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FeatureName != null) {
            this.FeatureName = new String(source.FeatureName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FeatureName", this.FeatureName);

    }
}

