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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobFlowResource extends AbstractModel{

    /**
    * 机器类型描述。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 机器类型描述，可参考CVM的该含义。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 标签KV对。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 磁盘描述列表。
    */
    @SerializedName("DiskGroups")
    @Expose
    private DiskGroup [] DiskGroups;

    /**
     * Get 机器类型描述。 
     * @return Spec 机器类型描述。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 机器类型描述。
     * @param Spec 机器类型描述。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 机器类型描述，可参考CVM的该含义。 
     * @return InstanceType 机器类型描述，可参考CVM的该含义。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机器类型描述，可参考CVM的该含义。
     * @param InstanceType 机器类型描述，可参考CVM的该含义。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 标签KV对。 
     * @return Tags 标签KV对。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签KV对。
     * @param Tags 标签KV对。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 磁盘描述列表。 
     * @return DiskGroups 磁盘描述列表。
     */
    public DiskGroup [] getDiskGroups() {
        return this.DiskGroups;
    }

    /**
     * Set 磁盘描述列表。
     * @param DiskGroups 磁盘描述列表。
     */
    public void setDiskGroups(DiskGroup [] DiskGroups) {
        this.DiskGroups = DiskGroups;
    }

    public JobFlowResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobFlowResource(JobFlowResource source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DiskGroups != null) {
            this.DiskGroups = new DiskGroup[source.DiskGroups.length];
            for (int i = 0; i < source.DiskGroups.length; i++) {
                this.DiskGroups[i] = new DiskGroup(source.DiskGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "DiskGroups.", this.DiskGroups);

    }
}

