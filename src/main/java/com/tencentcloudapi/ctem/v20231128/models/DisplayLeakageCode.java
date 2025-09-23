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
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * 事件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 风险等级：1-低危 2-中危 3-高危 4-严重 5-误报
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 仓库名称
    */
    @SerializedName("HubName")
    @Expose
    private String HubName;

    /**
    * 链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 截图
    */
    @SerializedName("Screenshot")
    @Expose
    private String Screenshot;

    /**
    * 建议
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 处置状态：0-待处理 1-处理中 2-已处理
    */
    @SerializedName("HandlingStatus")
    @Expose
    private Long HandlingStatus;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get 事件名称 
     * @return Name 事件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称
     * @param Name 事件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件描述 
     * @return Description 事件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述
     * @param Description 事件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源 
     * @return Source 数据源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 数据源
     * @param Source 数据源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 风险等级：1-低危 2-中危 3-高危 4-严重 5-误报 
     * @return RiskLevel 风险等级：1-低危 2-中危 3-高危 4-严重 5-误报
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级：1-低危 2-中危 3-高危 4-严重 5-误报
     * @param RiskLevel 风险等级：1-低危 2-中危 3-高危 4-严重 5-误报
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 仓库名称 
     * @return HubName 仓库名称
     */
    public String getHubName() {
        return this.HubName;
    }

    /**
     * Set 仓库名称
     * @param HubName 仓库名称
     */
    public void setHubName(String HubName) {
        this.HubName = HubName;
    }

    /**
     * Get 链接 
     * @return Url 链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 链接
     * @param Url 链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 截图 
     * @return Screenshot 截图
     */
    public String getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set 截图
     * @param Screenshot 截图
     */
    public void setScreenshot(String Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get 建议 
     * @return Suggestion 建议
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议
     * @param Suggestion 建议
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 关键词 
     * @return Keyword 关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键词
     * @param Keyword 关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 处置状态：0-待处理 1-处理中 2-已处理 
     * @return HandlingStatus 处置状态：0-待处理 1-处理中 2-已处理
     */
    public Long getHandlingStatus() {
        return this.HandlingStatus;
    }

    /**
     * Set 处置状态：0-待处理 1-处理中 2-已处理
     * @param HandlingStatus 处置状态：0-待处理 1-处理中 2-已处理
     */
    public void setHandlingStatus(Long HandlingStatus) {
        this.HandlingStatus = HandlingStatus;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    }
}

