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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationDepartment extends AbstractModel{

    /**
    * 部门ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 部门名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeptName")
    @Expose
    private String DeptName;

    /**
    * 父部门ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentDeptId")
    @Expose
    private String ParentDeptId;

    /**
    * 客户系统部门ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeptOpenId")
    @Expose
    private String DeptOpenId;

    /**
    * 序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderNo")
    @Expose
    private Long OrderNo;

    /**
     * Get 部门ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeptId 部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 部门ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeptId 部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 部门名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeptName 部门名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeptName() {
        return this.DeptName;
    }

    /**
     * Set 部门名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeptName 部门名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    /**
     * Get 父部门ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentDeptId 父部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentDeptId() {
        return this.ParentDeptId;
    }

    /**
     * Set 父部门ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentDeptId 父部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentDeptId(String ParentDeptId) {
        this.ParentDeptId = ParentDeptId;
    }

    /**
     * Get 客户系统部门ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeptOpenId 客户系统部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeptOpenId() {
        return this.DeptOpenId;
    }

    /**
     * Set 客户系统部门ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeptOpenId 客户系统部门ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeptOpenId(String DeptOpenId) {
        this.DeptOpenId = DeptOpenId;
    }

    /**
     * Get 序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderNo 序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderNo 序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderNo(Long OrderNo) {
        this.OrderNo = OrderNo;
    }

    public IntegrationDepartment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationDepartment(IntegrationDepartment source) {
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.DeptName != null) {
            this.DeptName = new String(source.DeptName);
        }
        if (source.ParentDeptId != null) {
            this.ParentDeptId = new String(source.ParentDeptId);
        }
        if (source.DeptOpenId != null) {
            this.DeptOpenId = new String(source.DeptOpenId);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new Long(source.OrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "DeptName", this.DeptName);
        this.setParamSimple(map, prefix + "ParentDeptId", this.ParentDeptId);
        this.setParamSimple(map, prefix + "DeptOpenId", this.DeptOpenId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}

