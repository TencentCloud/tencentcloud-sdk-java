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

public class SyncDetailInfo  extends AbstractModel{

    /**
    * 总步骤数
    */
    @SerializedName("StepAll")
    @Expose
    private Integer StepAll;

    /**
    * 当前步骤
    */
    @SerializedName("StepNow")
    @Expose
    private Integer StepNow;

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
    private Integer MasterSlaveDistance;

    /**
    * 主从差距，秒
    */
    @SerializedName("SecondsBehindMaster")
    @Expose
    private Integer SecondsBehindMaster;

    /**
    * 步骤信息
    */
    @SerializedName("StepInfo")
    @Expose
    private SyncStepDetailInfo [] StepInfo;

    /**
     * 获取总步骤数
     * @return StepAll 总步骤数
     */
    public Integer getStepAll() {
        return this.StepAll;
    }

    /**
     * 设置总步骤数
     * @param StepAll 总步骤数
     */
    public void setStepAll(Integer StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * 获取当前步骤
     * @return StepNow 当前步骤
     */
    public Integer getStepNow() {
        return this.StepNow;
    }

    /**
     * 设置当前步骤
     * @param StepNow 当前步骤
     */
    public void setStepNow(Integer StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * 获取总进度
     * @return Progress 总进度
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * 设置总进度
     * @param Progress 总进度
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * 获取当前步骤进度
     * @return CurrentStepProgress 当前步骤进度
     */
    public String getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * 设置当前步骤进度
     * @param CurrentStepProgress 当前步骤进度
     */
    public void setCurrentStepProgress(String CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * 获取主从差距，MB
     * @return MasterSlaveDistance 主从差距，MB
     */
    public Integer getMasterSlaveDistance() {
        return this.MasterSlaveDistance;
    }

    /**
     * 设置主从差距，MB
     * @param MasterSlaveDistance 主从差距，MB
     */
    public void setMasterSlaveDistance(Integer MasterSlaveDistance) {
        this.MasterSlaveDistance = MasterSlaveDistance;
    }

    /**
     * 获取主从差距，秒
     * @return SecondsBehindMaster 主从差距，秒
     */
    public Integer getSecondsBehindMaster() {
        return this.SecondsBehindMaster;
    }

    /**
     * 设置主从差距，秒
     * @param SecondsBehindMaster 主从差距，秒
     */
    public void setSecondsBehindMaster(Integer SecondsBehindMaster) {
        this.SecondsBehindMaster = SecondsBehindMaster;
    }

    /**
     * 获取步骤信息
     * @return StepInfo 步骤信息
     */
    public SyncStepDetailInfo [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * 设置步骤信息
     * @param StepInfo 步骤信息
     */
    public void setStepInfo(SyncStepDetailInfo [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * 内部实现，用户禁止调用
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

