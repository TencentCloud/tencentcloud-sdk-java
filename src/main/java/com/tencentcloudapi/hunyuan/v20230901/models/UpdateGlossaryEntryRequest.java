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

public class UpdateGlossaryEntryRequest extends AbstractModel {

    /**
    * 术语库 ID
    */
    @SerializedName("GlossaryId")
    @Expose
    private String GlossaryId;

    /**
    * 需要更新的术语条目列表，单次请求限制100个
    */
    @SerializedName("Entries")
    @Expose
    private GlossaryEntryUpdateItem [] Entries;

    /**
     * Get 术语库 ID 
     * @return GlossaryId 术语库 ID
     */
    public String getGlossaryId() {
        return this.GlossaryId;
    }

    /**
     * Set 术语库 ID
     * @param GlossaryId 术语库 ID
     */
    public void setGlossaryId(String GlossaryId) {
        this.GlossaryId = GlossaryId;
    }

    /**
     * Get 需要更新的术语条目列表，单次请求限制100个 
     * @return Entries 需要更新的术语条目列表，单次请求限制100个
     */
    public GlossaryEntryUpdateItem [] getEntries() {
        return this.Entries;
    }

    /**
     * Set 需要更新的术语条目列表，单次请求限制100个
     * @param Entries 需要更新的术语条目列表，单次请求限制100个
     */
    public void setEntries(GlossaryEntryUpdateItem [] Entries) {
        this.Entries = Entries;
    }

    public UpdateGlossaryEntryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGlossaryEntryRequest(UpdateGlossaryEntryRequest source) {
        if (source.GlossaryId != null) {
            this.GlossaryId = new String(source.GlossaryId);
        }
        if (source.Entries != null) {
            this.Entries = new GlossaryEntryUpdateItem[source.Entries.length];
            for (int i = 0; i < source.Entries.length; i++) {
                this.Entries[i] = new GlossaryEntryUpdateItem(source.Entries[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlossaryId", this.GlossaryId);
        this.setParamArrayObj(map, prefix + "Entries.", this.Entries);

    }
}

