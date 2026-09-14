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

public class ConflictQASummary extends AbstractModel {

    /**
    * <p>冲突组 ID</p>
    */
    @SerializedName("ConflictGroupId")
    @Expose
    private String ConflictGroupId;

    /**
     * Get <p>冲突组 ID</p> 
     * @return ConflictGroupId <p>冲突组 ID</p>
     */
    public String getConflictGroupId() {
        return this.ConflictGroupId;
    }

    /**
     * Set <p>冲突组 ID</p>
     * @param ConflictGroupId <p>冲突组 ID</p>
     */
    public void setConflictGroupId(String ConflictGroupId) {
        this.ConflictGroupId = ConflictGroupId;
    }

    public ConflictQASummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictQASummary(ConflictQASummary source) {
        if (source.ConflictGroupId != null) {
            this.ConflictGroupId = new String(source.ConflictGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictGroupId", this.ConflictGroupId);

    }
}

