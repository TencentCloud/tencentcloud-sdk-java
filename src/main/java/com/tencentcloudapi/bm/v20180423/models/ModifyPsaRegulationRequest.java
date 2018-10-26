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

public class ModifyPsaRegulationRequest  extends AbstractModel{

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
    private Integer RepairLimit;

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
    private Integer [] TaskTypeIds;

    /**
     * 获取预授权规则ID
     * @return PsaId 预授权规则ID
     */
    public String getPsaId() {
        return this.PsaId;
    }

    /**
     * 设置预授权规则ID
     * @param PsaId 预授权规则ID
     */
    public void setPsaId(String PsaId) {
        this.PsaId = PsaId;
    }

    /**
     * 获取预授权规则别名
     * @return PsaName 预授权规则别名
     */
    public String getPsaName() {
        return this.PsaName;
    }

    /**
     * 设置预授权规则别名
     * @param PsaName 预授权规则别名
     */
    public void setPsaName(String PsaName) {
        this.PsaName = PsaName;
    }

    /**
     * 获取维修中的实例上限
     * @return RepairLimit 维修中的实例上限
     */
    public Integer getRepairLimit() {
        return this.RepairLimit;
    }

    /**
     * 设置维修中的实例上限
     * @param RepairLimit 维修中的实例上限
     */
    public void setRepairLimit(Integer RepairLimit) {
        this.RepairLimit = RepairLimit;
    }

    /**
     * 获取预授权规则备注
     * @return PsaDescription 预授权规则备注
     */
    public String getPsaDescription() {
        return this.PsaDescription;
    }

    /**
     * 设置预授权规则备注
     * @param PsaDescription 预授权规则备注
     */
    public void setPsaDescription(String PsaDescription) {
        this.PsaDescription = PsaDescription;
    }

    /**
     * 获取预授权规则关联故障类型ID列表
     * @return TaskTypeIds 预授权规则关联故障类型ID列表
     */
    public Integer [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * 设置预授权规则关联故障类型ID列表
     * @param TaskTypeIds 预授权规则关联故障类型ID列表
     */
    public void setTaskTypeIds(Integer [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PsaId", this.PsaId);
        this.setParamSimple(map, prefix + "PsaName", this.PsaName);
        this.setParamSimple(map, prefix + "RepairLimit", this.RepairLimit);
        this.setParamSimple(map, prefix + "PsaDescription", this.PsaDescription);
        this.setParamArraySimple(map, prefix + "TaskTypeIds.", this.TaskTypeIds);

    }
}

