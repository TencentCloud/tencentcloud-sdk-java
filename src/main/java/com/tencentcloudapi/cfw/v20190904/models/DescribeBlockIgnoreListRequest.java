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

public class DescribeBlockIgnoreListRequest extends AbstractModel{

    /**
    * 单页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 方向：1互联网入站，0互联网出站，3内网，空 全部方向
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 规则类型：1封禁，2放通
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 排序类型：desc降序，asc正序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序列：EndTime结束时间，StartTime开始时间，MatchTimes命中次数
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 搜索参数，json格式字符串，空则传"{}"，域名：domain，危险等级：level，放通原因：ignore_reason，安全事件来源：rule_source，地理位置：address，模糊搜索：common
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get 单页数量 
     * @return Limit 单页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页数量
     * @param Limit 单页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移量 
     * @return Offset 页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移量
     * @param Offset 页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 方向：1互联网入站，0互联网出站，3内网，空 全部方向 
     * @return Direction 方向：1互联网入站，0互联网出站，3内网，空 全部方向
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向：1互联网入站，0互联网出站，3内网，空 全部方向
     * @param Direction 方向：1互联网入站，0互联网出站，3内网，空 全部方向
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 规则类型：1封禁，2放通 
     * @return RuleType 规则类型：1封禁，2放通
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型：1封禁，2放通
     * @param RuleType 规则类型：1封禁，2放通
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 排序类型：desc降序，asc正序 
     * @return Order 排序类型：desc降序，asc正序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序类型：desc降序，asc正序
     * @param Order 排序类型：desc降序，asc正序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序列：EndTime结束时间，StartTime开始时间，MatchTimes命中次数 
     * @return By 排序列：EndTime结束时间，StartTime开始时间，MatchTimes命中次数
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序列：EndTime结束时间，StartTime开始时间，MatchTimes命中次数
     * @param By 排序列：EndTime结束时间，StartTime开始时间，MatchTimes命中次数
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 搜索参数，json格式字符串，空则传"{}"，域名：domain，危险等级：level，放通原因：ignore_reason，安全事件来源：rule_source，地理位置：address，模糊搜索：common 
     * @return SearchValue 搜索参数，json格式字符串，空则传"{}"，域名：domain，危险等级：level，放通原因：ignore_reason，安全事件来源：rule_source，地理位置：address，模糊搜索：common
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 搜索参数，json格式字符串，空则传"{}"，域名：domain，危险等级：level，放通原因：ignore_reason，安全事件来源：rule_source，地理位置：address，模糊搜索：common
     * @param SearchValue 搜索参数，json格式字符串，空则传"{}"，域名：domain，危险等级：level，放通原因：ignore_reason，安全事件来源：rule_source，地理位置：address，模糊搜索：common
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public DescribeBlockIgnoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockIgnoreListRequest(DescribeBlockIgnoreListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

