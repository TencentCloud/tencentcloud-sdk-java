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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchUserRepositoryResp extends AbstractModel{

    /**
    * 总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 仓库列表
    */
    @SerializedName("RepoInfo")
    @Expose
    private RepoInfo [] RepoInfo;

    /**
    * Server
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * PrivilegeFiltered
    */
    @SerializedName("PrivilegeFiltered")
    @Expose
    private Boolean PrivilegeFiltered;

    /**
     * Get 总个数 
     * @return TotalCount 总个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总个数
     * @param TotalCount 总个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 仓库列表 
     * @return RepoInfo 仓库列表
     */
    public RepoInfo [] getRepoInfo() {
        return this.RepoInfo;
    }

    /**
     * Set 仓库列表
     * @param RepoInfo 仓库列表
     */
    public void setRepoInfo(RepoInfo [] RepoInfo) {
        this.RepoInfo = RepoInfo;
    }

    /**
     * Get Server 
     * @return Server Server
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set Server
     * @param Server Server
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get PrivilegeFiltered 
     * @return PrivilegeFiltered PrivilegeFiltered
     */
    public Boolean getPrivilegeFiltered() {
        return this.PrivilegeFiltered;
    }

    /**
     * Set PrivilegeFiltered
     * @param PrivilegeFiltered PrivilegeFiltered
     */
    public void setPrivilegeFiltered(Boolean PrivilegeFiltered) {
        this.PrivilegeFiltered = PrivilegeFiltered;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RepoInfo.", this.RepoInfo);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "PrivilegeFiltered", this.PrivilegeFiltered);

    }
}

