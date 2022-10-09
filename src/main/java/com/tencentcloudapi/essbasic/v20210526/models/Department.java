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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Department extends AbstractModel{

    /**
    * 部门id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 部门名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentName")
    @Expose
    private String DepartmentName;

    /**
     * Get 部门id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentId 部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentId 部门id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 部门名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentName 部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartmentName() {
        return this.DepartmentName;
    }

    /**
     * Set 部门名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentName 部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public Department() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Department(Department source) {
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.DepartmentName != null) {
            this.DepartmentName = new String(source.DepartmentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "DepartmentName", this.DepartmentName);

    }
}

