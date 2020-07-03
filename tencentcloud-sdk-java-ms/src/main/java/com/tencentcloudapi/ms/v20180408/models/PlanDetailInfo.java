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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanDetailInfo extends AbstractModel{

    /**
    * 默认策略，1为默认，0为非默认
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 策略id
    */
    @SerializedName("PlanId")
    @Expose
    private Long PlanId;

    /**
    * 策略名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 策略信息
    */
    @SerializedName("PlanInfo")
    @Expose
    private PlanInfo PlanInfo;

    /**
     * Get 默认策略，1为默认，0为非默认 
     * @return IsDefault 默认策略，1为默认，0为非默认
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 默认策略，1为默认，0为非默认
     * @param IsDefault 默认策略，1为默认，0为非默认
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 策略id 
     * @return PlanId 策略id
     */
    public Long getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 策略id
     * @param PlanId 策略id
     */
    public void setPlanId(Long PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 策略名称 
     * @return PlanName 策略名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 策略名称
     * @param PlanName 策略名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 策略信息 
     * @return PlanInfo 策略信息
     */
    public PlanInfo getPlanInfo() {
        return this.PlanInfo;
    }

    /**
     * Set 策略信息
     * @param PlanInfo 策略信息
     */
    public void setPlanInfo(PlanInfo PlanInfo) {
        this.PlanInfo = PlanInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamObj(map, prefix + "PlanInfo.", this.PlanInfo);

    }
}

