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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSmsTemplateRequest extends AbstractModel{

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板内容。
    */
    @SerializedName("TemplateContent")
    @Expose
    private String TemplateContent;

    /**
    * 短信类型，0表示普通短信, 1表示营销短信。
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 模板备注，例如申请原因，使用场景等。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板内容。 
     * @return TemplateContent 模板内容。
     */
    public String getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set 模板内容。
     * @param TemplateContent 模板内容。
     */
    public void setTemplateContent(String TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get 短信类型，0表示普通短信, 1表示营销短信。 
     * @return SmsType 短信类型，0表示普通短信, 1表示营销短信。
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set 短信类型，0表示普通短信, 1表示营销短信。
     * @param SmsType 短信类型，0表示普通短信, 1表示营销短信。
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 模板备注，例如申请原因，使用场景等。 
     * @return Remark 模板备注，例如申请原因，使用场景等。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 模板备注，例如申请原因，使用场景等。
     * @param Remark 模板备注，例如申请原因，使用场景等。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateContent", this.TemplateContent);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

