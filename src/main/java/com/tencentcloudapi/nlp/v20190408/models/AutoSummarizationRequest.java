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

public class AutoSummarizationRequest  extends AbstractModel{

    /**
    * 待处理的文本（仅支持UTF-8格式，不超过2000字）
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 指定摘要的长度（默认值为200）
注：为保证摘要的可读性，最终生成的摘要长度并不会严格遵循这个值，会有略微的浮动
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
     * 获取待处理的文本（仅支持UTF-8格式，不超过2000字）
     * @return Text 待处理的文本（仅支持UTF-8格式，不超过2000字）
     */
    public String getText() {
        return this.Text;
    }

    /**
     * 设置待处理的文本（仅支持UTF-8格式，不超过2000字）
     * @param Text 待处理的文本（仅支持UTF-8格式，不超过2000字）
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * 获取指定摘要的长度（默认值为200）
注：为保证摘要的可读性，最终生成的摘要长度并不会严格遵循这个值，会有略微的浮动
     * @return Length 指定摘要的长度（默认值为200）
注：为保证摘要的可读性，最终生成的摘要长度并不会严格遵循这个值，会有略微的浮动
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * 设置指定摘要的长度（默认值为200）
注：为保证摘要的可读性，最终生成的摘要长度并不会严格遵循这个值，会有略微的浮动
     * @param Length 指定摘要的长度（默认值为200）
注：为保证摘要的可读性，最终生成的摘要长度并不会严格遵循这个值，会有略微的浮动
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

