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
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
示例值：crs-asdasdas
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 功能特性名称
- read-local-node-only 就近接入功能
- multi-account 多账号功能
    */
    @SerializedName("FeatureName")
    @Expose
    private String FeatureName;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
示例值：crs-asdasdas 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
示例值：crs-asdasdas
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
示例值：crs-asdasdas
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
示例值：crs-asdasdas
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 功能特性名称
- read-local-node-only 就近接入功能
- multi-account 多账号功能 
     * @return FeatureName 功能特性名称
- read-local-node-only 就近接入功能
- multi-account 多账号功能
     */
    public String getFeatureName() {
        return this.FeatureName;
    }

    /**
     * Set 功能特性名称
- read-local-node-only 就近接入功能
- multi-account 多账号功能
     * @param FeatureName 功能特性名称
- read-local-node-only 就近接入功能
- multi-account 多账号功能
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

