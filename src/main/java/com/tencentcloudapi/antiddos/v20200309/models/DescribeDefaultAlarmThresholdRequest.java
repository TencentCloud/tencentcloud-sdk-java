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

public class DescribeDefaultAlarmThresholdRequest extends AbstractModel{

    /**
    * 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
    */
    @SerializedName("FilterAlarmType")
    @Expose
    private Long FilterAlarmType;

    /**
     * Get 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
] 
     * @return InstanceType 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
     * @param InstanceType 产品类型，取值[
bgp(表示高防包产品)
bgpip(表示高防IP产品)
]
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
] 
     * @return FilterAlarmType 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     */
    public Long getFilterAlarmType() {
        return this.FilterAlarmType;
    }

    /**
     * Set 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     * @param FilterAlarmType 告警阈值类型搜索，取值[
1(入流量告警阈值)
2(攻击清洗流量告警阈值)
]
     */
    public void setFilterAlarmType(Long FilterAlarmType) {
        this.FilterAlarmType = FilterAlarmType;
    }

    public DescribeDefaultAlarmThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefaultAlarmThresholdRequest(DescribeDefaultAlarmThresholdRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.FilterAlarmType != null) {
            this.FilterAlarmType = new Long(source.FilterAlarmType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "FilterAlarmType", this.FilterAlarmType);

    }
}

