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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeHTTPServiceCacheRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>HTTPService域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Targets</p><p>参数格式：Targets 刷新目标列表，语义随 PurgeType 变化</p><p>入参限制：单次请求最多传 20 个 Target，单条 URL/prefix/host 最长 2048</p>
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * <p>需要刷新的缓存类型：CDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * <p>PurgeType 刷新方式（purge 粒度），TCBCDN仅支持purge_url</p><p>枚举值：</p><ul><li>PURGE_URL： URL 列表（需含协议，如 https://a.com/b.jpg）</li><li>PURGE_PREFIX： URL 前缀列表（需含协议，如 https://a.com/dir/），仅EO支持</li><li>PURGE_HOST： Hostname 列表（可为 host 或 http(s)://host），仅EO支持</li></ul><p>默认值：PURGE_URL</p>
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>HTTPService域名</p> 
     * @return Domain <p>HTTPService域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>HTTPService域名</p>
     * @param Domain <p>HTTPService域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Targets</p><p>参数格式：Targets 刷新目标列表，语义随 PurgeType 变化</p><p>入参限制：单次请求最多传 20 个 Target，单条 URL/prefix/host 最长 2048</p> 
     * @return Targets <p>Targets</p><p>参数格式：Targets 刷新目标列表，语义随 PurgeType 变化</p><p>入参限制：单次请求最多传 20 个 Target，单条 URL/prefix/host 最长 2048</p>
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>Targets</p><p>参数格式：Targets 刷新目标列表，语义随 PurgeType 变化</p><p>入参限制：单次请求最多传 20 个 Target，单条 URL/prefix/host 最长 2048</p>
     * @param Targets <p>Targets</p><p>参数格式：Targets 刷新目标列表，语义随 PurgeType 变化</p><p>入参限制：单次请求最多传 20 个 Target，单条 URL/prefix/host 最长 2048</p>
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>需要刷新的缓存类型：CDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p> 
     * @return CacheType <p>需要刷新的缓存类型：CDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set <p>需要刷新的缓存类型：CDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
     * @param CacheType <p>需要刷新的缓存类型：CDN 或 EO</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get <p>PurgeType 刷新方式（purge 粒度），TCBCDN仅支持purge_url</p><p>枚举值：</p><ul><li>PURGE_URL： URL 列表（需含协议，如 https://a.com/b.jpg）</li><li>PURGE_PREFIX： URL 前缀列表（需含协议，如 https://a.com/dir/），仅EO支持</li><li>PURGE_HOST： Hostname 列表（可为 host 或 http(s)://host），仅EO支持</li></ul><p>默认值：PURGE_URL</p> 
     * @return PurgeType <p>PurgeType 刷新方式（purge 粒度），TCBCDN仅支持purge_url</p><p>枚举值：</p><ul><li>PURGE_URL： URL 列表（需含协议，如 https://a.com/b.jpg）</li><li>PURGE_PREFIX： URL 前缀列表（需含协议，如 https://a.com/dir/），仅EO支持</li><li>PURGE_HOST： Hostname 列表（可为 host 或 http(s)://host），仅EO支持</li></ul><p>默认值：PURGE_URL</p>
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set <p>PurgeType 刷新方式（purge 粒度），TCBCDN仅支持purge_url</p><p>枚举值：</p><ul><li>PURGE_URL： URL 列表（需含协议，如 https://a.com/b.jpg）</li><li>PURGE_PREFIX： URL 前缀列表（需含协议，如 https://a.com/dir/），仅EO支持</li><li>PURGE_HOST： Hostname 列表（可为 host 或 http(s)://host），仅EO支持</li></ul><p>默认值：PURGE_URL</p>
     * @param PurgeType <p>PurgeType 刷新方式（purge 粒度），TCBCDN仅支持purge_url</p><p>枚举值：</p><ul><li>PURGE_URL： URL 列表（需含协议，如 https://a.com/b.jpg）</li><li>PURGE_PREFIX： URL 前缀列表（需含协议，如 https://a.com/dir/），仅EO支持</li><li>PURGE_HOST： Hostname 列表（可为 host 或 http(s)://host），仅EO支持</li></ul><p>默认值：PURGE_URL</p>
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    public PurgeHTTPServiceCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgeHTTPServiceCacheRequest(PurgeHTTPServiceCacheRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.PurgeType != null) {
            this.PurgeType = new String(source.PurgeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);

    }
}

