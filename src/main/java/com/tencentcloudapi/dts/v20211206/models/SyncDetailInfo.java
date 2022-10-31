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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDetailInfo extends AbstractModel{

    /**
    * 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * 总体进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * 同步两端数据量差距
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * 同步两端时间差距
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * 总体描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 详细步骤信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfos")
    @Expose
    private StepInfo [] StepInfos;

    /**
     * Get 总步骤数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepAll 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepAll 总步骤数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get 当前步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepNow 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepNow 当前步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get 总体进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 总体进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 总体进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 总体进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentStepProgress 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentStepProgress 当前步骤进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get 同步两端数据量差距
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterSlaveDistance 同步两端数据量差距
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set 同步两端数据量差距
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterSlaveDistance 同步两端数据量差距
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get 同步两端时间差距
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondsBehindMaster 同步两端时间差距
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set 同步两端时间差距
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondsBehindMaster 同步两端时间差距
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get 总体描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 总体描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 总体描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 总体描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 详细步骤信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfos 详细步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepInfo [] getStepInfos() {
        return this.StepInfos;
    }

    /**
     * Set 详细步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfos 详细步骤信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfos(StepInfo [] StepInfos) {
        this.StepInfos = StepInfos;
    }

    public SyncDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDetailInfo(SyncDetailInfo source) {
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new Long(source.CurrentStepProgress);
        }
        if (source.MasterSlaveDistance != null) {
            this.MasterSlaveDistance = new Long(source.MasterSlaveDistance);
        }
        if (source.SecondsBehindMaster != null) {
            this.SecondsBehindMaster = new Long(source.SecondsBehindMaster);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.StepInfos != null) {
            this.StepInfos = new StepInfo[source.StepInfos.length];
            for (int i = 0; i < source.StepInfos.length; i++) {
                this.StepInfos[i] = new StepInfo(source.StepInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CurrentStepProgress", this.CurrentStepProgress);
        this.setParamSimple(map, prefix + "MasterSlaveDistance", this.MasterSlaveDistance);
        this.setParamSimple(map, prefix + "SecondsBehindMaster", this.SecondsBehindMaster);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "StepInfos.", this.StepInfos);

    }
}

