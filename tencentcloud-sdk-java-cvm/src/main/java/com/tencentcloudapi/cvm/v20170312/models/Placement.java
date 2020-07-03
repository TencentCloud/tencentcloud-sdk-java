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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel{

    /**
    * 实例所属的[可用区](https://cloud.tencent.com/document/product/213/15753#ZoneInfo)ID。该参数也可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例所属项目ID。该参数可以通过调用 [DescribeProject](/document/api/378/4400) 的返回值中的 projectId 字段来获取。不填为默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 指定母机ip生产子机
    */
    @SerializedName("HostIps")
    @Expose
    private String [] HostIps;

    /**
    * 实例所属的专用宿主机ID，仅用于出参。
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
     * Get 实例所属的[可用区](https://cloud.tencent.com/document/product/213/15753#ZoneInfo)ID。该参数也可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。 
     * @return Zone 实例所属的[可用区](https://cloud.tencent.com/document/product/213/15753#ZoneInfo)ID。该参数也可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属的[可用区](https://cloud.tencent.com/document/product/213/15753#ZoneInfo)ID。该参数也可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     * @param Zone 实例所属的[可用区](https://cloud.tencent.com/document/product/213/15753#ZoneInfo)ID。该参数也可以通过调用  [DescribeZones](https://cloud.tencent.com/document/product/213/15707) 的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例所属项目ID。该参数可以通过调用 [DescribeProject](/document/api/378/4400) 的返回值中的 projectId 字段来获取。不填为默认项目。 
     * @return ProjectId 实例所属项目ID。该参数可以通过调用 [DescribeProject](/document/api/378/4400) 的返回值中的 projectId 字段来获取。不填为默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目ID。该参数可以通过调用 [DescribeProject](/document/api/378/4400) 的返回值中的 projectId 字段来获取。不填为默认项目。
     * @param ProjectId 实例所属项目ID。该参数可以通过调用 [DescribeProject](/document/api/378/4400) 的返回值中的 projectId 字段来获取。不填为默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。 
     * @return HostIds 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Set 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。
     * @param HostIds 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get 指定母机ip生产子机 
     * @return HostIps 指定母机ip生产子机
     */
    public String [] getHostIps() {
        return this.HostIps;
    }

    /**
     * Set 指定母机ip生产子机
     * @param HostIps 指定母机ip生产子机
     */
    public void setHostIps(String [] HostIps) {
        this.HostIps = HostIps;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamArraySimple(map, prefix + "HostIps.", this.HostIps);
        this.setParamSimple(map, prefix + "HostId", this.HostId);

    }
}

