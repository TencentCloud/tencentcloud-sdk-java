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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSharedKnowledgeRequest extends AbstractModel {

    /**
    * 共享知识库业务ID
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * 共享知识库更新信息
    */
    @SerializedName("Info")
    @Expose
    private KnowledgeUpdateInfo Info;

    /**
     * Get 共享知识库业务ID 
     * @return KnowledgeBizId 共享知识库业务ID
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 共享知识库业务ID
     * @param KnowledgeBizId 共享知识库业务ID
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 共享知识库更新信息 
     * @return Info 共享知识库更新信息
     */
    public KnowledgeUpdateInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 共享知识库更新信息
     * @param Info 共享知识库更新信息
     */
    public void setInfo(KnowledgeUpdateInfo Info) {
        this.Info = Info;
    }

    public UpdateSharedKnowledgeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSharedKnowledgeRequest(UpdateSharedKnowledgeRequest source) {
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.Info != null) {
            this.Info = new KnowledgeUpdateInfo(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamObj(map, prefix + "Info.", this.Info);

    }
}

