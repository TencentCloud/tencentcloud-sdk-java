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

public class RepoInfoResp extends AbstractModel {

    /**
    * 仓库总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 仓库信息列表
    */
    @SerializedName("RepoInfo")
    @Expose
    private RepoInfo [] RepoInfo;

    /**
    * Server信息
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
     * Get 仓库总数 
     * @return TotalCount 仓库总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 仓库总数
     * @param TotalCount 仓库总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 仓库信息列表 
     * @return RepoInfo 仓库信息列表
     */
    public RepoInfo [] getRepoInfo() {
        return this.RepoInfo;
    }

    /**
     * Set 仓库信息列表
     * @param RepoInfo 仓库信息列表
     */
    public void setRepoInfo(RepoInfo [] RepoInfo) {
        this.RepoInfo = RepoInfo;
    }

    /**
     * Get Server信息 
     * @return Server Server信息
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set Server信息
     * @param Server Server信息
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    public RepoInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepoInfoResp(RepoInfoResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RepoInfo != null) {
            this.RepoInfo = new RepoInfo[source.RepoInfo.length];
            for (int i = 0; i < source.RepoInfo.length; i++) {
                this.RepoInfo[i] = new RepoInfo(source.RepoInfo[i]);
            }
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RepoInfo.", this.RepoInfo);
        this.setParamSimple(map, prefix + "Server", this.Server);

    }
}

