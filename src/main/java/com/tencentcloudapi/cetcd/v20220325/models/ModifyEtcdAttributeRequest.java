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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEtcdAttributeRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * root账号密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 同步auth状态
    */
    @SerializedName("EnableAuth")
    @Expose
    private Boolean EnableAuth;

    /**
    * 删除集群关联的cos数据
    */
    @SerializedName("EnableDeleteCos")
    @Expose
    private Boolean EnableDeleteCos;

    /**
    * 子网id，数组
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return Name 实例名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名
     * @param Name 实例名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例描述 
     * @return Description 实例描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 实例描述
     * @param Description 实例描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get root账号密码 
     * @return Password root账号密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set root账号密码
     * @param Password root账号密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 同步auth状态 
     * @return EnableAuth 同步auth状态
     */
    public Boolean getEnableAuth() {
        return this.EnableAuth;
    }

    /**
     * Set 同步auth状态
     * @param EnableAuth 同步auth状态
     */
    public void setEnableAuth(Boolean EnableAuth) {
        this.EnableAuth = EnableAuth;
    }

    /**
     * Get 删除集群关联的cos数据 
     * @return EnableDeleteCos 删除集群关联的cos数据
     */
    public Boolean getEnableDeleteCos() {
        return this.EnableDeleteCos;
    }

    /**
     * Set 删除集群关联的cos数据
     * @param EnableDeleteCos 删除集群关联的cos数据
     */
    public void setEnableDeleteCos(Boolean EnableDeleteCos) {
        this.EnableDeleteCos = EnableDeleteCos;
    }

    /**
     * Get 子网id，数组 
     * @return SubnetIds 子网id，数组
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网id，数组
     * @param SubnetIds 子网id，数组
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    public ModifyEtcdAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEtcdAttributeRequest(ModifyEtcdAttributeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EnableAuth != null) {
            this.EnableAuth = new Boolean(source.EnableAuth);
        }
        if (source.EnableDeleteCos != null) {
            this.EnableDeleteCos = new Boolean(source.EnableDeleteCos);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EnableAuth", this.EnableAuth);
        this.setParamSimple(map, prefix + "EnableDeleteCos", this.EnableDeleteCos);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);

    }
}

