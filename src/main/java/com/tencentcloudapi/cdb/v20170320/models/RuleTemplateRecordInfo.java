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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleTemplateRecordInfo extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 修改前规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyBeforeInfo")
    @Expose
    private RuleTemplateInfo ModifyBeforeInfo;

    /**
    * 修改后规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyAfterInfo")
    @Expose
    private RuleTemplateInfo ModifyAfterInfo;

    /**
    * 影响的实例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedInstances")
    @Expose
    private String [] AffectedInstances;

    /**
    * 操作人，账号uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 变更的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 修改前规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyBeforeInfo 修改前规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleTemplateInfo getModifyBeforeInfo() {
        return this.ModifyBeforeInfo;
    }

    /**
     * Set 修改前规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyBeforeInfo 修改前规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyBeforeInfo(RuleTemplateInfo ModifyBeforeInfo) {
        this.ModifyBeforeInfo = ModifyBeforeInfo;
    }

    /**
     * Get 修改后规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyAfterInfo 修改后规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleTemplateInfo getModifyAfterInfo() {
        return this.ModifyAfterInfo;
    }

    /**
     * Set 修改后规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyAfterInfo 修改后规则模板的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyAfterInfo(RuleTemplateInfo ModifyAfterInfo) {
        this.ModifyAfterInfo = ModifyAfterInfo;
    }

    /**
     * Get 影响的实例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedInstances 影响的实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAffectedInstances() {
        return this.AffectedInstances;
    }

    /**
     * Set 影响的实例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedInstances 影响的实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedInstances(String [] AffectedInstances) {
        this.AffectedInstances = AffectedInstances;
    }

    /**
     * Get 操作人，账号uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作人，账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人，账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作人，账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 变更的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 变更的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 变更的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 变更的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RuleTemplateRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplateRecordInfo(RuleTemplateRecordInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.ModifyBeforeInfo != null) {
            this.ModifyBeforeInfo = new RuleTemplateInfo(source.ModifyBeforeInfo);
        }
        if (source.ModifyAfterInfo != null) {
            this.ModifyAfterInfo = new RuleTemplateInfo(source.ModifyAfterInfo);
        }
        if (source.AffectedInstances != null) {
            this.AffectedInstances = new String[source.AffectedInstances.length];
            for (int i = 0; i < source.AffectedInstances.length; i++) {
                this.AffectedInstances[i] = new String(source.AffectedInstances[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "ModifyBeforeInfo.", this.ModifyBeforeInfo);
        this.setParamObj(map, prefix + "ModifyAfterInfo.", this.ModifyAfterInfo);
        this.setParamArraySimple(map, prefix + "AffectedInstances.", this.AffectedInstances);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

