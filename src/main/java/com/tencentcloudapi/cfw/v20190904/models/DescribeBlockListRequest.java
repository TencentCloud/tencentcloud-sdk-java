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

public class DescribeBlockListRequest extends AbstractModel {

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 长度
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 频率类型
    */
    @SerializedName("StatTimeSpan")
    @Expose
    private Long StatTimeSpan;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询条件
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 升序降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 方向 1 入 0出
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 是否处置 1处置 0不是
    */
    @SerializedName("ByPass")
    @Expose
    private String ByPass;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 国家 1国内
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 日志来源 move：vpc间防火墙
    */
    @SerializedName("LogSource")
    @Expose
    private String LogSource;

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
     * Get 长度 
     * @return Limit 长度
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 长度
     * @param Limit 长度
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 频率类型 
     * @return StatTimeSpan 频率类型
     */
    public Long getStatTimeSpan() {
        return this.StatTimeSpan;
    }

    /**
     * Set 频率类型
     * @param StatTimeSpan 频率类型
     */
    public void setStatTimeSpan(Long StatTimeSpan) {
        this.StatTimeSpan = StatTimeSpan;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询条件 
     * @return SearchValue 查询条件
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 查询条件
     * @param SearchValue 查询条件
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 升序降序 
     * @return Order 升序降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 升序降序
     * @param Order 升序降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
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
     * Get 方向 1 入 0出 
     * @return Direction 方向 1 入 0出
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向 1 入 0出
     * @param Direction 方向 1 入 0出
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 是否处置 1处置 0不是 
     * @return ByPass 是否处置 1处置 0不是
     */
    public String getByPass() {
        return this.ByPass;
    }

    /**
     * Set 是否处置 1处置 0不是
     * @param ByPass 是否处置 1处置 0不是
     */
    public void setByPass(String ByPass) {
        this.ByPass = ByPass;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 国家 1国内 
     * @return Country 国家 1国内
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家 1国内
     * @param Country 国家 1国内
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 日志来源 move：vpc间防火墙 
     * @return LogSource 日志来源 move：vpc间防火墙
     */
    public String getLogSource() {
        return this.LogSource;
    }

    /**
     * Set 日志来源 move：vpc间防火墙
     * @param LogSource 日志来源 move：vpc间防火墙
     */
    public void setLogSource(String LogSource) {
        this.LogSource = LogSource;
    }

    public DescribeBlockListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlockListRequest(DescribeBlockListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StatTimeSpan != null) {
            this.StatTimeSpan = new Long(source.StatTimeSpan);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.ByPass != null) {
            this.ByPass = new String(source.ByPass);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.LogSource != null) {
            this.LogSource = new String(source.LogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StatTimeSpan", this.StatTimeSpan);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "ByPass", this.ByPass);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "LogSource", this.LogSource);

    }
}

