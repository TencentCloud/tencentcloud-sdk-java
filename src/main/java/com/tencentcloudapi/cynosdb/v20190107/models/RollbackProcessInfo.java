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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackProcessInfo extends AbstractModel {

    /**
    * 是否可以交换vip
    */
    @SerializedName("IsVipSwitchable")
    @Expose
    private Boolean IsVipSwitchable;

    /**
    * vip可交换时间
    */
    @SerializedName("VipSwitchableTime")
    @Expose
    private String VipSwitchableTime;

    /**
    * 交换实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExchangeInstanceInfoList")
    @Expose
    private ExchangeInstanceInfo [] ExchangeInstanceInfoList;

    /**
    * 交换RO组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExchangeRoGroupInfoList")
    @Expose
    private ExchangeRoGroupInfo [] ExchangeRoGroupInfoList;

    /**
    * 当前步骤
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * 当前步骤进度
    */
    @SerializedName("CurrentStepProgress")
    @Expose
    private Long CurrentStepProgress;

    /**
    * 当前步骤剩余时间
    */
    @SerializedName("CurrentStepRemainingTime")
    @Expose
    private String CurrentStepRemainingTime;

    /**
     * Get 是否可以交换vip 
     * @return IsVipSwitchable 是否可以交换vip
     */
    public Boolean getIsVipSwitchable() {
        return this.IsVipSwitchable;
    }

    /**
     * Set 是否可以交换vip
     * @param IsVipSwitchable 是否可以交换vip
     */
    public void setIsVipSwitchable(Boolean IsVipSwitchable) {
        this.IsVipSwitchable = IsVipSwitchable;
    }

    /**
     * Get vip可交换时间 
     * @return VipSwitchableTime vip可交换时间
     */
    public String getVipSwitchableTime() {
        return this.VipSwitchableTime;
    }

    /**
     * Set vip可交换时间
     * @param VipSwitchableTime vip可交换时间
     */
    public void setVipSwitchableTime(String VipSwitchableTime) {
        this.VipSwitchableTime = VipSwitchableTime;
    }

    /**
     * Get 交换实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExchangeInstanceInfoList 交换实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExchangeInstanceInfo [] getExchangeInstanceInfoList() {
        return this.ExchangeInstanceInfoList;
    }

    /**
     * Set 交换实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExchangeInstanceInfoList 交换实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExchangeInstanceInfoList(ExchangeInstanceInfo [] ExchangeInstanceInfoList) {
        this.ExchangeInstanceInfoList = ExchangeInstanceInfoList;
    }

    /**
     * Get 交换RO组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExchangeRoGroupInfoList 交换RO组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExchangeRoGroupInfo [] getExchangeRoGroupInfoList() {
        return this.ExchangeRoGroupInfoList;
    }

    /**
     * Set 交换RO组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExchangeRoGroupInfoList 交换RO组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExchangeRoGroupInfoList(ExchangeRoGroupInfo [] ExchangeRoGroupInfoList) {
        this.ExchangeRoGroupInfoList = ExchangeRoGroupInfoList;
    }

    /**
     * Get 当前步骤 
     * @return CurrentStep 当前步骤
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 当前步骤
     * @param CurrentStep 当前步骤
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 当前步骤进度 
     * @return CurrentStepProgress 当前步骤进度
     */
    public Long getCurrentStepProgress() {
        return this.CurrentStepProgress;
    }

    /**
     * Set 当前步骤进度
     * @param CurrentStepProgress 当前步骤进度
     */
    public void setCurrentStepProgress(Long CurrentStepProgress) {
        this.CurrentStepProgress = CurrentStepProgress;
    }

    /**
     * Get 当前步骤剩余时间 
     * @return CurrentStepRemainingTime 当前步骤剩余时间
     */
    public String getCurrentStepRemainingTime() {
        return this.CurrentStepRemainingTime;
    }

    /**
     * Set 当前步骤剩余时间
     * @param CurrentStepRemainingTime 当前步骤剩余时间
     */
    public void setCurrentStepRemainingTime(String CurrentStepRemainingTime) {
        this.CurrentStepRemainingTime = CurrentStepRemainingTime;
    }

    public RollbackProcessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackProcessInfo(RollbackProcessInfo source) {
        if (source.IsVipSwitchable != null) {
            this.IsVipSwitchable = new Boolean(source.IsVipSwitchable);
        }
        if (source.VipSwitchableTime != null) {
            this.VipSwitchableTime = new String(source.VipSwitchableTime);
        }
        if (source.ExchangeInstanceInfoList != null) {
            this.ExchangeInstanceInfoList = new ExchangeInstanceInfo[source.ExchangeInstanceInfoList.length];
            for (int i = 0; i < source.ExchangeInstanceInfoList.length; i++) {
                this.ExchangeInstanceInfoList[i] = new ExchangeInstanceInfo(source.ExchangeInstanceInfoList[i]);
            }
        }
        if (source.ExchangeRoGroupInfoList != null) {
            this.ExchangeRoGroupInfoList = new ExchangeRoGroupInfo[source.ExchangeRoGroupInfoList.length];
            for (int i = 0; i < source.ExchangeRoGroupInfoList.length; i++) {
                this.ExchangeRoGroupInfoList[i] = new ExchangeRoGroupInfo(source.ExchangeRoGroupInfoList[i]);
            }
        }
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.CurrentStepProgress != null) {
            this.CurrentStepProgress = new Long(source.CurrentStepProgress);
        }
        if (source.CurrentStepRemainingTime != null) {
            this.CurrentStepRemainingTime = new String(source.CurrentStepRemainingTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsVipSwitchable", this.IsVipSwitchable);
        this.setParamSimple(map, prefix + "VipSwitchableTime", this.VipSwitchableTime);
        this.setParamArrayObj(map, prefix + "ExchangeInstanceInfoList.", this.ExchangeInstanceInfoList);
        this.setParamArrayObj(map, prefix + "ExchangeRoGroupInfoList.", this.ExchangeRoGroupInfoList);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "CurrentStepProgress", this.CurrentStepProgress);
        this.setParamSimple(map, prefix + "CurrentStepRemainingTime", this.CurrentStepRemainingTime);

    }
}

