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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerRouteConfigsRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>批量查询的路由配置列表</p><p>入参限制：批量上限为 32 条</p>
    */
    @SerializedName("Configs")
    @Expose
    private ConsumerRouteKey [] Configs;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>批量查询的路由配置列表</p><p>入参限制：批量上限为 32 条</p> 
     * @return Configs <p>批量查询的路由配置列表</p><p>入参限制：批量上限为 32 条</p>
     */
    public ConsumerRouteKey [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set <p>批量查询的路由配置列表</p><p>入参限制：批量上限为 32 条</p>
     * @param Configs <p>批量查询的路由配置列表</p><p>入参限制：批量上限为 32 条</p>
     */
    public void setConfigs(ConsumerRouteKey [] Configs) {
        this.Configs = Configs;
    }

    public DescribeConsumerRouteConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerRouteConfigsRequest(DescribeConsumerRouteConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Configs != null) {
            this.Configs = new ConsumerRouteKey[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new ConsumerRouteKey(source.Configs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Configs.", this.Configs);

    }
}

