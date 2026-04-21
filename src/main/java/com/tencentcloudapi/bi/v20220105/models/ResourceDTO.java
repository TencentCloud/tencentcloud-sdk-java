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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDTO extends AbstractModel {

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 是否启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceValue")
    @Expose
    private Boolean ResourceValue;

    /**
    * 能否变更
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanChange")
    @Expose
    private Boolean CanChange;

    /**
    * 提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

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
     * Get 是否启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceValue 是否启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getResourceValue() {
        return this.ResourceValue;
    }

    /**
     * Set 是否启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceValue 是否启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceValue(Boolean ResourceValue) {
        this.ResourceValue = ResourceValue;
    }

    /**
     * Get 能否变更
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanChange 能否变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanChange() {
        return this.CanChange;
    }

    /**
     * Set 能否变更
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanChange 能否变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanChange(Boolean CanChange) {
        this.CanChange = CanChange;
    }

    /**
     * Get 提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tips 提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set 提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tips 提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    public ResourceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDTO(ResourceDTO source) {
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceValue != null) {
            this.ResourceValue = new Boolean(source.ResourceValue);
        }
        if (source.CanChange != null) {
            this.CanChange = new Boolean(source.CanChange);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceValue", this.ResourceValue);
        this.setParamSimple(map, prefix + "CanChange", this.CanChange);
        this.setParamSimple(map, prefix + "Tips", this.Tips);

    }
}

