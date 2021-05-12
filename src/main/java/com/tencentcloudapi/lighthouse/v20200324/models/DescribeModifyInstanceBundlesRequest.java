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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModifyInstanceBundlesRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。 
     * @return Filters 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
     * @param Filters 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX（Linux/Unix系统）；WINDOWS（Windows 系统）
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

    public DescribeModifyInstanceBundlesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModifyInstanceBundlesRequest(DescribeModifyInstanceBundlesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

