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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetDevicePasswordRequest extends AbstractModel{

    /**
    * 需要重置密码的服务器ID列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 新密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 需要重置密码的服务器ID列表 
     * @return InstanceIds 需要重置密码的服务器ID列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 需要重置密码的服务器ID列表
     * @param InstanceIds 需要重置密码的服务器ID列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 新密码 
     * @return Password 新密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 新密码
     * @param Password 新密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

