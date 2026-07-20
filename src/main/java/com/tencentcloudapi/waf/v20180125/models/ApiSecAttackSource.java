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
    * <p>攻击来源ip</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>威胁等级</p>
    */
    @SerializedName("EventLevel")
    @Expose
    private String EventLevel;

    /**
    * <p>BOT标签</p>
    */
    @SerializedName("BotLabel")
    @Expose
    private String BotLabel;

    /**
    * <p>变更时间</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>地理位置</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>关联事件数量</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>攻击数量</p>
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * <p>缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
    */
    @SerializedName("MissUserName")
    @Expose
    private String MissUserName;

    /**
    * <p>当是水平越权和垂直越权时，返回此字段</p>
    */
    @SerializedName("AttackDetail")
    @Expose
    private String [] AttackDetail;

    /**
    * <p>缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
    */
    @SerializedName("MissPassword")
    @Expose
    private String MissPassword;

    /**
    * <p>事件描述</p>
    */
    @SerializedName("EventDescription")
    @Expose
    private String EventDescription;

    /**
    * <p>事件描述(英文)</p>
    */
    @SerializedName("EventDescriptionEng")
    @Expose
    private String EventDescriptionEng;

    /**
    * <p>攻击样本</p>
    */
    @SerializedName("Sample")
    @Expose
    private ApiEventSample Sample;

    /**
     * Get <p>攻击来源ip</p> 
     * @return SrcIp <p>攻击来源ip</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>攻击来源ip</p>
     * @param SrcIp <p>攻击来源ip</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>威胁等级</p> 
     * @return EventLevel <p>威胁等级</p>
     */
    public String getEventLevel() {
        return this.EventLevel;
    }

    /**
     * Set <p>威胁等级</p>
     * @param EventLevel <p>威胁等级</p>
     */
    public void setEventLevel(String EventLevel) {
        this.EventLevel = EventLevel;
    }

    /**
     * Get <p>BOT标签</p> 
     * @return BotLabel <p>BOT标签</p>
     */
    public String getBotLabel() {
        return this.BotLabel;
    }

    /**
     * Set <p>BOT标签</p>
     * @param BotLabel <p>BOT标签</p>
     */
    public void setBotLabel(String BotLabel) {
        this.BotLabel = BotLabel;
    }

    /**
     * Get <p>变更时间</p> 
     * @return Timestamp <p>变更时间</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>变更时间</p>
     * @param Timestamp <p>变更时间</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>地理位置</p> 
     * @return City <p>地理位置</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>地理位置</p>
     * @param City <p>地理位置</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>关联事件数量</p> 
     * @return EventCount <p>关联事件数量</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>关联事件数量</p>
     * @param EventCount <p>关联事件数量</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>攻击数量</p> 
     * @return AttackCount <p>攻击数量</p>
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set <p>攻击数量</p>
     * @param AttackCount <p>攻击数量</p>
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get <p>缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p> 
     * @return MissUserName <p>缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
     */
    public String getMissUserName() {
        return this.MissUserName;
    }

    /**
     * Set <p>缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
     * @param MissUserName <p>缺失参数名，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
     */
    public void setMissUserName(String MissUserName) {
        this.MissUserName = MissUserName;
    }

    /**
     * Get <p>当是水平越权和垂直越权时，返回此字段</p> 
     * @return AttackDetail <p>当是水平越权和垂直越权时，返回此字段</p>
     */
    public String [] getAttackDetail() {
        return this.AttackDetail;
    }

    /**
     * Set <p>当是水平越权和垂直越权时，返回此字段</p>
     * @param AttackDetail <p>当是水平越权和垂直越权时，返回此字段</p>
     */
    public void setAttackDetail(String [] AttackDetail) {
        this.AttackDetail = AttackDetail;
    }

    /**
     * Get <p>缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p> 
     * @return MissPassword <p>缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
     */
    public String getMissPassword() {
        return this.MissPassword;
    }

    /**
     * Set <p>缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
     * @param MissPassword <p>缺失密码参数，当事件类型是缺失参数名，缺失参数名和密码时，返回此字段</p>
     */
    public void setMissPassword(String MissPassword) {
        this.MissPassword = MissPassword;
    }

    /**
     * Get <p>事件描述</p> 
     * @return EventDescription <p>事件描述</p>
     */
    public String getEventDescription() {
        return this.EventDescription;
    }

    /**
     * Set <p>事件描述</p>
     * @param EventDescription <p>事件描述</p>
     */
    public void setEventDescription(String EventDescription) {
        this.EventDescription = EventDescription;
    }

    /**
     * Get <p>事件描述(英文)</p> 
     * @return EventDescriptionEng <p>事件描述(英文)</p>
     */
    public String getEventDescriptionEng() {
        return this.EventDescriptionEng;
    }

    /**
     * Set <p>事件描述(英文)</p>
     * @param EventDescriptionEng <p>事件描述(英文)</p>
     */
    public void setEventDescriptionEng(String EventDescriptionEng) {
        this.EventDescriptionEng = EventDescriptionEng;
    }

    /**
     * Get <p>攻击样本</p> 
     * @return Sample <p>攻击样本</p>
     */
    public ApiEventSample getSample() {
        return this.Sample;
    }

    /**
     * Set <p>攻击样本</p>
     * @param Sample <p>攻击样本</p>
     */
    public void setSample(ApiEventSample Sample) {
        this.Sample = Sample;
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
        if (source.EventDescription != null) {
            this.EventDescription = new String(source.EventDescription);
        }
        if (source.EventDescriptionEng != null) {
            this.EventDescriptionEng = new String(source.EventDescriptionEng);
        }
        if (source.Sample != null) {
            this.Sample = new ApiEventSample(source.Sample);
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
        this.setParamSimple(map, prefix + "EventDescription", this.EventDescription);
        this.setParamSimple(map, prefix + "EventDescriptionEng", this.EventDescriptionEng);
        this.setParamObj(map, prefix + "Sample.", this.Sample);

    }
}

