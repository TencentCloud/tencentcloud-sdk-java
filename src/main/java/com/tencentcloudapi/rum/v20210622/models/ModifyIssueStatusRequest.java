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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIssueStatusRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Issue ID</p>
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * <p>状态动作，可选值：resolve、ignore、reopen</p>
    */
    @SerializedName("IssueAction")
    @Expose
    private String IssueAction;

    /**
    * <p>解决版本；当 IssueAction=resolve 时可传，不传则默认使用 latest_release</p>
    */
    @SerializedName("ResolvedRelease")
    @Expose
    private String ResolvedRelease;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Issue ID</p> 
     * @return IssueId <p>Issue ID</p>
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set <p>Issue ID</p>
     * @param IssueId <p>Issue ID</p>
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get <p>状态动作，可选值：resolve、ignore、reopen</p> 
     * @return IssueAction <p>状态动作，可选值：resolve、ignore、reopen</p>
     */
    public String getIssueAction() {
        return this.IssueAction;
    }

    /**
     * Set <p>状态动作，可选值：resolve、ignore、reopen</p>
     * @param IssueAction <p>状态动作，可选值：resolve、ignore、reopen</p>
     */
    public void setIssueAction(String IssueAction) {
        this.IssueAction = IssueAction;
    }

    /**
     * Get <p>解决版本；当 IssueAction=resolve 时可传，不传则默认使用 latest_release</p> 
     * @return ResolvedRelease <p>解决版本；当 IssueAction=resolve 时可传，不传则默认使用 latest_release</p>
     */
    public String getResolvedRelease() {
        return this.ResolvedRelease;
    }

    /**
     * Set <p>解决版本；当 IssueAction=resolve 时可传，不传则默认使用 latest_release</p>
     * @param ResolvedRelease <p>解决版本；当 IssueAction=resolve 时可传，不传则默认使用 latest_release</p>
     */
    public void setResolvedRelease(String ResolvedRelease) {
        this.ResolvedRelease = ResolvedRelease;
    }

    public ModifyIssueStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIssueStatusRequest(ModifyIssueStatusRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.IssueAction != null) {
            this.IssueAction = new String(source.IssueAction);
        }
        if (source.ResolvedRelease != null) {
            this.ResolvedRelease = new String(source.ResolvedRelease);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "IssueAction", this.IssueAction);
        this.setParamSimple(map, prefix + "ResolvedRelease", this.ResolvedRelease);

    }
}

