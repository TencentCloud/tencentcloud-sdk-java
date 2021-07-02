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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Conclusion extends AbstractModel{

    /**
    * 原文文本内容
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 病症列表
    */
    @SerializedName("SymptomList")
    @Expose
    private Symptom [] SymptomList;

    /**
     * Get 原文文本内容 
     * @return Text 原文文本内容
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 原文文本内容
     * @param Text 原文文本内容
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 病症列表 
     * @return SymptomList 病症列表
     */
    public Symptom [] getSymptomList() {
        return this.SymptomList;
    }

    /**
     * Set 病症列表
     * @param SymptomList 病症列表
     */
    public void setSymptomList(Symptom [] SymptomList) {
        this.SymptomList = SymptomList;
    }

    public Conclusion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Conclusion(Conclusion source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SymptomList != null) {
            this.SymptomList = new Symptom[source.SymptomList.length];
            for (int i = 0; i < source.SymptomList.length; i++) {
                this.SymptomList[i] = new Symptom(source.SymptomList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "SymptomList.", this.SymptomList);

    }
}

