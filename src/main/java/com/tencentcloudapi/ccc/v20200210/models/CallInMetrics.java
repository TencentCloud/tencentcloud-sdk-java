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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallInMetrics extends AbstractModel{

    /**
    * IVR驻留数量
    */
    @SerializedName("IvrCount")
    @Expose
    private Long IvrCount;

    /**
    * 排队中数量
    */
    @SerializedName("QueueCount")
    @Expose
    private Long QueueCount;

    /**
    * 振铃中数量
    */
    @SerializedName("RingCount")
    @Expose
    private Long RingCount;

    /**
    * 接通中数量
    */
    @SerializedName("AcceptCount")
    @Expose
    private Long AcceptCount;

    /**
    * 客服转接外线中数量
    */
    @SerializedName("TransferOuterCount")
    @Expose
    private Long TransferOuterCount;

    /**
    * 最大排队时长
    */
    @SerializedName("MaxQueueDuration")
    @Expose
    private Long MaxQueueDuration;

    /**
    * 平均排队时长
    */
    @SerializedName("AvgQueueDuration")
    @Expose
    private Long AvgQueueDuration;

    /**
    * 最大振铃时长
    */
    @SerializedName("MaxRingDuration")
    @Expose
    private Long MaxRingDuration;

    /**
    * 平均振铃时长
    */
    @SerializedName("AvgRingDuration")
    @Expose
    private Long AvgRingDuration;

    /**
    * 最大接通时长
    */
    @SerializedName("MaxAcceptDuration")
    @Expose
    private Long MaxAcceptDuration;

    /**
    * 平均接通时长
    */
    @SerializedName("AvgAcceptDuration")
    @Expose
    private Long AvgAcceptDuration;

    /**
     * Get IVR驻留数量 
     * @return IvrCount IVR驻留数量
     */
    public Long getIvrCount() {
        return this.IvrCount;
    }

    /**
     * Set IVR驻留数量
     * @param IvrCount IVR驻留数量
     */
    public void setIvrCount(Long IvrCount) {
        this.IvrCount = IvrCount;
    }

    /**
     * Get 排队中数量 
     * @return QueueCount 排队中数量
     */
    public Long getQueueCount() {
        return this.QueueCount;
    }

    /**
     * Set 排队中数量
     * @param QueueCount 排队中数量
     */
    public void setQueueCount(Long QueueCount) {
        this.QueueCount = QueueCount;
    }

    /**
     * Get 振铃中数量 
     * @return RingCount 振铃中数量
     */
    public Long getRingCount() {
        return this.RingCount;
    }

    /**
     * Set 振铃中数量
     * @param RingCount 振铃中数量
     */
    public void setRingCount(Long RingCount) {
        this.RingCount = RingCount;
    }

    /**
     * Get 接通中数量 
     * @return AcceptCount 接通中数量
     */
    public Long getAcceptCount() {
        return this.AcceptCount;
    }

    /**
     * Set 接通中数量
     * @param AcceptCount 接通中数量
     */
    public void setAcceptCount(Long AcceptCount) {
        this.AcceptCount = AcceptCount;
    }

    /**
     * Get 客服转接外线中数量 
     * @return TransferOuterCount 客服转接外线中数量
     */
    public Long getTransferOuterCount() {
        return this.TransferOuterCount;
    }

    /**
     * Set 客服转接外线中数量
     * @param TransferOuterCount 客服转接外线中数量
     */
    public void setTransferOuterCount(Long TransferOuterCount) {
        this.TransferOuterCount = TransferOuterCount;
    }

    /**
     * Get 最大排队时长 
     * @return MaxQueueDuration 最大排队时长
     */
    public Long getMaxQueueDuration() {
        return this.MaxQueueDuration;
    }

    /**
     * Set 最大排队时长
     * @param MaxQueueDuration 最大排队时长
     */
    public void setMaxQueueDuration(Long MaxQueueDuration) {
        this.MaxQueueDuration = MaxQueueDuration;
    }

    /**
     * Get 平均排队时长 
     * @return AvgQueueDuration 平均排队时长
     */
    public Long getAvgQueueDuration() {
        return this.AvgQueueDuration;
    }

    /**
     * Set 平均排队时长
     * @param AvgQueueDuration 平均排队时长
     */
    public void setAvgQueueDuration(Long AvgQueueDuration) {
        this.AvgQueueDuration = AvgQueueDuration;
    }

    /**
     * Get 最大振铃时长 
     * @return MaxRingDuration 最大振铃时长
     */
    public Long getMaxRingDuration() {
        return this.MaxRingDuration;
    }

    /**
     * Set 最大振铃时长
     * @param MaxRingDuration 最大振铃时长
     */
    public void setMaxRingDuration(Long MaxRingDuration) {
        this.MaxRingDuration = MaxRingDuration;
    }

    /**
     * Get 平均振铃时长 
     * @return AvgRingDuration 平均振铃时长
     */
    public Long getAvgRingDuration() {
        return this.AvgRingDuration;
    }

    /**
     * Set 平均振铃时长
     * @param AvgRingDuration 平均振铃时长
     */
    public void setAvgRingDuration(Long AvgRingDuration) {
        this.AvgRingDuration = AvgRingDuration;
    }

    /**
     * Get 最大接通时长 
     * @return MaxAcceptDuration 最大接通时长
     */
    public Long getMaxAcceptDuration() {
        return this.MaxAcceptDuration;
    }

    /**
     * Set 最大接通时长
     * @param MaxAcceptDuration 最大接通时长
     */
    public void setMaxAcceptDuration(Long MaxAcceptDuration) {
        this.MaxAcceptDuration = MaxAcceptDuration;
    }

    /**
     * Get 平均接通时长 
     * @return AvgAcceptDuration 平均接通时长
     */
    public Long getAvgAcceptDuration() {
        return this.AvgAcceptDuration;
    }

    /**
     * Set 平均接通时长
     * @param AvgAcceptDuration 平均接通时长
     */
    public void setAvgAcceptDuration(Long AvgAcceptDuration) {
        this.AvgAcceptDuration = AvgAcceptDuration;
    }

    public CallInMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInMetrics(CallInMetrics source) {
        if (source.IvrCount != null) {
            this.IvrCount = new Long(source.IvrCount);
        }
        if (source.QueueCount != null) {
            this.QueueCount = new Long(source.QueueCount);
        }
        if (source.RingCount != null) {
            this.RingCount = new Long(source.RingCount);
        }
        if (source.AcceptCount != null) {
            this.AcceptCount = new Long(source.AcceptCount);
        }
        if (source.TransferOuterCount != null) {
            this.TransferOuterCount = new Long(source.TransferOuterCount);
        }
        if (source.MaxQueueDuration != null) {
            this.MaxQueueDuration = new Long(source.MaxQueueDuration);
        }
        if (source.AvgQueueDuration != null) {
            this.AvgQueueDuration = new Long(source.AvgQueueDuration);
        }
        if (source.MaxRingDuration != null) {
            this.MaxRingDuration = new Long(source.MaxRingDuration);
        }
        if (source.AvgRingDuration != null) {
            this.AvgRingDuration = new Long(source.AvgRingDuration);
        }
        if (source.MaxAcceptDuration != null) {
            this.MaxAcceptDuration = new Long(source.MaxAcceptDuration);
        }
        if (source.AvgAcceptDuration != null) {
            this.AvgAcceptDuration = new Long(source.AvgAcceptDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IvrCount", this.IvrCount);
        this.setParamSimple(map, prefix + "QueueCount", this.QueueCount);
        this.setParamSimple(map, prefix + "RingCount", this.RingCount);
        this.setParamSimple(map, prefix + "AcceptCount", this.AcceptCount);
        this.setParamSimple(map, prefix + "TransferOuterCount", this.TransferOuterCount);
        this.setParamSimple(map, prefix + "MaxQueueDuration", this.MaxQueueDuration);
        this.setParamSimple(map, prefix + "AvgQueueDuration", this.AvgQueueDuration);
        this.setParamSimple(map, prefix + "MaxRingDuration", this.MaxRingDuration);
        this.setParamSimple(map, prefix + "AvgRingDuration", this.AvgRingDuration);
        this.setParamSimple(map, prefix + "MaxAcceptDuration", this.MaxAcceptDuration);
        this.setParamSimple(map, prefix + "AvgAcceptDuration", this.AvgAcceptDuration);

    }
}

