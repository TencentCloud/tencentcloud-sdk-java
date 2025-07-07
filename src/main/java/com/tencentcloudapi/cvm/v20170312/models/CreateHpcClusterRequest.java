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
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 高性能计算集群名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 高性能计算集群备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 高性能计算集群类型。
    */
    @SerializedName("HpcClusterType")
    @Expose
    private String HpcClusterType;

    /**
    * 高性能计算集群对应的业务场景标识，当前只支持CDC。
    */
    @SerializedName("HpcClusterBusinessId")
    @Expose
    private String HpcClusterBusinessId;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get 可用区。 
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 高性能计算集群名称。 
     * @return Name 高性能计算集群名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 高性能计算集群名称。
     * @param Name 高性能计算集群名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 高性能计算集群备注。 
     * @return Remark 高性能计算集群备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 高性能计算集群备注。
     * @param Remark 高性能计算集群备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 高性能计算集群类型。 
     * @return HpcClusterType 高性能计算集群类型。
     */
    public String getHpcClusterType() {
        return this.HpcClusterType;
    }

    /**
     * Set 高性能计算集群类型。
     * @param HpcClusterType 高性能计算集群类型。
     */
    public void setHpcClusterType(String HpcClusterType) {
        this.HpcClusterType = HpcClusterType;
    }

    /**
     * Get 高性能计算集群对应的业务场景标识，当前只支持CDC。 
     * @return HpcClusterBusinessId 高性能计算集群对应的业务场景标识，当前只支持CDC。
     */
    public String getHpcClusterBusinessId() {
        return this.HpcClusterBusinessId;
    }

    /**
     * Set 高性能计算集群对应的业务场景标识，当前只支持CDC。
     * @param HpcClusterBusinessId 高性能计算集群对应的业务场景标识，当前只支持CDC。
     */
    public void setHpcClusterBusinessId(String HpcClusterBusinessId) {
        this.HpcClusterBusinessId = HpcClusterBusinessId;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的HPC高性能集群。
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

