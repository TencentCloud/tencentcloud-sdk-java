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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsageRequest extends AbstractModel{

    /**
    * 应用信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 开始时间 eg:2021-03-21
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束时间 eg:2021-06-21 
开始时间到结束时间的区间长度小于等于90天
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 是否汇总数据，默认不汇总
不汇总:返回在统计区间内渠道下所有企业的每日明细，即每个企业N条数据，N为统计天数
汇总:返回在统计区间内渠道下所有企业的汇总后数据，即每个企业一条数据
    */
    @SerializedName("NeedAggregate")
    @Expose
    private Boolean NeedAggregate;

    /**
    * 单次返回的最多条目数量,默认为1000,且不能超过1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认是0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 应用信息 
     * @return Agent 应用信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用信息
     * @param Agent 应用信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 开始时间 eg:2021-03-21 
     * @return StartDate 开始时间 eg:2021-03-21
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始时间 eg:2021-03-21
     * @param StartDate 开始时间 eg:2021-03-21
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束时间 eg:2021-06-21 
开始时间到结束时间的区间长度小于等于90天 
     * @return EndDate 结束时间 eg:2021-06-21 
开始时间到结束时间的区间长度小于等于90天
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束时间 eg:2021-06-21 
开始时间到结束时间的区间长度小于等于90天
     * @param EndDate 结束时间 eg:2021-06-21 
开始时间到结束时间的区间长度小于等于90天
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否汇总数据，默认不汇总
不汇总:返回在统计区间内渠道下所有企业的每日明细，即每个企业N条数据，N为统计天数
汇总:返回在统计区间内渠道下所有企业的汇总后数据，即每个企业一条数据 
     * @return NeedAggregate 是否汇总数据，默认不汇总
不汇总:返回在统计区间内渠道下所有企业的每日明细，即每个企业N条数据，N为统计天数
汇总:返回在统计区间内渠道下所有企业的汇总后数据，即每个企业一条数据
     */
    public Boolean getNeedAggregate() {
        return this.NeedAggregate;
    }

    /**
     * Set 是否汇总数据，默认不汇总
不汇总:返回在统计区间内渠道下所有企业的每日明细，即每个企业N条数据，N为统计天数
汇总:返回在统计区间内渠道下所有企业的汇总后数据，即每个企业一条数据
     * @param NeedAggregate 是否汇总数据，默认不汇总
不汇总:返回在统计区间内渠道下所有企业的每日明细，即每个企业N条数据，N为统计天数
汇总:返回在统计区间内渠道下所有企业的汇总后数据，即每个企业一条数据
     */
    public void setNeedAggregate(Boolean NeedAggregate) {
        this.NeedAggregate = NeedAggregate;
    }

    /**
     * Get 单次返回的最多条目数量,默认为1000,且不能超过1000 
     * @return Limit 单次返回的最多条目数量,默认为1000,且不能超过1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次返回的最多条目数量,默认为1000,且不能超过1000
     * @param Limit 单次返回的最多条目数量,默认为1000,且不能超过1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认是0 
     * @return Offset 偏移量,默认是0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认是0
     * @param Offset 偏移量,默认是0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageRequest(DescribeUsageRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.NeedAggregate != null) {
            this.NeedAggregate = new Boolean(source.NeedAggregate);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "NeedAggregate", this.NeedAggregate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

