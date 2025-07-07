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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOperationLog extends AbstractModel {

    /**
    * 操作步骤
    */
    @SerializedName("TaskStep")
    @Expose
    private String TaskStep;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 操作描述
    */
    @SerializedName("OperationDetail")
    @Expose
    private String OperationDetail;

    /**
    * 操作时间
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
     * Get 操作步骤 
     * @return TaskStep 操作步骤
     */
    public String getTaskStep() {
        return this.TaskStep;
    }

    /**
     * Set 操作步骤
     * @param TaskStep 操作步骤
     */
    public void setTaskStep(String TaskStep) {
        this.TaskStep = TaskStep;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 操作描述 
     * @return OperationDetail 操作描述
     */
    public String getOperationDetail() {
        return this.OperationDetail;
    }

    /**
     * Set 操作描述
     * @param OperationDetail 操作描述
     */
    public void setOperationDetail(String OperationDetail) {
        this.OperationDetail = OperationDetail;
    }

    /**
     * Get 操作时间 
     * @return OperationTime 操作时间
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 操作时间
     * @param OperationTime 操作时间
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    public TaskOperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOperationLog(TaskOperationLog source) {
        if (source.TaskStep != null) {
            this.TaskStep = new String(source.TaskStep);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.OperationDetail != null) {
            this.OperationDetail = new String(source.OperationDetail);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStep", this.TaskStep);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "OperationDetail", this.OperationDetail);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);

    }
}

