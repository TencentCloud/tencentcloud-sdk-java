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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleInstanceInfo extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 集群Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 内核版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络
    */
    @SerializedName("UserVPCID")
    @Expose
    private String UserVPCID;

    /**
    * 子网
    */
    @SerializedName("UserSubnetID")
    @Expose
    private String UserSubnetID;

    /**
    * 开始时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 访问地址
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * 自动续费开关，0为不自动续费，1为自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 计费方式
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * 资源集合
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo [] Resources;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 集群状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get ID 
     * @return ID ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ID
     * @param ID ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 集群Id 
     * @return InstanceId 集群Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群Id
     * @param InstanceId 集群Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群名字 
     * @return InstanceName 集群名字
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 集群名字
     * @param InstanceName 集群名字
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 内核版本 
     * @return Version 内核版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 内核版本
     * @param Version 内核版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
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
     * Get 地区 
     * @return Zone 地区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地区
     * @param Zone 地区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 私有网络 
     * @return UserVPCID 私有网络
     */
    public String getUserVPCID() {
        return this.UserVPCID;
    }

    /**
     * Set 私有网络
     * @param UserVPCID 私有网络
     */
    public void setUserVPCID(String UserVPCID) {
        this.UserVPCID = UserVPCID;
    }

    /**
     * Get 子网 
     * @return UserSubnetID 子网
     */
    public String getUserSubnetID() {
        return this.UserSubnetID;
    }

    /**
     * Set 子网
     * @param UserSubnetID 子网
     */
    public void setUserSubnetID(String UserSubnetID) {
        this.UserSubnetID = UserSubnetID;
    }

    /**
     * Get 开始时间 
     * @return CreateTime 开始时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 开始时间
     * @param CreateTime 开始时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 到期时间 
     * @return ExpireTime 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
     * @param ExpireTime 到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 访问地址 
     * @return AccessInfo 访问地址
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 访问地址
     * @param AccessInfo 访问地址
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 自动续费开关，0为不自动续费，1为自动续费 
     * @return RenewFlag 自动续费开关，0为不自动续费，1为自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费开关，0为不自动续费，1为自动续费
     * @param RenewFlag 自动续费开关，0为不自动续费，1为自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 计费方式 
     * @return ChargeProperties 计费方式
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set 计费方式
     * @param ChargeProperties 计费方式
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get 资源集合 
     * @return Resources 资源集合
     */
    public ResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set 资源集合
     * @param Resources 资源集合
     */
    public void setResources(ResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 集群状态 
     * @return Status 集群状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
     * @param Status 集群状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SimpleInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleInstanceInfo(SimpleInstanceInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UserVPCID != null) {
            this.UserVPCID = new String(source.UserVPCID);
        }
        if (source.UserSubnetID != null) {
            this.UserSubnetID = new String(source.UserSubnetID);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceInfo(source.Resources[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UserVPCID", this.UserVPCID);
        this.setParamSimple(map, prefix + "UserSubnetID", this.UserSubnetID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

