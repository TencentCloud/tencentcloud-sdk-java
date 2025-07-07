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

public class Target extends AbstractModel {

    /**
    * 后端服务的监听端口。
注意：绑定CVM（云服务器）或ENI（弹性网卡）时必传此参数
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 后端服务的类型，可取：CVM（云服务器）、ENI（弹性网卡）；作为入参时，目前本参数暂不生效。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 绑定CVM时需要传入此参数，代表CVM的唯一 ID，可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取。表示绑定主网卡主IPv4地址；以下场景都不支持指定InstanceId：绑定非CVM，绑定CVM上的辅助网卡IP，通过跨域2.0绑定CVM，以及绑定CVM的IPv6地址等。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 后端服务修改后的转发权重，取值范围：[0, 100]，默认为 10。此参数的优先级高于[RsWeightRule](https://cloud.tencent.com/document/api/214/30694#RsWeightRule)中的Weight参数，即最终的权重值以此Weight参数值为准，仅当此Weight参数为空时，才以RsWeightRule中的Weight参数为准。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 绑定IP时需要传入此参数，支持弹性网卡的IP和其他内网IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。如果绑定双栈IPV6子机，则必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * 标签。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 后端服务的监听端口。
注意：绑定CVM（云服务器）或ENI（弹性网卡）时必传此参数 
     * @return Port 后端服务的监听端口。
注意：绑定CVM（云服务器）或ENI（弹性网卡）时必传此参数
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 后端服务的监听端口。
注意：绑定CVM（云服务器）或ENI（弹性网卡）时必传此参数
     * @param Port 后端服务的监听端口。
注意：绑定CVM（云服务器）或ENI（弹性网卡）时必传此参数
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 后端服务的类型，可取：CVM（云服务器）、ENI（弹性网卡）；作为入参时，目前本参数暂不生效。 
     * @return Type 后端服务的类型，可取：CVM（云服务器）、ENI（弹性网卡）；作为入参时，目前本参数暂不生效。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 后端服务的类型，可取：CVM（云服务器）、ENI（弹性网卡）；作为入参时，目前本参数暂不生效。
     * @param Type 后端服务的类型，可取：CVM（云服务器）、ENI（弹性网卡）；作为入参时，目前本参数暂不生效。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 绑定CVM时需要传入此参数，代表CVM的唯一 ID，可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取。表示绑定主网卡主IPv4地址；以下场景都不支持指定InstanceId：绑定非CVM，绑定CVM上的辅助网卡IP，通过跨域2.0绑定CVM，以及绑定CVM的IPv6地址等。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。 
     * @return InstanceId 绑定CVM时需要传入此参数，代表CVM的唯一 ID，可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取。表示绑定主网卡主IPv4地址；以下场景都不支持指定InstanceId：绑定非CVM，绑定CVM上的辅助网卡IP，通过跨域2.0绑定CVM，以及绑定CVM的IPv6地址等。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 绑定CVM时需要传入此参数，代表CVM的唯一 ID，可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取。表示绑定主网卡主IPv4地址；以下场景都不支持指定InstanceId：绑定非CVM，绑定CVM上的辅助网卡IP，通过跨域2.0绑定CVM，以及绑定CVM的IPv6地址等。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。
     * @param InstanceId 绑定CVM时需要传入此参数，代表CVM的唯一 ID，可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取。表示绑定主网卡主IPv4地址；以下场景都不支持指定InstanceId：绑定非CVM，绑定CVM上的辅助网卡IP，通过跨域2.0绑定CVM，以及绑定CVM的IPv6地址等。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 后端服务修改后的转发权重，取值范围：[0, 100]，默认为 10。此参数的优先级高于[RsWeightRule](https://cloud.tencent.com/document/api/214/30694#RsWeightRule)中的Weight参数，即最终的权重值以此Weight参数值为准，仅当此Weight参数为空时，才以RsWeightRule中的Weight参数为准。 
     * @return Weight 后端服务修改后的转发权重，取值范围：[0, 100]，默认为 10。此参数的优先级高于[RsWeightRule](https://cloud.tencent.com/document/api/214/30694#RsWeightRule)中的Weight参数，即最终的权重值以此Weight参数值为准，仅当此Weight参数为空时，才以RsWeightRule中的Weight参数为准。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务修改后的转发权重，取值范围：[0, 100]，默认为 10。此参数的优先级高于[RsWeightRule](https://cloud.tencent.com/document/api/214/30694#RsWeightRule)中的Weight参数，即最终的权重值以此Weight参数值为准，仅当此Weight参数为空时，才以RsWeightRule中的Weight参数为准。
     * @param Weight 后端服务修改后的转发权重，取值范围：[0, 100]，默认为 10。此参数的优先级高于[RsWeightRule](https://cloud.tencent.com/document/api/214/30694#RsWeightRule)中的Weight参数，即最终的权重值以此Weight参数值为准，仅当此Weight参数为空时，才以RsWeightRule中的Weight参数为准。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 绑定IP时需要传入此参数，支持弹性网卡的IP和其他内网IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。如果绑定双栈IPV6子机，则必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。 
     * @return EniIp 绑定IP时需要传入此参数，支持弹性网卡的IP和其他内网IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。如果绑定双栈IPV6子机，则必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 绑定IP时需要传入此参数，支持弹性网卡的IP和其他内网IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。如果绑定双栈IPV6子机，则必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。
     * @param EniIp 绑定IP时需要传入此参数，支持弹性网卡的IP和其他内网IP，如果是弹性网卡则必须先绑定至CVM，然后才能绑定到负载均衡实例。
注意：参数 InstanceId、EniIp 有且只能传入其中一个参数。如果绑定双栈IPV6子机，则必须传该参数。如果是跨地域绑定，则必须传该参数，不支持传InstanceId参数。
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get 标签。 
     * @return Tag 标签。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签。
     * @param Tag 标签。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

