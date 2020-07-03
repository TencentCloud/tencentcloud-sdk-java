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

public class CreateCodeRepositoryRequest extends AbstractModel{

    /**
    * 存储库名称
    */
    @SerializedName("CodeRepositoryName")
    @Expose
    private String CodeRepositoryName;

    /**
    * Git相关配置
    */
    @SerializedName("GitConfig")
    @Expose
    private GitConfig GitConfig;

    /**
    * Git凭证
    */
    @SerializedName("GitSecret")
    @Expose
    private GitSecret GitSecret;

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
     * Get Git相关配置 
     * @return GitConfig Git相关配置
     */
    public GitConfig getGitConfig() {
        return this.GitConfig;
    }

    /**
     * Set Git相关配置
     * @param GitConfig Git相关配置
     */
    public void setGitConfig(GitConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    /**
     * Get Git凭证 
     * @return GitSecret Git凭证
     */
    public GitSecret getGitSecret() {
        return this.GitSecret;
    }

    /**
     * Set Git凭证
     * @param GitSecret Git凭证
     */
    public void setGitSecret(GitSecret GitSecret) {
        this.GitSecret = GitSecret;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeRepositoryName", this.CodeRepositoryName);
        this.setParamObj(map, prefix + "GitConfig.", this.GitConfig);
        this.setParamObj(map, prefix + "GitSecret.", this.GitSecret);

    }
}

