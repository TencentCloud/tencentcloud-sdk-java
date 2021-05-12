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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressTls extends AbstractModel{

    /**
    * host 数组
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * secret name
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
     * Get host 数组 
     * @return Hosts host 数组
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set host 数组
     * @param Hosts host 数组
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get secret name 
     * @return SecretName secret name
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret name
     * @param SecretName secret name
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    public IngressTls() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressTls(IngressTls source) {
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);

    }
}

