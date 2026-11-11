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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroupAttr extends AbstractModel {

    /**
    * <p>RO 组名称。</p>
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * <p>RO 实例最大延迟阈值。单位为秒，最小值为 1。范围：[1,10000]，整数。<br>注意：RO 组必须设置了开启实例延迟剔除策略，该值才有效。</p>
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * <p>是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。</p>
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * <p>最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。默认值为1。<br>注意：若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。</p>
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * <p>权重模式。支持值包括：&quot;system&quot; - 系统自动分配； &quot;custom&quot; - 用户自定义设置。注意，若设置 &quot;custom&quot; 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>延迟复制时间。单位：秒，范围：1 - 259200秒，不传此参数表示不开启实例延迟复制。</p>
    */
    @SerializedName("ReplicationDelayTime")
    @Expose
    private Long ReplicationDelayTime;

    /**
     * Get <p>RO 组名称。</p> 
     * @return RoGroupName <p>RO 组名称。</p>
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set <p>RO 组名称。</p>
     * @param RoGroupName <p>RO 组名称。</p>
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get <p>RO 实例最大延迟阈值。单位为秒，最小值为 1。范围：[1,10000]，整数。<br>注意：RO 组必须设置了开启实例延迟剔除策略，该值才有效。</p> 
     * @return RoMaxDelayTime <p>RO 实例最大延迟阈值。单位为秒，最小值为 1。范围：[1,10000]，整数。<br>注意：RO 组必须设置了开启实例延迟剔除策略，该值才有效。</p>
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set <p>RO 实例最大延迟阈值。单位为秒，最小值为 1。范围：[1,10000]，整数。<br>注意：RO 组必须设置了开启实例延迟剔除策略，该值才有效。</p>
     * @param RoMaxDelayTime <p>RO 实例最大延迟阈值。单位为秒，最小值为 1。范围：[1,10000]，整数。<br>注意：RO 组必须设置了开启实例延迟剔除策略，该值才有效。</p>
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get <p>是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。</p> 
     * @return RoOfflineDelay <p>是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。</p>
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set <p>是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。</p>
     * @param RoOfflineDelay <p>是否开启实例延迟剔除。支持的值包括：1 - 开启；0 - 不开启。注意，若设置开启实例延迟剔除，则必须设置延迟阈值（RoMaxDelayTime）参数。</p>
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get <p>最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。默认值为1。<br>注意：若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。</p> 
     * @return MinRoInGroup <p>最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。默认值为1。<br>注意：若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。</p>
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set <p>最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。默认值为1。<br>注意：若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。</p>
     * @param MinRoInGroup <p>最少保留实例数。可设置为小于或等于该 RO 组下 RO 实例个数的任意值。默认值为1。<br>注意：若设置值大于 RO 实例数量将不做剔除；若设置为 0，所有实例延迟超限都会被剔除。</p>
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get <p>权重模式。支持值包括：&quot;system&quot; - 系统自动分配； &quot;custom&quot; - 用户自定义设置。注意，若设置 &quot;custom&quot; 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。</p> 
     * @return WeightMode <p>权重模式。支持值包括：&quot;system&quot; - 系统自动分配； &quot;custom&quot; - 用户自定义设置。注意，若设置 &quot;custom&quot; 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式。支持值包括：&quot;system&quot; - 系统自动分配； &quot;custom&quot; - 用户自定义设置。注意，若设置 &quot;custom&quot; 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。</p>
     * @param WeightMode <p>权重模式。支持值包括：&quot;system&quot; - 系统自动分配； &quot;custom&quot; - 用户自定义设置。注意，若设置 &quot;custom&quot; 模式，则必须设置 RO 实例权重配置（RoWeightValues）参数。</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>延迟复制时间。单位：秒，范围：1 - 259200秒，不传此参数表示不开启实例延迟复制。</p> 
     * @return ReplicationDelayTime <p>延迟复制时间。单位：秒，范围：1 - 259200秒，不传此参数表示不开启实例延迟复制。</p>
     */
    public Long getReplicationDelayTime() {
        return this.ReplicationDelayTime;
    }

    /**
     * Set <p>延迟复制时间。单位：秒，范围：1 - 259200秒，不传此参数表示不开启实例延迟复制。</p>
     * @param ReplicationDelayTime <p>延迟复制时间。单位：秒，范围：1 - 259200秒，不传此参数表示不开启实例延迟复制。</p>
     */
    public void setReplicationDelayTime(Long ReplicationDelayTime) {
        this.ReplicationDelayTime = ReplicationDelayTime;
    }

    public RoGroupAttr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoGroupAttr(RoGroupAttr source) {
        if (source.RoGroupName != null) {
            this.RoGroupName = new String(source.RoGroupName);
        }
        if (source.RoMaxDelayTime != null) {
            this.RoMaxDelayTime = new Long(source.RoMaxDelayTime);
        }
        if (source.RoOfflineDelay != null) {
            this.RoOfflineDelay = new Long(source.RoOfflineDelay);
        }
        if (source.MinRoInGroup != null) {
            this.MinRoInGroup = new Long(source.MinRoInGroup);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.ReplicationDelayTime != null) {
            this.ReplicationDelayTime = new Long(source.ReplicationDelayTime);
        }
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
        this.setParamSimple(map, prefix + "ReplicationDelayTime", this.ReplicationDelayTime);

    }
}

