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

public class ModifyModuleRequest extends AbstractModel {

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定待修改的扩展模块。Redis 支持修改如下扩展模块的状态。
- Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。
- JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。
- Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。
- TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设置扩展模块的启用状态。仅支持设置为 ON，启用扩展模块。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定待修改的扩展模块。Redis 支持修改如下扩展模块的状态。
- Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。
- JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。
- Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。
- TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。 
     * @return Name 指定待修改的扩展模块。Redis 支持修改如下扩展模块的状态。
- Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。
- JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。
- Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。
- TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指定待修改的扩展模块。Redis 支持修改如下扩展模块的状态。
- Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。
- JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。
- Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。
- TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。
     * @param Name 指定待修改的扩展模块。Redis 支持修改如下扩展模块的状态。
- Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。
- JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。
- Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。
- TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设置扩展模块的启用状态。仅支持设置为 ON，启用扩展模块。 
     * @return Status 设置扩展模块的启用状态。仅支持设置为 ON，启用扩展模块。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设置扩展模块的启用状态。仅支持设置为 ON，启用扩展模块。
     * @param Status 设置扩展模块的启用状态。仅支持设置为 ON，启用扩展模块。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyModuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleRequest(ModifyModuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

