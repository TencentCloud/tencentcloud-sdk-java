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

public class DescribeConflictQARequest extends AbstractModel {

    /**
    * <p>冲突组 ID</p>
    */
    @SerializedName("ConflictGroupId")
    @Expose
    private String ConflictGroupId;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

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

    /**
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    public DescribeConflictQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConflictQARequest(DescribeConflictQARequest source) {
        if (source.ConflictGroupId != null) {
            this.ConflictGroupId = new String(source.ConflictGroupId);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictGroupId", this.ConflictGroupId);
        this.setParamSimple(map, prefix + "KbId", this.KbId);

    }
}

