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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CbrRepoInfo extends AbstractModel{

    /**
    * 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 仓库平台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoLanguage")
    @Expose
    private String RepoLanguage;

    /**
    * 分支名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
     * Get 仓库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repo 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repo 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 仓库平台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType 仓库平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 仓库平台
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType 仓库平台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 仓库语言
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoLanguage 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoLanguage() {
        return this.RepoLanguage;
    }

    /**
     * Set 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoLanguage 仓库语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoLanguage(String RepoLanguage) {
        this.RepoLanguage = RepoLanguage;
    }

    /**
     * Get 分支名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branch 分支名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branch 分支名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public CbrRepoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CbrRepoInfo(CbrRepoInfo source) {
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.RepoLanguage != null) {
            this.RepoLanguage = new String(source.RepoLanguage);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "RepoLanguage", this.RepoLanguage);
        this.setParamSimple(map, prefix + "Branch", this.Branch);

    }
}

