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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceCallInfoV2 extends AbstractModel {

    /**
    * 服务组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 服务的公网调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetEndpoint")
    @Expose
    private String InternetEndpoint;

    /**
    * 鉴权是否开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * 鉴权token，仅当AuthorizationEnable为true时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthToken")
    @Expose
    private String AuthToken;

    /**
    * LLM token 列表
    */
    @SerializedName("AuthTokens")
    @Expose
    private AuthToken [] AuthTokens;

    /**
    * 是否开启限流
    */
    @SerializedName("EnableLimit")
    @Expose
    private Boolean EnableLimit;

    /**
    * 访问grpc时需携带的虚拟Host
    */
    @SerializedName("GrpcHost")
    @Expose
    private String GrpcHost;

    /**
     * Get 服务组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGroupId 服务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 服务组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGroupId 服务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 服务的公网调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetEndpoint 服务的公网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetEndpoint() {
        return this.InternetEndpoint;
    }

    /**
     * Set 服务的公网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetEndpoint 服务的公网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetEndpoint(String InternetEndpoint) {
        this.InternetEndpoint = InternetEndpoint;
    }

    /**
     * Get 鉴权是否开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationEnable 鉴权是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set 鉴权是否开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationEnable 鉴权是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get 鉴权token，仅当AuthorizationEnable为true时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthToken 鉴权token，仅当AuthorizationEnable为true时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set 鉴权token，仅当AuthorizationEnable为true时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthToken 鉴权token，仅当AuthorizationEnable为true时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    /**
     * Get LLM token 列表 
     * @return AuthTokens LLM token 列表
     */
    public AuthToken [] getAuthTokens() {
        return this.AuthTokens;
    }

    /**
     * Set LLM token 列表
     * @param AuthTokens LLM token 列表
     */
    public void setAuthTokens(AuthToken [] AuthTokens) {
        this.AuthTokens = AuthTokens;
    }

    /**
     * Get 是否开启限流 
     * @return EnableLimit 是否开启限流
     */
    public Boolean getEnableLimit() {
        return this.EnableLimit;
    }

    /**
     * Set 是否开启限流
     * @param EnableLimit 是否开启限流
     */
    public void setEnableLimit(Boolean EnableLimit) {
        this.EnableLimit = EnableLimit;
    }

    /**
     * Get 访问grpc时需携带的虚拟Host 
     * @return GrpcHost 访问grpc时需携带的虚拟Host
     */
    public String getGrpcHost() {
        return this.GrpcHost;
    }

    /**
     * Set 访问grpc时需携带的虚拟Host
     * @param GrpcHost 访问grpc时需携带的虚拟Host
     */
    public void setGrpcHost(String GrpcHost) {
        this.GrpcHost = GrpcHost;
    }

    public ServiceCallInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceCallInfoV2(ServiceCallInfoV2 source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.InternetEndpoint != null) {
            this.InternetEndpoint = new String(source.InternetEndpoint);
        }
        if (source.AuthorizationEnable != null) {
            this.AuthorizationEnable = new Boolean(source.AuthorizationEnable);
        }
        if (source.AuthToken != null) {
            this.AuthToken = new String(source.AuthToken);
        }
        if (source.AuthTokens != null) {
            this.AuthTokens = new AuthToken[source.AuthTokens.length];
            for (int i = 0; i < source.AuthTokens.length; i++) {
                this.AuthTokens[i] = new AuthToken(source.AuthTokens[i]);
            }
        }
        if (source.EnableLimit != null) {
            this.EnableLimit = new Boolean(source.EnableLimit);
        }
        if (source.GrpcHost != null) {
            this.GrpcHost = new String(source.GrpcHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "InternetEndpoint", this.InternetEndpoint);
        this.setParamSimple(map, prefix + "AuthorizationEnable", this.AuthorizationEnable);
        this.setParamSimple(map, prefix + "AuthToken", this.AuthToken);
        this.setParamArrayObj(map, prefix + "AuthTokens.", this.AuthTokens);
        this.setParamSimple(map, prefix + "EnableLimit", this.EnableLimit);
        this.setParamSimple(map, prefix + "GrpcHost", this.GrpcHost);

    }
}

