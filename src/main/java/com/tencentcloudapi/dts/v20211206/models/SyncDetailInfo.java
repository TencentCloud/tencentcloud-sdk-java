/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * <p>总步骤数</p>
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * <p>当前步骤</p>
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * <p>总体进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * <p>同步两端数据量差距</p>
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * <p>同步两端时间差距</p>
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * <p>总体描述信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>详细步骤信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfos")
    @Expose
    private StepInfo [] StepInfos;

    /**
    * <p>不能发起内置校验的原因</p>
    */
    @SerializedName("CauseOfCompareDisable")
    @Expose
    private String CauseOfCompareDisable;

    /**
    * <p>任务的错误和解决方案信息</p>
    */
    @SerializedName("ErrInfo")
    @Expose
    private ErrInfo ErrInfo;

    /**
     * Get <p>总步骤数</p> 
     * @return StepAll <p>总步骤数</p>
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set <p>总步骤数</p>
     * @param StepAll <p>总步骤数</p>
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get <p>当前步骤</p> 
     * @return StepNow <p>当前步骤</p>
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set <p>当前步骤</p>
     * @param StepNow <p>当前步骤</p>
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get <p>总体进度</p> 
     * @return Progress <p>总体进度</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>总体进度</p>
     * @param Progress <p>总体进度</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p> 
     * @return CurrentStepProgress <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
     * @param CurrentStepProgress <p>当前步骤进度，范围为[0-100]，若为-1表示当前步骤不支持查看进度</p>
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get <p>同步两端数据量差距</p> 
     * @return MasterSlaveDistance <p>同步两端数据量差距</p>
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set <p>同步两端数据量差距</p>
     * @param MasterSlaveDistance <p>同步两端数据量差距</p>
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get <p>同步两端时间差距</p> 
     * @return SecondsBehindMaster <p>同步两端时间差距</p>
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set <p>同步两端时间差距</p>
     * @param SecondsBehindMaster <p>同步两端时间差距</p>
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get <p>总体描述信息</p> 
     * @return Message <p>总体描述信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>总体描述信息</p>
     * @param Message <p>总体描述信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>详细步骤信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfos <p>详细步骤信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StepInfo [] getStepInfos() {
        return this.StepInfos;
    }

    /**
     * Set <p>详细步骤信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfos <p>详细步骤信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfos(StepInfo [] StepInfos) {
        this.StepInfos = StepInfos;
    }

    /**
     * Get <p>不能发起内置校验的原因</p> 
     * @return CauseOfCompareDisable <p>不能发起内置校验的原因</p>
     */
    public String getCauseOfCompareDisable() {
        return this.CauseOfCompareDisable;
    }

    /**
     * Set <p>不能发起内置校验的原因</p>
     * @param CauseOfCompareDisable <p>不能发起内置校验的原因</p>
     */
    public void setCauseOfCompareDisable(String CauseOfCompareDisable) {
        this.CauseOfCompareDisable = CauseOfCompareDisable;
    }

    /**
     * Get <p>任务的错误和解决方案信息</p> 
     * @return ErrInfo <p>任务的错误和解决方案信息</p>
     */
    public ErrInfo getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set <p>任务的错误和解决方案信息</p>
     * @param ErrInfo <p>任务的错误和解决方案信息</p>
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

