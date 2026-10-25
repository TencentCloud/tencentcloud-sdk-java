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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBinlogDownloadUrlRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Binlog文件ID</p>
    */
    @SerializedName("BinlogId")
    @Expose
    private Long BinlogId;

    /**
    * <p>备份下载来源限制条件</p>
    */
    @SerializedName("DownloadRestriction")
    @Expose
    private BackupLimitRestriction DownloadRestriction;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Binlog文件ID</p> 
     * @return BinlogId <p>Binlog文件ID</p>
     */
    public Long getBinlogId() {
        return this.BinlogId;
    }

    /**
     * Set <p>Binlog文件ID</p>
     * @param BinlogId <p>Binlog文件ID</p>
     */
    public void setBinlogId(Long BinlogId) {
        this.BinlogId = BinlogId;
    }

    /**
     * Get <p>备份下载来源限制条件</p> 
     * @return DownloadRestriction <p>备份下载来源限制条件</p>
     */
    public BackupLimitRestriction getDownloadRestriction() {
        return this.DownloadRestriction;
    }

    /**
     * Set <p>备份下载来源限制条件</p>
     * @param DownloadRestriction <p>备份下载来源限制条件</p>
     */
    public void setDownloadRestriction(BackupLimitRestriction DownloadRestriction) {
        this.DownloadRestriction = DownloadRestriction;
    }

    public DescribeBinlogDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogDownloadUrlRequest(DescribeBinlogDownloadUrlRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BinlogId != null) {
            this.BinlogId = new Long(source.BinlogId);
        }
        if (source.DownloadRestriction != null) {
            this.DownloadRestriction = new BackupLimitRestriction(source.DownloadRestriction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BinlogId", this.BinlogId);
        this.setParamObj(map, prefix + "DownloadRestriction.", this.DownloadRestriction);

    }
}

