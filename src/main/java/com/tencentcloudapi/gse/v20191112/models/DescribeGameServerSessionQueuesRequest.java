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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGameServerSessionQueuesRequest extends AbstractModel{

    /**
    * 游戏服务器会话队列名称数组，单个名字长度1~128
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 结果返回最大数量，最小值0，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回结果偏移，最小值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 资源过滤字段，可以按照资源名称、资源ID和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（游戏服务器会话队列支持多个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 游戏服务器会话队列名称数组，单个名字长度1~128 
     * @return Names 游戏服务器会话队列名称数组，单个名字长度1~128
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 游戏服务器会话队列名称数组，单个名字长度1~128
     * @param Names 游戏服务器会话队列名称数组，单个名字长度1~128
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 结果返回最大数量，最小值0，最大值100 
     * @return Limit 结果返回最大数量，最小值0，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 结果返回最大数量，最小值0，最大值100
     * @param Limit 结果返回最大数量，最小值0，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回结果偏移，最小值0 
     * @return Offset 返回结果偏移，最小值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回结果偏移，最小值0
     * @param Offset 返回结果偏移，最小值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 资源过滤字段，可以按照资源名称、资源ID和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（游戏服务器会话队列支持多个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"] 
     * @return Filters 资源过滤字段，可以按照资源名称、资源ID和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（游戏服务器会话队列支持多个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 资源过滤字段，可以按照资源名称、资源ID和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（游戏服务器会话队列支持多个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
     * @param Filters 资源过滤字段，可以按照资源名称、资源ID和标签进行过滤- 资源名称过滤    - Key: 固定字符串 "resource:name"    - Values: 资源名称数组（游戏服务器会话队列支持多个名称的过滤）- 标签过滤    - 通过标签键过滤        - Key: 固定字符串 "tag:key"        - Values 不传    - 通过标签键值过滤        - Key: 固定字符串 "tag:key-value"        - Values: 标签键值对数组，例如 ["key1:value1", "key1:value2", "key2:value2"]
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeGameServerSessionQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGameServerSessionQueuesRequest(DescribeGameServerSessionQueuesRequest source) {
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

