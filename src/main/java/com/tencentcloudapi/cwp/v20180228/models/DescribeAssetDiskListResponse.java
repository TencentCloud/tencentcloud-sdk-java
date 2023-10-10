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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetDiskListResponse extends AbstractModel{

    /**
    * 磁盘分区列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disks")
    @Expose
    private AssetDiskPartitionInfo [] Disks;

    /**
    * 分区总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 磁盘分区列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disks 磁盘分区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetDiskPartitionInfo [] getDisks() {
        return this.Disks;
    }

    /**
     * Set 磁盘分区列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disks 磁盘分区列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisks(AssetDiskPartitionInfo [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get 分区总数 
     * @return Total 分区总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 分区总数
     * @param Total 分区总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeAssetDiskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetDiskListResponse(DescribeAssetDiskListResponse source) {
        if (source.Disks != null) {
            this.Disks = new AssetDiskPartitionInfo[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new AssetDiskPartitionInfo(source.Disks[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

