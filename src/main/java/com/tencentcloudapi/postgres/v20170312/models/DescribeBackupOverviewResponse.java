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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupOverviewResponse extends AbstractModel{

    /**
    * 总免费空间大小，单位byte。
    */
    @SerializedName("TotalFreeSize")
    @Expose
    private Long TotalFreeSize;

    /**
    * 已使用免费空间大小，单位byte。
    */
    @SerializedName("UsedFreeSize")
    @Expose
    private Long UsedFreeSize;

    /**
    * 已使用收费空间大小，单位byte。
    */
    @SerializedName("UsedBillingSize")
    @Expose
    private Long UsedBillingSize;

    /**
    * 日志备份数量。
    */
    @SerializedName("LogBackupCount")
    @Expose
    private Long LogBackupCount;

    /**
    * 日志备份大小，单位byte。
    */
    @SerializedName("LogBackupSize")
    @Expose
    private Long LogBackupSize;

    /**
    * 手动创建的基础备份数量。
    */
    @SerializedName("ManualBaseBackupCount")
    @Expose
    private Long ManualBaseBackupCount;

    /**
    * 手动创建的基础备份大小，单位byte。
    */
    @SerializedName("ManualBaseBackupSize")
    @Expose
    private Long ManualBaseBackupSize;

    /**
    * 自动创建的基础备份数量。
    */
    @SerializedName("AutoBaseBackupCount")
    @Expose
    private Long AutoBaseBackupCount;

    /**
    * 自动创建的基础备份大小，单位byte。
    */
    @SerializedName("AutoBaseBackupSize")
    @Expose
    private Long AutoBaseBackupSize;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总免费空间大小，单位byte。 
     * @return TotalFreeSize 总免费空间大小，单位byte。
     */
    public Long getTotalFreeSize() {
        return this.TotalFreeSize;
    }

    /**
     * Set 总免费空间大小，单位byte。
     * @param TotalFreeSize 总免费空间大小，单位byte。
     */
    public void setTotalFreeSize(Long TotalFreeSize) {
        this.TotalFreeSize = TotalFreeSize;
    }

    /**
     * Get 已使用免费空间大小，单位byte。 
     * @return UsedFreeSize 已使用免费空间大小，单位byte。
     */
    public Long getUsedFreeSize() {
        return this.UsedFreeSize;
    }

    /**
     * Set 已使用免费空间大小，单位byte。
     * @param UsedFreeSize 已使用免费空间大小，单位byte。
     */
    public void setUsedFreeSize(Long UsedFreeSize) {
        this.UsedFreeSize = UsedFreeSize;
    }

    /**
     * Get 已使用收费空间大小，单位byte。 
     * @return UsedBillingSize 已使用收费空间大小，单位byte。
     */
    public Long getUsedBillingSize() {
        return this.UsedBillingSize;
    }

    /**
     * Set 已使用收费空间大小，单位byte。
     * @param UsedBillingSize 已使用收费空间大小，单位byte。
     */
    public void setUsedBillingSize(Long UsedBillingSize) {
        this.UsedBillingSize = UsedBillingSize;
    }

    /**
     * Get 日志备份数量。 
     * @return LogBackupCount 日志备份数量。
     */
    public Long getLogBackupCount() {
        return this.LogBackupCount;
    }

    /**
     * Set 日志备份数量。
     * @param LogBackupCount 日志备份数量。
     */
    public void setLogBackupCount(Long LogBackupCount) {
        this.LogBackupCount = LogBackupCount;
    }

    /**
     * Get 日志备份大小，单位byte。 
     * @return LogBackupSize 日志备份大小，单位byte。
     */
    public Long getLogBackupSize() {
        return this.LogBackupSize;
    }

    /**
     * Set 日志备份大小，单位byte。
     * @param LogBackupSize 日志备份大小，单位byte。
     */
    public void setLogBackupSize(Long LogBackupSize) {
        this.LogBackupSize = LogBackupSize;
    }

    /**
     * Get 手动创建的基础备份数量。 
     * @return ManualBaseBackupCount 手动创建的基础备份数量。
     */
    public Long getManualBaseBackupCount() {
        return this.ManualBaseBackupCount;
    }

    /**
     * Set 手动创建的基础备份数量。
     * @param ManualBaseBackupCount 手动创建的基础备份数量。
     */
    public void setManualBaseBackupCount(Long ManualBaseBackupCount) {
        this.ManualBaseBackupCount = ManualBaseBackupCount;
    }

    /**
     * Get 手动创建的基础备份大小，单位byte。 
     * @return ManualBaseBackupSize 手动创建的基础备份大小，单位byte。
     */
    public Long getManualBaseBackupSize() {
        return this.ManualBaseBackupSize;
    }

    /**
     * Set 手动创建的基础备份大小，单位byte。
     * @param ManualBaseBackupSize 手动创建的基础备份大小，单位byte。
     */
    public void setManualBaseBackupSize(Long ManualBaseBackupSize) {
        this.ManualBaseBackupSize = ManualBaseBackupSize;
    }

    /**
     * Get 自动创建的基础备份数量。 
     * @return AutoBaseBackupCount 自动创建的基础备份数量。
     */
    public Long getAutoBaseBackupCount() {
        return this.AutoBaseBackupCount;
    }

    /**
     * Set 自动创建的基础备份数量。
     * @param AutoBaseBackupCount 自动创建的基础备份数量。
     */
    public void setAutoBaseBackupCount(Long AutoBaseBackupCount) {
        this.AutoBaseBackupCount = AutoBaseBackupCount;
    }

    /**
     * Get 自动创建的基础备份大小，单位byte。 
     * @return AutoBaseBackupSize 自动创建的基础备份大小，单位byte。
     */
    public Long getAutoBaseBackupSize() {
        return this.AutoBaseBackupSize;
    }

    /**
     * Set 自动创建的基础备份大小，单位byte。
     * @param AutoBaseBackupSize 自动创建的基础备份大小，单位byte。
     */
    public void setAutoBaseBackupSize(Long AutoBaseBackupSize) {
        this.AutoBaseBackupSize = AutoBaseBackupSize;
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

    public DescribeBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewResponse(DescribeBackupOverviewResponse source) {
        if (source.TotalFreeSize != null) {
            this.TotalFreeSize = new Long(source.TotalFreeSize);
        }
        if (source.UsedFreeSize != null) {
            this.UsedFreeSize = new Long(source.UsedFreeSize);
        }
        if (source.UsedBillingSize != null) {
            this.UsedBillingSize = new Long(source.UsedBillingSize);
        }
        if (source.LogBackupCount != null) {
            this.LogBackupCount = new Long(source.LogBackupCount);
        }
        if (source.LogBackupSize != null) {
            this.LogBackupSize = new Long(source.LogBackupSize);
        }
        if (source.ManualBaseBackupCount != null) {
            this.ManualBaseBackupCount = new Long(source.ManualBaseBackupCount);
        }
        if (source.ManualBaseBackupSize != null) {
            this.ManualBaseBackupSize = new Long(source.ManualBaseBackupSize);
        }
        if (source.AutoBaseBackupCount != null) {
            this.AutoBaseBackupCount = new Long(source.AutoBaseBackupCount);
        }
        if (source.AutoBaseBackupSize != null) {
            this.AutoBaseBackupSize = new Long(source.AutoBaseBackupSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalFreeSize", this.TotalFreeSize);
        this.setParamSimple(map, prefix + "UsedFreeSize", this.UsedFreeSize);
        this.setParamSimple(map, prefix + "UsedBillingSize", this.UsedBillingSize);
        this.setParamSimple(map, prefix + "LogBackupCount", this.LogBackupCount);
        this.setParamSimple(map, prefix + "LogBackupSize", this.LogBackupSize);
        this.setParamSimple(map, prefix + "ManualBaseBackupCount", this.ManualBaseBackupCount);
        this.setParamSimple(map, prefix + "ManualBaseBackupSize", this.ManualBaseBackupSize);
        this.setParamSimple(map, prefix + "AutoBaseBackupCount", this.AutoBaseBackupCount);
        this.setParamSimple(map, prefix + "AutoBaseBackupSize", this.AutoBaseBackupSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

