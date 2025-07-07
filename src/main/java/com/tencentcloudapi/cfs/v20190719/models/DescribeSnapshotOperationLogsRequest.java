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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotOperationLogsRequest extends AbstractModel {

    /**
    * 快照ID，可以通过[DescribeCfsSnapshots](https://cloud.tencent.com/document/api/582/80206) 查询获取
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 起始时间，格式“YYYY-MM-DD hh:mm:ss”
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式“YYYY-MM-DD hh:mm:ss”
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 快照ID，可以通过[DescribeCfsSnapshots](https://cloud.tencent.com/document/api/582/80206) 查询获取 
     * @return SnapshotId 快照ID，可以通过[DescribeCfsSnapshots](https://cloud.tencent.com/document/api/582/80206) 查询获取
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID，可以通过[DescribeCfsSnapshots](https://cloud.tencent.com/document/api/582/80206) 查询获取
     * @param SnapshotId 快照ID，可以通过[DescribeCfsSnapshots](https://cloud.tencent.com/document/api/582/80206) 查询获取
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 起始时间，格式“YYYY-MM-DD hh:mm:ss” 
     * @return StartTime 起始时间，格式“YYYY-MM-DD hh:mm:ss”
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，格式“YYYY-MM-DD hh:mm:ss”
     * @param StartTime 起始时间，格式“YYYY-MM-DD hh:mm:ss”
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式“YYYY-MM-DD hh:mm:ss” 
     * @return EndTime 结束时间，格式“YYYY-MM-DD hh:mm:ss”
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式“YYYY-MM-DD hh:mm:ss”
     * @param EndTime 结束时间，格式“YYYY-MM-DD hh:mm:ss”
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeSnapshotOperationLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotOperationLogsRequest(DescribeSnapshotOperationLogsRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

