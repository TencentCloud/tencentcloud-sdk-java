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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyL7ListenerRequest  extends AbstractModel{

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 七层监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
    */
    @SerializedName("SslMode")
    @Expose
    private Integer SslMode;

    /**
    * 服务端证书ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 服务端证书名称。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 服务端证书内容。
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * 服务端证书密钥。
    */
    @SerializedName("CertKey")
    @Expose
    private String CertKey;

    /**
    * 客户端证书ID。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 客户端证书名称。
    */
    @SerializedName("CertCaName")
    @Expose
    private String CertCaName;

    /**
    * 客户端证书内容。
    */
    @SerializedName("CertCaContent")
    @Expose
    private String CertCaContent;

    /**
    * 计费模式为按固定带宽方式时监听器的限速值，可选值：0-1000，单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
     * 获取负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     * @return ListenerId 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     * @param ListenerId 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取七层监听器名称。
     * @return ListenerName 七层监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置七层监听器名称。
     * @param ListenerName 七层监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     * @return SslMode 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public Integer getSslMode() {
        return this.SslMode;
    }

    /**
     * 设置认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     * @param SslMode 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public void setSslMode(Integer SslMode) {
        this.SslMode = SslMode;
    }

    /**
     * 获取服务端证书ID。
     * @return CertId 服务端证书ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * 设置服务端证书ID。
     * @param CertId 服务端证书ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * 获取服务端证书名称。
     * @return CertName 服务端证书名称。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * 设置服务端证书名称。
     * @param CertName 服务端证书名称。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * 获取服务端证书内容。
     * @return CertContent 服务端证书内容。
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * 设置服务端证书内容。
     * @param CertContent 服务端证书内容。
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * 获取服务端证书密钥。
     * @return CertKey 服务端证书密钥。
     */
    public String getCertKey() {
        return this.CertKey;
    }

    /**
     * 设置服务端证书密钥。
     * @param CertKey 服务端证书密钥。
     */
    public void setCertKey(String CertKey) {
        this.CertKey = CertKey;
    }

    /**
     * 获取客户端证书ID。
     * @return CertCaId 客户端证书ID。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * 设置客户端证书ID。
     * @param CertCaId 客户端证书ID。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * 获取客户端证书名称。
     * @return CertCaName 客户端证书名称。
     */
    public String getCertCaName() {
        return this.CertCaName;
    }

    /**
     * 设置客户端证书名称。
     * @param CertCaName 客户端证书名称。
     */
    public void setCertCaName(String CertCaName) {
        this.CertCaName = CertCaName;
    }

    /**
     * 获取客户端证书内容。
     * @return CertCaContent 客户端证书内容。
     */
    public String getCertCaContent() {
        return this.CertCaContent;
    }

    /**
     * 设置客户端证书内容。
     * @param CertCaContent 客户端证书内容。
     */
    public void setCertCaContent(String CertCaContent) {
        this.CertCaContent = CertCaContent;
    }

    /**
     * 获取计费模式为按固定带宽方式时监听器的限速值，可选值：0-1000，单位：Mbps。
     * @return Bandwidth 计费模式为按固定带宽方式时监听器的限速值，可选值：0-1000，单位：Mbps。
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置计费模式为按固定带宽方式时监听器的限速值，可选值：0-1000，单位：Mbps。
     * @param Bandwidth 计费模式为按固定带宽方式时监听器的限速值，可选值：0-1000，单位：Mbps。
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "SslMode", this.SslMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "CertCaName", this.CertCaName);
        this.setParamSimple(map, prefix + "CertCaContent", this.CertCaContent);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

