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

public class ReceiverInputData extends AbstractModel{

    /**
    * 收件人邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 模板中的变量参数，请使用json.dump将json对象格式化为string类型。该对象是一组键值对，每个Key代表模板中的一个变量，模板中的变量使用{{键}}表示，相应的值在发送时会被替换为{{值}}。
注意：参数值不能是html等复杂类型的数据。TemplateData (整个 JSON 结构) 总长度限制为 800 bytes。
    */
    @SerializedName("TemplateData")
    @Expose
    private String TemplateData;

    /**
     * Get 收件人邮箱 
     * @return Email 收件人邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 收件人邮箱
     * @param Email 收件人邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 模板中的变量参数，请使用json.dump将json对象格式化为string类型。该对象是一组键值对，每个Key代表模板中的一个变量，模板中的变量使用{{键}}表示，相应的值在发送时会被替换为{{值}}。
注意：参数值不能是html等复杂类型的数据。TemplateData (整个 JSON 结构) 总长度限制为 800 bytes。 
     * @return TemplateData 模板中的变量参数，请使用json.dump将json对象格式化为string类型。该对象是一组键值对，每个Key代表模板中的一个变量，模板中的变量使用{{键}}表示，相应的值在发送时会被替换为{{值}}。
注意：参数值不能是html等复杂类型的数据。TemplateData (整个 JSON 结构) 总长度限制为 800 bytes。
     */
    public String getTemplateData() {
        return this.TemplateData;
    }

    /**
     * Set 模板中的变量参数，请使用json.dump将json对象格式化为string类型。该对象是一组键值对，每个Key代表模板中的一个变量，模板中的变量使用{{键}}表示，相应的值在发送时会被替换为{{值}}。
注意：参数值不能是html等复杂类型的数据。TemplateData (整个 JSON 结构) 总长度限制为 800 bytes。
     * @param TemplateData 模板中的变量参数，请使用json.dump将json对象格式化为string类型。该对象是一组键值对，每个Key代表模板中的一个变量，模板中的变量使用{{键}}表示，相应的值在发送时会被替换为{{值}}。
注意：参数值不能是html等复杂类型的数据。TemplateData (整个 JSON 结构) 总长度限制为 800 bytes。
     */
    public void setTemplateData(String TemplateData) {
        this.TemplateData = TemplateData;
    }

    public ReceiverInputData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverInputData(ReceiverInputData source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.TemplateData != null) {
            this.TemplateData = new String(source.TemplateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "TemplateData", this.TemplateData);

    }
}

