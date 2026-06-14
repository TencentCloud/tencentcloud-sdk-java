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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlossaryEntryInput extends AbstractModel {

    /**
    * 术语条目 ID。可通过 DescribeGlossaryEntries 接口获取。
    */
    @SerializedName("EntryId")
    @Expose
    private String EntryId;

    /**
    * 源语言术语。最大 1000 字符。不传则保持不变。
    */
    @SerializedName("SourceTerm")
    @Expose
    private String SourceTerm;

    /**
    * 目标语言术语。最大 1000 字符。不传则保持不变。
    */
    @SerializedName("TargetTerm")
    @Expose
    private String TargetTerm;

    /**
     * Get 术语条目 ID。可通过 DescribeGlossaryEntries 接口获取。 
     * @return EntryId 术语条目 ID。可通过 DescribeGlossaryEntries 接口获取。
     */
    public String getEntryId() {
        return this.EntryId;
    }

    /**
     * Set 术语条目 ID。可通过 DescribeGlossaryEntries 接口获取。
     * @param EntryId 术语条目 ID。可通过 DescribeGlossaryEntries 接口获取。
     */
    public void setEntryId(String EntryId) {
        this.EntryId = EntryId;
    }

    /**
     * Get 源语言术语。最大 1000 字符。不传则保持不变。 
     * @return SourceTerm 源语言术语。最大 1000 字符。不传则保持不变。
     */
    public String getSourceTerm() {
        return this.SourceTerm;
    }

    /**
     * Set 源语言术语。最大 1000 字符。不传则保持不变。
     * @param SourceTerm 源语言术语。最大 1000 字符。不传则保持不变。
     */
    public void setSourceTerm(String SourceTerm) {
        this.SourceTerm = SourceTerm;
    }

    /**
     * Get 目标语言术语。最大 1000 字符。不传则保持不变。 
     * @return TargetTerm 目标语言术语。最大 1000 字符。不传则保持不变。
     */
    public String getTargetTerm() {
        return this.TargetTerm;
    }

    /**
     * Set 目标语言术语。最大 1000 字符。不传则保持不变。
     * @param TargetTerm 目标语言术语。最大 1000 字符。不传则保持不变。
     */
    public void setTargetTerm(String TargetTerm) {
        this.TargetTerm = TargetTerm;
    }

    public ModifyGlossaryEntryInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlossaryEntryInput(ModifyGlossaryEntryInput source) {
        if (source.EntryId != null) {
            this.EntryId = new String(source.EntryId);
        }
        if (source.SourceTerm != null) {
            this.SourceTerm = new String(source.SourceTerm);
        }
        if (source.TargetTerm != null) {
            this.TargetTerm = new String(source.TargetTerm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntryId", this.EntryId);
        this.setParamSimple(map, prefix + "SourceTerm", this.SourceTerm);
        this.setParamSimple(map, prefix + "TargetTerm", this.TargetTerm);

    }
}

