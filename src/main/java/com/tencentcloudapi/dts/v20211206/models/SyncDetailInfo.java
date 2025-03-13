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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDetailInfo extends AbstractModel {

    /**
    * 总步骤数
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * 当前步骤
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * 总体进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * 同步两端数据量差距
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * 同步两端时间差距
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * 总体描述信息
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
    * 不能发起一致性校验的原因
    */
    @SerializedName("CauseOfCompareDisable")
    @Expose
    private String CauseOfCompareDisable;

    /**
    * 任务的错误和解决方案信息
    */
    @SerializedName("ErrInfo")
    @Expose
    private ErrInfo ErrInfo;

    /**
     * Get 总步骤数 
     * @return StepAll 总步骤数
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set 总步骤数
     * @param StepAll 总步骤数
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get 当前步骤 
     * @return StepNow 当前步骤
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set 当前步骤
     * @param StepNow 当前步骤
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get 总体进度 
     * @return Progress 总体进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 总体进度
     * @param Progress 总体进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度 
     * @return CurrentStepProgress 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
     * @param CurrentStepProgress 当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get 同步两端数据量差距 
     * @return MasterSlaveDistance 同步两端数据量差距
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set 同步两端数据量差距
     * @param MasterSlaveDistance 同步两端数据量差距
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get 同步两端时间差距 
     * @return SecondsBehindMaster 同步两端时间差距
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set 同步两端时间差距
     * @param SecondsBehindMaster 同步两端时间差距
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get 总体描述信息 
     * @return Message 总体描述信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 总体描述信息
     * @param Message 总体描述信息
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

    /**
     * Get 不能发起一致性校验的原因 
     * @return CauseOfCompareDisable 不能发起一致性校验的原因
     */
    public String getCauseOfCompareDisable() {
        return this.CauseOfCompareDisable;
    }

    /**
     * Set 不能发起一致性校验的原因
     * @param CauseOfCompareDisable 不能发起一致性校验的原因
     */
    public void setCauseOfCompareDisable(String CauseOfCompareDisable) {
        this.CauseOfCompareDisable = CauseOfCompareDisable;
    }

    /**
     * Get 任务的错误和解决方案信息 
     * @return ErrInfo 任务的错误和解决方案信息
     */
    public ErrInfo getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set 任务的错误和解决方案信息
     * @param ErrInfo 任务的错误和解决方案信息
     */
    public void setErrInfo(ErrInfo ErrInfo) {
        this.ErrInfo = ErrInfo;
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
        if (source.CauseOfCompareDisable != null) {
            this.CauseOfCompareDisable = new String(source.CauseOfCompareDisable);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new ErrInfo(source.ErrInfo);
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
        this.setParamSimple(map, prefix + "CauseOfCompareDisable", this.CauseOfCompareDisable);
        this.setParamObj(map, prefix + "ErrInfo.", this.ErrInfo);

    }
}

