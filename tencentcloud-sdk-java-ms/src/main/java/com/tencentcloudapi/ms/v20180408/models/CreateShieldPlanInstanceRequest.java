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

public class CreateShieldPlanInstanceRequest extends AbstractModel{

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 策略名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 策略具体信息
    */
    @SerializedName("PlanInfo")
    @Expose
    private PlanInfo PlanInfo;

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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
     * Get 策略具体信息 
     * @return PlanInfo 策略具体信息
     */
    public PlanInfo getPlanInfo() {
        return this.PlanInfo;
    }

    /**
     * Set 策略具体信息
     * @param PlanInfo 策略具体信息
     */
    public void setPlanInfo(PlanInfo PlanInfo) {
        this.PlanInfo = PlanInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamObj(map, prefix + "PlanInfo.", this.PlanInfo);

    }
}

