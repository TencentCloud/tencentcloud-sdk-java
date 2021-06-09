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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPurgeFetchTaskStatusRequest extends AbstractModel{

    /**
    * 执行时间
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * 执行状态
success: 成功
failed: 失败
    */
    @SerializedName("ExecutionStatus")
    @Expose
    private String ExecutionStatus;

    /**
    * 任务 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 执行状态详情
    */
    @SerializedName("ExecutionStatusDesc")
    @Expose
    private String ExecutionStatusDesc;

    /**
     * Get 执行时间 
     * @return ExecutionTime 执行时间
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set 执行时间
     * @param ExecutionTime 执行时间
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get 执行状态
success: 成功
failed: 失败 
     * @return ExecutionStatus 执行状态
success: 成功
failed: 失败
     */
    public String getExecutionStatus() {
        return this.ExecutionStatus;
    }

    /**
     * Set 执行状态
success: 成功
failed: 失败
     * @param ExecutionStatus 执行状态
success: 成功
failed: 失败
     */
    public void setExecutionStatus(String ExecutionStatus) {
        this.ExecutionStatus = ExecutionStatus;
    }

    /**
     * Get 任务 ID 
     * @return Id 任务 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务 ID
     * @param Id 任务 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 执行状态详情 
     * @return ExecutionStatusDesc 执行状态详情
     */
    public String getExecutionStatusDesc() {
        return this.ExecutionStatusDesc;
    }

    /**
     * Set 执行状态详情
     * @param ExecutionStatusDesc 执行状态详情
     */
    public void setExecutionStatusDesc(String ExecutionStatusDesc) {
        this.ExecutionStatusDesc = ExecutionStatusDesc;
    }

    public ModifyPurgeFetchTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPurgeFetchTaskStatusRequest(ModifyPurgeFetchTaskStatusRequest source) {
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.ExecutionStatus != null) {
            this.ExecutionStatus = new String(source.ExecutionStatus);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ExecutionStatusDesc != null) {
            this.ExecutionStatusDesc = new String(source.ExecutionStatusDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "ExecutionStatus", this.ExecutionStatus);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ExecutionStatusDesc", this.ExecutionStatusDesc);

    }
}

