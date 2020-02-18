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

public class SyncCheckStepInfo extends AbstractModel{

    /**
    * 步骤序列
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 步骤展现名称
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤执行结果代码
    */
    @SerializedName("StepCode")
    @Expose
    private Long StepCode;

    /**
    * 步骤执行结果提示
    */
    @SerializedName("StepMessage")
    @Expose
    private String StepMessage;

    /**
     * Get 步骤序列 
     * @return StepNo 步骤序列
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤序列
     * @param StepNo 步骤序列
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 步骤展现名称 
     * @return StepName 步骤展现名称
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤展现名称
     * @param StepName 步骤展现名称
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 步骤执行结果代码 
     * @return StepCode 步骤执行结果代码
     */
    public Long getStepCode() {
        return this.StepCode;
    }

    /**
     * Set 步骤执行结果代码
     * @param StepCode 步骤执行结果代码
     */
    public void setStepCode(Long StepCode) {
        this.StepCode = StepCode;
    }

    /**
     * Get 步骤执行结果提示 
     * @return StepMessage 步骤执行结果提示
     */
    public String getStepMessage() {
        return this.StepMessage;
    }

    /**
     * Set 步骤执行结果提示
     * @param StepMessage 步骤执行结果提示
     */
    public void setStepMessage(String StepMessage) {
        this.StepMessage = StepMessage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepCode", this.StepCode);
        this.setParamSimple(map, prefix + "StepMessage", this.StepMessage);

    }
}

