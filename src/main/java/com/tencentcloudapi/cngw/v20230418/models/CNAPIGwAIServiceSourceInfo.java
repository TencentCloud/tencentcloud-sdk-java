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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwAIServiceSourceInfo extends AbstractModel {

    /**
    * <p>服务来源实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>授权信息</p>
    */
    @SerializedName("Auth")
    @Expose
    private CNAPIGwAIServiceSourceAuth Auth;

    /**
    * <p>地址列表</p>
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
     * Get <p>服务来源实例id</p> 
     * @return InstanceId <p>服务来源实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>服务来源实例id</p>
     * @param InstanceId <p>服务来源实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>授权信息</p> 
     * @return Auth <p>授权信息</p>
     */
    public CNAPIGwAIServiceSourceAuth getAuth() {
        return this.Auth;
    }

    /**
     * Set <p>授权信息</p>
     * @param Auth <p>授权信息</p>
     */
    public void setAuth(CNAPIGwAIServiceSourceAuth Auth) {
        this.Auth = Auth;
    }

    /**
     * Get <p>地址列表</p> 
     * @return Addresses <p>地址列表</p>
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set <p>地址列表</p>
     * @param Addresses <p>地址列表</p>
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    public CNAPIGwAIServiceSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwAIServiceSourceInfo(CNAPIGwAIServiceSourceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Auth != null) {
            this.Auth = new CNAPIGwAIServiceSourceAuth(source.Auth);
        }
        if (source.Addresses != null) {
            this.Addresses = new String[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new String(source.Addresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Auth.", this.Auth);
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);

    }
}

