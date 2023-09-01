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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetInfoDetail extends AbstractModel{

    /**
    * 用户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * CVE编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * 是扫描，0默认未扫描，1正在扫描，2扫描完成，3扫描出错
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsScan")
    @Expose
    private Long IsScan;

    /**
    * 影响资产数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InfluenceAsset")
    @Expose
    private Long InfluenceAsset;

    /**
    * 未修复资产数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotRepairAsset")
    @Expose
    private Long NotRepairAsset;

    /**
    * 未防护资产数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotProtectAsset")
    @Expose
    private Long NotProtectAsset;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskPercent")
    @Expose
    private Long TaskPercent;

    /**
    * 任务时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTime")
    @Expose
    private Long TaskTime;

    /**
    * 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get 用户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get CVE编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVEId CVE编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set CVE编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVEId CVE编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get 是扫描，0默认未扫描，1正在扫描，2扫描完成，3扫描出错
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsScan 是扫描，0默认未扫描，1正在扫描，2扫描完成，3扫描出错
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsScan() {
        return this.IsScan;
    }

    /**
     * Set 是扫描，0默认未扫描，1正在扫描，2扫描完成，3扫描出错
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsScan 是扫描，0默认未扫描，1正在扫描，2扫描完成，3扫描出错
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsScan(Long IsScan) {
        this.IsScan = IsScan;
    }

    /**
     * Get 影响资产数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InfluenceAsset 影响资产数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInfluenceAsset() {
        return this.InfluenceAsset;
    }

    /**
     * Set 影响资产数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param InfluenceAsset 影响资产数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfluenceAsset(Long InfluenceAsset) {
        this.InfluenceAsset = InfluenceAsset;
    }

    /**
     * Get 未修复资产数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotRepairAsset 未修复资产数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotRepairAsset() {
        return this.NotRepairAsset;
    }

    /**
     * Set 未修复资产数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotRepairAsset 未修复资产数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotRepairAsset(Long NotRepairAsset) {
        this.NotRepairAsset = NotRepairAsset;
    }

    /**
     * Get 未防护资产数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotProtectAsset 未防护资产数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotProtectAsset() {
        return this.NotProtectAsset;
    }

    /**
     * Set 未防护资产数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotProtectAsset 未防护资产数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotProtectAsset(Long NotProtectAsset) {
        this.NotProtectAsset = NotProtectAsset;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskPercent 任务百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskPercent() {
        return this.TaskPercent;
    }

    /**
     * Set 任务百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskPercent 任务百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskPercent(Long TaskPercent) {
        this.TaskPercent = TaskPercent;
    }

    /**
     * Get 任务时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTime 任务时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set 任务时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTime 任务时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTime(Long TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get 扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTime 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTime 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    public AssetInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetInfoDetail(AssetInfoDetail source) {
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
        if (source.IsScan != null) {
            this.IsScan = new Long(source.IsScan);
        }
        if (source.InfluenceAsset != null) {
            this.InfluenceAsset = new Long(source.InfluenceAsset);
        }
        if (source.NotRepairAsset != null) {
            this.NotRepairAsset = new Long(source.NotRepairAsset);
        }
        if (source.NotProtectAsset != null) {
            this.NotProtectAsset = new Long(source.NotProtectAsset);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskPercent != null) {
            this.TaskPercent = new Long(source.TaskPercent);
        }
        if (source.TaskTime != null) {
            this.TaskTime = new Long(source.TaskTime);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);
        this.setParamSimple(map, prefix + "IsScan", this.IsScan);
        this.setParamSimple(map, prefix + "InfluenceAsset", this.InfluenceAsset);
        this.setParamSimple(map, prefix + "NotRepairAsset", this.NotRepairAsset);
        this.setParamSimple(map, prefix + "NotProtectAsset", this.NotProtectAsset);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskPercent", this.TaskPercent);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);

    }
}

