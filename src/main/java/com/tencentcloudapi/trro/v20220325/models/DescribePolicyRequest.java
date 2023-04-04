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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyRequest extends AbstractModel{

    /**
    * 查看权限的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 查看的权限模式，black为黑名单，white为白名单，不填默认为当前项目生效的权限模式
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
    * 模糊匹配模式，remoteMatch为远端设备ID匹配，fieldMatch为现场ID匹配，不填默认为remoteMatch
    */
    @SerializedName("SearchMode")
    @Expose
    private String SearchMode;

    /**
    * 模糊匹配关键字，不填默认不进行模糊匹配
    */
    @SerializedName("SearchWords")
    @Expose
    private String SearchWords;

    /**
    * 每页返回的最大数量，不填默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页码，不填默认为1（首页）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get 查看权限的项目ID 
     * @return ProjectId 查看权限的项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 查看权限的项目ID
     * @param ProjectId 查看权限的项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 查看的权限模式，black为黑名单，white为白名单，不填默认为当前项目生效的权限模式 
     * @return PolicyMode 查看的权限模式，black为黑名单，white为白名单，不填默认为当前项目生效的权限模式
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set 查看的权限模式，black为黑名单，white为白名单，不填默认为当前项目生效的权限模式
     * @param PolicyMode 查看的权限模式，black为黑名单，white为白名单，不填默认为当前项目生效的权限模式
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    /**
     * Get 模糊匹配模式，remoteMatch为远端设备ID匹配，fieldMatch为现场ID匹配，不填默认为remoteMatch 
     * @return SearchMode 模糊匹配模式，remoteMatch为远端设备ID匹配，fieldMatch为现场ID匹配，不填默认为remoteMatch
     */
    public String getSearchMode() {
        return this.SearchMode;
    }

    /**
     * Set 模糊匹配模式，remoteMatch为远端设备ID匹配，fieldMatch为现场ID匹配，不填默认为remoteMatch
     * @param SearchMode 模糊匹配模式，remoteMatch为远端设备ID匹配，fieldMatch为现场ID匹配，不填默认为remoteMatch
     */
    public void setSearchMode(String SearchMode) {
        this.SearchMode = SearchMode;
    }

    /**
     * Get 模糊匹配关键字，不填默认不进行模糊匹配 
     * @return SearchWords 模糊匹配关键字，不填默认不进行模糊匹配
     */
    public String getSearchWords() {
        return this.SearchWords;
    }

    /**
     * Set 模糊匹配关键字，不填默认不进行模糊匹配
     * @param SearchWords 模糊匹配关键字，不填默认不进行模糊匹配
     */
    public void setSearchWords(String SearchWords) {
        this.SearchWords = SearchWords;
    }

    /**
     * Get 每页返回的最大数量，不填默认为10 
     * @return PageSize 每页返回的最大数量，不填默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页返回的最大数量，不填默认为10
     * @param PageSize 每页返回的最大数量，不填默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页码，不填默认为1（首页） 
     * @return PageNumber 当前页码，不填默认为1（首页）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码，不填默认为1（首页）
     * @param PageNumber 当前页码，不填默认为1（首页）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyRequest(DescribePolicyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
        if (source.SearchMode != null) {
            this.SearchMode = new String(source.SearchMode);
        }
        if (source.SearchWords != null) {
            this.SearchWords = new String(source.SearchWords);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);
        this.setParamSimple(map, prefix + "SearchMode", this.SearchMode);
        this.setParamSimple(map, prefix + "SearchWords", this.SearchWords);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

