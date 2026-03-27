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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>流程中的实例返回的子状态。</p><p>枚举值：</p><ul><li>0： 磁盘只读，</li></ul>
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>降级策略，单位：毫秒，实例P99达到降级策略后，审计数据自动丢弃，优先保障业务的可用性,默认值：500毫秒，范围值：300-1000毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DegradeStrategy")
    @Expose
    private Long DegradeStrategy;

    /**
    * <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>架构版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>流程中的实例返回的子状态。</p><p>枚举值：</p><ul><li>0： 磁盘只读，</li></ul> 
     * @return SubStatus <p>流程中的实例返回的子状态。</p><p>枚举值：</p><ul><li>0： 磁盘只读，</li></ul>
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>流程中的实例返回的子状态。</p><p>枚举值：</p><ul><li>0： 磁盘只读，</li></ul>
     * @param SubStatus <p>流程中的实例返回的子状态。</p><p>枚举值：</p><ul><li>0： 磁盘只读，</li></ul>
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>降级策略，单位：毫秒，实例P99达到降级策略后，审计数据自动丢弃，优先保障业务的可用性,默认值：500毫秒，范围值：300-1000毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DegradeStrategy <p>降级策略，单位：毫秒，实例P99达到降级策略后，审计数据自动丢弃，优先保障业务的可用性,默认值：500毫秒，范围值：300-1000毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDegradeStrategy() {
        return this.DegradeStrategy;
    }

    /**
     * Set <p>降级策略，单位：毫秒，实例P99达到降级策略后，审计数据自动丢弃，优先保障业务的可用性,默认值：500毫秒，范围值：300-1000毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DegradeStrategy <p>降级策略，单位：毫秒，实例P99达到降级策略后，审计数据自动丢弃，优先保障业务的可用性,默认值：500毫秒，范围值：300-1000毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDegradeStrategy(Long DegradeStrategy) {
        this.DegradeStrategy = DegradeStrategy;
    }

    /**
     * Get <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTags <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTags <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>架构版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>架构版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>架构版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>架构版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DegradeStrategy != null) {
            this.DegradeStrategy = new Long(source.DegradeStrategy);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DegradeStrategy", this.DegradeStrategy);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

