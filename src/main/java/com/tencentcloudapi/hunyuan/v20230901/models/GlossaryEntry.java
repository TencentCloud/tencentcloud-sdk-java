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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlossaryEntry extends AbstractModel {

    /**
    * 源语言术语，限制1000字符

    */
    @SerializedName("SourceTerm")
    @Expose
    private String SourceTerm;

    /**
    * 目标语言术语，限制1000字符

    */
    @SerializedName("TargetTerm")
    @Expose
    private String TargetTerm;

    /**
    * 术语条目 ID
    */
    @SerializedName("EntryId")
    @Expose
    private String EntryId;

    /**
     * Get 源语言术语，限制1000字符
 
     * @return SourceTerm 源语言术语，限制1000字符

     */
    public String getSourceTerm() {
        return this.SourceTerm;
    }

    /**
     * Set 源语言术语，限制1000字符

     * @param SourceTerm 源语言术语，限制1000字符

     */
    public void setSourceTerm(String SourceTerm) {
        this.SourceTerm = SourceTerm;
    }

    /**
     * Get 目标语言术语，限制1000字符
 
     * @return TargetTerm 目标语言术语，限制1000字符

     */
    public String getTargetTerm() {
        return this.TargetTerm;
    }

    /**
     * Set 目标语言术语，限制1000字符

     * @param TargetTerm 目标语言术语，限制1000字符

     */
    public void setTargetTerm(String TargetTerm) {
        this.TargetTerm = TargetTerm;
    }

    /**
     * Get 术语条目 ID 
     * @return EntryId 术语条目 ID
     */
    public String getEntryId() {
        return this.EntryId;
    }

    /**
     * Set 术语条目 ID
     * @param EntryId 术语条目 ID
     */
    public void setEntryId(String EntryId) {
        this.EntryId = EntryId;
    }

    public GlossaryEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlossaryEntry(GlossaryEntry source) {
        if (source.SourceTerm != null) {
            this.SourceTerm = new String(source.SourceTerm);
        }
        if (source.TargetTerm != null) {
            this.TargetTerm = new String(source.TargetTerm);
        }
        if (source.EntryId != null) {
            this.EntryId = new String(source.EntryId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceTerm", this.SourceTerm);
        this.setParamSimple(map, prefix + "TargetTerm", this.TargetTerm);
        this.setParamSimple(map, prefix + "EntryId", this.EntryId);

    }
}

