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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceConnectionInfo extends AbstractModel {

    /**
    * 数据源数字Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据源字符串Id
    */
    @SerializedName("DatasourceConnectionId")
    @Expose
    private String DatasourceConnectionId;

    /**
    * 数据源名称
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 数据源描述
    */
    @SerializedName("DatasourceConnectionDesc")
    @Expose
    private String DatasourceConnectionDesc;

    /**
    * 数据源类型，支持DataLakeCatalog、IcebergCatalog、Result、Mysql、HiveCos、HiveHdfs
    */
    @SerializedName("DatasourceConnectionType")
    @Expose
    private String DatasourceConnectionType;

    /**
    * 数据源属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionConfig")
    @Expose
    private DatasourceConnectionConfig DatasourceConnectionConfig;

    /**
    * 数据源状态：0（初始化）、1（成功）、-1（已删除）、-2（失败）、-3（删除中）
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 数据源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据源最近一次更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 数据源同步失败原因
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 数据源绑定的计算引擎信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngines")
    @Expose
    private DataEngineInfo [] DataEngines;

    /**
    * 创建人
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * 网络配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConnectionSet")
    @Expose
    private NetworkConnection [] NetworkConnectionSet;

    /**
    * 连通性状态：0（未测试，默认）、1（正常）、2（失败）
    */
    @SerializedName("ConnectivityState")
    @Expose
    private Long ConnectivityState;

    /**
    * 连通性测试提示信息
    */
    @SerializedName("ConnectivityTips")
    @Expose
    private String ConnectivityTips;

    /**
    * 自定义参数
    */
    @SerializedName("CustomConfig")
    @Expose
    private CustomConfig [] CustomConfig;

    /**
    * 是否允许回退
    */
    @SerializedName("AllowRollback")
    @Expose
    private Boolean AllowRollback;

    /**
     * Get 数据源数字Id 
     * @return Id 数据源数字Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据源数字Id
     * @param Id 数据源数字Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源字符串Id 
     * @return DatasourceConnectionId 数据源字符串Id
     */
    public String getDatasourceConnectionId() {
        return this.DatasourceConnectionId;
    }

    /**
     * Set 数据源字符串Id
     * @param DatasourceConnectionId 数据源字符串Id
     */
    public void setDatasourceConnectionId(String DatasourceConnectionId) {
        this.DatasourceConnectionId = DatasourceConnectionId;
    }

    /**
     * Get 数据源名称 
     * @return DatasourceConnectionName 数据源名称
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称
     * @param DatasourceConnectionName 数据源名称
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 数据源描述 
     * @return DatasourceConnectionDesc 数据源描述
     */
    public String getDatasourceConnectionDesc() {
        return this.DatasourceConnectionDesc;
    }

    /**
     * Set 数据源描述
     * @param DatasourceConnectionDesc 数据源描述
     */
    public void setDatasourceConnectionDesc(String DatasourceConnectionDesc) {
        this.DatasourceConnectionDesc = DatasourceConnectionDesc;
    }

    /**
     * Get 数据源类型，支持DataLakeCatalog、IcebergCatalog、Result、Mysql、HiveCos、HiveHdfs 
     * @return DatasourceConnectionType 数据源类型，支持DataLakeCatalog、IcebergCatalog、Result、Mysql、HiveCos、HiveHdfs
     */
    public String getDatasourceConnectionType() {
        return this.DatasourceConnectionType;
    }

    /**
     * Set 数据源类型，支持DataLakeCatalog、IcebergCatalog、Result、Mysql、HiveCos、HiveHdfs
     * @param DatasourceConnectionType 数据源类型，支持DataLakeCatalog、IcebergCatalog、Result、Mysql、HiveCos、HiveHdfs
     */
    public void setDatasourceConnectionType(String DatasourceConnectionType) {
        this.DatasourceConnectionType = DatasourceConnectionType;
    }

    /**
     * Get 数据源属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionConfig 数据源属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatasourceConnectionConfig getDatasourceConnectionConfig() {
        return this.DatasourceConnectionConfig;
    }

    /**
     * Set 数据源属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionConfig 数据源属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionConfig(DatasourceConnectionConfig DatasourceConnectionConfig) {
        this.DatasourceConnectionConfig = DatasourceConnectionConfig;
    }

    /**
     * Get 数据源状态：0（初始化）、1（成功）、-1（已删除）、-2（失败）、-3（删除中） 
     * @return State 数据源状态：0（初始化）、1（成功）、-1（已删除）、-2（失败）、-3（删除中）
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 数据源状态：0（初始化）、1（成功）、-1（已删除）、-2（失败）、-3（删除中）
     * @param State 数据源状态：0（初始化）、1（成功）、-1（已删除）、-2（失败）、-3（删除中）
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 数据源创建时间 
     * @return CreateTime 数据源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 数据源创建时间
     * @param CreateTime 数据源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据源最近一次更新时间 
     * @return UpdateTime 数据源最近一次更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据源最近一次更新时间
     * @param UpdateTime 数据源最近一次更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 数据源同步失败原因 
     * @return Message 数据源同步失败原因
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 数据源同步失败原因
     * @param Message 数据源同步失败原因
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 数据源绑定的计算引擎信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngines 数据源绑定的计算引擎信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataEngineInfo [] getDataEngines() {
        return this.DataEngines;
    }

    /**
     * Set 数据源绑定的计算引擎信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngines 数据源绑定的计算引擎信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngines(DataEngineInfo [] DataEngines) {
        this.DataEngines = DataEngines;
    }

    /**
     * Get 创建人 
     * @return UserAlias 创建人
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 创建人
     * @param UserAlias 创建人
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get 网络配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConnectionSet 网络配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkConnection [] getNetworkConnectionSet() {
        return this.NetworkConnectionSet;
    }

    /**
     * Set 网络配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConnectionSet 网络配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConnectionSet(NetworkConnection [] NetworkConnectionSet) {
        this.NetworkConnectionSet = NetworkConnectionSet;
    }

    /**
     * Get 连通性状态：0（未测试，默认）、1（正常）、2（失败） 
     * @return ConnectivityState 连通性状态：0（未测试，默认）、1（正常）、2（失败）
     */
    public Long getConnectivityState() {
        return this.ConnectivityState;
    }

    /**
     * Set 连通性状态：0（未测试，默认）、1（正常）、2（失败）
     * @param ConnectivityState 连通性状态：0（未测试，默认）、1（正常）、2（失败）
     */
    public void setConnectivityState(Long ConnectivityState) {
        this.ConnectivityState = ConnectivityState;
    }

    /**
     * Get 连通性测试提示信息 
     * @return ConnectivityTips 连通性测试提示信息
     */
    public String getConnectivityTips() {
        return this.ConnectivityTips;
    }

    /**
     * Set 连通性测试提示信息
     * @param ConnectivityTips 连通性测试提示信息
     */
    public void setConnectivityTips(String ConnectivityTips) {
        this.ConnectivityTips = ConnectivityTips;
    }

    /**
     * Get 自定义参数 
     * @return CustomConfig 自定义参数
     */
    public CustomConfig [] getCustomConfig() {
        return this.CustomConfig;
    }

    /**
     * Set 自定义参数
     * @param CustomConfig 自定义参数
     */
    public void setCustomConfig(CustomConfig [] CustomConfig) {
        this.CustomConfig = CustomConfig;
    }

    /**
     * Get 是否允许回退 
     * @return AllowRollback 是否允许回退
     */
    public Boolean getAllowRollback() {
        return this.AllowRollback;
    }

    /**
     * Set 是否允许回退
     * @param AllowRollback 是否允许回退
     */
    public void setAllowRollback(Boolean AllowRollback) {
        this.AllowRollback = AllowRollback;
    }

    public DatasourceConnectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceConnectionInfo(DatasourceConnectionInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DatasourceConnectionId != null) {
            this.DatasourceConnectionId = new String(source.DatasourceConnectionId);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.DatasourceConnectionDesc != null) {
            this.DatasourceConnectionDesc = new String(source.DatasourceConnectionDesc);
        }
        if (source.DatasourceConnectionType != null) {
            this.DatasourceConnectionType = new String(source.DatasourceConnectionType);
        }
        if (source.DatasourceConnectionConfig != null) {
            this.DatasourceConnectionConfig = new DatasourceConnectionConfig(source.DatasourceConnectionConfig);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.DataEngines != null) {
            this.DataEngines = new DataEngineInfo[source.DataEngines.length];
            for (int i = 0; i < source.DataEngines.length; i++) {
                this.DataEngines[i] = new DataEngineInfo(source.DataEngines[i]);
            }
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.NetworkConnectionSet != null) {
            this.NetworkConnectionSet = new NetworkConnection[source.NetworkConnectionSet.length];
            for (int i = 0; i < source.NetworkConnectionSet.length; i++) {
                this.NetworkConnectionSet[i] = new NetworkConnection(source.NetworkConnectionSet[i]);
            }
        }
        if (source.ConnectivityState != null) {
            this.ConnectivityState = new Long(source.ConnectivityState);
        }
        if (source.ConnectivityTips != null) {
            this.ConnectivityTips = new String(source.ConnectivityTips);
        }
        if (source.CustomConfig != null) {
            this.CustomConfig = new CustomConfig[source.CustomConfig.length];
            for (int i = 0; i < source.CustomConfig.length; i++) {
                this.CustomConfig[i] = new CustomConfig(source.CustomConfig[i]);
            }
        }
        if (source.AllowRollback != null) {
            this.AllowRollback = new Boolean(source.AllowRollback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DatasourceConnectionId", this.DatasourceConnectionId);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "DatasourceConnectionDesc", this.DatasourceConnectionDesc);
        this.setParamSimple(map, prefix + "DatasourceConnectionType", this.DatasourceConnectionType);
        this.setParamObj(map, prefix + "DatasourceConnectionConfig.", this.DatasourceConnectionConfig);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "DataEngines.", this.DataEngines);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamArrayObj(map, prefix + "NetworkConnectionSet.", this.NetworkConnectionSet);
        this.setParamSimple(map, prefix + "ConnectivityState", this.ConnectivityState);
        this.setParamSimple(map, prefix + "ConnectivityTips", this.ConnectivityTips);
        this.setParamArrayObj(map, prefix + "CustomConfig.", this.CustomConfig);
        this.setParamSimple(map, prefix + "AllowRollback", this.AllowRollback);

    }
}

