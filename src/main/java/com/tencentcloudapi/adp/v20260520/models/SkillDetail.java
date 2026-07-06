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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillDetail extends AbstractModel {

    /**
    * 调用情况摘要
    */
    @SerializedName("ReferenceSummaryList")
    @Expose
    private SkillReferenceSummary [] ReferenceSummaryList;

    /**
    * Skill 摘要
    */
    @SerializedName("SkillSummary")
    @Expose
    private SkillSummary SkillSummary;

    /**
    * 版本列表
    */
    @SerializedName("VersionList")
    @Expose
    private SkillVersion [] VersionList;

    /**
     * Get 调用情况摘要 
     * @return ReferenceSummaryList 调用情况摘要
     */
    public SkillReferenceSummary [] getReferenceSummaryList() {
        return this.ReferenceSummaryList;
    }

    /**
     * Set 调用情况摘要
     * @param ReferenceSummaryList 调用情况摘要
     */
    public void setReferenceSummaryList(SkillReferenceSummary [] ReferenceSummaryList) {
        this.ReferenceSummaryList = ReferenceSummaryList;
    }

    /**
     * Get Skill 摘要 
     * @return SkillSummary Skill 摘要
     */
    public SkillSummary getSkillSummary() {
        return this.SkillSummary;
    }

    /**
     * Set Skill 摘要
     * @param SkillSummary Skill 摘要
     */
    public void setSkillSummary(SkillSummary SkillSummary) {
        this.SkillSummary = SkillSummary;
    }

    /**
     * Get 版本列表 
     * @return VersionList 版本列表
     */
    public SkillVersion [] getVersionList() {
        return this.VersionList;
    }

    /**
     * Set 版本列表
     * @param VersionList 版本列表
     */
    public void setVersionList(SkillVersion [] VersionList) {
        this.VersionList = VersionList;
    }

    public SkillDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillDetail(SkillDetail source) {
        if (source.ReferenceSummaryList != null) {
            this.ReferenceSummaryList = new SkillReferenceSummary[source.ReferenceSummaryList.length];
            for (int i = 0; i < source.ReferenceSummaryList.length; i++) {
                this.ReferenceSummaryList[i] = new SkillReferenceSummary(source.ReferenceSummaryList[i]);
            }
        }
        if (source.SkillSummary != null) {
            this.SkillSummary = new SkillSummary(source.SkillSummary);
        }
        if (source.VersionList != null) {
            this.VersionList = new SkillVersion[source.VersionList.length];
            for (int i = 0; i < source.VersionList.length; i++) {
                this.VersionList[i] = new SkillVersion(source.VersionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReferenceSummaryList.", this.ReferenceSummaryList);
        this.setParamObj(map, prefix + "SkillSummary.", this.SkillSummary);
        this.setParamArrayObj(map, prefix + "VersionList.", this.VersionList);

    }
}

