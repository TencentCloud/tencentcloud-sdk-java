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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingConfig extends AbstractModel {

    /**
    * <p>ccu最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeMin")
    @Expose
    private Float RangeMin;

    /**
    * <p>ccu最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeMax")
    @Expose
    private Float RangeMax;

    /**
    * <p>返回的 range 参数对应的资源类型</p><p>枚举值：</p><ul><li>cpu： 返回的是 cpu 调整返回限制，当不存在mem限制时代表 ccu</li><li>nodecount： 返回的是水平扩缩容的节点数限制范围</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get <p>ccu最小值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeMin <p>ccu最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRangeMin() {
        return this.RangeMin;
    }

    /**
     * Set <p>ccu最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeMin <p>ccu最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeMin(Float RangeMin) {
        this.RangeMin = RangeMin;
    }

    /**
     * Get <p>ccu最大值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeMax <p>ccu最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRangeMax() {
        return this.RangeMax;
    }

    /**
     * Set <p>ccu最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeMax <p>ccu最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeMax(Float RangeMax) {
        this.RangeMax = RangeMax;
    }

    /**
     * Get <p>返回的 range 参数对应的资源类型</p><p>枚举值：</p><ul><li>cpu： 返回的是 cpu 调整返回限制，当不存在mem限制时代表 ccu</li><li>nodecount： 返回的是水平扩缩容的节点数限制范围</li></ul> 
     * @return ResourceType <p>返回的 range 参数对应的资源类型</p><p>枚举值：</p><ul><li>cpu： 返回的是 cpu 调整返回限制，当不存在mem限制时代表 ccu</li><li>nodecount： 返回的是水平扩缩容的节点数限制范围</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>返回的 range 参数对应的资源类型</p><p>枚举值：</p><ul><li>cpu： 返回的是 cpu 调整返回限制，当不存在mem限制时代表 ccu</li><li>nodecount： 返回的是水平扩缩容的节点数限制范围</li></ul>
     * @param ResourceType <p>返回的 range 参数对应的资源类型</p><p>枚举值：</p><ul><li>cpu： 返回的是 cpu 调整返回限制，当不存在mem限制时代表 ccu</li><li>nodecount： 返回的是水平扩缩容的节点数限制范围</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public AutoScalingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingConfig(AutoScalingConfig source) {
        if (source.RangeMin != null) {
            this.RangeMin = new Float(source.RangeMin);
        }
        if (source.RangeMax != null) {
            this.RangeMax = new Float(source.RangeMax);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RangeMin", this.RangeMin);
        this.setParamSimple(map, prefix + "RangeMax", this.RangeMax);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

