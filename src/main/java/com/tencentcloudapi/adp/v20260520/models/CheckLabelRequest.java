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

public class CheckLabelRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>待校验的标准词列表（数量：1~100）</p>
    */
    @SerializedName("TermList")
    @Expose
    private String [] TermList;

    /**
    * <p>标签 ID（在指定标签下校验标准词唯一性）</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

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
     * Get <p>待校验的标准词列表（数量：1~100）</p> 
     * @return TermList <p>待校验的标准词列表（数量：1~100）</p>
     */
    public String [] getTermList() {
        return this.TermList;
    }

    /**
     * Set <p>待校验的标准词列表（数量：1~100）</p>
     * @param TermList <p>待校验的标准词列表（数量：1~100）</p>
     */
    public void setTermList(String [] TermList) {
        this.TermList = TermList;
    }

    /**
     * Get <p>标签 ID（在指定标签下校验标准词唯一性）</p> 
     * @return LabelId <p>标签 ID（在指定标签下校验标准词唯一性）</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签 ID（在指定标签下校验标准词唯一性）</p>
     * @param LabelId <p>标签 ID（在指定标签下校验标准词唯一性）</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    public CheckLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckLabelRequest(CheckLabelRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.TermList != null) {
            this.TermList = new String[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new String(source.TermList[i]);
            }
        }
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArraySimple(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);

    }
}

