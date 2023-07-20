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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunOpsMakePlanInstancesRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 补录计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 补录实例ID集合，为空则重跑整个补录计划失败实例。实例ID格式为"${TASK_ID}_${INSTANCE_DATA_TIME}"，即“任务ID_任务实例数据时间”。
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 补录计划ID 
     * @return PlanId 补录计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 补录计划ID
     * @param PlanId 补录计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 补录实例ID集合，为空则重跑整个补录计划失败实例。实例ID格式为"${TASK_ID}_${INSTANCE_DATA_TIME}"，即“任务ID_任务实例数据时间”。 
     * @return InstanceIdList 补录实例ID集合，为空则重跑整个补录计划失败实例。实例ID格式为"${TASK_ID}_${INSTANCE_DATA_TIME}"，即“任务ID_任务实例数据时间”。
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 补录实例ID集合，为空则重跑整个补录计划失败实例。实例ID格式为"${TASK_ID}_${INSTANCE_DATA_TIME}"，即“任务ID_任务实例数据时间”。
     * @param InstanceIdList 补录实例ID集合，为空则重跑整个补录计划失败实例。实例ID格式为"${TASK_ID}_${INSTANCE_DATA_TIME}"，即“任务ID_任务实例数据时间”。
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    public RerunOpsMakePlanInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunOpsMakePlanInstancesRequest(RerunOpsMakePlanInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);

    }
}

