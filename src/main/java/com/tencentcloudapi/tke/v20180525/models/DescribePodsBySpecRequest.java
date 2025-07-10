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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePodsBySpecRequest extends AbstractModel {

    /**
    * 核数
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 内存，单位：GiB
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 卡数，有0.25、0.5、1、2、4和8
    */
    @SerializedName("GpuNum")
    @Expose
    private String GpuNum;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点 ID
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * pod-type
按照**【Pod 类型**】进行过滤。资源类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
类型：String
必选：否

pod-deduct
按照**【上个周期抵扣的Pod**】进行过滤。Values可不设置。
必选：否

pod-not-deduct
按照**【上个周期未抵扣的Pod**】进行过滤。Values可不设置。
必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 核数 
     * @return Cpu 核数
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核数
     * @param Cpu 核数
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，单位：GiB 
     * @return Memory 内存，单位：GiB
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位：GiB
     * @param Memory 内存，单位：GiB
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 卡数，有0.25、0.5、1、2、4和8 
     * @return GpuNum 卡数，有0.25、0.5、1、2、4和8
     */
    public String getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set 卡数，有0.25、0.5、1、2、4和8
     * @param GpuNum 卡数，有0.25、0.5、1、2、4和8
     */
    public void setGpuNum(String GpuNum) {
        this.GpuNum = GpuNum;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点 ID 
     * @return NodeName 节点 ID
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点 ID
     * @param NodeName 节点 ID
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 偏移量，默认0。 
     * @return Offset 偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0。
     * @param Offset 偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get pod-type
按照**【Pod 类型**】进行过滤。资源类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
类型：String
必选：否

pod-deduct
按照**【上个周期抵扣的Pod**】进行过滤。Values可不设置。
必选：否

pod-not-deduct
按照**【上个周期未抵扣的Pod**】进行过滤。Values可不设置。
必选：否 
     * @return Filters pod-type
按照**【Pod 类型**】进行过滤。资源类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
类型：String
必选：否

pod-deduct
按照**【上个周期抵扣的Pod**】进行过滤。Values可不设置。
必选：否

pod-not-deduct
按照**【上个周期未抵扣的Pod**】进行过滤。Values可不设置。
必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set pod-type
按照**【Pod 类型**】进行过滤。资源类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
类型：String
必选：否

pod-deduct
按照**【上个周期抵扣的Pod**】进行过滤。Values可不设置。
必选：否

pod-not-deduct
按照**【上个周期未抵扣的Pod**】进行过滤。Values可不设置。
必选：否
     * @param Filters pod-type
按照**【Pod 类型**】进行过滤。资源类型：intel、amd、v100、t4、a10\*gnv4、a10\*gnv4v等。
类型：String
必选：否

pod-deduct
按照**【上个周期抵扣的Pod**】进行过滤。Values可不设置。
必选：否

pod-not-deduct
按照**【上个周期未抵扣的Pod**】进行过滤。Values可不设置。
必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePodsBySpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePodsBySpecRequest(DescribePodsBySpecRequest source) {
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.GpuNum != null) {
            this.GpuNum = new String(source.GpuNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "GpuNum", this.GpuNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

