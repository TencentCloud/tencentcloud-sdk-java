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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel {

    /**
    * 实例所属的可用区名称。该参数可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例所属项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 `ProjectId` 字段来获取。默认取值0，表示默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。该参数可以通过调用 [DescribeHosts](https://cloud.tencent.com/document/api/213/16474) 的返回值中的 `HostId` 字段来获取。
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 实例所属的专用宿主机ID，仅用于出参。
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 专有资源预扣策略。取值范围：<li>ResourcePool：使用实例资源池进行资源预扣</li>
    */
    @SerializedName("DedicatedResourcePackTenancy")
    @Expose
    private String DedicatedResourcePackTenancy;

    /**
    * 专有预扣资源ID列表。形如：rpp-7eumgm3l。通过指定专有预扣资源创建实例时，必须同时指定匹配的DedicatedResourcePackTenancy。
    */
    @SerializedName("DedicatedResourcePackIds")
    @Expose
    private String [] DedicatedResourcePackIds;

    /**
    * 实例所属的实例资源池机架ID，仅用于出参。
    */
    @SerializedName("RackId")
    @Expose
    private String RackId;

    /**
     * Get 实例所属的可用区名称。该参数可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。 
     * @return Zone 实例所属的可用区名称。该参数可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属的可用区名称。该参数可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     * @param Zone 实例所属的可用区名称。该参数可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例所属项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 `ProjectId` 字段来获取。默认取值0，表示默认项目。 
     * @return ProjectId 实例所属项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 `ProjectId` 字段来获取。默认取值0，表示默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 `ProjectId` 字段来获取。默认取值0，表示默认项目。
     * @param ProjectId 实例所属项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 `ProjectId` 字段来获取。默认取值0，表示默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。该参数可以通过调用 [DescribeHosts](https://cloud.tencent.com/document/api/213/16474) 的返回值中的 `HostId` 字段来获取。 
     * @return HostIds 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。该参数可以通过调用 [DescribeHosts](https://cloud.tencent.com/document/api/213/16474) 的返回值中的 `HostId` 字段来获取。
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。该参数可以通过调用 [DescribeHosts](https://cloud.tencent.com/document/api/213/16474) 的返回值中的 `HostId` 字段来获取。
     * @param HostIds 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。该参数可以通过调用 [DescribeHosts](https://cloud.tencent.com/document/api/213/16474) 的返回值中的 `HostId` 字段来获取。
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 实例所属的专用宿主机ID，仅用于出参。 
     * @return HostId 实例所属的专用宿主机ID，仅用于出参。
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 实例所属的专用宿主机ID，仅用于出参。
     * @param HostId 实例所属的专用宿主机ID，仅用于出参。
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 专有资源预扣策略。取值范围：<li>ResourcePool：使用实例资源池进行资源预扣</li> 
     * @return DedicatedResourcePackTenancy 专有资源预扣策略。取值范围：<li>ResourcePool：使用实例资源池进行资源预扣</li>
     */
    public String getDedicatedResourcePackTenancy() {
        return this.DedicatedResourcePackTenancy;
    }

    /**
     * Set 专有资源预扣策略。取值范围：<li>ResourcePool：使用实例资源池进行资源预扣</li>
     * @param DedicatedResourcePackTenancy 专有资源预扣策略。取值范围：<li>ResourcePool：使用实例资源池进行资源预扣</li>
     */
    public void setDedicatedResourcePackTenancy(String DedicatedResourcePackTenancy) {
        this.DedicatedResourcePackTenancy = DedicatedResourcePackTenancy;
    }

    /**
     * Get 专有预扣资源ID列表。形如：rpp-7eumgm3l。通过指定专有预扣资源创建实例时，必须同时指定匹配的DedicatedResourcePackTenancy。 
     * @return DedicatedResourcePackIds 专有预扣资源ID列表。形如：rpp-7eumgm3l。通过指定专有预扣资源创建实例时，必须同时指定匹配的DedicatedResourcePackTenancy。
     */
    public String [] getDedicatedResourcePackIds() {
        return this.DedicatedResourcePackIds;
    }

    /**
     * Set 专有预扣资源ID列表。形如：rpp-7eumgm3l。通过指定专有预扣资源创建实例时，必须同时指定匹配的DedicatedResourcePackTenancy。
     * @param DedicatedResourcePackIds 专有预扣资源ID列表。形如：rpp-7eumgm3l。通过指定专有预扣资源创建实例时，必须同时指定匹配的DedicatedResourcePackTenancy。
     */
    public void setDedicatedResourcePackIds(String [] DedicatedResourcePackIds) {
        this.DedicatedResourcePackIds = DedicatedResourcePackIds;
    }

    /**
     * Get 实例所属的实例资源池机架ID，仅用于出参。 
     * @return RackId 实例所属的实例资源池机架ID，仅用于出参。
     */
    public String getRackId() {
        return this.RackId;
    }

    /**
     * Set 实例所属的实例资源池机架ID，仅用于出参。
     * @param RackId 实例所属的实例资源池机架ID，仅用于出参。
     */
    public void setRackId(String RackId) {
        this.RackId = RackId;
    }

    public Placement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Placement(Placement source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.DedicatedResourcePackTenancy != null) {
            this.DedicatedResourcePackTenancy = new String(source.DedicatedResourcePackTenancy);
        }
        if (source.DedicatedResourcePackIds != null) {
            this.DedicatedResourcePackIds = new String[source.DedicatedResourcePackIds.length];
            for (int i = 0; i < source.DedicatedResourcePackIds.length; i++) {
                this.DedicatedResourcePackIds[i] = new String(source.DedicatedResourcePackIds[i]);
            }
        }
        if (source.RackId != null) {
            this.RackId = new String(source.RackId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "DedicatedResourcePackTenancy", this.DedicatedResourcePackTenancy);
        this.setParamArraySimple(map, prefix + "DedicatedResourcePackIds.", this.DedicatedResourcePackIds);
        this.setParamSimple(map, prefix + "RackId", this.RackId);

    }
}

