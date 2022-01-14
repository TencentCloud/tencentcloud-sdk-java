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

public class ModifyApiRequest extends AbstractModel{

    /**
    * API 所在的服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API 的后端服务类型。支持HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 请求的前端配置。
    */
    @SerializedName("RequestConfig")
    @Expose
    private RequestConfig RequestConfig;

    /**
    * API 接口唯一 ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 用户自定义的 API 名称。
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 用户自定义的 API 接口描述。
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * API 类型，支持NORMAL和TSF，默认为NORMAL。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API 鉴权类型。支持SECRET、NONE、OAUTH、APP。默认为NONE。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 是否需要签名认证，True 表示需要，False 表示不需要。待废弃。
    */
    @SerializedName("AuthRequired")
    @Expose
    private Boolean AuthRequired;

    /**
    * API 的后端服务超时时间，单位是秒。
    */
    @SerializedName("ServiceTimeout")
    @Expose
    private Long ServiceTimeout;

    /**
    * API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 是否需要开启跨域，Ture 表示需要，False 表示不需要。
    */
    @SerializedName("EnableCORS")
    @Expose
    private Boolean EnableCORS;

    /**
    * 常量参数。
    */
    @SerializedName("ConstantParameters")
    @Expose
    private ConstantParameter [] ConstantParameters;

    /**
    * 前端请求参数。
    */
    @SerializedName("RequestParameters")
    @Expose
    private ReqParameter [] RequestParameters;

    /**
    * 当AuthType 为 OAUTH时，该字段有效， NORMAL：业务api   OAUTH：授权API。
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
    */
    @SerializedName("ServiceMockReturnMessage")
    @Expose
    private String ServiceMockReturnMessage;

    /**
    * API绑定微服务服务列表。
    */
    @SerializedName("MicroServices")
    @Expose
    private MicroServiceReq [] MicroServices;

    /**
    * 微服务的负载均衡配置。
    */
    @SerializedName("ServiceTsfLoadBalanceConf")
    @Expose
    private TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf;

    /**
    * 微服务的健康检查配置。
    */
    @SerializedName("ServiceTsfHealthCheckConf")
    @Expose
    private HealthCheckConf ServiceTsfHealthCheckConf;

    /**
    * target类型负载均衡配置。（内测阶段）
    */
    @SerializedName("TargetServicesLoadBalanceConf")
    @Expose
    private Long TargetServicesLoadBalanceConf;

    /**
    * target健康检查配置。（内测阶段）
    */
    @SerializedName("TargetServicesHealthCheckConf")
    @Expose
    private HealthCheckConf TargetServicesHealthCheckConf;

    /**
    * scf 函数名称。当后端类型是SCF时生效。
    */
    @SerializedName("ServiceScfFunctionName")
    @Expose
    private String ServiceScfFunctionName;

    /**
    * scf websocket注册函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketRegisterFunctionName")
    @Expose
    private String ServiceWebsocketRegisterFunctionName;

    /**
    * scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketCleanupFunctionName")
    @Expose
    private String ServiceWebsocketCleanupFunctionName;

    /**
    * scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketTransportFunctionName")
    @Expose
    private String ServiceWebsocketTransportFunctionName;

    /**
    * scf 函数命名空间。当后端类型是SCF时生效。
    */
    @SerializedName("ServiceScfFunctionNamespace")
    @Expose
    private String ServiceScfFunctionNamespace;

    /**
    * scf函数版本。当后端类型是SCF时生效。
    */
    @SerializedName("ServiceScfFunctionQualifier")
    @Expose
    private String ServiceScfFunctionQualifier;

    /**
    * scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketRegisterFunctionNamespace")
    @Expose
    private String ServiceWebsocketRegisterFunctionNamespace;

    /**
    * scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketRegisterFunctionQualifier")
    @Expose
    private String ServiceWebsocketRegisterFunctionQualifier;

    /**
    * scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketTransportFunctionNamespace")
    @Expose
    private String ServiceWebsocketTransportFunctionNamespace;

    /**
    * scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketTransportFunctionQualifier")
    @Expose
    private String ServiceWebsocketTransportFunctionQualifier;

    /**
    * scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketCleanupFunctionNamespace")
    @Expose
    private String ServiceWebsocketCleanupFunctionNamespace;

    /**
    * scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
    */
    @SerializedName("ServiceWebsocketCleanupFunctionQualifier")
    @Expose
    private String ServiceWebsocketCleanupFunctionQualifier;

    /**
    * 是否开启响应集成。当后端类型是SCF时生效。
    */
    @SerializedName("ServiceScfIsIntegratedResponse")
    @Expose
    private Boolean ServiceScfIsIntegratedResponse;

    /**
    * 开始调试后计费。（云市场预留字段）
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * 标签。
    */
    @SerializedName("TagSpecifications")
    @Expose
    private Tag TagSpecifications;

    /**
    * 是否删除自定义响应配置错误码，如果不传或者传 False，不删除，当传 True 时，则删除此 API 所有自定义响应配置错误码。
    */
    @SerializedName("IsDeleteResponseErrorCodes")
    @Expose
    private Boolean IsDeleteResponseErrorCodes;

    /**
    * 返回类型。
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * 自定义响应配置成功响应示例。
    */
    @SerializedName("ResponseSuccessExample")
    @Expose
    private String ResponseSuccessExample;

    /**
    * 自定义响应配置失败响应示例。
    */
    @SerializedName("ResponseFailExample")
    @Expose
    private String ResponseFailExample;

    /**
    * API 的后端服务配置。
    */
    @SerializedName("ServiceConfig")
    @Expose
    private ServiceConfig ServiceConfig;

    /**
    * 关联的授权API 唯一 ID，当AuthType为OAUTH且ApiBusinessType为NORMAL时生效。标示业务API绑定的oauth2.0授权API唯一ID。
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * API的后端服务参数。
    */
    @SerializedName("ServiceParameters")
    @Expose
    private ServiceParameter [] ServiceParameters;

    /**
    * oauth配置。当AuthType是OAUTH时生效。
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * 用户自定义错误码配置。
    */
    @SerializedName("ResponseErrorCodes")
    @Expose
    private ResponseErrorCodeReq [] ResponseErrorCodes;

    /**
    * 是否开启Base64编码，只有后端为scf时才会生效。
    */
    @SerializedName("IsBase64Encoded")
    @Expose
    private Boolean IsBase64Encoded;

    /**
    * 是否开启Base64编码的header触发，只有后端为scf时才会生效。
    */
    @SerializedName("IsBase64Trigger")
    @Expose
    private Boolean IsBase64Trigger;

    /**
    * Header触发规则，总规则数不能超过10。
    */
    @SerializedName("Base64EncodedTriggerRules")
    @Expose
    private Base64EncodedTriggerRule [] Base64EncodedTriggerRules;

    /**
    * 事件总线ID。
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * scf函数类型。当后端类型是SCF时生效。支持事件触发(EVENT)，http直通云函数(HTTP)。
    */
    @SerializedName("ServiceScfFunctionType")
    @Expose
    private String ServiceScfFunctionType;

    /**
    * EIAM应用类型。
    */
    @SerializedName("EIAMAppType")
    @Expose
    private String EIAMAppType;

    /**
    * EIAM应用认证类型，支持仅认证（AuthenticationOnly）、认证和鉴权（Authorization）。
    */
    @SerializedName("EIAMAuthType")
    @Expose
    private String EIAMAuthType;

    /**
    * EIAM应用Token 有效时间，单位为秒，默认为7200秒。
    */
    @SerializedName("EIAMAppId")
    @Expose
    private String EIAMAppId;

    /**
    * EIAM应用ID。
    */
    @SerializedName("TokenTimeout")
    @Expose
    private Long TokenTimeout;

    /**
     * Get API 所在的服务唯一 ID。 
     * @return ServiceId API 所在的服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set API 所在的服务唯一 ID。
     * @param ServiceId API 所在的服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API 的后端服务类型。支持HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。 
     * @return ServiceType API 的后端服务类型。支持HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set API 的后端服务类型。支持HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
     * @param ServiceType API 的后端服务类型。支持HTTP、MOCK、TSF、CLB、SCF、WEBSOCKET、TARGET（内测）。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 请求的前端配置。 
     * @return RequestConfig 请求的前端配置。
     */
    public RequestConfig getRequestConfig() {
        return this.RequestConfig;
    }

    /**
     * Set 请求的前端配置。
     * @param RequestConfig 请求的前端配置。
     */
    public void setRequestConfig(RequestConfig RequestConfig) {
        this.RequestConfig = RequestConfig;
    }

    /**
     * Get API 接口唯一 ID。 
     * @return ApiId API 接口唯一 ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API 接口唯一 ID。
     * @param ApiId API 接口唯一 ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 用户自定义的 API 名称。 
     * @return ApiName 用户自定义的 API 名称。
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set 用户自定义的 API 名称。
     * @param ApiName 用户自定义的 API 名称。
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 用户自定义的 API 接口描述。 
     * @return ApiDesc 用户自定义的 API 接口描述。
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set 用户自定义的 API 接口描述。
     * @param ApiDesc 用户自定义的 API 接口描述。
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get API 类型，支持NORMAL和TSF，默认为NORMAL。 
     * @return ApiType API 类型，支持NORMAL和TSF，默认为NORMAL。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API 类型，支持NORMAL和TSF，默认为NORMAL。
     * @param ApiType API 类型，支持NORMAL和TSF，默认为NORMAL。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API 鉴权类型。支持SECRET、NONE、OAUTH、APP。默认为NONE。 
     * @return AuthType API 鉴权类型。支持SECRET、NONE、OAUTH、APP。默认为NONE。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set API 鉴权类型。支持SECRET、NONE、OAUTH、APP。默认为NONE。
     * @param AuthType API 鉴权类型。支持SECRET、NONE、OAUTH、APP。默认为NONE。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 是否需要签名认证，True 表示需要，False 表示不需要。待废弃。 
     * @return AuthRequired 是否需要签名认证，True 表示需要，False 表示不需要。待废弃。
     */
    public Boolean getAuthRequired() {
        return this.AuthRequired;
    }

    /**
     * Set 是否需要签名认证，True 表示需要，False 表示不需要。待废弃。
     * @param AuthRequired 是否需要签名认证，True 表示需要，False 表示不需要。待废弃。
     */
    public void setAuthRequired(Boolean AuthRequired) {
        this.AuthRequired = AuthRequired;
    }

    /**
     * Get API 的后端服务超时时间，单位是秒。 
     * @return ServiceTimeout API 的后端服务超时时间，单位是秒。
     */
    public Long getServiceTimeout() {
        return this.ServiceTimeout;
    }

    /**
     * Set API 的后端服务超时时间，单位是秒。
     * @param ServiceTimeout API 的后端服务超时时间，单位是秒。
     */
    public void setServiceTimeout(Long ServiceTimeout) {
        this.ServiceTimeout = ServiceTimeout;
    }

    /**
     * Get API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。 
     * @return Protocol API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
     * @param Protocol API 的前端请求类型，如 HTTP 或 HTTPS 或者 HTTP 和 HTTPS。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 是否需要开启跨域，Ture 表示需要，False 表示不需要。 
     * @return EnableCORS 是否需要开启跨域，Ture 表示需要，False 表示不需要。
     */
    public Boolean getEnableCORS() {
        return this.EnableCORS;
    }

    /**
     * Set 是否需要开启跨域，Ture 表示需要，False 表示不需要。
     * @param EnableCORS 是否需要开启跨域，Ture 表示需要，False 表示不需要。
     */
    public void setEnableCORS(Boolean EnableCORS) {
        this.EnableCORS = EnableCORS;
    }

    /**
     * Get 常量参数。 
     * @return ConstantParameters 常量参数。
     */
    public ConstantParameter [] getConstantParameters() {
        return this.ConstantParameters;
    }

    /**
     * Set 常量参数。
     * @param ConstantParameters 常量参数。
     */
    public void setConstantParameters(ConstantParameter [] ConstantParameters) {
        this.ConstantParameters = ConstantParameters;
    }

    /**
     * Get 前端请求参数。 
     * @return RequestParameters 前端请求参数。
     */
    public ReqParameter [] getRequestParameters() {
        return this.RequestParameters;
    }

    /**
     * Set 前端请求参数。
     * @param RequestParameters 前端请求参数。
     */
    public void setRequestParameters(ReqParameter [] RequestParameters) {
        this.RequestParameters = RequestParameters;
    }

    /**
     * Get 当AuthType 为 OAUTH时，该字段有效， NORMAL：业务api   OAUTH：授权API。 
     * @return ApiBusinessType 当AuthType 为 OAUTH时，该字段有效， NORMAL：业务api   OAUTH：授权API。
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set 当AuthType 为 OAUTH时，该字段有效， NORMAL：业务api   OAUTH：授权API。
     * @param ApiBusinessType 当AuthType 为 OAUTH时，该字段有效， NORMAL：业务api   OAUTH：授权API。
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。 
     * @return ServiceMockReturnMessage API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
     */
    public String getServiceMockReturnMessage() {
        return this.ServiceMockReturnMessage;
    }

    /**
     * Set API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
     * @param ServiceMockReturnMessage API 的后端 Mock 返回信息。如果 ServiceType 是 Mock，则此参数必传。
     */
    public void setServiceMockReturnMessage(String ServiceMockReturnMessage) {
        this.ServiceMockReturnMessage = ServiceMockReturnMessage;
    }

    /**
     * Get API绑定微服务服务列表。 
     * @return MicroServices API绑定微服务服务列表。
     */
    public MicroServiceReq [] getMicroServices() {
        return this.MicroServices;
    }

    /**
     * Set API绑定微服务服务列表。
     * @param MicroServices API绑定微服务服务列表。
     */
    public void setMicroServices(MicroServiceReq [] MicroServices) {
        this.MicroServices = MicroServices;
    }

    /**
     * Get 微服务的负载均衡配置。 
     * @return ServiceTsfLoadBalanceConf 微服务的负载均衡配置。
     */
    public TsfLoadBalanceConfResp getServiceTsfLoadBalanceConf() {
        return this.ServiceTsfLoadBalanceConf;
    }

    /**
     * Set 微服务的负载均衡配置。
     * @param ServiceTsfLoadBalanceConf 微服务的负载均衡配置。
     */
    public void setServiceTsfLoadBalanceConf(TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf) {
        this.ServiceTsfLoadBalanceConf = ServiceTsfLoadBalanceConf;
    }

    /**
     * Get 微服务的健康检查配置。 
     * @return ServiceTsfHealthCheckConf 微服务的健康检查配置。
     */
    public HealthCheckConf getServiceTsfHealthCheckConf() {
        return this.ServiceTsfHealthCheckConf;
    }

    /**
     * Set 微服务的健康检查配置。
     * @param ServiceTsfHealthCheckConf 微服务的健康检查配置。
     */
    public void setServiceTsfHealthCheckConf(HealthCheckConf ServiceTsfHealthCheckConf) {
        this.ServiceTsfHealthCheckConf = ServiceTsfHealthCheckConf;
    }

    /**
     * Get target类型负载均衡配置。（内测阶段） 
     * @return TargetServicesLoadBalanceConf target类型负载均衡配置。（内测阶段）
     */
    public Long getTargetServicesLoadBalanceConf() {
        return this.TargetServicesLoadBalanceConf;
    }

    /**
     * Set target类型负载均衡配置。（内测阶段）
     * @param TargetServicesLoadBalanceConf target类型负载均衡配置。（内测阶段）
     */
    public void setTargetServicesLoadBalanceConf(Long TargetServicesLoadBalanceConf) {
        this.TargetServicesLoadBalanceConf = TargetServicesLoadBalanceConf;
    }

    /**
     * Get target健康检查配置。（内测阶段） 
     * @return TargetServicesHealthCheckConf target健康检查配置。（内测阶段）
     */
    public HealthCheckConf getTargetServicesHealthCheckConf() {
        return this.TargetServicesHealthCheckConf;
    }

    /**
     * Set target健康检查配置。（内测阶段）
     * @param TargetServicesHealthCheckConf target健康检查配置。（内测阶段）
     */
    public void setTargetServicesHealthCheckConf(HealthCheckConf TargetServicesHealthCheckConf) {
        this.TargetServicesHealthCheckConf = TargetServicesHealthCheckConf;
    }

    /**
     * Get scf 函数名称。当后端类型是SCF时生效。 
     * @return ServiceScfFunctionName scf 函数名称。当后端类型是SCF时生效。
     */
    public String getServiceScfFunctionName() {
        return this.ServiceScfFunctionName;
    }

    /**
     * Set scf 函数名称。当后端类型是SCF时生效。
     * @param ServiceScfFunctionName scf 函数名称。当后端类型是SCF时生效。
     */
    public void setServiceScfFunctionName(String ServiceScfFunctionName) {
        this.ServiceScfFunctionName = ServiceScfFunctionName;
    }

    /**
     * Get scf websocket注册函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketRegisterFunctionName scf websocket注册函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketRegisterFunctionName() {
        return this.ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Set scf websocket注册函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketRegisterFunctionName scf websocket注册函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketRegisterFunctionName(String ServiceWebsocketRegisterFunctionName) {
        this.ServiceWebsocketRegisterFunctionName = ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Get scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketCleanupFunctionName scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketCleanupFunctionName() {
        return this.ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Set scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketCleanupFunctionName scf websocket清理函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketCleanupFunctionName(String ServiceWebsocketCleanupFunctionName) {
        this.ServiceWebsocketCleanupFunctionName = ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Get scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketTransportFunctionName scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketTransportFunctionName() {
        return this.ServiceWebsocketTransportFunctionName;
    }

    /**
     * Set scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketTransportFunctionName scf websocket传输函数。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketTransportFunctionName(String ServiceWebsocketTransportFunctionName) {
        this.ServiceWebsocketTransportFunctionName = ServiceWebsocketTransportFunctionName;
    }

    /**
     * Get scf 函数命名空间。当后端类型是SCF时生效。 
     * @return ServiceScfFunctionNamespace scf 函数命名空间。当后端类型是SCF时生效。
     */
    public String getServiceScfFunctionNamespace() {
        return this.ServiceScfFunctionNamespace;
    }

    /**
     * Set scf 函数命名空间。当后端类型是SCF时生效。
     * @param ServiceScfFunctionNamespace scf 函数命名空间。当后端类型是SCF时生效。
     */
    public void setServiceScfFunctionNamespace(String ServiceScfFunctionNamespace) {
        this.ServiceScfFunctionNamespace = ServiceScfFunctionNamespace;
    }

    /**
     * Get scf函数版本。当后端类型是SCF时生效。 
     * @return ServiceScfFunctionQualifier scf函数版本。当后端类型是SCF时生效。
     */
    public String getServiceScfFunctionQualifier() {
        return this.ServiceScfFunctionQualifier;
    }

    /**
     * Set scf函数版本。当后端类型是SCF时生效。
     * @param ServiceScfFunctionQualifier scf函数版本。当后端类型是SCF时生效。
     */
    public void setServiceScfFunctionQualifier(String ServiceScfFunctionQualifier) {
        this.ServiceScfFunctionQualifier = ServiceScfFunctionQualifier;
    }

    /**
     * Get scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketRegisterFunctionNamespace scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketRegisterFunctionNamespace() {
        return this.ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Set scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketRegisterFunctionNamespace scf websocket注册函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketRegisterFunctionNamespace(String ServiceWebsocketRegisterFunctionNamespace) {
        this.ServiceWebsocketRegisterFunctionNamespace = ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Get scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketRegisterFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketRegisterFunctionQualifier() {
        return this.ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Set scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketRegisterFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketRegisterFunctionQualifier(String ServiceWebsocketRegisterFunctionQualifier) {
        this.ServiceWebsocketRegisterFunctionQualifier = ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Get scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketTransportFunctionNamespace scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketTransportFunctionNamespace() {
        return this.ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Set scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketTransportFunctionNamespace scf websocket传输函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketTransportFunctionNamespace(String ServiceWebsocketTransportFunctionNamespace) {
        this.ServiceWebsocketTransportFunctionNamespace = ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Get scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketTransportFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketTransportFunctionQualifier() {
        return this.ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Set scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketTransportFunctionQualifier scf websocket传输函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketTransportFunctionQualifier(String ServiceWebsocketTransportFunctionQualifier) {
        this.ServiceWebsocketTransportFunctionQualifier = ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Get scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketCleanupFunctionNamespace scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketCleanupFunctionNamespace() {
        return this.ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Set scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketCleanupFunctionNamespace scf websocket清理函数命名空间。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketCleanupFunctionNamespace(String ServiceWebsocketCleanupFunctionNamespace) {
        this.ServiceWebsocketCleanupFunctionNamespace = ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Get scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。 
     * @return ServiceWebsocketCleanupFunctionQualifier scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public String getServiceWebsocketCleanupFunctionQualifier() {
        return this.ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Set scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     * @param ServiceWebsocketCleanupFunctionQualifier scf websocket清理函数版本。当前端类型是WEBSOCKET且后端类型是SCF时生效。
     */
    public void setServiceWebsocketCleanupFunctionQualifier(String ServiceWebsocketCleanupFunctionQualifier) {
        this.ServiceWebsocketCleanupFunctionQualifier = ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Get 是否开启响应集成。当后端类型是SCF时生效。 
     * @return ServiceScfIsIntegratedResponse 是否开启响应集成。当后端类型是SCF时生效。
     */
    public Boolean getServiceScfIsIntegratedResponse() {
        return this.ServiceScfIsIntegratedResponse;
    }

    /**
     * Set 是否开启响应集成。当后端类型是SCF时生效。
     * @param ServiceScfIsIntegratedResponse 是否开启响应集成。当后端类型是SCF时生效。
     */
    public void setServiceScfIsIntegratedResponse(Boolean ServiceScfIsIntegratedResponse) {
        this.ServiceScfIsIntegratedResponse = ServiceScfIsIntegratedResponse;
    }

    /**
     * Get 开始调试后计费。（云市场预留字段） 
     * @return IsDebugAfterCharge 开始调试后计费。（云市场预留字段）
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set 开始调试后计费。（云市场预留字段）
     * @param IsDebugAfterCharge 开始调试后计费。（云市场预留字段）
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get 标签。 
     * @return TagSpecifications 标签。
     */
    public Tag getTagSpecifications() {
        return this.TagSpecifications;
    }

    /**
     * Set 标签。
     * @param TagSpecifications 标签。
     */
    public void setTagSpecifications(Tag TagSpecifications) {
        this.TagSpecifications = TagSpecifications;
    }

    /**
     * Get 是否删除自定义响应配置错误码，如果不传或者传 False，不删除，当传 True 时，则删除此 API 所有自定义响应配置错误码。 
     * @return IsDeleteResponseErrorCodes 是否删除自定义响应配置错误码，如果不传或者传 False，不删除，当传 True 时，则删除此 API 所有自定义响应配置错误码。
     */
    public Boolean getIsDeleteResponseErrorCodes() {
        return this.IsDeleteResponseErrorCodes;
    }

    /**
     * Set 是否删除自定义响应配置错误码，如果不传或者传 False，不删除，当传 True 时，则删除此 API 所有自定义响应配置错误码。
     * @param IsDeleteResponseErrorCodes 是否删除自定义响应配置错误码，如果不传或者传 False，不删除，当传 True 时，则删除此 API 所有自定义响应配置错误码。
     */
    public void setIsDeleteResponseErrorCodes(Boolean IsDeleteResponseErrorCodes) {
        this.IsDeleteResponseErrorCodes = IsDeleteResponseErrorCodes;
    }

    /**
     * Get 返回类型。 
     * @return ResponseType 返回类型。
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set 返回类型。
     * @param ResponseType 返回类型。
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get 自定义响应配置成功响应示例。 
     * @return ResponseSuccessExample 自定义响应配置成功响应示例。
     */
    public String getResponseSuccessExample() {
        return this.ResponseSuccessExample;
    }

    /**
     * Set 自定义响应配置成功响应示例。
     * @param ResponseSuccessExample 自定义响应配置成功响应示例。
     */
    public void setResponseSuccessExample(String ResponseSuccessExample) {
        this.ResponseSuccessExample = ResponseSuccessExample;
    }

    /**
     * Get 自定义响应配置失败响应示例。 
     * @return ResponseFailExample 自定义响应配置失败响应示例。
     */
    public String getResponseFailExample() {
        return this.ResponseFailExample;
    }

    /**
     * Set 自定义响应配置失败响应示例。
     * @param ResponseFailExample 自定义响应配置失败响应示例。
     */
    public void setResponseFailExample(String ResponseFailExample) {
        this.ResponseFailExample = ResponseFailExample;
    }

    /**
     * Get API 的后端服务配置。 
     * @return ServiceConfig API 的后端服务配置。
     */
    public ServiceConfig getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set API 的后端服务配置。
     * @param ServiceConfig API 的后端服务配置。
     */
    public void setServiceConfig(ServiceConfig ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get 关联的授权API 唯一 ID，当AuthType为OAUTH且ApiBusinessType为NORMAL时生效。标示业务API绑定的oauth2.0授权API唯一ID。 
     * @return AuthRelationApiId 关联的授权API 唯一 ID，当AuthType为OAUTH且ApiBusinessType为NORMAL时生效。标示业务API绑定的oauth2.0授权API唯一ID。
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set 关联的授权API 唯一 ID，当AuthType为OAUTH且ApiBusinessType为NORMAL时生效。标示业务API绑定的oauth2.0授权API唯一ID。
     * @param AuthRelationApiId 关联的授权API 唯一 ID，当AuthType为OAUTH且ApiBusinessType为NORMAL时生效。标示业务API绑定的oauth2.0授权API唯一ID。
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get API的后端服务参数。 
     * @return ServiceParameters API的后端服务参数。
     */
    public ServiceParameter [] getServiceParameters() {
        return this.ServiceParameters;
    }

    /**
     * Set API的后端服务参数。
     * @param ServiceParameters API的后端服务参数。
     */
    public void setServiceParameters(ServiceParameter [] ServiceParameters) {
        this.ServiceParameters = ServiceParameters;
    }

    /**
     * Get oauth配置。当AuthType是OAUTH时生效。 
     * @return OauthConfig oauth配置。当AuthType是OAUTH时生效。
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set oauth配置。当AuthType是OAUTH时生效。
     * @param OauthConfig oauth配置。当AuthType是OAUTH时生效。
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get 用户自定义错误码配置。 
     * @return ResponseErrorCodes 用户自定义错误码配置。
     */
    public ResponseErrorCodeReq [] getResponseErrorCodes() {
        return this.ResponseErrorCodes;
    }

    /**
     * Set 用户自定义错误码配置。
     * @param ResponseErrorCodes 用户自定义错误码配置。
     */
    public void setResponseErrorCodes(ResponseErrorCodeReq [] ResponseErrorCodes) {
        this.ResponseErrorCodes = ResponseErrorCodes;
    }

    /**
     * Get 是否开启Base64编码，只有后端为scf时才会生效。 
     * @return IsBase64Encoded 是否开启Base64编码，只有后端为scf时才会生效。
     */
    public Boolean getIsBase64Encoded() {
        return this.IsBase64Encoded;
    }

    /**
     * Set 是否开启Base64编码，只有后端为scf时才会生效。
     * @param IsBase64Encoded 是否开启Base64编码，只有后端为scf时才会生效。
     */
    public void setIsBase64Encoded(Boolean IsBase64Encoded) {
        this.IsBase64Encoded = IsBase64Encoded;
    }

    /**
     * Get 是否开启Base64编码的header触发，只有后端为scf时才会生效。 
     * @return IsBase64Trigger 是否开启Base64编码的header触发，只有后端为scf时才会生效。
     */
    public Boolean getIsBase64Trigger() {
        return this.IsBase64Trigger;
    }

    /**
     * Set 是否开启Base64编码的header触发，只有后端为scf时才会生效。
     * @param IsBase64Trigger 是否开启Base64编码的header触发，只有后端为scf时才会生效。
     */
    public void setIsBase64Trigger(Boolean IsBase64Trigger) {
        this.IsBase64Trigger = IsBase64Trigger;
    }

    /**
     * Get Header触发规则，总规则数不能超过10。 
     * @return Base64EncodedTriggerRules Header触发规则，总规则数不能超过10。
     */
    public Base64EncodedTriggerRule [] getBase64EncodedTriggerRules() {
        return this.Base64EncodedTriggerRules;
    }

    /**
     * Set Header触发规则，总规则数不能超过10。
     * @param Base64EncodedTriggerRules Header触发规则，总规则数不能超过10。
     */
    public void setBase64EncodedTriggerRules(Base64EncodedTriggerRule [] Base64EncodedTriggerRules) {
        this.Base64EncodedTriggerRules = Base64EncodedTriggerRules;
    }

    /**
     * Get 事件总线ID。 
     * @return EventBusId 事件总线ID。
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件总线ID。
     * @param EventBusId 事件总线ID。
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get scf函数类型。当后端类型是SCF时生效。支持事件触发(EVENT)，http直通云函数(HTTP)。 
     * @return ServiceScfFunctionType scf函数类型。当后端类型是SCF时生效。支持事件触发(EVENT)，http直通云函数(HTTP)。
     */
    public String getServiceScfFunctionType() {
        return this.ServiceScfFunctionType;
    }

    /**
     * Set scf函数类型。当后端类型是SCF时生效。支持事件触发(EVENT)，http直通云函数(HTTP)。
     * @param ServiceScfFunctionType scf函数类型。当后端类型是SCF时生效。支持事件触发(EVENT)，http直通云函数(HTTP)。
     */
    public void setServiceScfFunctionType(String ServiceScfFunctionType) {
        this.ServiceScfFunctionType = ServiceScfFunctionType;
    }

    /**
     * Get EIAM应用类型。 
     * @return EIAMAppType EIAM应用类型。
     */
    public String getEIAMAppType() {
        return this.EIAMAppType;
    }

    /**
     * Set EIAM应用类型。
     * @param EIAMAppType EIAM应用类型。
     */
    public void setEIAMAppType(String EIAMAppType) {
        this.EIAMAppType = EIAMAppType;
    }

    /**
     * Get EIAM应用认证类型，支持仅认证（AuthenticationOnly）、认证和鉴权（Authorization）。 
     * @return EIAMAuthType EIAM应用认证类型，支持仅认证（AuthenticationOnly）、认证和鉴权（Authorization）。
     */
    public String getEIAMAuthType() {
        return this.EIAMAuthType;
    }

    /**
     * Set EIAM应用认证类型，支持仅认证（AuthenticationOnly）、认证和鉴权（Authorization）。
     * @param EIAMAuthType EIAM应用认证类型，支持仅认证（AuthenticationOnly）、认证和鉴权（Authorization）。
     */
    public void setEIAMAuthType(String EIAMAuthType) {
        this.EIAMAuthType = EIAMAuthType;
    }

    /**
     * Get EIAM应用Token 有效时间，单位为秒，默认为7200秒。 
     * @return EIAMAppId EIAM应用Token 有效时间，单位为秒，默认为7200秒。
     */
    public String getEIAMAppId() {
        return this.EIAMAppId;
    }

    /**
     * Set EIAM应用Token 有效时间，单位为秒，默认为7200秒。
     * @param EIAMAppId EIAM应用Token 有效时间，单位为秒，默认为7200秒。
     */
    public void setEIAMAppId(String EIAMAppId) {
        this.EIAMAppId = EIAMAppId;
    }

    /**
     * Get EIAM应用ID。 
     * @return TokenTimeout EIAM应用ID。
     */
    public Long getTokenTimeout() {
        return this.TokenTimeout;
    }

    /**
     * Set EIAM应用ID。
     * @param TokenTimeout EIAM应用ID。
     */
    public void setTokenTimeout(Long TokenTimeout) {
        this.TokenTimeout = TokenTimeout;
    }

    public ModifyApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiRequest(ModifyApiRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.RequestConfig != null) {
            this.RequestConfig = new RequestConfig(source.RequestConfig);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.AuthRequired != null) {
            this.AuthRequired = new Boolean(source.AuthRequired);
        }
        if (source.ServiceTimeout != null) {
            this.ServiceTimeout = new Long(source.ServiceTimeout);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.EnableCORS != null) {
            this.EnableCORS = new Boolean(source.EnableCORS);
        }
        if (source.ConstantParameters != null) {
            this.ConstantParameters = new ConstantParameter[source.ConstantParameters.length];
            for (int i = 0; i < source.ConstantParameters.length; i++) {
                this.ConstantParameters[i] = new ConstantParameter(source.ConstantParameters[i]);
            }
        }
        if (source.RequestParameters != null) {
            this.RequestParameters = new ReqParameter[source.RequestParameters.length];
            for (int i = 0; i < source.RequestParameters.length; i++) {
                this.RequestParameters[i] = new ReqParameter(source.RequestParameters[i]);
            }
        }
        if (source.ApiBusinessType != null) {
            this.ApiBusinessType = new String(source.ApiBusinessType);
        }
        if (source.ServiceMockReturnMessage != null) {
            this.ServiceMockReturnMessage = new String(source.ServiceMockReturnMessage);
        }
        if (source.MicroServices != null) {
            this.MicroServices = new MicroServiceReq[source.MicroServices.length];
            for (int i = 0; i < source.MicroServices.length; i++) {
                this.MicroServices[i] = new MicroServiceReq(source.MicroServices[i]);
            }
        }
        if (source.ServiceTsfLoadBalanceConf != null) {
            this.ServiceTsfLoadBalanceConf = new TsfLoadBalanceConfResp(source.ServiceTsfLoadBalanceConf);
        }
        if (source.ServiceTsfHealthCheckConf != null) {
            this.ServiceTsfHealthCheckConf = new HealthCheckConf(source.ServiceTsfHealthCheckConf);
        }
        if (source.TargetServicesLoadBalanceConf != null) {
            this.TargetServicesLoadBalanceConf = new Long(source.TargetServicesLoadBalanceConf);
        }
        if (source.TargetServicesHealthCheckConf != null) {
            this.TargetServicesHealthCheckConf = new HealthCheckConf(source.TargetServicesHealthCheckConf);
        }
        if (source.ServiceScfFunctionName != null) {
            this.ServiceScfFunctionName = new String(source.ServiceScfFunctionName);
        }
        if (source.ServiceWebsocketRegisterFunctionName != null) {
            this.ServiceWebsocketRegisterFunctionName = new String(source.ServiceWebsocketRegisterFunctionName);
        }
        if (source.ServiceWebsocketCleanupFunctionName != null) {
            this.ServiceWebsocketCleanupFunctionName = new String(source.ServiceWebsocketCleanupFunctionName);
        }
        if (source.ServiceWebsocketTransportFunctionName != null) {
            this.ServiceWebsocketTransportFunctionName = new String(source.ServiceWebsocketTransportFunctionName);
        }
        if (source.ServiceScfFunctionNamespace != null) {
            this.ServiceScfFunctionNamespace = new String(source.ServiceScfFunctionNamespace);
        }
        if (source.ServiceScfFunctionQualifier != null) {
            this.ServiceScfFunctionQualifier = new String(source.ServiceScfFunctionQualifier);
        }
        if (source.ServiceWebsocketRegisterFunctionNamespace != null) {
            this.ServiceWebsocketRegisterFunctionNamespace = new String(source.ServiceWebsocketRegisterFunctionNamespace);
        }
        if (source.ServiceWebsocketRegisterFunctionQualifier != null) {
            this.ServiceWebsocketRegisterFunctionQualifier = new String(source.ServiceWebsocketRegisterFunctionQualifier);
        }
        if (source.ServiceWebsocketTransportFunctionNamespace != null) {
            this.ServiceWebsocketTransportFunctionNamespace = new String(source.ServiceWebsocketTransportFunctionNamespace);
        }
        if (source.ServiceWebsocketTransportFunctionQualifier != null) {
            this.ServiceWebsocketTransportFunctionQualifier = new String(source.ServiceWebsocketTransportFunctionQualifier);
        }
        if (source.ServiceWebsocketCleanupFunctionNamespace != null) {
            this.ServiceWebsocketCleanupFunctionNamespace = new String(source.ServiceWebsocketCleanupFunctionNamespace);
        }
        if (source.ServiceWebsocketCleanupFunctionQualifier != null) {
            this.ServiceWebsocketCleanupFunctionQualifier = new String(source.ServiceWebsocketCleanupFunctionQualifier);
        }
        if (source.ServiceScfIsIntegratedResponse != null) {
            this.ServiceScfIsIntegratedResponse = new Boolean(source.ServiceScfIsIntegratedResponse);
        }
        if (source.IsDebugAfterCharge != null) {
            this.IsDebugAfterCharge = new Boolean(source.IsDebugAfterCharge);
        }
        if (source.TagSpecifications != null) {
            this.TagSpecifications = new Tag(source.TagSpecifications);
        }
        if (source.IsDeleteResponseErrorCodes != null) {
            this.IsDeleteResponseErrorCodes = new Boolean(source.IsDeleteResponseErrorCodes);
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
        if (source.ServiceConfig != null) {
            this.ServiceConfig = new ServiceConfig(source.ServiceConfig);
        }
        if (source.AuthRelationApiId != null) {
            this.AuthRelationApiId = new String(source.AuthRelationApiId);
        }
        if (source.ServiceParameters != null) {
            this.ServiceParameters = new ServiceParameter[source.ServiceParameters.length];
            for (int i = 0; i < source.ServiceParameters.length; i++) {
                this.ServiceParameters[i] = new ServiceParameter(source.ServiceParameters[i]);
            }
        }
        if (source.OauthConfig != null) {
            this.OauthConfig = new OauthConfig(source.OauthConfig);
        }
        if (source.ResponseErrorCodes != null) {
            this.ResponseErrorCodes = new ResponseErrorCodeReq[source.ResponseErrorCodes.length];
            for (int i = 0; i < source.ResponseErrorCodes.length; i++) {
                this.ResponseErrorCodes[i] = new ResponseErrorCodeReq(source.ResponseErrorCodes[i]);
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
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.ServiceScfFunctionType != null) {
            this.ServiceScfFunctionType = new String(source.ServiceScfFunctionType);
        }
        if (source.EIAMAppType != null) {
            this.EIAMAppType = new String(source.EIAMAppType);
        }
        if (source.EIAMAuthType != null) {
            this.EIAMAuthType = new String(source.EIAMAuthType);
        }
        if (source.EIAMAppId != null) {
            this.EIAMAppId = new String(source.EIAMAppId);
        }
        if (source.TokenTimeout != null) {
            this.TokenTimeout = new Long(source.TokenTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "RequestConfig.", this.RequestConfig);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthRequired", this.AuthRequired);
        this.setParamSimple(map, prefix + "ServiceTimeout", this.ServiceTimeout);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "EnableCORS", this.EnableCORS);
        this.setParamArrayObj(map, prefix + "ConstantParameters.", this.ConstantParameters);
        this.setParamArrayObj(map, prefix + "RequestParameters.", this.RequestParameters);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "ServiceMockReturnMessage", this.ServiceMockReturnMessage);
        this.setParamArrayObj(map, prefix + "MicroServices.", this.MicroServices);
        this.setParamObj(map, prefix + "ServiceTsfLoadBalanceConf.", this.ServiceTsfLoadBalanceConf);
        this.setParamObj(map, prefix + "ServiceTsfHealthCheckConf.", this.ServiceTsfHealthCheckConf);
        this.setParamSimple(map, prefix + "TargetServicesLoadBalanceConf", this.TargetServicesLoadBalanceConf);
        this.setParamObj(map, prefix + "TargetServicesHealthCheckConf.", this.TargetServicesHealthCheckConf);
        this.setParamSimple(map, prefix + "ServiceScfFunctionName", this.ServiceScfFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionName", this.ServiceWebsocketRegisterFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionName", this.ServiceWebsocketCleanupFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionName", this.ServiceWebsocketTransportFunctionName);
        this.setParamSimple(map, prefix + "ServiceScfFunctionNamespace", this.ServiceScfFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceScfFunctionQualifier", this.ServiceScfFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionNamespace", this.ServiceWebsocketRegisterFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionQualifier", this.ServiceWebsocketRegisterFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionNamespace", this.ServiceWebsocketTransportFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionQualifier", this.ServiceWebsocketTransportFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionNamespace", this.ServiceWebsocketCleanupFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionQualifier", this.ServiceWebsocketCleanupFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceScfIsIntegratedResponse", this.ServiceScfIsIntegratedResponse);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamObj(map, prefix + "TagSpecifications.", this.TagSpecifications);
        this.setParamSimple(map, prefix + "IsDeleteResponseErrorCodes", this.IsDeleteResponseErrorCodes);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseSuccessExample", this.ResponseSuccessExample);
        this.setParamSimple(map, prefix + "ResponseFailExample", this.ResponseFailExample);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamArrayObj(map, prefix + "ServiceParameters.", this.ServiceParameters);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamArrayObj(map, prefix + "ResponseErrorCodes.", this.ResponseErrorCodes);
        this.setParamSimple(map, prefix + "IsBase64Encoded", this.IsBase64Encoded);
        this.setParamSimple(map, prefix + "IsBase64Trigger", this.IsBase64Trigger);
        this.setParamArrayObj(map, prefix + "Base64EncodedTriggerRules.", this.Base64EncodedTriggerRules);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "ServiceScfFunctionType", this.ServiceScfFunctionType);
        this.setParamSimple(map, prefix + "EIAMAppType", this.EIAMAppType);
        this.setParamSimple(map, prefix + "EIAMAuthType", this.EIAMAuthType);
        this.setParamSimple(map, prefix + "EIAMAppId", this.EIAMAppId);
        this.setParamSimple(map, prefix + "TokenTimeout", this.TokenTimeout);

    }
}

