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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeRepoSummary extends AbstractModel{

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 更新时间
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * 存储库名称
    */
    @SerializedName("CodeRepositoryName")
    @Expose
    private String CodeRepositoryName;

    /**
    * Git配置
    */
    @SerializedName("GitConfig")
    @Expose
    private GitConfig GitConfig;

    /**
    * 是否有Git凭证
    */
    @SerializedName("NoSecret")
    @Expose
    private Boolean NoSecret;

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 更新时间 
     * @return LastModifiedTime 更新时间
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 更新时间
     * @param LastModifiedTime 更新时间
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get 存储库名称 
     * @return CodeRepositoryName 存储库名称
     */
    public String getCodeRepositoryName() {
        return this.CodeRepositoryName;
    }

    /**
     * Set 存储库名称
     * @param CodeRepositoryName 存储库名称
     */
    public void setCodeRepositoryName(String CodeRepositoryName) {
        this.CodeRepositoryName = CodeRepositoryName;
    }

    /**
     * Get Git配置 
     * @return GitConfig Git配置
     */
    public GitConfig getGitConfig() {
        return this.GitConfig;
    }

    /**
     * Set Git配置
     * @param GitConfig Git配置
     */
    public void setGitConfig(GitConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    /**
     * Get 是否有Git凭证 
     * @return NoSecret 是否有Git凭证
     */
    public Boolean getNoSecret() {
        return this.NoSecret;
    }

    /**
     * Set 是否有Git凭证
     * @param NoSecret 是否有Git凭证
     */
    public void setNoSecret(Boolean NoSecret) {
        this.NoSecret = NoSecret;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "CodeRepositoryName", this.CodeRepositoryName);
        this.setParamObj(map, prefix + "GitConfig.", this.GitConfig);
        this.setParamSimple(map, prefix + "NoSecret", this.NoSecret);

    }
}

