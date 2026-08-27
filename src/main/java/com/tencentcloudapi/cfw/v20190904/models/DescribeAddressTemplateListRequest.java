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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressTemplateListRequest extends AbstractModel {

    /**
    * <p>偏移量，分页用</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>条数，分页用</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序字段，取值：UpdateTime最近更新时间，RulesNum关联规则数</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>排序，取值 ：asc正序，desc逆序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>搜索值</p>
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * <p>检索地址模板唯一id</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>模板类型，取值：1：ip模板，5：域名模板，6：协议端口模板</p>
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * <p>模板Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>模板来源</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
     * Get <p>偏移量，分页用</p> 
     * @return Offset <p>偏移量，分页用</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，分页用</p>
     * @param Offset <p>偏移量，分页用</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>条数，分页用</p> 
     * @return Limit <p>条数，分页用</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数，分页用</p>
     * @param Limit <p>条数，分页用</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序字段，取值：UpdateTime最近更新时间，RulesNum关联规则数</p> 
     * @return By <p>排序字段，取值：UpdateTime最近更新时间，RulesNum关联规则数</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段，取值：UpdateTime最近更新时间，RulesNum关联规则数</p>
     * @param By <p>排序字段，取值：UpdateTime最近更新时间，RulesNum关联规则数</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>排序，取值 ：asc正序，desc逆序</p> 
     * @return Order <p>排序，取值 ：asc正序，desc逆序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序，取值 ：asc正序，desc逆序</p>
     * @param Order <p>排序，取值 ：asc正序，desc逆序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>搜索值</p> 
     * @return SearchValue <p>搜索值</p>
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set <p>搜索值</p>
     * @param SearchValue <p>搜索值</p>
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get <p>检索地址模板唯一id</p> 
     * @return Uuid <p>检索地址模板唯一id</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>检索地址模板唯一id</p>
     * @param Uuid <p>检索地址模板唯一id</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>模板类型，取值：1：ip模板，5：域名模板，6：协议端口模板</p> 
     * @return TemplateType <p>模板类型，取值：1：ip模板，5：域名模板，6：协议端口模板</p>
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set <p>模板类型，取值：1：ip模板，5：域名模板，6：协议端口模板</p>
     * @param TemplateType <p>模板类型，取值：1：ip模板，5：域名模板，6：协议端口模板</p>
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get <p>模板Id</p> 
     * @return TemplateId <p>模板Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板Id</p>
     * @param TemplateId <p>模板Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板来源</p> 
     * @return SourceType <p>模板来源</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>模板来源</p>
     * @param SourceType <p>模板来源</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    public DescribeAddressTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddressTemplateListRequest(DescribeAddressTemplateListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);

    }
}

