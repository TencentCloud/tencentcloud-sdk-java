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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditKeywordLibInfo extends AbstractModel {

    /**
    * <p>词库 Id。</p>
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * <p>自定义词库名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义词库描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。</li></ol>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>处理建议。<br>可取值：Review 疑似，Block 违规。</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>匹配模式。<br>可取值：ExactMatch 精确匹配， FuzzyMatch 模糊匹配。</p>
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
     * Get <p>词库 Id。</p> 
     * @return LibId <p>词库 Id。</p>
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set <p>词库 Id。</p>
     * @param LibId <p>词库 Id。</p>
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get <p>自定义词库名称。</p> 
     * @return Name <p>自定义词库名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义词库名称。</p>
     * @param Name <p>自定义词库名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义词库描述。</p> 
     * @return Description <p>自定义词库描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>自定义词库描述。</p>
     * @param Description <p>自定义词库描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。</li></ol> 
     * @return CreateTime <p>创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。</li></ol>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。</li></ol>
     * @param CreateTime <p>创建时间。UTC 格式，例如：2018-11-29T19:00:00Z。<br>注意：</p><ol><li>北京时间值为 UTC 时间值 + 8 小时，格式按照 ISO 8601 标准表示。</li></ol>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>处理建议。<br>可取值：Review 疑似，Block 违规。</p> 
     * @return Suggestion <p>处理建议。<br>可取值：Review 疑似，Block 违规。</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>处理建议。<br>可取值：Review 疑似，Block 违规。</p>
     * @param Suggestion <p>处理建议。<br>可取值：Review 疑似，Block 违规。</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>匹配模式。<br>可取值：ExactMatch 精确匹配， FuzzyMatch 模糊匹配。</p> 
     * @return MatchType <p>匹配模式。<br>可取值：ExactMatch 精确匹配， FuzzyMatch 模糊匹配。</p>
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>匹配模式。<br>可取值：ExactMatch 精确匹配， FuzzyMatch 模糊匹配。</p>
     * @param MatchType <p>匹配模式。<br>可取值：ExactMatch 精确匹配， FuzzyMatch 模糊匹配。</p>
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    public AuditKeywordLibInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditKeywordLibInfo(AuditKeywordLibInfo source) {
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);

    }
}

