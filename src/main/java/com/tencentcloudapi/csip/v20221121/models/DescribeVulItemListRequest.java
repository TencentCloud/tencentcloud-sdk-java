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

public class DescribeVulItemListRequest extends AbstractModel {

    /**
    * <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对漏洞名/CVE/VulID 模糊匹配）<br>Category：漏洞分类（LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY）<br>Level：威胁等级<br>VPRLevel：VPR 评级<br>Label：风险标签<br>CheckMethod：检测方式（VERSION_COMPARE/POC/VERSION_COMPARE_POC）<br>DefendStatus：漏洞防御状态（ENABLED/NOT_SUPPORTED/NOT_ENABLED）<br>SupportFix：是否支持一键修复（true/false）<br>Emergency:  紧急漏洞获取 (0/1)<br>Top5HotVul: 热点top 5 漏洞 (0/1)</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方向<br>枚举值：<br>ASC：升序<br>DESC：降序<br>默认值：DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段<br>枚举值：<br>PublishTime：漏洞披露时间<br>默认值：PublishTime</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对漏洞名/CVE/VulID 模糊匹配）<br>Category：漏洞分类（LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY）<br>Level：威胁等级<br>VPRLevel：VPR 评级<br>Label：风险标签<br>CheckMethod：检测方式（VERSION_COMPARE/POC/VERSION_COMPARE_POC）<br>DefendStatus：漏洞防御状态（ENABLED/NOT_SUPPORTED/NOT_ENABLED）<br>SupportFix：是否支持一键修复（true/false）<br>Emergency:  紧急漏洞获取 (0/1)<br>Top5HotVul: 热点top 5 漏洞 (0/1)</p> 
     * @return Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对漏洞名/CVE/VulID 模糊匹配）<br>Category：漏洞分类（LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY）<br>Level：威胁等级<br>VPRLevel：VPR 评级<br>Label：风险标签<br>CheckMethod：检测方式（VERSION_COMPARE/POC/VERSION_COMPARE_POC）<br>DefendStatus：漏洞防御状态（ENABLED/NOT_SUPPORTED/NOT_ENABLED）<br>SupportFix：是否支持一键修复（true/false）<br>Emergency:  紧急漏洞获取 (0/1)<br>Top5HotVul: 热点top 5 漏洞 (0/1)</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对漏洞名/CVE/VulID 模糊匹配）<br>Category：漏洞分类（LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY）<br>Level：威胁等级<br>VPRLevel：VPR 评级<br>Label：风险标签<br>CheckMethod：检测方式（VERSION_COMPARE/POC/VERSION_COMPARE_POC）<br>DefendStatus：漏洞防御状态（ENABLED/NOT_SUPPORTED/NOT_ENABLED）<br>SupportFix：是否支持一键修复（true/false）<br>Emergency:  紧急漏洞获取 (0/1)<br>Top5HotVul: 热点top 5 漏洞 (0/1)</p>
     * @param Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对漏洞名/CVE/VulID 模糊匹配）<br>Category：漏洞分类（LINUX/WINDOWS/WEB_CMS/APPLICATION/EMERGENCY）<br>Level：威胁等级<br>VPRLevel：VPR 评级<br>Label：风险标签<br>CheckMethod：检测方式（VERSION_COMPARE/POC/VERSION_COMPARE_POC）<br>DefendStatus：漏洞防御状态（ENABLED/NOT_SUPPORTED/NOT_ENABLED）<br>SupportFix：是否支持一键修复（true/false）<br>Emergency:  紧急漏洞获取 (0/1)<br>Top5HotVul: 热点top 5 漏洞 (0/1)</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
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
     * Get <p>排序方向<br>枚举值：<br>ASC：升序<br>DESC：降序<br>默认值：DESC</p> 
     * @return Order <p>排序方向<br>枚举值：<br>ASC：升序<br>DESC：降序<br>默认值：DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向<br>枚举值：<br>ASC：升序<br>DESC：降序<br>默认值：DESC</p>
     * @param Order <p>排序方向<br>枚举值：<br>ASC：升序<br>DESC：降序<br>默认值：DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段<br>枚举值：<br>PublishTime：漏洞披露时间<br>默认值：PublishTime</p> 
     * @return By <p>排序字段<br>枚举值：<br>PublishTime：漏洞披露时间<br>默认值：PublishTime</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段<br>枚举值：<br>PublishTime：漏洞披露时间<br>默认值：PublishTime</p>
     * @param By <p>排序字段<br>枚举值：<br>PublishTime：漏洞披露时间<br>默认值：PublishTime</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulItemListRequest(DescribeVulItemListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

