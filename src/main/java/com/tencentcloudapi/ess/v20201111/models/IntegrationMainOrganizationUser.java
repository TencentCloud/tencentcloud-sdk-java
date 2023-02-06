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

public class IntegrationMainOrganizationUser extends AbstractModel{

    /**
    * 主企业id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainOrganizationId")
    @Expose
    private String MainOrganizationId;

    /**
    * 主企业员工UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainUserId")
    @Expose
    private String MainUserId;

    /**
    * 主企业员工名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get 主企业id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainOrganizationId 主企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainOrganizationId() {
        return this.MainOrganizationId;
    }

    /**
     * Set 主企业id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainOrganizationId 主企业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainOrganizationId(String MainOrganizationId) {
        this.MainOrganizationId = MainOrganizationId;
    }

    /**
     * Get 主企业员工UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainUserId 主企业员工UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainUserId() {
        return this.MainUserId;
    }

    /**
     * Set 主企业员工UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainUserId 主企业员工UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainUserId(String MainUserId) {
        this.MainUserId = MainUserId;
    }

    /**
     * Get 主企业员工名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 主企业员工名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 主企业员工名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 主企业员工名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public IntegrationMainOrganizationUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationMainOrganizationUser(IntegrationMainOrganizationUser source) {
        if (source.MainOrganizationId != null) {
            this.MainOrganizationId = new String(source.MainOrganizationId);
        }
        if (source.MainUserId != null) {
            this.MainUserId = new String(source.MainUserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainOrganizationId", this.MainOrganizationId);
        this.setParamSimple(map, prefix + "MainUserId", this.MainUserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

