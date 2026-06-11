/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class Volume extends AbstractModel {

    /**
    * <p>日期</p>
    */
    @SerializedName("SendDate")
    @Expose
    private String SendDate;

    /**
    * <p>邮件请求数量</p>
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * <p>腾讯云通过数量</p>
    */
    @SerializedName("AcceptedCount")
    @Expose
    private Long AcceptedCount;

    /**
    * <p>送达数量</p>
    */
    @SerializedName("DeliveredCount")
    @Expose
    private Long DeliveredCount;

    /**
    * <p>打开邮件总次数</p>
    */
    @SerializedName("OpenedCount")
    @Expose
    private Long OpenedCount;

    /**
    * <p>点击了邮件中的链接数量用户数量</p>
    */
    @SerializedName("ClickedCount")
    @Expose
    private Long ClickedCount;

    /**
    * <p>退信数量</p>
    */
    @SerializedName("BounceCount")
    @Expose
    private Long BounceCount;

    /**
    * <p>取消订阅的用户数量</p>
    */
    @SerializedName("UnsubscribeCount")
    @Expose
    private Long UnsubscribeCount;

    /**
     * Get <p>日期</p> 
     * @return SendDate <p>日期</p>
     */
    public String getSendDate() {
        return this.SendDate;
    }

    /**
     * Set <p>日期</p>
     * @param SendDate <p>日期</p>
     */
    public void setSendDate(String SendDate) {
        this.SendDate = SendDate;
    }

    /**
     * Get <p>邮件请求数量</p> 
     * @return RequestCount <p>邮件请求数量</p>
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set <p>邮件请求数量</p>
     * @param RequestCount <p>邮件请求数量</p>
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get <p>腾讯云通过数量</p> 
     * @return AcceptedCount <p>腾讯云通过数量</p>
     */
    public Long getAcceptedCount() {
        return this.AcceptedCount;
    }

    /**
     * Set <p>腾讯云通过数量</p>
     * @param AcceptedCount <p>腾讯云通过数量</p>
     */
    public void setAcceptedCount(Long AcceptedCount) {
        this.AcceptedCount = AcceptedCount;
    }

    /**
     * Get <p>送达数量</p> 
     * @return DeliveredCount <p>送达数量</p>
     */
    public Long getDeliveredCount() {
        return this.DeliveredCount;
    }

    /**
     * Set <p>送达数量</p>
     * @param DeliveredCount <p>送达数量</p>
     */
    public void setDeliveredCount(Long DeliveredCount) {
        this.DeliveredCount = DeliveredCount;
    }

    /**
     * Get <p>打开邮件总次数</p> 
     * @return OpenedCount <p>打开邮件总次数</p>
     */
    public Long getOpenedCount() {
        return this.OpenedCount;
    }

    /**
     * Set <p>打开邮件总次数</p>
     * @param OpenedCount <p>打开邮件总次数</p>
     */
    public void setOpenedCount(Long OpenedCount) {
        this.OpenedCount = OpenedCount;
    }

    /**
     * Get <p>点击了邮件中的链接数量用户数量</p> 
     * @return ClickedCount <p>点击了邮件中的链接数量用户数量</p>
     */
    public Long getClickedCount() {
        return this.ClickedCount;
    }

    /**
     * Set <p>点击了邮件中的链接数量用户数量</p>
     * @param ClickedCount <p>点击了邮件中的链接数量用户数量</p>
     */
    public void setClickedCount(Long ClickedCount) {
        this.ClickedCount = ClickedCount;
    }

    /**
     * Get <p>退信数量</p> 
     * @return BounceCount <p>退信数量</p>
     */
    public Long getBounceCount() {
        return this.BounceCount;
    }

    /**
     * Set <p>退信数量</p>
     * @param BounceCount <p>退信数量</p>
     */
    public void setBounceCount(Long BounceCount) {
        this.BounceCount = BounceCount;
    }

    /**
     * Get <p>取消订阅的用户数量</p> 
     * @return UnsubscribeCount <p>取消订阅的用户数量</p>
     */
    public Long getUnsubscribeCount() {
        return this.UnsubscribeCount;
    }

    /**
     * Set <p>取消订阅的用户数量</p>
     * @param UnsubscribeCount <p>取消订阅的用户数量</p>
     */
    public void setUnsubscribeCount(Long UnsubscribeCount) {
        this.UnsubscribeCount = UnsubscribeCount;
    }

    public Volume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Volume(Volume source) {
        if (source.SendDate != null) {
            this.SendDate = new String(source.SendDate);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.AcceptedCount != null) {
            this.AcceptedCount = new Long(source.AcceptedCount);
        }
        if (source.DeliveredCount != null) {
            this.DeliveredCount = new Long(source.DeliveredCount);
        }
        if (source.OpenedCount != null) {
            this.OpenedCount = new Long(source.OpenedCount);
        }
        if (source.ClickedCount != null) {
            this.ClickedCount = new Long(source.ClickedCount);
        }
        if (source.BounceCount != null) {
            this.BounceCount = new Long(source.BounceCount);
        }
        if (source.UnsubscribeCount != null) {
            this.UnsubscribeCount = new Long(source.UnsubscribeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SendDate", this.SendDate);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "AcceptedCount", this.AcceptedCount);
        this.setParamSimple(map, prefix + "DeliveredCount", this.DeliveredCount);
        this.setParamSimple(map, prefix + "OpenedCount", this.OpenedCount);
        this.setParamSimple(map, prefix + "ClickedCount", this.ClickedCount);
        this.setParamSimple(map, prefix + "BounceCount", this.BounceCount);
        this.setParamSimple(map, prefix + "UnsubscribeCount", this.UnsubscribeCount);

    }
}

