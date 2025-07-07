/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DutyPerson extends AbstractModel {

    /**
    * 值班人子账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 值班人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 值班人员主账号用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserId")
    @Expose
    private String OwnerUserId;

    /**
    * 值班人tenantId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private Long TenantId;

    /**
    * 2023-11-02 08:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 值班人子账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 值班人子账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 值班人子账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 值班人子账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 值班人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 值班人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 值班人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 值班人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 值班人员主账号用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserId 值班人员主账号用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set 值班人员主账号用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserId 值班人员主账号用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserId(String OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 值班人tenantId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 值班人tenantId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 值班人tenantId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 值班人tenantId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(Long TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 2023-11-02 08:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 2023-11-02 08:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 2023-11-02 08:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 2023-11-02 08:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 扩展字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 扩展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public DutyPerson() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DutyPerson(DutyPerson source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new String(source.OwnerUserId);
        }
        if (source.TenantId != null) {
            this.TenantId = new Long(source.TenantId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

