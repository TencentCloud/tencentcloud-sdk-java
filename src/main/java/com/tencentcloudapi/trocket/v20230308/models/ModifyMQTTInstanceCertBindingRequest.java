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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMQTTInstanceCertBindingRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务端证书id
    */
    @SerializedName("SSLServerCertId")
    @Expose
    private String SSLServerCertId;

    /**
    * CA证书id
    */
    @SerializedName("SSLCaCertId")
    @Expose
    private String SSLCaCertId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务端证书id 
     * @return SSLServerCertId 服务端证书id
     */
    public String getSSLServerCertId() {
        return this.SSLServerCertId;
    }

    /**
     * Set 服务端证书id
     * @param SSLServerCertId 服务端证书id
     */
    public void setSSLServerCertId(String SSLServerCertId) {
        this.SSLServerCertId = SSLServerCertId;
    }

    /**
     * Get CA证书id 
     * @return SSLCaCertId CA证书id
     */
    public String getSSLCaCertId() {
        return this.SSLCaCertId;
    }

    /**
     * Set CA证书id
     * @param SSLCaCertId CA证书id
     */
    public void setSSLCaCertId(String SSLCaCertId) {
        this.SSLCaCertId = SSLCaCertId;
    }

    public ModifyMQTTInstanceCertBindingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMQTTInstanceCertBindingRequest(ModifyMQTTInstanceCertBindingRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SSLServerCertId != null) {
            this.SSLServerCertId = new String(source.SSLServerCertId);
        }
        if (source.SSLCaCertId != null) {
            this.SSLCaCertId = new String(source.SSLCaCertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SSLServerCertId", this.SSLServerCertId);
        this.setParamSimple(map, prefix + "SSLCaCertId", this.SSLCaCertId);

    }
}

