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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlashSMSListRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 起始时间戳，Unix 秒级时间戳，最大支持近180天。
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
    * 闪信投递号码（被叫号码）
    */
    @SerializedName("DeliveryNumber")
    @Expose
    private String DeliveryNumber;

    /**
    * 呼叫关联的系统号码
    */
    @SerializedName("ServingNumber")
    @Expose
    private String ServingNumber;

    /**
    * 会话 ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 投递结果 1 为成功，其他为失败
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private Long DeliveryStatus;

    /**
    * 分页大小，默认 20，最大 100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码，从 0 开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 起始时间戳，Unix 秒级时间戳，最大支持近180天。 
     * @return StartTimestamp 起始时间戳，Unix 秒级时间戳，最大支持近180天。
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 起始时间戳，Unix 秒级时间戳，最大支持近180天。
     * @param StartTimestamp 起始时间戳，Unix 秒级时间戳，最大支持近180天。
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。 
     * @return EndTimestamp 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
     * @param EndTimestamp 结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    /**
     * Get 闪信投递号码（被叫号码） 
     * @return DeliveryNumber 闪信投递号码（被叫号码）
     */
    public String getDeliveryNumber() {
        return this.DeliveryNumber;
    }

    /**
     * Set 闪信投递号码（被叫号码）
     * @param DeliveryNumber 闪信投递号码（被叫号码）
     */
    public void setDeliveryNumber(String DeliveryNumber) {
        this.DeliveryNumber = DeliveryNumber;
    }

    /**
     * Get 呼叫关联的系统号码 
     * @return ServingNumber 呼叫关联的系统号码
     */
    public String getServingNumber() {
        return this.ServingNumber;
    }

    /**
     * Set 呼叫关联的系统号码
     * @param ServingNumber 呼叫关联的系统号码
     */
    public void setServingNumber(String ServingNumber) {
        this.ServingNumber = ServingNumber;
    }

    /**
     * Get 会话 ID 
     * @return SessionId 会话 ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话 ID
     * @param SessionId 会话 ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 投递结果 1 为成功，其他为失败 
     * @return DeliveryStatus 投递结果 1 为成功，其他为失败
     */
    public Long getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set 投递结果 1 为成功，其他为失败
     * @param DeliveryStatus 投递结果 1 为成功，其他为失败
     */
    public void setDeliveryStatus(Long DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get 分页大小，默认 20，最大 100 
     * @return PageSize 分页大小，默认 20，最大 100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，默认 20，最大 100
     * @param PageSize 分页大小，默认 20，最大 100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码，从 0 开始 
     * @return PageNumber 分页页码，从 0 开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码，从 0 开始
     * @param PageNumber 分页页码，从 0 开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeFlashSMSListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlashSMSListRequest(DescribeFlashSMSListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.EndTimestamp != null) {
            this.EndTimestamp = new Long(source.EndTimestamp);
        }
        if (source.DeliveryNumber != null) {
            this.DeliveryNumber = new String(source.DeliveryNumber);
        }
        if (source.ServingNumber != null) {
            this.ServingNumber = new String(source.ServingNumber);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new Long(source.DeliveryStatus);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "EndTimestamp", this.EndTimestamp);
        this.setParamSimple(map, prefix + "DeliveryNumber", this.DeliveryNumber);
        this.setParamSimple(map, prefix + "ServingNumber", this.ServingNumber);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

