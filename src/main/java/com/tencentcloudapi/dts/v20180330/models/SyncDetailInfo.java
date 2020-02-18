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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDetailInfo extends AbstractModel{

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
    * 总进度
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 当前步骤进度
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private String CurrentStepProgress;

    /**
    * 主从差距，MB
    */
    @SerializedName("MasterSlaveDistance")
    @Expose
    private Long MasterSlaveDistance;

    /**
    * 主从差距，秒
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Long SecondsBehindMaster;

    /**
    * 步骤信息
    */
    @SerializedName("StepInfo")
    @Expose
    private SyncStepDetailInfo [] StepInfo;

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
     * Get 总进度 
     * @return Progress 总进度
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set 总进度
     * @param Progress 总进度
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 当前步骤进度 
     * @return CurrentStepProgress 当前步骤进度
     */
    public String getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set 当前步骤进度
     * @param CurrentStepProgress 当前步骤进度
     */
    public void setCurrentStepProgress(String CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get 主从差距，MB 
     * @return MasterSlaveDistance 主从差距，MB
     */
    public Long getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * Set 主从差距，MB
     * @param MasterSlaveDistance 主从差距，MB
     */
    public void setMasterSlaveDistance(Long MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * Get 主从差距，秒 
     * @return SecondsBehindMaster 主从差距，秒
     */
    public Long getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * Set 主从差距，秒
     * @param SecondsBehindMaster 主从差距，秒
     */
    public void setSecondsBehindMaster(Long SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * Get 步骤信息 
     * @return StepInfo 步骤信息
     */
    public SyncStepDetailInfo [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set 步骤信息
     * @param StepInfo 步骤信息
     */
    public void setStepInfo(SyncStepDetailInfo [] StepInfo) {
        this.StepInfo = StepInfo;
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
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);

    }
}

