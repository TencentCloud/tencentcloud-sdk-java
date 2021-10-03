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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceAccountAuthenticationOptions extends AbstractModel{

    /**
    * service-account-issuer
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * service-account-jwks-uri
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JWKSURI")
    @Expose
    private String JWKSURI;

    /**
    * 如果为true，则会自动创建允许匿名用户访问'/.well-known/openid-configuration'和/openid/v1/jwks的rbac规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoCreateDiscoveryAnonymousAuth")
    @Expose
    private Boolean AutoCreateDiscoveryAnonymousAuth;

    /**
     * Get service-account-issuer
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Issuer service-account-issuer
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set service-account-issuer
注意：此字段可能返回 null，表示取不到有效值。
     * @param Issuer service-account-issuer
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get service-account-jwks-uri
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JWKSURI service-account-jwks-uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJWKSURI() {
        return this.JWKSURI;
    }

    /**
     * Set service-account-jwks-uri
注意：此字段可能返回 null，表示取不到有效值。
     * @param JWKSURI service-account-jwks-uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJWKSURI(String JWKSURI) {
        this.JWKSURI = JWKSURI;
    }

    /**
     * Get 如果为true，则会自动创建允许匿名用户访问'/.well-known/openid-configuration'和/openid/v1/jwks的rbac规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoCreateDiscoveryAnonymousAuth 如果为true，则会自动创建允许匿名用户访问'/.well-known/openid-configuration'和/openid/v1/jwks的rbac规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoCreateDiscoveryAnonymousAuth() {
        return this.AutoCreateDiscoveryAnonymousAuth;
    }

    /**
     * Set 如果为true，则会自动创建允许匿名用户访问'/.well-known/openid-configuration'和/openid/v1/jwks的rbac规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoCreateDiscoveryAnonymousAuth 如果为true，则会自动创建允许匿名用户访问'/.well-known/openid-configuration'和/openid/v1/jwks的rbac规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoCreateDiscoveryAnonymousAuth(Boolean AutoCreateDiscoveryAnonymousAuth) {
        this.AutoCreateDiscoveryAnonymousAuth = AutoCreateDiscoveryAnonymousAuth;
    }

    public ServiceAccountAuthenticationOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceAccountAuthenticationOptions(ServiceAccountAuthenticationOptions source) {
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.JWKSURI != null) {
            this.JWKSURI = new String(source.JWKSURI);
        }
        if (source.AutoCreateDiscoveryAnonymousAuth != null) {
            this.AutoCreateDiscoveryAnonymousAuth = new Boolean(source.AutoCreateDiscoveryAnonymousAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "JWKSURI", this.JWKSURI);
        this.setParamSimple(map, prefix + "AutoCreateDiscoveryAnonymousAuth", this.AutoCreateDiscoveryAnonymousAuth);

    }
}

