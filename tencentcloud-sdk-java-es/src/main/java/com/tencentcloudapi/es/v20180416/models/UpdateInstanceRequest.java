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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceRequest extends AbstractModel{

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
    * 配置项（JSON格式字符串）。当前仅支持以下配置项：<li>action.destructive_requires_name</li><li>indices.fielddata.cache.size</li><li>indices.query.bool.max_clause_count</li>
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
    * 访问控制列表
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
    * 公网访问状态
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
    */
    @SerializedName("KibanaPublicAccess")
    @Expose
    private String KibanaPublicAccess;

    /**
    * Kibana内网访问状态
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
     * Get 配置项（JSON格式字符串）。当前仅支持以下配置项：<li>action.destructive_requires_name</li><li>indices.fielddata.cache.size</li><li>indices.query.bool.max_clause_count</li> 
     * @return EsConfig 配置项（JSON格式字符串）。当前仅支持以下配置项：<li>action.destructive_requires_name</li><li>indices.fielddata.cache.size</li><li>indices.query.bool.max_clause_count</li>
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * Set 配置项（JSON格式字符串）。当前仅支持以下配置项：<li>action.destructive_requires_name</li><li>indices.fielddata.cache.size</li><li>indices.query.bool.max_clause_count</li>
     * @param EsConfig 配置项（JSON格式字符串）。当前仅支持以下配置项：<li>action.destructive_requires_name</li><li>indices.fielddata.cache.size</li><li>indices.query.bool.max_clause_count</li>
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
     * Get 访问控制列表 
     * @return EsAcl 访问控制列表
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * Set 访问控制列表
     * @param EsAcl 访问控制列表
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
     * Get 公网访问状态 
     * @return PublicAccess 公网访问状态
     */
    public String getPublicAccess() {
        return this.PublicAccess;
    }

    /**
     * Set 公网访问状态
     * @param PublicAccess 公网访问状态
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
     * @return KibanaPublicAccess Kibana公网访问状态
     */
    public String getKibanaPublicAccess() {
        return this.KibanaPublicAccess;
    }

    /**
     * Set Kibana公网访问状态
     * @param KibanaPublicAccess Kibana公网访问状态
     */
    public void setKibanaPublicAccess(String KibanaPublicAccess) {
        this.KibanaPublicAccess = KibanaPublicAccess;
    }

    /**
     * Get Kibana内网访问状态 
     * @return KibanaPrivateAccess Kibana内网访问状态
     */
    public String getKibanaPrivateAccess() {
        return this.KibanaPrivateAccess;
    }

    /**
     * Set Kibana内网访问状态
     * @param KibanaPrivateAccess Kibana内网访问状态
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

    }
}

