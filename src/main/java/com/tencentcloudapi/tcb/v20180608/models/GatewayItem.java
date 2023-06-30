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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayItem extends AbstractModel{

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 环境id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Gateway唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * Gateway类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Gateway描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayDesc")
    @Expose
    private String GatewayDesc;

    /**
    * 套餐版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 套餐唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private Long PackageId;

    /**
    * vpc唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 网关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * l5地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("L5Addr")
    @Expose
    private String L5Addr;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 变更时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 允许未登录访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowUncertified")
    @Expose
    private Long AllowUncertified;

    /**
    * 网关版本限额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionNumLimit")
    @Expose
    private Long VersionNumLimit;

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 环境id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Gateway唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId Gateway唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId Gateway唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayName Gateway名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set Gateway名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayName Gateway名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get Gateway类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayType Gateway类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayType Gateway类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Gateway描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayDesc Gateway描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayDesc() {
        return this.GatewayDesc;
    }

    /**
     * Set Gateway描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayDesc Gateway描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayDesc(String GatewayDesc) {
        this.GatewayDesc = GatewayDesc;
    }

    /**
     * Get 套餐版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion 套餐版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 套餐版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion 套餐版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 套餐唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 套餐唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 套餐唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 套餐唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(Long PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get vpc唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 网关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 网关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 网关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 网关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get l5地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return L5Addr l5地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getL5Addr() {
        return this.L5Addr;
    }

    /**
     * Set l5地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param L5Addr l5地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setL5Addr(String L5Addr) {
        this.L5Addr = L5Addr;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 隔离时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 变更时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 变更时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 允许未登录访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowUncertified 允许未登录访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllowUncertified() {
        return this.AllowUncertified;
    }

    /**
     * Set 允许未登录访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowUncertified 允许未登录访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowUncertified(Long AllowUncertified) {
        this.AllowUncertified = AllowUncertified;
    }

    /**
     * Get 网关版本限额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionNumLimit 网关版本限额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionNumLimit() {
        return this.VersionNumLimit;
    }

    /**
     * Set 网关版本限额
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionNumLimit 网关版本限额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionNumLimit(Long VersionNumLimit) {
        this.VersionNumLimit = VersionNumLimit;
    }

    public GatewayItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayItem(GatewayItem source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayDesc != null) {
            this.GatewayDesc = new String(source.GatewayDesc);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.PackageId != null) {
            this.PackageId = new Long(source.PackageId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.L5Addr != null) {
            this.L5Addr = new String(source.L5Addr);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AllowUncertified != null) {
            this.AllowUncertified = new Long(source.AllowUncertified);
        }
        if (source.VersionNumLimit != null) {
            this.VersionNumLimit = new Long(source.VersionNumLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayDesc", this.GatewayDesc);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "L5Addr", this.L5Addr);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AllowUncertified", this.AllowUncertified);
        this.setParamSimple(map, prefix + "VersionNumLimit", this.VersionNumLimit);

    }
}

