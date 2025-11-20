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

public class CreateHpcClusterRequest extends AbstractModel {

    /**
    * 可用区信息。可用区信息可通过 [查询可用区信息](https://cloud.tencent.com/document/api/213/15707) 接口获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 高性能计算集群名称，长度限制[1-60]。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 高性能计算集群备注，长度[1-256]。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。集群信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

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
     * Get 高性能计算集群备注，长度[1-256]。 
     * @return Remark 高性能计算集群备注，长度[1-256]。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 高性能计算集群备注，长度[1-256]。
     * @param Remark 高性能计算集群备注，长度[1-256]。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。集群信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。集群信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。集群信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。集群信息可通过 [查询高性能集群信息](https://cloud.tencent.com/document/api/213/83220) 接口获取。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateHpcClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHpcClusterRequest(CreateHpcClusterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.HpcClusterType != null) {
            this.HpcClusterType = new String(source.HpcClusterType);
        }
        if (source.HpcClusterBusinessId != null) {
            this.HpcClusterBusinessId = new String(source.HpcClusterBusinessId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "HpcClusterType", this.HpcClusterType);
        this.setParamSimple(map, prefix + "HpcClusterBusinessId", this.HpcClusterBusinessId);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

