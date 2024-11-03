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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionItem extends AbstractModel {

    /**
    * 匹配类型
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 起始模式
    */
    @SerializedName("KeyOrStartMat")
    @Expose
    private String KeyOrStartMat;

    /**
    * 结束模式
    */
    @SerializedName("EndMat")
    @Expose
    private String EndMat;

    /**
    * 起始偏移
    */
    @SerializedName("StartOffset")
    @Expose
    private String StartOffset;

    /**
    * 结束偏移
    */
    @SerializedName("EndOffset")
    @Expose
    private String EndOffset;

    /**
    * 数据源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 更新时间戳
    */
    @SerializedName("TsVersion")
    @Expose
    private String TsVersion;

    /**
    * SessionID
    */
    @SerializedName("SessionId")
    @Expose
    private Long SessionId;

    /**
    * Session名
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * Session是否正在被启用
    */
    @SerializedName("SessionInUsed")
    @Expose
    private Boolean SessionInUsed;

    /**
    * Session关联的CC规则ID
    */
    @SerializedName("RelatedRuleID")
    @Expose
    private Long [] RelatedRuleID;

    /**
     * Get 匹配类型 
     * @return Category 匹配类型
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 匹配类型
     * @param Category 匹配类型
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 起始模式 
     * @return KeyOrStartMat 起始模式
     */
    public String getKeyOrStartMat() {
        return this.KeyOrStartMat;
    }

    /**
     * Set 起始模式
     * @param KeyOrStartMat 起始模式
     */
    public void setKeyOrStartMat(String KeyOrStartMat) {
        this.KeyOrStartMat = KeyOrStartMat;
    }

    /**
     * Get 结束模式 
     * @return EndMat 结束模式
     */
    public String getEndMat() {
        return this.EndMat;
    }

    /**
     * Set 结束模式
     * @param EndMat 结束模式
     */
    public void setEndMat(String EndMat) {
        this.EndMat = EndMat;
    }

    /**
     * Get 起始偏移 
     * @return StartOffset 起始偏移
     */
    public String getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set 起始偏移
     * @param StartOffset 起始偏移
     */
    public void setStartOffset(String StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get 结束偏移 
     * @return EndOffset 结束偏移
     */
    public String getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set 结束偏移
     * @param EndOffset 结束偏移
     */
    public void setEndOffset(String EndOffset) {
        this.EndOffset = EndOffset;
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
     * Get 更新时间戳 
     * @return TsVersion 更新时间戳
     */
    public String getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 更新时间戳
     * @param TsVersion 更新时间戳
     */
    public void setTsVersion(String TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get SessionID 
     * @return SessionId SessionID
     */
    public Long getSessionId() {
        return this.SessionId;
    }

    /**
     * Set SessionID
     * @param SessionId SessionID
     */
    public void setSessionId(Long SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Session名 
     * @return SessionName Session名
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set Session名
     * @param SessionName Session名
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get Session是否正在被启用 
     * @return SessionInUsed Session是否正在被启用
     */
    public Boolean getSessionInUsed() {
        return this.SessionInUsed;
    }

    /**
     * Set Session是否正在被启用
     * @param SessionInUsed Session是否正在被启用
     */
    public void setSessionInUsed(Boolean SessionInUsed) {
        this.SessionInUsed = SessionInUsed;
    }

    /**
     * Get Session关联的CC规则ID 
     * @return RelatedRuleID Session关联的CC规则ID
     */
    public Long [] getRelatedRuleID() {
        return this.RelatedRuleID;
    }

    /**
     * Set Session关联的CC规则ID
     * @param RelatedRuleID Session关联的CC规则ID
     */
    public void setRelatedRuleID(Long [] RelatedRuleID) {
        this.RelatedRuleID = RelatedRuleID;
    }

    public SessionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionItem(SessionItem source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.KeyOrStartMat != null) {
            this.KeyOrStartMat = new String(source.KeyOrStartMat);
        }
        if (source.EndMat != null) {
            this.EndMat = new String(source.EndMat);
        }
        if (source.StartOffset != null) {
            this.StartOffset = new String(source.StartOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new String(source.EndOffset);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new String(source.TsVersion);
        }
        if (source.SessionId != null) {
            this.SessionId = new Long(source.SessionId);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.SessionInUsed != null) {
            this.SessionInUsed = new Boolean(source.SessionInUsed);
        }
        if (source.RelatedRuleID != null) {
            this.RelatedRuleID = new Long[source.RelatedRuleID.length];
            for (int i = 0; i < source.RelatedRuleID.length; i++) {
                this.RelatedRuleID[i] = new Long(source.RelatedRuleID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "KeyOrStartMat", this.KeyOrStartMat);
        this.setParamSimple(map, prefix + "EndMat", this.EndMat);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "SessionInUsed", this.SessionInUsed);
        this.setParamArraySimple(map, prefix + "RelatedRuleID.", this.RelatedRuleID);

    }
}

