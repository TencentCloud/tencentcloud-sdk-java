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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GitRepoConfig extends AbstractModel {

    /**
    * <p>检出规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparseCheckout")
    @Expose
    private SparseCheckoutConfig SparseCheckout;

    /**
    * <p>Git 仓库地址</p>
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * <p>分支名</p>
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * <p>关联的 gitAuth 配置名称</p>
    */
    @SerializedName("AuthConfigName")
    @Expose
    private String AuthConfigName;

    /**
     * Get <p>检出规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparseCheckout <p>检出规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SparseCheckoutConfig getSparseCheckout() {
        return this.SparseCheckout;
    }

    /**
     * Set <p>检出规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparseCheckout <p>检出规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparseCheckout(SparseCheckoutConfig SparseCheckout) {
        this.SparseCheckout = SparseCheckout;
    }

    /**
     * Get <p>Git 仓库地址</p> 
     * @return RepoUrl <p>Git 仓库地址</p>
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set <p>Git 仓库地址</p>
     * @param RepoUrl <p>Git 仓库地址</p>
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get <p>分支名</p> 
     * @return Branch <p>分支名</p>
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set <p>分支名</p>
     * @param Branch <p>分支名</p>
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get <p>关联的 gitAuth 配置名称</p> 
     * @return AuthConfigName <p>关联的 gitAuth 配置名称</p>
     */
    public String getAuthConfigName() {
        return this.AuthConfigName;
    }

    /**
     * Set <p>关联的 gitAuth 配置名称</p>
     * @param AuthConfigName <p>关联的 gitAuth 配置名称</p>
     */
    public void setAuthConfigName(String AuthConfigName) {
        this.AuthConfigName = AuthConfigName;
    }

    public GitRepoConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GitRepoConfig(GitRepoConfig source) {
        if (source.SparseCheckout != null) {
            this.SparseCheckout = new SparseCheckoutConfig(source.SparseCheckout);
        }
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.AuthConfigName != null) {
            this.AuthConfigName = new String(source.AuthConfigName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SparseCheckout.", this.SparseCheckout);
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "AuthConfigName", this.AuthConfigName);

    }
}

