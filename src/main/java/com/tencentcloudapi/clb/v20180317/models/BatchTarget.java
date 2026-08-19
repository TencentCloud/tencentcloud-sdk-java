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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTarget extends AbstractModel {

    /**
    * <p>监听器 ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>绑定端口。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>子机 ID。表示绑定主网卡主 IP。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。</p>
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * <p>子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>七层规则 ID。7层负载均衡该参数必填</p>
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * <p>标签。</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get <p>监听器 ID。</p> 
     * @return ListenerId <p>监听器 ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器 ID。</p>
     * @param ListenerId <p>监听器 ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>绑定端口。</p> 
     * @return Port <p>绑定端口。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>绑定端口。</p>
     * @param Port <p>绑定端口。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>子机 ID。表示绑定主网卡主 IP。</p> 
     * @return InstanceId <p>子机 ID。表示绑定主网卡主 IP。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>子机 ID。表示绑定主网卡主 IP。</p>
     * @param InstanceId <p>子机 ID。表示绑定主网卡主 IP。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。</p> 
     * @return EniIp <p>绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。</p>
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set <p>绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。</p>
     * @param EniIp <p>绑定 IP 时需要传入此参数，支持弹性网卡的 IP 和其他内网 IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。注意：参数 InstanceId、EniIp 只能传入一个且必须传入一个。如果绑定双栈IPV6子机，必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。</p>
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get <p>子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。</p> 
     * @return Weight <p>子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。</p>
     * @param Weight <p>子机权重，范围[0, 100]。绑定时如果不存在，则默认为10。</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>七层规则 ID。7层负载均衡该参数必填</p> 
     * @return LocationId <p>七层规则 ID。7层负载均衡该参数必填</p>
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set <p>七层规则 ID。7层负载均衡该参数必填</p>
     * @param LocationId <p>七层规则 ID。7层负载均衡该参数必填</p>
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get <p>标签。</p> 
     * @return Tag <p>标签。</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签。</p>
     * @param Tag <p>标签。</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
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
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
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
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

