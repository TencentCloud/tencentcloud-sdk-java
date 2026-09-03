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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BenchmarkResourceInfo extends AbstractModel {

    /**
    * <p>评测容器所在资源包 ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>评测容器所在资源组</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>评测容器计费项（规格）</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>规格数量</p>
    */
    @SerializedName("Spec")
    @Expose
    private Long Spec;

    /**
     * Get <p>评测容器所在资源包 ID</p> 
     * @return ResourcePartitionId <p>评测容器所在资源包 ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>评测容器所在资源包 ID</p>
     * @param ResourcePartitionId <p>评测容器所在资源包 ID</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>评测容器所在资源组</p> 
     * @return Queue <p>评测容器所在资源组</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>评测容器所在资源组</p>
     * @param Queue <p>评测容器所在资源组</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>评测容器计费项（规格）</p> 
     * @return BillingItem <p>评测容器计费项（规格）</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>评测容器计费项（规格）</p>
     * @param BillingItem <p>评测容器计费项（规格）</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>规格数量</p> 
     * @return Spec <p>规格数量</p>
     */
    public Long getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>规格数量</p>
     * @param Spec <p>规格数量</p>
     */
    public void setSpec(Long Spec) {
        this.Spec = Spec;
    }

    public BenchmarkResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BenchmarkResourceInfo(BenchmarkResourceInfo source) {
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.Spec != null) {
            this.Spec = new Long(source.Spec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "Spec", this.Spec);

    }
}

