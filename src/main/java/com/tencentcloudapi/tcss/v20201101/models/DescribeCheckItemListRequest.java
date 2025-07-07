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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCheckItemListRequest extends AbstractModel {

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每次查询的最大记录数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Name 可取值：
Name: 检查项名称
RiskType: 风险类别
RiskLevel: 风险等级
RiskTarget: 检查对象
RiskAttribute: 检测项所属分型线类型
Enable: 检查项是否开启(0:关闭 1:开启)
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每次查询的最大记录数量 
     * @return Limit 每次查询的最大记录数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次查询的最大记录数量
     * @param Limit 每次查询的最大记录数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Name 可取值：
Name: 检查项名称
RiskType: 风险类别
RiskLevel: 风险等级
RiskTarget: 检查对象
RiskAttribute: 检测项所属分型线类型
Enable: 检查项是否开启(0:关闭 1:开启) 
     * @return Filters Name 可取值：
Name: 检查项名称
RiskType: 风险类别
RiskLevel: 风险等级
RiskTarget: 检查对象
RiskAttribute: 检测项所属分型线类型
Enable: 检查项是否开启(0:关闭 1:开启)
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Name 可取值：
Name: 检查项名称
RiskType: 风险类别
RiskLevel: 风险等级
RiskTarget: 检查对象
RiskAttribute: 检测项所属分型线类型
Enable: 检查项是否开启(0:关闭 1:开启)
     * @param Filters Name 可取值：
Name: 检查项名称
RiskType: 风险类别
RiskLevel: 风险等级
RiskTarget: 检查对象
RiskAttribute: 检测项所属分型线类型
Enable: 检查项是否开启(0:关闭 1:开启)
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCheckItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckItemListRequest(DescribeCheckItemListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
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

    }
}

