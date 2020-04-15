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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewInstanceRequest extends AbstractModel{

    /**
    * 实例续费的时长。需要结合TimeUnit一起使用。1表示续费1一个月
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 待续费节点的资源ID列表。资源ID形如：emr-vm-xxxxxxxx。有效的资源ID可通过登录[控制台](https://console.cloud.tencent.com/emr/static/hardware)查询。
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 实例计费模式。此处只支持取值为1，表示包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 货币种类。取值范围：
<li>CNY：表示人民币。</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 实例续费的时长。需要结合TimeUnit一起使用。1表示续费1一个月 
     * @return TimeSpan 实例续费的时长。需要结合TimeUnit一起使用。1表示续费1一个月
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 实例续费的时长。需要结合TimeUnit一起使用。1表示续费1一个月
     * @param TimeSpan 实例续费的时长。需要结合TimeUnit一起使用。1表示续费1一个月
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 待续费节点的资源ID列表。资源ID形如：emr-vm-xxxxxxxx。有效的资源ID可通过登录[控制台](https://console.cloud.tencent.com/emr/static/hardware)查询。 
     * @return ResourceIds 待续费节点的资源ID列表。资源ID形如：emr-vm-xxxxxxxx。有效的资源ID可通过登录[控制台](https://console.cloud.tencent.com/emr/static/hardware)查询。
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 待续费节点的资源ID列表。资源ID形如：emr-vm-xxxxxxxx。有效的资源ID可通过登录[控制台](https://console.cloud.tencent.com/emr/static/hardware)查询。
     * @param ResourceIds 待续费节点的资源ID列表。资源ID形如：emr-vm-xxxxxxxx。有效的资源ID可通过登录[控制台](https://console.cloud.tencent.com/emr/static/hardware)查询。
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 实例计费模式。此处只支持取值为1，表示包年包月。 
     * @return PayMode 实例计费模式。此处只支持取值为1，表示包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。此处只支持取值为1，表示包年包月。
     * @param PayMode 实例计费模式。此处只支持取值为1，表示包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例续费的时间单位。取值范围：
<li>m：表示月份。</li> 
     * @return TimeUnit 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
     * @param TimeUnit 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 货币种类。取值范围：
<li>CNY：表示人民币。</li> 
     * @return Currency 货币种类。取值范围：
<li>CNY：表示人民币。</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币种类。取值范围：
<li>CNY：表示人民币。</li>
     * @param Currency 货币种类。取值范围：
<li>CNY：表示人民币。</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

