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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePortsRequest extends AbstractModel {

    /**
    * 是否聚合数据
    */
    @SerializedName("IsAggregation")
    @Expose
    private Boolean IsAggregation;

    /**
    * 是否新增数据
    */
    @SerializedName("IsNew")
    @Expose
    private Boolean IsNew;

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 子公司ID列表
    */
    @SerializedName("EnterpriseUidList")
    @Expose
    private String [] EnterpriseUidList;

    /**
    * 数据输出格式：json、file，默认不填为json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 创建时间-开始
    */
    @SerializedName("CreateAtStart")
    @Expose
    private String CreateAtStart;

    /**
    * 创建时间-结束
    */
    @SerializedName("CreateAtEnd")
    @Expose
    private String CreateAtEnd;

    /**
    * 更新时间-开始
    */
    @SerializedName("UpdateAtStart")
    @Expose
    private String UpdateAtStart;

    /**
    * 更新时间-结束
    */
    @SerializedName("UpdateAtEnd")
    @Expose
    private String UpdateAtEnd;

    /**
    * 查询数组
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 是否显示被忽略的数据
    */
    @SerializedName("Ignored")
    @Expose
    private Boolean Ignored;

    /**
     * Get 是否聚合数据 
     * @return IsAggregation 是否聚合数据
     */
    public Boolean getIsAggregation() {
        return this.IsAggregation;
    }

    /**
     * Set 是否聚合数据
     * @param IsAggregation 是否聚合数据
     */
    public void setIsAggregation(Boolean IsAggregation) {
        this.IsAggregation = IsAggregation;
    }

    /**
     * Get 是否新增数据 
     * @return IsNew 是否新增数据
     */
    public Boolean getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 是否新增数据
     * @param IsNew 是否新增数据
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移 
     * @return Offset 分页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移
     * @param Offset 分页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 子公司ID列表 
     * @return EnterpriseUidList 子公司ID列表
     */
    public String [] getEnterpriseUidList() {
        return this.EnterpriseUidList;
    }

    /**
     * Set 子公司ID列表
     * @param EnterpriseUidList 子公司ID列表
     */
    public void setEnterpriseUidList(String [] EnterpriseUidList) {
        this.EnterpriseUidList = EnterpriseUidList;
    }

    /**
     * Get 数据输出格式：json、file，默认不填为json 
     * @return Format 数据输出格式：json、file，默认不填为json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 数据输出格式：json、file，默认不填为json
     * @param Format 数据输出格式：json、file，默认不填为json
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 创建时间-开始 
     * @return CreateAtStart 创建时间-开始
     */
    public String getCreateAtStart() {
        return this.CreateAtStart;
    }

    /**
     * Set 创建时间-开始
     * @param CreateAtStart 创建时间-开始
     */
    public void setCreateAtStart(String CreateAtStart) {
        this.CreateAtStart = CreateAtStart;
    }

    /**
     * Get 创建时间-结束 
     * @return CreateAtEnd 创建时间-结束
     */
    public String getCreateAtEnd() {
        return this.CreateAtEnd;
    }

    /**
     * Set 创建时间-结束
     * @param CreateAtEnd 创建时间-结束
     */
    public void setCreateAtEnd(String CreateAtEnd) {
        this.CreateAtEnd = CreateAtEnd;
    }

    /**
     * Get 更新时间-开始 
     * @return UpdateAtStart 更新时间-开始
     */
    public String getUpdateAtStart() {
        return this.UpdateAtStart;
    }

    /**
     * Set 更新时间-开始
     * @param UpdateAtStart 更新时间-开始
     */
    public void setUpdateAtStart(String UpdateAtStart) {
        this.UpdateAtStart = UpdateAtStart;
    }

    /**
     * Get 更新时间-结束 
     * @return UpdateAtEnd 更新时间-结束
     */
    public String getUpdateAtEnd() {
        return this.UpdateAtEnd;
    }

    /**
     * Set 更新时间-结束
     * @param UpdateAtEnd 更新时间-结束
     */
    public void setUpdateAtEnd(String UpdateAtEnd) {
        this.UpdateAtEnd = UpdateAtEnd;
    }

    /**
     * Get 查询数组 
     * @return Filters 查询数组
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询数组
     * @param Filters 查询数组
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否显示被忽略的数据 
     * @return Ignored 是否显示被忽略的数据
     */
    public Boolean getIgnored() {
        return this.Ignored;
    }

    /**
     * Set 是否显示被忽略的数据
     * @param Ignored 是否显示被忽略的数据
     */
    public void setIgnored(Boolean Ignored) {
        this.Ignored = Ignored;
    }

    public DescribePortsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePortsRequest(DescribePortsRequest source) {
        if (source.IsAggregation != null) {
            this.IsAggregation = new Boolean(source.IsAggregation);
        }
        if (source.IsNew != null) {
            this.IsNew = new Boolean(source.IsNew);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EnterpriseUidList != null) {
            this.EnterpriseUidList = new String[source.EnterpriseUidList.length];
            for (int i = 0; i < source.EnterpriseUidList.length; i++) {
                this.EnterpriseUidList[i] = new String(source.EnterpriseUidList[i]);
            }
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.CreateAtStart != null) {
            this.CreateAtStart = new String(source.CreateAtStart);
        }
        if (source.CreateAtEnd != null) {
            this.CreateAtEnd = new String(source.CreateAtEnd);
        }
        if (source.UpdateAtStart != null) {
            this.UpdateAtStart = new String(source.UpdateAtStart);
        }
        if (source.UpdateAtEnd != null) {
            this.UpdateAtEnd = new String(source.UpdateAtEnd);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Ignored != null) {
            this.Ignored = new Boolean(source.Ignored);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAggregation", this.IsAggregation);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "EnterpriseUidList.", this.EnterpriseUidList);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "CreateAtStart", this.CreateAtStart);
        this.setParamSimple(map, prefix + "CreateAtEnd", this.CreateAtEnd);
        this.setParamSimple(map, prefix + "UpdateAtStart", this.UpdateAtStart);
        this.setParamSimple(map, prefix + "UpdateAtEnd", this.UpdateAtEnd);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Ignored", this.Ignored);

    }
}

