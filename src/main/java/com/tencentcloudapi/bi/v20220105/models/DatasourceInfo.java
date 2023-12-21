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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceInfo extends AbstractModel {

    /**
    * 数据库ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 域类型，1、腾讯云，2、本地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 数据库别名
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 数据库驱动
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * HOST
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * 端口
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * 用户名
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * 数据库编码
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedUser")
    @Expose
    private String CreatedUser;

    /**
    * catalog值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 连接类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectType")
    @Expose
    private String ConnectType;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 来源平台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourcePlat")
    @Expose
    private String SourcePlat;

    /**
    * 扩展参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddInfo")
    @Expose
    private String AddInfo;

    /**
    * 项目名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 数据源负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manager")
    @Expose
    private String Manager;

    /**
    * 特定操作人员白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorWhitelist")
    @Expose
    private String OperatorWhitelist;

    /**
    * 数据源的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 数据源的uniqVpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 数据源的地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 操作属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateAction")
    @Expose
    private BaseStateAction StateAction;

    /**
    * 更新人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedUser")
    @Expose
    private String UpdatedUser;

    /**
    * 权限列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermissionList")
    @Expose
    private PermissionGroup [] PermissionList;

    /**
    * 权限值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthList")
    @Expose
    private String [] AuthList;

    /**
    * 第三方数据源标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataOrigin")
    @Expose
    private String DataOrigin;

    /**
    * 第三方项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataOriginProjectId")
    @Expose
    private String DataOriginProjectId;

    /**
    * 第三方数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataOriginDatasourceId")
    @Expose
    private String DataOriginDatasourceId;

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 数据库ID 
     * @return Id 数据库ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据库ID
     * @param Id 数据库ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 域类型，1、腾讯云，2、本地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 域类型，1、腾讯云，2、本地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 域类型，1、腾讯云，2、本地
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 域类型，1、腾讯云，2、本地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 数据库别名 
     * @return SourceName 数据库别名
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 数据库别名
     * @param SourceName 数据库别名
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 数据库驱动 
     * @return DbType 数据库驱动
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库驱动
     * @param DbType 数据库驱动
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get HOST 
     * @return DbHost HOST
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set HOST
     * @param DbHost HOST
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get 端口 
     * @return DbPort 端口
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set 端口
     * @param DbPort 端口
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get 用户名 
     * @return DbUser 用户名
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set 用户名
     * @param DbUser 用户名
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get 数据库编码 
     * @return Charset 数据库编码
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 数据库编码
     * @param Charset 数据库编码
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 修改时间 
     * @return UpdatedAt 修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 修改时间
     * @param UpdatedAt 修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedUser() {
        return this.CreatedUser;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedUser 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedUser(String CreatedUser) {
        this.CreatedUser = CreatedUser;
    }

    /**
     * Get catalog值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog catalog值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog catalog值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 连接类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectType 连接类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectType() {
        return this.ConnectType;
    }

    /**
     * Set 连接类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectType 连接类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectType(String ConnectType) {
        this.ConnectType = ConnectType;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 数据源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 数据源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 数据源状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 来源平台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourcePlat 来源平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourcePlat() {
        return this.SourcePlat;
    }

    /**
     * Set 来源平台
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourcePlat 来源平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourcePlat(String SourcePlat) {
        this.SourcePlat = SourcePlat;
    }

    /**
     * Get 扩展参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraParam 扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraParam 扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get 额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddInfo 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddInfo() {
        return this.AddInfo;
    }

    /**
     * Set 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddInfo 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddInfo(String AddInfo) {
        this.AddInfo = AddInfo;
    }

    /**
     * Get 项目名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 引擎类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 数据源负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manager 数据源负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManager() {
        return this.Manager;
    }

    /**
     * Set 数据源负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manager 数据源负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    /**
     * Get 特定操作人员白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorWhitelist 特定操作人员白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorWhitelist() {
        return this.OperatorWhitelist;
    }

    /**
     * Set 特定操作人员白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorWhitelist 特定操作人员白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorWhitelist(String OperatorWhitelist) {
        this.OperatorWhitelist = OperatorWhitelist;
    }

    /**
     * Get 数据源的vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 数据源的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 数据源的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 数据源的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 数据源的uniqVpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId 数据源的uniqVpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 数据源的uniqVpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId 数据源的uniqVpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 数据源的地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 数据源的地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 数据源的地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 数据源的地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 操作属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateAction 操作属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseStateAction getStateAction() {
        return this.StateAction;
    }

    /**
     * Set 操作属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateAction 操作属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateAction(BaseStateAction StateAction) {
        this.StateAction = StateAction;
    }

    /**
     * Get 更新人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedUser() {
        return this.UpdatedUser;
    }

    /**
     * Set 更新人
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedUser 更新人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedUser(String UpdatedUser) {
        this.UpdatedUser = UpdatedUser;
    }

    /**
     * Get 权限列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermissionList 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PermissionGroup [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermissionList 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissionList(PermissionGroup [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    /**
     * Get 权限值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthList 权限值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAuthList() {
        return this.AuthList;
    }

    /**
     * Set 权限值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthList 权限值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthList(String [] AuthList) {
        this.AuthList = AuthList;
    }

    /**
     * Get 第三方数据源标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataOrigin 第三方数据源标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataOrigin() {
        return this.DataOrigin;
    }

    /**
     * Set 第三方数据源标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataOrigin 第三方数据源标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataOrigin(String DataOrigin) {
        this.DataOrigin = DataOrigin;
    }

    /**
     * Get 第三方项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataOriginProjectId 第三方项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataOriginProjectId() {
        return this.DataOriginProjectId;
    }

    /**
     * Set 第三方项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataOriginProjectId 第三方项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataOriginProjectId(String DataOriginProjectId) {
        this.DataOriginProjectId = DataOriginProjectId;
    }

    /**
     * Get 第三方数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataOriginDatasourceId 第三方数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataOriginDatasourceId() {
        return this.DataOriginDatasourceId;
    }

    /**
     * Set 第三方数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataOriginDatasourceId 第三方数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataOriginDatasourceId(String DataOriginDatasourceId) {
        this.DataOriginDatasourceId = DataOriginDatasourceId;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DatasourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceInfo(DatasourceInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.DbUser != null) {
            this.DbUser = new String(source.DbUser);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.CreatedUser != null) {
            this.CreatedUser = new String(source.CreatedUser);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.ConnectType != null) {
            this.ConnectType = new String(source.ConnectType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourcePlat != null) {
            this.SourcePlat = new String(source.SourcePlat);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.AddInfo != null) {
            this.AddInfo = new String(source.AddInfo);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Manager != null) {
            this.Manager = new String(source.Manager);
        }
        if (source.OperatorWhitelist != null) {
            this.OperatorWhitelist = new String(source.OperatorWhitelist);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.StateAction != null) {
            this.StateAction = new BaseStateAction(source.StateAction);
        }
        if (source.UpdatedUser != null) {
            this.UpdatedUser = new String(source.UpdatedUser);
        }
        if (source.PermissionList != null) {
            this.PermissionList = new PermissionGroup[source.PermissionList.length];
            for (int i = 0; i < source.PermissionList.length; i++) {
                this.PermissionList[i] = new PermissionGroup(source.PermissionList[i]);
            }
        }
        if (source.AuthList != null) {
            this.AuthList = new String[source.AuthList.length];
            for (int i = 0; i < source.AuthList.length; i++) {
                this.AuthList[i] = new String(source.AuthList[i]);
            }
        }
        if (source.DataOrigin != null) {
            this.DataOrigin = new String(source.DataOrigin);
        }
        if (source.DataOriginProjectId != null) {
            this.DataOriginProjectId = new String(source.DataOriginProjectId);
        }
        if (source.DataOriginDatasourceId != null) {
            this.DataOriginDatasourceId = new String(source.DataOriginDatasourceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "CreatedUser", this.CreatedUser);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "ConnectType", this.ConnectType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourcePlat", this.SourcePlat);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "AddInfo", this.AddInfo);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Manager", this.Manager);
        this.setParamSimple(map, prefix + "OperatorWhitelist", this.OperatorWhitelist);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamObj(map, prefix + "StateAction.", this.StateAction);
        this.setParamSimple(map, prefix + "UpdatedUser", this.UpdatedUser);
        this.setParamArrayObj(map, prefix + "PermissionList.", this.PermissionList);
        this.setParamArraySimple(map, prefix + "AuthList.", this.AuthList);
        this.setParamSimple(map, prefix + "DataOrigin", this.DataOrigin);
        this.setParamSimple(map, prefix + "DataOriginProjectId", this.DataOriginProjectId);
        this.setParamSimple(map, prefix + "DataOriginDatasourceId", this.DataOriginDatasourceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

