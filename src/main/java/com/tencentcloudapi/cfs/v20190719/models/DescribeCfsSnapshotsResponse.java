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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfsSnapshotsResponse extends AbstractModel{

    /**
    * 总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 快照信息描述
    */
    @SerializedName("Snapshots")
    @Expose
    private SnapshotInfo [] Snapshots;

    /**
    * 快照列表快照汇总
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总个数 
     * @return TotalCount 总个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总个数
     * @param TotalCount 总个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 快照信息描述 
     * @return Snapshots 快照信息描述
     */
    public SnapshotInfo [] getSnapshots() {
        return this.Snapshots;
    }

    /**
     * Set 快照信息描述
     * @param Snapshots 快照信息描述
     */
    public void setSnapshots(SnapshotInfo [] Snapshots) {
        this.Snapshots = Snapshots;
    }

    /**
     * Get 快照列表快照汇总 
     * @return TotalSize 快照列表快照汇总
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 快照列表快照汇总
     * @param TotalSize 快照列表快照汇总
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
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

    public DescribeCfsSnapshotsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfsSnapshotsResponse(DescribeCfsSnapshotsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Snapshots != null) {
            this.Snapshots = new SnapshotInfo[source.Snapshots.length];
            for (int i = 0; i < source.Snapshots.length; i++) {
                this.Snapshots[i] = new SnapshotInfo(source.Snapshots[i]);
            }
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Snapshots.", this.Snapshots);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

