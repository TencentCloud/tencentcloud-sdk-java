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

public class ModifyDomainAttributesRequest extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 域名（必须是已经创建的转发规则下的域名）
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要修改的新域名
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
    * 域名相关的证书信息，注意，仅对启用SNI的监听器适用。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
     * Get 负载均衡实例 ID 
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器 ID 
     * @return ListenerId 负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID
     * @param ListenerId 负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 域名（必须是已经创建的转发规则下的域名） 
     * @return Domain 域名（必须是已经创建的转发规则下的域名）
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名（必须是已经创建的转发规则下的域名）
     * @param Domain 域名（必须是已经创建的转发规则下的域名）
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要修改的新域名 
     * @return NewDomain 要修改的新域名
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * Set 要修改的新域名
     * @param NewDomain 要修改的新域名
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    /**
     * Get 域名相关的证书信息，注意，仅对启用SNI的监听器适用。 
     * @return Certificate 域名相关的证书信息，注意，仅对启用SNI的监听器适用。
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 域名相关的证书信息，注意，仅对启用SNI的监听器适用。
     * @param Certificate 域名相关的证书信息，注意，仅对启用SNI的监听器适用。
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 是否开启Http2，注意，只有HTTPS域名才能开启Http2。 
     * @return Http2 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
     * @param Http2 是否开启Http2，注意，只有HTTPS域名才能开启Http2。
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。 
     * @return DefaultServer 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
     * @param DefaultServer 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "NewDomain", this.NewDomain);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "DefaultServer", this.DefaultServer);

    }
}

