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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralResourceQuotaSet extends AbstractModel{

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 已使用额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceQuotaUsed")
    @Expose
    private Long ResourceQuotaUsed;

    /**
    * 总额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceQuotaTotal")
    @Expose
    private Long ResourceQuotaTotal;

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 已使用额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceQuotaUsed 已使用额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceQuotaUsed() {
        return this.ResourceQuotaUsed;
    }

    /**
     * Set 已使用额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceQuotaUsed 已使用额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceQuotaUsed(Long ResourceQuotaUsed) {
        this.ResourceQuotaUsed = ResourceQuotaUsed;
    }

    /**
     * Get 总额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceQuotaTotal 总额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceQuotaTotal() {
        return this.ResourceQuotaTotal;
    }

    /**
     * Set 总额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceQuotaTotal 总额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceQuotaTotal(Long ResourceQuotaTotal) {
        this.ResourceQuotaTotal = ResourceQuotaTotal;
    }

    public GeneralResourceQuotaSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralResourceQuotaSet(GeneralResourceQuotaSet source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceQuotaUsed != null) {
            this.ResourceQuotaUsed = new Long(source.ResourceQuotaUsed);
        }
        if (source.ResourceQuotaTotal != null) {
            this.ResourceQuotaTotal = new Long(source.ResourceQuotaTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceQuotaUsed", this.ResourceQuotaUsed);
        this.setParamSimple(map, prefix + "ResourceQuotaTotal", this.ResourceQuotaTotal);

    }
}

