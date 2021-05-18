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

public class DescribeSignListStatus extends AbstractModel{

    /**
    * 签名ID。
    */
    @SerializedName("SignId")
    @Expose
    private Long SignId;

    /**
    * 是否国际/港澳台短信，其中0表示国内短信，1表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 申请签名状态，其中0表示审核通过，1表示审核中。
-1：表示审核未通过或审核失败。
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
    * 签名名称。
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 提交审核时间，UNIX 时间戳（单位：秒）。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 签名ID。 
     * @return SignId 签名ID。
     */
    public Long getSignId() {
        return this.SignId;
    }

    /**
     * Set 签名ID。
     * @param SignId 签名ID。
     */
    public void setSignId(Long SignId) {
        this.SignId = SignId;
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
     * Get 申请签名状态，其中0表示审核通过，1表示审核中。
-1：表示审核未通过或审核失败。 
     * @return StatusCode 申请签名状态，其中0表示审核通过，1表示审核中。
-1：表示审核未通过或审核失败。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 申请签名状态，其中0表示审核通过，1表示审核中。
-1：表示审核未通过或审核失败。
     * @param StatusCode 申请签名状态，其中0表示审核通过，1表示审核中。
-1：表示审核未通过或审核失败。
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
     * Get 签名名称。 
     * @return SignName 签名名称。
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 签名名称。
     * @param SignName 签名名称。
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
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

    public DescribeSignListStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSignListStatus(DescribeSignListStatus source) {
        if (source.SignId != null) {
            this.SignId = new Long(source.SignId);
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
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ReviewReply", this.ReviewReply);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

