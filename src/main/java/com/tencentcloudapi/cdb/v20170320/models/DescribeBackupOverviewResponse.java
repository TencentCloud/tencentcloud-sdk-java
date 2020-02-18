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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupOverviewResponse extends AbstractModel{

    /**
    * 用户在当前地域备份的总个数（包含数据备份和日志备份）。
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * 用户在当前地域备份的总容量
    */
    @SerializedName("BackupVolume")
    @Expose
    private Long BackupVolume;

    /**
    * 用户在当前地域备份的计费容量，即超出赠送容量的部分。
    */
    @SerializedName("BillingVolume")
    @Expose
    private Long BillingVolume;

    /**
    * 用户在当前地域获得的赠送备份容量。
    */
    @SerializedName("FreeVolume")
    @Expose
    private Long FreeVolume;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户在当前地域备份的总个数（包含数据备份和日志备份）。 
     * @return BackupCount 用户在当前地域备份的总个数（包含数据备份和日志备份）。
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 用户在当前地域备份的总个数（包含数据备份和日志备份）。
     * @param BackupCount 用户在当前地域备份的总个数（包含数据备份和日志备份）。
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get 用户在当前地域备份的总容量 
     * @return BackupVolume 用户在当前地域备份的总容量
     */
    public Long getBackupVolume() {
        return this.BackupVolume;
    }

    /**
     * Set 用户在当前地域备份的总容量
     * @param BackupVolume 用户在当前地域备份的总容量
     */
    public void setBackupVolume(Long BackupVolume) {
        this.BackupVolume = BackupVolume;
    }

    /**
     * Get 用户在当前地域备份的计费容量，即超出赠送容量的部分。 
     * @return BillingVolume 用户在当前地域备份的计费容量，即超出赠送容量的部分。
     */
    public Long getBillingVolume() {
        return this.BillingVolume;
    }

    /**
     * Set 用户在当前地域备份的计费容量，即超出赠送容量的部分。
     * @param BillingVolume 用户在当前地域备份的计费容量，即超出赠送容量的部分。
     */
    public void setBillingVolume(Long BillingVolume) {
        this.BillingVolume = BillingVolume;
    }

    /**
     * Get 用户在当前地域获得的赠送备份容量。 
     * @return FreeVolume 用户在当前地域获得的赠送备份容量。
     */
    public Long getFreeVolume() {
        return this.FreeVolume;
    }

    /**
     * Set 用户在当前地域获得的赠送备份容量。
     * @param FreeVolume 用户在当前地域获得的赠送备份容量。
     */
    public void setFreeVolume(Long FreeVolume) {
        this.FreeVolume = FreeVolume;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "BackupVolume", this.BackupVolume);
        this.setParamSimple(map, prefix + "BillingVolume", this.BillingVolume);
        this.setParamSimple(map, prefix + "FreeVolume", this.FreeVolume);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

