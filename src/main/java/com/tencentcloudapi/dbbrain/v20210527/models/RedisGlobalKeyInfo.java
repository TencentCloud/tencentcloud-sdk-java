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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisGlobalKeyInfo extends AbstractModel {

    /**
    * 占用内存大小，单位Byte。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * Key个数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 剩余过期时间范围的结束时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMax为空时，代表剩余过期时间大于等于RangeMin小时。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeMax")
    @Expose
    private Long RangeMax;

    /**
    * 剩余过期时间范围的起始时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMin为空时，代表已过期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeMin")
    @Expose
    private Long RangeMin;

    /**
     * Get 占用内存大小，单位Byte。 
     * @return Capacity 占用内存大小，单位Byte。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 占用内存大小，单位Byte。
     * @param Capacity 占用内存大小，单位Byte。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get Key个数。 
     * @return Count Key个数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Key个数。
     * @param Count Key个数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 剩余过期时间范围的结束时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMax为空时，代表剩余过期时间大于等于RangeMin小时。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeMax 剩余过期时间范围的结束时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMax为空时，代表剩余过期时间大于等于RangeMin小时。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRangeMax() {
        return this.RangeMax;
    }

    /**
     * Set 剩余过期时间范围的结束时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMax为空时，代表剩余过期时间大于等于RangeMin小时。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeMax 剩余过期时间范围的结束时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMax为空时，代表剩余过期时间大于等于RangeMin小时。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeMax(Long RangeMax) {
        this.RangeMax = RangeMax;
    }

    /**
     * Get 剩余过期时间范围的起始时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMin为空时，代表已过期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeMin 剩余过期时间范围的起始时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMin为空时，代表已过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRangeMin() {
        return this.RangeMin;
    }

    /**
     * Set 剩余过期时间范围的起始时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMin为空时，代表已过期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeMin 剩余过期时间范围的起始时间，当小于0时，代表已过期时间，单位：小时。当RangeMin与RangeMax同时为空时，代表未设置过期时间。当RangeMin为空时，代表已过期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeMin(Long RangeMin) {
        this.RangeMin = RangeMin;
    }

    public RedisGlobalKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisGlobalKeyInfo(RedisGlobalKeyInfo source) {
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RangeMax != null) {
            this.RangeMax = new Long(source.RangeMax);
        }
        if (source.RangeMin != null) {
            this.RangeMin = new Long(source.RangeMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RangeMax", this.RangeMax);
        this.setParamSimple(map, prefix + "RangeMin", this.RangeMin);

    }
}

