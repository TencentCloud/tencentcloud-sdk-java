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

public class PreCacheImageCleanupPolicy extends AbstractModel {

    /**
    * <p>自动清理策略ID</p>
    */
    @SerializedName("CleanupPolicyId")
    @Expose
    private String CleanupPolicyId;

    /**
    * <p>自动清理策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略启用配置</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>镜像仓库地址</p><p>精准匹配，空串表示不限域名</p>
    */
    @SerializedName("RegistryHost")
    @Expose
    private String RegistryHost;

    /**
    * <p>镜像仓库名</p><p>正则匹配，匹配 命名空间/仓库 完整路径，非锚定子串匹配，语法与 TCR 预热触发器一致；空串表示全部 Repo</p>
    */
    @SerializedName("RepoPattern")
    @Expose
    private String RepoPattern;

    /**
    * <p>闲置过期清理时间</p><p>规范化正数时长，例如 7d</p>
    */
    @SerializedName("IdleTTL")
    @Expose
    private String IdleTTL;

    /**
    * <p>策略创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>策略最近更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>自动清理策略ID</p> 
     * @return CleanupPolicyId <p>自动清理策略ID</p>
     */
    public String getCleanupPolicyId() {
        return this.CleanupPolicyId;
    }

    /**
     * Set <p>自动清理策略ID</p>
     * @param CleanupPolicyId <p>自动清理策略ID</p>
     */
    public void setCleanupPolicyId(String CleanupPolicyId) {
        this.CleanupPolicyId = CleanupPolicyId;
    }

    /**
     * Get <p>自动清理策略名</p> 
     * @return Name <p>自动清理策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自动清理策略名</p>
     * @param Name <p>自动清理策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略启用配置</p> 
     * @return Enabled <p>策略启用配置</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>策略启用配置</p>
     * @param Enabled <p>策略启用配置</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>镜像仓库地址</p><p>精准匹配，空串表示不限域名</p> 
     * @return RegistryHost <p>镜像仓库地址</p><p>精准匹配，空串表示不限域名</p>
     */
    public String getRegistryHost() {
        return this.RegistryHost;
    }

    /**
     * Set <p>镜像仓库地址</p><p>精准匹配，空串表示不限域名</p>
     * @param RegistryHost <p>镜像仓库地址</p><p>精准匹配，空串表示不限域名</p>
     */
    public void setRegistryHost(String RegistryHost) {
        this.RegistryHost = RegistryHost;
    }

    /**
     * Get <p>镜像仓库名</p><p>正则匹配，匹配 命名空间/仓库 完整路径，非锚定子串匹配，语法与 TCR 预热触发器一致；空串表示全部 Repo</p> 
     * @return RepoPattern <p>镜像仓库名</p><p>正则匹配，匹配 命名空间/仓库 完整路径，非锚定子串匹配，语法与 TCR 预热触发器一致；空串表示全部 Repo</p>
     */
    public String getRepoPattern() {
        return this.RepoPattern;
    }

    /**
     * Set <p>镜像仓库名</p><p>正则匹配，匹配 命名空间/仓库 完整路径，非锚定子串匹配，语法与 TCR 预热触发器一致；空串表示全部 Repo</p>
     * @param RepoPattern <p>镜像仓库名</p><p>正则匹配，匹配 命名空间/仓库 完整路径，非锚定子串匹配，语法与 TCR 预热触发器一致；空串表示全部 Repo</p>
     */
    public void setRepoPattern(String RepoPattern) {
        this.RepoPattern = RepoPattern;
    }

    /**
     * Get <p>闲置过期清理时间</p><p>规范化正数时长，例如 7d</p> 
     * @return IdleTTL <p>闲置过期清理时间</p><p>规范化正数时长，例如 7d</p>
     */
    public String getIdleTTL() {
        return this.IdleTTL;
    }

    /**
     * Set <p>闲置过期清理时间</p><p>规范化正数时长，例如 7d</p>
     * @param IdleTTL <p>闲置过期清理时间</p><p>规范化正数时长，例如 7d</p>
     */
    public void setIdleTTL(String IdleTTL) {
        this.IdleTTL = IdleTTL;
    }

    /**
     * Get <p>策略创建时间</p> 
     * @return CreateTime <p>策略创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>策略创建时间</p>
     * @param CreateTime <p>策略创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>策略最近更新时间</p> 
     * @return UpdateTime <p>策略最近更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>策略最近更新时间</p>
     * @param UpdateTime <p>策略最近更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PreCacheImageCleanupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreCacheImageCleanupPolicy(PreCacheImageCleanupPolicy source) {
        if (source.CleanupPolicyId != null) {
            this.CleanupPolicyId = new String(source.CleanupPolicyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RegistryHost != null) {
            this.RegistryHost = new String(source.RegistryHost);
        }
        if (source.RepoPattern != null) {
            this.RepoPattern = new String(source.RepoPattern);
        }
        if (source.IdleTTL != null) {
            this.IdleTTL = new String(source.IdleTTL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CleanupPolicyId", this.CleanupPolicyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RegistryHost", this.RegistryHost);
        this.setParamSimple(map, prefix + "RepoPattern", this.RepoPattern);
        this.setParamSimple(map, prefix + "IdleTTL", this.IdleTTL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

