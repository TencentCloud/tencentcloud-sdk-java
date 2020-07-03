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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginSettings extends AbstractModel{

    /**
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Public Key
    */
    @SerializedName("PublicKeyId")
    @Expose
    private String PublicKeyId;

    /**
     * Get Password 
     * @return Password Password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
     * @param Password Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Public Key 
     * @return PublicKeyId Public Key
     */
    public String getPublicKeyId() {
        return this.PublicKeyId;
    }

    /**
     * Set Public Key
     * @param PublicKeyId Public Key
     */
    public void setPublicKeyId(String PublicKeyId) {
        this.PublicKeyId = PublicKeyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PublicKeyId", this.PublicKeyId);

    }
}

