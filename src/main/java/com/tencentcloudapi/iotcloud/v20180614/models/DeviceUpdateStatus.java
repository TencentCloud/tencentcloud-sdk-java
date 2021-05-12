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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceUpdateStatus extends AbstractModel{

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 最后处理时间
    */
    @SerializedName("LastProcessTime")
    @Expose
    private Long LastProcessTime;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 返回码
    */
    @SerializedName("Retcode")
    @Expose
    private Long Retcode;

    /**
    * 目标更新版本
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * 下载中状态时的下载进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 原版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriVersion")
    @Expose
    private String OriVersion;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 最后处理时间 
     * @return LastProcessTime 最后处理时间
     */
    public Long getLastProcessTime() {
        return this.LastProcessTime;
    }

    /**
     * Set 最后处理时间
     * @param LastProcessTime 最后处理时间
     */
    public void setLastProcessTime(Long LastProcessTime) {
        this.LastProcessTime = LastProcessTime;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误消息 
     * @return ErrMsg 错误消息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误消息
     * @param ErrMsg 错误消息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 返回码 
     * @return Retcode 返回码
     */
    public Long getRetcode() {
        return this.Retcode;
    }

    /**
     * Set 返回码
     * @param Retcode 返回码
     */
    public void setRetcode(Long Retcode) {
        this.Retcode = Retcode;
    }

    /**
     * Get 目标更新版本 
     * @return DstVersion 目标更新版本
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set 目标更新版本
     * @param DstVersion 目标更新版本
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get 下载中状态时的下载进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 下载中状态时的下载进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 下载中状态时的下载进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 下载中状态时的下载进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 原版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriVersion 原版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriVersion() {
        return this.OriVersion;
    }

    /**
     * Set 原版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriVersion 原版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriVersion(String OriVersion) {
        this.OriVersion = OriVersion;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DeviceUpdateStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceUpdateStatus(DeviceUpdateStatus source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.LastProcessTime != null) {
            this.LastProcessTime = new Long(source.LastProcessTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Retcode != null) {
            this.Retcode = new Long(source.Retcode);
        }
        if (source.DstVersion != null) {
            this.DstVersion = new String(source.DstVersion);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.OriVersion != null) {
            this.OriVersion = new String(source.OriVersion);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "LastProcessTime", this.LastProcessTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Retcode", this.Retcode);
        this.setParamSimple(map, prefix + "DstVersion", this.DstVersion);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "OriVersion", this.OriVersion);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

