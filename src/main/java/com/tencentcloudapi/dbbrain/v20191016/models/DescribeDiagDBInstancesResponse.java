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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagDBInstancesResponse extends AbstractModel{

    /**
    * 实例总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 全实例巡检状态：0：开启全实例巡检；1：未开启全实例巡检。
    */
    @SerializedName("DbScanStatus")
    @Expose
    private Long DbScanStatus;

    /**
    * 实例相关信息。
    */
    @SerializedName("Items")
    @Expose
    private InstanceInfo [] Items;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例总数。 
     * @return TotalCount 实例总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 实例总数。
     * @param TotalCount 实例总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 全实例巡检状态：0：开启全实例巡检；1：未开启全实例巡检。 
     * @return DbScanStatus 全实例巡检状态：0：开启全实例巡检；1：未开启全实例巡检。
     */
    public Long getDbScanStatus() {
        return this.DbScanStatus;
    }

    /**
     * Set 全实例巡检状态：0：开启全实例巡检；1：未开启全实例巡检。
     * @param DbScanStatus 全实例巡检状态：0：开启全实例巡检；1：未开启全实例巡检。
     */
    public void setDbScanStatus(Long DbScanStatus) {
        this.DbScanStatus = DbScanStatus;
    }

    /**
     * Get 实例相关信息。 
     * @return Items 实例相关信息。
     */
    public InstanceInfo [] getItems() {
        return this.Items;
    }

    /**
     * Set 实例相关信息。
     * @param Items 实例相关信息。
     */
    public void setItems(InstanceInfo [] Items) {
        this.Items = Items;
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

    public DescribeDiagDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagDBInstancesResponse(DescribeDiagDBInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DbScanStatus != null) {
            this.DbScanStatus = new Long(source.DbScanStatus);
        }
        if (source.Items != null) {
            this.Items = new InstanceInfo[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceInfo(source.Items[i]);
            }
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
        this.setParamSimple(map, prefix + "DbScanStatus", this.DbScanStatus);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

