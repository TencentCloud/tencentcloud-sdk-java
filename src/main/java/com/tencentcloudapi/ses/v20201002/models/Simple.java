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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Simple extends AbstractModel{

    /**
    * Html代码。需要包含所有的代码信息，不要包含外部css，否则会导致显示格式错乱
    */
    @SerializedName("Html")
    @Expose
    private String Html;

    /**
    * 纯文本信息，如果没有Html，邮件中会直接显示纯文本；如果有Html，它代表邮件的纯文本样式
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get Html代码。需要包含所有的代码信息，不要包含外部css，否则会导致显示格式错乱 
     * @return Html Html代码。需要包含所有的代码信息，不要包含外部css，否则会导致显示格式错乱
     */
    public String getHtml() {
        return this.Html;
    }

    /**
     * Set Html代码。需要包含所有的代码信息，不要包含外部css，否则会导致显示格式错乱
     * @param Html Html代码。需要包含所有的代码信息，不要包含外部css，否则会导致显示格式错乱
     */
    public void setHtml(String Html) {
        this.Html = Html;
    }

    /**
     * Get 纯文本信息，如果没有Html，邮件中会直接显示纯文本；如果有Html，它代表邮件的纯文本样式 
     * @return Text 纯文本信息，如果没有Html，邮件中会直接显示纯文本；如果有Html，它代表邮件的纯文本样式
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 纯文本信息，如果没有Html，邮件中会直接显示纯文本；如果有Html，它代表邮件的纯文本样式
     * @param Text 纯文本信息，如果没有Html，邮件中会直接显示纯文本；如果有Html，它代表邮件的纯文本样式
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Html", this.Html);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

