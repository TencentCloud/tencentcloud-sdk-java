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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverDetail extends AbstractModel {

    /**
    * 收件人地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板参数
    */
    @SerializedName("TemplateData")
    @Expose
    private String TemplateData;

    /**
     * Get 收件人地址 
     * @return Email 收件人地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 收件人地址
     * @param Email 收件人地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板参数 
     * @return TemplateData 模板参数
     */
    public String getTemplateData() {
        return this.TemplateData;
    }

    /**
     * Set 模板参数
     * @param TemplateData 模板参数
     */
    public void setTemplateData(String TemplateData) {
        this.TemplateData = TemplateData;
    }

    public ReceiverDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverDetail(ReceiverDetail source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TemplateData", this.TemplateData);

    }
}

