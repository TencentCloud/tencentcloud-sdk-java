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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRepositoryAccessPersonalRequest extends AbstractModel {

    /**
    * 仓库名称
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 默认值为0, 1公共，0私有
    */
    @SerializedName("Public")
    @Expose
    private Long Public;

    /**
     * Get 仓库名称 
     * @return RepoName 仓库名称
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名称
     * @param RepoName 仓库名称
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 默认值为0, 1公共，0私有 
     * @return Public 默认值为0, 1公共，0私有
     */
    public Long getPublic() {
        return this.Public;
    }

    /**
     * Set 默认值为0, 1公共，0私有
     * @param Public 默认值为0, 1公共，0私有
     */
    public void setPublic(Long Public) {
        this.Public = Public;
    }

    public ModifyRepositoryAccessPersonalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRepositoryAccessPersonalRequest(ModifyRepositoryAccessPersonalRequest source) {
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.Public != null) {
            this.Public = new Long(source.Public);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Public", this.Public);

    }
}

