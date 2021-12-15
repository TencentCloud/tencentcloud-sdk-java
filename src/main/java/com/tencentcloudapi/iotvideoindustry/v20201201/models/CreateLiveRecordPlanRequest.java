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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveRecordPlanRequest extends AbstractModel{

    /**
    * 录制计划名
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 计划类型 1：固定直播 2：移动直播
    */
    @SerializedName("PlanType")
    @Expose
    private Long PlanType;

    /**
    * 时间模板ID,固定直播时为必填
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 录制文件存储时长，单位天，默认30天
    */
    @SerializedName("RecordStorageTime")
    @Expose
    private Long RecordStorageTime;

    /**
    * 绑定的直播频道ID列表
    */
    @SerializedName("LiveChannelIds")
    @Expose
    private String [] LiveChannelIds;

    /**
     * Get 录制计划名 
     * @return PlanName 录制计划名
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 录制计划名
     * @param PlanName 录制计划名
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 计划类型 1：固定直播 2：移动直播 
     * @return PlanType 计划类型 1：固定直播 2：移动直播
     */
    public Long getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 计划类型 1：固定直播 2：移动直播
     * @param PlanType 计划类型 1：固定直播 2：移动直播
     */
    public void setPlanType(Long PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 时间模板ID,固定直播时为必填 
     * @return TemplateId 时间模板ID,固定直播时为必填
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 时间模板ID,固定直播时为必填
     * @param TemplateId 时间模板ID,固定直播时为必填
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 录制文件存储时长，单位天，默认30天 
     * @return RecordStorageTime 录制文件存储时长，单位天，默认30天
     */
    public Long getRecordStorageTime() {
        return this.RecordStorageTime;
    }

    /**
     * Set 录制文件存储时长，单位天，默认30天
     * @param RecordStorageTime 录制文件存储时长，单位天，默认30天
     */
    public void setRecordStorageTime(Long RecordStorageTime) {
        this.RecordStorageTime = RecordStorageTime;
    }

    /**
     * Get 绑定的直播频道ID列表 
     * @return LiveChannelIds 绑定的直播频道ID列表
     */
    public String [] getLiveChannelIds() {
        return this.LiveChannelIds;
    }

    /**
     * Set 绑定的直播频道ID列表
     * @param LiveChannelIds 绑定的直播频道ID列表
     */
    public void setLiveChannelIds(String [] LiveChannelIds) {
        this.LiveChannelIds = LiveChannelIds;
    }

    public CreateLiveRecordPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveRecordPlanRequest(CreateLiveRecordPlanRequest source) {
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.PlanType != null) {
            this.PlanType = new Long(source.PlanType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.RecordStorageTime != null) {
            this.RecordStorageTime = new Long(source.RecordStorageTime);
        }
        if (source.LiveChannelIds != null) {
            this.LiveChannelIds = new String[source.LiveChannelIds.length];
            for (int i = 0; i < source.LiveChannelIds.length; i++) {
                this.LiveChannelIds[i] = new String(source.LiveChannelIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "RecordStorageTime", this.RecordStorageTime);
        this.setParamArraySimple(map, prefix + "LiveChannelIds.", this.LiveChannelIds);

    }
}

