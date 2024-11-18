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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyEmbedIntervalRequest extends AbstractModel {

    /**
    * 分享项目id，必选
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 分享页面id，嵌出看板时此为空值0，ChatBI嵌出时不传

    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 需要申请延期的Token
    */
    @SerializedName("BIToken")
    @Expose
    private String BIToken;

    /**
    * 备用字段
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * embed：页面/看板嵌出
chatBIEmbed：ChatBI嵌出
    */
    @SerializedName("Intention")
    @Expose
    private String Intention;

    /**
    * panel, 看板；page，页面
project，ChatBI嵌出时
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
     * Get 分享项目id，必选 
     * @return ProjectId 分享项目id，必选
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 分享项目id，必选
     * @param ProjectId 分享项目id，必选
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 分享页面id，嵌出看板时此为空值0，ChatBI嵌出时不传
 
     * @return PageId 分享页面id，嵌出看板时此为空值0，ChatBI嵌出时不传

     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 分享页面id，嵌出看板时此为空值0，ChatBI嵌出时不传

     * @param PageId 分享页面id，嵌出看板时此为空值0，ChatBI嵌出时不传

     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 需要申请延期的Token 
     * @return BIToken 需要申请延期的Token
     */
    public String getBIToken() {
        return this.BIToken;
    }

    /**
     * Set 需要申请延期的Token
     * @param BIToken 需要申请延期的Token
     */
    public void setBIToken(String BIToken) {
        this.BIToken = BIToken;
    }

    /**
     * Get 备用字段 
     * @return ExtraParam 备用字段
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 备用字段
     * @param ExtraParam 备用字段
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get embed：页面/看板嵌出
chatBIEmbed：ChatBI嵌出 
     * @return Intention embed：页面/看板嵌出
chatBIEmbed：ChatBI嵌出
     */
    public String getIntention() {
        return this.Intention;
    }

    /**
     * Set embed：页面/看板嵌出
chatBIEmbed：ChatBI嵌出
     * @param Intention embed：页面/看板嵌出
chatBIEmbed：ChatBI嵌出
     */
    public void setIntention(String Intention) {
        this.Intention = Intention;
    }

    /**
     * Get panel, 看板；page，页面
project，ChatBI嵌出时 
     * @return Scope panel, 看板；page，页面
project，ChatBI嵌出时
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set panel, 看板；page，页面
project，ChatBI嵌出时
     * @param Scope panel, 看板；page，页面
project，ChatBI嵌出时
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public ApplyEmbedIntervalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyEmbedIntervalRequest(ApplyEmbedIntervalRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.BIToken != null) {
            this.BIToken = new String(source.BIToken);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.Intention != null) {
            this.Intention = new String(source.Intention);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "BIToken", this.BIToken);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "Intention", this.Intention);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

