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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixedListRequest extends AbstractModel {

    /**
    * <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按关键字搜索（漏洞名称/CVE编号/主机名称/实例ID）<br>VulName - 模糊匹配，按漏洞名称搜索<br>Level - 精确匹配，按漏洞等级筛选：LOW-低危 MEDIUM-中危 HIGH-高危 CRITICAL-严重<br>VprLevel - 精确匹配，按VPR评级筛选：1-Low 2-Medium 3-High 4-Critical<br>VulCategory - 精确匹配，按漏洞类型筛选：LINUX-Linux软件漏洞 WINDOWS-Windows系统补丁漏洞 WEB_CMS-Web-CMS漏洞 APPLICATION-应用漏洞 EMERGENCY-应急漏洞<br>MachineName - 模糊匹配，按主机名称搜索<br>InstanceId - 模糊匹配，按实例ID搜索<br>FixTime - 范围匹配，修复时间范围，传入两个值表示起止时间</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>排序字段<br>枚举值：<br>FixTime：按修复时间排序<br>VulName：按漏洞名称排序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p> 
     * @return Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     * @param Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p> 
     * @return Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     * @param Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按关键字搜索（漏洞名称/CVE编号/主机名称/实例ID）<br>VulName - 模糊匹配，按漏洞名称搜索<br>Level - 精确匹配，按漏洞等级筛选：LOW-低危 MEDIUM-中危 HIGH-高危 CRITICAL-严重<br>VprLevel - 精确匹配，按VPR评级筛选：1-Low 2-Medium 3-High 4-Critical<br>VulCategory - 精确匹配，按漏洞类型筛选：LINUX-Linux软件漏洞 WINDOWS-Windows系统补丁漏洞 WEB_CMS-Web-CMS漏洞 APPLICATION-应用漏洞 EMERGENCY-应急漏洞<br>MachineName - 模糊匹配，按主机名称搜索<br>InstanceId - 模糊匹配，按实例ID搜索<br>FixTime - 范围匹配，修复时间范围，传入两个值表示起止时间</p> 
     * @return Filters <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按关键字搜索（漏洞名称/CVE编号/主机名称/实例ID）<br>VulName - 模糊匹配，按漏洞名称搜索<br>Level - 精确匹配，按漏洞等级筛选：LOW-低危 MEDIUM-中危 HIGH-高危 CRITICAL-严重<br>VprLevel - 精确匹配，按VPR评级筛选：1-Low 2-Medium 3-High 4-Critical<br>VulCategory - 精确匹配，按漏洞类型筛选：LINUX-Linux软件漏洞 WINDOWS-Windows系统补丁漏洞 WEB_CMS-Web-CMS漏洞 APPLICATION-应用漏洞 EMERGENCY-应急漏洞<br>MachineName - 模糊匹配，按主机名称搜索<br>InstanceId - 模糊匹配，按实例ID搜索<br>FixTime - 范围匹配，修复时间范围，传入两个值表示起止时间</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按关键字搜索（漏洞名称/CVE编号/主机名称/实例ID）<br>VulName - 模糊匹配，按漏洞名称搜索<br>Level - 精确匹配，按漏洞等级筛选：LOW-低危 MEDIUM-中危 HIGH-高危 CRITICAL-严重<br>VprLevel - 精确匹配，按VPR评级筛选：1-Low 2-Medium 3-High 4-Critical<br>VulCategory - 精确匹配，按漏洞类型筛选：LINUX-Linux软件漏洞 WINDOWS-Windows系统补丁漏洞 WEB_CMS-Web-CMS漏洞 APPLICATION-应用漏洞 EMERGENCY-应急漏洞<br>MachineName - 模糊匹配，按主机名称搜索<br>InstanceId - 模糊匹配，按实例ID搜索<br>FixTime - 范围匹配，修复时间范围，传入两个值表示起止时间</p>
     * @param Filters <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按关键字搜索（漏洞名称/CVE编号/主机名称/实例ID）<br>VulName - 模糊匹配，按漏洞名称搜索<br>Level - 精确匹配，按漏洞等级筛选：LOW-低危 MEDIUM-中危 HIGH-高危 CRITICAL-严重<br>VprLevel - 精确匹配，按VPR评级筛选：1-Low 2-Medium 3-High 4-Critical<br>VulCategory - 精确匹配，按漏洞类型筛选：LINUX-Linux软件漏洞 WINDOWS-Windows系统补丁漏洞 WEB_CMS-Web-CMS漏洞 APPLICATION-应用漏洞 EMERGENCY-应急漏洞<br>MachineName - 模糊匹配，按主机名称搜索<br>InstanceId - 模糊匹配，按实例ID搜索<br>FixTime - 范围匹配，修复时间范围，传入两个值表示起止时间</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段<br>枚举值：<br>FixTime：按修复时间排序<br>VulName：按漏洞名称排序</p> 
     * @return Order <p>排序字段<br>枚举值：<br>FixTime：按修复时间排序<br>VulName：按漏洞名称排序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序字段<br>枚举值：<br>FixTime：按修复时间排序<br>VulName：按漏洞名称排序</p>
     * @param Order <p>排序字段<br>枚举值：<br>FixTime：按修复时间排序<br>VulName：按漏洞名称排序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p> 
     * @return By <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     * @param By <p>排序方式<br>枚举值：<br>asc：升序<br>desc：降序<br>默认值：desc</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeVulFixedListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixedListRequest(DescribeVulFixedListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

