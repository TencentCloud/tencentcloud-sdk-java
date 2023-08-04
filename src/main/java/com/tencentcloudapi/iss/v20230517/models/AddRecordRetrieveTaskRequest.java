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

public class AddRecordRetrieveTaskRequest extends AbstractModel{

    /**
    * 任务名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 取回录像的开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 取回录像的结束时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 取回模式， 1:极速模式，其他暂不支持
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 取回录像副本有效期，最小为1天，最大为365天
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * 设备通道，一个任务最多32个设备通道
    */
    @SerializedName("Channels")
    @Expose
    private ChannelInfo [] Channels;

    /**
    * 取回任务描述
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
     * Get 任务名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复 
     * @return TaskName 任务名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复
     * @param TaskName 任务名称，仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 取回录像的开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天 
     * @return StartTime 取回录像的开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 取回录像的开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     * @param StartTime 取回录像的开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 取回录像的结束时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天 
     * @return EndTime 取回录像的结束时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 取回录像的结束时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     * @param EndTime 取回录像的结束时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 取回模式， 1:极速模式，其他暂不支持 
     * @return Mode 取回模式， 1:极速模式，其他暂不支持
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 取回模式， 1:极速模式，其他暂不支持
     * @param Mode 取回模式， 1:极速模式，其他暂不支持
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 取回录像副本有效期，最小为1天，最大为365天 
     * @return Expiration 取回录像副本有效期，最小为1天，最大为365天
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 取回录像副本有效期，最小为1天，最大为365天
     * @param Expiration 取回录像副本有效期，最小为1天，最大为365天
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get 设备通道，一个任务最多32个设备通道 
     * @return Channels 设备通道，一个任务最多32个设备通道
     */
    public ChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 设备通道，一个任务最多32个设备通道
     * @param Channels 设备通道，一个任务最多32个设备通道
     */
    public void setChannels(ChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 取回任务描述 
     * @return Describe 取回任务描述
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 取回任务描述
     * @param Describe 取回任务描述
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    public AddRecordRetrieveTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordRetrieveTaskRequest(AddRecordRetrieveTaskRequest source) {
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
        if (source.Channels != null) {
            this.Channels = new ChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelInfo(source.Channels[i]);
            }
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamSimple(map, prefix + "Describe", this.Describe);

    }
}

