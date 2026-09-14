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

public class DeleteLabelListRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>待删除标签 ID 列表（数量：1~20）</p>
    */
    @SerializedName("LabelIdList")
    @Expose
    private String [] LabelIdList;

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
     * Get <p>待删除标签 ID 列表（数量：1~20）</p> 
     * @return LabelIdList <p>待删除标签 ID 列表（数量：1~20）</p>
     */
    public String [] getLabelIdList() {
        return this.LabelIdList;
    }

    /**
     * Set <p>待删除标签 ID 列表（数量：1~20）</p>
     * @param LabelIdList <p>待删除标签 ID 列表（数量：1~20）</p>
     */
    public void setLabelIdList(String [] LabelIdList) {
        this.LabelIdList = LabelIdList;
    }

    public DeleteLabelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLabelListRequest(DeleteLabelListRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.LabelIdList != null) {
            this.LabelIdList = new String[source.LabelIdList.length];
            for (int i = 0; i < source.LabelIdList.length; i++) {
                this.LabelIdList[i] = new String(source.LabelIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArraySimple(map, prefix + "LabelIdList.", this.LabelIdList);

    }
}

