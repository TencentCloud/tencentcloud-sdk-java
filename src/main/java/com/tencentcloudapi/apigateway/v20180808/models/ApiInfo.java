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

public class ApiInfo extends AbstractModel{

    /**
    * API 所在的服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API 所在的服务的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * API 所在的服务的描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * API 接口唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API 接口的描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * API 接口的名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API 类型。可取值为NORMAL（普通API）、TSF（微服务API）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * API 鉴权类型。可取值为 SECRET（密钥对鉴权）、NONE（免鉴权）、OAUTH。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * OAUTH API的类型。可取值为NORMAL（业务API）、OAUTH（授权API）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * OAUTH 业务API 关联的授权API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * OAUTH配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * 是否购买后调试（云市场预留参数）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * 请求的前端配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestConfig")
    @Expose
    private RequestConfig RequestConfig;

    /**
    * 返回类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * 自定义响应配置成功响应示例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseSuccessExample")
    @Expose
    private String ResponseSuccessExample;

    /**
    * 自定义响应配置失败响应示例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseFailExample")
    @Expose
    private String ResponseFailExample;

    /**
    * 用户自定义错误码配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseErrorCodes")
    @Expose
    private ErrorCodes [] ResponseErrorCodes;

    /**
    * 前端请求参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestParameters")
    @Expose
    private ReqParameter [] RequestParameters;

    /**
    * API 的后端服务超时时间，单位是秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTimeout")
    @Expose
    private Long ServiceTimeout;

    /**
    * API 的后端服务类型。可取值为 HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * API 的后端服务配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceConfig")
    @Expose
    private ServiceConfig ServiceConfig;

    /**
    * API的后端服务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceParameters")
    @Expose
    private ServiceParameter [] ServiceParameters;

    /**
    * 常量参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConstantParameters")
    @Expose
    private ConstantParameter [] ConstantParameters;

    /**
    * API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceMockReturnMessage")
    @Expose
    private String ServiceMockReturnMessage;

    /**
    * scf 函数名称。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceScfFunctionName")
    @Expose
    private String ServiceScfFunctionName;

    /**
    * scf 函数命名空间。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceScfFunctionNamespace")
    @Expose
    private String ServiceScfFunctionNamespace;

    /**
    * scf函数版本。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceScfFunctionQualifier")
    @Expose
    private String ServiceScfFunctionQualifier;

    /**
    * 是否开启集成响应。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceScfIsIntegratedResponse")
    @Expose
    private Boolean ServiceScfIsIntegratedResponse;

    /**
    * scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketRegisterFunctionName")
    @Expose
    private String ServiceWebsocketRegisterFunctionName;

    /**
    * scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketRegisterFunctionNamespace")
    @Expose
    private String ServiceWebsocketRegisterFunctionNamespace;

    /**
    * scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketRegisterFunctionQualifier")
    @Expose
    private String ServiceWebsocketRegisterFunctionQualifier;

    /**
    * scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketCleanupFunctionName")
    @Expose
    private String ServiceWebsocketCleanupFunctionName;

    /**
    * scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketCleanupFunctionNamespace")
    @Expose
    private String ServiceWebsocketCleanupFunctionNamespace;

    /**
    * scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketCleanupFunctionQualifier")
    @Expose
    private String ServiceWebsocketCleanupFunctionQualifier;

    /**
    * WEBSOCKET 回推地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalDomain")
    @Expose
    private String InternalDomain;

    /**
    * scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketTransportFunctionName")
    @Expose
    private String ServiceWebsocketTransportFunctionName;

    /**
    * scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketTransportFunctionNamespace")
    @Expose
    private String ServiceWebsocketTransportFunctionNamespace;

    /**
    * scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceWebsocketTransportFunctionQualifier")
    @Expose
    private String ServiceWebsocketTransportFunctionQualifier;

    /**
    * API绑定微服务服务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroServices")
    @Expose
    private MicroService [] MicroServices;

    /**
    * 微服务信息详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroServicesInfo")
    @Expose
    private Long [] MicroServicesInfo;

    /**
    * 微服务的负载均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTsfLoadBalanceConf")
    @Expose
    private TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf;

    /**
    * 微服务的健康检查配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTsfHealthCheckConf")
    @Expose
    private HealthCheckConf ServiceTsfHealthCheckConf;

    /**
    * 是否开启跨域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableCORS")
    @Expose
    private Boolean EnableCORS;

    /**
    * API绑定的tag信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * API已发布的环境信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environments")
    @Expose
    private String [] Environments;

    /**
    * 是否开启Base64编码，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBase64Encoded")
    @Expose
    private Boolean IsBase64Encoded;

    /**
    * 是否开启Base64编码的header触发，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBase64Trigger")
    @Expose
    private Boolean IsBase64Trigger;

    /**
    * Header触发规则，总规则数量不超过10。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Base64EncodedTriggerRules")
    @Expose
    private Base64EncodedTriggerRule [] Base64EncodedTriggerRules;

    /**
     * Get API 所在的服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId API 所在的服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set API 所在的服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId API 所在的服务唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API 所在的服务的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName API 所在的服务的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set API 所在的服务的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName API 所在的服务的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get API 所在的服务的描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDesc API 所在的服务的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set API 所在的服务的描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDesc API 所在的服务的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get API 接口唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId API 接口唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API 接口唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId API 接口唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API 接口的描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiDesc API 接口的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API 接口的描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiDesc API 接口的描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最后修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 最后修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 最后修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 最后修改时间，按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get API 接口的名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiName API 接口的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API 接口的名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiName API 接口的名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API 类型。可取值为NORMAL（普通API）、TSF（微服务API）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiType API 类型。可取值为NORMAL（普通API）、TSF（微服务API）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API 类型。可取值为NORMAL（普通API）、TSF（微服务API）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiType API 类型。可取值为NORMAL（普通API）、TSF（微服务API）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get API 鉴权类型。可取值为 SECRET（密钥对鉴权）、NONE（免鉴权）、OAUTH。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType API 鉴权类型。可取值为 SECRET（密钥对鉴权）、NONE（免鉴权）、OAUTH。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set API 鉴权类型。可取值为 SECRET（密钥对鉴权）、NONE（免鉴权）、OAUTH。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType API 鉴权类型。可取值为 SECRET（密钥对鉴权）、NONE（免鉴权）、OAUTH。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get OAUTH API的类型。可取值为NORMAL（业务API）、OAUTH（授权API）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiBusinessType OAUTH API的类型。可取值为NORMAL（业务API）、OAUTH（授权API）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set OAUTH API的类型。可取值为NORMAL（业务API）、OAUTH（授权API）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiBusinessType OAUTH API的类型。可取值为NORMAL（业务API）、OAUTH（授权API）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get OAUTH 业务API 关联的授权API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthRelationApiId OAUTH 业务API 关联的授权API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set OAUTH 业务API 关联的授权API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthRelationApiId OAUTH 业务API 关联的授权API 唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get OAUTH配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OauthConfig OAUTH配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set OAUTH配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OauthConfig OAUTH配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get 是否购买后调试（云市场预留参数）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDebugAfterCharge 是否购买后调试（云市场预留参数）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set 是否购买后调试（云市场预留参数）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDebugAfterCharge 是否购买后调试（云市场预留参数）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get 请求的前端配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestConfig 请求的前端配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RequestConfig getRequestConfig() {
        return this.RequestConfig;
    }

    /**
     * Set 请求的前端配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestConfig 请求的前端配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestConfig(RequestConfig RequestConfig) {
        this.RequestConfig = RequestConfig;
    }

    /**
     * Get 返回类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseType 返回类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set 返回类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseType 返回类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get 自定义响应配置成功响应示例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseSuccessExample 自定义响应配置成功响应示例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseSuccessExample() {
        return this.ResponseSuccessExample;
    }

    /**
     * Set 自定义响应配置成功响应示例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseSuccessExample 自定义响应配置成功响应示例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseSuccessExample(String ResponseSuccessExample) {
        this.ResponseSuccessExample = ResponseSuccessExample;
    }

    /**
     * Get 自定义响应配置失败响应示例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseFailExample 自定义响应配置失败响应示例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseFailExample() {
        return this.ResponseFailExample;
    }

    /**
     * Set 自定义响应配置失败响应示例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseFailExample 自定义响应配置失败响应示例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseFailExample(String ResponseFailExample) {
        this.ResponseFailExample = ResponseFailExample;
    }

    /**
     * Get 用户自定义错误码配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseErrorCodes 用户自定义错误码配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorCodes [] getResponseErrorCodes() {
        return this.ResponseErrorCodes;
    }

    /**
     * Set 用户自定义错误码配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseErrorCodes 用户自定义错误码配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseErrorCodes(ErrorCodes [] ResponseErrorCodes) {
        this.ResponseErrorCodes = ResponseErrorCodes;
    }

    /**
     * Get 前端请求参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestParameters 前端请求参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReqParameter [] getRequestParameters() {
        return this.RequestParameters;
    }

    /**
     * Set 前端请求参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestParameters 前端请求参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestParameters(ReqParameter [] RequestParameters) {
        this.RequestParameters = RequestParameters;
    }

    /**
     * Get API 的后端服务超时时间，单位是秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTimeout API 的后端服务超时时间，单位是秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceTimeout() {
        return this.ServiceTimeout;
    }

    /**
     * Set API 的后端服务超时时间，单位是秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTimeout API 的后端服务超时时间，单位是秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTimeout(Long ServiceTimeout) {
        this.ServiceTimeout = ServiceTimeout;
    }

    /**
     * Get API 的后端服务类型。可取值为 HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType API 的后端服务类型。可取值为 HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set API 的后端服务类型。可取值为 HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType API 的后端服务类型。可取值为 HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get API 的后端服务配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceConfig API 的后端服务配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceConfig getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set API 的后端服务配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceConfig API 的后端服务配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceConfig(ServiceConfig ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get API的后端服务参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceParameters API的后端服务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceParameter [] getServiceParameters() {
        return this.ServiceParameters;
    }

    /**
     * Set API的后端服务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceParameters API的后端服务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceParameters(ServiceParameter [] ServiceParameters) {
        this.ServiceParameters = ServiceParameters;
    }

    /**
     * Get 常量参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConstantParameters 常量参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConstantParameter [] getConstantParameters() {
        return this.ConstantParameters;
    }

    /**
     * Set 常量参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConstantParameters 常量参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConstantParameters(ConstantParameter [] ConstantParameters) {
        this.ConstantParameters = ConstantParameters;
    }

    /**
     * Get API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceMockReturnMessage API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceMockReturnMessage() {
        return this.ServiceMockReturnMessage;
    }

    /**
     * Set API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceMockReturnMessage API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceMockReturnMessage(String ServiceMockReturnMessage) {
        this.ServiceMockReturnMessage = ServiceMockReturnMessage;
    }

    /**
     * Get scf 函数名称。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceScfFunctionName scf 函数名称。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceScfFunctionName() {
        return this.ServiceScfFunctionName;
    }

    /**
     * Set scf 函数名称。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceScfFunctionName scf 函数名称。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceScfFunctionName(String ServiceScfFunctionName) {
        this.ServiceScfFunctionName = ServiceScfFunctionName;
    }

    /**
     * Get scf 函数命名空间。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceScfFunctionNamespace scf 函数命名空间。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceScfFunctionNamespace() {
        return this.ServiceScfFunctionNamespace;
    }

    /**
     * Set scf 函数命名空间。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceScfFunctionNamespace scf 函数命名空间。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceScfFunctionNamespace(String ServiceScfFunctionNamespace) {
        this.ServiceScfFunctionNamespace = ServiceScfFunctionNamespace;
    }

    /**
     * Get scf函数版本。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceScfFunctionQualifier scf函数版本。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceScfFunctionQualifier() {
        return this.ServiceScfFunctionQualifier;
    }

    /**
     * Set scf函数版本。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceScfFunctionQualifier scf函数版本。当后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceScfFunctionQualifier(String ServiceScfFunctionQualifier) {
        this.ServiceScfFunctionQualifier = ServiceScfFunctionQualifier;
    }

    /**
     * Get 是否开启集成响应。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceScfIsIntegratedResponse 是否开启集成响应。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getServiceScfIsIntegratedResponse() {
        return this.ServiceScfIsIntegratedResponse;
    }

    /**
     * Set 是否开启集成响应。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceScfIsIntegratedResponse 是否开启集成响应。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceScfIsIntegratedResponse(Boolean ServiceScfIsIntegratedResponse) {
        this.ServiceScfIsIntegratedResponse = ServiceScfIsIntegratedResponse;
    }

    /**
     * Get scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketRegisterFunctionName scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketRegisterFunctionName() {
        return this.ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Set scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketRegisterFunctionName scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketRegisterFunctionName(String ServiceWebsocketRegisterFunctionName) {
        this.ServiceWebsocketRegisterFunctionName = ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Get scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketRegisterFunctionNamespace scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketRegisterFunctionNamespace() {
        return this.ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Set scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketRegisterFunctionNamespace scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketRegisterFunctionNamespace(String ServiceWebsocketRegisterFunctionNamespace) {
        this.ServiceWebsocketRegisterFunctionNamespace = ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Get scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketRegisterFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketRegisterFunctionQualifier() {
        return this.ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Set scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketRegisterFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketRegisterFunctionQualifier(String ServiceWebsocketRegisterFunctionQualifier) {
        this.ServiceWebsocketRegisterFunctionQualifier = ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Get scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketCleanupFunctionName scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketCleanupFunctionName() {
        return this.ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Set scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketCleanupFunctionName scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketCleanupFunctionName(String ServiceWebsocketCleanupFunctionName) {
        this.ServiceWebsocketCleanupFunctionName = ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Get scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketCleanupFunctionNamespace scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketCleanupFunctionNamespace() {
        return this.ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Set scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketCleanupFunctionNamespace scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketCleanupFunctionNamespace(String ServiceWebsocketCleanupFunctionNamespace) {
        this.ServiceWebsocketCleanupFunctionNamespace = ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Get scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketCleanupFunctionQualifier scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketCleanupFunctionQualifier() {
        return this.ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Set scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketCleanupFunctionQualifier scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketCleanupFunctionQualifier(String ServiceWebsocketCleanupFunctionQualifier) {
        this.ServiceWebsocketCleanupFunctionQualifier = ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Get WEBSOCKET 回推地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalDomain WEBSOCKET 回推地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternalDomain() {
        return this.InternalDomain;
    }

    /**
     * Set WEBSOCKET 回推地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalDomain WEBSOCKET 回推地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalDomain(String InternalDomain) {
        this.InternalDomain = InternalDomain;
    }

    /**
     * Get scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketTransportFunctionName scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketTransportFunctionName() {
        return this.ServiceWebsocketTransportFunctionName;
    }

    /**
     * Set scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketTransportFunctionName scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketTransportFunctionName(String ServiceWebsocketTransportFunctionName) {
        this.ServiceWebsocketTransportFunctionName = ServiceWebsocketTransportFunctionName;
    }

    /**
     * Get scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketTransportFunctionNamespace scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketTransportFunctionNamespace() {
        return this.ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Set scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketTransportFunctionNamespace scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketTransportFunctionNamespace(String ServiceWebsocketTransportFunctionNamespace) {
        this.ServiceWebsocketTransportFunctionNamespace = ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Get scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceWebsocketTransportFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceWebsocketTransportFunctionQualifier() {
        return this.ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Set scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceWebsocketTransportFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceWebsocketTransportFunctionQualifier(String ServiceWebsocketTransportFunctionQualifier) {
        this.ServiceWebsocketTransportFunctionQualifier = ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Get API绑定微服务服务列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroServices API绑定微服务服务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MicroService [] getMicroServices() {
        return this.MicroServices;
    }

    /**
     * Set API绑定微服务服务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroServices API绑定微服务服务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroServices(MicroService [] MicroServices) {
        this.MicroServices = MicroServices;
    }

    /**
     * Get 微服务信息详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroServicesInfo 微服务信息详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getMicroServicesInfo() {
        return this.MicroServicesInfo;
    }

    /**
     * Set 微服务信息详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroServicesInfo 微服务信息详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroServicesInfo(Long [] MicroServicesInfo) {
        this.MicroServicesInfo = MicroServicesInfo;
    }

    /**
     * Get 微服务的负载均衡配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTsfLoadBalanceConf 微服务的负载均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TsfLoadBalanceConfResp getServiceTsfLoadBalanceConf() {
        return this.ServiceTsfLoadBalanceConf;
    }

    /**
     * Set 微服务的负载均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTsfLoadBalanceConf 微服务的负载均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTsfLoadBalanceConf(TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf) {
        this.ServiceTsfLoadBalanceConf = ServiceTsfLoadBalanceConf;
    }

    /**
     * Get 微服务的健康检查配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTsfHealthCheckConf 微服务的健康检查配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckConf getServiceTsfHealthCheckConf() {
        return this.ServiceTsfHealthCheckConf;
    }

    /**
     * Set 微服务的健康检查配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTsfHealthCheckConf 微服务的健康检查配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTsfHealthCheckConf(HealthCheckConf ServiceTsfHealthCheckConf) {
        this.ServiceTsfHealthCheckConf = ServiceTsfHealthCheckConf;
    }

    /**
     * Get 是否开启跨域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableCORS 是否开启跨域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableCORS() {
        return this.EnableCORS;
    }

    /**
     * Set 是否开启跨域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableCORS 是否开启跨域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableCORS(Boolean EnableCORS) {
        this.EnableCORS = EnableCORS;
    }

    /**
     * Get API绑定的tag信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags API绑定的tag信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set API绑定的tag信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags API绑定的tag信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get API已发布的环境信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Environments API已发布的环境信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEnvironments() {
        return this.Environments;
    }

    /**
     * Set API已发布的环境信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Environments API已发布的环境信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironments(String [] Environments) {
        this.Environments = Environments;
    }

    /**
     * Get 是否开启Base64编码，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBase64Encoded 是否开启Base64编码，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsBase64Encoded() {
        return this.IsBase64Encoded;
    }

    /**
     * Set 是否开启Base64编码，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBase64Encoded 是否开启Base64编码，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBase64Encoded(Boolean IsBase64Encoded) {
        this.IsBase64Encoded = IsBase64Encoded;
    }

    /**
     * Get 是否开启Base64编码的header触发，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBase64Trigger 是否开启Base64编码的header触发，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsBase64Trigger() {
        return this.IsBase64Trigger;
    }

    /**
     * Set 是否开启Base64编码的header触发，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBase64Trigger 是否开启Base64编码的header触发，只有后端为scf时才会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBase64Trigger(Boolean IsBase64Trigger) {
        this.IsBase64Trigger = IsBase64Trigger;
    }

    /**
     * Get Header触发规则，总规则数量不超过10。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Base64EncodedTriggerRules Header触发规则，总规则数量不超过10。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Base64EncodedTriggerRule [] getBase64EncodedTriggerRules() {
        return this.Base64EncodedTriggerRules;
    }

    /**
     * Set Header触发规则，总规则数量不超过10。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Base64EncodedTriggerRules Header触发规则，总规则数量不超过10。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBase64EncodedTriggerRules(Base64EncodedTriggerRule [] Base64EncodedTriggerRules) {
        this.Base64EncodedTriggerRules = Base64EncodedTriggerRules;
    }

    public ApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiInfo(ApiInfo source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
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
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
        if (source.OauthConfig != null) {
            this.OauthConfig = new OauthConfig(source.OauthConfig);
        }
        if (source.IsDebugAfterCharge != null) {
            this.IsDebugAfterCharge = new Boolean(source.IsDebugAfterCharge);
        }
        if (source.RequestConfig != null) {
            this.RequestConfig = new RequestConfig(source.RequestConfig);
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.ResponseSuccessExample != null) {
            this.ResponseSuccessExample = new String(source.ResponseSuccessExample);
        }
        if (source.ResponseFailExample != null) {
            this.ResponseFailExample = new String(source.ResponseFailExample);
        }
        if (source.ResponseErrorCodes != null) {
            this.ResponseErrorCodes = new ErrorCodes[source.ResponseErrorCodes.length];
            for (int i = 0; i < source.ResponseErrorCodes.length; i++) {
                this.ResponseErrorCodes[i] = new ErrorCodes(source.ResponseErrorCodes[i]);
            }
        }
        if (source.RequestParameters != null) {
            this.RequestParameters = new ReqParameter[source.RequestParameters.length];
            for (int i = 0; i < source.RequestParameters.length; i++) {
                this.RequestParameters[i] = new ReqParameter(source.RequestParameters[i]);
            }
        }
        if (source.ServiceTimeout != null) {
            this.ServiceTimeout = new Long(source.ServiceTimeout);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceConfig != null) {
            this.ServiceConfig = new ServiceConfig(source.ServiceConfig);
        }
        if (source.ServiceParameters != null) {
            this.ServiceParameters = new ServiceParameter[source.ServiceParameters.length];
            for (int i = 0; i < source.ServiceParameters.length; i++) {
                this.ServiceParameters[i] = new ServiceParameter(source.ServiceParameters[i]);
            }
        }
        if (source.ConstantParameters != null) {
            this.ConstantParameters = new ConstantParameter[source.ConstantParameters.length];
            for (int i = 0; i < source.ConstantParameters.length; i++) {
                this.ConstantParameters[i] = new ConstantParameter(source.ConstantParameters[i]);
            }
        }
        if (source.ServiceMockReturnMessage != null) {
            this.ServiceMockReturnMessage = new String(source.ServiceMockReturnMessage);
        }
        if (source.ServiceScfFunctionName != null) {
            this.ServiceScfFunctionName = new String(source.ServiceScfFunctionName);
        }
        if (source.ServiceScfFunctionNamespace != null) {
            this.ServiceScfFunctionNamespace = new String(source.ServiceScfFunctionNamespace);
        }
        if (source.ServiceScfFunctionQualifier != null) {
            this.ServiceScfFunctionQualifier = new String(source.ServiceScfFunctionQualifier);
        }
        if (source.ServiceScfIsIntegratedResponse != null) {
            this.ServiceScfIsIntegratedResponse = new Boolean(source.ServiceScfIsIntegratedResponse);
        }
        if (source.ServiceWebsocketRegisterFunctionName != null) {
            this.ServiceWebsocketRegisterFunctionName = new String(source.ServiceWebsocketRegisterFunctionName);
        }
        if (source.ServiceWebsocketRegisterFunctionNamespace != null) {
            this.ServiceWebsocketRegisterFunctionNamespace = new String(source.ServiceWebsocketRegisterFunctionNamespace);
        }
        if (source.ServiceWebsocketRegisterFunctionQualifier != null) {
            this.ServiceWebsocketRegisterFunctionQualifier = new String(source.ServiceWebsocketRegisterFunctionQualifier);
        }
        if (source.ServiceWebsocketCleanupFunctionName != null) {
            this.ServiceWebsocketCleanupFunctionName = new String(source.ServiceWebsocketCleanupFunctionName);
        }
        if (source.ServiceWebsocketCleanupFunctionNamespace != null) {
            this.ServiceWebsocketCleanupFunctionNamespace = new String(source.ServiceWebsocketCleanupFunctionNamespace);
        }
        if (source.ServiceWebsocketCleanupFunctionQualifier != null) {
            this.ServiceWebsocketCleanupFunctionQualifier = new String(source.ServiceWebsocketCleanupFunctionQualifier);
        }
        if (source.InternalDomain != null) {
            this.InternalDomain = new String(source.InternalDomain);
        }
        if (source.ServiceWebsocketTransportFunctionName != null) {
            this.ServiceWebsocketTransportFunctionName = new String(source.ServiceWebsocketTransportFunctionName);
        }
        if (source.ServiceWebsocketTransportFunctionNamespace != null) {
            this.ServiceWebsocketTransportFunctionNamespace = new String(source.ServiceWebsocketTransportFunctionNamespace);
        }
        if (source.ServiceWebsocketTransportFunctionQualifier != null) {
            this.ServiceWebsocketTransportFunctionQualifier = new String(source.ServiceWebsocketTransportFunctionQualifier);
        }
        if (source.MicroServices != null) {
            this.MicroServices = new MicroService[source.MicroServices.length];
            for (int i = 0; i < source.MicroServices.length; i++) {
                this.MicroServices[i] = new MicroService(source.MicroServices[i]);
            }
        }
        if (source.MicroServicesInfo != null) {
            this.MicroServicesInfo = new Long[source.MicroServicesInfo.length];
            for (int i = 0; i < source.MicroServicesInfo.length; i++) {
                this.MicroServicesInfo[i] = new Long(source.MicroServicesInfo[i]);
            }
        }
        if (source.ServiceTsfLoadBalanceConf != null) {
            this.ServiceTsfLoadBalanceConf = new TsfLoadBalanceConfResp(source.ServiceTsfLoadBalanceConf);
        }
        if (source.ServiceTsfHealthCheckConf != null) {
            this.ServiceTsfHealthCheckConf = new HealthCheckConf(source.ServiceTsfHealthCheckConf);
        }
        if (source.EnableCORS != null) {
            this.EnableCORS = new Boolean(source.EnableCORS);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Environments != null) {
            this.Environments = new String[source.Environments.length];
            for (int i = 0; i < source.Environments.length; i++) {
                this.Environments[i] = new String(source.Environments[i]);
            }
        }
        if (source.IsBase64Encoded != null) {
            this.IsBase64Encoded = new Boolean(source.IsBase64Encoded);
        }
        if (source.IsBase64Trigger != null) {
            this.IsBase64Trigger = new Boolean(source.IsBase64Trigger);
        }
        if (source.Base64EncodedTriggerRules != null) {
            this.Base64EncodedTriggerRules = new Base64EncodedTriggerRule[source.Base64EncodedTriggerRules.length];
            for (int i = 0; i < source.Base64EncodedTriggerRules.length; i++) {
                this.Base64EncodedTriggerRules[i] = new Base64EncodedTriggerRule(source.Base64EncodedTriggerRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamObj(map, prefix + "RequestConfig.", this.RequestConfig);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseSuccessExample", this.ResponseSuccessExample);
        this.setParamSimple(map, prefix + "ResponseFailExample", this.ResponseFailExample);
        this.setParamArrayObj(map, prefix + "ResponseErrorCodes.", this.ResponseErrorCodes);
        this.setParamArrayObj(map, prefix + "RequestParameters.", this.RequestParameters);
        this.setParamSimple(map, prefix + "ServiceTimeout", this.ServiceTimeout);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamArrayObj(map, prefix + "ServiceParameters.", this.ServiceParameters);
        this.setParamArrayObj(map, prefix + "ConstantParameters.", this.ConstantParameters);
        this.setParamSimple(map, prefix + "ServiceMockReturnMessage", this.ServiceMockReturnMessage);
        this.setParamSimple(map, prefix + "ServiceScfFunctionName", this.ServiceScfFunctionName);
        this.setParamSimple(map, prefix + "ServiceScfFunctionNamespace", this.ServiceScfFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceScfFunctionQualifier", this.ServiceScfFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceScfIsIntegratedResponse", this.ServiceScfIsIntegratedResponse);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionName", this.ServiceWebsocketRegisterFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionNamespace", this.ServiceWebsocketRegisterFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionQualifier", this.ServiceWebsocketRegisterFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionName", this.ServiceWebsocketCleanupFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionNamespace", this.ServiceWebsocketCleanupFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionQualifier", this.ServiceWebsocketCleanupFunctionQualifier);
        this.setParamSimple(map, prefix + "InternalDomain", this.InternalDomain);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionName", this.ServiceWebsocketTransportFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionNamespace", this.ServiceWebsocketTransportFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionQualifier", this.ServiceWebsocketTransportFunctionQualifier);
        this.setParamArrayObj(map, prefix + "MicroServices.", this.MicroServices);
        this.setParamArraySimple(map, prefix + "MicroServicesInfo.", this.MicroServicesInfo);
        this.setParamObj(map, prefix + "ServiceTsfLoadBalanceConf.", this.ServiceTsfLoadBalanceConf);
        this.setParamObj(map, prefix + "ServiceTsfHealthCheckConf.", this.ServiceTsfHealthCheckConf);
        this.setParamSimple(map, prefix + "EnableCORS", this.EnableCORS);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Environments.", this.Environments);
        this.setParamSimple(map, prefix + "IsBase64Encoded", this.IsBase64Encoded);
        this.setParamSimple(map, prefix + "IsBase64Trigger", this.IsBase64Trigger);
        this.setParamArrayObj(map, prefix + "Base64EncodedTriggerRules.", this.Base64EncodedTriggerRules);

    }
}

