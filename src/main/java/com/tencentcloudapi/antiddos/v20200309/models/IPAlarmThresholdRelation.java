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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPAlarmThresholdRelation extends AbstractModel{

    /**
    * 告警阈值类型，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * 告警阈值，单位Mbps，取值>=0；当作为输入参数时，设置0会删除告警阈值配置；
    */
    @SerializedName("AlarmThreshold")
    @Expose
    private Long AlarmThreshold;

    /**
    * 告警阈值所属的资源实例
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
     * Get 告警阈值类型，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
] 
     * @return AlarmType 告警阈值类型，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警阈值类型，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     * @param AlarmType 告警阈值类型，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 告警阈值，单位Mbps，取值>=0；当作为输入参数时，设置0会删除告警阈值配置； 
     * @return AlarmThreshold 告警阈值，单位Mbps，取值>=0；当作为输入参数时，设置0会删除告警阈值配置；
     */
    public Long getAlarmThreshold() {
        return this.AlarmThreshold;
    }

    /**
     * Set 告警阈值，单位Mbps，取值>=0；当作为输入参数时，设置0会删除告警阈值配置；
     * @param AlarmThreshold 告警阈值，单位Mbps，取值>=0；当作为输入参数时，设置0会删除告警阈值配置；
     */
    public void setAlarmThreshold(Long AlarmThreshold) {
        this.AlarmThreshold = AlarmThreshold;
    }

    /**
     * Get 告警阈值所属的资源实例 
     * @return InstanceDetailList 告警阈值所属的资源实例
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set 告警阈值所属的资源实例
     * @param InstanceDetailList 告警阈值所属的资源实例
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    public IPAlarmThresholdRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPAlarmThresholdRelation(IPAlarmThresholdRelation source) {
        if (source.AlarmType != null) {
            this.AlarmType = new Long(source.AlarmType);
        }
        if (source.AlarmThreshold != null) {
            this.AlarmThreshold = new Long(source.AlarmThreshold);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmThreshold", this.AlarmThreshold);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);

    }
}

