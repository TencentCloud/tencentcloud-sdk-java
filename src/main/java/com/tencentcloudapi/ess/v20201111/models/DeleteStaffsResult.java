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

public class DeleteStaffsResult extends AbstractModel{

    /**
    * 删除员工的成功数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessEmployeeData")
    @Expose
    private SuccessDeleteStaffData [] SuccessEmployeeData;

    /**
    * 删除员工的失败数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedEmployeeData")
    @Expose
    private FailedDeleteStaffData [] FailedEmployeeData;

    /**
     * Get 删除员工的成功数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessEmployeeData 删除员工的成功数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuccessDeleteStaffData [] getSuccessEmployeeData() {
        return this.SuccessEmployeeData;
    }

    /**
     * Set 删除员工的成功数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessEmployeeData 删除员工的成功数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessEmployeeData(SuccessDeleteStaffData [] SuccessEmployeeData) {
        this.SuccessEmployeeData = SuccessEmployeeData;
    }

    /**
     * Get 删除员工的失败数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedEmployeeData 删除员工的失败数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailedDeleteStaffData [] getFailedEmployeeData() {
        return this.FailedEmployeeData;
    }

    /**
     * Set 删除员工的失败数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedEmployeeData 删除员工的失败数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedEmployeeData(FailedDeleteStaffData [] FailedEmployeeData) {
        this.FailedEmployeeData = FailedEmployeeData;
    }

    public DeleteStaffsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStaffsResult(DeleteStaffsResult source) {
        if (source.SuccessEmployeeData != null) {
            this.SuccessEmployeeData = new SuccessDeleteStaffData[source.SuccessEmployeeData.length];
            for (int i = 0; i < source.SuccessEmployeeData.length; i++) {
                this.SuccessEmployeeData[i] = new SuccessDeleteStaffData(source.SuccessEmployeeData[i]);
            }
        }
        if (source.FailedEmployeeData != null) {
            this.FailedEmployeeData = new FailedDeleteStaffData[source.FailedEmployeeData.length];
            for (int i = 0; i < source.FailedEmployeeData.length; i++) {
                this.FailedEmployeeData[i] = new FailedDeleteStaffData(source.FailedEmployeeData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SuccessEmployeeData.", this.SuccessEmployeeData);
        this.setParamArrayObj(map, prefix + "FailedEmployeeData.", this.FailedEmployeeData);

    }
}

