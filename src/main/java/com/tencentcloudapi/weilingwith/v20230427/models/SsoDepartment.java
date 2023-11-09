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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SsoDepartment extends AbstractModel {

    /**
    * 部门ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 部门名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 父级部门ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentDepartmentId")
    @Expose
    private String ParentDepartmentId;

    /**
     * Get 部门ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentId 部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentId 部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 部门名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 部门名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 部门名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 父级部门ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentDepartmentId 父级部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentDepartmentId() {
        return this.ParentDepartmentId;
    }

    /**
     * Set 父级部门ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentDepartmentId 父级部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentDepartmentId(String ParentDepartmentId) {
        this.ParentDepartmentId = ParentDepartmentId;
    }

    public SsoDepartment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SsoDepartment(SsoDepartment source) {
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentDepartmentId != null) {
            this.ParentDepartmentId = new String(source.ParentDepartmentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentDepartmentId", this.ParentDepartmentId);

    }
}

