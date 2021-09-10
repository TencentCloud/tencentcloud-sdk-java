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

public class RuleInfoData extends AbstractModel{

    /**
    * 执行顺序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 访问源
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 访问目的
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 策略, 0：观察，1：阻断，2：放行
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 访问源类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 方向，0：出站，1：入站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 访问目的类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * id值
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 日志id，从告警处创建必传，其它为空
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 城市Code
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * 国家Code
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * 云厂商，支持多个，以逗号分隔， 1:腾讯云（仅中国香港及海外）,2:阿里云,3:亚马逊云,4:华为云,5:微软云
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * 是否为地域
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * 城市名
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 国家名
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
     * Get 执行顺序 
     * @return OrderIndex 执行顺序
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 执行顺序
     * @param OrderIndex 执行顺序
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 访问源 
     * @return SourceIp 访问源
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 访问源
     * @param SourceIp 访问源
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 访问目的 
     * @return TargetIp 访问目的
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set 访问目的
     * @param TargetIp 访问目的
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 策略, 0：观察，1：阻断，2：放行 
     * @return Strategy 策略, 0：观察，1：阻断，2：放行
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略, 0：观察，1：阻断，2：放行
     * @param Strategy 策略, 0：观察，1：阻断，2：放行
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 访问源类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版 
     * @return SourceType 访问源类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
     * @param SourceType 访问源类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 方向，0：出站，1：入站 
     * @return Direction 方向，0：出站，1：入站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站
     * @param Direction 方向，0：出站，1：入站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 访问目的类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版 
     * @return TargetType 访问目的类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
     * @param TargetType 访问目的类型，1是IP，3是域名，4是IP地址模版，5是域名地址模版
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get id值 
     * @return Id id值
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id值
     * @param Id id值
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 日志id，从告警处创建必传，其它为空 
     * @return LogId 日志id，从告警处创建必传，其它为空
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 日志id，从告警处创建必传，其它为空
     * @param LogId 日志id，从告警处创建必传，其它为空
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 城市Code 
     * @return City 城市Code
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set 城市Code
     * @param City 城市Code
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get 国家Code 
     * @return Country 国家Code
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set 国家Code
     * @param Country 国家Code
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get 云厂商，支持多个，以逗号分隔， 1:腾讯云（仅中国香港及海外）,2:阿里云,3:亚马逊云,4:华为云,5:微软云 
     * @return CloudCode 云厂商，支持多个，以逗号分隔， 1:腾讯云（仅中国香港及海外）,2:阿里云,3:亚马逊云,4:华为云,5:微软云
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商，支持多个，以逗号分隔， 1:腾讯云（仅中国香港及海外）,2:阿里云,3:亚马逊云,4:华为云,5:微软云
     * @param CloudCode 云厂商，支持多个，以逗号分隔， 1:腾讯云（仅中国香港及海外）,2:阿里云,3:亚马逊云,4:华为云,5:微软云
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get 是否为地域 
     * @return IsRegion 是否为地域
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set 是否为地域
     * @param IsRegion 是否为地域
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get 城市名 
     * @return CityName 城市名
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 城市名
     * @param CityName 城市名
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 国家名 
     * @return CountryName 国家名
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set 国家名
     * @param CountryName 国家名
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public RuleInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfoData(RuleInfoData source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
        if (source.IsRegion != null) {
            this.IsRegion = new Long(source.IsRegion);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);

    }
}

