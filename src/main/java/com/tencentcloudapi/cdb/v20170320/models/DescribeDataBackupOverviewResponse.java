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

public class DescribeDataBackupOverviewResponse extends AbstractModel{

    /**
    * 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。
    */
    @SerializedName("DataBackupVolume")
    @Expose
    private Integer DataBackupVolume;

    /**
    * 当前地域的数据备份总个数。
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Integer DataBackupCount;

    /**
    * 当前地域的自动备份总容量。
    */
    @SerializedName("AutoBackupVolume")
    @Expose
    private Integer AutoBackupVolume;

    /**
    * 当前地域的自动备份总个数。
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Integer AutoBackupCount;

    /**
    * 当前地域的手动备份总容量。
    */
    @SerializedName("ManualBackupVolume")
    @Expose
    private Integer ManualBackupVolume;

    /**
    * 当前地域的手动备份总个数。
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Integer ManualBackupCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。 
     * @return DataBackupVolume 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。
     */
    public Integer getDataBackupVolume() {
        return this.DataBackupVolume;
    }

    /**
     * Set 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。
     * @param DataBackupVolume 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。
     */
    public void setDataBackupVolume(Integer DataBackupVolume) {
        this.DataBackupVolume = DataBackupVolume;
    }

    /**
     * Get 当前地域的数据备份总个数。 
     * @return DataBackupCount 当前地域的数据备份总个数。
     */
    public Integer getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 当前地域的数据备份总个数。
     * @param DataBackupCount 当前地域的数据备份总个数。
     */
    public void setDataBackupCount(Integer DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get 当前地域的自动备份总容量。 
     * @return AutoBackupVolume 当前地域的自动备份总容量。
     */
    public Integer getAutoBackupVolume() {
        return this.AutoBackupVolume;
    }

    /**
     * Set 当前地域的自动备份总容量。
     * @param AutoBackupVolume 当前地域的自动备份总容量。
     */
    public void setAutoBackupVolume(Integer AutoBackupVolume) {
        this.AutoBackupVolume = AutoBackupVolume;
    }

    /**
     * Get 当前地域的自动备份总个数。 
     * @return AutoBackupCount 当前地域的自动备份总个数。
     */
    public Integer getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 当前地域的自动备份总个数。
     * @param AutoBackupCount 当前地域的自动备份总个数。
     */
    public void setAutoBackupCount(Integer AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get 当前地域的手动备份总容量。 
     * @return ManualBackupVolume 当前地域的手动备份总容量。
     */
    public Integer getManualBackupVolume() {
        return this.ManualBackupVolume;
    }

    /**
     * Set 当前地域的手动备份总容量。
     * @param ManualBackupVolume 当前地域的手动备份总容量。
     */
    public void setManualBackupVolume(Integer ManualBackupVolume) {
        this.ManualBackupVolume = ManualBackupVolume;
    }

    /**
     * Get 当前地域的手动备份总个数。 
     * @return ManualBackupCount 当前地域的手动备份总个数。
     */
    public Integer getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 当前地域的手动备份总个数。
     * @param ManualBackupCount 当前地域的手动备份总个数。
     */
    public void setManualBackupCount(Integer ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
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
        this.setParamSimple(map, prefix + "DataBackupVolume", this.DataBackupVolume);
        this.setParamSimple(map, prefix + "DataBackupCount", this.DataBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupVolume", this.AutoBackupVolume);
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupVolume", this.ManualBackupVolume);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

