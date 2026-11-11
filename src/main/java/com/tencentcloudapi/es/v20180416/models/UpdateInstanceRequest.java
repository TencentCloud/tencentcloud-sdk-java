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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>已废弃请使用NodeInfoList<br>节点个数（2-50个）</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>ES配置项（JSON格式字符串）</p>
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * <p>默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>可视化组件（Kibana、Cerebro）的公网访问策略</p>
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * <p>已废弃请使用NodeInfoList<br>磁盘大小（单位GB）</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个或5个）</p>
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * <p>已废弃请使用NodeInfoList<br>专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）</p>
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * <p>更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false</p>
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * <p>COS自动备份信息</p>
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * <p>节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改</p>
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * <p>ES集群公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * <p>公网访问控制列表</p>
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsPublicAcl EsPublicAcl;

    /**
    * <p>Kibana公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * <p>Kibana内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * <p>ES 6.8及以上版本基础版开启或关闭用户认证</p>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * <p>Kibana内网端口</p>
    */
    @SerializedName("KibanaPrivatePort")
    @Expose
    private Long KibanaPrivatePort;

    /**
    * <p>0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启</p>
    */
    @SerializedName("ScaleType")
    @Expose
    private Long ScaleType;

    /**
    * <p>多可用区部署</p>
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * <p>场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索</p>
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * <p>Kibana配置项（JSON格式字符串）</p>
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

    /**
    * <p>可视化节点配置</p>
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * <p>切换到新网络架构</p>
    */
    @SerializedName("SwitchPrivateLink")
    @Expose
    private String SwitchPrivateLink;

    /**
    * <p>启用Cerebro</p>
    */
    @SerializedName("EnableCerebro")
    @Expose
    private Boolean EnableCerebro;

    /**
    * <p>Cerebro公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("CerebroPublicAccess")
    @Expose
    private String CerebroPublicAccess;

    /**
    * <p>Cerebro内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("CerebroPrivateAccess")
    @Expose
    private String CerebroPrivateAccess;

    /**
    * <p>新增或修改的配置组信息</p>
    */
    @SerializedName("EsConfigSet")
    @Expose
    private EsConfigSetInfo EsConfigSet;

    /**
    * <p>可维护时间段</p>
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDurationUpdated OperationDuration;

    /**
    * <p>是否开启Alerting 外网告警输出：<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("KibanaAlteringPublicAccess")
    @Expose
    private String KibanaAlteringPublicAccess;

    /**
    * <p>kibana内网自定义域名</p>
    */
    @SerializedName("KibanaPrivateDomain")
    @Expose
    private String KibanaPrivateDomain;

    /**
    * <p>cerebro内网自定义域名</p>
    */
    @SerializedName("CerebroPrivateDomain")
    @Expose
    private String CerebroPrivateDomain;

    /**
    * <p>变更为https集群，默认是http</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>节点出站访问详细信息</p>
    */
    @SerializedName("OutboundPublicAcls")
    @Expose
    private OutboundPublicAcl [] OutboundPublicAcls;

    /**
    * <p>节点出站访问操作<br>OPEN 开启<br>CLOSE 关闭</p>
    */
    @SerializedName("OutboundPublicAccess")
    @Expose
    private String OutboundPublicAccess;

    /**
    * <p>cvm延迟上架参数</p>
    */
    @SerializedName("CvmDelayOnlineTime")
    @Expose
    private Long CvmDelayOnlineTime;

    /**
    * <p>分片迁移并发数</p>
    */
    @SerializedName("ShardAllocationConcurrents")
    @Expose
    private Long ShardAllocationConcurrents;

    /**
    * <p>分片迁移并发速度</p>
    */
    @SerializedName("ShardAllocationBytes")
    @Expose
    private Long ShardAllocationBytes;

    /**
    * <p>读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离</p>
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * <p>是否开启置放群组异步任务</p>
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * <p>置放群组异步任务可维护时间段</p>
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
    */
    @SerializedName("EnableDestroyProtection")
    @Expose
    private String EnableDestroyProtection;

    /**
    * <p>自动扩盘参数</p>
    */
    @SerializedName("AutoScaleDiskInfoList")
    @Expose
    private AutoScaleDiskInfo [] AutoScaleDiskInfoList;

    /**
    * <p>自动扩盘删除参数</p>
    */
    @SerializedName("AutoScaleDiskDeleteNodeTypeList")
    @Expose
    private String [] AutoScaleDiskDeleteNodeTypeList;

    /**
    * <p>其他附加配置，jvm或者yml</p>
    */
    @SerializedName("OtherConfig")
    @Expose
    private OtherConfig OtherConfig;

    /**
    * <p>滚动升降配时是否等待集群恢复Green再滚动下一个节点</p>
    */
    @SerializedName("WaitGreen")
    @Expose
    private String WaitGreen;

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
     * Get <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p> 
     * @return InstanceName <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
     * @param InstanceName <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>节点个数（2-50个）</p> 
     * @return NodeNum <p>已废弃请使用NodeInfoList<br>节点个数（2-50个）</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>节点个数（2-50个）</p>
     * @param NodeNum <p>已废弃请使用NodeInfoList<br>节点个数（2-50个）</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>ES配置项（JSON格式字符串）</p> 
     * @return EsConfig <p>ES配置项（JSON格式字符串）</p>
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set <p>ES配置项（JSON格式字符串）</p>
     * @param EsConfig <p>ES配置项（JSON格式字符串）</p>
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get <p>默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p> 
     * @return Password <p>默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
     * @param Password <p>默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>可视化组件（Kibana、Cerebro）的公网访问策略</p> 
     * @return EsAcl <p>可视化组件（Kibana、Cerebro）的公网访问策略</p>
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set <p>可视化组件（Kibana、Cerebro）的公网访问策略</p>
     * @param EsAcl <p>可视化组件（Kibana、Cerebro）的公网访问策略</p>
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>磁盘大小（单位GB）</p> 
     * @return DiskSize <p>已废弃请使用NodeInfoList<br>磁盘大小（单位GB）</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>磁盘大小（单位GB）</p>
     * @param DiskSize <p>已废弃请使用NodeInfoList<br>磁盘大小（单位GB）</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p> 
     * @return NodeType <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     * @param NodeType <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个或5个）</p> 
     * @return MasterNodeNum <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个或5个）</p>
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个或5个）</p>
     * @param MasterNodeNum <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个或5个）</p>
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p> 
     * @return MasterNodeType <p>已废弃请使用NodeInfoList<br>专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     * @param MasterNodeType <p>已废弃请使用NodeInfoList<br>专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）</p> 
     * @return MasterNodeDiskSize <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）</p>
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）</p>
     * @param MasterNodeDiskSize <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）</p>
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get <p>更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false</p> 
     * @return ForceRestart <p>更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false</p>
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set <p>更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false</p>
     * @param ForceRestart <p>更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false</p>
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get <p>COS自动备份信息</p> 
     * @return CosBackup <p>COS自动备份信息</p>
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set <p>COS自动备份信息</p>
     * @param CosBackup <p>COS自动备份信息</p>
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get <p>节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改</p> 
     * @return NodeInfoList <p>节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改</p>
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set <p>节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改</p>
     * @param NodeInfoList <p>节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改</p>
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get <p>ES集群公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return PublicAccess <p>ES集群公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set <p>ES集群公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param PublicAccess <p>ES集群公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get <p>公网访问控制列表</p> 
     * @return EsPublicAcl <p>公网访问控制列表</p>
     */
    public EsPublicAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set <p>公网访问控制列表</p>
     * @param EsPublicAcl <p>公网访问控制列表</p>
     */
    public void setEsPublicAcl(EsPublicAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get <p>Kibana公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return KibanaPublicAccess <p>Kibana公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set <p>Kibana公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param KibanaPublicAccess <p>Kibana公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get <p>Kibana内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return KibanaPrivateAccess <p>Kibana内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set <p>Kibana内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param KibanaPrivateAccess <p>Kibana内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get <p>ES 6.8及以上版本基础版开启或关闭用户认证</p> 
     * @return BasicSecurityType <p>ES 6.8及以上版本基础版开启或关闭用户认证</p>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set <p>ES 6.8及以上版本基础版开启或关闭用户认证</p>
     * @param BasicSecurityType <p>ES 6.8及以上版本基础版开启或关闭用户认证</p>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get <p>Kibana内网端口</p> 
     * @return KibanaPrivatePort <p>Kibana内网端口</p>
     */
    public Long getKibanaPrivatePort() {
        return this.KibanaPrivatePort;
    }

    /**
     * Set <p>Kibana内网端口</p>
     * @param KibanaPrivatePort <p>Kibana内网端口</p>
     */
    public void setKibanaPrivatePort(Long KibanaPrivatePort) {
        this.KibanaPrivatePort = KibanaPrivatePort;
    }

    /**
     * Get <p>0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启</p> 
     * @return ScaleType <p>0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启</p>
     */
    public Long getScaleType() {
        return this.ScaleType;
    }

    /**
     * Set <p>0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启</p>
     * @param ScaleType <p>0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启</p>
     */
    public void setScaleType(Long ScaleType) {
        this.ScaleType = ScaleType;
    }

    /**
     * Get <p>多可用区部署</p> 
     * @return MultiZoneInfo <p>多可用区部署</p>
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set <p>多可用区部署</p>
     * @param MultiZoneInfo <p>多可用区部署</p>
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get <p>场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索</p> 
     * @return SceneType <p>场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索</p>
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索</p>
     * @param SceneType <p>场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索</p>
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>Kibana配置项（JSON格式字符串）</p> 
     * @return KibanaConfig <p>Kibana配置项（JSON格式字符串）</p>
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set <p>Kibana配置项（JSON格式字符串）</p>
     * @param KibanaConfig <p>Kibana配置项（JSON格式字符串）</p>
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Get <p>可视化节点配置</p> 
     * @return WebNodeTypeInfo <p>可视化节点配置</p>
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set <p>可视化节点配置</p>
     * @param WebNodeTypeInfo <p>可视化节点配置</p>
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get <p>切换到新网络架构</p> 
     * @return SwitchPrivateLink <p>切换到新网络架构</p>
     */
    public String getSwitchPrivateLink() {
        return this.SwitchPrivateLink;
    }

    /**
     * Set <p>切换到新网络架构</p>
     * @param SwitchPrivateLink <p>切换到新网络架构</p>
     */
    public void setSwitchPrivateLink(String SwitchPrivateLink) {
        this.SwitchPrivateLink = SwitchPrivateLink;
    }

    /**
     * Get <p>启用Cerebro</p> 
     * @return EnableCerebro <p>启用Cerebro</p>
     */
    public Boolean getEnableCerebro() {
        return this.EnableCerebro;
    }

    /**
     * Set <p>启用Cerebro</p>
     * @param EnableCerebro <p>启用Cerebro</p>
     */
    public void setEnableCerebro(Boolean EnableCerebro) {
        this.EnableCerebro = EnableCerebro;
    }

    /**
     * Get <p>Cerebro公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return CerebroPublicAccess <p>Cerebro公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getCerebroPublicAccess() {
        return this.CerebroPublicAccess;
    }

    /**
     * Set <p>Cerebro公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param CerebroPublicAccess <p>Cerebro公网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setCerebroPublicAccess(String CerebroPublicAccess) {
        this.CerebroPublicAccess = CerebroPublicAccess;
    }

    /**
     * Get <p>Cerebro内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return CerebroPrivateAccess <p>Cerebro内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getCerebroPrivateAccess() {
        return this.CerebroPrivateAccess;
    }

    /**
     * Set <p>Cerebro内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param CerebroPrivateAccess <p>Cerebro内网访问状态<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setCerebroPrivateAccess(String CerebroPrivateAccess) {
        this.CerebroPrivateAccess = CerebroPrivateAccess;
    }

    /**
     * Get <p>新增或修改的配置组信息</p> 
     * @return EsConfigSet <p>新增或修改的配置组信息</p>
     */
    public EsConfigSetInfo getEsConfigSet() {
        return this.EsConfigSet;
    }

    /**
     * Set <p>新增或修改的配置组信息</p>
     * @param EsConfigSet <p>新增或修改的配置组信息</p>
     */
    public void setEsConfigSet(EsConfigSetInfo EsConfigSet) {
        this.EsConfigSet = EsConfigSet;
    }

    /**
     * Get <p>可维护时间段</p> 
     * @return OperationDuration <p>可维护时间段</p>
     */
    public OperationDurationUpdated getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set <p>可维护时间段</p>
     * @param OperationDuration <p>可维护时间段</p>
     */
    public void setOperationDuration(OperationDurationUpdated OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get <p>是否开启Alerting 外网告警输出：<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return KibanaAlteringPublicAccess <p>是否开启Alerting 外网告警输出：<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getKibanaAlteringPublicAccess() {
        return this.KibanaAlteringPublicAccess;
    }

    /**
     * Set <p>是否开启Alerting 外网告警输出：<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param KibanaAlteringPublicAccess <p>是否开启Alerting 外网告警输出：<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setKibanaAlteringPublicAccess(String KibanaAlteringPublicAccess) {
        this.KibanaAlteringPublicAccess = KibanaAlteringPublicAccess;
    }

    /**
     * Get <p>kibana内网自定义域名</p> 
     * @return KibanaPrivateDomain <p>kibana内网自定义域名</p>
     */
    public String getKibanaPrivateDomain() {
        return this.KibanaPrivateDomain;
    }

    /**
     * Set <p>kibana内网自定义域名</p>
     * @param KibanaPrivateDomain <p>kibana内网自定义域名</p>
     */
    public void setKibanaPrivateDomain(String KibanaPrivateDomain) {
        this.KibanaPrivateDomain = KibanaPrivateDomain;
    }

    /**
     * Get <p>cerebro内网自定义域名</p> 
     * @return CerebroPrivateDomain <p>cerebro内网自定义域名</p>
     */
    public String getCerebroPrivateDomain() {
        return this.CerebroPrivateDomain;
    }

    /**
     * Set <p>cerebro内网自定义域名</p>
     * @param CerebroPrivateDomain <p>cerebro内网自定义域名</p>
     */
    public void setCerebroPrivateDomain(String CerebroPrivateDomain) {
        this.CerebroPrivateDomain = CerebroPrivateDomain;
    }

    /**
     * Get <p>变更为https集群，默认是http</p> 
     * @return Protocol <p>变更为https集群，默认是http</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>变更为https集群，默认是http</p>
     * @param Protocol <p>变更为https集群，默认是http</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>节点出站访问详细信息</p> 
     * @return OutboundPublicAcls <p>节点出站访问详细信息</p>
     */
    public OutboundPublicAcl [] getOutboundPublicAcls() {
        return this.OutboundPublicAcls;
    }

    /**
     * Set <p>节点出站访问详细信息</p>
     * @param OutboundPublicAcls <p>节点出站访问详细信息</p>
     */
    public void setOutboundPublicAcls(OutboundPublicAcl [] OutboundPublicAcls) {
        this.OutboundPublicAcls = OutboundPublicAcls;
    }

    /**
     * Get <p>节点出站访问操作<br>OPEN 开启<br>CLOSE 关闭</p> 
     * @return OutboundPublicAccess <p>节点出站访问操作<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public String getOutboundPublicAccess() {
        return this.OutboundPublicAccess;
    }

    /**
     * Set <p>节点出站访问操作<br>OPEN 开启<br>CLOSE 关闭</p>
     * @param OutboundPublicAccess <p>节点出站访问操作<br>OPEN 开启<br>CLOSE 关闭</p>
     */
    public void setOutboundPublicAccess(String OutboundPublicAccess) {
        this.OutboundPublicAccess = OutboundPublicAccess;
    }

    /**
     * Get <p>cvm延迟上架参数</p> 
     * @return CvmDelayOnlineTime <p>cvm延迟上架参数</p>
     */
    public Long getCvmDelayOnlineTime() {
        return this.CvmDelayOnlineTime;
    }

    /**
     * Set <p>cvm延迟上架参数</p>
     * @param CvmDelayOnlineTime <p>cvm延迟上架参数</p>
     */
    public void setCvmDelayOnlineTime(Long CvmDelayOnlineTime) {
        this.CvmDelayOnlineTime = CvmDelayOnlineTime;
    }

    /**
     * Get <p>分片迁移并发数</p> 
     * @return ShardAllocationConcurrents <p>分片迁移并发数</p>
     */
    public Long getShardAllocationConcurrents() {
        return this.ShardAllocationConcurrents;
    }

    /**
     * Set <p>分片迁移并发数</p>
     * @param ShardAllocationConcurrents <p>分片迁移并发数</p>
     */
    public void setShardAllocationConcurrents(Long ShardAllocationConcurrents) {
        this.ShardAllocationConcurrents = ShardAllocationConcurrents;
    }

    /**
     * Get <p>分片迁移并发速度</p> 
     * @return ShardAllocationBytes <p>分片迁移并发速度</p>
     */
    public Long getShardAllocationBytes() {
        return this.ShardAllocationBytes;
    }

    /**
     * Set <p>分片迁移并发速度</p>
     * @param ShardAllocationBytes <p>分片迁移并发速度</p>
     */
    public void setShardAllocationBytes(Long ShardAllocationBytes) {
        this.ShardAllocationBytes = ShardAllocationBytes;
    }

    /**
     * Get <p>读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离</p> 
     * @return ReadWriteMode <p>读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离</p>
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set <p>读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离</p>
     * @param ReadWriteMode <p>读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离</p>
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get <p>是否开启置放群组异步任务</p> 
     * @return EnableScheduleRecoverGroup <p>是否开启置放群组异步任务</p>
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set <p>是否开启置放群组异步任务</p>
     * @param EnableScheduleRecoverGroup <p>是否开启置放群组异步任务</p>
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get <p>置放群组异步任务可维护时间段</p> 
     * @return EnableScheduleOperationDuration <p>置放群组异步任务可维护时间段</p>
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set <p>置放群组异步任务可维护时间段</p>
     * @param EnableScheduleOperationDuration <p>置放群组异步任务可维护时间段</p>
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get <p>开启集群保护：OPEN-开启，CLOSE-关闭</p> 
     * @return EnableDestroyProtection <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
     */
    public String getEnableDestroyProtection() {
        return this.EnableDestroyProtection;
    }

    /**
     * Set <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
     * @param EnableDestroyProtection <p>开启集群保护：OPEN-开启，CLOSE-关闭</p>
     */
    public void setEnableDestroyProtection(String EnableDestroyProtection) {
        this.EnableDestroyProtection = EnableDestroyProtection;
    }

    /**
     * Get <p>自动扩盘参数</p> 
     * @return AutoScaleDiskInfoList <p>自动扩盘参数</p>
     */
    public AutoScaleDiskInfo [] getAutoScaleDiskInfoList() {
        return this.AutoScaleDiskInfoList;
    }

    /**
     * Set <p>自动扩盘参数</p>
     * @param AutoScaleDiskInfoList <p>自动扩盘参数</p>
     */
    public void setAutoScaleDiskInfoList(AutoScaleDiskInfo [] AutoScaleDiskInfoList) {
        this.AutoScaleDiskInfoList = AutoScaleDiskInfoList;
    }

    /**
     * Get <p>自动扩盘删除参数</p> 
     * @return AutoScaleDiskDeleteNodeTypeList <p>自动扩盘删除参数</p>
     */
    public String [] getAutoScaleDiskDeleteNodeTypeList() {
        return this.AutoScaleDiskDeleteNodeTypeList;
    }

    /**
     * Set <p>自动扩盘删除参数</p>
     * @param AutoScaleDiskDeleteNodeTypeList <p>自动扩盘删除参数</p>
     */
    public void setAutoScaleDiskDeleteNodeTypeList(String [] AutoScaleDiskDeleteNodeTypeList) {
        this.AutoScaleDiskDeleteNodeTypeList = AutoScaleDiskDeleteNodeTypeList;
    }

    /**
     * Get <p>其他附加配置，jvm或者yml</p> 
     * @return OtherConfig <p>其他附加配置，jvm或者yml</p>
     */
    public OtherConfig getOtherConfig() {
        return this.OtherConfig;
    }

    /**
     * Set <p>其他附加配置，jvm或者yml</p>
     * @param OtherConfig <p>其他附加配置，jvm或者yml</p>
     */
    public void setOtherConfig(OtherConfig OtherConfig) {
        this.OtherConfig = OtherConfig;
    }

    /**
     * Get <p>滚动升降配时是否等待集群恢复Green再滚动下一个节点</p> 
     * @return WaitGreen <p>滚动升降配时是否等待集群恢复Green再滚动下一个节点</p>
     */
    public String getWaitGreen() {
        return this.WaitGreen;
    }

    /**
     * Set <p>滚动升降配时是否等待集群恢复Green再滚动下一个节点</p>
     * @param WaitGreen <p>滚动升降配时是否等待集群恢复Green再滚动下一个节点</p>
     */
    public void setWaitGreen(String WaitGreen) {
        this.WaitGreen = WaitGreen;
    }

    public UpdateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInstanceRequest(UpdateInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.EsConfig != null) {
            this.EsConfig = new String(source.EsConfig);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EsAcl != null) {
            this.EsAcl = new EsAcl(source.EsAcl);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.MasterNodeNum != null) {
            this.MasterNodeNum = new Long(source.MasterNodeNum);
        }
        if (source.MasterNodeType != null) {
            this.MasterNodeType = new String(source.MasterNodeType);
        }
        if (source.MasterNodeDiskSize != null) {
            this.MasterNodeDiskSize = new Long(source.MasterNodeDiskSize);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new CosBackup(source.CosBackup);
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new NodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new NodeInfo(source.NodeInfoList[i]);
            }
        }
        if (source.PublicAccess != null) {
            this.PublicAccess = new String(source.PublicAccess);
        }
        if (source.EsPublicAcl != null) {
            this.EsPublicAcl = new EsPublicAcl(source.EsPublicAcl);
        }
        if (source.KibanaPublicAccess != null) {
            this.KibanaPublicAccess = new String(source.KibanaPublicAccess);
        }
        if (source.KibanaPrivateAccess != null) {
            this.KibanaPrivateAccess = new String(source.KibanaPrivateAccess);
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.KibanaPrivatePort != null) {
            this.KibanaPrivatePort = new Long(source.KibanaPrivatePort);
        }
        if (source.ScaleType != null) {
            this.ScaleType = new Long(source.ScaleType);
        }
        if (source.MultiZoneInfo != null) {
            this.MultiZoneInfo = new ZoneDetail[source.MultiZoneInfo.length];
            for (int i = 0; i < source.MultiZoneInfo.length; i++) {
                this.MultiZoneInfo[i] = new ZoneDetail(source.MultiZoneInfo[i]);
            }
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
        }
        if (source.KibanaConfig != null) {
            this.KibanaConfig = new String(source.KibanaConfig);
        }
        if (source.WebNodeTypeInfo != null) {
            this.WebNodeTypeInfo = new WebNodeTypeInfo(source.WebNodeTypeInfo);
        }
        if (source.SwitchPrivateLink != null) {
            this.SwitchPrivateLink = new String(source.SwitchPrivateLink);
        }
        if (source.EnableCerebro != null) {
            this.EnableCerebro = new Boolean(source.EnableCerebro);
        }
        if (source.CerebroPublicAccess != null) {
            this.CerebroPublicAccess = new String(source.CerebroPublicAccess);
        }
        if (source.CerebroPrivateAccess != null) {
            this.CerebroPrivateAccess = new String(source.CerebroPrivateAccess);
        }
        if (source.EsConfigSet != null) {
            this.EsConfigSet = new EsConfigSetInfo(source.EsConfigSet);
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDurationUpdated(source.OperationDuration);
        }
        if (source.KibanaAlteringPublicAccess != null) {
            this.KibanaAlteringPublicAccess = new String(source.KibanaAlteringPublicAccess);
        }
        if (source.KibanaPrivateDomain != null) {
            this.KibanaPrivateDomain = new String(source.KibanaPrivateDomain);
        }
        if (source.CerebroPrivateDomain != null) {
            this.CerebroPrivateDomain = new String(source.CerebroPrivateDomain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OutboundPublicAcls != null) {
            this.OutboundPublicAcls = new OutboundPublicAcl[source.OutboundPublicAcls.length];
            for (int i = 0; i < source.OutboundPublicAcls.length; i++) {
                this.OutboundPublicAcls[i] = new OutboundPublicAcl(source.OutboundPublicAcls[i]);
            }
        }
        if (source.OutboundPublicAccess != null) {
            this.OutboundPublicAccess = new String(source.OutboundPublicAccess);
        }
        if (source.CvmDelayOnlineTime != null) {
            this.CvmDelayOnlineTime = new Long(source.CvmDelayOnlineTime);
        }
        if (source.ShardAllocationConcurrents != null) {
            this.ShardAllocationConcurrents = new Long(source.ShardAllocationConcurrents);
        }
        if (source.ShardAllocationBytes != null) {
            this.ShardAllocationBytes = new Long(source.ShardAllocationBytes);
        }
        if (source.ReadWriteMode != null) {
            this.ReadWriteMode = new Long(source.ReadWriteMode);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
        if (source.EnableDestroyProtection != null) {
            this.EnableDestroyProtection = new String(source.EnableDestroyProtection);
        }
        if (source.AutoScaleDiskInfoList != null) {
            this.AutoScaleDiskInfoList = new AutoScaleDiskInfo[source.AutoScaleDiskInfoList.length];
            for (int i = 0; i < source.AutoScaleDiskInfoList.length; i++) {
                this.AutoScaleDiskInfoList[i] = new AutoScaleDiskInfo(source.AutoScaleDiskInfoList[i]);
            }
        }
        if (source.AutoScaleDiskDeleteNodeTypeList != null) {
            this.AutoScaleDiskDeleteNodeTypeList = new String[source.AutoScaleDiskDeleteNodeTypeList.length];
            for (int i = 0; i < source.AutoScaleDiskDeleteNodeTypeList.length; i++) {
                this.AutoScaleDiskDeleteNodeTypeList[i] = new String(source.AutoScaleDiskDeleteNodeTypeList[i]);
            }
        }
        if (source.OtherConfig != null) {
            this.OtherConfig = new OtherConfig(source.OtherConfig);
        }
        if (source.WaitGreen != null) {
            this.WaitGreen = new String(source.WaitGreen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "EsAcl.", this.EsAcl);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "MasterNodeNum", this.MasterNodeNum);
        this.setParamSimple(map, prefix + "MasterNodeType", this.MasterNodeType);
        this.setParamSimple(map, prefix + "MasterNodeDiskSize", this.MasterNodeDiskSize);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);
        this.setParamObj(map, prefix + "CosBackup.", this.CosBackup);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);
        this.setParamSimple(map, prefix + "PublicAccess", this.PublicAccess);
        this.setParamObj(map, prefix + "EsPublicAcl.", this.EsPublicAcl);
        this.setParamSimple(map, prefix + "KibanaPublicAccess", this.KibanaPublicAccess);
        this.setParamSimple(map, prefix + "KibanaPrivateAccess", this.KibanaPrivateAccess);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);
        this.setParamSimple(map, prefix + "KibanaPrivatePort", this.KibanaPrivatePort);
        this.setParamSimple(map, prefix + "ScaleType", this.ScaleType);
        this.setParamArrayObj(map, prefix + "MultiZoneInfo.", this.MultiZoneInfo);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "KibanaConfig", this.KibanaConfig);
        this.setParamObj(map, prefix + "WebNodeTypeInfo.", this.WebNodeTypeInfo);
        this.setParamSimple(map, prefix + "SwitchPrivateLink", this.SwitchPrivateLink);
        this.setParamSimple(map, prefix + "EnableCerebro", this.EnableCerebro);
        this.setParamSimple(map, prefix + "CerebroPublicAccess", this.CerebroPublicAccess);
        this.setParamSimple(map, prefix + "CerebroPrivateAccess", this.CerebroPrivateAccess);
        this.setParamObj(map, prefix + "EsConfigSet.", this.EsConfigSet);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);
        this.setParamSimple(map, prefix + "KibanaAlteringPublicAccess", this.KibanaAlteringPublicAccess);
        this.setParamSimple(map, prefix + "KibanaPrivateDomain", this.KibanaPrivateDomain);
        this.setParamSimple(map, prefix + "CerebroPrivateDomain", this.CerebroPrivateDomain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "OutboundPublicAcls.", this.OutboundPublicAcls);
        this.setParamSimple(map, prefix + "OutboundPublicAccess", this.OutboundPublicAccess);
        this.setParamSimple(map, prefix + "CvmDelayOnlineTime", this.CvmDelayOnlineTime);
        this.setParamSimple(map, prefix + "ShardAllocationConcurrents", this.ShardAllocationConcurrents);
        this.setParamSimple(map, prefix + "ShardAllocationBytes", this.ShardAllocationBytes);
        this.setParamSimple(map, prefix + "ReadWriteMode", this.ReadWriteMode);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamSimple(map, prefix + "EnableDestroyProtection", this.EnableDestroyProtection);
        this.setParamArrayObj(map, prefix + "AutoScaleDiskInfoList.", this.AutoScaleDiskInfoList);
        this.setParamArraySimple(map, prefix + "AutoScaleDiskDeleteNodeTypeList.", this.AutoScaleDiskDeleteNodeTypeList);
        this.setParamObj(map, prefix + "OtherConfig.", this.OtherConfig);
        this.setParamSimple(map, prefix + "WaitGreen", this.WaitGreen);

    }
}

