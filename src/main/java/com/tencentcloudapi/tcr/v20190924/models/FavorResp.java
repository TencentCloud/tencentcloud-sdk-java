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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FavorResp extends AbstractModel {

    /**
    * 收藏仓库的总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 仓库信息数组
    */
    @SerializedName("RepoInfo")
    @Expose
    private Favors [] RepoInfo;

    /**
     * Get 收藏仓库的总数 
     * @return TotalCount 收藏仓库的总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 收藏仓库的总数
     * @param TotalCount 收藏仓库的总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 仓库信息数组 
     * @return RepoInfo 仓库信息数组
     */
    public Favors [] getRepoInfo() {
        return this.RepoInfo;
    }

    /**
     * Set 仓库信息数组
     * @param RepoInfo 仓库信息数组
     */
    public void setRepoInfo(Favors [] RepoInfo) {
        this.RepoInfo = RepoInfo;
    }

    public FavorResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FavorResp(FavorResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RepoInfo != null) {
            this.RepoInfo = new Favors[source.RepoInfo.length];
            for (int i = 0; i < source.RepoInfo.length; i++) {
                this.RepoInfo[i] = new Favors(source.RepoInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RepoInfo.", this.RepoInfo);

    }
}

