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

public class AutoRewriteRequest extends AbstractModel {

    /**
    * <p>负载均衡实例ID。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>HTTPS:443监听器的ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>重定向状态码，可取值301,302,307。</p><p>默认值：302</p>
    */
    @SerializedName("RewriteCodes")
    @Expose
    private Long [] RewriteCodes;

    /**
    * <p>重定向是否携带匹配的URL。</p>
    */
    @SerializedName("TakeUrls")
    @Expose
    private Boolean [] TakeUrls;

    /**
     * Get <p>负载均衡实例ID。</p> 
     * @return LoadBalancerId <p>负载均衡实例ID。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例ID。</p>
     * @param LoadBalancerId <p>负载均衡实例ID。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>HTTPS:443监听器的ID。</p> 
     * @return ListenerId <p>HTTPS:443监听器的ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>HTTPS:443监听器的ID。</p>
     * @param ListenerId <p>HTTPS:443监听器的ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。</p> 
     * @return Domains <p>HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。</p>
     * @param Domains <p>HTTPS:443监听器下需要重定向的域名，若不填，则对HTTPS:443监听器下的所有域名都设置重定向。</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>重定向状态码，可取值301,302,307。</p><p>默认值：302</p> 
     * @return RewriteCodes <p>重定向状态码，可取值301,302,307。</p><p>默认值：302</p>
     */
    public Long [] getRewriteCodes() {
        return this.RewriteCodes;
    }

    /**
     * Set <p>重定向状态码，可取值301,302,307。</p><p>默认值：302</p>
     * @param RewriteCodes <p>重定向状态码，可取值301,302,307。</p><p>默认值：302</p>
     */
    public void setRewriteCodes(Long [] RewriteCodes) {
        this.RewriteCodes = RewriteCodes;
    }

    /**
     * Get <p>重定向是否携带匹配的URL。</p> 
     * @return TakeUrls <p>重定向是否携带匹配的URL。</p>
     */
    public Boolean [] getTakeUrls() {
        return this.TakeUrls;
    }

    /**
     * Set <p>重定向是否携带匹配的URL。</p>
     * @param TakeUrls <p>重定向是否携带匹配的URL。</p>
     */
    public void setTakeUrls(Boolean [] TakeUrls) {
        this.TakeUrls = TakeUrls;
    }

    public AutoRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoRewriteRequest(AutoRewriteRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.RewriteCodes != null) {
            this.RewriteCodes = new Long[source.RewriteCodes.length];
            for (int i = 0; i < source.RewriteCodes.length; i++) {
                this.RewriteCodes[i] = new Long(source.RewriteCodes[i]);
            }
        }
        if (source.TakeUrls != null) {
            this.TakeUrls = new Boolean[source.TakeUrls.length];
            for (int i = 0; i < source.TakeUrls.length; i++) {
                this.TakeUrls[i] = new Boolean(source.TakeUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "RewriteCodes.", this.RewriteCodes);
        this.setParamArraySimple(map, prefix + "TakeUrls.", this.TakeUrls);

    }
}

