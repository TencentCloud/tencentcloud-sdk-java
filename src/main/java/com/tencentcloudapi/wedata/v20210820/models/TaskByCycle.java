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

public class TaskByCycle extends AbstractModel{

    /**
    * num
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 周期单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get num
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number num
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set num
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number num
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 周期单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit 周期单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public TaskByCycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskByCycle(TaskByCycle source) {
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

