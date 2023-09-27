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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceByApiRequest extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * 子网
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * 计费方式
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * 集群密码
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * 资源信息
    */
    @SerializedName("Resources")
    @Expose
    private ResourceSpecNew [] Resources;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag Tags;

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 私有网络 
     * @return UserVPCId 私有网络
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set 私有网络
     * @param UserVPCId 私有网络
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get 子网 
     * @return UserSubnetId 子网
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set 子网
     * @param UserSubnetId 子网
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
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
     * Get 集群密码 
     * @return AdminPassword 集群密码
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 集群密码
     * @param AdminPassword 集群密码
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get 资源信息 
     * @return Resources 资源信息
     */
    public ResourceSpecNew [] getResources() {
        return this.Resources;
    }

    /**
     * Set 资源信息
     * @param Resources 资源信息
     */
    public void setResources(ResourceSpecNew [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag Tags) {
        this.Tags = Tags;
    }

    public CreateInstanceByApiRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceByApiRequest(CreateInstanceByApiRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UserVPCId != null) {
            this.UserVPCId = new String(source.UserVPCId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceSpecNew[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceSpecNew(source.Resources[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UserVPCId", this.UserVPCId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "Tags.", this.Tags);

    }
}

