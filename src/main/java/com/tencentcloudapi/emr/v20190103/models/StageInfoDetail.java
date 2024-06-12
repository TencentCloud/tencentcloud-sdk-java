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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StageInfoDetail extends AbstractModel {

    /**
    * 步骤id
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 步骤名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否展示
    */
    @SerializedName("IsShow")
    @Expose
    private Boolean IsShow;

    /**
    * 是否子流程
    */
    @SerializedName("IsSubFlow")
    @Expose
    private Boolean IsSubFlow;

    /**
    * 子流程标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubFlowFlag")
    @Expose
    private String SubFlowFlag;

    /**
    * 步骤运行状态：0:未开始 1:进行中 2:已完成 3:部分完成  -1:失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 步骤运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 运行进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Starttime")
    @Expose
    private String Starttime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endtime")
    @Expose
    private String Endtime;

    /**
    * 是否有详情信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HadWoodDetail")
    @Expose
    private Boolean HadWoodDetail;

    /**
    * Wood子流程Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WoodJobId")
    @Expose
    private Long WoodJobId;

    /**
    * 多语言版本Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanguageKey")
    @Expose
    private String LanguageKey;

    /**
    * 如果stage失败，失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 步骤耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeConsuming")
    @Expose
    private String TimeConsuming;

    /**
     * Get 步骤id 
     * @return Stage 步骤id
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 步骤id
     * @param Stage 步骤id
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 步骤名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 步骤名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 步骤名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 步骤名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否展示 
     * @return IsShow 是否展示
     */
    public Boolean getIsShow() {
        return this.IsShow;
    }

    /**
     * Set 是否展示
     * @param IsShow 是否展示
     */
    public void setIsShow(Boolean IsShow) {
        this.IsShow = IsShow;
    }

    /**
     * Get 是否子流程 
     * @return IsSubFlow 是否子流程
     */
    public Boolean getIsSubFlow() {
        return this.IsSubFlow;
    }

    /**
     * Set 是否子流程
     * @param IsSubFlow 是否子流程
     */
    public void setIsSubFlow(Boolean IsSubFlow) {
        this.IsSubFlow = IsSubFlow;
    }

    /**
     * Get 子流程标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubFlowFlag 子流程标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubFlowFlag() {
        return this.SubFlowFlag;
    }

    /**
     * Set 子流程标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubFlowFlag 子流程标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubFlowFlag(String SubFlowFlag) {
        this.SubFlowFlag = SubFlowFlag;
    }

    /**
     * Get 步骤运行状态：0:未开始 1:进行中 2:已完成 3:部分完成  -1:失败 
     * @return Status 步骤运行状态：0:未开始 1:进行中 2:已完成 3:部分完成  -1:失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 步骤运行状态：0:未开始 1:进行中 2:已完成 3:部分完成  -1:失败
     * @param Status 步骤运行状态：0:未开始 1:进行中 2:已完成 3:部分完成  -1:失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 步骤运行状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 步骤运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 步骤运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 步骤运行状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 运行进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 运行进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 运行进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 运行进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Starttime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStarttime() {
        return this.Starttime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Starttime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStarttime(String Starttime) {
        this.Starttime = Starttime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endtime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndtime() {
        return this.Endtime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endtime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndtime(String Endtime) {
        this.Endtime = Endtime;
    }

    /**
     * Get 是否有详情信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HadWoodDetail 是否有详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHadWoodDetail() {
        return this.HadWoodDetail;
    }

    /**
     * Set 是否有详情信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HadWoodDetail 是否有详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHadWoodDetail(Boolean HadWoodDetail) {
        this.HadWoodDetail = HadWoodDetail;
    }

    /**
     * Get Wood子流程Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WoodJobId Wood子流程Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWoodJobId() {
        return this.WoodJobId;
    }

    /**
     * Set Wood子流程Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WoodJobId Wood子流程Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWoodJobId(Long WoodJobId) {
        this.WoodJobId = WoodJobId;
    }

    /**
     * Get 多语言版本Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanguageKey 多语言版本Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanguageKey() {
        return this.LanguageKey;
    }

    /**
     * Set 多语言版本Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanguageKey 多语言版本Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanguageKey(String LanguageKey) {
        this.LanguageKey = LanguageKey;
    }

    /**
     * Get 如果stage失败，失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedReason 如果stage失败，失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 如果stage失败，失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedReason 如果stage失败，失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 步骤耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeConsuming 步骤耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeConsuming() {
        return this.TimeConsuming;
    }

    /**
     * Set 步骤耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeConsuming 步骤耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeConsuming(String TimeConsuming) {
        this.TimeConsuming = TimeConsuming;
    }

    public StageInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StageInfoDetail(StageInfoDetail source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsShow != null) {
            this.IsShow = new Boolean(source.IsShow);
        }
        if (source.IsSubFlow != null) {
            this.IsSubFlow = new Boolean(source.IsSubFlow);
        }
        if (source.SubFlowFlag != null) {
            this.SubFlowFlag = new String(source.SubFlowFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Starttime != null) {
            this.Starttime = new String(source.Starttime);
        }
        if (source.Endtime != null) {
            this.Endtime = new String(source.Endtime);
        }
        if (source.HadWoodDetail != null) {
            this.HadWoodDetail = new Boolean(source.HadWoodDetail);
        }
        if (source.WoodJobId != null) {
            this.WoodJobId = new Long(source.WoodJobId);
        }
        if (source.LanguageKey != null) {
            this.LanguageKey = new String(source.LanguageKey);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.TimeConsuming != null) {
            this.TimeConsuming = new String(source.TimeConsuming);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsShow", this.IsShow);
        this.setParamSimple(map, prefix + "IsSubFlow", this.IsSubFlow);
        this.setParamSimple(map, prefix + "SubFlowFlag", this.SubFlowFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Starttime", this.Starttime);
        this.setParamSimple(map, prefix + "Endtime", this.Endtime);
        this.setParamSimple(map, prefix + "HadWoodDetail", this.HadWoodDetail);
        this.setParamSimple(map, prefix + "WoodJobId", this.WoodJobId);
        this.setParamSimple(map, prefix + "LanguageKey", this.LanguageKey);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "TimeConsuming", this.TimeConsuming);

    }
}

