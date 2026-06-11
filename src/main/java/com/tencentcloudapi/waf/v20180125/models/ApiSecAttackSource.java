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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiSecAttackSource extends AbstractModel {

    /**
    * 攻击来源ip
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 威胁等级
    */
    @SerializedName("EventLevel")
    @Expose
    private String EventLevel;

    /**
    * BOT标签
    */
    @SerializedName("BotLabel")
    @Expose
    private String BotLabel;

    /**
    * 变更时间
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 地理位置
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 关联事件数量
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 攻击数量
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * 缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
    */
    @SerializedName("MissUserName")
    @Expose
    private String MissUserName;

    /**
    * 当是水平越权和垂直越权时，返回此字段
    */
    @SerializedName("AttackDetail")
    @Expose
    private String [] AttackDetail;

    /**
    * 缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
    */
    @SerializedName("MissPassword")
    @Expose
    private String MissPassword;

    /**
     * Get 攻击来源ip 
     * @return SrcIp 攻击来源ip
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 攻击来源ip
     * @param SrcIp 攻击来源ip
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 威胁等级 
     * @return EventLevel 威胁等级
     */
    public String getEventLevel() {
        return this.EventLevel;
    }

    /**
     * Set 威胁等级
     * @param EventLevel 威胁等级
     */
    public void setEventLevel(String EventLevel) {
        this.EventLevel = EventLevel;
    }

    /**
     * Get BOT标签 
     * @return BotLabel BOT标签
     */
    public String getBotLabel() {
        return this.BotLabel;
    }

    /**
     * Set BOT标签
     * @param BotLabel BOT标签
     */
    public void setBotLabel(String BotLabel) {
        this.BotLabel = BotLabel;
    }

    /**
     * Get 变更时间 
     * @return Timestamp 变更时间
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 变更时间
     * @param Timestamp 变更时间
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 地理位置 
     * @return City 地理位置
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 地理位置
     * @param City 地理位置
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 关联事件数量 
     * @return EventCount 关联事件数量
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 关联事件数量
     * @param EventCount 关联事件数量
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 攻击数量 
     * @return AttackCount 攻击数量
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 攻击数量
     * @param AttackCount 攻击数量
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get 缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段 
     * @return MissUserName 缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
     */
    public String getMissUserName() {
        return this.MissUserName;
    }

    /**
     * Set 缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
     * @param MissUserName 缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
     */
    public void setMissUserName(String MissUserName) {
        this.MissUserName = MissUserName;
    }

    /**
     * Get 当是水平越权和垂直越权时，返回此字段 
     * @return AttackDetail 当是水平越权和垂直越权时，返回此字段
     */
    public String [] getAttackDetail() {
        return this.AttackDetail;
    }

    /**
     * Set 当是水平越权和垂直越权时，返回此字段
     * @param AttackDetail 当是水平越权和垂直越权时，返回此字段
     */
    public void setAttackDetail(String [] AttackDetail) {
        this.AttackDetail = AttackDetail;
    }

    /**
     * Get 缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段 
     * @return MissPassword 缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
     */
    public String getMissPassword() {
        return this.MissPassword;
    }

    /**
     * Set 缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
     * @param MissPassword 缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段
     */
    public void setMissPassword(String MissPassword) {
        this.MissPassword = MissPassword;
    }

    public ApiSecAttackSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecAttackSource(ApiSecAttackSource source) {
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.EventLevel != null) {
            this.EventLevel = new String(source.EventLevel);
        }
        if (source.BotLabel != null) {
            this.BotLabel = new String(source.BotLabel);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.MissUserName != null) {
            this.MissUserName = new String(source.MissUserName);
        }
        if (source.AttackDetail != null) {
            this.AttackDetail = new String[source.AttackDetail.length];
            for (int i = 0; i < source.AttackDetail.length; i++) {
                this.AttackDetail[i] = new String(source.AttackDetail[i]);
            }
        }
        if (source.MissPassword != null) {
            this.MissPassword = new String(source.MissPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "EventLevel", this.EventLevel);
        this.setParamSimple(map, prefix + "BotLabel", this.BotLabel);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "MissUserName", this.MissUserName);
        this.setParamArraySimple(map, prefix + "AttackDetail.", this.AttackDetail);
        this.setParamSimple(map, prefix + "MissPassword", this.MissPassword);

    }
}

