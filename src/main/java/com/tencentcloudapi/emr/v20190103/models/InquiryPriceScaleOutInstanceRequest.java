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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceScaleOutInstanceRequest extends AbstractModel {

    /**
    * <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>实例所属的可用区ID，例如100003。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/213/15707">DescribeZones</a> 的返回值中的ZoneId字段来获取。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>扩容的Core节点数量。</p>
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * <p>扩容的Task节点数量。</p>
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>扩容的Router节点数量。</p>
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * <p>扩容的Master节点数量。</p>
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>计算资源id</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
    * <p>扩容资源类型</p>
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * <p>节点组ID</p>
    */
    @SerializedName("NodeGroupId")
    @Expose
    private String NodeGroupId;

    /**
     * Get <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>实例所属的可用区ID，例如100003。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/213/15707">DescribeZones</a> 的返回值中的ZoneId字段来获取。</p> 
     * @return ZoneId <p>实例所属的可用区ID，例如100003。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/213/15707">DescribeZones</a> 的返回值中的ZoneId字段来获取。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>实例所属的可用区ID，例如100003。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/213/15707">DescribeZones</a> 的返回值中的ZoneId字段来获取。</p>
     * @param ZoneId <p>实例所属的可用区ID，例如100003。该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/213/15707">DescribeZones</a> 的返回值中的ZoneId字段来获取。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li> 
     * @return PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     * @param PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>扩容的Core节点数量。</p> 
     * @return CoreCount <p>扩容的Core节点数量。</p>
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set <p>扩容的Core节点数量。</p>
     * @param CoreCount <p>扩容的Core节点数量。</p>
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get <p>扩容的Task节点数量。</p> 
     * @return TaskCount <p>扩容的Task节点数量。</p>
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>扩容的Task节点数量。</p>
     * @param TaskCount <p>扩容的Task节点数量。</p>
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li> 
     * @return Currency <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
     * @param Currency <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>扩容的Router节点数量。</p> 
     * @return RouterCount <p>扩容的Router节点数量。</p>
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set <p>扩容的Router节点数量。</p>
     * @param RouterCount <p>扩容的Router节点数量。</p>
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get <p>扩容的Master节点数量。</p> 
     * @return MasterCount <p>扩容的Master节点数量。</p>
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set <p>扩容的Master节点数量。</p>
     * @param MasterCount <p>扩容的Master节点数量。</p>
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get <p>类型为ComputeResource和EMR以及默认，默认为EMR</p> 
     * @return ResourceBaseType <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
     * @param ResourceBaseType <p>类型为ComputeResource和EMR以及默认，默认为EMR</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>计算资源id</p> 
     * @return ComputeResourceId <p>计算资源id</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>计算资源id</p>
     * @param ComputeResourceId <p>计算资源id</p>
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    /**
     * Get <p>扩容资源类型</p> 
     * @return HardwareResourceType <p>扩容资源类型</p>
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set <p>扩容资源类型</p>
     * @param HardwareResourceType <p>扩容资源类型</p>
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get <p>节点组ID</p> 
     * @return NodeGroupId <p>节点组ID</p>
     */
    public String getNodeGroupId() {
        return this.NodeGroupId;
    }

    /**
     * Set <p>节点组ID</p>
     * @param NodeGroupId <p>节点组ID</p>
     */
    public void setNodeGroupId(String NodeGroupId) {
        this.NodeGroupId = NodeGroupId;
    }

    public InquiryPriceScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceScaleOutInstanceRequest(InquiryPriceScaleOutInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RouterCount != null) {
            this.RouterCount = new Long(source.RouterCount);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.NodeGroupId != null) {
            this.NodeGroupId = new String(source.NodeGroupId);
        }
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
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamSimple(map, prefix + "NodeGroupId", this.NodeGroupId);

    }
}

