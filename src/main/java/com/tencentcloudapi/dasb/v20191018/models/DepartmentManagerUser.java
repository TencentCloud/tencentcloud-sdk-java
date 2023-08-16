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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DepartmentManagerUser extends AbstractModel{

    /**
    * 管理员Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * 管理员姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagerName")
    @Expose
    private String ManagerName;

    /**
     * Get 管理员Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagerId 管理员Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 管理员Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagerId 管理员Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 管理员姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagerName 管理员姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagerName() {
        return this.ManagerName;
    }

    /**
     * Set 管理员姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagerName 管理员姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    public DepartmentManagerUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DepartmentManagerUser(DepartmentManagerUser source) {
        if (source.ManagerId != null) {
            this.ManagerId = new String(source.ManagerId);
        }
        if (source.ManagerName != null) {
            this.ManagerName = new String(source.ManagerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ManagerName", this.ManagerName);

    }
}

