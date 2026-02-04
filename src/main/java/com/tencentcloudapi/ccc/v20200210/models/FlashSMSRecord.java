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

public class FlashSMSRecord extends AbstractModel {

    /**
    * 会话 ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 闪信投递号码（被叫）
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
    * 投递状态，1 表示成功，其他表示失败
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private Long DeliveryStatus;

    /**
    * 投递失败原因
    */
    @SerializedName("DeliveryMessage")
    @Expose
    private String DeliveryMessage;

    /**
    * 投递时间戳，Unix 秒级时间戳
    */
    @SerializedName("DeliveryTimestamp")
    @Expose
    private Long DeliveryTimestamp;

    /**
    * 送达时间（送达成功），Unix 秒级时间戳
    */
    @SerializedName("ArriveTimestamp")
    @Expose
    private Long ArriveTimestamp;

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
     * Get 闪信投递号码（被叫） 
     * @return DeliveryNumber 闪信投递号码（被叫）
     */
    public String getDeliveryNumber() {
        return this.DeliveryNumber;
    }

    /**
     * Set 闪信投递号码（被叫）
     * @param DeliveryNumber 闪信投递号码（被叫）
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
     * Get 投递状态，1 表示成功，其他表示失败 
     * @return DeliveryStatus 投递状态，1 表示成功，其他表示失败
     */
    public Long getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set 投递状态，1 表示成功，其他表示失败
     * @param DeliveryStatus 投递状态，1 表示成功，其他表示失败
     */
    public void setDeliveryStatus(Long DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get 投递失败原因 
     * @return DeliveryMessage 投递失败原因
     */
    public String getDeliveryMessage() {
        return this.DeliveryMessage;
    }

    /**
     * Set 投递失败原因
     * @param DeliveryMessage 投递失败原因
     */
    public void setDeliveryMessage(String DeliveryMessage) {
        this.DeliveryMessage = DeliveryMessage;
    }

    /**
     * Get 投递时间戳，Unix 秒级时间戳 
     * @return DeliveryTimestamp 投递时间戳，Unix 秒级时间戳
     */
    public Long getDeliveryTimestamp() {
        return this.DeliveryTimestamp;
    }

    /**
     * Set 投递时间戳，Unix 秒级时间戳
     * @param DeliveryTimestamp 投递时间戳，Unix 秒级时间戳
     */
    public void setDeliveryTimestamp(Long DeliveryTimestamp) {
        this.DeliveryTimestamp = DeliveryTimestamp;
    }

    /**
     * Get 送达时间（送达成功），Unix 秒级时间戳 
     * @return ArriveTimestamp 送达时间（送达成功），Unix 秒级时间戳
     */
    public Long getArriveTimestamp() {
        return this.ArriveTimestamp;
    }

    /**
     * Set 送达时间（送达成功），Unix 秒级时间戳
     * @param ArriveTimestamp 送达时间（送达成功），Unix 秒级时间戳
     */
    public void setArriveTimestamp(Long ArriveTimestamp) {
        this.ArriveTimestamp = ArriveTimestamp;
    }

    public FlashSMSRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlashSMSRecord(FlashSMSRecord source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DeliveryNumber != null) {
            this.DeliveryNumber = new String(source.DeliveryNumber);
        }
        if (source.ServingNumber != null) {
            this.ServingNumber = new String(source.ServingNumber);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new Long(source.DeliveryStatus);
        }
        if (source.DeliveryMessage != null) {
            this.DeliveryMessage = new String(source.DeliveryMessage);
        }
        if (source.DeliveryTimestamp != null) {
            this.DeliveryTimestamp = new Long(source.DeliveryTimestamp);
        }
        if (source.ArriveTimestamp != null) {
            this.ArriveTimestamp = new Long(source.ArriveTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "DeliveryNumber", this.DeliveryNumber);
        this.setParamSimple(map, prefix + "ServingNumber", this.ServingNumber);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamSimple(map, prefix + "DeliveryMessage", this.DeliveryMessage);
        this.setParamSimple(map, prefix + "DeliveryTimestamp", this.DeliveryTimestamp);
        this.setParamSimple(map, prefix + "ArriveTimestamp", this.ArriveTimestamp);

    }
}

