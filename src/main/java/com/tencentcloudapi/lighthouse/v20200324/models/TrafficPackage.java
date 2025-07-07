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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPackage extends AbstractModel {

    /**
    * 流量包ID。
    */
    @SerializedName("TrafficPackageId")
    @Expose
    private String TrafficPackageId;

    /**
    * 流量包生效周期内已使用流量，单位字节。
    */
    @SerializedName("TrafficUsed")
    @Expose
    private Long TrafficUsed;

    /**
    * 流量包生效周期内的总流量，单位字节。
    */
    @SerializedName("TrafficPackageTotal")
    @Expose
    private Long TrafficPackageTotal;

    /**
    * 流量包生效周期内的剩余流量，单位字节。
    */
    @SerializedName("TrafficPackageRemaining")
    @Expose
    private Long TrafficPackageRemaining;

    /**
    * 流量包生效周期内超出流量包额度的流量，单位字节。
    */
    @SerializedName("TrafficOverflow")
    @Expose
    private Long TrafficOverflow;

    /**
    * 流量包生效周期开始时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 流量包生效周期结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 流量包到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 流量包状态：
<li>NETWORK_NORMAL：正常</li>
<li>OVERDUE_NETWORK_DISABLED：欠费断网</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 流量包ID。 
     * @return TrafficPackageId 流量包ID。
     */
    public String getTrafficPackageId() {
        return this.TrafficPackageId;
    }

    /**
     * Set 流量包ID。
     * @param TrafficPackageId 流量包ID。
     */
    public void setTrafficPackageId(String TrafficPackageId) {
        this.TrafficPackageId = TrafficPackageId;
    }

    /**
     * Get 流量包生效周期内已使用流量，单位字节。 
     * @return TrafficUsed 流量包生效周期内已使用流量，单位字节。
     */
    public Long getTrafficUsed() {
        return this.TrafficUsed;
    }

    /**
     * Set 流量包生效周期内已使用流量，单位字节。
     * @param TrafficUsed 流量包生效周期内已使用流量，单位字节。
     */
    public void setTrafficUsed(Long TrafficUsed) {
        this.TrafficUsed = TrafficUsed;
    }

    /**
     * Get 流量包生效周期内的总流量，单位字节。 
     * @return TrafficPackageTotal 流量包生效周期内的总流量，单位字节。
     */
    public Long getTrafficPackageTotal() {
        return this.TrafficPackageTotal;
    }

    /**
     * Set 流量包生效周期内的总流量，单位字节。
     * @param TrafficPackageTotal 流量包生效周期内的总流量，单位字节。
     */
    public void setTrafficPackageTotal(Long TrafficPackageTotal) {
        this.TrafficPackageTotal = TrafficPackageTotal;
    }

    /**
     * Get 流量包生效周期内的剩余流量，单位字节。 
     * @return TrafficPackageRemaining 流量包生效周期内的剩余流量，单位字节。
     */
    public Long getTrafficPackageRemaining() {
        return this.TrafficPackageRemaining;
    }

    /**
     * Set 流量包生效周期内的剩余流量，单位字节。
     * @param TrafficPackageRemaining 流量包生效周期内的剩余流量，单位字节。
     */
    public void setTrafficPackageRemaining(Long TrafficPackageRemaining) {
        this.TrafficPackageRemaining = TrafficPackageRemaining;
    }

    /**
     * Get 流量包生效周期内超出流量包额度的流量，单位字节。 
     * @return TrafficOverflow 流量包生效周期内超出流量包额度的流量，单位字节。
     */
    public Long getTrafficOverflow() {
        return this.TrafficOverflow;
    }

    /**
     * Set 流量包生效周期内超出流量包额度的流量，单位字节。
     * @param TrafficOverflow 流量包生效周期内超出流量包额度的流量，单位字节。
     */
    public void setTrafficOverflow(Long TrafficOverflow) {
        this.TrafficOverflow = TrafficOverflow;
    }

    /**
     * Get 流量包生效周期开始时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。 
     * @return StartTime 流量包生效周期开始时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 流量包生效周期开始时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     * @param StartTime 流量包生效周期开始时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 流量包生效周期结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。 
     * @return EndTime 流量包生效周期结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 流量包生效周期结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     * @param EndTime 流量包生效周期结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 流量包到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。 
     * @return Deadline 流量包到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 流量包到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     * @param Deadline 流量包到期时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 流量包状态：
<li>NETWORK_NORMAL：正常</li>
<li>OVERDUE_NETWORK_DISABLED：欠费断网</li> 
     * @return Status 流量包状态：
<li>NETWORK_NORMAL：正常</li>
<li>OVERDUE_NETWORK_DISABLED：欠费断网</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 流量包状态：
<li>NETWORK_NORMAL：正常</li>
<li>OVERDUE_NETWORK_DISABLED：欠费断网</li>
     * @param Status 流量包状态：
<li>NETWORK_NORMAL：正常</li>
<li>OVERDUE_NETWORK_DISABLED：欠费断网</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public TrafficPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPackage(TrafficPackage source) {
        if (source.TrafficPackageId != null) {
            this.TrafficPackageId = new String(source.TrafficPackageId);
        }
        if (source.TrafficUsed != null) {
            this.TrafficUsed = new Long(source.TrafficUsed);
        }
        if (source.TrafficPackageTotal != null) {
            this.TrafficPackageTotal = new Long(source.TrafficPackageTotal);
        }
        if (source.TrafficPackageRemaining != null) {
            this.TrafficPackageRemaining = new Long(source.TrafficPackageRemaining);
        }
        if (source.TrafficOverflow != null) {
            this.TrafficOverflow = new Long(source.TrafficOverflow);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficPackageId", this.TrafficPackageId);
        this.setParamSimple(map, prefix + "TrafficUsed", this.TrafficUsed);
        this.setParamSimple(map, prefix + "TrafficPackageTotal", this.TrafficPackageTotal);
        this.setParamSimple(map, prefix + "TrafficPackageRemaining", this.TrafficPackageRemaining);
        this.setParamSimple(map, prefix + "TrafficOverflow", this.TrafficOverflow);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

