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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESConfig extends AbstractModel {

    /**
    * <p>是否支持修改存储方式</p>
    */
    @SerializedName("CanModify")
    @Expose
    private Boolean CanModify;

    /**
    * <p>ES 密码（加密后）</p>
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
    * <p>ES 集群 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>存储类型：1=默认存储，2=自定义存储<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>默认存储</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>自定义存储</td></tr></tbody></table></p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>ES 用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get <p>是否支持修改存储方式</p> 
     * @return CanModify <p>是否支持修改存储方式</p>
     */
    public Boolean getCanModify() {
        return this.CanModify;
    }

    /**
     * Set <p>是否支持修改存储方式</p>
     * @param CanModify <p>是否支持修改存储方式</p>
     */
    public void setCanModify(Boolean CanModify) {
        this.CanModify = CanModify;
    }

    /**
     * Get <p>ES 密码（加密后）</p> 
     * @return EncryptedPassword <p>ES 密码（加密后）</p>
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set <p>ES 密码（加密后）</p>
     * @param EncryptedPassword <p>ES 密码（加密后）</p>
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    /**
     * Get <p>ES 集群 ID</p> 
     * @return InstanceId <p>ES 集群 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES 集群 ID</p>
     * @param InstanceId <p>ES 集群 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>存储类型：1=默认存储，2=自定义存储<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>默认存储</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>自定义存储</td></tr></tbody></table></p> 
     * @return StorageType <p>存储类型：1=默认存储，2=自定义存储<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>默认存储</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>自定义存储</td></tr></tbody></table></p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型：1=默认存储，2=自定义存储<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>默认存储</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>自定义存储</td></tr></tbody></table></p>
     * @param StorageType <p>存储类型：1=默认存储，2=自定义存储<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>ES_STORAGE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>ES_STORAGE_TYPE_DEFAULT</td><td>1</td><td>默认存储</td></tr><tr><td>ES_STORAGE_TYPE_CUSTOM</td><td>2</td><td>自定义存储</td></tr></tbody></table></p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>ES 用户名</p> 
     * @return UserName <p>ES 用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>ES 用户名</p>
     * @param UserName <p>ES 用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public ESConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESConfig(ESConfig source) {
        if (source.CanModify != null) {
            this.CanModify = new Boolean(source.CanModify);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanModify", this.CanModify);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

