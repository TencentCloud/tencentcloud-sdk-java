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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RevokeDomainValidateAuths extends AbstractModel{

    /**
    * DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainValidateAuthPath")
    @Expose
    private String DomainValidateAuthPath;

    /**
    * DV 认证 KEY。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainValidateAuthKey")
    @Expose
    private String DomainValidateAuthKey;

    /**
    * DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainValidateAuthValue")
    @Expose
    private String DomainValidateAuthValue;

    /**
    * DV 认证域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainValidateAuthDomain")
    @Expose
    private String DomainValidateAuthDomain;

    /**
     * Get DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainValidateAuthPath DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainValidateAuthPath() {
        return this.DomainValidateAuthPath;
    }

    /**
     * Set DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainValidateAuthPath DV 认证值路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainValidateAuthPath(String DomainValidateAuthPath) {
        this.DomainValidateAuthPath = DomainValidateAuthPath;
    }

    /**
     * Get DV 认证 KEY。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainValidateAuthKey DV 认证 KEY。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainValidateAuthKey() {
        return this.DomainValidateAuthKey;
    }

    /**
     * Set DV 认证 KEY。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainValidateAuthKey DV 认证 KEY。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainValidateAuthKey(String DomainValidateAuthKey) {
        this.DomainValidateAuthKey = DomainValidateAuthKey;
    }

    /**
     * Get DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainValidateAuthValue DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainValidateAuthValue() {
        return this.DomainValidateAuthValue;
    }

    /**
     * Set DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainValidateAuthValue DV 认证值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainValidateAuthValue(String DomainValidateAuthValue) {
        this.DomainValidateAuthValue = DomainValidateAuthValue;
    }

    /**
     * Get DV 认证域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainValidateAuthDomain DV 认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainValidateAuthDomain() {
        return this.DomainValidateAuthDomain;
    }

    /**
     * Set DV 认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainValidateAuthDomain DV 认证域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainValidateAuthDomain(String DomainValidateAuthDomain) {
        this.DomainValidateAuthDomain = DomainValidateAuthDomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainValidateAuthPath", this.DomainValidateAuthPath);
        this.setParamSimple(map, prefix + "DomainValidateAuthKey", this.DomainValidateAuthKey);
        this.setParamSimple(map, prefix + "DomainValidateAuthValue", this.DomainValidateAuthValue);
        this.setParamSimple(map, prefix + "DomainValidateAuthDomain", this.DomainValidateAuthDomain);

    }
}

