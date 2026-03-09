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
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
    */
    @SerializedName("EndTimestamp")
    @Expose
    private Long EndTimestamp;

    /**
    * <p>闪信投递号码（被叫号码）</p>
    */
    @SerializedName("DeliveryNumber")
    @Expose
    private String DeliveryNumber;

    /**
    * <p>呼叫关联的系统号码</p>
    */
    @SerializedName("ServingNumber")
    @Expose
    private String ServingNumber;

    /**
    * <p>会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>投递结果 1 为成功，其他为失败</p>
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private Long DeliveryStatus;

    /**
    * <p>分页大小，默认 20，最大 1000</p><p>取值范围：[20, 1000]</p><p>单位：条</p><p>默认值：20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>分页页码，从 0 开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p> 
     * @return StartTimestamp <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
     * @param StartTimestamp <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p> 
     * @return EndTimestamp <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
     */
    public Long getEndTimestamp() {
        return this.EndTimestamp;
    }

    /**
     * Set <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
     * @param EndTimestamp <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
     */
    public void setEndTimestamp(Long EndTimestamp) {
        this.EndTimestamp = EndTimestamp;
    }

    /**
     * Get <p>闪信投递号码（被叫号码）</p> 
     * @return DeliveryNumber <p>闪信投递号码（被叫号码）</p>
     */
    public String getDeliveryNumber() {
        return this.DeliveryNumber;
    }

    /**
     * Set <p>闪信投递号码（被叫号码）</p>
     * @param DeliveryNumber <p>闪信投递号码（被叫号码）</p>
     */
    public void setDeliveryNumber(String DeliveryNumber) {
        this.DeliveryNumber = DeliveryNumber;
    }

    /**
     * Get <p>呼叫关联的系统号码</p> 
     * @return ServingNumber <p>呼叫关联的系统号码</p>
     */
    public String getServingNumber() {
        return this.ServingNumber;
    }

    /**
     * Set <p>呼叫关联的系统号码</p>
     * @param ServingNumber <p>呼叫关联的系统号码</p>
     */
    public void setServingNumber(String ServingNumber) {
        this.ServingNumber = ServingNumber;
    }

    /**
     * Get <p>会话 ID</p> 
     * @return SessionId <p>会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
     * @param SessionId <p>会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>投递结果 1 为成功，其他为失败</p> 
     * @return DeliveryStatus <p>投递结果 1 为成功，其他为失败</p>
     */
    public Long getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>投递结果 1 为成功，其他为失败</p>
     * @param DeliveryStatus <p>投递结果 1 为成功，其他为失败</p>
     */
    public void setDeliveryStatus(Long DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>分页大小，默认 20，最大 1000</p><p>取值范围：[20, 1000]</p><p>单位：条</p><p>默认值：20</p> 
     * @return PageSize <p>分页大小，默认 20，最大 1000</p><p>取值范围：[20, 1000]</p><p>单位：条</p><p>默认值：20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小，默认 20，最大 1000</p><p>取值范围：[20, 1000]</p><p>单位：条</p><p>默认值：20</p>
     * @param PageSize <p>分页大小，默认 20，最大 1000</p><p>取值范围：[20, 1000]</p><p>单位：条</p><p>默认值：20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>分页页码，从 0 开始</p> 
     * @return PageNumber <p>分页页码，从 0 开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 0 开始</p>
     * @param PageNumber <p>分页页码，从 0 开始</p>
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

