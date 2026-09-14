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

public class DeleteDocListRequest extends AbstractModel {

    /**
    * <p>待删除的文档 ID 列表（数量：1~20）</p>
    */
    @SerializedName("DocIdList")
    @Expose
    private String [] DocIdList;

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
     * Get <p>待删除的文档 ID 列表（数量：1~20）</p> 
     * @return DocIdList <p>待删除的文档 ID 列表（数量：1~20）</p>
     */
    public String [] getDocIdList() {
        return this.DocIdList;
    }

    /**
     * Set <p>待删除的文档 ID 列表（数量：1~20）</p>
     * @param DocIdList <p>待删除的文档 ID 列表（数量：1~20）</p>
     */
    public void setDocIdList(String [] DocIdList) {
        this.DocIdList = DocIdList;
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

    public DeleteDocListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDocListRequest(DeleteDocListRequest source) {
        if (source.DocIdList != null) {
            this.DocIdList = new String[source.DocIdList.length];
            for (int i = 0; i < source.DocIdList.length; i++) {
                this.DocIdList[i] = new String(source.DocIdList[i]);
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
        this.setParamArraySimple(map, prefix + "DocIdList.", this.DocIdList);
        this.setParamSimple(map, prefix + "KbId", this.KbId);

    }
}

