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

public class Agent extends AbstractModel{

    /**
    * 应用编号,32位字符串
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主组织的应用号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyAppId")
    @Expose
    private String ProxyAppId;

    /**
    * 主组织在平台的机构编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyOrganizationId")
    @Expose
    private String ProxyOrganizationId;

    /**
    * 主组织的操作人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyOperator")
    @Expose
    private String ProxyOperator;

    /**
     * Get 应用编号,32位字符串 
     * @return AppId 应用编号,32位字符串
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用编号,32位字符串
     * @param AppId 应用编号,32位字符串
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主组织的应用号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyAppId 主组织的应用号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyAppId() {
        return this.ProxyAppId;
    }

    /**
     * Set 主组织的应用号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyAppId 主组织的应用号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyAppId(String ProxyAppId) {
        this.ProxyAppId = ProxyAppId;
    }

    /**
     * Get 主组织在平台的机构编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyOrganizationId 主组织在平台的机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyOrganizationId() {
        return this.ProxyOrganizationId;
    }

    /**
     * Set 主组织在平台的机构编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyOrganizationId 主组织在平台的机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyOrganizationId(String ProxyOrganizationId) {
        this.ProxyOrganizationId = ProxyOrganizationId;
    }

    /**
     * Get 主组织的操作人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyOperator 主组织的操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyOperator() {
        return this.ProxyOperator;
    }

    /**
     * Set 主组织的操作人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyOperator 主组织的操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyOperator(String ProxyOperator) {
        this.ProxyOperator = ProxyOperator;
    }

    public Agent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Agent(Agent source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProxyAppId != null) {
            this.ProxyAppId = new String(source.ProxyAppId);
        }
        if (source.ProxyOrganizationId != null) {
            this.ProxyOrganizationId = new String(source.ProxyOrganizationId);
        }
        if (source.ProxyOperator != null) {
            this.ProxyOperator = new String(source.ProxyOperator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProxyAppId", this.ProxyAppId);
        this.setParamSimple(map, prefix + "ProxyOrganizationId", this.ProxyOrganizationId);
        this.setParamSimple(map, prefix + "ProxyOperator", this.ProxyOperator);

    }
}

