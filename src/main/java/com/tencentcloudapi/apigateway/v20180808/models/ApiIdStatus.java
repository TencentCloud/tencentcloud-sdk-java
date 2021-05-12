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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiIdStatus extends AbstractModel{

    /**
    * 服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API唯一ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API描述
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * API PATH。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API METHOD。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 服务创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 服务修改时间。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * API名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * VPC唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * API类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API协议。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 是否买后调试。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * 授权类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * API业务类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * 关联授权API唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * 授权API关联的业务API列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelationBuniessApiIds")
    @Expose
    private String [] RelationBuniessApiIds;

    /**
    * oauth配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * oauth2.0API请求，token存放位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenLocation")
    @Expose
    private String TokenLocation;

    /**
     * Get 服务唯一ID。 
     * @return ServiceId 服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一ID。
     * @param ServiceId 服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API唯一ID。 
     * @return ApiId API唯一ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API唯一ID。
     * @param ApiId API唯一ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API描述 
     * @return ApiDesc API描述
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API描述
     * @param ApiDesc API描述
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get API PATH。 
     * @return Path API PATH。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API PATH。
     * @param Path API PATH。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API METHOD。 
     * @return Method API METHOD。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set API METHOD。
     * @param Method API METHOD。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 服务创建时间。 
     * @return CreatedTime 服务创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 服务创建时间。
     * @param CreatedTime 服务创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 服务修改时间。 
     * @return ModifiedTime 服务修改时间。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 服务修改时间。
     * @param ModifiedTime 服务修改时间。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get API名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiName API名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiName API名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get VPC唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId VPC唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId VPC唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get API类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiType API类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiType API类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API协议。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol API协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API协议。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol API协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 是否买后调试。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDebugAfterCharge 是否买后调试。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set 是否买后调试。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDebugAfterCharge 是否买后调试。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get 授权类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType 授权类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 授权类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType 授权类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get API业务类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiBusinessType API业务类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set API业务类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiBusinessType API业务类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get 关联授权API唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthRelationApiId 关联授权API唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set 关联授权API唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthRelationApiId 关联授权API唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get 授权API关联的业务API列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelationBuniessApiIds 授权API关联的业务API列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRelationBuniessApiIds() {
        return this.RelationBuniessApiIds;
    }

    /**
     * Set 授权API关联的业务API列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelationBuniessApiIds 授权API关联的业务API列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelationBuniessApiIds(String [] RelationBuniessApiIds) {
        this.RelationBuniessApiIds = RelationBuniessApiIds;
    }

    /**
     * Get oauth配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OauthConfig oauth配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set oauth配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OauthConfig oauth配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get oauth2.0API请求，token存放位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenLocation oauth2.0API请求，token存放位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTokenLocation() {
        return this.TokenLocation;
    }

    /**
     * Set oauth2.0API请求，token存放位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenLocation oauth2.0API请求，token存放位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenLocation(String TokenLocation) {
        this.TokenLocation = TokenLocation;
    }

    public ApiIdStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiIdStatus(ApiIdStatus source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IsDebugAfterCharge != null) {
            this.IsDebugAfterCharge = new Boolean(source.IsDebugAfterCharge);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.ApiBusinessType != null) {
            this.ApiBusinessType = new String(source.ApiBusinessType);
        }
        if (source.AuthRelationApiId != null) {
            this.AuthRelationApiId = new String(source.AuthRelationApiId);
        }
        if (source.RelationBuniessApiIds != null) {
            this.RelationBuniessApiIds = new String[source.RelationBuniessApiIds.length];
            for (int i = 0; i < source.RelationBuniessApiIds.length; i++) {
                this.RelationBuniessApiIds[i] = new String(source.RelationBuniessApiIds[i]);
            }
        }
        if (source.OauthConfig != null) {
            this.OauthConfig = new OauthConfig(source.OauthConfig);
        }
        if (source.TokenLocation != null) {
            this.TokenLocation = new String(source.TokenLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamArraySimple(map, prefix + "RelationBuniessApiIds.", this.RelationBuniessApiIds);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamSimple(map, prefix + "TokenLocation", this.TokenLocation);

    }
}

