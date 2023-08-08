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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDeployableRuntimesMCRequest extends AbstractModel{

    /**
    * 应用id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 版本类型 0-pro 1-lite
    */
    @SerializedName("PlanType")
    @Expose
    private Long PlanType;

    /**
    * 0：应用集成，1：API，2：ETL
    */
    @SerializedName("RuntimeClass")
    @Expose
    private Long RuntimeClass;

    /**
     * Get 应用id 
     * @return ProjectId 应用id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 应用id
     * @param ProjectId 应用id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 版本类型 0-pro 1-lite 
     * @return PlanType 版本类型 0-pro 1-lite
     */
    public Long getPlanType() {
        return this.PlanType;
    }

    /**
     * Set 版本类型 0-pro 1-lite
     * @param PlanType 版本类型 0-pro 1-lite
     */
    public void setPlanType(Long PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 0：应用集成，1：API，2：ETL 
     * @return RuntimeClass 0：应用集成，1：API，2：ETL
     */
    public Long getRuntimeClass() {
        return this.RuntimeClass;
    }

    /**
     * Set 0：应用集成，1：API，2：ETL
     * @param RuntimeClass 0：应用集成，1：API，2：ETL
     */
    public void setRuntimeClass(Long RuntimeClass) {
        this.RuntimeClass = RuntimeClass;
    }

    public ListDeployableRuntimesMCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDeployableRuntimesMCRequest(ListDeployableRuntimesMCRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.PlanType != null) {
            this.PlanType = new Long(source.PlanType);
        }
        if (source.RuntimeClass != null) {
            this.RuntimeClass = new Long(source.RuntimeClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "RuntimeClass", this.RuntimeClass);

    }
}

