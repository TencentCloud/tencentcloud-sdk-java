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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssociatedInstanceListRequest extends AbstractModel{

    /**
    * 列表偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页记录条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 地域代码（例：ap-guangzhou）,支持腾讯云全地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 额外检索条件（JSON字符串）
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式（asc:升序,desc:降序）
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 实例类型,'3'是cvm实例,'4'是clb实例,'5'是eni实例,'6'是云数据库
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 列表偏移量 
     * @return Offset 列表偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 列表偏移量
     * @param Offset 列表偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页记录条数 
     * @return Limit 每页记录条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页记录条数
     * @param Limit 每页记录条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 地域代码（例：ap-guangzhou）,支持腾讯云全地域 
     * @return Area 地域代码（例：ap-guangzhou）,支持腾讯云全地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域代码（例：ap-guangzhou）,支持腾讯云全地域
     * @param Area 地域代码（例：ap-guangzhou）,支持腾讯云全地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 额外检索条件（JSON字符串） 
     * @return SearchValue 额外检索条件（JSON字符串）
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 额外检索条件（JSON字符串）
     * @param SearchValue 额外检索条件（JSON字符串）
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式（asc:升序,desc:降序） 
     * @return Order 排序方式（asc:升序,desc:降序）
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式（asc:升序,desc:降序）
     * @param Order 排序方式（asc:升序,desc:降序）
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupId 安全组ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupId 安全组ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 实例类型,'3'是cvm实例,'4'是clb实例,'5'是eni实例,'6'是云数据库 
     * @return Type 实例类型,'3'是cvm实例,'4'是clb实例,'5'是eni实例,'6'是云数据库
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型,'3'是cvm实例,'4'是clb实例,'5'是eni实例,'6'是云数据库
     * @param Type 实例类型,'3'是cvm实例,'4'是clb实例,'5'是eni实例,'6'是云数据库
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeAssociatedInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssociatedInstanceListRequest(DescribeAssociatedInstanceListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

