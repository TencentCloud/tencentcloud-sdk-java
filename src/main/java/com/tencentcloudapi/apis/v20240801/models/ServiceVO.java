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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceVO extends AbstractModel {

    /**
    * <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>里约应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaasID")
    @Expose
    private String PaasID;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelIDs")
    @Expose
    private String [] LabelIDs;

    /**
    * <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryIDs")
    @Expose
    private String [] CategoryIDs;

    /**
    * <p>鉴权方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>签名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignType")
    @Expose
    private String SignType;

    /**
    * <p>登录方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginTypes")
    @Expose
    private String [] LoginTypes;

    /**
    * <p>负载方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetSelect")
    @Expose
    private String TargetSelect;

    /**
    * <p>公开路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PubPath")
    @Expose
    private String PubPath;

    /**
    * <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestMethod")
    @Expose
    private String RequestMethod;

    /**
    * <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * <p>是否https</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * <p>http协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpProtocolVersion")
    @Expose
    private String HttpProtocolVersion;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Versions")
    @Expose
    private VersionDTO [] Versions;

    /**
    * <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestParamsValidatorStatus")
    @Expose
    private Boolean RequestParamsValidatorStatus;

    /**
    * <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestParamsValidatorJsonInfoT")
    @Expose
    private String RequestParamsValidatorJsonInfoT;

    /**
    * <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseParamsValidatorStatus")
    @Expose
    private Boolean ResponseParamsValidatorStatus;

    /**
    * <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseParamsValidatorJsonInfoT")
    @Expose
    private String ResponseParamsValidatorJsonInfoT;

    /**
    * <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private Boolean HealthCheckStatus;

    /**
    * <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfigDTO HealthCheckConfig;

    /**
    * <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceTypeStatus")
    @Expose
    private Boolean SourceTypeStatus;

    /**
    * <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceTypeConfig")
    @Expose
    private SourceTypeConfigDTO SourceTypeConfig;

    /**
    * <p>是否开启Token限流</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenLimitStatus")
    @Expose
    private Boolean TokenLimitStatus;

    /**
    * <p>Token限流配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenLimitConfig")
    @Expose
    private TokenLimitConfigDTO TokenLimitConfig;

    /**
    * <p>是否开启内容安全</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmsStatus")
    @Expose
    private Boolean TmsStatus;

    /**
    * <p>内容安全配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmsConfig")
    @Expose
    private TmsConfigDTO TmsConfig;

    /**
    * <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteStatus")
    @Expose
    private Boolean IpWhiteStatus;

    /**
    * <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpWhiteList")
    @Expose
    private String [] IpWhiteList;

    /**
    * <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackStatus")
    @Expose
    private Boolean IpBlackStatus;

    /**
    * <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpBlackList")
    @Expose
    private String [] IpBlackList;

    /**
    * <p>插件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginConfigs")
    @Expose
    private PluginConfigDTO [] PluginConfigs;

    /**
    * <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>app</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("App")
    @Expose
    private IDNameVO App;

    /**
    * <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalogs")
    @Expose
    private IDNameVO [] Catalogs;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private IDNameVO [] Labels;

    /**
    * <p>认证方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logins")
    @Expose
    private IDNameVO [] Logins;

    /**
    * <p>授权数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthAppNum")
    @Expose
    private Long AuthAppNum;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>是否开启报文记录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenMessageLogStatus")
    @Expose
    private Boolean OpenMessageLogStatus;

    /**
    * <p>订阅页面的当前用户是否订阅了该API</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrPaasIDSubscriptionID")
    @Expose
    private String CurrPaasIDSubscriptionID;

    /**
    * <p>目标服务类型 Restful Database Mock</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * <p>SQL模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlTemplate")
    @Expose
    private SqlTemplate SqlTemplate;

    /**
    * <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHostType")
    @Expose
    private Long TargetHostType;

    /**
    * <p>后端服务类型 0 自定义 原始数据:ip/域名或vpc 1 后端服务 服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServiceHostType")
    @Expose
    private Long TargetServiceHostType;

    /**
    * <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServerGroupID")
    @Expose
    private String TargetServerGroupID;

    /**
    * <p>后端服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServerGroup")
    @Expose
    private TargetServerGroupDTO TargetServerGroup;

    /**
    * <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomHttpHost")
    @Expose
    private String CustomHttpHost;

    /**
    * <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpHostType")
    @Expose
    private String HttpHostType;

    /**
    * <p>mock响应状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MockStatusCode")
    @Expose
    private Long MockStatusCode;

    /**
    * <p>mock响应body</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MockBody")
    @Expose
    private String MockBody;

    /**
    * <p>mock响应头</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MockHeaders")
    @Expose
    private FieldValueDTO [] MockHeaders;

    /**
    * <p>路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathMatchType")
    @Expose
    private String PathMatchType;

    /**
    * <p>自定义匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomMatch")
    @Expose
    private CustomMatch CustomMatch;

    /**
    * <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>绑定的mcp server数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("McpServerNum")
    @Expose
    private Long McpServerNum;

    /**
     * Get <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>里约应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaasID <p>里约应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getPaasID() {
        return this.PaasID;
    }

    /**
     * Set <p>里约应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaasID <p>里约应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setPaasID(String PaasID) {
        this.PaasID = PaasID;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelIDs <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelIDs() {
        return this.LabelIDs;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelIDs <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelIDs(String [] LabelIDs) {
        this.LabelIDs = LabelIDs;
    }

    /**
     * Get <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryIDs <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCategoryIDs() {
        return this.CategoryIDs;
    }

    /**
     * Set <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryIDs <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryIDs(String [] CategoryIDs) {
        this.CategoryIDs = CategoryIDs;
    }

    /**
     * Get <p>鉴权方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType <p>鉴权方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>鉴权方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType <p>鉴权方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>签名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignType <p>签名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSignType() {
        return this.SignType;
    }

    /**
     * Set <p>签名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignType <p>签名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSignType(String SignType) {
        this.SignType = SignType;
    }

    /**
     * Get <p>登录方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginTypes <p>登录方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String [] getLoginTypes() {
        return this.LoginTypes;
    }

    /**
     * Set <p>登录方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginTypes <p>登录方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setLoginTypes(String [] LoginTypes) {
        this.LoginTypes = LoginTypes;
    }

    /**
     * Get <p>负载方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetSelect <p>负载方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetSelect() {
        return this.TargetSelect;
    }

    /**
     * Set <p>负载方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetSelect <p>负载方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetSelect(String TargetSelect) {
        this.TargetSelect = TargetSelect;
    }

    /**
     * Get <p>公开路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PubPath <p>公开路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPubPath() {
        return this.PubPath;
    }

    /**
     * Set <p>公开路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PubPath <p>公开路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPubPath(String PubPath) {
        this.PubPath = PubPath;
    }

    /**
     * Get <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestMethod <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestMethod() {
        return this.RequestMethod;
    }

    /**
     * Set <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestMethod <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestMethod(String RequestMethod) {
        this.RequestMethod = RequestMethod;
    }

    /**
     * Get <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHosts <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHosts <p>目标服务器</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get <p>是否https</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpProtocolType <p>是否https</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set <p>是否https</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpProtocolType <p>是否https</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckTargetCertsError <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckTargetCertsError <p>证书检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get <p>http协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpProtocolVersion <p>http协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpProtocolVersion() {
        return this.HttpProtocolVersion;
    }

    /**
     * Set <p>http协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpProtocolVersion <p>http协议类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpProtocolVersion(String HttpProtocolVersion) {
        this.HttpProtocolVersion = HttpProtocolVersion;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Versions <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VersionDTO [] getVersions() {
        return this.Versions;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Versions <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersions(VersionDTO [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPath <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPath <p>目标路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestParamsValidatorStatus <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRequestParamsValidatorStatus() {
        return this.RequestParamsValidatorStatus;
    }

    /**
     * Set <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestParamsValidatorStatus <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestParamsValidatorStatus(Boolean RequestParamsValidatorStatus) {
        this.RequestParamsValidatorStatus = RequestParamsValidatorStatus;
    }

    /**
     * Get <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestParamsValidatorJsonInfoT <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestParamsValidatorJsonInfoT() {
        return this.RequestParamsValidatorJsonInfoT;
    }

    /**
     * Set <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestParamsValidatorJsonInfoT <p>入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestParamsValidatorJsonInfoT(String RequestParamsValidatorJsonInfoT) {
        this.RequestParamsValidatorJsonInfoT = RequestParamsValidatorJsonInfoT;
    }

    /**
     * Get <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseParamsValidatorStatus <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getResponseParamsValidatorStatus() {
        return this.ResponseParamsValidatorStatus;
    }

    /**
     * Set <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseParamsValidatorStatus <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseParamsValidatorStatus(Boolean ResponseParamsValidatorStatus) {
        this.ResponseParamsValidatorStatus = ResponseParamsValidatorStatus;
    }

    /**
     * Get <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseParamsValidatorJsonInfoT <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseParamsValidatorJsonInfoT() {
        return this.ResponseParamsValidatorJsonInfoT;
    }

    /**
     * Set <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseParamsValidatorJsonInfoT <p>出参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseParamsValidatorJsonInfoT(String ResponseParamsValidatorJsonInfoT) {
        this.ResponseParamsValidatorJsonInfoT = ResponseParamsValidatorJsonInfoT;
    }

    /**
     * Get <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeLimitConfigStatus <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeLimitConfigStatus <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeLimitConfig <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeLimitConfig <p>流量控制</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckStatus <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckStatus <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckStatus(Boolean HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    /**
     * Get <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckConfig <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckConfigDTO getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckConfig <p>健康检查</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckConfig(HealthCheckConfigDTO HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * Get <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceTypeStatus <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSourceTypeStatus() {
        return this.SourceTypeStatus;
    }

    /**
     * Set <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceTypeStatus <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceTypeStatus(Boolean SourceTypeStatus) {
        this.SourceTypeStatus = SourceTypeStatus;
    }

    /**
     * Get <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceTypeConfig <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SourceTypeConfigDTO getSourceTypeConfig() {
        return this.SourceTypeConfig;
    }

    /**
     * Set <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceTypeConfig <p>格式转换</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceTypeConfig(SourceTypeConfigDTO SourceTypeConfig) {
        this.SourceTypeConfig = SourceTypeConfig;
    }

    /**
     * Get <p>是否开启Token限流</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenLimitStatus <p>是否开启Token限流</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getTokenLimitStatus() {
        return this.TokenLimitStatus;
    }

    /**
     * Set <p>是否开启Token限流</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenLimitStatus <p>是否开启Token限流</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setTokenLimitStatus(Boolean TokenLimitStatus) {
        this.TokenLimitStatus = TokenLimitStatus;
    }

    /**
     * Get <p>Token限流配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenLimitConfig <p>Token限流配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public TokenLimitConfigDTO getTokenLimitConfig() {
        return this.TokenLimitConfig;
    }

    /**
     * Set <p>Token限流配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenLimitConfig <p>Token限流配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setTokenLimitConfig(TokenLimitConfigDTO TokenLimitConfig) {
        this.TokenLimitConfig = TokenLimitConfig;
    }

    /**
     * Get <p>是否开启内容安全</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmsStatus <p>是否开启内容安全</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Boolean getTmsStatus() {
        return this.TmsStatus;
    }

    /**
     * Set <p>是否开启内容安全</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmsStatus <p>是否开启内容安全</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setTmsStatus(Boolean TmsStatus) {
        this.TmsStatus = TmsStatus;
    }

    /**
     * Get <p>内容安全配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmsConfig <p>内容安全配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public TmsConfigDTO getTmsConfig() {
        return this.TmsConfig;
    }

    /**
     * Set <p>内容安全配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmsConfig <p>内容安全配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setTmsConfig(TmsConfigDTO TmsConfig) {
        this.TmsConfig = TmsConfig;
    }

    /**
     * Get <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteStatus <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpWhiteStatus() {
        return this.IpWhiteStatus;
    }

    /**
     * Set <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteStatus <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteStatus(Boolean IpWhiteStatus) {
        this.IpWhiteStatus = IpWhiteStatus;
    }

    /**
     * Get <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpWhiteList <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpWhiteList() {
        return this.IpWhiteList;
    }

    /**
     * Set <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpWhiteList <p>IP白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpWhiteList(String [] IpWhiteList) {
        this.IpWhiteList = IpWhiteList;
    }

    /**
     * Get <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackStatus <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIpBlackStatus() {
        return this.IpBlackStatus;
    }

    /**
     * Set <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackStatus <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackStatus(Boolean IpBlackStatus) {
        this.IpBlackStatus = IpBlackStatus;
    }

    /**
     * Get <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpBlackList <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpBlackList() {
        return this.IpBlackList;
    }

    /**
     * Set <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpBlackList <p>IP黑名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpBlackList(String [] IpBlackList) {
        this.IpBlackList = IpBlackList;
    }

    /**
     * Get <p>插件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginConfigs <p>插件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PluginConfigDTO [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set <p>插件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginConfigs <p>插件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginConfigs(PluginConfigDTO [] PluginConfigs) {
        this.PluginConfigs = PluginConfigs;
    }

    /**
     * Get <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url <p>预览地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>app</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return App <p>app</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO getApp() {
        return this.App;
    }

    /**
     * Set <p>app</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param App <p>app</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApp(IDNameVO App) {
        this.App = App;
    }

    /**
     * Get <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalogs <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalogs <p>目录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogs(IDNameVO [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(IDNameVO [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>认证方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logins <p>认证方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IDNameVO [] getLogins() {
        return this.Logins;
    }

    /**
     * Set <p>认证方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logins <p>认证方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogins(IDNameVO [] Logins) {
        this.Logins = Logins;
    }

    /**
     * Get <p>授权数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthAppNum <p>授权数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthAppNum() {
        return this.AuthAppNum;
    }

    /**
     * Set <p>授权数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthAppNum <p>授权数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthAppNum(Long AuthAppNum) {
        this.AuthAppNum = AuthAppNum;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTime <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTime <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain <p>域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>是否开启报文记录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenMessageLogStatus <p>是否开启报文记录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOpenMessageLogStatus() {
        return this.OpenMessageLogStatus;
    }

    /**
     * Set <p>是否开启报文记录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenMessageLogStatus <p>是否开启报文记录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenMessageLogStatus(Boolean OpenMessageLogStatus) {
        this.OpenMessageLogStatus = OpenMessageLogStatus;
    }

    /**
     * Get <p>订阅页面的当前用户是否订阅了该API</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrPaasIDSubscriptionID <p>订阅页面的当前用户是否订阅了该API</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getCurrPaasIDSubscriptionID() {
        return this.CurrPaasIDSubscriptionID;
    }

    /**
     * Set <p>订阅页面的当前用户是否订阅了该API</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrPaasIDSubscriptionID <p>订阅页面的当前用户是否订阅了该API</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setCurrPaasIDSubscriptionID(String CurrPaasIDSubscriptionID) {
        this.CurrPaasIDSubscriptionID = CurrPaasIDSubscriptionID;
    }

    /**
     * Get <p>目标服务类型 Restful Database Mock</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceType <p>目标服务类型 Restful Database Mock</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set <p>目标服务类型 Restful Database Mock</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceType <p>目标服务类型 Restful Database Mock</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get <p>SQL模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlTemplate <p>SQL模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlTemplate getSqlTemplate() {
        return this.SqlTemplate;
    }

    /**
     * Set <p>SQL模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlTemplate <p>SQL模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlTemplate(SqlTemplate SqlTemplate) {
        this.SqlTemplate = SqlTemplate;
    }

    /**
     * Get <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHostType <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetHostType() {
        return this.TargetHostType;
    }

    /**
     * Set <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHostType <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHostType(Long TargetHostType) {
        this.TargetHostType = TargetHostType;
    }

    /**
     * Get <p>后端服务类型 0 自定义 原始数据:ip/域名或vpc 1 后端服务 服务组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServiceHostType <p>后端服务类型 0 自定义 原始数据:ip/域名或vpc 1 后端服务 服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetServiceHostType() {
        return this.TargetServiceHostType;
    }

    /**
     * Set <p>后端服务类型 0 自定义 原始数据:ip/域名或vpc 1 后端服务 服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServiceHostType <p>后端服务类型 0 自定义 原始数据:ip/域名或vpc 1 后端服务 服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServiceHostType(Long TargetServiceHostType) {
        this.TargetServiceHostType = TargetServiceHostType;
    }

    /**
     * Get <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServerGroupID <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServerGroupID() {
        return this.TargetServerGroupID;
    }

    /**
     * Set <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServerGroupID <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServerGroupID(String TargetServerGroupID) {
        this.TargetServerGroupID = TargetServerGroupID;
    }

    /**
     * Get <p>后端服务组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServerGroup <p>后端服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetServerGroupDTO getTargetServerGroup() {
        return this.TargetServerGroup;
    }

    /**
     * Set <p>后端服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServerGroup <p>后端服务组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServerGroup(TargetServerGroupDTO TargetServerGroup) {
        this.TargetServerGroup = TargetServerGroup;
    }

    /**
     * Get <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomHttpHost <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomHttpHost() {
        return this.CustomHttpHost;
    }

    /**
     * Set <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomHttpHost <p>自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomHttpHost(String CustomHttpHost) {
        this.CustomHttpHost = CustomHttpHost;
    }

    /**
     * Get <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpHostType <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpHostType() {
        return this.HttpHostType;
    }

    /**
     * Set <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpHostType <p>Http 请求host类型 useRequestHost 保持源请求host targetHost 修正为源站host  customHost 自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpHostType(String HttpHostType) {
        this.HttpHostType = HttpHostType;
    }

    /**
     * Get <p>mock响应状态码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MockStatusCode <p>mock响应状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMockStatusCode() {
        return this.MockStatusCode;
    }

    /**
     * Set <p>mock响应状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MockStatusCode <p>mock响应状态码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMockStatusCode(Long MockStatusCode) {
        this.MockStatusCode = MockStatusCode;
    }

    /**
     * Get <p>mock响应body</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MockBody <p>mock响应body</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMockBody() {
        return this.MockBody;
    }

    /**
     * Set <p>mock响应body</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MockBody <p>mock响应body</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMockBody(String MockBody) {
        this.MockBody = MockBody;
    }

    /**
     * Get <p>mock响应头</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MockHeaders <p>mock响应头</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FieldValueDTO [] getMockHeaders() {
        return this.MockHeaders;
    }

    /**
     * Set <p>mock响应头</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MockHeaders <p>mock响应头</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMockHeaders(FieldValueDTO [] MockHeaders) {
        this.MockHeaders = MockHeaders;
    }

    /**
     * Get <p>路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathMatchType <p>路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathMatchType() {
        return this.PathMatchType;
    }

    /**
     * Set <p>路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathMatchType <p>路径匹配类型: prefix 前缀匹配(不送默认); absolute 绝对匹配; regex正则匹配;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathMatchType(String PathMatchType) {
        this.PathMatchType = PathMatchType;
    }

    /**
     * Get <p>自定义匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomMatch <p>自定义匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomMatch getCustomMatch() {
        return this.CustomMatch;
    }

    /**
     * Set <p>自定义匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomMatch <p>自定义匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomMatch(CustomMatch CustomMatch) {
        this.CustomMatch = CustomMatch;
    }

    /**
     * Get <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout <p>请求的超时时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>绑定的mcp server数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return McpServerNum <p>绑定的mcp server数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMcpServerNum() {
        return this.McpServerNum;
    }

    /**
     * Set <p>绑定的mcp server数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param McpServerNum <p>绑定的mcp server数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMcpServerNum(Long McpServerNum) {
        this.McpServerNum = McpServerNum;
    }

    public ServiceVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceVO(ServiceVO source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PaasID != null) {
            this.PaasID = new String(source.PaasID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LabelIDs != null) {
            this.LabelIDs = new String[source.LabelIDs.length];
            for (int i = 0; i < source.LabelIDs.length; i++) {
                this.LabelIDs[i] = new String(source.LabelIDs[i]);
            }
        }
        if (source.CategoryIDs != null) {
            this.CategoryIDs = new String[source.CategoryIDs.length];
            for (int i = 0; i < source.CategoryIDs.length; i++) {
                this.CategoryIDs[i] = new String(source.CategoryIDs[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.SignType != null) {
            this.SignType = new String(source.SignType);
        }
        if (source.LoginTypes != null) {
            this.LoginTypes = new String[source.LoginTypes.length];
            for (int i = 0; i < source.LoginTypes.length; i++) {
                this.LoginTypes[i] = new String(source.LoginTypes[i]);
            }
        }
        if (source.TargetSelect != null) {
            this.TargetSelect = new String(source.TargetSelect);
        }
        if (source.PubPath != null) {
            this.PubPath = new String(source.PubPath);
        }
        if (source.RequestMethod != null) {
            this.RequestMethod = new String(source.RequestMethod);
        }
        if (source.TargetHosts != null) {
            this.TargetHosts = new TargetHostDTO[source.TargetHosts.length];
            for (int i = 0; i < source.TargetHosts.length; i++) {
                this.TargetHosts[i] = new TargetHostDTO(source.TargetHosts[i]);
            }
        }
        if (source.HttpProtocolType != null) {
            this.HttpProtocolType = new String(source.HttpProtocolType);
        }
        if (source.CheckTargetCertsError != null) {
            this.CheckTargetCertsError = new Boolean(source.CheckTargetCertsError);
        }
        if (source.HttpProtocolVersion != null) {
            this.HttpProtocolVersion = new String(source.HttpProtocolVersion);
        }
        if (source.Versions != null) {
            this.Versions = new VersionDTO[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new VersionDTO(source.Versions[i]);
            }
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.RequestParamsValidatorStatus != null) {
            this.RequestParamsValidatorStatus = new Boolean(source.RequestParamsValidatorStatus);
        }
        if (source.RequestParamsValidatorJsonInfoT != null) {
            this.RequestParamsValidatorJsonInfoT = new String(source.RequestParamsValidatorJsonInfoT);
        }
        if (source.ResponseParamsValidatorStatus != null) {
            this.ResponseParamsValidatorStatus = new Boolean(source.ResponseParamsValidatorStatus);
        }
        if (source.ResponseParamsValidatorJsonInfoT != null) {
            this.ResponseParamsValidatorJsonInfoT = new String(source.ResponseParamsValidatorJsonInfoT);
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.HealthCheckStatus != null) {
            this.HealthCheckStatus = new Boolean(source.HealthCheckStatus);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfigDTO(source.HealthCheckConfig);
        }
        if (source.SourceTypeStatus != null) {
            this.SourceTypeStatus = new Boolean(source.SourceTypeStatus);
        }
        if (source.SourceTypeConfig != null) {
            this.SourceTypeConfig = new SourceTypeConfigDTO(source.SourceTypeConfig);
        }
        if (source.TokenLimitStatus != null) {
            this.TokenLimitStatus = new Boolean(source.TokenLimitStatus);
        }
        if (source.TokenLimitConfig != null) {
            this.TokenLimitConfig = new TokenLimitConfigDTO(source.TokenLimitConfig);
        }
        if (source.TmsStatus != null) {
            this.TmsStatus = new Boolean(source.TmsStatus);
        }
        if (source.TmsConfig != null) {
            this.TmsConfig = new TmsConfigDTO(source.TmsConfig);
        }
        if (source.IpWhiteStatus != null) {
            this.IpWhiteStatus = new Boolean(source.IpWhiteStatus);
        }
        if (source.IpWhiteList != null) {
            this.IpWhiteList = new String[source.IpWhiteList.length];
            for (int i = 0; i < source.IpWhiteList.length; i++) {
                this.IpWhiteList[i] = new String(source.IpWhiteList[i]);
            }
        }
        if (source.IpBlackStatus != null) {
            this.IpBlackStatus = new Boolean(source.IpBlackStatus);
        }
        if (source.IpBlackList != null) {
            this.IpBlackList = new String[source.IpBlackList.length];
            for (int i = 0; i < source.IpBlackList.length; i++) {
                this.IpBlackList[i] = new String(source.IpBlackList[i]);
            }
        }
        if (source.PluginConfigs != null) {
            this.PluginConfigs = new PluginConfigDTO[source.PluginConfigs.length];
            for (int i = 0; i < source.PluginConfigs.length; i++) {
                this.PluginConfigs[i] = new PluginConfigDTO(source.PluginConfigs[i]);
            }
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.App != null) {
            this.App = new IDNameVO(source.App);
        }
        if (source.Catalogs != null) {
            this.Catalogs = new IDNameVO[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new IDNameVO(source.Catalogs[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new IDNameVO[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new IDNameVO(source.Labels[i]);
            }
        }
        if (source.Logins != null) {
            this.Logins = new IDNameVO[source.Logins.length];
            for (int i = 0; i < source.Logins.length; i++) {
                this.Logins[i] = new IDNameVO(source.Logins[i]);
            }
        }
        if (source.AuthAppNum != null) {
            this.AuthAppNum = new Long(source.AuthAppNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.OpenMessageLogStatus != null) {
            this.OpenMessageLogStatus = new Boolean(source.OpenMessageLogStatus);
        }
        if (source.CurrPaasIDSubscriptionID != null) {
            this.CurrPaasIDSubscriptionID = new String(source.CurrPaasIDSubscriptionID);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.SqlTemplate != null) {
            this.SqlTemplate = new SqlTemplate(source.SqlTemplate);
        }
        if (source.TargetHostType != null) {
            this.TargetHostType = new Long(source.TargetHostType);
        }
        if (source.TargetServiceHostType != null) {
            this.TargetServiceHostType = new Long(source.TargetServiceHostType);
        }
        if (source.TargetServerGroupID != null) {
            this.TargetServerGroupID = new String(source.TargetServerGroupID);
        }
        if (source.TargetServerGroup != null) {
            this.TargetServerGroup = new TargetServerGroupDTO(source.TargetServerGroup);
        }
        if (source.CustomHttpHost != null) {
            this.CustomHttpHost = new String(source.CustomHttpHost);
        }
        if (source.HttpHostType != null) {
            this.HttpHostType = new String(source.HttpHostType);
        }
        if (source.MockStatusCode != null) {
            this.MockStatusCode = new Long(source.MockStatusCode);
        }
        if (source.MockBody != null) {
            this.MockBody = new String(source.MockBody);
        }
        if (source.MockHeaders != null) {
            this.MockHeaders = new FieldValueDTO[source.MockHeaders.length];
            for (int i = 0; i < source.MockHeaders.length; i++) {
                this.MockHeaders[i] = new FieldValueDTO(source.MockHeaders[i]);
            }
        }
        if (source.PathMatchType != null) {
            this.PathMatchType = new String(source.PathMatchType);
        }
        if (source.CustomMatch != null) {
            this.CustomMatch = new CustomMatch(source.CustomMatch);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.McpServerNum != null) {
            this.McpServerNum = new Long(source.McpServerNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PaasID", this.PaasID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "LabelIDs.", this.LabelIDs);
        this.setParamArraySimple(map, prefix + "CategoryIDs.", this.CategoryIDs);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamArraySimple(map, prefix + "LoginTypes.", this.LoginTypes);
        this.setParamSimple(map, prefix + "TargetSelect", this.TargetSelect);
        this.setParamSimple(map, prefix + "PubPath", this.PubPath);
        this.setParamSimple(map, prefix + "RequestMethod", this.RequestMethod);
        this.setParamArrayObj(map, prefix + "TargetHosts.", this.TargetHosts);
        this.setParamSimple(map, prefix + "HttpProtocolType", this.HttpProtocolType);
        this.setParamSimple(map, prefix + "CheckTargetCertsError", this.CheckTargetCertsError);
        this.setParamSimple(map, prefix + "HttpProtocolVersion", this.HttpProtocolVersion);
        this.setParamArrayObj(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "RequestParamsValidatorStatus", this.RequestParamsValidatorStatus);
        this.setParamSimple(map, prefix + "RequestParamsValidatorJsonInfoT", this.RequestParamsValidatorJsonInfoT);
        this.setParamSimple(map, prefix + "ResponseParamsValidatorStatus", this.ResponseParamsValidatorStatus);
        this.setParamSimple(map, prefix + "ResponseParamsValidatorJsonInfoT", this.ResponseParamsValidatorJsonInfoT);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamSimple(map, prefix + "HealthCheckStatus", this.HealthCheckStatus);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "SourceTypeStatus", this.SourceTypeStatus);
        this.setParamObj(map, prefix + "SourceTypeConfig.", this.SourceTypeConfig);
        this.setParamSimple(map, prefix + "TokenLimitStatus", this.TokenLimitStatus);
        this.setParamObj(map, prefix + "TokenLimitConfig.", this.TokenLimitConfig);
        this.setParamSimple(map, prefix + "TmsStatus", this.TmsStatus);
        this.setParamObj(map, prefix + "TmsConfig.", this.TmsConfig);
        this.setParamSimple(map, prefix + "IpWhiteStatus", this.IpWhiteStatus);
        this.setParamArraySimple(map, prefix + "IpWhiteList.", this.IpWhiteList);
        this.setParamSimple(map, prefix + "IpBlackStatus", this.IpBlackStatus);
        this.setParamArraySimple(map, prefix + "IpBlackList.", this.IpBlackList);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "App.", this.App);
        this.setParamArrayObj(map, prefix + "Catalogs.", this.Catalogs);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Logins.", this.Logins);
        this.setParamSimple(map, prefix + "AuthAppNum", this.AuthAppNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "OpenMessageLogStatus", this.OpenMessageLogStatus);
        this.setParamSimple(map, prefix + "CurrPaasIDSubscriptionID", this.CurrPaasIDSubscriptionID);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamObj(map, prefix + "SqlTemplate.", this.SqlTemplate);
        this.setParamSimple(map, prefix + "TargetHostType", this.TargetHostType);
        this.setParamSimple(map, prefix + "TargetServiceHostType", this.TargetServiceHostType);
        this.setParamSimple(map, prefix + "TargetServerGroupID", this.TargetServerGroupID);
        this.setParamObj(map, prefix + "TargetServerGroup.", this.TargetServerGroup);
        this.setParamSimple(map, prefix + "CustomHttpHost", this.CustomHttpHost);
        this.setParamSimple(map, prefix + "HttpHostType", this.HttpHostType);
        this.setParamSimple(map, prefix + "MockStatusCode", this.MockStatusCode);
        this.setParamSimple(map, prefix + "MockBody", this.MockBody);
        this.setParamArrayObj(map, prefix + "MockHeaders.", this.MockHeaders);
        this.setParamSimple(map, prefix + "PathMatchType", this.PathMatchType);
        this.setParamObj(map, prefix + "CustomMatch.", this.CustomMatch);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "McpServerNum", this.McpServerNum);

    }
}

