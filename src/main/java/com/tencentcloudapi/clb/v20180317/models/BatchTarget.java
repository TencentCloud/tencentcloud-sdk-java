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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTarget extends AbstractModel{

    /**
    * 监听器 ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 绑定端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 子机 ID。表示绑定主网卡主 IP。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 七层规则 ID。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * Get 监听器 ID。 
     * @return ListenerId 监听器 ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID。
     * @param ListenerId 监听器 ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 绑定端口。 
     * @return Port 绑定端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 绑定端口。
     * @param Port 绑定端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 子机 ID。表示绑定主网卡主 IP。 
     * @return InstanceId 子机 ID。表示绑定主网卡主 IP。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 子机 ID。表示绑定主网卡主 IP。
     * @param InstanceId 子机 ID。表示绑定主网卡主 IP。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。 
     * @return EniIp 绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。
     * @param EniIp 绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。 
     * @return Weight 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     * @param Weight 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 七层规则 ID。 
     * @return LocationId 七层规则 ID。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 七层规则 ID。
     * @param LocationId 七层规则 ID。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    public BatchTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchTarget(BatchTarget source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EniIp != null) {
            this.EniIp = new String(source.EniIp);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}

