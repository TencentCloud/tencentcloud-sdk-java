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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CvmAndIpInfo extends AbstractModel {

    /**
    * ckafka集群实例Id
    */
    @SerializedName("CkafkaInstanceId")
    @Expose
    private String CkafkaInstanceId;

    /**
    * CVM实例ID(ins-test )或POD IP(10.0.0.30)  
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get ckafka集群实例Id 
     * @return CkafkaInstanceId ckafka集群实例Id
     */
    public String getCkafkaInstanceId() {
        return this.CkafkaInstanceId;
    }

    /**
     * Set ckafka集群实例Id
     * @param CkafkaInstanceId ckafka集群实例Id
     */
    public void setCkafkaInstanceId(String CkafkaInstanceId) {
        this.CkafkaInstanceId = CkafkaInstanceId;
    }

    /**
     * Get CVM实例ID(ins-test )或POD IP(10.0.0.30)   
     * @return InstanceId CVM实例ID(ins-test )或POD IP(10.0.0.30)  
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM实例ID(ins-test )或POD IP(10.0.0.30)  
     * @param InstanceId CVM实例ID(ins-test )或POD IP(10.0.0.30)  
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public CvmAndIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CvmAndIpInfo(CvmAndIpInfo source) {
        if (source.CkafkaInstanceId != null) {
            this.CkafkaInstanceId = new String(source.CkafkaInstanceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CkafkaInstanceId", this.CkafkaInstanceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

