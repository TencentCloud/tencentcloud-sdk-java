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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHpcClustersRequest extends AbstractModel {

    /**
    * 一个或多个待操作的高性能计算集群ID。集群ID信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。每次请求高性能计算集群信息的批量上限为100，默认配合Limit传参数，不能超过Limit值，Limit默认20。
    */
    @SerializedName("HpcClusterIds")
    @Expose
    private String [] HpcClusterIds;

    /**
    * 高性能计算集群名称，长度限制[1-60]。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可用区信息。可用区信息可通过 [查询可用区信息](https://cloud.tencent.com/document/api/213/15707) 接口获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 偏移量, 默认值0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本次请求量, 默认值20，范围限制为[1-100]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 高性能计算集群类型，当前有三个取值：分别是CDC/CHC/STANDARD，其中STANDARD是默认的标准模式。
    */
    @SerializedName("HpcClusterType")
    @Expose
    private String HpcClusterType;

    /**
    * 高性能计算集群对应的业务场景标识，当前只支持CDC场景类型。	
    */
    @SerializedName("HpcClusterBusinessId")
    @Expose
    private String HpcClusterBusinessId;

    /**
    * 高性能计算集群实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <li><strong>tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag-value</strong></li> <p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag:tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 一个或多个待操作的高性能计算集群ID。集群ID信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。每次请求高性能计算集群信息的批量上限为100，默认配合Limit传参数，不能超过Limit值，Limit默认20。 
     * @return HpcClusterIds 一个或多个待操作的高性能计算集群ID。集群ID信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。每次请求高性能计算集群信息的批量上限为100，默认配合Limit传参数，不能超过Limit值，Limit默认20。
     */
    public String [] getHpcClusterIds() {
        return this.HpcClusterIds;
    }

    /**
     * Set 一个或多个待操作的高性能计算集群ID。集群ID信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。每次请求高性能计算集群信息的批量上限为100，默认配合Limit传参数，不能超过Limit值，Limit默认20。
     * @param HpcClusterIds 一个或多个待操作的高性能计算集群ID。集群ID信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。每次请求高性能计算集群信息的批量上限为100，默认配合Limit传参数，不能超过Limit值，Limit默认20。
     */
    public void setHpcClusterIds(String [] HpcClusterIds) {
        this.HpcClusterIds = HpcClusterIds;
    }

    /**
     * Get 高性能计算集群名称，长度限制[1-60]。 
     * @return Name 高性能计算集群名称，长度限制[1-60]。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高性能计算集群名称，长度限制[1-60]。
     * @param Name 高性能计算集群名称，长度限制[1-60]。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 可用区信息。可用区信息可通过 [查询可用区信息](https://cloud.tencent.com/document/api/213/15707) 接口获取。 
     * @return Zone 可用区信息。可用区信息可通过 [查询可用区信息](https://cloud.tencent.com/document/api/213/15707) 接口获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息。可用区信息可通过 [查询可用区信息](https://cloud.tencent.com/document/api/213/15707) 接口获取。
     * @param Zone 可用区信息。可用区信息可通过 [查询可用区信息](https://cloud.tencent.com/document/api/213/15707) 接口获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 偏移量, 默认值0。 
     * @return Offset 偏移量, 默认值0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量, 默认值0。
     * @param Offset 偏移量, 默认值0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本次请求量, 默认值20，范围限制为[1-100]。 
     * @return Limit 本次请求量, 默认值20，范围限制为[1-100]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本次请求量, 默认值20，范围限制为[1-100]。
     * @param Limit 本次请求量, 默认值20，范围限制为[1-100]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 高性能计算集群类型，当前有三个取值：分别是CDC/CHC/STANDARD，其中STANDARD是默认的标准模式。 
     * @return HpcClusterType 高性能计算集群类型，当前有三个取值：分别是CDC/CHC/STANDARD，其中STANDARD是默认的标准模式。
     */
    public String getHpcClusterType() {
        return this.HpcClusterType;
    }

    /**
     * Set 高性能计算集群类型，当前有三个取值：分别是CDC/CHC/STANDARD，其中STANDARD是默认的标准模式。
     * @param HpcClusterType 高性能计算集群类型，当前有三个取值：分别是CDC/CHC/STANDARD，其中STANDARD是默认的标准模式。
     */
    public void setHpcClusterType(String HpcClusterType) {
        this.HpcClusterType = HpcClusterType;
    }

    /**
     * Get 高性能计算集群对应的业务场景标识，当前只支持CDC场景类型。	 
     * @return HpcClusterBusinessId 高性能计算集群对应的业务场景标识，当前只支持CDC场景类型。	
     */
    public String getHpcClusterBusinessId() {
        return this.HpcClusterBusinessId;
    }

    /**
     * Set 高性能计算集群对应的业务场景标识，当前只支持CDC场景类型。	
     * @param HpcClusterBusinessId 高性能计算集群对应的业务场景标识，当前只支持CDC场景类型。	
     */
    public void setHpcClusterBusinessId(String HpcClusterBusinessId) {
        this.HpcClusterBusinessId = HpcClusterBusinessId;
    }

    /**
     * Get 高性能计算集群实例类型 
     * @return InstanceType 高性能计算集群实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 高性能计算集群实例类型
     * @param InstanceType 高性能计算集群实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <li><strong>tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag-value</strong></li> <p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag:tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。 
     * @return Filters <li><strong>tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag-value</strong></li> <p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag:tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li><strong>tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag-value</strong></li> <p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag:tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。
     * @param Filters <li><strong>tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag-value</strong></li> <p style="padding-left: 30px;">按照【<strong>标签值</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>tag:tag-key</strong></li> <p style="padding-left: 30px;">按照【<strong>标签键值对</strong>】进行过滤。tag-key使用具体的标签键进行替换。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> 每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeHpcClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHpcClustersRequest(DescribeHpcClustersRequest source) {
        if (source.HpcClusterIds != null) {
            this.HpcClusterIds = new String[source.HpcClusterIds.length];
            for (int i = 0; i < source.HpcClusterIds.length; i++) {
                this.HpcClusterIds[i] = new String(source.HpcClusterIds[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.HpcClusterType != null) {
            this.HpcClusterType = new String(source.HpcClusterType);
        }
        if (source.HpcClusterBusinessId != null) {
            this.HpcClusterBusinessId = new String(source.HpcClusterBusinessId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
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
        this.setParamArraySimple(map, prefix + "HpcClusterIds.", this.HpcClusterIds);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "HpcClusterType", this.HpcClusterType);
        this.setParamSimple(map, prefix + "HpcClusterBusinessId", this.HpcClusterBusinessId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

