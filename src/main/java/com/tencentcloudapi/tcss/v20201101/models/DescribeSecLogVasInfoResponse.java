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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogVasInfoResponse extends AbstractModel{

    /**
    * 购买状态
待购: Pending
已购: Normal
隔离: Isolate
    */
    @SerializedName("BuyStatus")
    @Expose
    private String BuyStatus;

    /**
    * 存储时长(月)
    */
    @SerializedName("LogSaveMonth")
    @Expose
    private Long LogSaveMonth;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 存储容量(GB)
    */
    @SerializedName("LogCapacity")
    @Expose
    private Long LogCapacity;

    /**
    * 资源ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * 是否曾经购买过(false:未曾 true:曾经购买过)
    */
    @SerializedName("IsPurchased")
    @Expose
    private Boolean IsPurchased;

    /**
    * 试用存储容量(GB)
    */
    @SerializedName("TrialCapacity")
    @Expose
    private Long TrialCapacity;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 购买状态
待购: Pending
已购: Normal
隔离: Isolate 
     * @return BuyStatus 购买状态
待购: Pending
已购: Normal
隔离: Isolate
     */
    public String getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set 购买状态
待购: Pending
已购: Normal
隔离: Isolate
     * @param BuyStatus 购买状态
待购: Pending
已购: Normal
隔离: Isolate
     */
    public void setBuyStatus(String BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get 存储时长(月) 
     * @return LogSaveMonth 存储时长(月)
     */
    public Long getLogSaveMonth() {
        return this.LogSaveMonth;
    }

    /**
     * Set 存储时长(月)
     * @param LogSaveMonth 存储时长(月)
     */
    public void setLogSaveMonth(Long LogSaveMonth) {
        this.LogSaveMonth = LogSaveMonth;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止时间 
     * @return EndTime 截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间
     * @param EndTime 截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 存储容量(GB) 
     * @return LogCapacity 存储容量(GB)
     */
    public Long getLogCapacity() {
        return this.LogCapacity;
    }

    /**
     * Set 存储容量(GB)
     * @param LogCapacity 存储容量(GB)
     */
    public void setLogCapacity(Long LogCapacity) {
        this.LogCapacity = LogCapacity;
    }

    /**
     * Get 资源ID 
     * @return ResourceID 资源ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源ID
     * @param ResourceID 资源ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 是否曾经购买过(false:未曾 true:曾经购买过) 
     * @return IsPurchased 是否曾经购买过(false:未曾 true:曾经购买过)
     */
    public Boolean getIsPurchased() {
        return this.IsPurchased;
    }

    /**
     * Set 是否曾经购买过(false:未曾 true:曾经购买过)
     * @param IsPurchased 是否曾经购买过(false:未曾 true:曾经购买过)
     */
    public void setIsPurchased(Boolean IsPurchased) {
        this.IsPurchased = IsPurchased;
    }

    /**
     * Get 试用存储容量(GB) 
     * @return TrialCapacity 试用存储容量(GB)
     */
    public Long getTrialCapacity() {
        return this.TrialCapacity;
    }

    /**
     * Set 试用存储容量(GB)
     * @param TrialCapacity 试用存储容量(GB)
     */
    public void setTrialCapacity(Long TrialCapacity) {
        this.TrialCapacity = TrialCapacity;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecLogVasInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogVasInfoResponse(DescribeSecLogVasInfoResponse source) {
        if (source.BuyStatus != null) {
            this.BuyStatus = new String(source.BuyStatus);
        }
        if (source.LogSaveMonth != null) {
            this.LogSaveMonth = new Long(source.LogSaveMonth);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogCapacity != null) {
            this.LogCapacity = new Long(source.LogCapacity);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.IsPurchased != null) {
            this.IsPurchased = new Boolean(source.IsPurchased);
        }
        if (source.TrialCapacity != null) {
            this.TrialCapacity = new Long(source.TrialCapacity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "LogSaveMonth", this.LogSaveMonth);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogCapacity", this.LogCapacity);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "IsPurchased", this.IsPurchased);
        this.setParamSimple(map, prefix + "TrialCapacity", this.TrialCapacity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

