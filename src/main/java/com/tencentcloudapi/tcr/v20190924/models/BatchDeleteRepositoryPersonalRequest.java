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

public class BatchDeleteRepositoryPersonalRequest extends AbstractModel {

    /**
    * 仓库名称数组
    */
    @SerializedName("RepoNames")
    @Expose
    private String [] RepoNames;

    /**
     * Get 仓库名称数组 
     * @return RepoNames 仓库名称数组
     */
    public String [] getRepoNames() {
        return this.RepoNames;
    }

    /**
     * Set 仓库名称数组
     * @param RepoNames 仓库名称数组
     */
    public void setRepoNames(String [] RepoNames) {
        this.RepoNames = RepoNames;
    }

    public BatchDeleteRepositoryPersonalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteRepositoryPersonalRequest(BatchDeleteRepositoryPersonalRequest source) {
        if (source.RepoNames != null) {
            this.RepoNames = new String[source.RepoNames.length];
            for (int i = 0; i < source.RepoNames.length; i++) {
                this.RepoNames[i] = new String(source.RepoNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RepoNames.", this.RepoNames);

    }
}

