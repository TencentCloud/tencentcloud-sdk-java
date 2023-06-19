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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceVersionRequest extends AbstractModel{

    /**
    * 目标实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的**TypeId**，即实例要变更的目标类型。
- Redis 4.0 及以上的版本，支持相同版本的实例从标准架构升级至集群架构，例如，支持 Redis 4.0 标准架构升级至 Redis 4.0 集群架构。
- 不支持跨版本架构升级，例如，Redis 4.0 标准架构升级至 Redis 5.0 集群架构。
- 不支持 Redis 2.8 版本升级架构。
- 不支持从集群架构降级至标准架构。

    */
    @SerializedName("TargetInstanceType")
    @Expose
    private String TargetInstanceType;

    /**
    * 切换时间。
- 1：维护时间窗切换。
- 2：立即切换。
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
    * 指定实例 ID。例如：crs-xjhsdj****，请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 目标实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的**TypeId**，即实例要变更的目标类型。
- Redis 4.0 及以上的版本，支持相同版本的实例从标准架构升级至集群架构，例如，支持 Redis 4.0 标准架构升级至 Redis 4.0 集群架构。
- 不支持跨版本架构升级，例如，Redis 4.0 标准架构升级至 Redis 5.0 集群架构。
- 不支持 Redis 2.8 版本升级架构。
- 不支持从集群架构降级至标准架构。
 
     * @return TargetInstanceType 目标实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的**TypeId**，即实例要变更的目标类型。
- Redis 4.0 及以上的版本，支持相同版本的实例从标准架构升级至集群架构，例如，支持 Redis 4.0 标准架构升级至 Redis 4.0 集群架构。
- 不支持跨版本架构升级，例如，Redis 4.0 标准架构升级至 Redis 5.0 集群架构。
- 不支持 Redis 2.8 版本升级架构。
- 不支持从集群架构降级至标准架构。

     */
    public String getTargetInstanceType() {
        return this.TargetInstanceType;
    }

    /**
     * Set 目标实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的**TypeId**，即实例要变更的目标类型。
- Redis 4.0 及以上的版本，支持相同版本的实例从标准架构升级至集群架构，例如，支持 Redis 4.0 标准架构升级至 Redis 4.0 集群架构。
- 不支持跨版本架构升级，例如，Redis 4.0 标准架构升级至 Redis 5.0 集群架构。
- 不支持 Redis 2.8 版本升级架构。
- 不支持从集群架构降级至标准架构。

     * @param TargetInstanceType 目标实例类型，同 [CreateInstances](https://cloud.tencent.com/document/api/239/20026) 的**TypeId**，即实例要变更的目标类型。
- Redis 4.0 及以上的版本，支持相同版本的实例从标准架构升级至集群架构，例如，支持 Redis 4.0 标准架构升级至 Redis 4.0 集群架构。
- 不支持跨版本架构升级，例如，Redis 4.0 标准架构升级至 Redis 5.0 集群架构。
- 不支持 Redis 2.8 版本升级架构。
- 不支持从集群架构降级至标准架构。

     */
    public void setTargetInstanceType(String TargetInstanceType) {
        this.TargetInstanceType = TargetInstanceType;
    }

    /**
     * Get 切换时间。
- 1：维护时间窗切换。
- 2：立即切换。 
     * @return SwitchOption 切换时间。
- 1：维护时间窗切换。
- 2：立即切换。
     */
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set 切换时间。
- 1：维护时间窗切换。
- 2：立即切换。
     * @param SwitchOption 切换时间。
- 1：维护时间窗切换。
- 2：立即切换。
     */
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****，请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****，请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****，请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****，请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public UpgradeInstanceVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceVersionRequest(UpgradeInstanceVersionRequest source) {
        if (source.TargetInstanceType != null) {
            this.TargetInstanceType = new String(source.TargetInstanceType);
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetInstanceType", this.TargetInstanceType);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

