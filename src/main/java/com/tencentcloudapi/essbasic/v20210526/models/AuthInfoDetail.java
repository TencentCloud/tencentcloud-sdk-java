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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthInfoDetail extends AbstractModel {

    /**
    * 扩展服务类型，和入参一致	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 扩展服务名称	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 授权员工列表	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAuthUserList")
    @Expose
    private HasAuthUser [] HasAuthUserList;

    /**
    * 授权企业列表（企业自动签时，该字段有值）	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAuthOrganizationList")
    @Expose
    private HasAuthOrganization [] HasAuthOrganizationList;

    /**
    * 授权员工列表总数	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthUserTotal")
    @Expose
    private Long AuthUserTotal;

    /**
    * 授权企业列表总数	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthOrganizationTotal")
    @Expose
    private Long AuthOrganizationTotal;

    /**
     * Get 扩展服务类型，和入参一致	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 扩展服务类型，和入参一致	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 扩展服务类型，和入参一致	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 扩展服务类型，和入参一致	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 扩展服务名称	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 扩展服务名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩展服务名称	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 扩展服务名称	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 授权员工列表	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAuthUserList 授权员工列表	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HasAuthUser [] getHasAuthUserList() {
        return this.HasAuthUserList;
    }

    /**
     * Set 授权员工列表	
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAuthUserList 授权员工列表	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasAuthUserList(HasAuthUser [] HasAuthUserList) {
        this.HasAuthUserList = HasAuthUserList;
    }

    /**
     * Get 授权企业列表（企业自动签时，该字段有值）	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAuthOrganizationList 授权企业列表（企业自动签时，该字段有值）	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HasAuthOrganization [] getHasAuthOrganizationList() {
        return this.HasAuthOrganizationList;
    }

    /**
     * Set 授权企业列表（企业自动签时，该字段有值）	
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAuthOrganizationList 授权企业列表（企业自动签时，该字段有值）	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasAuthOrganizationList(HasAuthOrganization [] HasAuthOrganizationList) {
        this.HasAuthOrganizationList = HasAuthOrganizationList;
    }

    /**
     * Get 授权员工列表总数	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthUserTotal 授权员工列表总数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthUserTotal() {
        return this.AuthUserTotal;
    }

    /**
     * Set 授权员工列表总数	
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthUserTotal 授权员工列表总数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthUserTotal(Long AuthUserTotal) {
        this.AuthUserTotal = AuthUserTotal;
    }

    /**
     * Get 授权企业列表总数	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthOrganizationTotal 授权企业列表总数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthOrganizationTotal() {
        return this.AuthOrganizationTotal;
    }

    /**
     * Set 授权企业列表总数	
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthOrganizationTotal 授权企业列表总数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthOrganizationTotal(Long AuthOrganizationTotal) {
        this.AuthOrganizationTotal = AuthOrganizationTotal;
    }

    public AuthInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthInfoDetail(AuthInfoDetail source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.HasAuthUserList != null) {
            this.HasAuthUserList = new HasAuthUser[source.HasAuthUserList.length];
            for (int i = 0; i < source.HasAuthUserList.length; i++) {
                this.HasAuthUserList[i] = new HasAuthUser(source.HasAuthUserList[i]);
            }
        }
        if (source.HasAuthOrganizationList != null) {
            this.HasAuthOrganizationList = new HasAuthOrganization[source.HasAuthOrganizationList.length];
            for (int i = 0; i < source.HasAuthOrganizationList.length; i++) {
                this.HasAuthOrganizationList[i] = new HasAuthOrganization(source.HasAuthOrganizationList[i]);
            }
        }
        if (source.AuthUserTotal != null) {
            this.AuthUserTotal = new Long(source.AuthUserTotal);
        }
        if (source.AuthOrganizationTotal != null) {
            this.AuthOrganizationTotal = new Long(source.AuthOrganizationTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "HasAuthUserList.", this.HasAuthUserList);
        this.setParamArrayObj(map, prefix + "HasAuthOrganizationList.", this.HasAuthOrganizationList);
        this.setParamSimple(map, prefix + "AuthUserTotal", this.AuthUserTotal);
        this.setParamSimple(map, prefix + "AuthOrganizationTotal", this.AuthOrganizationTotal);

    }
}

