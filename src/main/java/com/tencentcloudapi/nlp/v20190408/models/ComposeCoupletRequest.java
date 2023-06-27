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

public class ComposeCoupletRequest extends AbstractModel{

    /**
    * 生成对联的关键词。长度需>=2，当长度>2时，自动截取前两个字作为关键字。内容需为常用汉字（不含有数字、英文、韩语、日语、符号等等其他）。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 返回的文本结果为繁体还是简体。0：简体；1：繁体。默认为0。
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
     * Get 生成对联的关键词。长度需>=2，当长度>2时，自动截取前两个字作为关键字。内容需为常用汉字（不含有数字、英文、韩语、日语、符号等等其他）。 
     * @return Text 生成对联的关键词。长度需>=2，当长度>2时，自动截取前两个字作为关键字。内容需为常用汉字（不含有数字、英文、韩语、日语、符号等等其他）。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 生成对联的关键词。长度需>=2，当长度>2时，自动截取前两个字作为关键字。内容需为常用汉字（不含有数字、英文、韩语、日语、符号等等其他）。
     * @param Text 生成对联的关键词。长度需>=2，当长度>2时，自动截取前两个字作为关键字。内容需为常用汉字（不含有数字、英文、韩语、日语、符号等等其他）。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 返回的文本结果为繁体还是简体。0：简体；1：繁体。默认为0。 
     * @return TargetType 返回的文本结果为繁体还是简体。0：简体；1：繁体。默认为0。
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 返回的文本结果为繁体还是简体。0：简体；1：繁体。默认为0。
     * @param TargetType 返回的文本结果为繁体还是简体。0：简体；1：繁体。默认为0。
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    public ComposeCoupletRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeCoupletRequest(ComposeCoupletRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);

    }
}

