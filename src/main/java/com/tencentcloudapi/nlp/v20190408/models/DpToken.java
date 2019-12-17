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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DpToken extends AbstractModel{

    /**
    * 当前词父节点的序号
    */
    @SerializedName("HeadId")
    @Expose
    private Long HeadId;

    /**
    * 基础词的序号
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 句法依存关系的类型
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
    * 基础词
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
     * Get 当前词父节点的序号 
     * @return HeadId 当前词父节点的序号
     */
    public Long getHeadId() {
        return this.HeadId;
    }

    /**
     * Set 当前词父节点的序号
     * @param HeadId 当前词父节点的序号
     */
    public void setHeadId(Long HeadId) {
        this.HeadId = HeadId;
    }

    /**
     * Get 基础词的序号 
     * @return Id 基础词的序号
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 基础词的序号
     * @param Id 基础词的序号
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 句法依存关系的类型 
     * @return Relation 句法依存关系的类型
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 句法依存关系的类型
     * @param Relation 句法依存关系的类型
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    /**
     * Get 基础词 
     * @return Word 基础词
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 基础词
     * @param Word 基础词
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeadId", this.HeadId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Relation", this.Relation);
        this.setParamSimple(map, prefix + "Word", this.Word);

    }
}

