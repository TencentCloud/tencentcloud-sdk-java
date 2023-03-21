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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Target extends AbstractModel{

    /**
    * 后端服务的监听端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 子机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 绑定弹性网卡时需要传入此参数，代表弹性网卡的IP，弹性网卡必须先绑定至子机，然后才能绑定到负载均衡实例。注意：参数 InstanceId 和 EniIp 只能传入一个且必须传入一个。
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
     * Get 后端服务的监听端口 
     * @return Port 后端服务的监听端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 后端服务的监听端口
     * @param Port 后端服务的监听端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 子机ID 
     * @return InstanceId 子机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 子机ID
     * @param InstanceId 子机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 后端服务的转发权重，取值范围：[0, 100]，默认为 10。 
     * @return Weight 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
     * @param Weight 后端服务的转发权重，取值范围：[0, 100]，默认为 10。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 绑定弹性网卡时需要传入此参数，代表弹性网卡的IP，弹性网卡必须先绑定至子机，然后才能绑定到负载均衡实例。注意：参数 InstanceId 和 EniIp 只能传入一个且必须传入一个。 
     * @return EniIp 绑定弹性网卡时需要传入此参数，代表弹性网卡的IP，弹性网卡必须先绑定至子机，然后才能绑定到负载均衡实例。注意：参数 InstanceId 和 EniIp 只能传入一个且必须传入一个。
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 绑定弹性网卡时需要传入此参数，代表弹性网卡的IP，弹性网卡必须先绑定至子机，然后才能绑定到负载均衡实例。注意：参数 InstanceId 和 EniIp 只能传入一个且必须传入一个。
     * @param EniIp 绑定弹性网卡时需要传入此参数，代表弹性网卡的IP，弹性网卡必须先绑定至子机，然后才能绑定到负载均衡实例。注意：参数 InstanceId 和 EniIp 只能传入一个且必须传入一个。
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    public Target() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Target(Target source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.EniIp != null) {
            this.EniIp = new String(source.EniIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);

    }
}

