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

public class DescribeBinlogBackupOverviewResponse extends AbstractModel{

    /**
    * 总的日志备份容量，包含异地日志备份（单位为字节）。
    */
    @SerializedName("BinlogBackupVolume")
    @Expose
    private Long BinlogBackupVolume;

    /**
    * 总的日志备份个数，包含异地日志备份。
    */
    @SerializedName("BinlogBackupCount")
    @Expose
    private Long BinlogBackupCount;

    /**
    * 异地日志备份容量（单位为字节）。
    */
    @SerializedName("RemoteBinlogVolume")
    @Expose
    private Long RemoteBinlogVolume;

    /**
    * 异地日志备份个数。
    */
    @SerializedName("RemoteBinlogCount")
    @Expose
    private Long RemoteBinlogCount;

    /**
    * 归档日志备份容量（单位为字节）。
    */
    @SerializedName("BinlogArchiveVolume")
    @Expose
    private Long BinlogArchiveVolume;

    /**
    * 归档日志备份个数。
    */
    @SerializedName("BinlogArchiveCount")
    @Expose
    private Long BinlogArchiveCount;

    /**
    * 标准存储日志备份容量（单位为字节）。
    */
    @SerializedName("BinlogStandbyVolume")
    @Expose
    private Long BinlogStandbyVolume;

    /**
    * 标准存储日志备份个数。
    */
    @SerializedName("BinlogStandbyCount")
    @Expose
    private Long BinlogStandbyCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总的日志备份容量，包含异地日志备份（单位为字节）。 
     * @return BinlogBackupVolume 总的日志备份容量，包含异地日志备份（单位为字节）。
     */
    public Long getBinlogBackupVolume() {
        return this.BinlogBackupVolume;
    }

    /**
     * Set 总的日志备份容量，包含异地日志备份（单位为字节）。
     * @param BinlogBackupVolume 总的日志备份容量，包含异地日志备份（单位为字节）。
     */
    public void setBinlogBackupVolume(Long BinlogBackupVolume) {
        this.BinlogBackupVolume = BinlogBackupVolume;
    }

    /**
     * Get 总的日志备份个数，包含异地日志备份。 
     * @return BinlogBackupCount 总的日志备份个数，包含异地日志备份。
     */
    public Long getBinlogBackupCount() {
        return this.BinlogBackupCount;
    }

    /**
     * Set 总的日志备份个数，包含异地日志备份。
     * @param BinlogBackupCount 总的日志备份个数，包含异地日志备份。
     */
    public void setBinlogBackupCount(Long BinlogBackupCount) {
        this.BinlogBackupCount = BinlogBackupCount;
    }

    /**
     * Get 异地日志备份容量（单位为字节）。 
     * @return RemoteBinlogVolume 异地日志备份容量（单位为字节）。
     */
    public Long getRemoteBinlogVolume() {
        return this.RemoteBinlogVolume;
    }

    /**
     * Set 异地日志备份容量（单位为字节）。
     * @param RemoteBinlogVolume 异地日志备份容量（单位为字节）。
     */
    public void setRemoteBinlogVolume(Long RemoteBinlogVolume) {
        this.RemoteBinlogVolume = RemoteBinlogVolume;
    }

    /**
     * Get 异地日志备份个数。 
     * @return RemoteBinlogCount 异地日志备份个数。
     */
    public Long getRemoteBinlogCount() {
        return this.RemoteBinlogCount;
    }

    /**
     * Set 异地日志备份个数。
     * @param RemoteBinlogCount 异地日志备份个数。
     */
    public void setRemoteBinlogCount(Long RemoteBinlogCount) {
        this.RemoteBinlogCount = RemoteBinlogCount;
    }

    /**
     * Get 归档日志备份容量（单位为字节）。 
     * @return BinlogArchiveVolume 归档日志备份容量（单位为字节）。
     */
    public Long getBinlogArchiveVolume() {
        return this.BinlogArchiveVolume;
    }

    /**
     * Set 归档日志备份容量（单位为字节）。
     * @param BinlogArchiveVolume 归档日志备份容量（单位为字节）。
     */
    public void setBinlogArchiveVolume(Long BinlogArchiveVolume) {
        this.BinlogArchiveVolume = BinlogArchiveVolume;
    }

    /**
     * Get 归档日志备份个数。 
     * @return BinlogArchiveCount 归档日志备份个数。
     */
    public Long getBinlogArchiveCount() {
        return this.BinlogArchiveCount;
    }

    /**
     * Set 归档日志备份个数。
     * @param BinlogArchiveCount 归档日志备份个数。
     */
    public void setBinlogArchiveCount(Long BinlogArchiveCount) {
        this.BinlogArchiveCount = BinlogArchiveCount;
    }

    /**
     * Get 标准存储日志备份容量（单位为字节）。 
     * @return BinlogStandbyVolume 标准存储日志备份容量（单位为字节）。
     */
    public Long getBinlogStandbyVolume() {
        return this.BinlogStandbyVolume;
    }

    /**
     * Set 标准存储日志备份容量（单位为字节）。
     * @param BinlogStandbyVolume 标准存储日志备份容量（单位为字节）。
     */
    public void setBinlogStandbyVolume(Long BinlogStandbyVolume) {
        this.BinlogStandbyVolume = BinlogStandbyVolume;
    }

    /**
     * Get 标准存储日志备份个数。 
     * @return BinlogStandbyCount 标准存储日志备份个数。
     */
    public Long getBinlogStandbyCount() {
        return this.BinlogStandbyCount;
    }

    /**
     * Set 标准存储日志备份个数。
     * @param BinlogStandbyCount 标准存储日志备份个数。
     */
    public void setBinlogStandbyCount(Long BinlogStandbyCount) {
        this.BinlogStandbyCount = BinlogStandbyCount;
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

    public DescribeBinlogBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogBackupOverviewResponse(DescribeBinlogBackupOverviewResponse source) {
        if (source.BinlogBackupVolume != null) {
            this.BinlogBackupVolume = new Long(source.BinlogBackupVolume);
        }
        if (source.BinlogBackupCount != null) {
            this.BinlogBackupCount = new Long(source.BinlogBackupCount);
        }
        if (source.RemoteBinlogVolume != null) {
            this.RemoteBinlogVolume = new Long(source.RemoteBinlogVolume);
        }
        if (source.RemoteBinlogCount != null) {
            this.RemoteBinlogCount = new Long(source.RemoteBinlogCount);
        }
        if (source.BinlogArchiveVolume != null) {
            this.BinlogArchiveVolume = new Long(source.BinlogArchiveVolume);
        }
        if (source.BinlogArchiveCount != null) {
            this.BinlogArchiveCount = new Long(source.BinlogArchiveCount);
        }
        if (source.BinlogStandbyVolume != null) {
            this.BinlogStandbyVolume = new Long(source.BinlogStandbyVolume);
        }
        if (source.BinlogStandbyCount != null) {
            this.BinlogStandbyCount = new Long(source.BinlogStandbyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogBackupVolume", this.BinlogBackupVolume);
        this.setParamSimple(map, prefix + "BinlogBackupCount", this.BinlogBackupCount);
        this.setParamSimple(map, prefix + "RemoteBinlogVolume", this.RemoteBinlogVolume);
        this.setParamSimple(map, prefix + "RemoteBinlogCount", this.RemoteBinlogCount);
        this.setParamSimple(map, prefix + "BinlogArchiveVolume", this.BinlogArchiveVolume);
        this.setParamSimple(map, prefix + "BinlogArchiveCount", this.BinlogArchiveCount);
        this.setParamSimple(map, prefix + "BinlogStandbyVolume", this.BinlogStandbyVolume);
        this.setParamSimple(map, prefix + "BinlogStandbyCount", this.BinlogStandbyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

