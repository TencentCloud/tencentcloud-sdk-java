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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetsInfo extends AbstractModel {

    /**
    * <p>创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private Long AddTime;

    /**
    * <p>资产 ID</p>
    */
    @SerializedName("Aid")
    @Expose
    private Long Aid;

    /**
    * <p>数据资产 IP</p>
    */
    @SerializedName("AssetsIp")
    @Expose
    private String AssetsIp;

    /**
    * <p>数据资产名称</p>
    */
    @SerializedName("AssetsName")
    @Expose
    private String AssetsName;

    /**
    * <p>数据资产端口</p>
    */
    @SerializedName("AssetsPort")
    @Expose
    private Long AssetsPort;

    /**
    * <p>数据资产类型</p>
    */
    @SerializedName("AssetsType")
    @Expose
    private String AssetsType;

    /**
    * <p>资产版本</p>
    */
    @SerializedName("AssetsVersion")
    @Expose
    private String AssetsVersion;

    /**
    * <p>是否动态</p>
    */
    @SerializedName("AssetsAddType")
    @Expose
    private Long AssetsAddType;

    /**
    * <p>是否删除</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>最后一次修改时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>资产的vpc</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>地域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>审计权限</p>
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>用来区分自建资产是已通过cvm还是添加ip的方式</p>
    */
    @SerializedName("AddType")
    @Expose
    private Long AddType;

    /**
    * <p>子网Id</p>
    */
    @SerializedName("AssetSubnetId")
    @Expose
    private String AssetSubnetId;

    /**
    * <p>是否已上传数据库私钥（0 否，1 是）</p>
    */
    @SerializedName("UploadPem")
    @Expose
    private Long UploadPem;

    /**
    * <p>资产状态栏 0:正常 1:已删除（目前仅对tencentDB有效）</p>
    */
    @SerializedName("AliveStatus")
    @Expose
    private Long AliveStatus;

    /**
    * <p>开启agent(0:关闭;1:开启)</p>
    */
    @SerializedName("AgentOn")
    @Expose
    private Long AgentOn;

    /**
    * <p>开启agent(0:关闭;1:开启)</p>
    */
    @SerializedName("CasbOn")
    @Expose
    private Long CasbOn;

    /**
    * <p>只读组/集群ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>PROXY_OFF: 未开启Casb代理;PROXY_ERROR:Casb代理接口返回异常;PROXY_BOUND:已绑定;PROXY_UNBOUND:未绑定;UNPAID:未购买;UNSUPPORTED:类型不支持;METADATA_NOT_FOUND:元数据不存在;QUOTA_EXCEEDED:Casb额度不足</p>
    */
    @SerializedName("Available")
    @Expose
    private String Available;

    /**
    * <p>cdbOn</p>
    */
    @SerializedName("CdbOn")
    @Expose
    private Long CdbOn;

    /**
    * <p>平台位数 32位 64位</p>
    */
    @SerializedName("DbPlatform")
    @Expose
    private String DbPlatform;

    /**
    * <p>编码</p>
    */
    @SerializedName("DbCharset")
    @Expose
    private String DbCharset;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("OsPolicy")
    @Expose
    private String OsPolicy;

    /**
    * <p>是否开启双向审计</p>
    */
    @SerializedName("BidirectionOn")
    @Expose
    private Long BidirectionOn;

    /**
    * <p>最大返回行数</p>
    */
    @SerializedName("BidirectionMaxLine")
    @Expose
    private Long BidirectionMaxLine;

    /**
    * <p>最大返回大小</p>
    */
    @SerializedName("BidirectionMaxStorage")
    @Expose
    private Long BidirectionMaxStorage;

    /**
    * <p>是否允许开通双向审计(1.允许；0不允许)</p>
    */
    @SerializedName("BidirectionAllow")
    @Expose
    private Long BidirectionAllow;

    /**
    * <p>启双向审计的日志投递(1.开启;0.关闭)</p>
    */
    @SerializedName("BidirectionDelivery")
    @Expose
    private Long BidirectionDelivery;

    /**
    * <p>只读状态</p>
    */
    @SerializedName("RoStatus")
    @Expose
    private String RoStatus;

    /**
    * <p>当前资产是否开启了对当前Agent的采集策略</p>
    */
    @SerializedName("AgentBound")
    @Expose
    private Boolean AgentBound;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("CdbErrorMsg")
    @Expose
    private String CdbErrorMsg;

    /**
    * <p>资产 DSGC 绑定信息</p>
    */
    @SerializedName("DsgcBindingInfo")
    @Expose
    private DsgcBindingInfo DsgcBindingInfo;

    /**
    * <p>绑定的规则Ids</p>
    */
    @SerializedName("BindingRules")
    @Expose
    private IdWithName [] BindingRules;

    /**
    * <p>绑定的模型Ids</p>
    */
    @SerializedName("BindingModels")
    @Expose
    private IdWithName [] BindingModels;

    /**
    * <p>所属组名</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>资产组Id</p>
    */
    @SerializedName("AssetGroupId")
    @Expose
    private Long AssetGroupId;

    /**
    * <p>是否是新云原生审计流程</p>
    */
    @SerializedName("IsNewCloudAudit")
    @Expose
    private Boolean IsNewCloudAudit;

    /**
    * <p>1</p><p>取值范围：[0, 1]</p>
    */
    @SerializedName("TrafficMirrorOn")
    @Expose
    private Long TrafficMirrorOn;

    /**
    * <p>流量镜像审计范围</p><p>枚举值：</p><ul><li>ALL： 全地域</li><li>REGION： 资产所在地域</li><li>VPC： 资产所在VPC</li></ul><p>默认值：REGION</p>
    */
    @SerializedName("AuditScope")
    @Expose
    private String AuditScope;

    /**
    * <p>实例集群ID</p>
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * <p>该资产所在的资产组</p>
    */
    @SerializedName("AssetGroups")
    @Expose
    private IdWithName [] AssetGroups;

    /**
     * Get <p>创建时间</p> 
     * @return AddTime <p>创建时间</p>
     */
    public Long getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param AddTime <p>创建时间</p>
     */
    public void setAddTime(Long AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>资产 ID</p> 
     * @return Aid <p>资产 ID</p>
     */
    public Long getAid() {
        return this.Aid;
    }

    /**
     * Set <p>资产 ID</p>
     * @param Aid <p>资产 ID</p>
     */
    public void setAid(Long Aid) {
        this.Aid = Aid;
    }

    /**
     * Get <p>数据资产 IP</p> 
     * @return AssetsIp <p>数据资产 IP</p>
     */
    public String getAssetsIp() {
        return this.AssetsIp;
    }

    /**
     * Set <p>数据资产 IP</p>
     * @param AssetsIp <p>数据资产 IP</p>
     */
    public void setAssetsIp(String AssetsIp) {
        this.AssetsIp = AssetsIp;
    }

    /**
     * Get <p>数据资产名称</p> 
     * @return AssetsName <p>数据资产名称</p>
     */
    public String getAssetsName() {
        return this.AssetsName;
    }

    /**
     * Set <p>数据资产名称</p>
     * @param AssetsName <p>数据资产名称</p>
     */
    public void setAssetsName(String AssetsName) {
        this.AssetsName = AssetsName;
    }

    /**
     * Get <p>数据资产端口</p> 
     * @return AssetsPort <p>数据资产端口</p>
     */
    public Long getAssetsPort() {
        return this.AssetsPort;
    }

    /**
     * Set <p>数据资产端口</p>
     * @param AssetsPort <p>数据资产端口</p>
     */
    public void setAssetsPort(Long AssetsPort) {
        this.AssetsPort = AssetsPort;
    }

    /**
     * Get <p>数据资产类型</p> 
     * @return AssetsType <p>数据资产类型</p>
     */
    public String getAssetsType() {
        return this.AssetsType;
    }

    /**
     * Set <p>数据资产类型</p>
     * @param AssetsType <p>数据资产类型</p>
     */
    public void setAssetsType(String AssetsType) {
        this.AssetsType = AssetsType;
    }

    /**
     * Get <p>资产版本</p> 
     * @return AssetsVersion <p>资产版本</p>
     */
    public String getAssetsVersion() {
        return this.AssetsVersion;
    }

    /**
     * Set <p>资产版本</p>
     * @param AssetsVersion <p>资产版本</p>
     */
    public void setAssetsVersion(String AssetsVersion) {
        this.AssetsVersion = AssetsVersion;
    }

    /**
     * Get <p>是否动态</p> 
     * @return AssetsAddType <p>是否动态</p>
     */
    public Long getAssetsAddType() {
        return this.AssetsAddType;
    }

    /**
     * Set <p>是否动态</p>
     * @param AssetsAddType <p>是否动态</p>
     */
    public void setAssetsAddType(Long AssetsAddType) {
        this.AssetsAddType = AssetsAddType;
    }

    /**
     * Get <p>是否删除</p> 
     * @return Status <p>是否删除</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>是否删除</p>
     * @param Status <p>是否删除</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>最后一次修改时间</p> 
     * @return UpdateTime <p>最后一次修改时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后一次修改时间</p>
     * @param UpdateTime <p>最后一次修改时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>资产的vpc</p> 
     * @return VpcId <p>资产的vpc</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>资产的vpc</p>
     * @param VpcId <p>资产的vpc</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>地域</p> 
     * @return RegionId <p>地域</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域</p>
     * @param RegionId <p>地域</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>审计权限</p> 
     * @return Permission <p>审计权限</p>
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>审计权限</p>
     * @param Permission <p>审计权限</p>
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>用来区分自建资产是已通过cvm还是添加ip的方式</p> 
     * @return AddType <p>用来区分自建资产是已通过cvm还是添加ip的方式</p>
     */
    public Long getAddType() {
        return this.AddType;
    }

    /**
     * Set <p>用来区分自建资产是已通过cvm还是添加ip的方式</p>
     * @param AddType <p>用来区分自建资产是已通过cvm还是添加ip的方式</p>
     */
    public void setAddType(Long AddType) {
        this.AddType = AddType;
    }

    /**
     * Get <p>子网Id</p> 
     * @return AssetSubnetId <p>子网Id</p>
     */
    public String getAssetSubnetId() {
        return this.AssetSubnetId;
    }

    /**
     * Set <p>子网Id</p>
     * @param AssetSubnetId <p>子网Id</p>
     */
    public void setAssetSubnetId(String AssetSubnetId) {
        this.AssetSubnetId = AssetSubnetId;
    }

    /**
     * Get <p>是否已上传数据库私钥（0 否，1 是）</p> 
     * @return UploadPem <p>是否已上传数据库私钥（0 否，1 是）</p>
     */
    public Long getUploadPem() {
        return this.UploadPem;
    }

    /**
     * Set <p>是否已上传数据库私钥（0 否，1 是）</p>
     * @param UploadPem <p>是否已上传数据库私钥（0 否，1 是）</p>
     */
    public void setUploadPem(Long UploadPem) {
        this.UploadPem = UploadPem;
    }

    /**
     * Get <p>资产状态栏 0:正常 1:已删除（目前仅对tencentDB有效）</p> 
     * @return AliveStatus <p>资产状态栏 0:正常 1:已删除（目前仅对tencentDB有效）</p>
     */
    public Long getAliveStatus() {
        return this.AliveStatus;
    }

    /**
     * Set <p>资产状态栏 0:正常 1:已删除（目前仅对tencentDB有效）</p>
     * @param AliveStatus <p>资产状态栏 0:正常 1:已删除（目前仅对tencentDB有效）</p>
     */
    public void setAliveStatus(Long AliveStatus) {
        this.AliveStatus = AliveStatus;
    }

    /**
     * Get <p>开启agent(0:关闭;1:开启)</p> 
     * @return AgentOn <p>开启agent(0:关闭;1:开启)</p>
     */
    public Long getAgentOn() {
        return this.AgentOn;
    }

    /**
     * Set <p>开启agent(0:关闭;1:开启)</p>
     * @param AgentOn <p>开启agent(0:关闭;1:开启)</p>
     */
    public void setAgentOn(Long AgentOn) {
        this.AgentOn = AgentOn;
    }

    /**
     * Get <p>开启agent(0:关闭;1:开启)</p> 
     * @return CasbOn <p>开启agent(0:关闭;1:开启)</p>
     */
    public Long getCasbOn() {
        return this.CasbOn;
    }

    /**
     * Set <p>开启agent(0:关闭;1:开启)</p>
     * @param CasbOn <p>开启agent(0:关闭;1:开启)</p>
     */
    public void setCasbOn(Long CasbOn) {
        this.CasbOn = CasbOn;
    }

    /**
     * Get <p>只读组/集群ID</p> 
     * @return GroupId <p>只读组/集群ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>只读组/集群ID</p>
     * @param GroupId <p>只读组/集群ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>PROXY_OFF: 未开启Casb代理;PROXY_ERROR:Casb代理接口返回异常;PROXY_BOUND:已绑定;PROXY_UNBOUND:未绑定;UNPAID:未购买;UNSUPPORTED:类型不支持;METADATA_NOT_FOUND:元数据不存在;QUOTA_EXCEEDED:Casb额度不足</p> 
     * @return Available <p>PROXY_OFF: 未开启Casb代理;PROXY_ERROR:Casb代理接口返回异常;PROXY_BOUND:已绑定;PROXY_UNBOUND:未绑定;UNPAID:未购买;UNSUPPORTED:类型不支持;METADATA_NOT_FOUND:元数据不存在;QUOTA_EXCEEDED:Casb额度不足</p>
     */
    public String getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>PROXY_OFF: 未开启Casb代理;PROXY_ERROR:Casb代理接口返回异常;PROXY_BOUND:已绑定;PROXY_UNBOUND:未绑定;UNPAID:未购买;UNSUPPORTED:类型不支持;METADATA_NOT_FOUND:元数据不存在;QUOTA_EXCEEDED:Casb额度不足</p>
     * @param Available <p>PROXY_OFF: 未开启Casb代理;PROXY_ERROR:Casb代理接口返回异常;PROXY_BOUND:已绑定;PROXY_UNBOUND:未绑定;UNPAID:未购买;UNSUPPORTED:类型不支持;METADATA_NOT_FOUND:元数据不存在;QUOTA_EXCEEDED:Casb额度不足</p>
     */
    public void setAvailable(String Available) {
        this.Available = Available;
    }

    /**
     * Get <p>cdbOn</p> 
     * @return CdbOn <p>cdbOn</p>
     */
    public Long getCdbOn() {
        return this.CdbOn;
    }

    /**
     * Set <p>cdbOn</p>
     * @param CdbOn <p>cdbOn</p>
     */
    public void setCdbOn(Long CdbOn) {
        this.CdbOn = CdbOn;
    }

    /**
     * Get <p>平台位数 32位 64位</p> 
     * @return DbPlatform <p>平台位数 32位 64位</p>
     */
    public String getDbPlatform() {
        return this.DbPlatform;
    }

    /**
     * Set <p>平台位数 32位 64位</p>
     * @param DbPlatform <p>平台位数 32位 64位</p>
     */
    public void setDbPlatform(String DbPlatform) {
        this.DbPlatform = DbPlatform;
    }

    /**
     * Get <p>编码</p> 
     * @return DbCharset <p>编码</p>
     */
    public String getDbCharset() {
        return this.DbCharset;
    }

    /**
     * Set <p>编码</p>
     * @param DbCharset <p>编码</p>
     */
    public void setDbCharset(String DbCharset) {
        this.DbCharset = DbCharset;
    }

    /**
     * Get <p>操作系统</p> 
     * @return OsPolicy <p>操作系统</p>
     */
    public String getOsPolicy() {
        return this.OsPolicy;
    }

    /**
     * Set <p>操作系统</p>
     * @param OsPolicy <p>操作系统</p>
     */
    public void setOsPolicy(String OsPolicy) {
        this.OsPolicy = OsPolicy;
    }

    /**
     * Get <p>是否开启双向审计</p> 
     * @return BidirectionOn <p>是否开启双向审计</p>
     */
    public Long getBidirectionOn() {
        return this.BidirectionOn;
    }

    /**
     * Set <p>是否开启双向审计</p>
     * @param BidirectionOn <p>是否开启双向审计</p>
     */
    public void setBidirectionOn(Long BidirectionOn) {
        this.BidirectionOn = BidirectionOn;
    }

    /**
     * Get <p>最大返回行数</p> 
     * @return BidirectionMaxLine <p>最大返回行数</p>
     */
    public Long getBidirectionMaxLine() {
        return this.BidirectionMaxLine;
    }

    /**
     * Set <p>最大返回行数</p>
     * @param BidirectionMaxLine <p>最大返回行数</p>
     */
    public void setBidirectionMaxLine(Long BidirectionMaxLine) {
        this.BidirectionMaxLine = BidirectionMaxLine;
    }

    /**
     * Get <p>最大返回大小</p> 
     * @return BidirectionMaxStorage <p>最大返回大小</p>
     */
    public Long getBidirectionMaxStorage() {
        return this.BidirectionMaxStorage;
    }

    /**
     * Set <p>最大返回大小</p>
     * @param BidirectionMaxStorage <p>最大返回大小</p>
     */
    public void setBidirectionMaxStorage(Long BidirectionMaxStorage) {
        this.BidirectionMaxStorage = BidirectionMaxStorage;
    }

    /**
     * Get <p>是否允许开通双向审计(1.允许；0不允许)</p> 
     * @return BidirectionAllow <p>是否允许开通双向审计(1.允许；0不允许)</p>
     */
    public Long getBidirectionAllow() {
        return this.BidirectionAllow;
    }

    /**
     * Set <p>是否允许开通双向审计(1.允许；0不允许)</p>
     * @param BidirectionAllow <p>是否允许开通双向审计(1.允许；0不允许)</p>
     */
    public void setBidirectionAllow(Long BidirectionAllow) {
        this.BidirectionAllow = BidirectionAllow;
    }

    /**
     * Get <p>启双向审计的日志投递(1.开启;0.关闭)</p> 
     * @return BidirectionDelivery <p>启双向审计的日志投递(1.开启;0.关闭)</p>
     */
    public Long getBidirectionDelivery() {
        return this.BidirectionDelivery;
    }

    /**
     * Set <p>启双向审计的日志投递(1.开启;0.关闭)</p>
     * @param BidirectionDelivery <p>启双向审计的日志投递(1.开启;0.关闭)</p>
     */
    public void setBidirectionDelivery(Long BidirectionDelivery) {
        this.BidirectionDelivery = BidirectionDelivery;
    }

    /**
     * Get <p>只读状态</p> 
     * @return RoStatus <p>只读状态</p>
     */
    public String getRoStatus() {
        return this.RoStatus;
    }

    /**
     * Set <p>只读状态</p>
     * @param RoStatus <p>只读状态</p>
     */
    public void setRoStatus(String RoStatus) {
        this.RoStatus = RoStatus;
    }

    /**
     * Get <p>当前资产是否开启了对当前Agent的采集策略</p> 
     * @return AgentBound <p>当前资产是否开启了对当前Agent的采集策略</p>
     */
    public Boolean getAgentBound() {
        return this.AgentBound;
    }

    /**
     * Set <p>当前资产是否开启了对当前Agent的采集策略</p>
     * @param AgentBound <p>当前资产是否开启了对当前Agent的采集策略</p>
     */
    public void setAgentBound(Boolean AgentBound) {
        this.AgentBound = AgentBound;
    }

    /**
     * Get <p>错误信息</p> 
     * @return CdbErrorMsg <p>错误信息</p>
     */
    public String getCdbErrorMsg() {
        return this.CdbErrorMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param CdbErrorMsg <p>错误信息</p>
     */
    public void setCdbErrorMsg(String CdbErrorMsg) {
        this.CdbErrorMsg = CdbErrorMsg;
    }

    /**
     * Get <p>资产 DSGC 绑定信息</p> 
     * @return DsgcBindingInfo <p>资产 DSGC 绑定信息</p>
     */
    public DsgcBindingInfo getDsgcBindingInfo() {
        return this.DsgcBindingInfo;
    }

    /**
     * Set <p>资产 DSGC 绑定信息</p>
     * @param DsgcBindingInfo <p>资产 DSGC 绑定信息</p>
     */
    public void setDsgcBindingInfo(DsgcBindingInfo DsgcBindingInfo) {
        this.DsgcBindingInfo = DsgcBindingInfo;
    }

    /**
     * Get <p>绑定的规则Ids</p> 
     * @return BindingRules <p>绑定的规则Ids</p>
     */
    public IdWithName [] getBindingRules() {
        return this.BindingRules;
    }

    /**
     * Set <p>绑定的规则Ids</p>
     * @param BindingRules <p>绑定的规则Ids</p>
     */
    public void setBindingRules(IdWithName [] BindingRules) {
        this.BindingRules = BindingRules;
    }

    /**
     * Get <p>绑定的模型Ids</p> 
     * @return BindingModels <p>绑定的模型Ids</p>
     */
    public IdWithName [] getBindingModels() {
        return this.BindingModels;
    }

    /**
     * Set <p>绑定的模型Ids</p>
     * @param BindingModels <p>绑定的模型Ids</p>
     */
    public void setBindingModels(IdWithName [] BindingModels) {
        this.BindingModels = BindingModels;
    }

    /**
     * Get <p>所属组名</p> 
     * @return GroupName <p>所属组名</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>所属组名</p>
     * @param GroupName <p>所属组名</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>资产组Id</p> 
     * @return AssetGroupId <p>资产组Id</p>
     */
    public Long getAssetGroupId() {
        return this.AssetGroupId;
    }

    /**
     * Set <p>资产组Id</p>
     * @param AssetGroupId <p>资产组Id</p>
     */
    public void setAssetGroupId(Long AssetGroupId) {
        this.AssetGroupId = AssetGroupId;
    }

    /**
     * Get <p>是否是新云原生审计流程</p> 
     * @return IsNewCloudAudit <p>是否是新云原生审计流程</p>
     */
    public Boolean getIsNewCloudAudit() {
        return this.IsNewCloudAudit;
    }

    /**
     * Set <p>是否是新云原生审计流程</p>
     * @param IsNewCloudAudit <p>是否是新云原生审计流程</p>
     */
    public void setIsNewCloudAudit(Boolean IsNewCloudAudit) {
        this.IsNewCloudAudit = IsNewCloudAudit;
    }

    /**
     * Get <p>1</p><p>取值范围：[0, 1]</p> 
     * @return TrafficMirrorOn <p>1</p><p>取值范围：[0, 1]</p>
     */
    public Long getTrafficMirrorOn() {
        return this.TrafficMirrorOn;
    }

    /**
     * Set <p>1</p><p>取值范围：[0, 1]</p>
     * @param TrafficMirrorOn <p>1</p><p>取值范围：[0, 1]</p>
     */
    public void setTrafficMirrorOn(Long TrafficMirrorOn) {
        this.TrafficMirrorOn = TrafficMirrorOn;
    }

    /**
     * Get <p>流量镜像审计范围</p><p>枚举值：</p><ul><li>ALL： 全地域</li><li>REGION： 资产所在地域</li><li>VPC： 资产所在VPC</li></ul><p>默认值：REGION</p> 
     * @return AuditScope <p>流量镜像审计范围</p><p>枚举值：</p><ul><li>ALL： 全地域</li><li>REGION： 资产所在地域</li><li>VPC： 资产所在VPC</li></ul><p>默认值：REGION</p>
     */
    public String getAuditScope() {
        return this.AuditScope;
    }

    /**
     * Set <p>流量镜像审计范围</p><p>枚举值：</p><ul><li>ALL： 全地域</li><li>REGION： 资产所在地域</li><li>VPC： 资产所在VPC</li></ul><p>默认值：REGION</p>
     * @param AuditScope <p>流量镜像审计范围</p><p>枚举值：</p><ul><li>ALL： 全地域</li><li>REGION： 资产所在地域</li><li>VPC： 资产所在VPC</li></ul><p>默认值：REGION</p>
     */
    public void setAuditScope(String AuditScope) {
        this.AuditScope = AuditScope;
    }

    /**
     * Get <p>实例集群ID</p> 
     * @return InstanceGroupId <p>实例集群ID</p>
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set <p>实例集群ID</p>
     * @param InstanceGroupId <p>实例集群ID</p>
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get <p>该资产所在的资产组</p> 
     * @return AssetGroups <p>该资产所在的资产组</p>
     */
    public IdWithName [] getAssetGroups() {
        return this.AssetGroups;
    }

    /**
     * Set <p>该资产所在的资产组</p>
     * @param AssetGroups <p>该资产所在的资产组</p>
     */
    public void setAssetGroups(IdWithName [] AssetGroups) {
        this.AssetGroups = AssetGroups;
    }

    public AssetsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetsInfo(AssetsInfo source) {
        if (source.AddTime != null) {
            this.AddTime = new Long(source.AddTime);
        }
        if (source.Aid != null) {
            this.Aid = new Long(source.Aid);
        }
        if (source.AssetsIp != null) {
            this.AssetsIp = new String(source.AssetsIp);
        }
        if (source.AssetsName != null) {
            this.AssetsName = new String(source.AssetsName);
        }
        if (source.AssetsPort != null) {
            this.AssetsPort = new Long(source.AssetsPort);
        }
        if (source.AssetsType != null) {
            this.AssetsType = new String(source.AssetsType);
        }
        if (source.AssetsVersion != null) {
            this.AssetsVersion = new String(source.AssetsVersion);
        }
        if (source.AssetsAddType != null) {
            this.AssetsAddType = new Long(source.AssetsAddType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AddType != null) {
            this.AddType = new Long(source.AddType);
        }
        if (source.AssetSubnetId != null) {
            this.AssetSubnetId = new String(source.AssetSubnetId);
        }
        if (source.UploadPem != null) {
            this.UploadPem = new Long(source.UploadPem);
        }
        if (source.AliveStatus != null) {
            this.AliveStatus = new Long(source.AliveStatus);
        }
        if (source.AgentOn != null) {
            this.AgentOn = new Long(source.AgentOn);
        }
        if (source.CasbOn != null) {
            this.CasbOn = new Long(source.CasbOn);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Available != null) {
            this.Available = new String(source.Available);
        }
        if (source.CdbOn != null) {
            this.CdbOn = new Long(source.CdbOn);
        }
        if (source.DbPlatform != null) {
            this.DbPlatform = new String(source.DbPlatform);
        }
        if (source.DbCharset != null) {
            this.DbCharset = new String(source.DbCharset);
        }
        if (source.OsPolicy != null) {
            this.OsPolicy = new String(source.OsPolicy);
        }
        if (source.BidirectionOn != null) {
            this.BidirectionOn = new Long(source.BidirectionOn);
        }
        if (source.BidirectionMaxLine != null) {
            this.BidirectionMaxLine = new Long(source.BidirectionMaxLine);
        }
        if (source.BidirectionMaxStorage != null) {
            this.BidirectionMaxStorage = new Long(source.BidirectionMaxStorage);
        }
        if (source.BidirectionAllow != null) {
            this.BidirectionAllow = new Long(source.BidirectionAllow);
        }
        if (source.BidirectionDelivery != null) {
            this.BidirectionDelivery = new Long(source.BidirectionDelivery);
        }
        if (source.RoStatus != null) {
            this.RoStatus = new String(source.RoStatus);
        }
        if (source.AgentBound != null) {
            this.AgentBound = new Boolean(source.AgentBound);
        }
        if (source.CdbErrorMsg != null) {
            this.CdbErrorMsg = new String(source.CdbErrorMsg);
        }
        if (source.DsgcBindingInfo != null) {
            this.DsgcBindingInfo = new DsgcBindingInfo(source.DsgcBindingInfo);
        }
        if (source.BindingRules != null) {
            this.BindingRules = new IdWithName[source.BindingRules.length];
            for (int i = 0; i < source.BindingRules.length; i++) {
                this.BindingRules[i] = new IdWithName(source.BindingRules[i]);
            }
        }
        if (source.BindingModels != null) {
            this.BindingModels = new IdWithName[source.BindingModels.length];
            for (int i = 0; i < source.BindingModels.length; i++) {
                this.BindingModels[i] = new IdWithName(source.BindingModels[i]);
            }
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AssetGroupId != null) {
            this.AssetGroupId = new Long(source.AssetGroupId);
        }
        if (source.IsNewCloudAudit != null) {
            this.IsNewCloudAudit = new Boolean(source.IsNewCloudAudit);
        }
        if (source.TrafficMirrorOn != null) {
            this.TrafficMirrorOn = new Long(source.TrafficMirrorOn);
        }
        if (source.AuditScope != null) {
            this.AuditScope = new String(source.AuditScope);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.AssetGroups != null) {
            this.AssetGroups = new IdWithName[source.AssetGroups.length];
            for (int i = 0; i < source.AssetGroups.length; i++) {
                this.AssetGroups[i] = new IdWithName(source.AssetGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Aid", this.Aid);
        this.setParamSimple(map, prefix + "AssetsIp", this.AssetsIp);
        this.setParamSimple(map, prefix + "AssetsName", this.AssetsName);
        this.setParamSimple(map, prefix + "AssetsPort", this.AssetsPort);
        this.setParamSimple(map, prefix + "AssetsType", this.AssetsType);
        this.setParamSimple(map, prefix + "AssetsVersion", this.AssetsVersion);
        this.setParamSimple(map, prefix + "AssetsAddType", this.AssetsAddType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AddType", this.AddType);
        this.setParamSimple(map, prefix + "AssetSubnetId", this.AssetSubnetId);
        this.setParamSimple(map, prefix + "UploadPem", this.UploadPem);
        this.setParamSimple(map, prefix + "AliveStatus", this.AliveStatus);
        this.setParamSimple(map, prefix + "AgentOn", this.AgentOn);
        this.setParamSimple(map, prefix + "CasbOn", this.CasbOn);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "CdbOn", this.CdbOn);
        this.setParamSimple(map, prefix + "DbPlatform", this.DbPlatform);
        this.setParamSimple(map, prefix + "DbCharset", this.DbCharset);
        this.setParamSimple(map, prefix + "OsPolicy", this.OsPolicy);
        this.setParamSimple(map, prefix + "BidirectionOn", this.BidirectionOn);
        this.setParamSimple(map, prefix + "BidirectionMaxLine", this.BidirectionMaxLine);
        this.setParamSimple(map, prefix + "BidirectionMaxStorage", this.BidirectionMaxStorage);
        this.setParamSimple(map, prefix + "BidirectionAllow", this.BidirectionAllow);
        this.setParamSimple(map, prefix + "BidirectionDelivery", this.BidirectionDelivery);
        this.setParamSimple(map, prefix + "RoStatus", this.RoStatus);
        this.setParamSimple(map, prefix + "AgentBound", this.AgentBound);
        this.setParamSimple(map, prefix + "CdbErrorMsg", this.CdbErrorMsg);
        this.setParamObj(map, prefix + "DsgcBindingInfo.", this.DsgcBindingInfo);
        this.setParamArrayObj(map, prefix + "BindingRules.", this.BindingRules);
        this.setParamArrayObj(map, prefix + "BindingModels.", this.BindingModels);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "AssetGroupId", this.AssetGroupId);
        this.setParamSimple(map, prefix + "IsNewCloudAudit", this.IsNewCloudAudit);
        this.setParamSimple(map, prefix + "TrafficMirrorOn", this.TrafficMirrorOn);
        this.setParamSimple(map, prefix + "AuditScope", this.AuditScope);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamArrayObj(map, prefix + "AssetGroups.", this.AssetGroups);

    }
}

