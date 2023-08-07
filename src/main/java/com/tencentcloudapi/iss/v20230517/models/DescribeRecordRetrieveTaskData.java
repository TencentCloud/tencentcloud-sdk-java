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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordRetrieveTaskData extends AbstractModel{

    /**
    * 取回任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 取回任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 取回录像的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 取回录像的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 取回模式，1:极速模式，其他暂不支持
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 副本有效期
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * 任务状态，0:已取回，1:取回中，2:待取回
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 取回容量，单位MB
    */
    @SerializedName("Capacity")
    @Expose
    private Float Capacity;

    /**
    * 任务的设备通道id
    */
    @SerializedName("Channels")
    @Expose
    private RecordRetrieveTaskChannelInfo [] Channels;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 任务通道数量
    */
    @SerializedName("ChannelCount")
    @Expose
    private Long ChannelCount;

    /**
     * Get 取回任务ID 
     * @return TaskId 取回任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 取回任务ID
     * @param TaskId 取回任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 取回任务名称 
     * @return TaskName 取回任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 取回任务名称
     * @param TaskName 取回任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 取回录像的开始时间 
     * @return StartTime 取回录像的开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 取回录像的开始时间
     * @param StartTime 取回录像的开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 取回录像的结束时间 
     * @return EndTime 取回录像的结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 取回录像的结束时间
     * @param EndTime 取回录像的结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 取回模式，1:极速模式，其他暂不支持 
     * @return Mode 取回模式，1:极速模式，其他暂不支持
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 取回模式，1:极速模式，其他暂不支持
     * @param Mode 取回模式，1:极速模式，其他暂不支持
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 副本有效期 
     * @return Expiration 副本有效期
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 副本有效期
     * @param Expiration 副本有效期
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get 任务状态，0:已取回，1:取回中，2:待取回 
     * @return Status 任务状态，0:已取回，1:取回中，2:待取回
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，0:已取回，1:取回中，2:待取回
     * @param Status 任务状态，0:已取回，1:取回中，2:待取回
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 取回容量，单位MB 
     * @return Capacity 取回容量，单位MB
     */
    public Float getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 取回容量，单位MB
     * @param Capacity 取回容量，单位MB
     */
    public void setCapacity(Float Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get 任务的设备通道id 
     * @return Channels 任务的设备通道id
     */
    public RecordRetrieveTaskChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 任务的设备通道id
     * @param Channels 任务的设备通道id
     */
    public void setChannels(RecordRetrieveTaskChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 任务通道数量 
     * @return ChannelCount 任务通道数量
     */
    public Long getChannelCount() {
        return this.ChannelCount;
    }

    /**
     * Set 任务通道数量
     * @param ChannelCount 任务通道数量
     */
    public void setChannelCount(Long ChannelCount) {
        this.ChannelCount = ChannelCount;
    }

    public DescribeRecordRetrieveTaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordRetrieveTaskData(DescribeRecordRetrieveTaskData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Capacity != null) {
            this.Capacity = new Float(source.Capacity);
        }
        if (source.Channels != null) {
            this.Channels = new RecordRetrieveTaskChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new RecordRetrieveTaskChannelInfo(source.Channels[i]);
            }
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.ChannelCount != null) {
            this.ChannelCount = new Long(source.ChannelCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "ChannelCount", this.ChannelCount);

    }
}

