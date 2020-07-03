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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroupAttr extends AbstractModel{

    /**
    * RO 组名称。
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * RO 实例最大延迟阈值。单位为秒，最小值为 1。注意，RO 组必须设置了开启实例延迟剔除策略，该值才有效。
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * 是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * 最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。注意，若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * 权重模式。支持值包括："system" - 系统自动分配； "custom" - 用户自定义设置。注意，若设置 "custom" 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
     * Get RO 组名称。 
     * @return RoGroupName RO 组名称。
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set RO 组名称。
     * @param RoGroupName RO 组名称。
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get RO 实例最大延迟阈值。单位为秒，最小值为 1。注意，RO 组必须设置了开启实例延迟剔除策略，该值才有效。 
     * @return RoMaxDelayTime RO 实例最大延迟阈值。单位为秒，最小值为 1。注意，RO 组必须设置了开启实例延迟剔除策略，该值才有效。
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set RO 实例最大延迟阈值。单位为秒，最小值为 1。注意，RO 组必须设置了开启实例延迟剔除策略，该值才有效。
     * @param RoMaxDelayTime RO 实例最大延迟阈值。单位为秒，最小值为 1。注意，RO 组必须设置了开启实例延迟剔除策略，该值才有效。
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get 是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。 
     * @return RoOfflineDelay 是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set 是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。
     * @param RoOfflineDelay 是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get 最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。注意，若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。 
     * @return MinRoInGroup 最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。注意，若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set 最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。注意，若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。
     * @param MinRoInGroup 最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。注意，若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get 权重模式。支持值包括："system" - 系统自动分配； "custom" - 用户自定义设置。注意，若设置 "custom" 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。 
     * @return WeightMode 权重模式。支持值包括："system" - 系统自动分配； "custom" - 用户自定义设置。注意，若设置 "custom" 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重模式。支持值包括："system" - 系统自动分配； "custom" - 用户自定义设置。注意，若设置 "custom" 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。
     * @param WeightMode 权重模式。支持值包括："system" - 系统自动分配； "custom" - 用户自定义设置。注意，若设置 "custom" 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupName", this.RoGroupName);
        this.setParamSimple(map, prefix + "RoMaxDelayTime", this.RoMaxDelayTime);
        this.setParamSimple(map, prefix + "RoOfflineDelay", this.RoOfflineDelay);
        this.setParamSimple(map, prefix + "MinRoInGroup", this.MinRoInGroup);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);

    }
}

