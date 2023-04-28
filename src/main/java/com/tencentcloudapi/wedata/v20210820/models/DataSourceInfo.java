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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceInfo extends AbstractModel{

    /**
    * 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 数据源名称，在相同SpaceName下，数据源名称不能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 应用ID AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 业务侧数据源的配置信息扩展
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParams")
    @Expose
    private String BizParams;

    /**
    * 数据源类别：绑定引擎、绑定数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Display")
    @Expose
    private String Display;

    /**
    * 数据源责任人账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 数据源责任人账号名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerProjectId")
    @Expose
    private String OwnerProjectId;

    /**
    * 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerProjectName")
    @Expose
    private String OwnerProjectName;

    /**
    * 归属项目标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerProjectIdent")
    @Expose
    private String OwnerProjectIdent;

    /**
    * 授权项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorityProjectName")
    @Expose
    private String AuthorityProjectName;

    /**
    * 授权用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorityUserName")
    @Expose
    private String AuthorityUserName;

    /**
    * 是否有编辑权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Edit")
    @Expose
    private Boolean Edit;

    /**
    * 是否有授权权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Author")
    @Expose
    private Boolean Author;

    /**
    * 是否有转交权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deliver")
    @Expose
    private Boolean Deliver;

    /**
    * 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceStatus")
    @Expose
    private String DataSourceStatus;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Params json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamsString")
    @Expose
    private String ParamsString;

    /**
    * BizParams json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParamsString")
    @Expose
    private String BizParamsString;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
     * Get 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 数据源名称，在相同SpaceName下，数据源名称不能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 数据源名称，在相同SpaceName下，数据源名称不能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称，在相同SpaceName下，数据源名称不能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 数据源名称，在相同SpaceName下，数据源名称不能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 应用ID AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 应用ID AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 应用ID AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 业务侧数据源的配置信息扩展
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParams 业务侧数据源的配置信息扩展
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 业务侧数据源的配置信息扩展
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParams 业务侧数据源的配置信息扩展
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParams(String BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 数据源类别：绑定引擎、绑定数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 数据源类别：绑定引擎、绑定数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 数据源类别：绑定引擎、绑定数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 数据源类别：绑定引擎、绑定数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Display 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplay() {
        return this.Display;
    }

    /**
     * Set 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
     * @param Display 数据源展示名，为了可视化查看
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplay(String Display) {
        this.Display = Display;
    }

    /**
     * Get 数据源责任人账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccount 数据源责任人账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 数据源责任人账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccount 数据源责任人账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 数据源责任人账号名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccountName 数据源责任人账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set 数据源责任人账号名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccountName 数据源责任人账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerProjectId 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerProjectId() {
        return this.OwnerProjectId;
    }

    /**
     * Set 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerProjectId 归属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerProjectId(String OwnerProjectId) {
        this.OwnerProjectId = OwnerProjectId;
    }

    /**
     * Get 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerProjectName 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerProjectName() {
        return this.OwnerProjectName;
    }

    /**
     * Set 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerProjectName 归属项目Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerProjectName(String OwnerProjectName) {
        this.OwnerProjectName = OwnerProjectName;
    }

    /**
     * Get 归属项目标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerProjectIdent 归属项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerProjectIdent() {
        return this.OwnerProjectIdent;
    }

    /**
     * Set 归属项目标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerProjectIdent 归属项目标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerProjectIdent(String OwnerProjectIdent) {
        this.OwnerProjectIdent = OwnerProjectIdent;
    }

    /**
     * Get 授权项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorityProjectName 授权项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorityProjectName() {
        return this.AuthorityProjectName;
    }

    /**
     * Set 授权项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorityProjectName 授权项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorityProjectName(String AuthorityProjectName) {
        this.AuthorityProjectName = AuthorityProjectName;
    }

    /**
     * Get 授权用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorityUserName 授权用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorityUserName() {
        return this.AuthorityUserName;
    }

    /**
     * Set 授权用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorityUserName 授权用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorityUserName(String AuthorityUserName) {
        this.AuthorityUserName = AuthorityUserName;
    }

    /**
     * Get 是否有编辑权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Edit 是否有编辑权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEdit() {
        return this.Edit;
    }

    /**
     * Set 是否有编辑权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Edit 是否有编辑权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdit(Boolean Edit) {
        this.Edit = Edit;
    }

    /**
     * Get 是否有授权权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Author 是否有授权权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAuthor() {
        return this.Author;
    }

    /**
     * Set 是否有授权权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Author 是否有授权权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthor(Boolean Author) {
        this.Author = Author;
    }

    /**
     * Get 是否有转交权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deliver 是否有转交权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeliver() {
        return this.Deliver;
    }

    /**
     * Set 是否有转交权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deliver 是否有转交权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliver(Boolean Deliver) {
        this.Deliver = Deliver;
    }

    /**
     * Get 数据源状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceStatus 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceStatus() {
        return this.DataSourceStatus;
    }

    /**
     * Set 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceStatus 数据源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceStatus(String DataSourceStatus) {
        this.DataSourceStatus = DataSourceStatus;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Params json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamsString Params json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamsString() {
        return this.ParamsString;
    }

    /**
     * Set Params json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamsString Params json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamsString(String ParamsString) {
        this.ParamsString = ParamsString;
    }

    /**
     * Get BizParams json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParamsString BizParams json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizParamsString() {
        return this.BizParamsString;
    }

    /**
     * Set BizParams json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParamsString BizParams json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParamsString(String BizParamsString) {
        this.BizParamsString = BizParamsString;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public DataSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceInfo(DataSourceInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BizParams != null) {
            this.BizParams = new String(source.BizParams);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Display != null) {
            this.Display = new String(source.Display);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.OwnerProjectId != null) {
            this.OwnerProjectId = new String(source.OwnerProjectId);
        }
        if (source.OwnerProjectName != null) {
            this.OwnerProjectName = new String(source.OwnerProjectName);
        }
        if (source.OwnerProjectIdent != null) {
            this.OwnerProjectIdent = new String(source.OwnerProjectIdent);
        }
        if (source.AuthorityProjectName != null) {
            this.AuthorityProjectName = new String(source.AuthorityProjectName);
        }
        if (source.AuthorityUserName != null) {
            this.AuthorityUserName = new String(source.AuthorityUserName);
        }
        if (source.Edit != null) {
            this.Edit = new Boolean(source.Edit);
        }
        if (source.Author != null) {
            this.Author = new Boolean(source.Author);
        }
        if (source.Deliver != null) {
            this.Deliver = new Boolean(source.Deliver);
        }
        if (source.DataSourceStatus != null) {
            this.DataSourceStatus = new String(source.DataSourceStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ParamsString != null) {
            this.ParamsString = new String(source.ParamsString);
        }
        if (source.BizParamsString != null) {
            this.BizParamsString = new String(source.BizParamsString);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BizParams", this.BizParams);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Display", this.Display);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "OwnerProjectId", this.OwnerProjectId);
        this.setParamSimple(map, prefix + "OwnerProjectName", this.OwnerProjectName);
        this.setParamSimple(map, prefix + "OwnerProjectIdent", this.OwnerProjectIdent);
        this.setParamSimple(map, prefix + "AuthorityProjectName", this.AuthorityProjectName);
        this.setParamSimple(map, prefix + "AuthorityUserName", this.AuthorityUserName);
        this.setParamSimple(map, prefix + "Edit", this.Edit);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Deliver", this.Deliver);
        this.setParamSimple(map, prefix + "DataSourceStatus", this.DataSourceStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ParamsString", this.ParamsString);
        this.setParamSimple(map, prefix + "BizParamsString", this.BizParamsString);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

