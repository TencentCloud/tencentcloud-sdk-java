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

public class InquiryPriceScaleOutInstanceRequest extends AbstractModel{

    /**
    * 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 实例所属的可用区ID，例如100003。该参数可以通过调用 [DescribeZones](https://cloud.tencent.com/document/api/213/15707) 的返回值中的ZoneId字段来获取。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 扩容的Core节点数量。
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * 扩容的Task节点数量。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 货币种类。取值范围：
<li>CNY：表示人民币。</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 扩容的Router节点数量。
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
     * Get 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 实例所属的可用区ID，例如100003。该参数可以通过调用 [DescribeZones](https://cloud.tencent.com/document/api/213/15707) 的返回值中的ZoneId字段来获取。 
     * @return ZoneId 实例所属的可用区ID，例如100003。该参数可以通过调用 [DescribeZones](https://cloud.tencent.com/document/api/213/15707) 的返回值中的ZoneId字段来获取。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 实例所属的可用区ID，例如100003。该参数可以通过调用 [DescribeZones](https://cloud.tencent.com/document/api/213/15707) 的返回值中的ZoneId字段来获取。
     * @param ZoneId 实例所属的可用区ID，例如100003。该参数可以通过调用 [DescribeZones](https://cloud.tencent.com/document/api/213/15707) 的返回值中的ZoneId字段来获取。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li> 
     * @return PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     * @param PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 扩容的Core节点数量。 
     * @return CoreCount 扩容的Core节点数量。
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set 扩容的Core节点数量。
     * @param CoreCount 扩容的Core节点数量。
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get 扩容的Task节点数量。 
     * @return TaskCount 扩容的Task节点数量。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 扩容的Task节点数量。
     * @param TaskCount 扩容的Task节点数量。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
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
     * Get 扩容的Router节点数量。 
     * @return RouterCount 扩容的Router节点数量。
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set 扩容的Router节点数量。
     * @param RouterCount 扩容的Router节点数量。
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RouterCount", this.RouterCount);

    }
}

