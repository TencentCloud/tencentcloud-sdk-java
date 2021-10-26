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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulListRequest extends AbstractModel{

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
    * 过滤条件。
<li>IfEmergency - String - 是否必填：否 - 是否为应急漏洞，查询应急漏洞传:yes</li>
<li>Status - String - 是否必填：是 - 漏洞状态筛选，0: 待处理 1:忽略  3:已修复  5:检测中，6：修复中 控制台仅处理0,1,3,5,6五种状态</li>
<li>Level - String - 是否必填：否 - 漏洞等级筛选 1:低 2:中 3:高 4:提示</li>
<li>VulName- String - 是否必填：否 - 漏洞名称搜索</li>
<li>LastDay- int - 是否必填：否 - 查询近几日的数据，需要 -1 之后传入，例如近3日数据，传2</li>
<li>OrderBy - String 是否必填：否 默认按照处理状态,威胁等级,检测时间排序 -排序字段，支持：level,lastTime的动态排序  hostCount 影响主机台数排序</li>
<li>IsShowFollowVul -  String 是否必填：否   是否仅展示重点关注漏洞  0=展示全部 1=仅展示重点关注漏洞</li>
<li>VulCategory-  String 是否必填：否   1: web应用漏洞 2:系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

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
     * Get 过滤条件。
<li>IfEmergency - String - 是否必填：否 - 是否为应急漏洞，查询应急漏洞传:yes</li>
<li>Status - String - 是否必填：是 - 漏洞状态筛选，0: 待处理 1:忽略  3:已修复  5:检测中，6：修复中 控制台仅处理0,1,3,5,6五种状态</li>
<li>Level - String - 是否必填：否 - 漏洞等级筛选 1:低 2:中 3:高 4:提示</li>
<li>VulName- String - 是否必填：否 - 漏洞名称搜索</li>
<li>LastDay- int - 是否必填：否 - 查询近几日的数据，需要 -1 之后传入，例如近3日数据，传2</li>
<li>OrderBy - String 是否必填：否 默认按照处理状态,威胁等级,检测时间排序 -排序字段，支持：level,lastTime的动态排序  hostCount 影响主机台数排序</li>
<li>IsShowFollowVul -  String 是否必填：否   是否仅展示重点关注漏洞  0=展示全部 1=仅展示重点关注漏洞</li>
<li>VulCategory-  String 是否必填：否   1: web应用漏洞 2:系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁</li> 
     * @return Filters 过滤条件。
<li>IfEmergency - String - 是否必填：否 - 是否为应急漏洞，查询应急漏洞传:yes</li>
<li>Status - String - 是否必填：是 - 漏洞状态筛选，0: 待处理 1:忽略  3:已修复  5:检测中，6：修复中 控制台仅处理0,1,3,5,6五种状态</li>
<li>Level - String - 是否必填：否 - 漏洞等级筛选 1:低 2:中 3:高 4:提示</li>
<li>VulName- String - 是否必填：否 - 漏洞名称搜索</li>
<li>LastDay- int - 是否必填：否 - 查询近几日的数据，需要 -1 之后传入，例如近3日数据，传2</li>
<li>OrderBy - String 是否必填：否 默认按照处理状态,威胁等级,检测时间排序 -排序字段，支持：level,lastTime的动态排序  hostCount 影响主机台数排序</li>
<li>IsShowFollowVul -  String 是否必填：否   是否仅展示重点关注漏洞  0=展示全部 1=仅展示重点关注漏洞</li>
<li>VulCategory-  String 是否必填：否   1: web应用漏洞 2:系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>IfEmergency - String - 是否必填：否 - 是否为应急漏洞，查询应急漏洞传:yes</li>
<li>Status - String - 是否必填：是 - 漏洞状态筛选，0: 待处理 1:忽略  3:已修复  5:检测中，6：修复中 控制台仅处理0,1,3,5,6五种状态</li>
<li>Level - String - 是否必填：否 - 漏洞等级筛选 1:低 2:中 3:高 4:提示</li>
<li>VulName- String - 是否必填：否 - 漏洞名称搜索</li>
<li>LastDay- int - 是否必填：否 - 查询近几日的数据，需要 -1 之后传入，例如近3日数据，传2</li>
<li>OrderBy - String 是否必填：否 默认按照处理状态,威胁等级,检测时间排序 -排序字段，支持：level,lastTime的动态排序  hostCount 影响主机台数排序</li>
<li>IsShowFollowVul -  String 是否必填：否   是否仅展示重点关注漏洞  0=展示全部 1=仅展示重点关注漏洞</li>
<li>VulCategory-  String 是否必填：否   1: web应用漏洞 2:系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁</li>
     * @param Filters 过滤条件。
<li>IfEmergency - String - 是否必填：否 - 是否为应急漏洞，查询应急漏洞传:yes</li>
<li>Status - String - 是否必填：是 - 漏洞状态筛选，0: 待处理 1:忽略  3:已修复  5:检测中，6：修复中 控制台仅处理0,1,3,5,6五种状态</li>
<li>Level - String - 是否必填：否 - 漏洞等级筛选 1:低 2:中 3:高 4:提示</li>
<li>VulName- String - 是否必填：否 - 漏洞名称搜索</li>
<li>LastDay- int - 是否必填：否 - 查询近几日的数据，需要 -1 之后传入，例如近3日数据，传2</li>
<li>OrderBy - String 是否必填：否 默认按照处理状态,威胁等级,检测时间排序 -排序字段，支持：level,lastTime的动态排序  hostCount 影响主机台数排序</li>
<li>IsShowFollowVul -  String 是否必填：否   是否仅展示重点关注漏洞  0=展示全部 1=仅展示重点关注漏洞</li>
<li>VulCategory-  String 是否必填：否   1: web应用漏洞 2:系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

