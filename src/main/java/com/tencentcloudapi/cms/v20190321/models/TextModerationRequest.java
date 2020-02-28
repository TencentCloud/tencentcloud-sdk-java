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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationRequest extends AbstractModel{

    /**
    * 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。 
     * @return Content 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
     * @param Content 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

