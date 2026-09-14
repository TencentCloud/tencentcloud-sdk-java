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

public class CreateLabelRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>标签名称（长度不小于 1 个字符）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标签值（标准词 + 同义词列表），其中 term_id 由后台生成、创建时留空</p>
    */
    @SerializedName("TermList")
    @Expose
    private LabelTerm [] TermList;

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
     * Get <p>标签名称（长度不小于 1 个字符）</p> 
     * @return Name <p>标签名称（长度不小于 1 个字符）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标签名称（长度不小于 1 个字符）</p>
     * @param Name <p>标签名称（长度不小于 1 个字符）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标签值（标准词 + 同义词列表），其中 term_id 由后台生成、创建时留空</p> 
     * @return TermList <p>标签值（标准词 + 同义词列表），其中 term_id 由后台生成、创建时留空</p>
     */
    public LabelTerm [] getTermList() {
        return this.TermList;
    }

    /**
     * Set <p>标签值（标准词 + 同义词列表），其中 term_id 由后台生成、创建时留空</p>
     * @param TermList <p>标签值（标准词 + 同义词列表），其中 term_id 由后台生成、创建时留空</p>
     */
    public void setTermList(LabelTerm [] TermList) {
        this.TermList = TermList;
    }

    public CreateLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLabelRequest(CreateLabelRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TermList != null) {
            this.TermList = new LabelTerm[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new LabelTerm(source.TermList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);

    }
}

