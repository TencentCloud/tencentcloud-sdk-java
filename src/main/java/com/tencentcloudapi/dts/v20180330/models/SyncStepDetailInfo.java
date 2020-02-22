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

public class SyncStepDetailInfo extends AbstractModel{

    /**
    * 步骤编号
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 步骤名
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 能否中止
    */
    @SerializedName("CanStop")
    @Expose
    private Long CanStop;

    /**
    * 步骤号
    */
    @SerializedName("StepId")
    @Expose
    private Long StepId;

    /**
     * Get 步骤编号 
     * @return StepNo 步骤编号
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤编号
     * @param StepNo 步骤编号
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

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
     * Get 能否中止 
     * @return CanStop 能否中止
     */
    public Long getCanStop() {
        return this.CanStop;
    }

    /**
     * Set 能否中止
     * @param CanStop 能否中止
     */
    public void setCanStop(Long CanStop) {
        this.CanStop = CanStop;
    }

    /**
     * Get 步骤号 
     * @return StepId 步骤号
     */
    public Long getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤号
     * @param StepId 步骤号
     */
    public void setStepId(Long StepId) {
        this.StepId = StepId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "CanStop", this.CanStop);
        this.setParamSimple(map, prefix + "StepId", this.StepId);

    }
}

