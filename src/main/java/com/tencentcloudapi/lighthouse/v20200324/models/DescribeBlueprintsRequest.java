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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlueprintsRequest extends AbstractModel {

    /**
    * 镜像 ID 列表。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。列表长度最大值为100。
    */
    @SerializedName("BlueprintIds")
    @Expose
    private String [] BlueprintIds;

    /**
    * 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤器列表。
<li>blueprint-id</li>按照【镜像 ID】进行过滤。
类型：String
必选：否
镜像 ID ，可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。
<li>blueprint-type</li>按照【镜像类型】进行过滤。
取值：APP_OS（应用镜像 ）；PURE_OS（系统镜像）；DOCKER（Docker容器镜像）；PRIVATE（自定义镜像）；SHARED（共享镜像）。
类型：String
必选：否
<li>platform-type</li>按照【镜像平台类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）。
类型：String
必选：否
<li>blueprint-name</li>按照【镜像名称】进行过滤。
类型：String
必选：否
<li>blueprint-state</li>按照【镜像状态】进行过滤。
类型：String
必选：否
镜像状态，可通过[数据结构Blueprint](https://cloud.tencent.com/document/api/1207/47576#Blueprint)中的BlueprintState来获取。
<li>scene-id</li>按照【使用场景Id】进行过滤。
类型：String
必选：否
场景Id，可通过[查看使用场景列表](https://cloud.tencent.com/document/product/1207/83512)接口获取。
<li>tag-key</li>
按照【标签键】进行过滤。 类型：String 必选：否
<li>tag-value</li>
按照【标签值】进行过滤。 类型：String 必选：否
<li>tag:tag-key</li>
按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 BlueprintIds (可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取BlueprintId)和 Filters 。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 镜像 ID 列表。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。列表长度最大值为100。 
     * @return BlueprintIds 镜像 ID 列表。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。列表长度最大值为100。
     */
    public String [] getBlueprintIds() {
        return this.BlueprintIds;
    }

    /**
     * Set 镜像 ID 列表。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。列表长度最大值为100。
     * @param BlueprintIds 镜像 ID 列表。可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。列表长度最大值为100。
     */
    public void setBlueprintIds(String [] BlueprintIds) {
        this.BlueprintIds = BlueprintIds;
    }

    /**
     * Get 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。 
     * @return Offset 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     * @param Offset 偏移量，默认为 0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。 
     * @return Limit 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     * @param Limit 返回数量，默认为 20，最大值为 100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/product/1207/47578)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤器列表。
<li>blueprint-id</li>按照【镜像 ID】进行过滤。
类型：String
必选：否
镜像 ID ，可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。
<li>blueprint-type</li>按照【镜像类型】进行过滤。
取值：APP_OS（应用镜像 ）；PURE_OS（系统镜像）；DOCKER（Docker容器镜像）；PRIVATE（自定义镜像）；SHARED（共享镜像）。
类型：String
必选：否
<li>platform-type</li>按照【镜像平台类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）。
类型：String
必选：否
<li>blueprint-name</li>按照【镜像名称】进行过滤。
类型：String
必选：否
<li>blueprint-state</li>按照【镜像状态】进行过滤。
类型：String
必选：否
镜像状态，可通过[数据结构Blueprint](https://cloud.tencent.com/document/api/1207/47576#Blueprint)中的BlueprintState来获取。
<li>scene-id</li>按照【使用场景Id】进行过滤。
类型：String
必选：否
场景Id，可通过[查看使用场景列表](https://cloud.tencent.com/document/product/1207/83512)接口获取。
<li>tag-key</li>
按照【标签键】进行过滤。 类型：String 必选：否
<li>tag-value</li>
按照【标签值】进行过滤。 类型：String 必选：否
<li>tag:tag-key</li>
按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 BlueprintIds (可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取BlueprintId)和 Filters 。 
     * @return Filters 过滤器列表。
<li>blueprint-id</li>按照【镜像 ID】进行过滤。
类型：String
必选：否
镜像 ID ，可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。
<li>blueprint-type</li>按照【镜像类型】进行过滤。
取值：APP_OS（应用镜像 ）；PURE_OS（系统镜像）；DOCKER（Docker容器镜像）；PRIVATE（自定义镜像）；SHARED（共享镜像）。
类型：String
必选：否
<li>platform-type</li>按照【镜像平台类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）。
类型：String
必选：否
<li>blueprint-name</li>按照【镜像名称】进行过滤。
类型：String
必选：否
<li>blueprint-state</li>按照【镜像状态】进行过滤。
类型：String
必选：否
镜像状态，可通过[数据结构Blueprint](https://cloud.tencent.com/document/api/1207/47576#Blueprint)中的BlueprintState来获取。
<li>scene-id</li>按照【使用场景Id】进行过滤。
类型：String
必选：否
场景Id，可通过[查看使用场景列表](https://cloud.tencent.com/document/product/1207/83512)接口获取。
<li>tag-key</li>
按照【标签键】进行过滤。 类型：String 必选：否
<li>tag-value</li>
按照【标签值】进行过滤。 类型：String 必选：否
<li>tag:tag-key</li>
按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 BlueprintIds (可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取BlueprintId)和 Filters 。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器列表。
<li>blueprint-id</li>按照【镜像 ID】进行过滤。
类型：String
必选：否
镜像 ID ，可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。
<li>blueprint-type</li>按照【镜像类型】进行过滤。
取值：APP_OS（应用镜像 ）；PURE_OS（系统镜像）；DOCKER（Docker容器镜像）；PRIVATE（自定义镜像）；SHARED（共享镜像）。
类型：String
必选：否
<li>platform-type</li>按照【镜像平台类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）。
类型：String
必选：否
<li>blueprint-name</li>按照【镜像名称】进行过滤。
类型：String
必选：否
<li>blueprint-state</li>按照【镜像状态】进行过滤。
类型：String
必选：否
镜像状态，可通过[数据结构Blueprint](https://cloud.tencent.com/document/api/1207/47576#Blueprint)中的BlueprintState来获取。
<li>scene-id</li>按照【使用场景Id】进行过滤。
类型：String
必选：否
场景Id，可通过[查看使用场景列表](https://cloud.tencent.com/document/product/1207/83512)接口获取。
<li>tag-key</li>
按照【标签键】进行过滤。 类型：String 必选：否
<li>tag-value</li>
按照【标签值】进行过滤。 类型：String 必选：否
<li>tag:tag-key</li>
按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 BlueprintIds (可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取BlueprintId)和 Filters 。
     * @param Filters 过滤器列表。
<li>blueprint-id</li>按照【镜像 ID】进行过滤。
类型：String
必选：否
镜像 ID ，可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取。
<li>blueprint-type</li>按照【镜像类型】进行过滤。
取值：APP_OS（应用镜像 ）；PURE_OS（系统镜像）；DOCKER（Docker容器镜像）；PRIVATE（自定义镜像）；SHARED（共享镜像）。
类型：String
必选：否
<li>platform-type</li>按照【镜像平台类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）。
类型：String
必选：否
<li>blueprint-name</li>按照【镜像名称】进行过滤。
类型：String
必选：否
<li>blueprint-state</li>按照【镜像状态】进行过滤。
类型：String
必选：否
镜像状态，可通过[数据结构Blueprint](https://cloud.tencent.com/document/api/1207/47576#Blueprint)中的BlueprintState来获取。
<li>scene-id</li>按照【使用场景Id】进行过滤。
类型：String
必选：否
场景Id，可通过[查看使用场景列表](https://cloud.tencent.com/document/product/1207/83512)接口获取。
<li>tag-key</li>
按照【标签键】进行过滤。 类型：String 必选：否
<li>tag-value</li>
按照【标签值】进行过滤。 类型：String 必选：否
<li>tag:tag-key</li>
按照【标签键值对】进行过滤。 tag-key使用具体的标签键进行替换。
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 100。参数不支持同时指定 BlueprintIds (可通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回值字段BlueprintSet获取BlueprintId)和 Filters 。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBlueprintsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlueprintsRequest(DescribeBlueprintsRequest source) {
        if (source.BlueprintIds != null) {
            this.BlueprintIds = new String[source.BlueprintIds.length];
            for (int i = 0; i < source.BlueprintIds.length; i++) {
                this.BlueprintIds[i] = new String(source.BlueprintIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArraySimple(map, prefix + "BlueprintIds.", this.BlueprintIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

