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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillGroupInfoItem extends AbstractModel {

    /**
    * 技能组ID
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * 技能组名称
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * （废弃）类型：IM、TEL、ALL（全媒体）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 会话分配策略
    */
    @SerializedName("RoutePolicy")
    @Expose
    private String RoutePolicy;

    /**
    * 会话分配是否优先上次服务座席
    */
    @SerializedName("UsingLastSeat")
    @Expose
    private Long UsingLastSeat;

    /**
    * 单客服最大并发数（电话类型默认1）
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * 最后修改时间
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
    * 技能组类型0-电话，1-在线，3-音频，4-视频	
    */
    @SerializedName("SkillGroupType")
    @Expose
    private Long SkillGroupType;

    /**
    * 技能组内线号码
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 技能组ID 
     * @return SkillGroupId 技能组ID
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 技能组ID
     * @param SkillGroupId 技能组ID
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 技能组名称 
     * @return SkillGroupName 技能组名称
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set 技能组名称
     * @param SkillGroupName 技能组名称
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get （废弃）类型：IM、TEL、ALL（全媒体） 
     * @return Type （废弃）类型：IM、TEL、ALL（全媒体）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set （废弃）类型：IM、TEL、ALL（全媒体）
     * @param Type （废弃）类型：IM、TEL、ALL（全媒体）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 会话分配策略 
     * @return RoutePolicy 会话分配策略
     */
    public String getRoutePolicy() {
        return this.RoutePolicy;
    }

    /**
     * Set 会话分配策略
     * @param RoutePolicy 会话分配策略
     */
    public void setRoutePolicy(String RoutePolicy) {
        this.RoutePolicy = RoutePolicy;
    }

    /**
     * Get 会话分配是否优先上次服务座席 
     * @return UsingLastSeat 会话分配是否优先上次服务座席
     */
    public Long getUsingLastSeat() {
        return this.UsingLastSeat;
    }

    /**
     * Set 会话分配是否优先上次服务座席
     * @param UsingLastSeat 会话分配是否优先上次服务座席
     */
    public void setUsingLastSeat(Long UsingLastSeat) {
        this.UsingLastSeat = UsingLastSeat;
    }

    /**
     * Get 单客服最大并发数（电话类型默认1） 
     * @return MaxConcurrency 单客服最大并发数（电话类型默认1）
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 单客服最大并发数（电话类型默认1）
     * @param MaxConcurrency 单客服最大并发数（电话类型默认1）
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get 最后修改时间 
     * @return LastModifyTimestamp 最后修改时间
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set 最后修改时间
     * @param LastModifyTimestamp 最后修改时间
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    /**
     * Get 技能组类型0-电话，1-在线，3-音频，4-视频	 
     * @return SkillGroupType 技能组类型0-电话，1-在线，3-音频，4-视频	
     */
    public Long getSkillGroupType() {
        return this.SkillGroupType;
    }

    /**
     * Set 技能组类型0-电话，1-在线，3-音频，4-视频	
     * @param SkillGroupType 技能组类型0-电话，1-在线，3-音频，4-视频	
     */
    public void setSkillGroupType(Long SkillGroupType) {
        this.SkillGroupType = SkillGroupType;
    }

    /**
     * Get 技能组内线号码 
     * @return Alias 技能组内线号码
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 技能组内线号码
     * @param Alias 技能组内线号码
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public SkillGroupInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillGroupInfoItem(SkillGroupInfoItem source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RoutePolicy != null) {
            this.RoutePolicy = new String(source.RoutePolicy);
        }
        if (source.UsingLastSeat != null) {
            this.UsingLastSeat = new Long(source.UsingLastSeat);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.LastModifyTimestamp != null) {
            this.LastModifyTimestamp = new Long(source.LastModifyTimestamp);
        }
        if (source.SkillGroupType != null) {
            this.SkillGroupType = new Long(source.SkillGroupType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RoutePolicy", this.RoutePolicy);
        this.setParamSimple(map, prefix + "UsingLastSeat", this.UsingLastSeat);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);
        this.setParamSimple(map, prefix + "SkillGroupType", this.SkillGroupType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

