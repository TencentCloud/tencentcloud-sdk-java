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

public class Volume extends AbstractModel{

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendDate")
    @Expose
    private String SendDate;

    /**
    * 邮件请求数量
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * 腾讯云通过数量
    */
    @SerializedName("AcceptedCount")
    @Expose
    private Long AcceptedCount;

    /**
    * 送达数量
    */
    @SerializedName("DeliveredCount")
    @Expose
    private Long DeliveredCount;

    /**
    * 打开邮件的用户数量，根据收件人去重
    */
    @SerializedName("OpenedCount")
    @Expose
    private Long OpenedCount;

    /**
    * 点击了邮件中的链接数量用户数量
    */
    @SerializedName("ClickedCount")
    @Expose
    private Long ClickedCount;

    /**
    * 退信数量
    */
    @SerializedName("BounceCount")
    @Expose
    private Long BounceCount;

    /**
    * 取消订阅的用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnsubscribeCount")
    @Expose
    private Long UnsubscribeCount;

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendDate 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendDate() {
        return this.SendDate;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendDate 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendDate(String SendDate) {
        this.SendDate = SendDate;
    }

    /**
     * Get 邮件请求数量 
     * @return RequestCount 邮件请求数量
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set 邮件请求数量
     * @param RequestCount 邮件请求数量
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get 腾讯云通过数量 
     * @return AcceptedCount 腾讯云通过数量
     */
    public Long getAcceptedCount() {
        return this.AcceptedCount;
    }

    /**
     * Set 腾讯云通过数量
     * @param AcceptedCount 腾讯云通过数量
     */
    public void setAcceptedCount(Long AcceptedCount) {
        this.AcceptedCount = AcceptedCount;
    }

    /**
     * Get 送达数量 
     * @return DeliveredCount 送达数量
     */
    public Long getDeliveredCount() {
        return this.DeliveredCount;
    }

    /**
     * Set 送达数量
     * @param DeliveredCount 送达数量
     */
    public void setDeliveredCount(Long DeliveredCount) {
        this.DeliveredCount = DeliveredCount;
    }

    /**
     * Get 打开邮件的用户数量，根据收件人去重 
     * @return OpenedCount 打开邮件的用户数量，根据收件人去重
     */
    public Long getOpenedCount() {
        return this.OpenedCount;
    }

    /**
     * Set 打开邮件的用户数量，根据收件人去重
     * @param OpenedCount 打开邮件的用户数量，根据收件人去重
     */
    public void setOpenedCount(Long OpenedCount) {
        this.OpenedCount = OpenedCount;
    }

    /**
     * Get 点击了邮件中的链接数量用户数量 
     * @return ClickedCount 点击了邮件中的链接数量用户数量
     */
    public Long getClickedCount() {
        return this.ClickedCount;
    }

    /**
     * Set 点击了邮件中的链接数量用户数量
     * @param ClickedCount 点击了邮件中的链接数量用户数量
     */
    public void setClickedCount(Long ClickedCount) {
        this.ClickedCount = ClickedCount;
    }

    /**
     * Get 退信数量 
     * @return BounceCount 退信数量
     */
    public Long getBounceCount() {
        return this.BounceCount;
    }

    /**
     * Set 退信数量
     * @param BounceCount 退信数量
     */
    public void setBounceCount(Long BounceCount) {
        this.BounceCount = BounceCount;
    }

    /**
     * Get 取消订阅的用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnsubscribeCount 取消订阅的用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnsubscribeCount() {
        return this.UnsubscribeCount;
    }

    /**
     * Set 取消订阅的用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnsubscribeCount 取消订阅的用户数量
注意：此字段可能返回 null，表示取不到有效值。
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

