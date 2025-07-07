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

public class DescribePcapRequest extends AbstractModel {

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 攻击事件的开始时间，格式为"2018-08-28 07:00:00"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 攻击事件的结束时间，格式为"2018-08-28 07:02:00"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 资源的IP，只有当Business为net时才需要填写资源实例下的IP；
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源实例ID 
     * @return Id 资源实例ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源实例ID
     * @param Id 资源实例ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 攻击事件的开始时间，格式为"2018-08-28 07:00:00" 
     * @return StartTime 攻击事件的开始时间，格式为"2018-08-28 07:00:00"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 攻击事件的开始时间，格式为"2018-08-28 07:00:00"
     * @param StartTime 攻击事件的开始时间，格式为"2018-08-28 07:00:00"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 攻击事件的结束时间，格式为"2018-08-28 07:02:00" 
     * @return EndTime 攻击事件的结束时间，格式为"2018-08-28 07:02:00"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 攻击事件的结束时间，格式为"2018-08-28 07:02:00"
     * @param EndTime 攻击事件的结束时间，格式为"2018-08-28 07:02:00"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 资源的IP，只有当Business为net时才需要填写资源实例下的IP； 
     * @return Ip 资源的IP，只有当Business为net时才需要填写资源实例下的IP；
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源的IP，只有当Business为net时才需要填写资源实例下的IP；
     * @param Ip 资源的IP，只有当Business为net时才需要填写资源实例下的IP；
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public DescribePcapRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePcapRequest(DescribePcapRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

