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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSAlarmThresholdRequest extends AbstractModel {

    /**
    * 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID,字符串类型
    */
    @SerializedName("RsId")
    @Expose
    private String RsId;

    /**
    * 告警阈值类型，0-未设置，1-入流量，2-清洗流量
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * 告警阈值，大于0（目前暂定的值）
    */
    @SerializedName("AlarmThreshold")
    @Expose
    private Long AlarmThreshold;

    /**
    * 资源关联的IP列表，高防包未绑定时，传空数组，高防IP专业版传多个IP的数据
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID,字符串类型 
     * @return RsId 资源ID,字符串类型
     */
    public String getRsId() {
        return this.RsId;
    }

    /**
     * Set 资源ID,字符串类型
     * @param RsId 资源ID,字符串类型
     */
    public void setRsId(String RsId) {
        this.RsId = RsId;
    }

    /**
     * Get 告警阈值类型，0-未设置，1-入流量，2-清洗流量 
     * @return AlarmType 告警阈值类型，0-未设置，1-入流量，2-清洗流量
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警阈值类型，0-未设置，1-入流量，2-清洗流量
     * @param AlarmType 告警阈值类型，0-未设置，1-入流量，2-清洗流量
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 告警阈值，大于0（目前暂定的值） 
     * @return AlarmThreshold 告警阈值，大于0（目前暂定的值）
     */
    public Long getAlarmThreshold() {
        return this.AlarmThreshold;
    }

    /**
     * Set 告警阈值，大于0（目前暂定的值）
     * @param AlarmThreshold 告警阈值，大于0（目前暂定的值）
     */
    public void setAlarmThreshold(Long AlarmThreshold) {
        this.AlarmThreshold = AlarmThreshold;
    }

    /**
     * Get 资源关联的IP列表，高防包未绑定时，传空数组，高防IP专业版传多个IP的数据 
     * @return IpList 资源关联的IP列表，高防包未绑定时，传空数组，高防IP专业版传多个IP的数据
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set 资源关联的IP列表，高防包未绑定时，传空数组，高防IP专业版传多个IP的数据
     * @param IpList 资源关联的IP列表，高防包未绑定时，传空数组，高防IP专业版传多个IP的数据
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public ModifyDDoSAlarmThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSAlarmThresholdRequest(ModifyDDoSAlarmThresholdRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.RsId != null) {
            this.RsId = new String(source.RsId);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new Long(source.AlarmType);
        }
        if (source.AlarmThreshold != null) {
            this.AlarmThreshold = new Long(source.AlarmThreshold);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "RsId", this.RsId);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmThreshold", this.AlarmThreshold);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

