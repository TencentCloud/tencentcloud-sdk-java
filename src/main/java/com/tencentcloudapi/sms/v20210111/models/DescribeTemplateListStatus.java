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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateListStatus extends AbstractModel{

    /**
    * 模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 申请模板状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
    */
    @SerializedName("ReviewReply")
    @Expose
    private String ReviewReply;

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 提交审核时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 模板内容。
    */
    @SerializedName("TemplateContent")
    @Expose
    private String TemplateContent;

    /**
     * Get 模板ID。 
     * @return TemplateId 模板ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID。
     * @param TemplateId 模板ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 申请模板状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。 
     * @return StatusCode 申请模板状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 申请模板状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
     * @param StatusCode 申请模板状态，其中0表示审核通过且已生效，1表示审核中，2表示审核通过待生效，-1表示审核未通过或审核失败。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。 
     * @return ReviewReply 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
     */
    public String getReviewReply() {
        return this.ReviewReply;
    }

    /**
     * Set 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
     * @param ReviewReply 审核回复，审核人员审核后给出的回复，通常是审核未通过的原因。
     */
    public void setReviewReply(String ReviewReply) {
        this.ReviewReply = ReviewReply;
    }

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
     * Get 提交审核时间，UNIX 时间戳（单位：秒）。 
     * @return CreateTime 提交审核时间，UNIX 时间戳（单位：秒）。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 提交审核时间，UNIX 时间戳（单位：秒）。
     * @param CreateTime 提交审核时间，UNIX 时间戳（单位：秒）。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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

    public DescribeTemplateListStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplateListStatus(DescribeTemplateListStatus source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ReviewReply != null) {
            this.ReviewReply = new String(source.ReviewReply);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.TemplateContent != null) {
            this.TemplateContent = new String(source.TemplateContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ReviewReply", this.ReviewReply);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TemplateContent", this.TemplateContent);

    }
}

