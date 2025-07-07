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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulListRequest extends AbstractModel {

    /**
    * 返回数量，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。<li>Status - String - 是否必填：否 - 处理状态  0-待处理 1-已加白 2-已删除 3-已修复 5-检测中 6-修复中 8-修复失败</li><li>ModifyTime - String - 是否必填：否 - 最近发生时间</li><li>Uuid- String - 是否必填：否 - 主机uuid查询</li><li>VulName- string -</li><li>VulCategory- string - 是否必填：否 - 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞</li><li>IsSupportDefense - int- 是否必填：否 - 是否支持防御 0:不支持 1:支持</li><li>Labels- string- 是否必填：否 - 标签搜索</li><li>IsSupportAutoFix- string- 是否必填：否 - 是否支持自动修复 0:不支持 1:支持</li><li>CvssScore- string- 是否必填：否 - CvssScore大于多少</li><li>AttackLevel- string- 是否必填：否 - 攻击热度大于多少</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 可选排序字段 Level，LastTime，HostCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序顺序：desc  默认asc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 返回数量，最大值为100。 
     * @return Limit 返回数量，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，最大值为100。
     * @param Limit 返回数量，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。<li>Status - String - 是否必填：否 - 处理状态  0-待处理 1-已加白 2-已删除 3-已修复 5-检测中 6-修复中 8-修复失败</li><li>ModifyTime - String - 是否必填：否 - 最近发生时间</li><li>Uuid- String - 是否必填：否 - 主机uuid查询</li><li>VulName- string -</li><li>VulCategory- string - 是否必填：否 - 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞</li><li>IsSupportDefense - int- 是否必填：否 - 是否支持防御 0:不支持 1:支持</li><li>Labels- string- 是否必填：否 - 标签搜索</li><li>IsSupportAutoFix- string- 是否必填：否 - 是否支持自动修复 0:不支持 1:支持</li><li>CvssScore- string- 是否必填：否 - CvssScore大于多少</li><li>AttackLevel- string- 是否必填：否 - 攻击热度大于多少</li> 
     * @return Filters 过滤条件。<li>Status - String - 是否必填：否 - 处理状态  0-待处理 1-已加白 2-已删除 3-已修复 5-检测中 6-修复中 8-修复失败</li><li>ModifyTime - String - 是否必填：否 - 最近发生时间</li><li>Uuid- String - 是否必填：否 - 主机uuid查询</li><li>VulName- string -</li><li>VulCategory- string - 是否必填：否 - 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞</li><li>IsSupportDefense - int- 是否必填：否 - 是否支持防御 0:不支持 1:支持</li><li>Labels- string- 是否必填：否 - 标签搜索</li><li>IsSupportAutoFix- string- 是否必填：否 - 是否支持自动修复 0:不支持 1:支持</li><li>CvssScore- string- 是否必填：否 - CvssScore大于多少</li><li>AttackLevel- string- 是否必填：否 - 攻击热度大于多少</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。<li>Status - String - 是否必填：否 - 处理状态  0-待处理 1-已加白 2-已删除 3-已修复 5-检测中 6-修复中 8-修复失败</li><li>ModifyTime - String - 是否必填：否 - 最近发生时间</li><li>Uuid- String - 是否必填：否 - 主机uuid查询</li><li>VulName- string -</li><li>VulCategory- string - 是否必填：否 - 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞</li><li>IsSupportDefense - int- 是否必填：否 - 是否支持防御 0:不支持 1:支持</li><li>Labels- string- 是否必填：否 - 标签搜索</li><li>IsSupportAutoFix- string- 是否必填：否 - 是否支持自动修复 0:不支持 1:支持</li><li>CvssScore- string- 是否必填：否 - CvssScore大于多少</li><li>AttackLevel- string- 是否必填：否 - 攻击热度大于多少</li>
     * @param Filters 过滤条件。<li>Status - String - 是否必填：否 - 处理状态  0-待处理 1-已加白 2-已删除 3-已修复 5-检测中 6-修复中 8-修复失败</li><li>ModifyTime - String - 是否必填：否 - 最近发生时间</li><li>Uuid- String - 是否必填：否 - 主机uuid查询</li><li>VulName- string -</li><li>VulCategory- string - 是否必填：否 - 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞</li><li>IsSupportDefense - int- 是否必填：否 - 是否支持防御 0:不支持 1:支持</li><li>Labels- string- 是否必填：否 - 标签搜索</li><li>IsSupportAutoFix- string- 是否必填：否 - 是否支持自动修复 0:不支持 1:支持</li><li>CvssScore- string- 是否必填：否 - CvssScore大于多少</li><li>AttackLevel- string- 是否必填：否 - 攻击热度大于多少</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 可选排序字段 Level，LastTime，HostCount 
     * @return By 可选排序字段 Level，LastTime，HostCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 可选排序字段 Level，LastTime，HostCount
     * @param By 可选排序字段 Level，LastTime，HostCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序顺序：desc  默认asc 
     * @return Order 排序顺序：desc  默认asc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序顺序：desc  默认asc
     * @param Order 排序顺序：desc  默认asc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeVulListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulListRequest(DescribeVulListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

