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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel {

    /**
    * 实例所属的可用区 ID。该参数也可以通过调用 [DescribeZones]的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例所属项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例所属的专用宿主机ID列表。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。仅用于出参，当前暂不支持。
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 实例所属的专用宿主机ID列表，仅用于入参。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * 实例所属项目名。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 实例所属的可用区 ID。该参数也可以通过调用 [DescribeZones]的返回值中的Zone字段来获取。 
     * @return Zone 实例所属的可用区 ID。该参数也可以通过调用 [DescribeZones]的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属的可用区 ID。该参数也可以通过调用 [DescribeZones]的返回值中的Zone字段来获取。
     * @param Zone 实例所属的可用区 ID。该参数也可以通过调用 [DescribeZones]的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例所属项目ID。 
     * @return ProjectId 实例所属项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 实例所属项目ID。
     * @param ProjectId 实例所属项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例所属的专用宿主机ID列表。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。仅用于出参，当前暂不支持。 
     * @return HostId 实例所属的专用宿主机ID列表。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。仅用于出参，当前暂不支持。
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 实例所属的专用宿主机ID列表。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。仅用于出参，当前暂不支持。
     * @param HostId 实例所属的专用宿主机ID列表。如果您有购买专用宿主机并且指定了该参数，则您购买的实例就会随机的部署在这些专用宿主机上。仅用于出参，当前暂不支持。
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
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
     * Get 实例所属项目名。 
     * @return ProjectName 实例所属项目名。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 实例所属项目名。
     * @param ProjectName 实例所属项目名。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
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
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostIds != null) {
            this.HostIds = new String[source.HostIds.length];
            for (int i = 0; i < source.HostIds.length; i++) {
                this.HostIds[i] = new String(source.HostIds[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

