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

public class ModifyPsaRegulationRequest extends AbstractModel {

    /**
    * 预授权规则ID
    */
    @SerializedName("PsaId")
    @Expose
    private String PsaId;

    /**
    * 预授权规则别名
    */
    @SerializedName("PsaName")
    @Expose
    private String PsaName;

    /**
    * 维修中的实例上限
    */
    @SerializedName("RepairLimit")
    @Expose
    private Long RepairLimit;

    /**
    * 预授权规则备注
    */
    @SerializedName("PsaDescription")
    @Expose
    private String PsaDescription;

    /**
    * 预授权规则关联故障类型ID列表
    */
    @SerializedName("TaskTypeIds")
    @Expose
    private Long [] TaskTypeIds;

    /**
     * Get 预授权规则ID 
     * @return PsaId 预授权规则ID
     */
    public String getPsaId() {
        return this.PsaId;
    }

    /**
     * Set 预授权规则ID
     * @param PsaId 预授权规则ID
     */
    public void setPsaId(String PsaId) {
        this.PsaId = PsaId;
    }

    /**
     * Get 预授权规则别名 
     * @return PsaName 预授权规则别名
     */
    public String getPsaName() {
        return this.PsaName;
    }

    /**
     * Set 预授权规则别名
     * @param PsaName 预授权规则别名
     */
    public void setPsaName(String PsaName) {
        this.PsaName = PsaName;
    }

    /**
     * Get 维修中的实例上限 
     * @return RepairLimit 维修中的实例上限
     */
    public Long getRepairLimit() {
        return this.RepairLimit;
    }

    /**
     * Set 维修中的实例上限
     * @param RepairLimit 维修中的实例上限
     */
    public void setRepairLimit(Long RepairLimit) {
        this.RepairLimit = RepairLimit;
    }

    /**
     * Get 预授权规则备注 
     * @return PsaDescription 预授权规则备注
     */
    public String getPsaDescription() {
        return this.PsaDescription;
    }

    /**
     * Set 预授权规则备注
     * @param PsaDescription 预授权规则备注
     */
    public void setPsaDescription(String PsaDescription) {
        this.PsaDescription = PsaDescription;
    }

    /**
     * Get 预授权规则关联故障类型ID列表 
     * @return TaskTypeIds 预授权规则关联故障类型ID列表
     */
    public Long [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * Set 预授权规则关联故障类型ID列表
     * @param TaskTypeIds 预授权规则关联故障类型ID列表
     */
    public void setTaskTypeIds(Long [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    public ModifyPsaRegulationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPsaRegulationRequest(ModifyPsaRegulationRequest source) {
        if (source.PsaId != null) {
            this.PsaId = new String(source.PsaId);
        }
        if (source.PsaName != null) {
            this.PsaName = new String(source.PsaName);
        }
        if (source.RepairLimit != null) {
            this.RepairLimit = new Long(source.RepairLimit);
        }
        if (source.PsaDescription != null) {
            this.PsaDescription = new String(source.PsaDescription);
        }
        if (source.TaskTypeIds != null) {
            this.TaskTypeIds = new Long[source.TaskTypeIds.length];
            for (int i = 0; i < source.TaskTypeIds.length; i++) {
                this.TaskTypeIds[i] = new Long(source.TaskTypeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PsaId", this.PsaId);
        this.setParamSimple(map, prefix + "PsaName", this.PsaName);
        this.setParamSimple(map, prefix + "RepairLimit", this.RepairLimit);
        this.setParamSimple(map, prefix + "PsaDescription", this.PsaDescription);
        this.setParamArraySimple(map, prefix + "TaskTypeIds.", this.TaskTypeIds);

    }
}

