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

public class DescribeBundlesRequest extends AbstractModel {

    /**
    * 套餐 ID 列表。每次请求批量套餐的上限为 100。可通过[DescribeBundles](https://cloud.tencent.com/document/product/1207/47575)接口返回值中的BundleId获取。
    */
    @SerializedName("BundleIds")
    @Expose
    private String [] BundleIds;

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
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX(Linux/Unix系统) ;WINDOWS(Windows 系统)
类型：String
必选：否
<li>bundle-type</li>按照 【套餐类型进行过滤】。
取值：GENERAL_BUNDLE (通用型套餐); STORAGE_BUNDLE(存储型套餐);ENTERPRISE_BUNDLE( 企业型套餐);EXCLUSIVE_BUNDLE(专属型套餐);BEFAST_BUNDLE(蜂驰型套餐);STARTER_BUNDLE(入门型套餐);CAREFREE_BUNDLE(无忧型套餐);RAZOR_SPEED_BUNDLE(锐驰型套餐)
类型：String
必选：否
<li>bundle-state</li>按照【套餐状态】进行过滤。
取值: ONLINE(在线); OFFLINE(下线);
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 BundleIds 和 Filters。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 可用区列表。默认为全部可用区。
<li>可用区可通过接口 [DescribeZones](https://cloud.tencent.com/document/product/1207/57513) 查询</li>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
     * Get 套餐 ID 列表。每次请求批量套餐的上限为 100。可通过[DescribeBundles](https://cloud.tencent.com/document/product/1207/47575)接口返回值中的BundleId获取。 
     * @return BundleIds 套餐 ID 列表。每次请求批量套餐的上限为 100。可通过[DescribeBundles](https://cloud.tencent.com/document/product/1207/47575)接口返回值中的BundleId获取。
     */
    public String [] getBundleIds() {
        return this.BundleIds;
    }

    /**
     * Set 套餐 ID 列表。每次请求批量套餐的上限为 100。可通过[DescribeBundles](https://cloud.tencent.com/document/product/1207/47575)接口返回值中的BundleId获取。
     * @param BundleIds 套餐 ID 列表。每次请求批量套餐的上限为 100。可通过[DescribeBundles](https://cloud.tencent.com/document/product/1207/47575)接口返回值中的BundleId获取。
     */
    public void setBundleIds(String [] BundleIds) {
        this.BundleIds = BundleIds;
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
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX(Linux/Unix系统) ;WINDOWS(Windows 系统)
类型：String
必选：否
<li>bundle-type</li>按照 【套餐类型进行过滤】。
取值：GENERAL_BUNDLE (通用型套餐); STORAGE_BUNDLE(存储型套餐);ENTERPRISE_BUNDLE( 企业型套餐);EXCLUSIVE_BUNDLE(专属型套餐);BEFAST_BUNDLE(蜂驰型套餐);STARTER_BUNDLE(入门型套餐);CAREFREE_BUNDLE(无忧型套餐);RAZOR_SPEED_BUNDLE(锐驰型套餐)
类型：String
必选：否
<li>bundle-state</li>按照【套餐状态】进行过滤。
取值: ONLINE(在线); OFFLINE(下线);
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 BundleIds 和 Filters。 
     * @return Filters 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX(Linux/Unix系统) ;WINDOWS(Windows 系统)
类型：String
必选：否
<li>bundle-type</li>按照 【套餐类型进行过滤】。
取值：GENERAL_BUNDLE (通用型套餐); STORAGE_BUNDLE(存储型套餐);ENTERPRISE_BUNDLE( 企业型套餐);EXCLUSIVE_BUNDLE(专属型套餐);BEFAST_BUNDLE(蜂驰型套餐);STARTER_BUNDLE(入门型套餐);CAREFREE_BUNDLE(无忧型套餐);RAZOR_SPEED_BUNDLE(锐驰型套餐)
类型：String
必选：否
<li>bundle-state</li>按照【套餐状态】进行过滤。
取值: ONLINE(在线); OFFLINE(下线);
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 BundleIds 和 Filters。
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
取值： LINUX_UNIX(Linux/Unix系统) ;WINDOWS(Windows 系统)
类型：String
必选：否
<li>bundle-type</li>按照 【套餐类型进行过滤】。
取值：GENERAL_BUNDLE (通用型套餐); STORAGE_BUNDLE(存储型套餐);ENTERPRISE_BUNDLE( 企业型套餐);EXCLUSIVE_BUNDLE(专属型套餐);BEFAST_BUNDLE(蜂驰型套餐);STARTER_BUNDLE(入门型套餐);CAREFREE_BUNDLE(无忧型套餐);RAZOR_SPEED_BUNDLE(锐驰型套餐)
类型：String
必选：否
<li>bundle-state</li>按照【套餐状态】进行过滤。
取值: ONLINE(在线); OFFLINE(下线);
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 BundleIds 和 Filters。
     * @param Filters 过滤器列表。
<li>bundle-id</li>按照【套餐 ID】进行过滤。
类型：String
必选：否
<li>support-platform-type</li>按照【系统类型】进行过滤。
取值： LINUX_UNIX(Linux/Unix系统) ;WINDOWS(Windows 系统)
类型：String
必选：否
<li>bundle-type</li>按照 【套餐类型进行过滤】。
取值：GENERAL_BUNDLE (通用型套餐); STORAGE_BUNDLE(存储型套餐);ENTERPRISE_BUNDLE( 企业型套餐);EXCLUSIVE_BUNDLE(专属型套餐);BEFAST_BUNDLE(蜂驰型套餐);STARTER_BUNDLE(入门型套餐);CAREFREE_BUNDLE(无忧型套餐);RAZOR_SPEED_BUNDLE(锐驰型套餐)
类型：String
必选：否
<li>bundle-state</li>按照【套餐状态】进行过滤。
取值: ONLINE(在线); OFFLINE(下线);
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 BundleIds 和 Filters。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 可用区列表。默认为全部可用区。
<li>可用区可通过接口 [DescribeZones](https://cloud.tencent.com/document/product/1207/57513) 查询</li> 
     * @return Zones 可用区列表。默认为全部可用区。
<li>可用区可通过接口 [DescribeZones](https://cloud.tencent.com/document/product/1207/57513) 查询</li>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区列表。默认为全部可用区。
<li>可用区可通过接口 [DescribeZones](https://cloud.tencent.com/document/product/1207/57513) 查询</li>
     * @param Zones 可用区列表。默认为全部可用区。
<li>可用区可通过接口 [DescribeZones](https://cloud.tencent.com/document/product/1207/57513) 查询</li>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    public DescribeBundlesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBundlesRequest(DescribeBundlesRequest source) {
        if (source.BundleIds != null) {
            this.BundleIds = new String[source.BundleIds.length];
            for (int i = 0; i < source.BundleIds.length; i++) {
                this.BundleIds[i] = new String(source.BundleIds[i]);
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
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BundleIds.", this.BundleIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);

    }
}

