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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainAttributesRequest extends AbstractModel {

    /**
    * 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 域名（必须是已经创建的转发规则下的域名），如果是多域名，可以指定多域名列表中的任意一个，可以通过[DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要修改的新域名。NewDomain和NewDomains只能传一个。
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
    * 域名相关的证书信息，注意，仅对启用SNI的监听器适用，不可和MultiCertInfo 同时传入。
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
    * 是否开启HTTP2，注意，只有HTTPS域名才能开启HTTP2。
True: 开启HTTP2，Fasle: 不开启HTTP2。
    */
    @SerializedName("Http2")
    @Expose
    private Boolean Http2;

    /**
    * 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
True: 设为默认域名，Fasle: 不设置为默认域名。
    */
    @SerializedName("DefaultServer")
    @Expose
    private Boolean DefaultServer;

    /**
    * 是否开启 QUIC，注意，只有 HTTPS 域名才能开启 QUIC。
True: 开启 QUIC，False: 不开启QUIC。
    */
    @SerializedName("Quic")
    @Expose
    private Boolean Quic;

    /**
    * 监听器下必须配置一个默认域名，若要关闭原默认域名，必须同时指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
    */
    @SerializedName("NewDefaultServerDomain")
    @Expose
    private String NewDefaultServerDomain;

    /**
    * 要修改的新域名列表。NewDomain和NewDomains只能传一个。
    */
    @SerializedName("NewDomains")
    @Expose
    private String [] NewDomains;

    /**
    * 域名相关的证书信息，注意，仅对启用SNI的监听器适用；支持同时传入多本算法类型不同的服务器证书，不可和Certificate 同时传入。
    */
    @SerializedName("MultiCertInfo")
    @Expose
    private MultiCertInfo MultiCertInfo;

    /**
     * Get 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。 
     * @return LoadBalancerId 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
     * @param LoadBalancerId 负载均衡实例ID，可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/214/30685) 接口查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。 
     * @return ListenerId 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     * @param ListenerId 负载均衡监听器ID，可以通过 [DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 域名（必须是已经创建的转发规则下的域名），如果是多域名，可以指定多域名列表中的任意一个，可以通过[DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。 
     * @return Domain 域名（必须是已经创建的转发规则下的域名），如果是多域名，可以指定多域名列表中的任意一个，可以通过[DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名（必须是已经创建的转发规则下的域名），如果是多域名，可以指定多域名列表中的任意一个，可以通过[DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     * @param Domain 域名（必须是已经创建的转发规则下的域名），如果是多域名，可以指定多域名列表中的任意一个，可以通过[DescribeListeners](https://cloud.tencent.com/document/product/214/30686) 接口查询。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要修改的新域名。NewDomain和NewDomains只能传一个。 
     * @return NewDomain 要修改的新域名。NewDomain和NewDomains只能传一个。
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * Set 要修改的新域名。NewDomain和NewDomains只能传一个。
     * @param NewDomain 要修改的新域名。NewDomain和NewDomains只能传一个。
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    /**
     * Get 域名相关的证书信息，注意，仅对启用SNI的监听器适用，不可和MultiCertInfo 同时传入。 
     * @return Certificate 域名相关的证书信息，注意，仅对启用SNI的监听器适用，不可和MultiCertInfo 同时传入。
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 域名相关的证书信息，注意，仅对启用SNI的监听器适用，不可和MultiCertInfo 同时传入。
     * @param Certificate 域名相关的证书信息，注意，仅对启用SNI的监听器适用，不可和MultiCertInfo 同时传入。
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 是否开启HTTP2，注意，只有HTTPS域名才能开启HTTP2。
True: 开启HTTP2，Fasle: 不开启HTTP2。 
     * @return Http2 是否开启HTTP2，注意，只有HTTPS域名才能开启HTTP2。
True: 开启HTTP2，Fasle: 不开启HTTP2。
     */
    public Boolean getHttp2() {
        return this.Http2;
    }

    /**
     * Set 是否开启HTTP2，注意，只有HTTPS域名才能开启HTTP2。
True: 开启HTTP2，Fasle: 不开启HTTP2。
     * @param Http2 是否开启HTTP2，注意，只有HTTPS域名才能开启HTTP2。
True: 开启HTTP2，Fasle: 不开启HTTP2。
     */
    public void setHttp2(Boolean Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
True: 设为默认域名，Fasle: 不设置为默认域名。 
     * @return DefaultServer 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
True: 设为默认域名，Fasle: 不设置为默认域名。
     */
    public Boolean getDefaultServer() {
        return this.DefaultServer;
    }

    /**
     * Set 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
True: 设为默认域名，Fasle: 不设置为默认域名。
     * @param DefaultServer 是否设为默认域名，注意，一个监听器下只能设置一个默认域名。
True: 设为默认域名，Fasle: 不设置为默认域名。
     */
    public void setDefaultServer(Boolean DefaultServer) {
        this.DefaultServer = DefaultServer;
    }

    /**
     * Get 是否开启 QUIC，注意，只有 HTTPS 域名才能开启 QUIC。
True: 开启 QUIC，False: 不开启QUIC。 
     * @return Quic 是否开启 QUIC，注意，只有 HTTPS 域名才能开启 QUIC。
True: 开启 QUIC，False: 不开启QUIC。
     */
    public Boolean getQuic() {
        return this.Quic;
    }

    /**
     * Set 是否开启 QUIC，注意，只有 HTTPS 域名才能开启 QUIC。
True: 开启 QUIC，False: 不开启QUIC。
     * @param Quic 是否开启 QUIC，注意，只有 HTTPS 域名才能开启 QUIC。
True: 开启 QUIC，False: 不开启QUIC。
     */
    public void setQuic(Boolean Quic) {
        this.Quic = Quic;
    }

    /**
     * Get 监听器下必须配置一个默认域名，若要关闭原默认域名，必须同时指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。 
     * @return NewDefaultServerDomain 监听器下必须配置一个默认域名，若要关闭原默认域名，必须同时指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set 监听器下必须配置一个默认域名，若要关闭原默认域名，必须同时指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
     * @param NewDefaultServerDomain 监听器下必须配置一个默认域名，若要关闭原默认域名，必须同时指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    /**
     * Get 要修改的新域名列表。NewDomain和NewDomains只能传一个。 
     * @return NewDomains 要修改的新域名列表。NewDomain和NewDomains只能传一个。
     */
    public String [] getNewDomains() {
        return this.NewDomains;
    }

    /**
     * Set 要修改的新域名列表。NewDomain和NewDomains只能传一个。
     * @param NewDomains 要修改的新域名列表。NewDomain和NewDomains只能传一个。
     */
    public void setNewDomains(String [] NewDomains) {
        this.NewDomains = NewDomains;
    }

    /**
     * Get 域名相关的证书信息，注意，仅对启用SNI的监听器适用；支持同时传入多本算法类型不同的服务器证书，不可和Certificate 同时传入。 
     * @return MultiCertInfo 域名相关的证书信息，注意，仅对启用SNI的监听器适用；支持同时传入多本算法类型不同的服务器证书，不可和Certificate 同时传入。
     */
    public MultiCertInfo getMultiCertInfo() {
        return this.MultiCertInfo;
    }

    /**
     * Set 域名相关的证书信息，注意，仅对启用SNI的监听器适用；支持同时传入多本算法类型不同的服务器证书，不可和Certificate 同时传入。
     * @param MultiCertInfo 域名相关的证书信息，注意，仅对启用SNI的监听器适用；支持同时传入多本算法类型不同的服务器证书，不可和Certificate 同时传入。
     */
    public void setMultiCertInfo(MultiCertInfo MultiCertInfo) {
        this.MultiCertInfo = MultiCertInfo;
    }

    public ModifyDomainAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainAttributesRequest(ModifyDomainAttributesRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.NewDomain != null) {
            this.NewDomain = new String(source.NewDomain);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
        if (source.Http2 != null) {
            this.Http2 = new Boolean(source.Http2);
        }
        if (source.DefaultServer != null) {
            this.DefaultServer = new Boolean(source.DefaultServer);
        }
        if (source.Quic != null) {
            this.Quic = new Boolean(source.Quic);
        }
        if (source.NewDefaultServerDomain != null) {
            this.NewDefaultServerDomain = new String(source.NewDefaultServerDomain);
        }
        if (source.NewDomains != null) {
            this.NewDomains = new String[source.NewDomains.length];
            for (int i = 0; i < source.NewDomains.length; i++) {
                this.NewDomains[i] = new String(source.NewDomains[i]);
            }
        }
        if (source.MultiCertInfo != null) {
            this.MultiCertInfo = new MultiCertInfo(source.MultiCertInfo);
        }
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
        this.setParamSimple(map, prefix + "Quic", this.Quic);
        this.setParamSimple(map, prefix + "NewDefaultServerDomain", this.NewDefaultServerDomain);
        this.setParamArraySimple(map, prefix + "NewDomains.", this.NewDomains);
        this.setParamObj(map, prefix + "MultiCertInfo.", this.MultiCertInfo);

    }
}

