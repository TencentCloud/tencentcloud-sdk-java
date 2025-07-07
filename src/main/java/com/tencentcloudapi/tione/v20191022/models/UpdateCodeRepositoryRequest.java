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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCodeRepositoryRequest extends AbstractModel {

    /**
    * 查询存储库名称
    */
    @SerializedName("CodeRepositoryName")
    @Expose
    private String CodeRepositoryName;

    /**
    * Git凭证
    */
    @SerializedName("GitSecret")
    @Expose
    private GitSecret GitSecret;

    /**
     * Get 查询存储库名称 
     * @return CodeRepositoryName 查询存储库名称
     */
    public String getCodeRepositoryName() {
        return this.CodeRepositoryName;
    }

    /**
     * Set 查询存储库名称
     * @param CodeRepositoryName 查询存储库名称
     */
    public void setCodeRepositoryName(String CodeRepositoryName) {
        this.CodeRepositoryName = CodeRepositoryName;
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

    public UpdateCodeRepositoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCodeRepositoryRequest(UpdateCodeRepositoryRequest source) {
        if (source.CodeRepositoryName != null) {
            this.CodeRepositoryName = new String(source.CodeRepositoryName);
        }
        if (source.GitSecret != null) {
            this.GitSecret = new GitSecret(source.GitSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeRepositoryName", this.CodeRepositoryName);
        this.setParamObj(map, prefix + "GitSecret.", this.GitSecret);

    }
}

