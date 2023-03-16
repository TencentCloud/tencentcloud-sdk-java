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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveVipTradeInfosRequest extends AbstractModel{

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 直播会员充值下单起始时间，格式为 ISO。默认为当前时间前一天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 直播会员充值下单截止时间，格式为 ISO。默认为当前时间。 EndTime不能小于StartTime
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 交易流水号集合，匹配集合指定所有流水号 。
<li>数组长度限制：10。</li>
    */
    @SerializedName("TradeSerialNos")
    @Expose
    private String [] TradeSerialNos;

    /**
    * 用户标识集合，匹配集合指定所有用户标识 。
<li>数组长度限制：10。</li>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：20，最大值：50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 直播会员充值下单起始时间，格式为 ISO。默认为当前时间前一天。 
     * @return StartTime 直播会员充值下单起始时间，格式为 ISO。默认为当前时间前一天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 直播会员充值下单起始时间，格式为 ISO。默认为当前时间前一天。
     * @param StartTime 直播会员充值下单起始时间，格式为 ISO。默认为当前时间前一天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 直播会员充值下单截止时间，格式为 ISO。默认为当前时间。 EndTime不能小于StartTime 
     * @return EndTime 直播会员充值下单截止时间，格式为 ISO。默认为当前时间。 EndTime不能小于StartTime
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 直播会员充值下单截止时间，格式为 ISO。默认为当前时间。 EndTime不能小于StartTime
     * @param EndTime 直播会员充值下单截止时间，格式为 ISO。默认为当前时间。 EndTime不能小于StartTime
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 交易流水号集合，匹配集合指定所有流水号 。
<li>数组长度限制：10。</li> 
     * @return TradeSerialNos 交易流水号集合，匹配集合指定所有流水号 。
<li>数组长度限制：10。</li>
     */
    public String [] getTradeSerialNos() {
        return this.TradeSerialNos;
    }

    /**
     * Set 交易流水号集合，匹配集合指定所有流水号 。
<li>数组长度限制：10。</li>
     * @param TradeSerialNos 交易流水号集合，匹配集合指定所有流水号 。
<li>数组长度限制：10。</li>
     */
    public void setTradeSerialNos(String [] TradeSerialNos) {
        this.TradeSerialNos = TradeSerialNos;
    }

    /**
     * Get 用户标识集合，匹配集合指定所有用户标识 。
<li>数组长度限制：10。</li> 
     * @return UserIds 用户标识集合，匹配集合指定所有用户标识 。
<li>数组长度限制：10。</li>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 用户标识集合，匹配集合指定所有用户标识 。
<li>数组长度限制：10。</li>
     * @param UserIds 用户标识集合，匹配集合指定所有用户标识 。
<li>数组长度限制：10。</li>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。 
     * @return Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     * @param Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：20，最大值：50。 
     * @return Limit 分页返回的记录条数，默认值：20，最大值：50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：20，最大值：50。
     * @param Limit 分页返回的记录条数，默认值：20，最大值：50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeLiveVipTradeInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveVipTradeInfosRequest(DescribeLiveVipTradeInfosRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TradeSerialNos != null) {
            this.TradeSerialNos = new String[source.TradeSerialNos.length];
            for (int i = 0; i < source.TradeSerialNos.length; i++) {
                this.TradeSerialNos[i] = new String(source.TradeSerialNos[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "TradeSerialNos.", this.TradeSerialNos);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

