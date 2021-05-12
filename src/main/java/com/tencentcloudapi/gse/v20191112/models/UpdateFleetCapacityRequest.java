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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFleetCapacityRequest extends AbstractModel{

    /**
    * 服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 期望的服务器实例数
    */
    @SerializedName("DesiredInstances")
    @Expose
    private Long DesiredInstances;

    /**
    * 服务器实例数最小限制，最小值0，最大值不超过最高配额查看各地区最高配额减1
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 服务器实例数最大限制，最小值1，最大值不超过最高配额查看各地区最高配额
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 服务器伸缩容间隔，单位分钟，最小值3，最大值30，默认值10
    */
    @SerializedName("ScalingInterval")
    @Expose
    private Long ScalingInterval;

    /**
     * Get 服务器舰队ID 
     * @return FleetId 服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队ID
     * @param FleetId 服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 期望的服务器实例数 
     * @return DesiredInstances 期望的服务器实例数
     */
    public Long getDesiredInstances() {
        return this.DesiredInstances;
    }

    /**
     * Set 期望的服务器实例数
     * @param DesiredInstances 期望的服务器实例数
     */
    public void setDesiredInstances(Long DesiredInstances) {
        this.DesiredInstances = DesiredInstances;
    }

    /**
     * Get 服务器实例数最小限制，最小值0，最大值不超过最高配额查看各地区最高配额减1 
     * @return MinSize 服务器实例数最小限制，最小值0，最大值不超过最高配额查看各地区最高配额减1
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 服务器实例数最小限制，最小值0，最大值不超过最高配额查看各地区最高配额减1
     * @param MinSize 服务器实例数最小限制，最小值0，最大值不超过最高配额查看各地区最高配额减1
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 服务器实例数最大限制，最小值1，最大值不超过最高配额查看各地区最高配额 
     * @return MaxSize 服务器实例数最大限制，最小值1，最大值不超过最高配额查看各地区最高配额
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 服务器实例数最大限制，最小值1，最大值不超过最高配额查看各地区最高配额
     * @param MaxSize 服务器实例数最大限制，最小值1，最大值不超过最高配额查看各地区最高配额
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 服务器伸缩容间隔，单位分钟，最小值3，最大值30，默认值10 
     * @return ScalingInterval 服务器伸缩容间隔，单位分钟，最小值3，最大值30，默认值10
     */
    public Long getScalingInterval() {
        return this.ScalingInterval;
    }

    /**
     * Set 服务器伸缩容间隔，单位分钟，最小值3，最大值30，默认值10
     * @param ScalingInterval 服务器伸缩容间隔，单位分钟，最小值3，最大值30，默认值10
     */
    public void setScalingInterval(Long ScalingInterval) {
        this.ScalingInterval = ScalingInterval;
    }

    public UpdateFleetCapacityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFleetCapacityRequest(UpdateFleetCapacityRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.DesiredInstances != null) {
            this.DesiredInstances = new Long(source.DesiredInstances);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.ScalingInterval != null) {
            this.ScalingInterval = new Long(source.ScalingInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "DesiredInstances", this.DesiredInstances);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "ScalingInterval", this.ScalingInterval);

    }
}

