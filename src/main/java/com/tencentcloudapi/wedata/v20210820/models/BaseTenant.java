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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseTenant extends AbstractModel {

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 租户标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantName")
    @Expose
    private String TenantName;

    /**
    * 租户显示名称，一般是中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 租户主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserId")
    @Expose
    private String OwnerUserId;

    /**
    * 租户的额外配置参数, json格式字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 租户标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantName 租户标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantName() {
        return this.TenantName;
    }

    /**
     * Set 租户标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantName 租户标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantName(String TenantName) {
        this.TenantName = TenantName;
    }

    /**
     * Get 租户显示名称，一般是中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 租户显示名称，一般是中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 租户显示名称，一般是中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 租户显示名称，一般是中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 租户主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserId 租户主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set 租户主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserId 租户主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserId(String OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get 租户的额外配置参数, json格式字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 租户的额外配置参数, json格式字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 租户的额外配置参数, json格式字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 租户的额外配置参数, json格式字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public BaseTenant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseTenant(BaseTenant source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.TenantName != null) {
            this.TenantName = new String(source.TenantName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new String(source.OwnerUserId);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "TenantName", this.TenantName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

