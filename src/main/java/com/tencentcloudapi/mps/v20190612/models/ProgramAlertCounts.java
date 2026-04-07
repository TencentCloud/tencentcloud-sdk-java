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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramAlertCounts extends AbstractModel {

    /**
    * <p>Program ID。</p>
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * <p>Program名称。</p>
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * <p>告警分类。</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>出现次数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>更新时间。</p>
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private Long LastModifiedTime;

    /**
     * Get <p>Program ID。</p> 
     * @return ProgramId <p>Program ID。</p>
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set <p>Program ID。</p>
     * @param ProgramId <p>Program ID。</p>
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get <p>Program名称。</p> 
     * @return ProgramName <p>Program名称。</p>
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set <p>Program名称。</p>
     * @param ProgramName <p>Program名称。</p>
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get <p>告警分类。</p> 
     * @return Category <p>告警分类。</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>告警分类。</p>
     * @param Category <p>告警分类。</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>出现次数</p> 
     * @return Count <p>出现次数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>出现次数</p>
     * @param Count <p>出现次数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>更新时间。</p> 
     * @return LastModifiedTime <p>更新时间。</p>
     */
    public Long getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set <p>更新时间。</p>
     * @param LastModifiedTime <p>更新时间。</p>
     */
    public void setLastModifiedTime(Long LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    public ProgramAlertCounts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramAlertCounts(ProgramAlertCounts source) {
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.LastModifiedTime != null) {
            this.LastModifiedTime = new Long(source.LastModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);

    }
}

