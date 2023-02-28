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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDeviceAccountPrivateKeyRequest extends AbstractModel{

    /**
    * 主机账号ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机账号私钥，最新长度128字节，最大长度8192字节
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 主机账号私钥口令，最大长度256字节
    */
    @SerializedName("PrivateKeyPassword")
    @Expose
    private String PrivateKeyPassword;

    /**
     * Get 主机账号ID 
     * @return Id 主机账号ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主机账号ID
     * @param Id 主机账号ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机账号私钥，最新长度128字节，最大长度8192字节 
     * @return PrivateKey 主机账号私钥，最新长度128字节，最大长度8192字节
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 主机账号私钥，最新长度128字节，最大长度8192字节
     * @param PrivateKey 主机账号私钥，最新长度128字节，最大长度8192字节
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 主机账号私钥口令，最大长度256字节 
     * @return PrivateKeyPassword 主机账号私钥口令，最大长度256字节
     */
    public String getPrivateKeyPassword() {
        return this.PrivateKeyPassword;
    }

    /**
     * Set 主机账号私钥口令，最大长度256字节
     * @param PrivateKeyPassword 主机账号私钥口令，最大长度256字节
     */
    public void setPrivateKeyPassword(String PrivateKeyPassword) {
        this.PrivateKeyPassword = PrivateKeyPassword;
    }

    public BindDeviceAccountPrivateKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDeviceAccountPrivateKeyRequest(BindDeviceAccountPrivateKeyRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.PrivateKeyPassword != null) {
            this.PrivateKeyPassword = new String(source.PrivateKeyPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "PrivateKeyPassword", this.PrivateKeyPassword);

    }
}

