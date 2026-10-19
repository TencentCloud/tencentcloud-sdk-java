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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartRouterResourceSpec extends AbstractModel {

    /**
    * <p>付费模式：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）。不传则默认 POSTPAID_BY_HOUR</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>预付费资源组 ID（ChargeType=PREPAID 时必填）</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>预付费资源组名称（output only，ChargeType=PREPAID 时有值，查询时回显）</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>可用区（如 ap-guangzhou-3），公有云场景用于指定机器来源</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>资源队列 ID（内网版使用，标识任务所属的调度队列）</p>
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * <p>服务的优先级，可选范围 [0,9]，默认 0（内网版/私有化使用）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>资源供应属性（潮汐/竞价等供应模式），公有云场景用于指定机器来源类型。仅区分供应来源，计费/部署/伸缩仍按后付费处理（ChargeType 恒为 POSTPAID_BY_HOUR）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceSupplyAttribute")
    @Expose
    private ResourceSupplyAttribute ResourceSupplyAttribute;

    /**
     * Get <p>付费模式：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）。不传则默认 POSTPAID_BY_HOUR</p> 
     * @return ChargeType <p>付费模式：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）。不传则默认 POSTPAID_BY_HOUR</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>付费模式：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）。不传则默认 POSTPAID_BY_HOUR</p>
     * @param ChargeType <p>付费模式：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）。不传则默认 POSTPAID_BY_HOUR</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>预付费资源组 ID（ChargeType=PREPAID 时必填）</p> 
     * @return ResourceGroupId <p>预付费资源组 ID（ChargeType=PREPAID 时必填）</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>预付费资源组 ID（ChargeType=PREPAID 时必填）</p>
     * @param ResourceGroupId <p>预付费资源组 ID（ChargeType=PREPAID 时必填）</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>预付费资源组名称（output only，ChargeType=PREPAID 时有值，查询时回显）</p> 
     * @return ResourceGroupName <p>预付费资源组名称（output only，ChargeType=PREPAID 时有值，查询时回显）</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>预付费资源组名称（output only，ChargeType=PREPAID 时有值，查询时回显）</p>
     * @param ResourceGroupName <p>预付费资源组名称（output only，ChargeType=PREPAID 时有值，查询时回显）</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>可用区（如 ap-guangzhou-3），公有云场景用于指定机器来源</p> 
     * @return Zone <p>可用区（如 ap-guangzhou-3），公有云场景用于指定机器来源</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区（如 ap-guangzhou-3），公有云场景用于指定机器来源</p>
     * @param Zone <p>可用区（如 ap-guangzhou-3），公有云场景用于指定机器来源</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>资源队列 ID（内网版使用，标识任务所属的调度队列）</p> 
     * @return QueueId <p>资源队列 ID（内网版使用，标识任务所属的调度队列）</p>
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set <p>资源队列 ID（内网版使用，标识任务所属的调度队列）</p>
     * @param QueueId <p>资源队列 ID（内网版使用，标识任务所属的调度队列）</p>
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get <p>服务的优先级，可选范围 [0,9]，默认 0（内网版/私有化使用）</p> 
     * @return Priority <p>服务的优先级，可选范围 [0,9]，默认 0（内网版/私有化使用）</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>服务的优先级，可选范围 [0,9]，默认 0（内网版/私有化使用）</p>
     * @param Priority <p>服务的优先级，可选范围 [0,9]，默认 0（内网版/私有化使用）</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>资源供应属性（潮汐/竞价等供应模式），公有云场景用于指定机器来源类型。仅区分供应来源，计费/部署/伸缩仍按后付费处理（ChargeType 恒为 POSTPAID_BY_HOUR）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceSupplyAttribute <p>资源供应属性（潮汐/竞价等供应模式），公有云场景用于指定机器来源类型。仅区分供应来源，计费/部署/伸缩仍按后付费处理（ChargeType 恒为 POSTPAID_BY_HOUR）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceSupplyAttribute getResourceSupplyAttribute() {
        return this.ResourceSupplyAttribute;
    }

    /**
     * Set <p>资源供应属性（潮汐/竞价等供应模式），公有云场景用于指定机器来源类型。仅区分供应来源，计费/部署/伸缩仍按后付费处理（ChargeType 恒为 POSTPAID_BY_HOUR）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceSupplyAttribute <p>资源供应属性（潮汐/竞价等供应模式），公有云场景用于指定机器来源类型。仅区分供应来源，计费/部署/伸缩仍按后付费处理（ChargeType 恒为 POSTPAID_BY_HOUR）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceSupplyAttribute(ResourceSupplyAttribute ResourceSupplyAttribute) {
        this.ResourceSupplyAttribute = ResourceSupplyAttribute;
    }

    public SmartRouterResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartRouterResourceSpec(SmartRouterResourceSpec source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.QueueId != null) {
            this.QueueId = new String(source.QueueId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ResourceSupplyAttribute != null) {
            this.ResourceSupplyAttribute = new ResourceSupplyAttribute(source.ResourceSupplyAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "ResourceSupplyAttribute.", this.ResourceSupplyAttribute);

    }
}

