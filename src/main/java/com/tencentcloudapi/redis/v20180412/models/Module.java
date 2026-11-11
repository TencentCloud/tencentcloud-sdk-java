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

public class Module extends AbstractModel {

    /**
    * <p>Redis 支持的扩展模块，包括 Bloom、JSON、Search 和 TimeSeries，可以为 Redis 提供额外的功能支持。</p><ul><li>Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li><li>TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。</li><li>ValkeyBloom：指Valkey引擎的RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>ValkeyJSON：指Valkey引擎的RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>ValkeySearch：指Valkey引擎的RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>扩展模块的启用状态。</p><ul><li>ON：启用。</li><li>OFF：关闭。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例是否支持参数 Name 对应的扩展模块。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
    */
    @SerializedName("IsSupport")
    @Expose
    private Boolean IsSupport;

    /**
     * Get <p>Redis 支持的扩展模块，包括 Bloom、JSON、Search 和 TimeSeries，可以为 Redis 提供额外的功能支持。</p><ul><li>Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li><li>TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。</li><li>ValkeyBloom：指Valkey引擎的RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>ValkeyJSON：指Valkey引擎的RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>ValkeySearch：指Valkey引擎的RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li></ul> 
     * @return Name <p>Redis 支持的扩展模块，包括 Bloom、JSON、Search 和 TimeSeries，可以为 Redis 提供额外的功能支持。</p><ul><li>Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li><li>TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。</li><li>ValkeyBloom：指Valkey引擎的RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>ValkeyJSON：指Valkey引擎的RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>ValkeySearch：指Valkey引擎的RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Redis 支持的扩展模块，包括 Bloom、JSON、Search 和 TimeSeries，可以为 Redis 提供额外的功能支持。</p><ul><li>Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li><li>TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。</li><li>ValkeyBloom：指Valkey引擎的RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>ValkeyJSON：指Valkey引擎的RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>ValkeySearch：指Valkey引擎的RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li></ul>
     * @param Name <p>Redis 支持的扩展模块，包括 Bloom、JSON、Search 和 TimeSeries，可以为 Redis 提供额外的功能支持。</p><ul><li>Bloom：指 RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>JSON：指 RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>Search：指 RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li><li>TimeSeries：指 RedisTimeSeries 模块，专门用于处理时间序列数据，适合存储和查询时间相关的数据。</li><li>ValkeyBloom：指Valkey引擎的RedisBloom 模块，可以高效地判断一个元素是否存在于集合中。</li><li>ValkeyJSON：指Valkey引擎的RedisJSON 模块，允许 Redis 原生支持 JSON 数据格式，方便存储和操作 JSON 对象。</li><li>ValkeySearch：指Valkey引擎的RediSearch 模块，提供全文搜索功能，可以对存储在 Redis 中的数据进行高效的搜索操作。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>扩展模块的启用状态。</p><ul><li>ON：启用。</li><li>OFF：关闭。</li></ul> 
     * @return Status <p>扩展模块的启用状态。</p><ul><li>ON：启用。</li><li>OFF：关闭。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>扩展模块的启用状态。</p><ul><li>ON：启用。</li><li>OFF：关闭。</li></ul>
     * @param Status <p>扩展模块的启用状态。</p><ul><li>ON：启用。</li><li>OFF：关闭。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例是否支持参数 Name 对应的扩展模块。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul> 
     * @return IsSupport <p>实例是否支持参数 Name 对应的扩展模块。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
     */
    public Boolean getIsSupport() {
        return this.IsSupport;
    }

    /**
     * Set <p>实例是否支持参数 Name 对应的扩展模块。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
     * @param IsSupport <p>实例是否支持参数 Name 对应的扩展模块。</p><ul><li>true：支持。</li><li>false：不支持。</li></ul>
     */
    public void setIsSupport(Boolean IsSupport) {
        this.IsSupport = IsSupport;
    }

    public Module() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Module(Module source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsSupport != null) {
            this.IsSupport = new Boolean(source.IsSupport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsSupport", this.IsSupport);

    }
}

