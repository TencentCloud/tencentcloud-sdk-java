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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulScanImageInfo extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像大小
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * 任务状态:SCANNING:扫描中 FAILED:失败 FINISHED:完成 CANCELED:取消
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 扫描时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanDuration")
    @Expose
    private Float ScanDuration;

    /**
    * 高危漏洞数
    */
    @SerializedName("HighLevelVulCount")
    @Expose
    private Long HighLevelVulCount;

    /**
    * 中危漏洞数
    */
    @SerializedName("MediumLevelVulCount")
    @Expose
    private Long MediumLevelVulCount;

    /**
    * 低危漏洞数
    */
    @SerializedName("LowLevelVulCount")
    @Expose
    private Long LowLevelVulCount;

    /**
    * 严重漏洞数
    */
    @SerializedName("CriticalLevelVulCount")
    @Expose
    private Long CriticalLevelVulCount;

    /**
    * 本地镜像漏洞扫描任务ID
    */
    @SerializedName("TaskID")
    @Expose
    private Long TaskID;

    /**
    * 漏洞扫描的开始时间
    */
    @SerializedName("ScanStartTime")
    @Expose
    private String ScanStartTime;

    /**
    * 漏洞扫描的结束时间
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 失败原因:TIMEOUT:超时 TOO_MANY:任务过多 OFFLINE:离线
    */
    @SerializedName("ErrorStatus")
    @Expose
    private String ErrorStatus;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像大小 
     * @return Size 镜像大小
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set 镜像大小
     * @param Size 镜像大小
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get 任务状态:SCANNING:扫描中 FAILED:失败 FINISHED:完成 CANCELED:取消 
     * @return ScanStatus 任务状态:SCANNING:扫描中 FAILED:失败 FINISHED:完成 CANCELED:取消
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 任务状态:SCANNING:扫描中 FAILED:失败 FINISHED:完成 CANCELED:取消
     * @param ScanStatus 任务状态:SCANNING:扫描中 FAILED:失败 FINISHED:完成 CANCELED:取消
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 扫描时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanDuration 扫描时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScanDuration() {
        return this.ScanDuration;
    }

    /**
     * Set 扫描时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanDuration 扫描时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanDuration(Float ScanDuration) {
        this.ScanDuration = ScanDuration;
    }

    /**
     * Get 高危漏洞数 
     * @return HighLevelVulCount 高危漏洞数
     */
    public Long getHighLevelVulCount() {
        return this.HighLevelVulCount;
    }

    /**
     * Set 高危漏洞数
     * @param HighLevelVulCount 高危漏洞数
     */
    public void setHighLevelVulCount(Long HighLevelVulCount) {
        this.HighLevelVulCount = HighLevelVulCount;
    }

    /**
     * Get 中危漏洞数 
     * @return MediumLevelVulCount 中危漏洞数
     */
    public Long getMediumLevelVulCount() {
        return this.MediumLevelVulCount;
    }

    /**
     * Set 中危漏洞数
     * @param MediumLevelVulCount 中危漏洞数
     */
    public void setMediumLevelVulCount(Long MediumLevelVulCount) {
        this.MediumLevelVulCount = MediumLevelVulCount;
    }

    /**
     * Get 低危漏洞数 
     * @return LowLevelVulCount 低危漏洞数
     */
    public Long getLowLevelVulCount() {
        return this.LowLevelVulCount;
    }

    /**
     * Set 低危漏洞数
     * @param LowLevelVulCount 低危漏洞数
     */
    public void setLowLevelVulCount(Long LowLevelVulCount) {
        this.LowLevelVulCount = LowLevelVulCount;
    }

    /**
     * Get 严重漏洞数 
     * @return CriticalLevelVulCount 严重漏洞数
     */
    public Long getCriticalLevelVulCount() {
        return this.CriticalLevelVulCount;
    }

    /**
     * Set 严重漏洞数
     * @param CriticalLevelVulCount 严重漏洞数
     */
    public void setCriticalLevelVulCount(Long CriticalLevelVulCount) {
        this.CriticalLevelVulCount = CriticalLevelVulCount;
    }

    /**
     * Get 本地镜像漏洞扫描任务ID 
     * @return TaskID 本地镜像漏洞扫描任务ID
     */
    public Long getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 本地镜像漏洞扫描任务ID
     * @param TaskID 本地镜像漏洞扫描任务ID
     */
    public void setTaskID(Long TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 漏洞扫描的开始时间 
     * @return ScanStartTime 漏洞扫描的开始时间
     */
    public String getScanStartTime() {
        return this.ScanStartTime;
    }

    /**
     * Set 漏洞扫描的开始时间
     * @param ScanStartTime 漏洞扫描的开始时间
     */
    public void setScanStartTime(String ScanStartTime) {
        this.ScanStartTime = ScanStartTime;
    }

    /**
     * Get 漏洞扫描的结束时间 
     * @return ScanEndTime 漏洞扫描的结束时间
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 漏洞扫描的结束时间
     * @param ScanEndTime 漏洞扫描的结束时间
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get 失败原因:TIMEOUT:超时 TOO_MANY:任务过多 OFFLINE:离线 
     * @return ErrorStatus 失败原因:TIMEOUT:超时 TOO_MANY:任务过多 OFFLINE:离线
     */
    public String getErrorStatus() {
        return this.ErrorStatus;
    }

    /**
     * Set 失败原因:TIMEOUT:超时 TOO_MANY:任务过多 OFFLINE:离线
     * @param ErrorStatus 失败原因:TIMEOUT:超时 TOO_MANY:任务过多 OFFLINE:离线
     */
    public void setErrorStatus(String ErrorStatus) {
        this.ErrorStatus = ErrorStatus;
    }

    public VulScanImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulScanImageInfo(VulScanImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.ScanDuration != null) {
            this.ScanDuration = new Float(source.ScanDuration);
        }
        if (source.HighLevelVulCount != null) {
            this.HighLevelVulCount = new Long(source.HighLevelVulCount);
        }
        if (source.MediumLevelVulCount != null) {
            this.MediumLevelVulCount = new Long(source.MediumLevelVulCount);
        }
        if (source.LowLevelVulCount != null) {
            this.LowLevelVulCount = new Long(source.LowLevelVulCount);
        }
        if (source.CriticalLevelVulCount != null) {
            this.CriticalLevelVulCount = new Long(source.CriticalLevelVulCount);
        }
        if (source.TaskID != null) {
            this.TaskID = new Long(source.TaskID);
        }
        if (source.ScanStartTime != null) {
            this.ScanStartTime = new String(source.ScanStartTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.ErrorStatus != null) {
            this.ErrorStatus = new String(source.ErrorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanDuration", this.ScanDuration);
        this.setParamSimple(map, prefix + "HighLevelVulCount", this.HighLevelVulCount);
        this.setParamSimple(map, prefix + "MediumLevelVulCount", this.MediumLevelVulCount);
        this.setParamSimple(map, prefix + "LowLevelVulCount", this.LowLevelVulCount);
        this.setParamSimple(map, prefix + "CriticalLevelVulCount", this.CriticalLevelVulCount);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "ScanStartTime", this.ScanStartTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "ErrorStatus", this.ErrorStatus);

    }
}

