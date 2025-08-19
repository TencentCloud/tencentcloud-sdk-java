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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionCardIndex extends AbstractModel {

    /**
    * 唯一标识
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 选项卡索引
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 唯一标识 
     * @return RecordId 唯一标识
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 唯一标识
     * @param RecordId 唯一标识
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 选项卡索引 
     * @return Index 选项卡索引
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 选项卡索引
     * @param Index 选项卡索引
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public OptionCardIndex() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionCardIndex(OptionCardIndex source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

