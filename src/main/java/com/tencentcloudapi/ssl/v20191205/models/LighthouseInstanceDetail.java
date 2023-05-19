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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LighthouseInstanceDetail extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * IP地址
    */
    @SerializedName("IP")
    @Expose
    private String [] IP;

    /**
    * 可选择域名
    */
    @SerializedName("Domain")
    @Expose
    private String [] Domain;

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
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get IP地址 
     * @return IP IP地址
     */
    public String [] getIP() {
        return this.IP;
    }

    /**
     * Set IP地址
     * @param IP IP地址
     */
    public void setIP(String [] IP) {
        this.IP = IP;
    }

    /**
     * Get 可选择域名 
     * @return Domain 可选择域名
     */
    public String [] getDomain() {
        return this.Domain;
    }

    /**
     * Set 可选择域名
     * @param Domain 可选择域名
     */
    public void setDomain(String [] Domain) {
        this.Domain = Domain;
    }

    public LighthouseInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LighthouseInstanceDetail(LighthouseInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.IP != null) {
            this.IP = new String[source.IP.length];
            for (int i = 0; i < source.IP.length; i++) {
                this.IP[i] = new String(source.IP[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String[source.Domain.length];
            for (int i = 0; i < source.Domain.length; i++) {
                this.Domain[i] = new String(source.Domain[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "IP.", this.IP);
        this.setParamArraySimple(map, prefix + "Domain.", this.Domain);

    }
}

