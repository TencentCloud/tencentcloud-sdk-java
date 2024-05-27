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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunChangePwdTaskRequest extends AbstractModel {

    /**
    * 任务Id
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 部门id
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 改密任务详情
    */
    @SerializedName("Details")
    @Expose
    private RunChangePwdTaskDetail [] Details;

    /**
     * Get 任务Id 
     * @return OperationId 任务Id
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 任务Id
     * @param OperationId 任务Id
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 部门id 
     * @return DepartmentId 部门id
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门id
     * @param DepartmentId 部门id
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 改密任务详情 
     * @return Details 改密任务详情
     */
    public RunChangePwdTaskDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 改密任务详情
     * @param Details 改密任务详情
     */
    public void setDetails(RunChangePwdTaskDetail [] Details) {
        this.Details = Details;
    }

    public RunChangePwdTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunChangePwdTaskRequest(RunChangePwdTaskRequest source) {
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.Details != null) {
            this.Details = new RunChangePwdTaskDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new RunChangePwdTaskDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

