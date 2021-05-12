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

public class GetSendEmailStatusRequest extends AbstractModel{

    /**
    * 发送的日期，必填。仅支持查询某个日期，不支持范围查询。
    */
    @SerializedName("RequestDate")
    @Expose
    private String RequestDate;

    /**
    * 偏移量。默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 拉取最大条数，最多 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * SendMail接口返回的MessageId字段。
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * 收件人邮箱。
    */
    @SerializedName("ToEmailAddress")
    @Expose
    private String ToEmailAddress;

    /**
     * Get 发送的日期，必填。仅支持查询某个日期，不支持范围查询。 
     * @return RequestDate 发送的日期，必填。仅支持查询某个日期，不支持范围查询。
     */
    public String getRequestDate() {
        return this.RequestDate;
    }

    /**
     * Set 发送的日期，必填。仅支持查询某个日期，不支持范围查询。
     * @param RequestDate 发送的日期，必填。仅支持查询某个日期，不支持范围查询。
     */
    public void setRequestDate(String RequestDate) {
        this.RequestDate = RequestDate;
    }

    /**
     * Get 偏移量。默认为0 
     * @return Offset 偏移量。默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。默认为0
     * @param Offset 偏移量。默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 拉取最大条数，最多 100。 
     * @return Limit 拉取最大条数，最多 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取最大条数，最多 100。
     * @param Limit 拉取最大条数，最多 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get SendMail接口返回的MessageId字段。 
     * @return MessageId SendMail接口返回的MessageId字段。
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set SendMail接口返回的MessageId字段。
     * @param MessageId SendMail接口返回的MessageId字段。
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get 收件人邮箱。 
     * @return ToEmailAddress 收件人邮箱。
     */
    public String getToEmailAddress() {
        return this.ToEmailAddress;
    }

    /**
     * Set 收件人邮箱。
     * @param ToEmailAddress 收件人邮箱。
     */
    public void setToEmailAddress(String ToEmailAddress) {
        this.ToEmailAddress = ToEmailAddress;
    }

    public GetSendEmailStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSendEmailStatusRequest(GetSendEmailStatusRequest source) {
        if (source.RequestDate != null) {
            this.RequestDate = new String(source.RequestDate);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ToEmailAddress != null) {
            this.ToEmailAddress = new String(source.ToEmailAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestDate", this.RequestDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ToEmailAddress", this.ToEmailAddress);

    }
}

