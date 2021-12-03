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

public class DescribeVideoListRequest extends AbstractModel{

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 开始时间戳，秒级
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳，秒级
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 开始录制范围 开始
    */
    @SerializedName("StartRecordTime")
    @Expose
    private Long StartRecordTime;

    /**
    * 开始录制范围 结束
    */
    @SerializedName("EndRecordTime")
    @Expose
    private Long EndRecordTime;

    /**
    * 过期时间范围 开始
    */
    @SerializedName("StartExpireTime")
    @Expose
    private Long StartExpireTime;

    /**
    * 过期时间范围 结束
    */
    @SerializedName("EndExpireTime")
    @Expose
    private Long EndExpireTime;

    /**
    * 文件大小范围 开始 单位byte
    */
    @SerializedName("StartFileSize")
    @Expose
    private Long StartFileSize;

    /**
    * 文件大小范围 结束 单位byte
    */
    @SerializedName("EndFileSize")
    @Expose
    private Long EndFileSize;

    /**
    * 录制状态 99: 录制方已经回写状态 1: 开始录制了，等待回写 2: 已经到了时间模板的停止时间，在等待录制方回写
    */
    @SerializedName("IsRecording")
    @Expose
    private Long IsRecording;

    /**
    * 通道ID默认必传
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 录制计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private Long SceneId;

    /**
    * 告警ID
    */
    @SerializedName("WarnId")
    @Expose
    private Long WarnId;

    /**
    * 录制类型 1: 联动计划录制 2: 告警录制
    */
    @SerializedName("RecordType")
    @Expose
    private Long [] RecordType;

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制 
     * @return Limit 限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制
     * @param Limit 限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 开始时间戳，秒级 
     * @return StartTime 开始时间戳，秒级
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳，秒级
     * @param StartTime 开始时间戳，秒级
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳，秒级 
     * @return EndTime 结束时间戳，秒级
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳，秒级
     * @param EndTime 结束时间戳，秒级
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 设备Id 
     * @return DeviceId 设备Id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备Id
     * @param DeviceId 设备Id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 开始录制范围 开始 
     * @return StartRecordTime 开始录制范围 开始
     */
    public Long getStartRecordTime() {
        return this.StartRecordTime;
    }

    /**
     * Set 开始录制范围 开始
     * @param StartRecordTime 开始录制范围 开始
     */
    public void setStartRecordTime(Long StartRecordTime) {
        this.StartRecordTime = StartRecordTime;
    }

    /**
     * Get 开始录制范围 结束 
     * @return EndRecordTime 开始录制范围 结束
     */
    public Long getEndRecordTime() {
        return this.EndRecordTime;
    }

    /**
     * Set 开始录制范围 结束
     * @param EndRecordTime 开始录制范围 结束
     */
    public void setEndRecordTime(Long EndRecordTime) {
        this.EndRecordTime = EndRecordTime;
    }

    /**
     * Get 过期时间范围 开始 
     * @return StartExpireTime 过期时间范围 开始
     */
    public Long getStartExpireTime() {
        return this.StartExpireTime;
    }

    /**
     * Set 过期时间范围 开始
     * @param StartExpireTime 过期时间范围 开始
     */
    public void setStartExpireTime(Long StartExpireTime) {
        this.StartExpireTime = StartExpireTime;
    }

    /**
     * Get 过期时间范围 结束 
     * @return EndExpireTime 过期时间范围 结束
     */
    public Long getEndExpireTime() {
        return this.EndExpireTime;
    }

    /**
     * Set 过期时间范围 结束
     * @param EndExpireTime 过期时间范围 结束
     */
    public void setEndExpireTime(Long EndExpireTime) {
        this.EndExpireTime = EndExpireTime;
    }

    /**
     * Get 文件大小范围 开始 单位byte 
     * @return StartFileSize 文件大小范围 开始 单位byte
     */
    public Long getStartFileSize() {
        return this.StartFileSize;
    }

    /**
     * Set 文件大小范围 开始 单位byte
     * @param StartFileSize 文件大小范围 开始 单位byte
     */
    public void setStartFileSize(Long StartFileSize) {
        this.StartFileSize = StartFileSize;
    }

    /**
     * Get 文件大小范围 结束 单位byte 
     * @return EndFileSize 文件大小范围 结束 单位byte
     */
    public Long getEndFileSize() {
        return this.EndFileSize;
    }

    /**
     * Set 文件大小范围 结束 单位byte
     * @param EndFileSize 文件大小范围 结束 单位byte
     */
    public void setEndFileSize(Long EndFileSize) {
        this.EndFileSize = EndFileSize;
    }

    /**
     * Get 录制状态 99: 录制方已经回写状态 1: 开始录制了，等待回写 2: 已经到了时间模板的停止时间，在等待录制方回写 
     * @return IsRecording 录制状态 99: 录制方已经回写状态 1: 开始录制了，等待回写 2: 已经到了时间模板的停止时间，在等待录制方回写
     */
    public Long getIsRecording() {
        return this.IsRecording;
    }

    /**
     * Set 录制状态 99: 录制方已经回写状态 1: 开始录制了，等待回写 2: 已经到了时间模板的停止时间，在等待录制方回写
     * @param IsRecording 录制状态 99: 录制方已经回写状态 1: 开始录制了，等待回写 2: 已经到了时间模板的停止时间，在等待录制方回写
     */
    public void setIsRecording(Long IsRecording) {
        this.IsRecording = IsRecording;
    }

    /**
     * Get 通道ID默认必传 
     * @return ChannelId 通道ID默认必传
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID默认必传
     * @param ChannelId 通道ID默认必传
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 录制计划ID 
     * @return PlanId 录制计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 录制计划ID
     * @param PlanId 录制计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public Long getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(Long SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 告警ID 
     * @return WarnId 告警ID
     */
    public Long getWarnId() {
        return this.WarnId;
    }

    /**
     * Set 告警ID
     * @param WarnId 告警ID
     */
    public void setWarnId(Long WarnId) {
        this.WarnId = WarnId;
    }

    /**
     * Get 录制类型 1: 联动计划录制 2: 告警录制 
     * @return RecordType 录制类型 1: 联动计划录制 2: 告警录制
     */
    public Long [] getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 录制类型 1: 联动计划录制 2: 告警录制
     * @param RecordType 录制类型 1: 联动计划录制 2: 告警录制
     */
    public void setRecordType(Long [] RecordType) {
        this.RecordType = RecordType;
    }

    public DescribeVideoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoListRequest(DescribeVideoListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.StartRecordTime != null) {
            this.StartRecordTime = new Long(source.StartRecordTime);
        }
        if (source.EndRecordTime != null) {
            this.EndRecordTime = new Long(source.EndRecordTime);
        }
        if (source.StartExpireTime != null) {
            this.StartExpireTime = new Long(source.StartExpireTime);
        }
        if (source.EndExpireTime != null) {
            this.EndExpireTime = new Long(source.EndExpireTime);
        }
        if (source.StartFileSize != null) {
            this.StartFileSize = new Long(source.StartFileSize);
        }
        if (source.EndFileSize != null) {
            this.EndFileSize = new Long(source.EndFileSize);
        }
        if (source.IsRecording != null) {
            this.IsRecording = new Long(source.IsRecording);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.SceneId != null) {
            this.SceneId = new Long(source.SceneId);
        }
        if (source.WarnId != null) {
            this.WarnId = new Long(source.WarnId);
        }
        if (source.RecordType != null) {
            this.RecordType = new Long[source.RecordType.length];
            for (int i = 0; i < source.RecordType.length; i++) {
                this.RecordType[i] = new Long(source.RecordType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "StartRecordTime", this.StartRecordTime);
        this.setParamSimple(map, prefix + "EndRecordTime", this.EndRecordTime);
        this.setParamSimple(map, prefix + "StartExpireTime", this.StartExpireTime);
        this.setParamSimple(map, prefix + "EndExpireTime", this.EndExpireTime);
        this.setParamSimple(map, prefix + "StartFileSize", this.StartFileSize);
        this.setParamSimple(map, prefix + "EndFileSize", this.EndFileSize);
        this.setParamSimple(map, prefix + "IsRecording", this.IsRecording);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "WarnId", this.WarnId);
        this.setParamArraySimple(map, prefix + "RecordType.", this.RecordType);

    }
}

