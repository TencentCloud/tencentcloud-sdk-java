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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeRepo extends AbstractModel {

    /**
    * 代码仓库地址
    */
    @SerializedName("RepoUrl")
    @Expose
    private String RepoUrl;

    /**
    * 分支名
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * Commit信息
    */
    @SerializedName("GitCommitPipelines")
    @Expose
    private String [] GitCommitPipelines;

    /**
    * 数据库ORM类型
    */
    @SerializedName("GitORMType")
    @Expose
    private String GitORMType;

    /**
    * 代码编写语言
    */
    @SerializedName("GitCodeLanguage")
    @Expose
    private String GitCodeLanguage;

    /**
     * Get 代码仓库地址 
     * @return RepoUrl 代码仓库地址
     */
    public String getRepoUrl() {
        return this.RepoUrl;
    }

    /**
     * Set 代码仓库地址
     * @param RepoUrl 代码仓库地址
     */
    public void setRepoUrl(String RepoUrl) {
        this.RepoUrl = RepoUrl;
    }

    /**
     * Get 分支名 
     * @return Branch 分支名
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支名
     * @param Branch 分支名
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get Commit信息 
     * @return GitCommitPipelines Commit信息
     */
    public String [] getGitCommitPipelines() {
        return this.GitCommitPipelines;
    }

    /**
     * Set Commit信息
     * @param GitCommitPipelines Commit信息
     */
    public void setGitCommitPipelines(String [] GitCommitPipelines) {
        this.GitCommitPipelines = GitCommitPipelines;
    }

    /**
     * Get 数据库ORM类型 
     * @return GitORMType 数据库ORM类型
     */
    public String getGitORMType() {
        return this.GitORMType;
    }

    /**
     * Set 数据库ORM类型
     * @param GitORMType 数据库ORM类型
     */
    public void setGitORMType(String GitORMType) {
        this.GitORMType = GitORMType;
    }

    /**
     * Get 代码编写语言 
     * @return GitCodeLanguage 代码编写语言
     */
    public String getGitCodeLanguage() {
        return this.GitCodeLanguage;
    }

    /**
     * Set 代码编写语言
     * @param GitCodeLanguage 代码编写语言
     */
    public void setGitCodeLanguage(String GitCodeLanguage) {
        this.GitCodeLanguage = GitCodeLanguage;
    }

    public CodeRepo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeRepo(CodeRepo source) {
        if (source.RepoUrl != null) {
            this.RepoUrl = new String(source.RepoUrl);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.GitCommitPipelines != null) {
            this.GitCommitPipelines = new String[source.GitCommitPipelines.length];
            for (int i = 0; i < source.GitCommitPipelines.length; i++) {
                this.GitCommitPipelines[i] = new String(source.GitCommitPipelines[i]);
            }
        }
        if (source.GitORMType != null) {
            this.GitORMType = new String(source.GitORMType);
        }
        if (source.GitCodeLanguage != null) {
            this.GitCodeLanguage = new String(source.GitCodeLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoUrl", this.RepoUrl);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamArraySimple(map, prefix + "GitCommitPipelines.", this.GitCommitPipelines);
        this.setParamSimple(map, prefix + "GitORMType", this.GitORMType);
        this.setParamSimple(map, prefix + "GitCodeLanguage", this.GitCodeLanguage);

    }
}

