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

public class SuperNodeResource extends AbstractModel {

    /**
    * 节点名称，此字段在出参中有效。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点上的资源总数，QuotaType为 exact 时，表示创建指定规格的精确配额数量。
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 节点上的总核数，QuotaType为 exact 时表示指定规格的核数。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 节点上的总内存数，QuotaType为 exact 时表示指定规格的内存，单位：Gi
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 节点上的总 GPU 卡数，QuotaType为 exact 时表示指定规格的GPU卡数。
    */
    @SerializedName("Gpu")
    @Expose
    private Float Gpu;

    /**
    * 节点资源的配额类型，exact表示精确配额，fuzzy 表示模糊配额。
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 配额的计费类型，PREPAID表示包月，POSTPAID_BY_HOUR表示按量。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * QuotaType为 exact 时，此字段有效，表示精确配额的资源类型。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 置放群组 ID，QuotaType为 exact 时有效，表示购买的精确配额需满足置放群组。可通过 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810) 接口返回值中的DisasterRecoverGroupId获取。
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
     * Get 节点名称，此字段在出参中有效。 
     * @return NodeName 节点名称，此字段在出参中有效。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称，此字段在出参中有效。
     * @param NodeName 节点名称，此字段在出参中有效。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点上的资源总数，QuotaType为 exact 时，表示创建指定规格的精确配额数量。 
     * @return Num 节点上的资源总数，QuotaType为 exact 时，表示创建指定规格的精确配额数量。
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 节点上的资源总数，QuotaType为 exact 时，表示创建指定规格的精确配额数量。
     * @param Num 节点上的资源总数，QuotaType为 exact 时，表示创建指定规格的精确配额数量。
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 节点上的总核数，QuotaType为 exact 时表示指定规格的核数。 
     * @return Cpu 节点上的总核数，QuotaType为 exact 时表示指定规格的核数。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set 节点上的总核数，QuotaType为 exact 时表示指定规格的核数。
     * @param Cpu 节点上的总核数，QuotaType为 exact 时表示指定规格的核数。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 节点上的总内存数，QuotaType为 exact 时表示指定规格的内存，单位：Gi 
     * @return Memory 节点上的总内存数，QuotaType为 exact 时表示指定规格的内存，单位：Gi
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 节点上的总内存数，QuotaType为 exact 时表示指定规格的内存，单位：Gi
     * @param Memory 节点上的总内存数，QuotaType为 exact 时表示指定规格的内存，单位：Gi
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 节点上的总 GPU 卡数，QuotaType为 exact 时表示指定规格的GPU卡数。 
     * @return Gpu 节点上的总 GPU 卡数，QuotaType为 exact 时表示指定规格的GPU卡数。
     */
    public Float getGpu() {
        return this.Gpu;
    }

    /**
     * Set 节点上的总 GPU 卡数，QuotaType为 exact 时表示指定规格的GPU卡数。
     * @param Gpu 节点上的总 GPU 卡数，QuotaType为 exact 时表示指定规格的GPU卡数。
     */
    public void setGpu(Float Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 节点资源的配额类型，exact表示精确配额，fuzzy 表示模糊配额。 
     * @return QuotaType 节点资源的配额类型，exact表示精确配额，fuzzy 表示模糊配额。
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 节点资源的配额类型，exact表示精确配额，fuzzy 表示模糊配额。
     * @param QuotaType 节点资源的配额类型，exact表示精确配额，fuzzy 表示模糊配额。
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 配额的计费类型，PREPAID表示包月，POSTPAID_BY_HOUR表示按量。 
     * @return ChargeType 配额的计费类型，PREPAID表示包月，POSTPAID_BY_HOUR表示按量。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 配额的计费类型，PREPAID表示包月，POSTPAID_BY_HOUR表示按量。
     * @param ChargeType 配额的计费类型，PREPAID表示包月，POSTPAID_BY_HOUR表示按量。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get QuotaType为 exact 时，此字段有效，表示精确配额的资源类型。 
     * @return ResourceType QuotaType为 exact 时，此字段有效，表示精确配额的资源类型。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set QuotaType为 exact 时，此字段有效，表示精确配额的资源类型。
     * @param ResourceType QuotaType为 exact 时，此字段有效，表示精确配额的资源类型。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 置放群组 ID，QuotaType为 exact 时有效，表示购买的精确配额需满足置放群组。可通过 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810) 接口返回值中的DisasterRecoverGroupId获取。 
     * @return DisasterRecoverGroupId 置放群组 ID，QuotaType为 exact 时有效，表示购买的精确配额需满足置放群组。可通过 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810) 接口返回值中的DisasterRecoverGroupId获取。
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set 置放群组 ID，QuotaType为 exact 时有效，表示购买的精确配额需满足置放群组。可通过 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810) 接口返回值中的DisasterRecoverGroupId获取。
     * @param DisasterRecoverGroupId 置放群组 ID，QuotaType为 exact 时有效，表示购买的精确配额需满足置放群组。可通过 [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/product/213/17810) 接口返回值中的DisasterRecoverGroupId获取。
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    public SuperNodeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperNodeResource(SuperNodeResource source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Float(source.Gpu);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);

    }
}

