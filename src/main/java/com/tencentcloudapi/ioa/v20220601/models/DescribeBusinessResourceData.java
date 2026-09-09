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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBusinessResourceData extends AbstractModel {

    /**
    * <p>业务资源id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * <p>业务资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>资源类型:ip,domain,ip_section，对应ip，域名，ip段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>业务资源地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceAddress")
    @Expose
    private String ServiceAddress;

    /**
    * <p>业务资源端口 all,1-65535</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServicePort")
    @Expose
    private String ServicePort;

    /**
    * <p>业务资源创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>业务资源最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>说明字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>资源模块ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * <p>零信任网关id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartGateIds")
    @Expose
    private Long [] SmartGateIds;

    /**
    * <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private Long Protocol;

    /**
    * <p>业务资源等级(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Levels")
    @Expose
    private Long Levels;

    /**
    * <p>零信任网关名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartGateNames")
    @Expose
    private String SmartGateNames;

    /**
    * <p>网关连通性(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectConn")
    @Expose
    private Long DirectConn;

    /**
    * <p>网关连通性状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectState")
    @Expose
    private Long DetectState;

    /**
    * <p>网关连通性信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectInfo")
    @Expose
    private String DetectInfo;

    /**
    * <p>网关连通性创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * <p>绑定的连接器组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectorGroupId")
    @Expose
    private String ConnectorGroupId;

    /**
    * <p>绑定的连接器组的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectorGroupName")
    @Expose
    private String ConnectorGroupName;

    /**
    * <p>资源连通性可达最后的检测时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReachableTime")
    @Expose
    private String ReachableTime;

    /**
    * <p>资源连通性可达状态,0：未检测，1：未连通，2：已连通</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReachableState")
    @Expose
    private Long ReachableState;

    /**
    * <p>访问类型:0-NGN 1-web(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>web资源-后端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackendScheme")
    @Expose
    private String BackendScheme;

    /**
    * <p>web资源-后端路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackendPath")
    @Expose
    private String BackendPath;

    /**
    * <p>web资源-前端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontScheme")
    @Expose
    private String FrontScheme;

    /**
    * <p>web资源-前端host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontHost")
    @Expose
    private String FrontHost;

    /**
    * <p>web资源-前端host(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontPort")
    @Expose
    private Long FrontPort;

    /**
    * <p>web资源-前端路径 默认&quot;/&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrontPath")
    @Expose
    private String FrontPath;

    /**
    * <p>web资源-是否禁用外网访问：0-可通过外网访问 1-不能通过外网访问(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisableFront")
    @Expose
    private Long DisableFront;

    /**
    * <p>web资源-租户自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomDomain")
    @Expose
    private String CustomDomain;

    /**
    * <p>web资源-自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomHost")
    @Expose
    private String CustomHost;

    /**
    * <p>web资源-Cname状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CnameStatus")
    @Expose
    private Long CnameStatus;

    /**
    * <p>web资源-关联证书ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateId")
    @Expose
    private Long CertificateId;

    /**
    * <p>web资源类型：0-应用 1-API(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebGwResourceType")
    @Expose
    private Long WebGwResourceType;

    /**
    * <p>web资源-如果选择API类型资源，则需要配置密钥(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APISecretId")
    @Expose
    private Long APISecretId;

    /**
    * <p>所属资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * <p>web资源-前端协议是HTTPS类型，需要配置证书</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLCertId")
    @Expose
    private String SSLCertId;

    /**
    * <p>web资源-是否启用依赖地址：0-不启用 1-启用(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDependentAddr")
    @Expose
    private Long EnableDependentAddr;

    /**
    * <p>web资源-依赖地址的后端服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependentAddr")
    @Expose
    private String DependentAddr;

    /**
    * <p>web免鉴权：1-鉴权 2-免鉴权</p>
    */
    @SerializedName("WebGwNoAuth")
    @Expose
    private Long WebGwNoAuth;

    /**
    * <p>通道类型</p><p>枚举值：</p><ul><li>vpc： vpc类型</li><li>native： 专线类型</li></ul><p>默认值：native</p>
    */
    @SerializedName("ConnectorGroupType")
    @Expose
    private String ConnectorGroupType;

    /**
    * <p>域名后缀</p>
    */
    @SerializedName("DomainSuffix")
    @Expose
    private String DomainSuffix;

    /**
    * <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
    */
    @SerializedName("ConnectivityCheckSwitch")
    @Expose
    private Long ConnectivityCheckSwitch;

    /**
    * <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
    */
    @SerializedName("ConnectivityCheckInterval")
    @Expose
    private Long ConnectivityCheckInterval;

    /**
    * <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
    */
    @SerializedName("ConnectivityCheckIntervalUnit")
    @Expose
    private String ConnectivityCheckIntervalUnit;

    /**
    * <p>URL审计开关：0-关闭 1-开启，默认0</p>
    */
    @SerializedName("URLAuditState")
    @Expose
    private Long URLAuditState;

    /**
    * <p>URL审计证书ID列表，多个用分号分隔</p>
    */
    @SerializedName("URLAuditId")
    @Expose
    private String URLAuditId;

    /**
    * <p>URL审计路径，多个用分号分隔</p>
    */
    @SerializedName("URLPath")
    @Expose
    private String URLPath;

    /**
    * <p>检测方式：0-未检测 1-主动 2-流量</p>
    */
    @SerializedName("ReachableType")
    @Expose
    private Long ReachableType;

    /**
    * <p>API密钥名称</p>
    */
    @SerializedName("APISecretName")
    @Expose
    private String APISecretName;

    /**
    * <p>API密钥Key</p>
    */
    @SerializedName("APISecretKey")
    @Expose
    private String APISecretKey;

    /**
    * <p>是否为敏感资源：0-否 1-是</p>
    */
    @SerializedName("EnableSensitiveRes")
    @Expose
    private Long EnableSensitiveRes;

    /**
    * <p>用户接入IP限制开关：0-不启用 1-启用</p>
    */
    @SerializedName("EnableIPPolicy")
    @Expose
    private Long EnableIPPolicy;

    /**
    * <p>IP分组属性：0-白名单 1-黑名单</p>
    */
    @SerializedName("IPPolicyAttr")
    @Expose
    private Long IPPolicyAttr;

    /**
    * <p>IP分组ID列表</p>
    */
    @SerializedName("IPPolicyIds")
    @Expose
    private Long [] IPPolicyIds;

    /**
    * <p>IP分组名称（分号分隔）</p>
    */
    @SerializedName("IPPolicyNames")
    @Expose
    private String IPPolicyNames;

    /**
    * <p>访问浏览器规则开关：0-不启用 1-启用</p>
    */
    @SerializedName("EnableUserAgent")
    @Expose
    private Long EnableUserAgent;

    /**
    * <p>浏览器规则属性：0-白名单 1-黑名单</p>
    */
    @SerializedName("UserAgentAttr")
    @Expose
    private Long UserAgentAttr;

    /**
    * <p>浏览器规则ID列表</p>
    */
    @SerializedName("UserAgentIds")
    @Expose
    private String [] UserAgentIds;

    /**
    * <p>浏览器规则名称（分号分隔）</p>
    */
    @SerializedName("UserAgentNames")
    @Expose
    private String UserAgentNames;

    /**
     * Get <p>业务资源id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId <p>业务资源id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>业务资源id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId <p>业务资源id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>业务资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>业务资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>业务资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>业务资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>资源类型:ip,domain,ip_section，对应ip，域名，ip段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType <p>资源类型:ip,domain,ip_section，对应ip，域名，ip段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>资源类型:ip,domain,ip_section，对应ip，域名，ip段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType <p>资源类型:ip,domain,ip_section，对应ip，域名，ip段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>业务资源地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceAddress <p>业务资源地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceAddress() {
        return this.ServiceAddress;
    }

    /**
     * Set <p>业务资源地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceAddress <p>业务资源地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceAddress(String ServiceAddress) {
        this.ServiceAddress = ServiceAddress;
    }

    /**
     * Get <p>业务资源端口 all,1-65535</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServicePort <p>业务资源端口 all,1-65535</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServicePort() {
        return this.ServicePort;
    }

    /**
     * Set <p>业务资源端口 all,1-65535</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServicePort <p>业务资源端口 all,1-65535</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServicePort(String ServicePort) {
        this.ServicePort = ServicePort;
    }

    /**
     * Get <p>业务资源创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>业务资源创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>业务资源创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>业务资源创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>业务资源最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>业务资源最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>业务资源最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>业务资源最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>说明字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>说明字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>说明字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>说明字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>资源模块ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaId <p>资源模块ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set <p>资源模块ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaId <p>资源模块ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get <p>零信任网关id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartGateIds <p>零信任网关id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSmartGateIds() {
        return this.SmartGateIds;
    }

    /**
     * Set <p>零信任网关id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartGateIds <p>零信任网关id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartGateIds(Long [] SmartGateIds) {
        this.SmartGateIds = SmartGateIds;
    }

    /**
     * Get <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol <p>业务资源协议类型,3：所有,2：UDP，1：TCP(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(Long Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>业务资源等级(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Levels <p>业务资源等级(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevels() {
        return this.Levels;
    }

    /**
     * Set <p>业务资源等级(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Levels <p>业务资源等级(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevels(Long Levels) {
        this.Levels = Levels;
    }

    /**
     * Get <p>零信任网关名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartGateNames <p>零信任网关名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSmartGateNames() {
        return this.SmartGateNames;
    }

    /**
     * Set <p>零信任网关名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartGateNames <p>零信任网关名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartGateNames(String SmartGateNames) {
        this.SmartGateNames = SmartGateNames;
    }

    /**
     * Get <p>网关连通性(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectConn <p>网关连通性(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDirectConn() {
        return this.DirectConn;
    }

    /**
     * Set <p>网关连通性(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectConn <p>网关连通性(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectConn(Long DirectConn) {
        this.DirectConn = DirectConn;
    }

    /**
     * Get <p>网关连通性状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectState <p>网关连通性状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetectState() {
        return this.DetectState;
    }

    /**
     * Set <p>网关连通性状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectState <p>网关连通性状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectState(Long DetectState) {
        this.DetectState = DetectState;
    }

    /**
     * Get <p>网关连通性信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectInfo <p>网关连通性信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetectInfo() {
        return this.DetectInfo;
    }

    /**
     * Set <p>网关连通性信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectInfo <p>网关连通性信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectInfo(String DetectInfo) {
        this.DetectInfo = DetectInfo;
    }

    /**
     * Get <p>网关连通性创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectTime <p>网关连通性创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set <p>网关连通性创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectTime <p>网关连通性创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get <p>绑定的连接器组Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectorGroupId <p>绑定的连接器组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectorGroupId() {
        return this.ConnectorGroupId;
    }

    /**
     * Set <p>绑定的连接器组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectorGroupId <p>绑定的连接器组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectorGroupId(String ConnectorGroupId) {
        this.ConnectorGroupId = ConnectorGroupId;
    }

    /**
     * Get <p>绑定的连接器组的名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectorGroupName <p>绑定的连接器组的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectorGroupName() {
        return this.ConnectorGroupName;
    }

    /**
     * Set <p>绑定的连接器组的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectorGroupName <p>绑定的连接器组的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectorGroupName(String ConnectorGroupName) {
        this.ConnectorGroupName = ConnectorGroupName;
    }

    /**
     * Get <p>资源连通性可达最后的检测时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReachableTime <p>资源连通性可达最后的检测时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReachableTime() {
        return this.ReachableTime;
    }

    /**
     * Set <p>资源连通性可达最后的检测时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReachableTime <p>资源连通性可达最后的检测时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReachableTime(String ReachableTime) {
        this.ReachableTime = ReachableTime;
    }

    /**
     * Get <p>资源连通性可达状态,0：未检测，1：未连通，2：已连通</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReachableState <p>资源连通性可达状态,0：未检测，1：未连通，2：已连通</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReachableState() {
        return this.ReachableState;
    }

    /**
     * Set <p>资源连通性可达状态,0：未检测，1：未连通，2：已连通</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReachableState <p>资源连通性可达状态,0：未检测，1：未连通，2：已连通</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReachableState(Long ReachableState) {
        this.ReachableState = ReachableState;
    }

    /**
     * Get <p>访问类型:0-NGN 1-web(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType <p>访问类型:0-NGN 1-web(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>访问类型:0-NGN 1-web(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType <p>访问类型:0-NGN 1-web(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>web资源-后端协议</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackendScheme <p>web资源-后端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackendScheme() {
        return this.BackendScheme;
    }

    /**
     * Set <p>web资源-后端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackendScheme <p>web资源-后端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackendScheme(String BackendScheme) {
        this.BackendScheme = BackendScheme;
    }

    /**
     * Get <p>web资源-后端路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackendPath <p>web资源-后端路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackendPath() {
        return this.BackendPath;
    }

    /**
     * Set <p>web资源-后端路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackendPath <p>web资源-后端路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackendPath(String BackendPath) {
        this.BackendPath = BackendPath;
    }

    /**
     * Get <p>web资源-前端协议</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontScheme <p>web资源-前端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrontScheme() {
        return this.FrontScheme;
    }

    /**
     * Set <p>web资源-前端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontScheme <p>web资源-前端协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontScheme(String FrontScheme) {
        this.FrontScheme = FrontScheme;
    }

    /**
     * Get <p>web资源-前端host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontHost <p>web资源-前端host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrontHost() {
        return this.FrontHost;
    }

    /**
     * Set <p>web资源-前端host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontHost <p>web资源-前端host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontHost(String FrontHost) {
        this.FrontHost = FrontHost;
    }

    /**
     * Get <p>web资源-前端host(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontPort <p>web资源-前端host(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrontPort() {
        return this.FrontPort;
    }

    /**
     * Set <p>web资源-前端host(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontPort <p>web资源-前端host(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontPort(Long FrontPort) {
        this.FrontPort = FrontPort;
    }

    /**
     * Get <p>web资源-前端路径 默认&quot;/&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrontPath <p>web资源-前端路径 默认&quot;/&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrontPath() {
        return this.FrontPath;
    }

    /**
     * Set <p>web资源-前端路径 默认&quot;/&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrontPath <p>web资源-前端路径 默认&quot;/&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrontPath(String FrontPath) {
        this.FrontPath = FrontPath;
    }

    /**
     * Get <p>web资源-是否禁用外网访问：0-可通过外网访问 1-不能通过外网访问(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisableFront <p>web资源-是否禁用外网访问：0-可通过外网访问 1-不能通过外网访问(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisableFront() {
        return this.DisableFront;
    }

    /**
     * Set <p>web资源-是否禁用外网访问：0-可通过外网访问 1-不能通过外网访问(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisableFront <p>web资源-是否禁用外网访问：0-可通过外网访问 1-不能通过外网访问(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisableFront(Long DisableFront) {
        this.DisableFront = DisableFront;
    }

    /**
     * Get <p>web资源-租户自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomDomain <p>web资源-租户自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomDomain() {
        return this.CustomDomain;
    }

    /**
     * Set <p>web资源-租户自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomDomain <p>web资源-租户自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomDomain(String CustomDomain) {
        this.CustomDomain = CustomDomain;
    }

    /**
     * Get <p>web资源-自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomHost <p>web资源-自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomHost() {
        return this.CustomHost;
    }

    /**
     * Set <p>web资源-自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomHost <p>web资源-自定义host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomHost(String CustomHost) {
        this.CustomHost = CustomHost;
    }

    /**
     * Get <p>web资源-Cname状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CnameStatus <p>web资源-Cname状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set <p>web资源-Cname状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CnameStatus <p>web资源-Cname状态(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnameStatus(Long CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get <p>web资源-关联证书ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateId <p>web资源-关联证书ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>web资源-关联证书ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateId <p>web资源-关联证书ID(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateId(Long CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>web资源类型：0-应用 1-API(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebGwResourceType <p>web资源类型：0-应用 1-API(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebGwResourceType() {
        return this.WebGwResourceType;
    }

    /**
     * Set <p>web资源类型：0-应用 1-API(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebGwResourceType <p>web资源类型：0-应用 1-API(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebGwResourceType(Long WebGwResourceType) {
        this.WebGwResourceType = WebGwResourceType;
    }

    /**
     * Get <p>web资源-如果选择API类型资源，则需要配置密钥(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APISecretId <p>web资源-如果选择API类型资源，则需要配置密钥(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAPISecretId() {
        return this.APISecretId;
    }

    /**
     * Set <p>web资源-如果选择API类型资源，则需要配置密钥(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param APISecretId <p>web资源-如果选择API类型资源，则需要配置密钥(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPISecretId(Long APISecretId) {
        this.APISecretId = APISecretId;
    }

    /**
     * Get <p>所属资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaName <p>所属资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set <p>所属资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaName <p>所属资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get <p>web资源-前端协议是HTTPS类型，需要配置证书</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLCertId <p>web资源-前端协议是HTTPS类型，需要配置证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSLCertId() {
        return this.SSLCertId;
    }

    /**
     * Set <p>web资源-前端协议是HTTPS类型，需要配置证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLCertId <p>web资源-前端协议是HTTPS类型，需要配置证书</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLCertId(String SSLCertId) {
        this.SSLCertId = SSLCertId;
    }

    /**
     * Get <p>web资源-是否启用依赖地址：0-不启用 1-启用(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDependentAddr <p>web资源-是否启用依赖地址：0-不启用 1-启用(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableDependentAddr() {
        return this.EnableDependentAddr;
    }

    /**
     * Set <p>web资源-是否启用依赖地址：0-不启用 1-启用(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDependentAddr <p>web资源-是否启用依赖地址：0-不启用 1-启用(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDependentAddr(Long EnableDependentAddr) {
        this.EnableDependentAddr = EnableDependentAddr;
    }

    /**
     * Get <p>web资源-依赖地址的后端服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependentAddr <p>web资源-依赖地址的后端服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependentAddr() {
        return this.DependentAddr;
    }

    /**
     * Set <p>web资源-依赖地址的后端服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependentAddr <p>web资源-依赖地址的后端服务器地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependentAddr(String DependentAddr) {
        this.DependentAddr = DependentAddr;
    }

    /**
     * Get <p>web免鉴权：1-鉴权 2-免鉴权</p> 
     * @return WebGwNoAuth <p>web免鉴权：1-鉴权 2-免鉴权</p>
     */
    public Long getWebGwNoAuth() {
        return this.WebGwNoAuth;
    }

    /**
     * Set <p>web免鉴权：1-鉴权 2-免鉴权</p>
     * @param WebGwNoAuth <p>web免鉴权：1-鉴权 2-免鉴权</p>
     */
    public void setWebGwNoAuth(Long WebGwNoAuth) {
        this.WebGwNoAuth = WebGwNoAuth;
    }

    /**
     * Get <p>通道类型</p><p>枚举值：</p><ul><li>vpc： vpc类型</li><li>native： 专线类型</li></ul><p>默认值：native</p> 
     * @return ConnectorGroupType <p>通道类型</p><p>枚举值：</p><ul><li>vpc： vpc类型</li><li>native： 专线类型</li></ul><p>默认值：native</p>
     */
    public String getConnectorGroupType() {
        return this.ConnectorGroupType;
    }

    /**
     * Set <p>通道类型</p><p>枚举值：</p><ul><li>vpc： vpc类型</li><li>native： 专线类型</li></ul><p>默认值：native</p>
     * @param ConnectorGroupType <p>通道类型</p><p>枚举值：</p><ul><li>vpc： vpc类型</li><li>native： 专线类型</li></ul><p>默认值：native</p>
     */
    public void setConnectorGroupType(String ConnectorGroupType) {
        this.ConnectorGroupType = ConnectorGroupType;
    }

    /**
     * Get <p>域名后缀</p> 
     * @return DomainSuffix <p>域名后缀</p>
     */
    public String getDomainSuffix() {
        return this.DomainSuffix;
    }

    /**
     * Set <p>域名后缀</p>
     * @param DomainSuffix <p>域名后缀</p>
     */
    public void setDomainSuffix(String DomainSuffix) {
        this.DomainSuffix = DomainSuffix;
    }

    /**
     * Get <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p> 
     * @return ConnectivityCheckSwitch <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
     */
    public Long getConnectivityCheckSwitch() {
        return this.ConnectivityCheckSwitch;
    }

    /**
     * Set <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
     * @param ConnectivityCheckSwitch <p>连通性检查开关，0-关闭 1-开启，默认1(只支持32位)</p>
     */
    public void setConnectivityCheckSwitch(Long ConnectivityCheckSwitch) {
        this.ConnectivityCheckSwitch = ConnectivityCheckSwitch;
    }

    /**
     * Get <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p> 
     * @return ConnectivityCheckInterval <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
     */
    public Long getConnectivityCheckInterval() {
        return this.ConnectivityCheckInterval;
    }

    /**
     * Set <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
     * @param ConnectivityCheckInterval <p>连通性检查测试间隔数值，最小为1，默认1(只支持32位)</p>
     */
    public void setConnectivityCheckInterval(Long ConnectivityCheckInterval) {
        this.ConnectivityCheckInterval = ConnectivityCheckInterval;
    }

    /**
     * Get <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p> 
     * @return ConnectivityCheckIntervalUnit <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
     */
    public String getConnectivityCheckIntervalUnit() {
        return this.ConnectivityCheckIntervalUnit;
    }

    /**
     * Set <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
     * @param ConnectivityCheckIntervalUnit <p>连通性检查测试间隔单位 minutes/hours/days，默认hours</p>
     */
    public void setConnectivityCheckIntervalUnit(String ConnectivityCheckIntervalUnit) {
        this.ConnectivityCheckIntervalUnit = ConnectivityCheckIntervalUnit;
    }

    /**
     * Get <p>URL审计开关：0-关闭 1-开启，默认0</p> 
     * @return URLAuditState <p>URL审计开关：0-关闭 1-开启，默认0</p>
     */
    public Long getURLAuditState() {
        return this.URLAuditState;
    }

    /**
     * Set <p>URL审计开关：0-关闭 1-开启，默认0</p>
     * @param URLAuditState <p>URL审计开关：0-关闭 1-开启，默认0</p>
     */
    public void setURLAuditState(Long URLAuditState) {
        this.URLAuditState = URLAuditState;
    }

    /**
     * Get <p>URL审计证书ID列表，多个用分号分隔</p> 
     * @return URLAuditId <p>URL审计证书ID列表，多个用分号分隔</p>
     */
    public String getURLAuditId() {
        return this.URLAuditId;
    }

    /**
     * Set <p>URL审计证书ID列表，多个用分号分隔</p>
     * @param URLAuditId <p>URL审计证书ID列表，多个用分号分隔</p>
     */
    public void setURLAuditId(String URLAuditId) {
        this.URLAuditId = URLAuditId;
    }

    /**
     * Get <p>URL审计路径，多个用分号分隔</p> 
     * @return URLPath <p>URL审计路径，多个用分号分隔</p>
     */
    public String getURLPath() {
        return this.URLPath;
    }

    /**
     * Set <p>URL审计路径，多个用分号分隔</p>
     * @param URLPath <p>URL审计路径，多个用分号分隔</p>
     */
    public void setURLPath(String URLPath) {
        this.URLPath = URLPath;
    }

    /**
     * Get <p>检测方式：0-未检测 1-主动 2-流量</p> 
     * @return ReachableType <p>检测方式：0-未检测 1-主动 2-流量</p>
     */
    public Long getReachableType() {
        return this.ReachableType;
    }

    /**
     * Set <p>检测方式：0-未检测 1-主动 2-流量</p>
     * @param ReachableType <p>检测方式：0-未检测 1-主动 2-流量</p>
     */
    public void setReachableType(Long ReachableType) {
        this.ReachableType = ReachableType;
    }

    /**
     * Get <p>API密钥名称</p> 
     * @return APISecretName <p>API密钥名称</p>
     */
    public String getAPISecretName() {
        return this.APISecretName;
    }

    /**
     * Set <p>API密钥名称</p>
     * @param APISecretName <p>API密钥名称</p>
     */
    public void setAPISecretName(String APISecretName) {
        this.APISecretName = APISecretName;
    }

    /**
     * Get <p>API密钥Key</p> 
     * @return APISecretKey <p>API密钥Key</p>
     */
    public String getAPISecretKey() {
        return this.APISecretKey;
    }

    /**
     * Set <p>API密钥Key</p>
     * @param APISecretKey <p>API密钥Key</p>
     */
    public void setAPISecretKey(String APISecretKey) {
        this.APISecretKey = APISecretKey;
    }

    /**
     * Get <p>是否为敏感资源：0-否 1-是</p> 
     * @return EnableSensitiveRes <p>是否为敏感资源：0-否 1-是</p>
     */
    public Long getEnableSensitiveRes() {
        return this.EnableSensitiveRes;
    }

    /**
     * Set <p>是否为敏感资源：0-否 1-是</p>
     * @param EnableSensitiveRes <p>是否为敏感资源：0-否 1-是</p>
     */
    public void setEnableSensitiveRes(Long EnableSensitiveRes) {
        this.EnableSensitiveRes = EnableSensitiveRes;
    }

    /**
     * Get <p>用户接入IP限制开关：0-不启用 1-启用</p> 
     * @return EnableIPPolicy <p>用户接入IP限制开关：0-不启用 1-启用</p>
     */
    public Long getEnableIPPolicy() {
        return this.EnableIPPolicy;
    }

    /**
     * Set <p>用户接入IP限制开关：0-不启用 1-启用</p>
     * @param EnableIPPolicy <p>用户接入IP限制开关：0-不启用 1-启用</p>
     */
    public void setEnableIPPolicy(Long EnableIPPolicy) {
        this.EnableIPPolicy = EnableIPPolicy;
    }

    /**
     * Get <p>IP分组属性：0-白名单 1-黑名单</p> 
     * @return IPPolicyAttr <p>IP分组属性：0-白名单 1-黑名单</p>
     */
    public Long getIPPolicyAttr() {
        return this.IPPolicyAttr;
    }

    /**
     * Set <p>IP分组属性：0-白名单 1-黑名单</p>
     * @param IPPolicyAttr <p>IP分组属性：0-白名单 1-黑名单</p>
     */
    public void setIPPolicyAttr(Long IPPolicyAttr) {
        this.IPPolicyAttr = IPPolicyAttr;
    }

    /**
     * Get <p>IP分组ID列表</p> 
     * @return IPPolicyIds <p>IP分组ID列表</p>
     */
    public Long [] getIPPolicyIds() {
        return this.IPPolicyIds;
    }

    /**
     * Set <p>IP分组ID列表</p>
     * @param IPPolicyIds <p>IP分组ID列表</p>
     */
    public void setIPPolicyIds(Long [] IPPolicyIds) {
        this.IPPolicyIds = IPPolicyIds;
    }

    /**
     * Get <p>IP分组名称（分号分隔）</p> 
     * @return IPPolicyNames <p>IP分组名称（分号分隔）</p>
     */
    public String getIPPolicyNames() {
        return this.IPPolicyNames;
    }

    /**
     * Set <p>IP分组名称（分号分隔）</p>
     * @param IPPolicyNames <p>IP分组名称（分号分隔）</p>
     */
    public void setIPPolicyNames(String IPPolicyNames) {
        this.IPPolicyNames = IPPolicyNames;
    }

    /**
     * Get <p>访问浏览器规则开关：0-不启用 1-启用</p> 
     * @return EnableUserAgent <p>访问浏览器规则开关：0-不启用 1-启用</p>
     */
    public Long getEnableUserAgent() {
        return this.EnableUserAgent;
    }

    /**
     * Set <p>访问浏览器规则开关：0-不启用 1-启用</p>
     * @param EnableUserAgent <p>访问浏览器规则开关：0-不启用 1-启用</p>
     */
    public void setEnableUserAgent(Long EnableUserAgent) {
        this.EnableUserAgent = EnableUserAgent;
    }

    /**
     * Get <p>浏览器规则属性：0-白名单 1-黑名单</p> 
     * @return UserAgentAttr <p>浏览器规则属性：0-白名单 1-黑名单</p>
     */
    public Long getUserAgentAttr() {
        return this.UserAgentAttr;
    }

    /**
     * Set <p>浏览器规则属性：0-白名单 1-黑名单</p>
     * @param UserAgentAttr <p>浏览器规则属性：0-白名单 1-黑名单</p>
     */
    public void setUserAgentAttr(Long UserAgentAttr) {
        this.UserAgentAttr = UserAgentAttr;
    }

    /**
     * Get <p>浏览器规则ID列表</p> 
     * @return UserAgentIds <p>浏览器规则ID列表</p>
     */
    public String [] getUserAgentIds() {
        return this.UserAgentIds;
    }

    /**
     * Set <p>浏览器规则ID列表</p>
     * @param UserAgentIds <p>浏览器规则ID列表</p>
     */
    public void setUserAgentIds(String [] UserAgentIds) {
        this.UserAgentIds = UserAgentIds;
    }

    /**
     * Get <p>浏览器规则名称（分号分隔）</p> 
     * @return UserAgentNames <p>浏览器规则名称（分号分隔）</p>
     */
    public String getUserAgentNames() {
        return this.UserAgentNames;
    }

    /**
     * Set <p>浏览器规则名称（分号分隔）</p>
     * @param UserAgentNames <p>浏览器规则名称（分号分隔）</p>
     */
    public void setUserAgentNames(String UserAgentNames) {
        this.UserAgentNames = UserAgentNames;
    }

    public DescribeBusinessResourceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBusinessResourceData(DescribeBusinessResourceData source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceAddress != null) {
            this.ServiceAddress = new String(source.ServiceAddress);
        }
        if (source.ServicePort != null) {
            this.ServicePort = new String(source.ServicePort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.SmartGateIds != null) {
            this.SmartGateIds = new Long[source.SmartGateIds.length];
            for (int i = 0; i < source.SmartGateIds.length; i++) {
                this.SmartGateIds[i] = new Long(source.SmartGateIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new Long(source.Protocol);
        }
        if (source.Levels != null) {
            this.Levels = new Long(source.Levels);
        }
        if (source.SmartGateNames != null) {
            this.SmartGateNames = new String(source.SmartGateNames);
        }
        if (source.DirectConn != null) {
            this.DirectConn = new Long(source.DirectConn);
        }
        if (source.DetectState != null) {
            this.DetectState = new Long(source.DetectState);
        }
        if (source.DetectInfo != null) {
            this.DetectInfo = new String(source.DetectInfo);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.ConnectorGroupId != null) {
            this.ConnectorGroupId = new String(source.ConnectorGroupId);
        }
        if (source.ConnectorGroupName != null) {
            this.ConnectorGroupName = new String(source.ConnectorGroupName);
        }
        if (source.ReachableTime != null) {
            this.ReachableTime = new String(source.ReachableTime);
        }
        if (source.ReachableState != null) {
            this.ReachableState = new Long(source.ReachableState);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.BackendScheme != null) {
            this.BackendScheme = new String(source.BackendScheme);
        }
        if (source.BackendPath != null) {
            this.BackendPath = new String(source.BackendPath);
        }
        if (source.FrontScheme != null) {
            this.FrontScheme = new String(source.FrontScheme);
        }
        if (source.FrontHost != null) {
            this.FrontHost = new String(source.FrontHost);
        }
        if (source.FrontPort != null) {
            this.FrontPort = new Long(source.FrontPort);
        }
        if (source.FrontPath != null) {
            this.FrontPath = new String(source.FrontPath);
        }
        if (source.DisableFront != null) {
            this.DisableFront = new Long(source.DisableFront);
        }
        if (source.CustomDomain != null) {
            this.CustomDomain = new String(source.CustomDomain);
        }
        if (source.CustomHost != null) {
            this.CustomHost = new String(source.CustomHost);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new Long(source.CnameStatus);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new Long(source.CertificateId);
        }
        if (source.WebGwResourceType != null) {
            this.WebGwResourceType = new Long(source.WebGwResourceType);
        }
        if (source.APISecretId != null) {
            this.APISecretId = new Long(source.APISecretId);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
        if (source.SSLCertId != null) {
            this.SSLCertId = new String(source.SSLCertId);
        }
        if (source.EnableDependentAddr != null) {
            this.EnableDependentAddr = new Long(source.EnableDependentAddr);
        }
        if (source.DependentAddr != null) {
            this.DependentAddr = new String(source.DependentAddr);
        }
        if (source.WebGwNoAuth != null) {
            this.WebGwNoAuth = new Long(source.WebGwNoAuth);
        }
        if (source.ConnectorGroupType != null) {
            this.ConnectorGroupType = new String(source.ConnectorGroupType);
        }
        if (source.DomainSuffix != null) {
            this.DomainSuffix = new String(source.DomainSuffix);
        }
        if (source.ConnectivityCheckSwitch != null) {
            this.ConnectivityCheckSwitch = new Long(source.ConnectivityCheckSwitch);
        }
        if (source.ConnectivityCheckInterval != null) {
            this.ConnectivityCheckInterval = new Long(source.ConnectivityCheckInterval);
        }
        if (source.ConnectivityCheckIntervalUnit != null) {
            this.ConnectivityCheckIntervalUnit = new String(source.ConnectivityCheckIntervalUnit);
        }
        if (source.URLAuditState != null) {
            this.URLAuditState = new Long(source.URLAuditState);
        }
        if (source.URLAuditId != null) {
            this.URLAuditId = new String(source.URLAuditId);
        }
        if (source.URLPath != null) {
            this.URLPath = new String(source.URLPath);
        }
        if (source.ReachableType != null) {
            this.ReachableType = new Long(source.ReachableType);
        }
        if (source.APISecretName != null) {
            this.APISecretName = new String(source.APISecretName);
        }
        if (source.APISecretKey != null) {
            this.APISecretKey = new String(source.APISecretKey);
        }
        if (source.EnableSensitiveRes != null) {
            this.EnableSensitiveRes = new Long(source.EnableSensitiveRes);
        }
        if (source.EnableIPPolicy != null) {
            this.EnableIPPolicy = new Long(source.EnableIPPolicy);
        }
        if (source.IPPolicyAttr != null) {
            this.IPPolicyAttr = new Long(source.IPPolicyAttr);
        }
        if (source.IPPolicyIds != null) {
            this.IPPolicyIds = new Long[source.IPPolicyIds.length];
            for (int i = 0; i < source.IPPolicyIds.length; i++) {
                this.IPPolicyIds[i] = new Long(source.IPPolicyIds[i]);
            }
        }
        if (source.IPPolicyNames != null) {
            this.IPPolicyNames = new String(source.IPPolicyNames);
        }
        if (source.EnableUserAgent != null) {
            this.EnableUserAgent = new Long(source.EnableUserAgent);
        }
        if (source.UserAgentAttr != null) {
            this.UserAgentAttr = new Long(source.UserAgentAttr);
        }
        if (source.UserAgentIds != null) {
            this.UserAgentIds = new String[source.UserAgentIds.length];
            for (int i = 0; i < source.UserAgentIds.length; i++) {
                this.UserAgentIds[i] = new String(source.UserAgentIds[i]);
            }
        }
        if (source.UserAgentNames != null) {
            this.UserAgentNames = new String(source.UserAgentNames);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceAddress", this.ServiceAddress);
        this.setParamSimple(map, prefix + "ServicePort", this.ServicePort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamArraySimple(map, prefix + "SmartGateIds.", this.SmartGateIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Levels", this.Levels);
        this.setParamSimple(map, prefix + "SmartGateNames", this.SmartGateNames);
        this.setParamSimple(map, prefix + "DirectConn", this.DirectConn);
        this.setParamSimple(map, prefix + "DetectState", this.DetectState);
        this.setParamSimple(map, prefix + "DetectInfo", this.DetectInfo);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "ConnectorGroupId", this.ConnectorGroupId);
        this.setParamSimple(map, prefix + "ConnectorGroupName", this.ConnectorGroupName);
        this.setParamSimple(map, prefix + "ReachableTime", this.ReachableTime);
        this.setParamSimple(map, prefix + "ReachableState", this.ReachableState);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "BackendScheme", this.BackendScheme);
        this.setParamSimple(map, prefix + "BackendPath", this.BackendPath);
        this.setParamSimple(map, prefix + "FrontScheme", this.FrontScheme);
        this.setParamSimple(map, prefix + "FrontHost", this.FrontHost);
        this.setParamSimple(map, prefix + "FrontPort", this.FrontPort);
        this.setParamSimple(map, prefix + "FrontPath", this.FrontPath);
        this.setParamSimple(map, prefix + "DisableFront", this.DisableFront);
        this.setParamSimple(map, prefix + "CustomDomain", this.CustomDomain);
        this.setParamSimple(map, prefix + "CustomHost", this.CustomHost);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "WebGwResourceType", this.WebGwResourceType);
        this.setParamSimple(map, prefix + "APISecretId", this.APISecretId);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "SSLCertId", this.SSLCertId);
        this.setParamSimple(map, prefix + "EnableDependentAddr", this.EnableDependentAddr);
        this.setParamSimple(map, prefix + "DependentAddr", this.DependentAddr);
        this.setParamSimple(map, prefix + "WebGwNoAuth", this.WebGwNoAuth);
        this.setParamSimple(map, prefix + "ConnectorGroupType", this.ConnectorGroupType);
        this.setParamSimple(map, prefix + "DomainSuffix", this.DomainSuffix);
        this.setParamSimple(map, prefix + "ConnectivityCheckSwitch", this.ConnectivityCheckSwitch);
        this.setParamSimple(map, prefix + "ConnectivityCheckInterval", this.ConnectivityCheckInterval);
        this.setParamSimple(map, prefix + "ConnectivityCheckIntervalUnit", this.ConnectivityCheckIntervalUnit);
        this.setParamSimple(map, prefix + "URLAuditState", this.URLAuditState);
        this.setParamSimple(map, prefix + "URLAuditId", this.URLAuditId);
        this.setParamSimple(map, prefix + "URLPath", this.URLPath);
        this.setParamSimple(map, prefix + "ReachableType", this.ReachableType);
        this.setParamSimple(map, prefix + "APISecretName", this.APISecretName);
        this.setParamSimple(map, prefix + "APISecretKey", this.APISecretKey);
        this.setParamSimple(map, prefix + "EnableSensitiveRes", this.EnableSensitiveRes);
        this.setParamSimple(map, prefix + "EnableIPPolicy", this.EnableIPPolicy);
        this.setParamSimple(map, prefix + "IPPolicyAttr", this.IPPolicyAttr);
        this.setParamArraySimple(map, prefix + "IPPolicyIds.", this.IPPolicyIds);
        this.setParamSimple(map, prefix + "IPPolicyNames", this.IPPolicyNames);
        this.setParamSimple(map, prefix + "EnableUserAgent", this.EnableUserAgent);
        this.setParamSimple(map, prefix + "UserAgentAttr", this.UserAgentAttr);
        this.setParamArraySimple(map, prefix + "UserAgentIds.", this.UserAgentIds);
        this.setParamSimple(map, prefix + "UserAgentNames", this.UserAgentNames);

    }
}

