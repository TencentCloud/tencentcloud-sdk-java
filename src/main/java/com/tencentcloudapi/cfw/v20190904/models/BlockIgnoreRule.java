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

public class BlockIgnoreRule extends AbstractModel{

    /**
    * 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * 危险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 来源事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 方向：1入站，0出站
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 地理位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 规则类型：1封禁，2放通
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 规则生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 规则生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 忽略原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreReason")
    @Expose
    private String IgnoreReason;

    /**
    * 安全事件来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * 规则命中次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MatchTimes")
    @Expose
    private Long MatchTimes;

    /**
    * 国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ioc 规则ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 规则ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ioc 规则ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get 危险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 危险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 危险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 来源事件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 来源事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 来源事件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 来源事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 方向：1入站，0出站
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Direction 方向：1入站，0出站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向：1入站，0出站
注意：此字段可能返回 null，表示取不到有效值。
     * @param Direction 方向：1入站，0出站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 地理位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 地理位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地理位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 地理位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 规则类型：1封禁，2放通
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 规则类型：1封禁，2放通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 规则类型：1封禁，2放通
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 规则类型：1封禁，2放通
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 规则生效开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 规则生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 规则生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 规则生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 规则生效结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 规则生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 规则生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 规则生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 忽略原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreReason 忽略原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreReason() {
        return this.IgnoreReason;
    }

    /**
     * Set 忽略原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreReason 忽略原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreReason(String IgnoreReason) {
        this.IgnoreReason = IgnoreReason;
    }

    /**
     * Get 安全事件来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 安全事件来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 安全事件来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 安全事件来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqueId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set 规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqueId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get 规则命中次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MatchTimes 规则命中次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMatchTimes() {
        return this.MatchTimes;
    }

    /**
     * Set 规则命中次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MatchTimes 规则命中次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMatchTimes(Long MatchTimes) {
        this.MatchTimes = MatchTimes;
    }

    /**
     * Get 国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public BlockIgnoreRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockIgnoreRule(BlockIgnoreRule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
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

    }
}

