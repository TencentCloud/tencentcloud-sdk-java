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

public class Entity extends AbstractModel{

    /**
    * 基础词。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 基础词在NormalText中的起始位置。
    */
    @SerializedName("BeginOffset")
    @Expose
    private Long BeginOffset;

    /**
    * 基础词的长度。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 实体类型的标准名字。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 类型名字的自然语言表达。（中文或英文）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 基础词。 
     * @return Word 基础词。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 基础词。
     * @param Word 基础词。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 基础词在NormalText中的起始位置。 
     * @return BeginOffset 基础词在NormalText中的起始位置。
     */
    public Long getBeginOffset() {
        return this.BeginOffset;
    }

    /**
     * Set 基础词在NormalText中的起始位置。
     * @param BeginOffset 基础词在NormalText中的起始位置。
     */
    public void setBeginOffset(Long BeginOffset) {
        this.BeginOffset = BeginOffset;
    }

    /**
     * Get 基础词的长度。 
     * @return Length 基础词的长度。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 基础词的长度。
     * @param Length 基础词的长度。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 实体类型的标准名字。 
     * @return Type 实体类型的标准名字。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实体类型的标准名字。
     * @param Type 实体类型的标准名字。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 类型名字的自然语言表达。（中文或英文） 
     * @return Name 类型名字的自然语言表达。（中文或英文）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型名字的自然语言表达。（中文或英文）
     * @param Name 类型名字的自然语言表达。（中文或英文）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public Entity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Entity(Entity source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.BeginOffset != null) {
            this.BeginOffset = new Long(source.BeginOffset);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "BeginOffset", this.BeginOffset);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

