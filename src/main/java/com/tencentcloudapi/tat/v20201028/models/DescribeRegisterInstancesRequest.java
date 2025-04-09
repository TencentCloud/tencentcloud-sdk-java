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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegisterInstancesRequest extends AbstractModel {

    /**
    * 托管实例 id。

参数不支持同时指定 `InstanceIds` 和 `Filters` 。

    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 过滤器列表。参数不支持同时指定 `InstanceIds` 和 `Filters` 。


- instance-name

按照【托管实例名称】进行过滤。
类型：String
必选：否

- instance-id

按照【托管实例ID】进行过滤。
类型：String
必选：否

- register-code-id

按照【托管实例注册码ID】进行过滤。可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
类型：String
必选：否

- sys-name

按照【操作系统类型】进行过滤，取值：Linux | Windows。
类型：String
必选：否

- tag-key

按照【标签键】进行过滤。
类型：String
必选：否

- tag-value

按照【标签值】进行过滤。
类型：String
必选：否

- tag:tag-key

按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
类型：String
必选：否

例如 Filter 为 {"Name": "tag:key1", "Values": ["v1", "v2"] } ，即查询所有标签为 key1:v1 或 key1:v2 的资源。


    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 托管实例 id。

参数不支持同时指定 `InstanceIds` 和 `Filters` 。
 
     * @return InstanceIds 托管实例 id。

参数不支持同时指定 `InstanceIds` 和 `Filters` 。

     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 托管实例 id。

参数不支持同时指定 `InstanceIds` 和 `Filters` 。

     * @param InstanceIds 托管实例 id。

参数不支持同时指定 `InstanceIds` 和 `Filters` 。

     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 过滤器列表。参数不支持同时指定 `InstanceIds` 和 `Filters` 。


- instance-name

按照【托管实例名称】进行过滤。
类型：String
必选：否

- instance-id

按照【托管实例ID】进行过滤。
类型：String
必选：否

- register-code-id

按照【托管实例注册码ID】进行过滤。可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
类型：String
必选：否

- sys-name

按照【操作系统类型】进行过滤，取值：Linux | Windows。
类型：String
必选：否

- tag-key

按照【标签键】进行过滤。
类型：String
必选：否

- tag-value

按照【标签值】进行过滤。
类型：String
必选：否

- tag:tag-key

按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
类型：String
必选：否

例如 Filter 为 {"Name": "tag:key1", "Values": ["v1", "v2"] } ，即查询所有标签为 key1:v1 或 key1:v2 的资源。

 
     * @return Filters 过滤器列表。参数不支持同时指定 `InstanceIds` 和 `Filters` 。


- instance-name

按照【托管实例名称】进行过滤。
类型：String
必选：否

- instance-id

按照【托管实例ID】进行过滤。
类型：String
必选：否

- register-code-id

按照【托管实例注册码ID】进行过滤。可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
类型：String
必选：否

- sys-name

按照【操作系统类型】进行过滤，取值：Linux | Windows。
类型：String
必选：否

- tag-key

按照【标签键】进行过滤。
类型：String
必选：否

- tag-value

按照【标签值】进行过滤。
类型：String
必选：否

- tag:tag-key

按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
类型：String
必选：否

例如 Filter 为 {"Name": "tag:key1", "Values": ["v1", "v2"] } ，即查询所有标签为 key1:v1 或 key1:v2 的资源。


     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器列表。参数不支持同时指定 `InstanceIds` 和 `Filters` 。


- instance-name

按照【托管实例名称】进行过滤。
类型：String
必选：否

- instance-id

按照【托管实例ID】进行过滤。
类型：String
必选：否

- register-code-id

按照【托管实例注册码ID】进行过滤。可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
类型：String
必选：否

- sys-name

按照【操作系统类型】进行过滤，取值：Linux | Windows。
类型：String
必选：否

- tag-key

按照【标签键】进行过滤。
类型：String
必选：否

- tag-value

按照【标签值】进行过滤。
类型：String
必选：否

- tag:tag-key

按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
类型：String
必选：否

例如 Filter 为 {"Name": "tag:key1", "Values": ["v1", "v2"] } ，即查询所有标签为 key1:v1 或 key1:v2 的资源。


     * @param Filters 过滤器列表。参数不支持同时指定 `InstanceIds` 和 `Filters` 。


- instance-name

按照【托管实例名称】进行过滤。
类型：String
必选：否

- instance-id

按照【托管实例ID】进行过滤。
类型：String
必选：否

- register-code-id

按照【托管实例注册码ID】进行过滤。可通过 [DescribeRegisterCodes(查询注册码)](https://cloud.tencent.com/document/api/1340/96925) 接口获取。
类型：String
必选：否

- sys-name

按照【操作系统类型】进行过滤，取值：Linux | Windows。
类型：String
必选：否

- tag-key

按照【标签键】进行过滤。
类型：String
必选：否

- tag-value

按照【标签值】进行过滤。
类型：String
必选：否

- tag:tag-key

按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
类型：String
必选：否

例如 Filter 为 {"Name": "tag:key1", "Values": ["v1", "v2"] } ，即查询所有标签为 key1:v1 或 key1:v2 的资源。


     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRegisterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegisterInstancesRequest(DescribeRegisterInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

