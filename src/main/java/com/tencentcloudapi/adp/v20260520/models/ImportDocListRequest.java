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

public class ImportDocListRequest extends AbstractModel {

    /**
    * <p>待导入文档列表（数量：1~20）</p>
    */
    @SerializedName("DocList")
    @Expose
    private DocImportSpec [] DocList;

    /**
    * <p>知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
     * Get <p>待导入文档列表（数量：1~20）</p> 
     * @return DocList <p>待导入文档列表（数量：1~20）</p>
     */
    public DocImportSpec [] getDocList() {
        return this.DocList;
    }

    /**
     * Set <p>待导入文档列表（数量：1~20）</p>
     * @param DocList <p>待导入文档列表（数量：1~20）</p>
     */
    public void setDocList(DocImportSpec [] DocList) {
        this.DocList = DocList;
    }

    /**
     * Get <p>知识库 ID</p> 
     * @return KbId <p>知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>知识库 ID</p>
     * @param KbId <p>知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    public ImportDocListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportDocListRequest(ImportDocListRequest source) {
        if (source.DocList != null) {
            this.DocList = new DocImportSpec[source.DocList.length];
            for (int i = 0; i < source.DocList.length; i++) {
                this.DocList[i] = new DocImportSpec(source.DocList[i]);
            }
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DocList.", this.DocList);
        this.setParamSimple(map, prefix + "KbId", this.KbId);

    }
}

