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

public class CreateGlossaryEntriesRequest extends AbstractModel {

    /**
    * 术语库 ID。可通过 DescribeGlossaries 接口获取。
    */
    @SerializedName("GlossaryId")
    @Expose
    private String GlossaryId;

    /**
    * 术语条目列表。单次最多 100 个。
    */
    @SerializedName("Entries")
    @Expose
    private GlossaryEntryInput [] Entries;

    /**
     * Get 术语库 ID。可通过 DescribeGlossaries 接口获取。 
     * @return GlossaryId 术语库 ID。可通过 DescribeGlossaries 接口获取。
     */
    public String getGlossaryId() {
        return this.GlossaryId;
    }

    /**
     * Set 术语库 ID。可通过 DescribeGlossaries 接口获取。
     * @param GlossaryId 术语库 ID。可通过 DescribeGlossaries 接口获取。
     */
    public void setGlossaryId(String GlossaryId) {
        this.GlossaryId = GlossaryId;
    }

    /**
     * Get 术语条目列表。单次最多 100 个。 
     * @return Entries 术语条目列表。单次最多 100 个。
     */
    public GlossaryEntryInput [] getEntries() {
        return this.Entries;
    }

    /**
     * Set 术语条目列表。单次最多 100 个。
     * @param Entries 术语条目列表。单次最多 100 个。
     */
    public void setEntries(GlossaryEntryInput [] Entries) {
        this.Entries = Entries;
    }

    public CreateGlossaryEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlossaryEntriesRequest(CreateGlossaryEntriesRequest source) {
        if (source.GlossaryId != null) {
            this.GlossaryId = new String(source.GlossaryId);
        }
        if (source.Entries != null) {
            this.Entries = new GlossaryEntryInput[source.Entries.length];
            for (int i = 0; i < source.Entries.length; i++) {
                this.Entries[i] = new GlossaryEntryInput(source.Entries[i]);
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

