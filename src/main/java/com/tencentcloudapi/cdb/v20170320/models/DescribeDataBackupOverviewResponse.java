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
    private Long DataBackupVolume;

    /**
    * 当前地域的数据备份总个数。
    */
    @SerializedName("DataBackupCount")
    @Expose
    private Long DataBackupCount;

    /**
    * 当前地域的自动备份总容量。
    */
    @SerializedName("AutoBackupVolume")
    @Expose
    private Long AutoBackupVolume;

    /**
    * 当前地域的自动备份总个数。
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * 当前地域的手动备份总容量。
    */
    @SerializedName("ManualBackupVolume")
    @Expose
    private Long ManualBackupVolume;

    /**
    * 当前地域的手动备份总个数。
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * 异地备份总容量。
    */
    @SerializedName("RemoteBackupVolume")
    @Expose
    private Long RemoteBackupVolume;

    /**
    * 异地备份总个数。
    */
    @SerializedName("RemoteBackupCount")
    @Expose
    private Long RemoteBackupCount;

    /**
    * 当前地域归档备份总容量。
    */
    @SerializedName("DataBackupArchiveVolume")
    @Expose
    private Long DataBackupArchiveVolume;

    /**
    * 当前地域归档备份总个数。
    */
    @SerializedName("DataBackupArchiveCount")
    @Expose
    private Long DataBackupArchiveCount;

    /**
    * 当前地域标准存储备份总容量。
    */
    @SerializedName("DataBackupStandbyVolume")
    @Expose
    private Long DataBackupStandbyVolume;

    /**
    * 当前地域标准存储备份总个数。
    */
    @SerializedName("DataBackupStandbyCount")
    @Expose
    private Long DataBackupStandbyCount;

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
    public Long getDataBackupVolume() {
        return this.DataBackupVolume;
    }

    /**
     * Set 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。
     * @param DataBackupVolume 当前地域的数据备份总容量（包含自动备份和手动备份，单位为字节）。
     */
    public void setDataBackupVolume(Long DataBackupVolume) {
        this.DataBackupVolume = DataBackupVolume;
    }

    /**
     * Get 当前地域的数据备份总个数。 
     * @return DataBackupCount 当前地域的数据备份总个数。
     */
    public Long getDataBackupCount() {
        return this.DataBackupCount;
    }

    /**
     * Set 当前地域的数据备份总个数。
     * @param DataBackupCount 当前地域的数据备份总个数。
     */
    public void setDataBackupCount(Long DataBackupCount) {
        this.DataBackupCount = DataBackupCount;
    }

    /**
     * Get 当前地域的自动备份总容量。 
     * @return AutoBackupVolume 当前地域的自动备份总容量。
     */
    public Long getAutoBackupVolume() {
        return this.AutoBackupVolume;
    }

    /**
     * Set 当前地域的自动备份总容量。
     * @param AutoBackupVolume 当前地域的自动备份总容量。
     */
    public void setAutoBackupVolume(Long AutoBackupVolume) {
        this.AutoBackupVolume = AutoBackupVolume;
    }

    /**
     * Get 当前地域的自动备份总个数。 
     * @return AutoBackupCount 当前地域的自动备份总个数。
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 当前地域的自动备份总个数。
     * @param AutoBackupCount 当前地域的自动备份总个数。
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get 当前地域的手动备份总容量。 
     * @return ManualBackupVolume 当前地域的手动备份总容量。
     */
    public Long getManualBackupVolume() {
        return this.ManualBackupVolume;
    }

    /**
     * Set 当前地域的手动备份总容量。
     * @param ManualBackupVolume 当前地域的手动备份总容量。
     */
    public void setManualBackupVolume(Long ManualBackupVolume) {
        this.ManualBackupVolume = ManualBackupVolume;
    }

    /**
     * Get 当前地域的手动备份总个数。 
     * @return ManualBackupCount 当前地域的手动备份总个数。
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 当前地域的手动备份总个数。
     * @param ManualBackupCount 当前地域的手动备份总个数。
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get 异地备份总容量。 
     * @return RemoteBackupVolume 异地备份总容量。
     */
    public Long getRemoteBackupVolume() {
        return this.RemoteBackupVolume;
    }

    /**
     * Set 异地备份总容量。
     * @param RemoteBackupVolume 异地备份总容量。
     */
    public void setRemoteBackupVolume(Long RemoteBackupVolume) {
        this.RemoteBackupVolume = RemoteBackupVolume;
    }

    /**
     * Get 异地备份总个数。 
     * @return RemoteBackupCount 异地备份总个数。
     */
    public Long getRemoteBackupCount() {
        return this.RemoteBackupCount;
    }

    /**
     * Set 异地备份总个数。
     * @param RemoteBackupCount 异地备份总个数。
     */
    public void setRemoteBackupCount(Long RemoteBackupCount) {
        this.RemoteBackupCount = RemoteBackupCount;
    }

    /**
     * Get 当前地域归档备份总容量。 
     * @return DataBackupArchiveVolume 当前地域归档备份总容量。
     */
    public Long getDataBackupArchiveVolume() {
        return this.DataBackupArchiveVolume;
    }

    /**
     * Set 当前地域归档备份总容量。
     * @param DataBackupArchiveVolume 当前地域归档备份总容量。
     */
    public void setDataBackupArchiveVolume(Long DataBackupArchiveVolume) {
        this.DataBackupArchiveVolume = DataBackupArchiveVolume;
    }

    /**
     * Get 当前地域归档备份总个数。 
     * @return DataBackupArchiveCount 当前地域归档备份总个数。
     */
    public Long getDataBackupArchiveCount() {
        return this.DataBackupArchiveCount;
    }

    /**
     * Set 当前地域归档备份总个数。
     * @param DataBackupArchiveCount 当前地域归档备份总个数。
     */
    public void setDataBackupArchiveCount(Long DataBackupArchiveCount) {
        this.DataBackupArchiveCount = DataBackupArchiveCount;
    }

    /**
     * Get 当前地域标准存储备份总容量。 
     * @return DataBackupStandbyVolume 当前地域标准存储备份总容量。
     */
    public Long getDataBackupStandbyVolume() {
        return this.DataBackupStandbyVolume;
    }

    /**
     * Set 当前地域标准存储备份总容量。
     * @param DataBackupStandbyVolume 当前地域标准存储备份总容量。
     */
    public void setDataBackupStandbyVolume(Long DataBackupStandbyVolume) {
        this.DataBackupStandbyVolume = DataBackupStandbyVolume;
    }

    /**
     * Get 当前地域标准存储备份总个数。 
     * @return DataBackupStandbyCount 当前地域标准存储备份总个数。
     */
    public Long getDataBackupStandbyCount() {
        return this.DataBackupStandbyCount;
    }

    /**
     * Set 当前地域标准存储备份总个数。
     * @param DataBackupStandbyCount 当前地域标准存储备份总个数。
     */
    public void setDataBackupStandbyCount(Long DataBackupStandbyCount) {
        this.DataBackupStandbyCount = DataBackupStandbyCount;
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

    public DescribeDataBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataBackupOverviewResponse(DescribeDataBackupOverviewResponse source) {
        if (source.DataBackupVolume != null) {
            this.DataBackupVolume = new Long(source.DataBackupVolume);
        }
        if (source.DataBackupCount != null) {
            this.DataBackupCount = new Long(source.DataBackupCount);
        }
        if (source.AutoBackupVolume != null) {
            this.AutoBackupVolume = new Long(source.AutoBackupVolume);
        }
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.ManualBackupVolume != null) {
            this.ManualBackupVolume = new Long(source.ManualBackupVolume);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.RemoteBackupVolume != null) {
            this.RemoteBackupVolume = new Long(source.RemoteBackupVolume);
        }
        if (source.RemoteBackupCount != null) {
            this.RemoteBackupCount = new Long(source.RemoteBackupCount);
        }
        if (source.DataBackupArchiveVolume != null) {
            this.DataBackupArchiveVolume = new Long(source.DataBackupArchiveVolume);
        }
        if (source.DataBackupArchiveCount != null) {
            this.DataBackupArchiveCount = new Long(source.DataBackupArchiveCount);
        }
        if (source.DataBackupStandbyVolume != null) {
            this.DataBackupStandbyVolume = new Long(source.DataBackupStandbyVolume);
        }
        if (source.DataBackupStandbyCount != null) {
            this.DataBackupStandbyCount = new Long(source.DataBackupStandbyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamSimple(map, prefix + "RemoteBackupVolume", this.RemoteBackupVolume);
        this.setParamSimple(map, prefix + "RemoteBackupCount", this.RemoteBackupCount);
        this.setParamSimple(map, prefix + "DataBackupArchiveVolume", this.DataBackupArchiveVolume);
        this.setParamSimple(map, prefix + "DataBackupArchiveCount", this.DataBackupArchiveCount);
        this.setParamSimple(map, prefix + "DataBackupStandbyVolume", this.DataBackupStandbyVolume);
        this.setParamSimple(map, prefix + "DataBackupStandbyCount", this.DataBackupStandbyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

