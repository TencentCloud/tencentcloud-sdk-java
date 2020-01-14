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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionResourceSummaryConditionValue extends AbstractModel{

    /**
    * 产品列表
    */
    @SerializedName("Business")
    @Expose
    private ConditionBusiness [] Business;

    /**
    * 项目列表
    */
    @SerializedName("Project")
    @Expose
    private ConditionProject [] Project;

    /**
    * 地域列表
    */
    @SerializedName("Region")
    @Expose
    private ConditionRegion [] Region;

    /**
    * 付费模式列表
    */
    @SerializedName("PayMode")
    @Expose
    private ConditionPayMode [] PayMode;

    /**
     * Get 产品列表 
     * @return Business 产品列表
     */
    public ConditionBusiness [] getBusiness() {
        return this.Business;
    }

    /**
     * Set 产品列表
     * @param Business 产品列表
     */
    public void setBusiness(ConditionBusiness [] Business) {
        this.Business = Business;
    }

    /**
     * Get 项目列表 
     * @return Project 项目列表
     */
    public ConditionProject [] getProject() {
        return this.Project;
    }

    /**
     * Set 项目列表
     * @param Project 项目列表
     */
    public void setProject(ConditionProject [] Project) {
        this.Project = Project;
    }

    /**
     * Get 地域列表 
     * @return Region 地域列表
     */
    public ConditionRegion [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域列表
     * @param Region 地域列表
     */
    public void setRegion(ConditionRegion [] Region) {
        this.Region = Region;
    }

    /**
     * Get 付费模式列表 
     * @return PayMode 付费模式列表
     */
    public ConditionPayMode [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式列表
     * @param PayMode 付费模式列表
     */
    public void setPayMode(ConditionPayMode [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamArrayObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Region.", this.Region);
        this.setParamArrayObj(map, prefix + "PayMode.", this.PayMode);

    }
}

