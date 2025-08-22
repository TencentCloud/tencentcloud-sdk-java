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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClearEmbedTokenRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 主账号id
    */
    @SerializedName("UserCorpId")
    @Expose
    private String UserCorpId;

    /**
    * panel , page
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * page id
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 主账号id 
     * @return UserCorpId 主账号id
     */
    public String getUserCorpId() {
        return this.UserCorpId;
    }

    /**
     * Set 主账号id
     * @param UserCorpId 主账号id
     */
    public void setUserCorpId(String UserCorpId) {
        this.UserCorpId = UserCorpId;
    }

    /**
     * Get panel , page 
     * @return Scope panel , page
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set panel , page
     * @param Scope panel , page
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get page id 
     * @return PageId page id
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set page id
     * @param PageId page id
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    public ClearEmbedTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClearEmbedTokenRequest(ClearEmbedTokenRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UserCorpId != null) {
            this.UserCorpId = new String(source.UserCorpId);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserCorpId", this.UserCorpId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "PageId", this.PageId);

    }
}

