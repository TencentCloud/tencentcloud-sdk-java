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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 已废弃请使用NodeInfoList
节点个数（2-50个）
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * ES配置项（JSON格式字符串）
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * 默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 可视化组件（Kibana、Cerebro）的公网访问策略
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * 已废弃请使用NodeInfoList
磁盘大小（单位GB）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 已废弃请使用NodeInfoList
专用主节点个数（只支持3个或5个）
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * 已废弃请使用NodeInfoList
专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * 更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
    * COS自动备份信息
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * 节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * ES集群公网访问状态
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("PublicAccess")
    @Expose
    private String PublicAccess;

    /**
    * 公网访问控制列表
    */
    @SerializedName("EsPublicAcl")
    @Expose
    private EsPublicAcl EsPublicAcl;

    /**
    * Kibana公网访问状态
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * Kibana内网访问状态
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("KibanaPrivateAccess")
    @Expose
    private String KibanaPrivateAccess;

    /**
    * ES 6.8及以上版本基础版开启或关闭用户认证
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * Kibana内网端口
    */
    @SerializedName("KibanaPrivatePort")
    @Expose
    private Long KibanaPrivatePort;

    /**
    * 0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启
    */
    @SerializedName("ScaleType")
    @Expose
    private Long ScaleType;

    /**
    * 多可用区部署
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * 场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * Kibana配置项（JSON格式字符串）
    */
    @SerializedName("KibanaConfig")
    @Expose
    private String KibanaConfig;

    /**
    * 可视化节点配置
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * 切换到新网络架构
    */
    @SerializedName("SwitchPrivateLink")
    @Expose
    private String SwitchPrivateLink;

    /**
    * 启用Cerebro
    */
    @SerializedName("EnableCerebro")
    @Expose
    private Boolean EnableCerebro;

    /**
    * Cerebro公网访问状态
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("CerebroPublicAccess")
    @Expose
    private String CerebroPublicAccess;

    /**
    * Cerebro内网访问状态
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("CerebroPrivateAccess")
    @Expose
    private String CerebroPrivateAccess;

    /**
    * 新增或修改的配置组信息
    */
    @SerializedName("EsConfigSet")
    @Expose
    private EsConfigSetInfo EsConfigSet;

    /**
    * 可维护时间段
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDurationUpdated OperationDuration;

    /**
    * 是否开启Alerting 外网告警输出：
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("KibanaAlteringPublicAccess")
    @Expose
    private String KibanaAlteringPublicAccess;

    /**
    * kibana内网自定义域名
    */
    @SerializedName("KibanaPrivateDomain")
    @Expose
    private String KibanaPrivateDomain;

    /**
    * cerebro内网自定义域名
    */
    @SerializedName("CerebroPrivateDomain")
    @Expose
    private String CerebroPrivateDomain;

    /**
    * 变更为https集群，默认是http
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 节点出站访问详细信息

    */
    @SerializedName("OutboundPublicAcls")
    @Expose
    private OutboundPublicAcl [] OutboundPublicAcls;

    /**
    * 节点出站访问操作
OPEN 开启
CLOSE 关闭
    */
    @SerializedName("OutboundPublicAccess")
    @Expose
    private String OutboundPublicAccess;

    /**
    * cvm延迟上架参数
    */
    @SerializedName("CvmDelayOnlineTime")
    @Expose
    private Long CvmDelayOnlineTime;

    /**
    * 分片迁移并发数
    */
    @SerializedName("ShardAllocationConcurrents")
    @Expose
    private Long ShardAllocationConcurrents;

    /**
    * 分片迁移并发速度
    */
    @SerializedName("ShardAllocationBytes")
    @Expose
    private Long ShardAllocationBytes;

    /**
    * 读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * 是否开启置放群组异步任务
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * 置放群组异步任务可维护时间段
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_） 
     * @return InstanceName 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     * @param InstanceName 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 已废弃请使用NodeInfoList
节点个数（2-50个） 
     * @return NodeNum 已废弃请使用NodeInfoList
节点个数（2-50个）
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点个数（2-50个）
     * @param NodeNum 已废弃请使用NodeInfoList
节点个数（2-50个）
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get ES配置项（JSON格式字符串） 
     * @return EsConfig ES配置项（JSON格式字符串）
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set ES配置项（JSON格式字符串）
     * @param EsConfig ES配置项（JSON格式字符串）
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * Get 默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号） 
     * @return Password 默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
     * @param Password 默认用户elastic的密码（8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 可视化组件（Kibana、Cerebro）的公网访问策略 
     * @return EsAcl 可视化组件（Kibana、Cerebro）的公网访问策略
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set 可视化组件（Kibana、Cerebro）的公网访问策略
     * @param EsAcl 可视化组件（Kibana、Cerebro）的公网访问策略
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * Get 已废弃请使用NodeInfoList
磁盘大小（单位GB） 
     * @return DiskSize 已废弃请使用NodeInfoList
磁盘大小（单位GB）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 已废弃请使用NodeInfoList
磁盘大小（单位GB）
     * @param DiskSize 已废弃请使用NodeInfoList
磁盘大小（单位GB）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li> 
     * @return NodeType 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param NodeType 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 已废弃请使用NodeInfoList
专用主节点个数（只支持3个或5个） 
     * @return MasterNodeNum 已废弃请使用NodeInfoList
专用主节点个数（只支持3个或5个）
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set 已废弃请使用NodeInfoList
专用主节点个数（只支持3个或5个）
     * @param MasterNodeNum 已废弃请使用NodeInfoList
专用主节点个数（只支持3个或5个）
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get 已废弃请使用NodeInfoList
专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li> 
     * @return MasterNodeType 已废弃请使用NodeInfoList
专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set 已废弃请使用NodeInfoList
专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param MasterNodeType 已废弃请使用NodeInfoList
专用主节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义） 
     * @return MasterNodeDiskSize 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）
     * @param MasterNodeDiskSize 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB系统默认配置为50GB,暂不支持自定义）
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get 更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false 
     * @return ForceRestart 更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false
     * @param ForceRestart 更新配置时是否强制重启<li>true强制重启</li><li>false不强制重启</li>当前仅更新EsConfig时需要设置，默认值为false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    /**
     * Get COS自动备份信息 
     * @return CosBackup COS自动备份信息
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set COS自动备份信息
     * @param CosBackup COS自动备份信息
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get 节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改 
     * @return NodeInfoList 节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set 节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改
     * @param NodeInfoList 节点信息列表，可以只传递要更新的节点及其对应的规格信息。支持的操作包括<li>修改一种节点的个数</li><li>修改一种节点的节点规格及磁盘大小</li><li>增加一种节点类型（需要同时指定该节点的类型，个数，规格，磁盘等信息）</li>上述操作一次只能进行一种，且磁盘类型不支持修改
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get ES集群公网访问状态
OPEN 开启
CLOSE 关闭 
     * @return PublicAccess ES集群公网访问状态
OPEN 开启
CLOSE 关闭
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set ES集群公网访问状态
OPEN 开启
CLOSE 关闭
     * @param PublicAccess ES集群公网访问状态
OPEN 开启
CLOSE 关闭
     */
    public void setPublicAccess(String PublicAccess) {
        this.PublicAccess = PublicAccess;
    }

    /**
     * Get 公网访问控制列表 
     * @return EsPublicAcl 公网访问控制列表
     */
    public EsPublicAcl getEsPublicAcl() {
        return this.EsPublicAcl;
    }

    /**
     * Set 公网访问控制列表
     * @param EsPublicAcl 公网访问控制列表
     */
    public void setEsPublicAcl(EsPublicAcl EsPublicAcl) {
        this.EsPublicAcl = EsPublicAcl;
    }

    /**
     * Get Kibana公网访问状态
OPEN 开启
CLOSE 关闭 
     * @return KibanaPublicAccess Kibana公网访问状态
OPEN 开启
CLOSE 关闭
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set Kibana公网访问状态
OPEN 开启
CLOSE 关闭
     * @param KibanaPublicAccess Kibana公网访问状态
OPEN 开启
CLOSE 关闭
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get Kibana内网访问状态
OPEN 开启
CLOSE 关闭 
     * @return KibanaPrivateAccess Kibana内网访问状态
OPEN 开启
CLOSE 关闭
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set Kibana内网访问状态
OPEN 开启
CLOSE 关闭
     * @param KibanaPrivateAccess Kibana内网访问状态
OPEN 开启
CLOSE 关闭
     */
    public void setKibanaPrivateAccess(String KibanaPrivateAccess) {
        this.KibanaPrivateAccess = KibanaPrivateAccess;
    }

    /**
     * Get ES 6.8及以上版本基础版开启或关闭用户认证 
     * @return BasicSecurityType ES 6.8及以上版本基础版开启或关闭用户认证
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set ES 6.8及以上版本基础版开启或关闭用户认证
     * @param BasicSecurityType ES 6.8及以上版本基础版开启或关闭用户认证
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get Kibana内网端口 
     * @return KibanaPrivatePort Kibana内网端口
     */
    public Long getKibanaPrivatePort() {
        return this.KibanaPrivatePort;
    }

    /**
     * Set Kibana内网端口
     * @param KibanaPrivatePort Kibana内网端口
     */
    public void setKibanaPrivatePort(Long KibanaPrivatePort) {
        this.KibanaPrivatePort = KibanaPrivatePort;
    }

    /**
     * Get 0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启 
     * @return ScaleType 0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启
     */
    public Long getScaleType() {
        return this.ScaleType;
    }

    /**
     * Set 0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启
     * @param ScaleType 0: 蓝绿变更方式扩容，集群不重启 （默认） 1: 磁盘解挂载扩容，集群滚动重启
     */
    public void setScaleType(Long ScaleType) {
        this.ScaleType = ScaleType;
    }

    /**
     * Get 多可用区部署 
     * @return MultiZoneInfo 多可用区部署
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set 多可用区部署
     * @param MultiZoneInfo 多可用区部署
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get 场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索 
     * @return SceneType 场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索
     * @param SceneType 场景化模板类型 -1：不启用 1：通用 2：日志 3：搜索
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get Kibana配置项（JSON格式字符串） 
     * @return KibanaConfig Kibana配置项（JSON格式字符串）
     */
    public String getKibanaConfig() {
        return this.KibanaConfig;
    }

    /**
     * Set Kibana配置项（JSON格式字符串）
     * @param KibanaConfig Kibana配置项（JSON格式字符串）
     */
    public void setKibanaConfig(String KibanaConfig) {
        this.KibanaConfig = KibanaConfig;
    }

    /**
     * Get 可视化节点配置 
     * @return WebNodeTypeInfo 可视化节点配置
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set 可视化节点配置
     * @param WebNodeTypeInfo 可视化节点配置
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get 切换到新网络架构 
     * @return SwitchPrivateLink 切换到新网络架构
     */
    public String getSwitchPrivateLink() {
        return this.SwitchPrivateLink;
    }

    /**
     * Set 切换到新网络架构
     * @param SwitchPrivateLink 切换到新网络架构
     */
    public void setSwitchPrivateLink(String SwitchPrivateLink) {
        this.SwitchPrivateLink = SwitchPrivateLink;
    }

    /**
     * Get 启用Cerebro 
     * @return EnableCerebro 启用Cerebro
     */
    public Boolean getEnableCerebro() {
        return this.EnableCerebro;
    }

    /**
     * Set 启用Cerebro
     * @param EnableCerebro 启用Cerebro
     */
    public void setEnableCerebro(Boolean EnableCerebro) {
        this.EnableCerebro = EnableCerebro;
    }

    /**
     * Get Cerebro公网访问状态
OPEN 开启
CLOSE 关闭 
     * @return CerebroPublicAccess Cerebro公网访问状态
OPEN 开启
CLOSE 关闭
     */
    public String getCerebroPublicAccess() {
        return this.CerebroPublicAccess;
    }

    /**
     * Set Cerebro公网访问状态
OPEN 开启
CLOSE 关闭
     * @param CerebroPublicAccess Cerebro公网访问状态
OPEN 开启
CLOSE 关闭
     */
    public void setCerebroPublicAccess(String CerebroPublicAccess) {
        this.CerebroPublicAccess = CerebroPublicAccess;
    }

    /**
     * Get Cerebro内网访问状态
OPEN 开启
CLOSE 关闭 
     * @return CerebroPrivateAccess Cerebro内网访问状态
OPEN 开启
CLOSE 关闭
     */
    public String getCerebroPrivateAccess() {
        return this.CerebroPrivateAccess;
    }

    /**
     * Set Cerebro内网访问状态
OPEN 开启
CLOSE 关闭
     * @param CerebroPrivateAccess Cerebro内网访问状态
OPEN 开启
CLOSE 关闭
     */
    public void setCerebroPrivateAccess(String CerebroPrivateAccess) {
        this.CerebroPrivateAccess = CerebroPrivateAccess;
    }

    /**
     * Get 新增或修改的配置组信息 
     * @return EsConfigSet 新增或修改的配置组信息
     */
    public EsConfigSetInfo getEsConfigSet() {
        return this.EsConfigSet;
    }

    /**
     * Set 新增或修改的配置组信息
     * @param EsConfigSet 新增或修改的配置组信息
     */
    public void setEsConfigSet(EsConfigSetInfo EsConfigSet) {
        this.EsConfigSet = EsConfigSet;
    }

    /**
     * Get 可维护时间段 
     * @return OperationDuration 可维护时间段
     */
    public OperationDurationUpdated getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set 可维护时间段
     * @param OperationDuration 可维护时间段
     */
    public void setOperationDuration(OperationDurationUpdated OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get 是否开启Alerting 外网告警输出：
OPEN 开启
CLOSE 关闭 
     * @return KibanaAlteringPublicAccess 是否开启Alerting 外网告警输出：
OPEN 开启
CLOSE 关闭
     */
    public String getKibanaAlteringPublicAccess() {
        return this.KibanaAlteringPublicAccess;
    }

    /**
     * Set 是否开启Alerting 外网告警输出：
OPEN 开启
CLOSE 关闭
     * @param KibanaAlteringPublicAccess 是否开启Alerting 外网告警输出：
OPEN 开启
CLOSE 关闭
     */
    public void setKibanaAlteringPublicAccess(String KibanaAlteringPublicAccess) {
        this.KibanaAlteringPublicAccess = KibanaAlteringPublicAccess;
    }

    /**
     * Get kibana内网自定义域名 
     * @return KibanaPrivateDomain kibana内网自定义域名
     */
    public String getKibanaPrivateDomain() {
        return this.KibanaPrivateDomain;
    }

    /**
     * Set kibana内网自定义域名
     * @param KibanaPrivateDomain kibana内网自定义域名
     */
    public void setKibanaPrivateDomain(String KibanaPrivateDomain) {
        this.KibanaPrivateDomain = KibanaPrivateDomain;
    }

    /**
     * Get cerebro内网自定义域名 
     * @return CerebroPrivateDomain cerebro内网自定义域名
     */
    public String getCerebroPrivateDomain() {
        return this.CerebroPrivateDomain;
    }

    /**
     * Set cerebro内网自定义域名
     * @param CerebroPrivateDomain cerebro内网自定义域名
     */
    public void setCerebroPrivateDomain(String CerebroPrivateDomain) {
        this.CerebroPrivateDomain = CerebroPrivateDomain;
    }

    /**
     * Get 变更为https集群，默认是http 
     * @return Protocol 变更为https集群，默认是http
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 变更为https集群，默认是http
     * @param Protocol 变更为https集群，默认是http
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 节点出站访问详细信息
 
     * @return OutboundPublicAcls 节点出站访问详细信息

     */
    public OutboundPublicAcl [] getOutboundPublicAcls() {
        return this.OutboundPublicAcls;
    }

    /**
     * Set 节点出站访问详细信息

     * @param OutboundPublicAcls 节点出站访问详细信息

     */
    public void setOutboundPublicAcls(OutboundPublicAcl [] OutboundPublicAcls) {
        this.OutboundPublicAcls = OutboundPublicAcls;
    }

    /**
     * Get 节点出站访问操作
OPEN 开启
CLOSE 关闭 
     * @return OutboundPublicAccess 节点出站访问操作
OPEN 开启
CLOSE 关闭
     */
    public String getOutboundPublicAccess() {
        return this.OutboundPublicAccess;
    }

    /**
     * Set 节点出站访问操作
OPEN 开启
CLOSE 关闭
     * @param OutboundPublicAccess 节点出站访问操作
OPEN 开启
CLOSE 关闭
     */
    public void setOutboundPublicAccess(String OutboundPublicAccess) {
        this.OutboundPublicAccess = OutboundPublicAccess;
    }

    /**
     * Get cvm延迟上架参数 
     * @return CvmDelayOnlineTime cvm延迟上架参数
     */
    public Long getCvmDelayOnlineTime() {
        return this.CvmDelayOnlineTime;
    }

    /**
     * Set cvm延迟上架参数
     * @param CvmDelayOnlineTime cvm延迟上架参数
     */
    public void setCvmDelayOnlineTime(Long CvmDelayOnlineTime) {
        this.CvmDelayOnlineTime = CvmDelayOnlineTime;
    }

    /**
     * Get 分片迁移并发数 
     * @return ShardAllocationConcurrents 分片迁移并发数
     */
    public Long getShardAllocationConcurrents() {
        return this.ShardAllocationConcurrents;
    }

    /**
     * Set 分片迁移并发数
     * @param ShardAllocationConcurrents 分片迁移并发数
     */
    public void setShardAllocationConcurrents(Long ShardAllocationConcurrents) {
        this.ShardAllocationConcurrents = ShardAllocationConcurrents;
    }

    /**
     * Get 分片迁移并发速度 
     * @return ShardAllocationBytes 分片迁移并发速度
     */
    public Long getShardAllocationBytes() {
        return this.ShardAllocationBytes;
    }

    /**
     * Set 分片迁移并发速度
     * @param ShardAllocationBytes 分片迁移并发速度
     */
    public void setShardAllocationBytes(Long ShardAllocationBytes) {
        this.ShardAllocationBytes = ShardAllocationBytes;
    }

    /**
     * Get 读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离 
     * @return ReadWriteMode 读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set 读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离
     * @param ReadWriteMode 读写分离模式：-1-不开启，1-本地读写分离，2-远端读写分离
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get 是否开启置放群组异步任务 
     * @return EnableScheduleRecoverGroup 是否开启置放群组异步任务
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set 是否开启置放群组异步任务
     * @param EnableScheduleRecoverGroup 是否开启置放群组异步任务
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get 置放群组异步任务可维护时间段 
     * @return EnableScheduleOperationDuration 置放群组异步任务可维护时间段
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set 置放群组异步任务可维护时间段
     * @param EnableScheduleOperationDuration 置放群组异步任务可维护时间段
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
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

    }
}

