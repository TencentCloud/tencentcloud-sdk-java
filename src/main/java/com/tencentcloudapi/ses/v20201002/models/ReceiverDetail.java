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
    * 无效原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 1:有效，2:无效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 收件人地址id
    */
    @SerializedName("EmailId")
    @Expose
    private Long EmailId;

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

    /**
     * Get 无效原因 
     * @return Reason 无效原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 无效原因
     * @param Reason 无效原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 1:有效，2:无效 
     * @return Status 1:有效，2:无效
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:有效，2:无效
     * @param Status 1:有效，2:无效
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 收件人地址id 
     * @return EmailId 收件人地址id
     */
    public Long getEmailId() {
        return this.EmailId;
    }

    /**
     * Set 收件人地址id
     * @param EmailId 收件人地址id
     */
    public void setEmailId(Long EmailId) {
        this.EmailId = EmailId;
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
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EmailId != null) {
            this.EmailId = new Long(source.EmailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TemplateData", this.TemplateData);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EmailId", this.EmailId);

    }
}

