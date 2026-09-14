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

public class DeleteQAListRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>待删除的 QA ID 列表（数量：1~20）</p>
    */
    @SerializedName("QaIdList")
    @Expose
    private String [] QaIdList;

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

    /**
     * Get <p>待删除的 QA ID 列表（数量：1~20）</p> 
     * @return QaIdList <p>待删除的 QA ID 列表（数量：1~20）</p>
     */
    public String [] getQaIdList() {
        return this.QaIdList;
    }

    /**
     * Set <p>待删除的 QA ID 列表（数量：1~20）</p>
     * @param QaIdList <p>待删除的 QA ID 列表（数量：1~20）</p>
     */
    public void setQaIdList(String [] QaIdList) {
        this.QaIdList = QaIdList;
    }

    public DeleteQAListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteQAListRequest(DeleteQAListRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.QaIdList != null) {
            this.QaIdList = new String[source.QaIdList.length];
            for (int i = 0; i < source.QaIdList.length; i++) {
                this.QaIdList[i] = new String(source.QaIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArraySimple(map, prefix + "QaIdList.", this.QaIdList);

    }
}

