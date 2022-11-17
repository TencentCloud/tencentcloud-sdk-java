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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CptIssueRank extends AbstractModel{

    /**
    * 模板名称
    */
    @SerializedName("CptName")
    @Expose
    private String CptName;

    /**
    * 名次
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * 颁发量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 应用名称
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * 应用ID
    */
    @SerializedName("ApplyId")
    @Expose
    private Long ApplyId;

    /**
     * Get 模板名称 
     * @return CptName 模板名称
     */
    public String getCptName() {
        return this.CptName;
    }

    /**
     * Set 模板名称
     * @param CptName 模板名称
     */
    public void setCptName(String CptName) {
        this.CptName = CptName;
    }

    /**
     * Get 名次 
     * @return Rank 名次
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set 名次
     * @param Rank 名次
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get 颁发量 
     * @return Count 颁发量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 颁发量
     * @param Count 颁发量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 应用名称 
     * @return ApplyName 应用名称
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set 应用名称
     * @param ApplyName 应用名称
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get 应用ID 
     * @return ApplyId 应用ID
     */
    public Long getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set 应用ID
     * @param ApplyId 应用ID
     */
    public void setApplyId(Long ApplyId) {
        this.ApplyId = ApplyId;
    }

    public CptIssueRank() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CptIssueRank(CptIssueRank source) {
        if (source.CptName != null) {
            this.CptName = new String(source.CptName);
        }
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.ApplyId != null) {
            this.ApplyId = new Long(source.ApplyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CptName", this.CptName);
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);

    }
}

