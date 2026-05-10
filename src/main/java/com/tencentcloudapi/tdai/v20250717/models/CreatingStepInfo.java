/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatingStepInfo extends AbstractModel {

    /**
    * <p>步骤名称</p>
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * <p>步骤描述</p>
    */
    @SerializedName("StepDesc")
    @Expose
    private String StepDesc;

    /**
    * <p>步骤状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>完成时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>错误信息描述</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>步骤名称</p> 
     * @return StepName <p>步骤名称</p>
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set <p>步骤名称</p>
     * @param StepName <p>步骤名称</p>
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get <p>步骤描述</p> 
     * @return StepDesc <p>步骤描述</p>
     */
    public String getStepDesc() {
        return this.StepDesc;
    }

    /**
     * Set <p>步骤描述</p>
     * @param StepDesc <p>步骤描述</p>
     */
    public void setStepDesc(String StepDesc) {
        this.StepDesc = StepDesc;
    }

    /**
     * Get <p>步骤状态</p> 
     * @return Status <p>步骤状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>步骤状态</p>
     * @param Status <p>步骤状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>完成时间</p> 
     * @return FinishTime <p>完成时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间</p>
     * @param FinishTime <p>完成时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>错误信息描述</p> 
     * @return ErrMsg <p>错误信息描述</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>错误信息描述</p>
     * @param ErrMsg <p>错误信息描述</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public CreatingStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatingStepInfo(CreatingStepInfo source) {
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.StepDesc != null) {
            this.StepDesc = new String(source.StepDesc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepDesc", this.StepDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

