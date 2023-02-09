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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkConnection extends AbstractModel{

    /**
    * 网络配置id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 网络配置唯一标志符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateId")
    @Expose
    private String AssociateId;

    /**
    * 计算引擎id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HouseId")
    @Expose
    private String HouseId;

    /**
    * 数据源id(已废弃)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionId")
    @Expose
    private String DatasourceConnectionId;

    /**
    * 网络配置状态（0-初始化，1-正常）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 创建用户Appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 计算引擎名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HouseName")
    @Expose
    private String HouseName;

    /**
    * 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
    * 网络配置类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConnectionType")
    @Expose
    private Long NetworkConnectionType;

    /**
    * 创建用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 创建用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 网络配置描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkConnectionDesc")
    @Expose
    private String NetworkConnectionDesc;

    /**
    * 数据源vpcid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionVpcId")
    @Expose
    private String DatasourceConnectionVpcId;

    /**
    * 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionSubnetId")
    @Expose
    private String DatasourceConnectionSubnetId;

    /**
    * 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionCidrBlock")
    @Expose
    private String DatasourceConnectionCidrBlock;

    /**
    * 数据源SubnetCidrBlock
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceConnectionSubnetCidrBlock")
    @Expose
    private String DatasourceConnectionSubnetCidrBlock;

    /**
     * Get 网络配置id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 网络配置id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 网络配置id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 网络配置id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 网络配置唯一标志符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateId 网络配置唯一标志符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssociateId() {
        return this.AssociateId;
    }

    /**
     * Set 网络配置唯一标志符
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateId 网络配置唯一标志符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateId(String AssociateId) {
        this.AssociateId = AssociateId;
    }

    /**
     * Get 计算引擎id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HouseId 计算引擎id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHouseId() {
        return this.HouseId;
    }

    /**
     * Set 计算引擎id
注意：此字段可能返回 null，表示取不到有效值。
     * @param HouseId 计算引擎id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHouseId(String HouseId) {
        this.HouseId = HouseId;
    }

    /**
     * Get 数据源id(已废弃)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionId 数据源id(已废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionId() {
        return this.DatasourceConnectionId;
    }

    /**
     * Set 数据源id(已废弃)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionId 数据源id(已废弃)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionId(String DatasourceConnectionId) {
        this.DatasourceConnectionId = DatasourceConnectionId;
    }

    /**
     * Get 网络配置状态（0-初始化，1-正常）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 网络配置状态（0-初始化，1-正常）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 网络配置状态（0-初始化，1-正常）
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 网络配置状态（0-初始化，1-正常）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建用户Appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Appid 创建用户Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 创建用户Appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Appid 创建用户Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 计算引擎名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HouseName 计算引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHouseName() {
        return this.HouseName;
    }

    /**
     * Set 计算引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HouseName 计算引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    /**
     * Get 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionName 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionName 网络配置名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    /**
     * Get 网络配置类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConnectionType 网络配置类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetworkConnectionType() {
        return this.NetworkConnectionType;
    }

    /**
     * Set 网络配置类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConnectionType 网络配置类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConnectionType(Long NetworkConnectionType) {
        this.NetworkConnectionType = NetworkConnectionType;
    }

    /**
     * Get 创建用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 创建用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 创建用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 创建用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 创建用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 网络配置描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkConnectionDesc 网络配置描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkConnectionDesc() {
        return this.NetworkConnectionDesc;
    }

    /**
     * Set 网络配置描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkConnectionDesc 网络配置描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkConnectionDesc(String NetworkConnectionDesc) {
        this.NetworkConnectionDesc = NetworkConnectionDesc;
    }

    /**
     * Get 数据源vpcid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionVpcId 数据源vpcid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionVpcId() {
        return this.DatasourceConnectionVpcId;
    }

    /**
     * Set 数据源vpcid
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionVpcId 数据源vpcid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionVpcId(String DatasourceConnectionVpcId) {
        this.DatasourceConnectionVpcId = DatasourceConnectionVpcId;
    }

    /**
     * Get 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionSubnetId 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionSubnetId() {
        return this.DatasourceConnectionSubnetId;
    }

    /**
     * Set 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionSubnetId 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionSubnetId(String DatasourceConnectionSubnetId) {
        this.DatasourceConnectionSubnetId = DatasourceConnectionSubnetId;
    }

    /**
     * Get 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionCidrBlock 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionCidrBlock() {
        return this.DatasourceConnectionCidrBlock;
    }

    /**
     * Set 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionCidrBlock 数据源SubnetId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionCidrBlock(String DatasourceConnectionCidrBlock) {
        this.DatasourceConnectionCidrBlock = DatasourceConnectionCidrBlock;
    }

    /**
     * Get 数据源SubnetCidrBlock
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceConnectionSubnetCidrBlock 数据源SubnetCidrBlock
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceConnectionSubnetCidrBlock() {
        return this.DatasourceConnectionSubnetCidrBlock;
    }

    /**
     * Set 数据源SubnetCidrBlock
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceConnectionSubnetCidrBlock 数据源SubnetCidrBlock
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceConnectionSubnetCidrBlock(String DatasourceConnectionSubnetCidrBlock) {
        this.DatasourceConnectionSubnetCidrBlock = DatasourceConnectionSubnetCidrBlock;
    }

    public NetworkConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkConnection(NetworkConnection source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AssociateId != null) {
            this.AssociateId = new String(source.AssociateId);
        }
        if (source.HouseId != null) {
            this.HouseId = new String(source.HouseId);
        }
        if (source.DatasourceConnectionId != null) {
            this.DatasourceConnectionId = new String(source.DatasourceConnectionId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.HouseName != null) {
            this.HouseName = new String(source.HouseName);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
        if (source.NetworkConnectionType != null) {
            this.NetworkConnectionType = new Long(source.NetworkConnectionType);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.NetworkConnectionDesc != null) {
            this.NetworkConnectionDesc = new String(source.NetworkConnectionDesc);
        }
        if (source.DatasourceConnectionVpcId != null) {
            this.DatasourceConnectionVpcId = new String(source.DatasourceConnectionVpcId);
        }
        if (source.DatasourceConnectionSubnetId != null) {
            this.DatasourceConnectionSubnetId = new String(source.DatasourceConnectionSubnetId);
        }
        if (source.DatasourceConnectionCidrBlock != null) {
            this.DatasourceConnectionCidrBlock = new String(source.DatasourceConnectionCidrBlock);
        }
        if (source.DatasourceConnectionSubnetCidrBlock != null) {
            this.DatasourceConnectionSubnetCidrBlock = new String(source.DatasourceConnectionSubnetCidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AssociateId", this.AssociateId);
        this.setParamSimple(map, prefix + "HouseId", this.HouseId);
        this.setParamSimple(map, prefix + "DatasourceConnectionId", this.DatasourceConnectionId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "HouseName", this.HouseName);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);
        this.setParamSimple(map, prefix + "NetworkConnectionType", this.NetworkConnectionType);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "NetworkConnectionDesc", this.NetworkConnectionDesc);
        this.setParamSimple(map, prefix + "DatasourceConnectionVpcId", this.DatasourceConnectionVpcId);
        this.setParamSimple(map, prefix + "DatasourceConnectionSubnetId", this.DatasourceConnectionSubnetId);
        this.setParamSimple(map, prefix + "DatasourceConnectionCidrBlock", this.DatasourceConnectionCidrBlock);
        this.setParamSimple(map, prefix + "DatasourceConnectionSubnetCidrBlock", this.DatasourceConnectionSubnetCidrBlock);

    }
}

