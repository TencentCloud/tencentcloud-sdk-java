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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerPackageNew extends AbstractModel {

    /**
    * 监听id
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听名
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 负载均衡id
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡名
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 地区
"多伦多": "ca",
    "广州": "gz",
    "成都": "cd",
    "福州": "fzec",
    "深圳": "szx",
    "印度": "in",
    "济南": "jnec",
    "重庆": "cq",
    "天津": "tsn",
    "欧洲东北": "ru",
    "南京": "nj",
    "美国硅谷": "usw",
    "泰国": "th",
    "广州Open": "gzopen",
    "深圳金融": "szjr",
    "法兰克福": "de",
    "日本": "jp",
    "弗吉尼亚": "use",
    "北京": "bj",
    "中国香港": "hk",
    "杭州": "hzec",
    "北京金融": "bjjr",
    "上海金融": "shjr",
    "台北": "tpe",
    "首尔": "kr",
    "上海": "sh",
    "新加坡": "sg",
    "清远": "qy"
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 接入IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 接入端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 地域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPCID
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * CLB类型
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡器的域名
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
     * Get 监听id 
     * @return ListenerId 监听id
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听id
     * @param ListenerId 监听id
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听名 
     * @return ListenerName 监听名
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听名
     * @param ListenerName 监听名
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 负载均衡id 
     * @return LoadBalancerId 负载均衡id
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡id
     * @param LoadBalancerId 负载均衡id
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡名 
     * @return LoadBalancerName 负载均衡名
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡名
     * @param LoadBalancerName 负载均衡名
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 地区
"多伦多": "ca",
    "广州": "gz",
    "成都": "cd",
    "福州": "fzec",
    "深圳": "szx",
    "印度": "in",
    "济南": "jnec",
    "重庆": "cq",
    "天津": "tsn",
    "欧洲东北": "ru",
    "南京": "nj",
    "美国硅谷": "usw",
    "泰国": "th",
    "广州Open": "gzopen",
    "深圳金融": "szjr",
    "法兰克福": "de",
    "日本": "jp",
    "弗吉尼亚": "use",
    "北京": "bj",
    "中国香港": "hk",
    "杭州": "hzec",
    "北京金融": "bjjr",
    "上海金融": "shjr",
    "台北": "tpe",
    "首尔": "kr",
    "上海": "sh",
    "新加坡": "sg",
    "清远": "qy" 
     * @return Region 地区
"多伦多": "ca",
    "广州": "gz",
    "成都": "cd",
    "福州": "fzec",
    "深圳": "szx",
    "印度": "in",
    "济南": "jnec",
    "重庆": "cq",
    "天津": "tsn",
    "欧洲东北": "ru",
    "南京": "nj",
    "美国硅谷": "usw",
    "泰国": "th",
    "广州Open": "gzopen",
    "深圳金融": "szjr",
    "法兰克福": "de",
    "日本": "jp",
    "弗吉尼亚": "use",
    "北京": "bj",
    "中国香港": "hk",
    "杭州": "hzec",
    "北京金融": "bjjr",
    "上海金融": "shjr",
    "台北": "tpe",
    "首尔": "kr",
    "上海": "sh",
    "新加坡": "sg",
    "清远": "qy"
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地区
"多伦多": "ca",
    "广州": "gz",
    "成都": "cd",
    "福州": "fzec",
    "深圳": "szx",
    "印度": "in",
    "济南": "jnec",
    "重庆": "cq",
    "天津": "tsn",
    "欧洲东北": "ru",
    "南京": "nj",
    "美国硅谷": "usw",
    "泰国": "th",
    "广州Open": "gzopen",
    "深圳金融": "szjr",
    "法兰克福": "de",
    "日本": "jp",
    "弗吉尼亚": "use",
    "北京": "bj",
    "中国香港": "hk",
    "杭州": "hzec",
    "北京金融": "bjjr",
    "上海金融": "shjr",
    "台北": "tpe",
    "首尔": "kr",
    "上海": "sh",
    "新加坡": "sg",
    "清远": "qy"
     * @param Region 地区
"多伦多": "ca",
    "广州": "gz",
    "成都": "cd",
    "福州": "fzec",
    "深圳": "szx",
    "印度": "in",
    "济南": "jnec",
    "重庆": "cq",
    "天津": "tsn",
    "欧洲东北": "ru",
    "南京": "nj",
    "美国硅谷": "usw",
    "泰国": "th",
    "广州Open": "gzopen",
    "深圳金融": "szjr",
    "法兰克福": "de",
    "日本": "jp",
    "弗吉尼亚": "use",
    "北京": "bj",
    "中国香港": "hk",
    "杭州": "hzec",
    "北京金融": "bjjr",
    "上海金融": "shjr",
    "台北": "tpe",
    "首尔": "kr",
    "上海": "sh",
    "新加坡": "sg",
    "清远": "qy"
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 接入IP 
     * @return Vip 接入IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 接入IP
     * @param Vip 接入IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 接入端口 
     * @return Vport 接入端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 接入端口
     * @param Vport 接入端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 地域 
     * @return Zone 地域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域
     * @param Zone 地域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPCID 
     * @return NumericalVpcId VPCID
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set VPCID
     * @param NumericalVpcId VPCID
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get CLB类型 
     * @return LoadBalancerType CLB类型
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set CLB类型
     * @param LoadBalancerType CLB类型
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡器的域名 
     * @return LoadBalancerDomain 负载均衡器的域名
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set 负载均衡器的域名
     * @param LoadBalancerDomain 负载均衡器的域名
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    public LoadBalancerPackageNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerPackageNew(LoadBalancerPackageNew source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);

    }
}

