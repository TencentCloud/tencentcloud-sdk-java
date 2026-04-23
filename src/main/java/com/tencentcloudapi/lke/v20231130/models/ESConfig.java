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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESConfig extends AbstractModel {

    /**
    * <p>存储类型，0: 未知类型， 1:默认存储(平台提供)，2: 自定义存储(用户自建ES)</p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>ES集群名称(自定义存储时必填)</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>ES集群ID(自定义存储时必填)</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>ES用户名(自定义存储时必填)</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>ES密码(自定义存储时必填)</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>允许修改存储方式</p>
    */
    @SerializedName("CanModify")
    @Expose
    private Boolean CanModify;

    /**
     * Get <p>存储类型，0: 未知类型， 1:默认存储(平台提供)，2: 自定义存储(用户自建ES)</p> 
     * @return StorageType <p>存储类型，0: 未知类型， 1:默认存储(平台提供)，2: 自定义存储(用户自建ES)</p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型，0: 未知类型， 1:默认存储(平台提供)，2: 自定义存储(用户自建ES)</p>
     * @param StorageType <p>存储类型，0: 未知类型， 1:默认存储(平台提供)，2: 自定义存储(用户自建ES)</p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>ES集群名称(自定义存储时必填)</p> 
     * @return InstanceName <p>ES集群名称(自定义存储时必填)</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ES集群名称(自定义存储时必填)</p>
     * @param InstanceName <p>ES集群名称(自定义存储时必填)</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>ES集群ID(自定义存储时必填)</p> 
     * @return InstanceId <p>ES集群ID(自定义存储时必填)</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES集群ID(自定义存储时必填)</p>
     * @param InstanceId <p>ES集群ID(自定义存储时必填)</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>ES用户名(自定义存储时必填)</p> 
     * @return Username <p>ES用户名(自定义存储时必填)</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>ES用户名(自定义存储时必填)</p>
     * @param Username <p>ES用户名(自定义存储时必填)</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>ES密码(自定义存储时必填)</p> 
     * @return Password <p>ES密码(自定义存储时必填)</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>ES密码(自定义存储时必填)</p>
     * @param Password <p>ES密码(自定义存储时必填)</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>允许修改存储方式</p> 
     * @return CanModify <p>允许修改存储方式</p>
     */
    public Boolean getCanModify() {
        return this.CanModify;
    }

    /**
     * Set <p>允许修改存储方式</p>
     * @param CanModify <p>允许修改存储方式</p>
     */
    public void setCanModify(Boolean CanModify) {
        this.CanModify = CanModify;
    }

    public ESConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESConfig(ESConfig source) {
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CanModify != null) {
            this.CanModify = new Boolean(source.CanModify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CanModify", this.CanModify);

    }
}

