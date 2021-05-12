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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrationStep extends AbstractModel{

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
    * 英文ID标识
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 英文ID标识 
     * @return StepId 英文ID标识
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 英文ID标识
     * @param StepId 英文ID标识
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行 
     * @return Status 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     * @param Status 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public MigrationStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationStep(MigrationStep source) {
        if (source.StepNo != null) {
            this.StepNo = new Long(source.StepNo);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepId != null) {
            this.StepId = new String(source.StepId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

