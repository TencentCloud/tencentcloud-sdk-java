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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePreCacheImageCleanupPolicyRequest extends AbstractModel {

    /**
    * <p>策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>闲置过期时间</p><p>参数格式：正数 m/h/d</p>
    */
    @SerializedName("IdleTTL")
    @Expose
    private String IdleTTL;

    /**
    * <p>镜像仓库地址</p><p>入参限制：精准匹配，不传或空串表示不限，最多 255 字符</p>
    */
    @SerializedName("RegistryHost")
    @Expose
    private String RegistryHost;

    /**
    * <p>镜像仓库名</p><p>入参限制：正则匹配，最多 256 字符，编译后指令数不超过 128，账号全部启用策略合计不超过 1280；不传或空串表示全部 Repo</p>
    */
    @SerializedName("RepoPattern")
    @Expose
    private String RepoPattern;

    /**
    * <p>策略启用配置</p><p>枚举值：</p><ul><li>true： 启用策略</li><li>false： 禁用策略</li></ul><p>默认值：true</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>策略名</p> 
     * @return Name <p>策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名</p>
     * @param Name <p>策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>闲置过期时间</p><p>参数格式：正数 m/h/d</p> 
     * @return IdleTTL <p>闲置过期时间</p><p>参数格式：正数 m/h/d</p>
     */
    public String getIdleTTL() {
        return this.IdleTTL;
    }

    /**
     * Set <p>闲置过期时间</p><p>参数格式：正数 m/h/d</p>
     * @param IdleTTL <p>闲置过期时间</p><p>参数格式：正数 m/h/d</p>
     */
    public void setIdleTTL(String IdleTTL) {
        this.IdleTTL = IdleTTL;
    }

    /**
     * Get <p>镜像仓库地址</p><p>入参限制：精准匹配，不传或空串表示不限，最多 255 字符</p> 
     * @return RegistryHost <p>镜像仓库地址</p><p>入参限制：精准匹配，不传或空串表示不限，最多 255 字符</p>
     */
    public String getRegistryHost() {
        return this.RegistryHost;
    }

    /**
     * Set <p>镜像仓库地址</p><p>入参限制：精准匹配，不传或空串表示不限，最多 255 字符</p>
     * @param RegistryHost <p>镜像仓库地址</p><p>入参限制：精准匹配，不传或空串表示不限，最多 255 字符</p>
     */
    public void setRegistryHost(String RegistryHost) {
        this.RegistryHost = RegistryHost;
    }

    /**
     * Get <p>镜像仓库名</p><p>入参限制：正则匹配，最多 256 字符，编译后指令数不超过 128，账号全部启用策略合计不超过 1280；不传或空串表示全部 Repo</p> 
     * @return RepoPattern <p>镜像仓库名</p><p>入参限制：正则匹配，最多 256 字符，编译后指令数不超过 128，账号全部启用策略合计不超过 1280；不传或空串表示全部 Repo</p>
     */
    public String getRepoPattern() {
        return this.RepoPattern;
    }

    /**
     * Set <p>镜像仓库名</p><p>入参限制：正则匹配，最多 256 字符，编译后指令数不超过 128，账号全部启用策略合计不超过 1280；不传或空串表示全部 Repo</p>
     * @param RepoPattern <p>镜像仓库名</p><p>入参限制：正则匹配，最多 256 字符，编译后指令数不超过 128，账号全部启用策略合计不超过 1280；不传或空串表示全部 Repo</p>
     */
    public void setRepoPattern(String RepoPattern) {
        this.RepoPattern = RepoPattern;
    }

    /**
     * Get <p>策略启用配置</p><p>枚举值：</p><ul><li>true： 启用策略</li><li>false： 禁用策略</li></ul><p>默认值：true</p> 
     * @return Enabled <p>策略启用配置</p><p>枚举值：</p><ul><li>true： 启用策略</li><li>false： 禁用策略</li></ul><p>默认值：true</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>策略启用配置</p><p>枚举值：</p><ul><li>true： 启用策略</li><li>false： 禁用策略</li></ul><p>默认值：true</p>
     * @param Enabled <p>策略启用配置</p><p>枚举值：</p><ul><li>true： 启用策略</li><li>false： 禁用策略</li></ul><p>默认值：true</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CreatePreCacheImageCleanupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePreCacheImageCleanupPolicyRequest(CreatePreCacheImageCleanupPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdleTTL != null) {
            this.IdleTTL = new String(source.IdleTTL);
        }
        if (source.RegistryHost != null) {
            this.RegistryHost = new String(source.RegistryHost);
        }
        if (source.RepoPattern != null) {
            this.RepoPattern = new String(source.RepoPattern);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdleTTL", this.IdleTTL);
        this.setParamSimple(map, prefix + "RegistryHost", this.RegistryHost);
        this.setParamSimple(map, prefix + "RepoPattern", this.RepoPattern);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

