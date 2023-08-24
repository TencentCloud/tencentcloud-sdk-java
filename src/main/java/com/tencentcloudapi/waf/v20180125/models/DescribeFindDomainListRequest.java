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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFindDomainListRequest extends AbstractModel{

    /**
    * 分页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页容量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 是否接入waf
    */
    @SerializedName("IsWafDomain")
    @Expose
    private String IsWafDomain;

    /**
    * 排序参数
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 分页 
     * @return Offset 分页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页
     * @param Offset 分页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页容量 
     * @return Limit 每页容量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页容量
     * @param Limit 每页容量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件 
     * @return Key 过滤条件
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤条件
     * @param Key 过滤条件
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 是否接入waf 
     * @return IsWafDomain 是否接入waf
     */
    public String getIsWafDomain() {
        return this.IsWafDomain;
    }

    /**
     * Set 是否接入waf
     * @param IsWafDomain 是否接入waf
     */
    public void setIsWafDomain(String IsWafDomain) {
        this.IsWafDomain = IsWafDomain;
    }

    /**
     * Get 排序参数 
     * @return By 排序参数
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序参数
     * @param By 排序参数
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式 
     * @return Order 排序方式
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
     * @param Order 排序方式
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeFindDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFindDomainListRequest(DescribeFindDomainListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.IsWafDomain != null) {
            this.IsWafDomain = new String(source.IsWafDomain);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "IsWafDomain", this.IsWafDomain);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

