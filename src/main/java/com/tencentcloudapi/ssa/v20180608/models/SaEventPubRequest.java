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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaEventPubRequest extends AbstractModel{

    /**
    * 受影响资产
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * 安全事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 安全事件1级分类，-1:未知 0:全部 1:攻击事件 2:侦查事件 3:僵木蠕毒 4:违规策略
    */
    @SerializedName("EventType1")
    @Expose
    private Long EventType1;

    /**
    * 安全事件2级分类，-1:未知 0:全部 1:DDOS事件 2:Web攻击 3:木马 4:异地登录 5:密码破解
    */
    @SerializedName("EventType2")
    @Expose
    private Long EventType2;

    /**
    * 风险等级，-1:未知 0:全部 1:低危 2:中危 3:高危 4:严重，可多选，如：1,2
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 安全事件状态，-1:未知 0:全部 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询起始地址
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
    */
    @SerializedName("OldIdMd5")
    @Expose
    private String OldIdMd5;

    /**
     * Get 受影响资产 
     * @return Asset 受影响资产
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set 受影响资产
     * @param Asset 受影响资产
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 安全事件名称 
     * @return EventName 安全事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 安全事件名称
     * @param EventName 安全事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 安全事件1级分类，-1:未知 0:全部 1:攻击事件 2:侦查事件 3:僵木蠕毒 4:违规策略 
     * @return EventType1 安全事件1级分类，-1:未知 0:全部 1:攻击事件 2:侦查事件 3:僵木蠕毒 4:违规策略
     */
    public Long getEventType1() {
        return this.EventType1;
    }

    /**
     * Set 安全事件1级分类，-1:未知 0:全部 1:攻击事件 2:侦查事件 3:僵木蠕毒 4:违规策略
     * @param EventType1 安全事件1级分类，-1:未知 0:全部 1:攻击事件 2:侦查事件 3:僵木蠕毒 4:违规策略
     */
    public void setEventType1(Long EventType1) {
        this.EventType1 = EventType1;
    }

    /**
     * Get 安全事件2级分类，-1:未知 0:全部 1:DDOS事件 2:Web攻击 3:木马 4:异地登录 5:密码破解 
     * @return EventType2 安全事件2级分类，-1:未知 0:全部 1:DDOS事件 2:Web攻击 3:木马 4:异地登录 5:密码破解
     */
    public Long getEventType2() {
        return this.EventType2;
    }

    /**
     * Set 安全事件2级分类，-1:未知 0:全部 1:DDOS事件 2:Web攻击 3:木马 4:异地登录 5:密码破解
     * @param EventType2 安全事件2级分类，-1:未知 0:全部 1:DDOS事件 2:Web攻击 3:木马 4:异地登录 5:密码破解
     */
    public void setEventType2(Long EventType2) {
        this.EventType2 = EventType2;
    }

    /**
     * Get 风险等级，-1:未知 0:全部 1:低危 2:中危 3:高危 4:严重，可多选，如：1,2 
     * @return Level 风险等级，-1:未知 0:全部 1:低危 2:中危 3:高危 4:严重，可多选，如：1,2
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，-1:未知 0:全部 1:低危 2:中危 3:高危 4:严重，可多选，如：1,2
     * @param Level 风险等级，-1:未知 0:全部 1:低危 2:中危 3:高危 4:严重，可多选，如：1,2
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 安全事件状态，-1:未知 0:全部 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任 
     * @return Status 安全事件状态，-1:未知 0:全部 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 安全事件状态，-1:未知 0:全部 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
     * @param Status 安全事件状态，-1:未知 0:全部 1:待处理 2:已处理 3:误报 4:已忽略 5:已知晓 6:已信任
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 查询起始地址 
     * @return Offset 查询起始地址
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始地址
     * @param Offset 查询起始地址
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询个数 
     * @return Limit 查询个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数
     * @param Limit 查询个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get 私有字段和公有字段映射的原始采集数据唯一标识的MD5值 
     * @return OldIdMd5 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
     */
    public String getOldIdMd5() {
        return this.OldIdMd5;
    }

    /**
     * Set 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
     * @param OldIdMd5 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
     */
    public void setOldIdMd5(String OldIdMd5) {
        this.OldIdMd5 = OldIdMd5;
    }

    public SaEventPubRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaEventPubRequest(SaEventPubRequest source) {
        if (source.Asset != null) {
            this.Asset = new String(source.Asset);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType1 != null) {
            this.EventType1 = new Long(source.EventType1);
        }
        if (source.EventType2 != null) {
            this.EventType2 = new Long(source.EventType2);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.OldIdMd5 != null) {
            this.OldIdMd5 = new String(source.OldIdMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType1", this.EventType1);
        this.setParamSimple(map, prefix + "EventType2", this.EventType2);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OldIdMd5", this.OldIdMd5);

    }
}

