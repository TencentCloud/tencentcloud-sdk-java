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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayLeakageCode extends AbstractModel {

    /**
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>事件名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>事件描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>风险等级：1-低危 2-中危 3-高危 4-严重 5-误报</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>仓库名称</p>
    */
    @SerializedName("HubName")
    @Expose
    private String HubName;

    /**
    * <p>链接</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>截图</p>
    */
    @SerializedName("Screenshot")
    @Expose
    private String Screenshot;

    /**
    * <p>建议</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>处置状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 已处理</li><li>3： 误报</li></ul>
    */
    @SerializedName("HandlingStatus")
    @Expose
    private Long HandlingStatus;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>仓库命名空间</p>
    */
    @SerializedName("RepoNamespace")
    @Expose
    private String RepoNamespace;

    /**
    * <p>仓库名称</p>
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>作者名称</p>
    */
    @SerializedName("AuthorName")
    @Expose
    private String AuthorName;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>事件名称</p> 
     * @return Name <p>事件名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>事件名称</p>
     * @param Name <p>事件名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>事件描述</p> 
     * @return Description <p>事件描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>事件描述</p>
     * @param Description <p>事件描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据源</p> 
     * @return Source <p>数据源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>数据源</p>
     * @param Source <p>数据源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>风险等级：1-低危 2-中危 3-高危 4-严重 5-误报</p> 
     * @return RiskLevel <p>风险等级：1-低危 2-中危 3-高危 4-严重 5-误报</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级：1-低危 2-中危 3-高危 4-严重 5-误报</p>
     * @param RiskLevel <p>风险等级：1-低危 2-中危 3-高危 4-严重 5-误报</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>仓库名称</p> 
     * @return HubName <p>仓库名称</p>
     */
    public String getHubName() {
        return this.HubName;
    }

    /**
     * Set <p>仓库名称</p>
     * @param HubName <p>仓库名称</p>
     */
    public void setHubName(String HubName) {
        this.HubName = HubName;
    }

    /**
     * Get <p>链接</p> 
     * @return Url <p>链接</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>链接</p>
     * @param Url <p>链接</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>截图</p> 
     * @return Screenshot <p>截图</p>
     */
    public String getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set <p>截图</p>
     * @param Screenshot <p>截图</p>
     */
    public void setScreenshot(String Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get <p>建议</p> 
     * @return Suggestion <p>建议</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>建议</p>
     * @param Suggestion <p>建议</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>关键词</p> 
     * @return Keyword <p>关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键词</p>
     * @param Keyword <p>关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>处置状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 已处理</li><li>3： 误报</li></ul> 
     * @return HandlingStatus <p>处置状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 已处理</li><li>3： 误报</li></ul>
     */
    public Long getHandlingStatus() {
        return this.HandlingStatus;
    }

    /**
     * Set <p>处置状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 已处理</li><li>3： 误报</li></ul>
     * @param HandlingStatus <p>处置状态</p><p>枚举值：</p><ul><li>0： 待处理</li><li>1： 处理中</li><li>2： 已处理</li><li>3： 误报</li></ul>
     */
    public void setHandlingStatus(Long HandlingStatus) {
        this.HandlingStatus = HandlingStatus;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>仓库命名空间</p> 
     * @return RepoNamespace <p>仓库命名空间</p>
     */
    public String getRepoNamespace() {
        return this.RepoNamespace;
    }

    /**
     * Set <p>仓库命名空间</p>
     * @param RepoNamespace <p>仓库命名空间</p>
     */
    public void setRepoNamespace(String RepoNamespace) {
        this.RepoNamespace = RepoNamespace;
    }

    /**
     * Get <p>仓库名称</p> 
     * @return RepoName <p>仓库名称</p>
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>仓库名称</p>
     * @param RepoName <p>仓库名称</p>
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>作者名称</p> 
     * @return AuthorName <p>作者名称</p>
     */
    public String getAuthorName() {
        return this.AuthorName;
    }

    /**
     * Set <p>作者名称</p>
     * @param AuthorName <p>作者名称</p>
     */
    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public DisplayLeakageCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayLeakageCode(DisplayLeakageCode source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.HubName != null) {
            this.HubName = new String(source.HubName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new String(source.Screenshot);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.HandlingStatus != null) {
            this.HandlingStatus = new Long(source.HandlingStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RepoNamespace != null) {
            this.RepoNamespace = new String(source.RepoNamespace);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.AuthorName != null) {
            this.AuthorName = new String(source.AuthorName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "HubName", this.HubName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Screenshot", this.Screenshot);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "HandlingStatus", this.HandlingStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RepoNamespace", this.RepoNamespace);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "AuthorName", this.AuthorName);

    }
}

