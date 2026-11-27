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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceProtectionsRequest extends AbstractModel {

    /**
    * <p>防护资源，须采用资源六段式格式。具体格式如下：<ul><li>云服务器：<code>qcs::cvm:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>轻量应用服务器：<code>qcs::lighthouse:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>负载均衡：<code>qcs::clb:${region}:uin/${uin}:clb/${LoadBalancerId}</code></li><li>弹性公网 IP：<code>qcs::cvm:${region}:uin/${uin}:eip/${AddressId}</code></li><li>Web 应用防火墙：<code>qcs::waf:${region}:uin/${uin}:waf/${InstanceId}</code></li><li>EdgeOne 域名：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/Domain/${Domain}</code></li><li>EdgeOne 四层代理：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/L4Proxy/${InstanceId}</code></li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/product/598/67350">支持 CAM 的业务接口</a></p>
    */
    @SerializedName("Resources")
    @Expose
    private String [] Resources;

    /**
     * Get <p>防护资源，须采用资源六段式格式。具体格式如下：<ul><li>云服务器：<code>qcs::cvm:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>轻量应用服务器：<code>qcs::lighthouse:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>负载均衡：<code>qcs::clb:${region}:uin/${uin}:clb/${LoadBalancerId}</code></li><li>弹性公网 IP：<code>qcs::cvm:${region}:uin/${uin}:eip/${AddressId}</code></li><li>Web 应用防火墙：<code>qcs::waf:${region}:uin/${uin}:waf/${InstanceId}</code></li><li>EdgeOne 域名：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/Domain/${Domain}</code></li><li>EdgeOne 四层代理：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/L4Proxy/${InstanceId}</code></li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/product/598/67350">支持 CAM 的业务接口</a></p> 
     * @return Resources <p>防护资源，须采用资源六段式格式。具体格式如下：<ul><li>云服务器：<code>qcs::cvm:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>轻量应用服务器：<code>qcs::lighthouse:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>负载均衡：<code>qcs::clb:${region}:uin/${uin}:clb/${LoadBalancerId}</code></li><li>弹性公网 IP：<code>qcs::cvm:${region}:uin/${uin}:eip/${AddressId}</code></li><li>Web 应用防火墙：<code>qcs::waf:${region}:uin/${uin}:waf/${InstanceId}</code></li><li>EdgeOne 域名：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/Domain/${Domain}</code></li><li>EdgeOne 四层代理：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/L4Proxy/${InstanceId}</code></li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/product/598/67350">支持 CAM 的业务接口</a></p>
     */
    public String [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>防护资源，须采用资源六段式格式。具体格式如下：<ul><li>云服务器：<code>qcs::cvm:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>轻量应用服务器：<code>qcs::lighthouse:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>负载均衡：<code>qcs::clb:${region}:uin/${uin}:clb/${LoadBalancerId}</code></li><li>弹性公网 IP：<code>qcs::cvm:${region}:uin/${uin}:eip/${AddressId}</code></li><li>Web 应用防火墙：<code>qcs::waf:${region}:uin/${uin}:waf/${InstanceId}</code></li><li>EdgeOne 域名：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/Domain/${Domain}</code></li><li>EdgeOne 四层代理：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/L4Proxy/${InstanceId}</code></li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/product/598/67350">支持 CAM 的业务接口</a></p>
     * @param Resources <p>防护资源，须采用资源六段式格式。具体格式如下：<ul><li>云服务器：<code>qcs::cvm:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>轻量应用服务器：<code>qcs::lighthouse:${region}:uin/${uin}:instance/${InstanceId}</code></li><li>负载均衡：<code>qcs::clb:${region}:uin/${uin}:clb/${LoadBalancerId}</code></li><li>弹性公网 IP：<code>qcs::cvm:${region}:uin/${uin}:eip/${AddressId}</code></li><li>Web 应用防火墙：<code>qcs::waf:${region}:uin/${uin}:waf/${InstanceId}</code></li><li>EdgeOne 域名：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/Domain/${Domain}</code></li><li>EdgeOne 四层代理：<code>qcs::teo::uin/${uin}:zone/${ZoneId}/L4Proxy/${InstanceId}</code></li></ul></p><p>取值参考：<a href="https://cloud.tencent.com/document/product/598/67350">支持 CAM 的业务接口</a></p>
     */
    public void setResources(String [] Resources) {
        this.Resources = Resources;
    }

    public DescribeResourceProtectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceProtectionsRequest(DescribeResourceProtectionsRequest source) {
        if (source.Resources != null) {
            this.Resources = new String[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new String(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Resources.", this.Resources);

    }
}

