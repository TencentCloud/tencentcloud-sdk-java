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

public class AppSharedKnowledgeInfo extends AbstractModel {

    /**
    * 共享知识库ID
    */
    @SerializedName("KnowledgeId")
    @Expose
    private String KnowledgeId;

    /**
    * 共享知识库名称
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
     * Get 共享知识库ID 
     * @return KnowledgeId 共享知识库ID
     */
    public String getKnowledgeId() {
        return this.KnowledgeId;
    }

    /**
     * Set 共享知识库ID
     * @param KnowledgeId 共享知识库ID
     */
    public void setKnowledgeId(String KnowledgeId) {
        this.KnowledgeId = KnowledgeId;
    }

    /**
     * Get 共享知识库名称 
     * @return KnowledgeName 共享知识库名称
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 共享知识库名称
     * @param KnowledgeName 共享知识库名称
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    public AppSharedKnowledgeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppSharedKnowledgeInfo(AppSharedKnowledgeInfo source) {
        if (source.KnowledgeId != null) {
            this.KnowledgeId = new String(source.KnowledgeId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeId", this.KnowledgeId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);

    }
}

