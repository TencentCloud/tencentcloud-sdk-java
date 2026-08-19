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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSaleInfo extends AbstractModel {

    /**
    * <p>可售卖资源规格</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private ResourceSpec ResourceSpec;

    /**
    * <p>规格步长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
    * <p>最大资源数量，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSpec")
    @Expose
    private Long MaxSpec;

    /**
    * <p>库存情况，对当前地域该计费项实时可新增数量的分级预估。取值复用 BcpConstants 库存状态常量：</p><ul><li>EnoughStock：余量充足</li><li>NormalStock：余量正常</li><li>UnderStock：余量紧张</li><li>WithoutStock：无库存</li></ul><p>该值为底层提供的预估值，不代表保证可发货量，仅用于展示库存概况。当请求 Region 与资源池地域不一致、cold-start 缓存未 ready、或该计费项在快照中缺失时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCategory")
    @Expose
    private String StatusCategory;

    /**
     * Get <p>可售卖资源规格</p> 
     * @return ResourceSpec <p>可售卖资源规格</p>
     */
    public ResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>可售卖资源规格</p>
     * @param ResourceSpec <p>可售卖资源规格</p>
     */
    public void setResourceSpec(ResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>规格步长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Step <p>规格步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set <p>规格步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Step <p>规格步长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    /**
     * Get <p>最大资源数量，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSpec <p>最大资源数量，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxSpec() {
        return this.MaxSpec;
    }

    /**
     * Set <p>最大资源数量，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSpec <p>最大资源数量，仅GU有值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSpec(Long MaxSpec) {
        this.MaxSpec = MaxSpec;
    }

    /**
     * Get <p>库存情况，对当前地域该计费项实时可新增数量的分级预估。取值复用 BcpConstants 库存状态常量：</p><ul><li>EnoughStock：余量充足</li><li>NormalStock：余量正常</li><li>UnderStock：余量紧张</li><li>WithoutStock：无库存</li></ul><p>该值为底层提供的预估值，不代表保证可发货量，仅用于展示库存概况。当请求 Region 与资源池地域不一致、cold-start 缓存未 ready、或该计费项在快照中缺失时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCategory <p>库存情况，对当前地域该计费项实时可新增数量的分级预估。取值复用 BcpConstants 库存状态常量：</p><ul><li>EnoughStock：余量充足</li><li>NormalStock：余量正常</li><li>UnderStock：余量紧张</li><li>WithoutStock：无库存</li></ul><p>该值为底层提供的预估值，不代表保证可发货量，仅用于展示库存概况。当请求 Region 与资源池地域不一致、cold-start 缓存未 ready、或该计费项在快照中缺失时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusCategory() {
        return this.StatusCategory;
    }

    /**
     * Set <p>库存情况，对当前地域该计费项实时可新增数量的分级预估。取值复用 BcpConstants 库存状态常量：</p><ul><li>EnoughStock：余量充足</li><li>NormalStock：余量正常</li><li>UnderStock：余量紧张</li><li>WithoutStock：无库存</li></ul><p>该值为底层提供的预估值，不代表保证可发货量，仅用于展示库存概况。当请求 Region 与资源池地域不一致、cold-start 缓存未 ready、或该计费项在快照中缺失时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCategory <p>库存情况，对当前地域该计费项实时可新增数量的分级预估。取值复用 BcpConstants 库存状态常量：</p><ul><li>EnoughStock：余量充足</li><li>NormalStock：余量正常</li><li>UnderStock：余量紧张</li><li>WithoutStock：无库存</li></ul><p>该值为底层提供的预估值，不代表保证可发货量，仅用于展示库存概况。当请求 Region 与资源池地域不一致、cold-start 缓存未 ready、或该计费项在快照中缺失时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCategory(String StatusCategory) {
        this.StatusCategory = StatusCategory;
    }

    public ResourceSaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSaleInfo(ResourceSaleInfo source) {
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new ResourceSpec(source.ResourceSpec);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
        if (source.MaxSpec != null) {
            this.MaxSpec = new Long(source.MaxSpec);
        }
        if (source.StatusCategory != null) {
            this.StatusCategory = new String(source.StatusCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "MaxSpec", this.MaxSpec);
        this.setParamSimple(map, prefix + "StatusCategory", this.StatusCategory);

    }
}

