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

public class DeviceAccount extends AbstractModel{

    /**
    * 账号ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机ID
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 账号名
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * true-已托管密码，false-未托管密码
    */
    @SerializedName("BoundPassword")
    @Expose
    private Boolean BoundPassword;

    /**
    * true-已托管私钥，false-未托管私钥
    */
    @SerializedName("BoundPrivateKey")
    @Expose
    private Boolean BoundPrivateKey;

    /**
     * Get 账号ID 
     * @return Id 账号ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 账号ID
     * @param Id 账号ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机ID 
     * @return DeviceId 主机ID
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 主机ID
     * @param DeviceId 主机ID
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 账号名 
     * @return Account 账号名
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号名
     * @param Account 账号名
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get true-已托管密码，false-未托管密码 
     * @return BoundPassword true-已托管密码，false-未托管密码
     */
    public Boolean getBoundPassword() {
        return this.BoundPassword;
    }

    /**
     * Set true-已托管密码，false-未托管密码
     * @param BoundPassword true-已托管密码，false-未托管密码
     */
    public void setBoundPassword(Boolean BoundPassword) {
        this.BoundPassword = BoundPassword;
    }

    /**
     * Get true-已托管私钥，false-未托管私钥 
     * @return BoundPrivateKey true-已托管私钥，false-未托管私钥
     */
    public Boolean getBoundPrivateKey() {
        return this.BoundPrivateKey;
    }

    /**
     * Set true-已托管私钥，false-未托管私钥
     * @param BoundPrivateKey true-已托管私钥，false-未托管私钥
     */
    public void setBoundPrivateKey(Boolean BoundPrivateKey) {
        this.BoundPrivateKey = BoundPrivateKey;
    }

    public DeviceAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceAccount(DeviceAccount source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.BoundPassword != null) {
            this.BoundPassword = new Boolean(source.BoundPassword);
        }
        if (source.BoundPrivateKey != null) {
            this.BoundPrivateKey = new Boolean(source.BoundPrivateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "BoundPassword", this.BoundPassword);
        this.setParamSimple(map, prefix + "BoundPrivateKey", this.BoundPrivateKey);

    }
}

