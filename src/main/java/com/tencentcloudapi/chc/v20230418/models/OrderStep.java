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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderStep extends AbstractModel {

    /**
    * 步骤名
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 处理人
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 此步骤状态
    */
    @SerializedName("StepStatus")
    @Expose
    private String StepStatus;

    /**
     * Get 步骤名 
     * @return StepName 步骤名
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤名
     * @param StepName 步骤名
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 处理人 
     * @return OwnerName 处理人
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 处理人
     * @param OwnerName 处理人
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 完成时间 
     * @return FinishTime 完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 完成时间
     * @param FinishTime 完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 此步骤状态 
     * @return StepStatus 此步骤状态
     */
    public String getStepStatus() {
        return this.StepStatus;
    }

    /**
     * Set 此步骤状态
     * @param StepStatus 此步骤状态
     */
    public void setStepStatus(String StepStatus) {
        this.StepStatus = StepStatus;
    }

    public OrderStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderStep(OrderStep source) {
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.StepStatus != null) {
            this.StepStatus = new String(source.StepStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "StepStatus", this.StepStatus);

    }
}

