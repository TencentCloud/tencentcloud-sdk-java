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

public class BlockIgnoreRule extends AbstractModel {

    /**
    * 规则类型，取值：1 封禁，2外部IP，3域名，4情报，5assets，6自定义策略，7入侵防御规则id （2-7属于白名单类型）
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 规则ip或白名单内容
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * 资产实例名称、自定义策略名称等
    */
    @SerializedName("IocName")
    @Expose
    private String IocName;

    /**
    * 白名单信息
    */
    @SerializedName("IocInfo")
    @Expose
    private String IocInfo;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 危险等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 来源事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 方向：1入站，0出站
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 所有方向聚合成字符串
    */
    @SerializedName("DirectionList")
    @Expose
    private String DirectionList;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 地理位置
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 规则类型：1封禁，2放通
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 规则生效开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 规则生效结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 忽略原因
    */
    @SerializedName("IgnoreReason")
    @Expose
    private String IgnoreReason;

    /**
    * 安全事件来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 规则id
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * 规则命中次数
    */
    @SerializedName("MatchTimes")
    @Expose
    private Long MatchTimes;

    /**
    * 国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 上次命中时间
    */
    @SerializedName("LastHitTime")
    @Expose
    private String LastHitTime;

    /**
    * 自定义规则细节
    */
    @SerializedName("CustomRule")
    @Expose
    private CustomWhiteRule CustomRule;

    /**
    * 1 border 2 nat 4 vpc 8 border-serial
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
     * Get 规则类型，取值：1 封禁，2外部IP，3域名，4情报，5assets，6自定义策略，7入侵防御规则id （2-7属于白名单类型） 
     * @return RuleType 规则类型，取值：1 封禁，2外部IP，3域名，4情报，5assets，6自定义策略，7入侵防御规则id （2-7属于白名单类型）
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，取值：1 封禁，2外部IP，3域名，4情报，5assets，6自定义策略，7入侵防御规则id （2-7属于白名单类型）
     * @param RuleType 规则类型，取值：1 封禁，2外部IP，3域名，4情报，5assets，6自定义策略，7入侵防御规则id （2-7属于白名单类型）
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则ip或白名单内容 
     * @return Ioc 规则ip或白名单内容
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 规则ip或白名单内容
     * @param Ioc 规则ip或白名单内容
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get 资产实例名称、自定义策略名称等 
     * @return IocName 资产实例名称、自定义策略名称等
     */
    public String getIocName() {
        return this.IocName;
    }

    /**
     * Set 资产实例名称、自定义策略名称等
     * @param IocName 资产实例名称、自定义策略名称等
     */
    public void setIocName(String IocName) {
        this.IocName = IocName;
    }

    /**
     * Get 白名单信息 
     * @return IocInfo 白名单信息
     */
    public String getIocInfo() {
        return this.IocInfo;
    }

    /**
     * Set 白名单信息
     * @param IocInfo 白名单信息
     */
    public void setIocInfo(String IocInfo) {
        this.IocInfo = IocInfo;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP 
     * @return IP IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP
     * @param IP IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 危险等级 
     * @return Level 危险等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级
     * @param Level 危险等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 来源事件名称 
     * @return EventName 来源事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 来源事件名称
     * @param EventName 来源事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 方向：1入站，0出站 
     * @return Direction 方向：1入站，0出站
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向：1入站，0出站
     * @param Direction 方向：1入站，0出站
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 所有方向聚合成字符串 
     * @return DirectionList 所有方向聚合成字符串
     */
    public String getDirectionList() {
        return this.DirectionList;
    }

    /**
     * Set 所有方向聚合成字符串
     * @param DirectionList 所有方向聚合成字符串
     */
    public void setDirectionList(String DirectionList) {
        this.DirectionList = DirectionList;
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
     * Get 地理位置 
     * @return Address 地理位置
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地理位置
     * @param Address 地理位置
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 规则类型：1封禁，2放通 
     * @return Action 规则类型：1封禁，2放通
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 规则类型：1封禁，2放通
     * @param Action 规则类型：1封禁，2放通
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 规则生效开始时间 
     * @return StartTime 规则生效开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 规则生效开始时间
     * @param StartTime 规则生效开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 规则生效结束时间 
     * @return EndTime 规则生效结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 规则生效结束时间
     * @param EndTime 规则生效结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 忽略原因 
     * @return IgnoreReason 忽略原因
     */
    public String getIgnoreReason() {
        return this.IgnoreReason;
    }

    /**
     * Set 忽略原因
     * @param IgnoreReason 忽略原因
     */
    public void setIgnoreReason(String IgnoreReason) {
        this.IgnoreReason = IgnoreReason;
    }

    /**
     * Get 安全事件来源 
     * @return Source 安全事件来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 安全事件来源
     * @param Source 安全事件来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 规则id 
     * @return UniqueId 规则id
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set 规则id
     * @param UniqueId 规则id
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get 规则命中次数 
     * @return MatchTimes 规则命中次数
     */
    public Long getMatchTimes() {
        return this.MatchTimes;
    }

    /**
     * Set 规则命中次数
     * @param MatchTimes 规则命中次数
     */
    public void setMatchTimes(Long MatchTimes) {
        this.MatchTimes = MatchTimes;
    }

    /**
     * Get 国家 
     * @return Country 国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
     * @param Country 国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 备注 
     * @return Comment 备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
     * @param Comment 备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 上次命中时间 
     * @return LastHitTime 上次命中时间
     */
    public String getLastHitTime() {
        return this.LastHitTime;
    }

    /**
     * Set 上次命中时间
     * @param LastHitTime 上次命中时间
     */
    public void setLastHitTime(String LastHitTime) {
        this.LastHitTime = LastHitTime;
    }

    /**
     * Get 自定义规则细节 
     * @return CustomRule 自定义规则细节
     */
    public CustomWhiteRule getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义规则细节
     * @param CustomRule 自定义规则细节
     */
    public void setCustomRule(CustomWhiteRule CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get 1 border 2 nat 4 vpc 8 border-serial 
     * @return FwType 1 border 2 nat 4 vpc 8 border-serial
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set 1 border 2 nat 4 vpc 8 border-serial
     * @param FwType 1 border 2 nat 4 vpc 8 border-serial
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    public BlockIgnoreRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockIgnoreRule(BlockIgnoreRule source) {
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
        if (source.IocName != null) {
            this.IocName = new String(source.IocName);
        }
        if (source.IocInfo != null) {
            this.IocInfo = new String(source.IocInfo);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.DirectionList != null) {
            this.DirectionList = new String(source.DirectionList);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IgnoreReason != null) {
            this.IgnoreReason = new String(source.IgnoreReason);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.UniqueId != null) {
            this.UniqueId = new String(source.UniqueId);
        }
        if (source.MatchTimes != null) {
            this.MatchTimes = new Long(source.MatchTimes);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.LastHitTime != null) {
            this.LastHitTime = new String(source.LastHitTime);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new CustomWhiteRule(source.CustomRule);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);
        this.setParamSimple(map, prefix + "IocName", this.IocName);
        this.setParamSimple(map, prefix + "IocInfo", this.IocInfo);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "DirectionList", this.DirectionList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IgnoreReason", this.IgnoreReason);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "MatchTimes", this.MatchTimes);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "LastHitTime", this.LastHitTime);
        this.setParamObj(map, prefix + "CustomRule.", this.CustomRule);
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

