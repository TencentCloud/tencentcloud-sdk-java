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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePsaRegulationRequest extends AbstractModel{

    /**
    * 规则别名
    */
    @SerializedName("PsaName")
    @Expose
    private String PsaName;

    /**
    * 关联的故障类型ID列表
    */
    @SerializedName("TaskTypeIds")
    @Expose
    private Long [] TaskTypeIds;

    /**
    * 维修实例上限，默认为5
    */
    @SerializedName("RepairLimit")
    @Expose
    private Long RepairLimit;

    /**
    * 规则备注
    */
    @SerializedName("PsaDescription")
    @Expose
    private String PsaDescription;

    /**
     * Get 规则别名 
     * @return PsaName 规则别名
     */
    public String getPsaName() {
        return this.PsaName;
    }

    /**
     * Set 规则别名
     * @param PsaName 规则别名
     */
    public void setPsaName(String PsaName) {
        this.PsaName = PsaName;
    }

    /**
     * Get 关联的故障类型ID列表 
     * @return TaskTypeIds 关联的故障类型ID列表
     */
    public Long [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * Set 关联的故障类型ID列表
     * @param TaskTypeIds 关联的故障类型ID列表
     */
    public void setTaskTypeIds(Long [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    /**
     * Get 维修实例上限，默认为5 
     * @return RepairLimit 维修实例上限，默认为5
     */
    public Long getRepairLimit() {
        return this.RepairLimit;
    }

    /**
     * Set 维修实例上限，默认为5
     * @param RepairLimit 维修实例上限，默认为5
     */
    public void setRepairLimit(Long RepairLimit) {
        this.RepairLimit = RepairLimit;
    }

    /**
     * Get 规则备注 
     * @return PsaDescription 规则备注
     */
    public String getPsaDescription() {
        return this.PsaDescription;
    }

    /**
     * Set 规则备注
     * @param PsaDescription 规则备注
     */
    public void setPsaDescription(String PsaDescription) {
        this.PsaDescription = PsaDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PsaName", this.PsaName);
        this.setParamArraySimple(map, prefix + "TaskTypeIds.", this.TaskTypeIds);
        this.setParamSimple(map, prefix + "RepairLimit", this.RepairLimit);
        this.setParamSimple(map, prefix + "PsaDescription", this.PsaDescription);

    }
}

