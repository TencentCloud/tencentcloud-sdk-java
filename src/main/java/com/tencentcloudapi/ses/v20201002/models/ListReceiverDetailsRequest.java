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

public class ListReceiverDetailsRequest extends AbstractModel {

    /**
    * 收件人列表ID,CreateReceiver接口创建收件人列表时会返回该值
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * 偏移量，整型，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目，整型,不超过100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 收件人地址，长度0-50，示例：xxx@te.com，支持模糊查询
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 搜索开始时间
    */
    @SerializedName("CreateTimeBegin")
    @Expose
    private String CreateTimeBegin;

    /**
    * 搜索结束时间
    */
    @SerializedName("CreateTimeEnd")
    @Expose
    private String CreateTimeEnd;

    /**
    * 1:有效，2:无效
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 收件人列表ID,CreateReceiver接口创建收件人列表时会返回该值 
     * @return ReceiverId 收件人列表ID,CreateReceiver接口创建收件人列表时会返回该值
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 收件人列表ID,CreateReceiver接口创建收件人列表时会返回该值
     * @param ReceiverId 收件人列表ID,CreateReceiver接口创建收件人列表时会返回该值
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get 偏移量，整型，从0开始 
     * @return Offset 偏移量，整型，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，整型，从0开始
     * @param Offset 偏移量，整型，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目，整型,不超过100 
     * @return Limit 限制数目，整型,不超过100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目，整型,不超过100
     * @param Limit 限制数目，整型,不超过100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 收件人地址，长度0-50，示例：xxx@te.com，支持模糊查询 
     * @return Email 收件人地址，长度0-50，示例：xxx@te.com，支持模糊查询
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 收件人地址，长度0-50，示例：xxx@te.com，支持模糊查询
     * @param Email 收件人地址，长度0-50，示例：xxx@te.com，支持模糊查询
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 搜索开始时间 
     * @return CreateTimeBegin 搜索开始时间
     */
    public String getCreateTimeBegin() {
        return this.CreateTimeBegin;
    }

    /**
     * Set 搜索开始时间
     * @param CreateTimeBegin 搜索开始时间
     */
    public void setCreateTimeBegin(String CreateTimeBegin) {
        this.CreateTimeBegin = CreateTimeBegin;
    }

    /**
     * Get 搜索结束时间 
     * @return CreateTimeEnd 搜索结束时间
     */
    public String getCreateTimeEnd() {
        return this.CreateTimeEnd;
    }

    /**
     * Set 搜索结束时间
     * @param CreateTimeEnd 搜索结束时间
     */
    public void setCreateTimeEnd(String CreateTimeEnd) {
        this.CreateTimeEnd = CreateTimeEnd;
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

    public ListReceiverDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReceiverDetailsRequest(ListReceiverDetailsRequest source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTimeBegin != null) {
            this.CreateTimeBegin = new String(source.CreateTimeBegin);
        }
        if (source.CreateTimeEnd != null) {
            this.CreateTimeEnd = new String(source.CreateTimeEnd);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTimeBegin", this.CreateTimeBegin);
        this.setParamSimple(map, prefix + "CreateTimeEnd", this.CreateTimeEnd);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

