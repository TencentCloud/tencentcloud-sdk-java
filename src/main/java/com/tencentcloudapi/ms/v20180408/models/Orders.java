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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Orders extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 平台类型整型值 
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * 平台类型描述：  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
    */
    @SerializedName("PlatformTypeDesc")
    @Expose
    private String PlatformTypeDesc;

    /**
    * 订单采购类型整型值
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 订单采购类型描述： 1-免费试用 2-按年收费 3-按次收费
    */
    @SerializedName("OrderTypeDesc")
    @Expose
    private String OrderTypeDesc;

    /**
    * android包年收费加固的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * 资源号
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源状态整型值
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * 资源状态描述
0-未生效、1-生效中、2-已失效。
    */
    @SerializedName("ResourceStatusDesc")
    @Expose
    private String ResourceStatusDesc;

    /**
    * 订单类型为免费试用时的免费加固次数。
    */
    @SerializedName("TestTimes")
    @Expose
    private Long TestTimes;

    /**
    * 资源生效时间
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * 资源过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 订单审批人
    */
    @SerializedName("Approver")
    @Expose
    private String Approver;

    /**
    * 订单审批状态整型值
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * 订单审批状态整型值描述：0-未审批、1-审批通过、2-驳回。
    */
    @SerializedName("ApprovalStatusDesc")
    @Expose
    private String ApprovalStatusDesc;

    /**
    * 订单审批时间
    */
    @SerializedName("ApprovalTime")
    @Expose
    private String ApprovalTime;

    /**
    * 按次收费加固资源，其关联的总任务数
    */
    @SerializedName("TimesTaskTotalCount")
    @Expose
    private Long TimesTaskTotalCount;

    /**
    * 按次收费加固资源，其关联的任务成功数
    */
    @SerializedName("TimesTaskSuccessCount")
    @Expose
    private Long TimesTaskSuccessCount;

    /**
    * 按次收费加固资源，其关联的任务失败数
    */
    @SerializedName("TimesTaskFailCount")
    @Expose
    private Long TimesTaskFailCount;

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 平台类型整型值  
     * @return PlatformType 平台类型整型值 
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 平台类型整型值 
     * @param PlatformType 平台类型整型值 
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 平台类型描述：  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固 
     * @return PlatformTypeDesc 平台类型描述：  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public String getPlatformTypeDesc() {
        return this.PlatformTypeDesc;
    }

    /**
     * Set 平台类型描述：  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     * @param PlatformTypeDesc 平台类型描述：  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public void setPlatformTypeDesc(String PlatformTypeDesc) {
        this.PlatformTypeDesc = PlatformTypeDesc;
    }

    /**
     * Get 订单采购类型整型值 
     * @return OrderType 订单采购类型整型值
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单采购类型整型值
     * @param OrderType 订单采购类型整型值
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 订单采购类型描述： 1-免费试用 2-按年收费 3-按次收费 
     * @return OrderTypeDesc 订单采购类型描述： 1-免费试用 2-按年收费 3-按次收费
     */
    public String getOrderTypeDesc() {
        return this.OrderTypeDesc;
    }

    /**
     * Set 订单采购类型描述： 1-免费试用 2-按年收费 3-按次收费
     * @param OrderTypeDesc 订单采购类型描述： 1-免费试用 2-按年收费 3-按次收费
     */
    public void setOrderTypeDesc(String OrderTypeDesc) {
        this.OrderTypeDesc = OrderTypeDesc;
    }

    /**
     * Get android包年收费加固的包名 
     * @return AppPkgName android包年收费加固的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set android包年收费加固的包名
     * @param AppPkgName android包年收费加固的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get 资源号 
     * @return ResourceId 资源号
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源号
     * @param ResourceId 资源号
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源状态整型值 
     * @return ResourceStatus 资源状态整型值
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态整型值
     * @param ResourceStatus 资源状态整型值
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get 资源状态描述
0-未生效、1-生效中、2-已失效。 
     * @return ResourceStatusDesc 资源状态描述
0-未生效、1-生效中、2-已失效。
     */
    public String getResourceStatusDesc() {
        return this.ResourceStatusDesc;
    }

    /**
     * Set 资源状态描述
0-未生效、1-生效中、2-已失效。
     * @param ResourceStatusDesc 资源状态描述
0-未生效、1-生效中、2-已失效。
     */
    public void setResourceStatusDesc(String ResourceStatusDesc) {
        this.ResourceStatusDesc = ResourceStatusDesc;
    }

    /**
     * Get 订单类型为免费试用时的免费加固次数。 
     * @return TestTimes 订单类型为免费试用时的免费加固次数。
     */
    public Long getTestTimes() {
        return this.TestTimes;
    }

    /**
     * Set 订单类型为免费试用时的免费加固次数。
     * @param TestTimes 订单类型为免费试用时的免费加固次数。
     */
    public void setTestTimes(Long TestTimes) {
        this.TestTimes = TestTimes;
    }

    /**
     * Get 资源生效时间 
     * @return ValidTime 资源生效时间
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 资源生效时间
     * @param ValidTime 资源生效时间
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 资源过期时间 
     * @return ExpireTime 资源过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资源过期时间
     * @param ExpireTime 资源过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源创建时间 
     * @return CreateTime 资源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间
     * @param CreateTime 资源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 订单审批人 
     * @return Approver 订单审批人
     */
    public String getApprover() {
        return this.Approver;
    }

    /**
     * Set 订单审批人
     * @param Approver 订单审批人
     */
    public void setApprover(String Approver) {
        this.Approver = Approver;
    }

    /**
     * Get 订单审批状态整型值 
     * @return ApprovalStatus 订单审批状态整型值
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set 订单审批状态整型值
     * @param ApprovalStatus 订单审批状态整型值
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get 订单审批状态整型值描述：0-未审批、1-审批通过、2-驳回。 
     * @return ApprovalStatusDesc 订单审批状态整型值描述：0-未审批、1-审批通过、2-驳回。
     */
    public String getApprovalStatusDesc() {
        return this.ApprovalStatusDesc;
    }

    /**
     * Set 订单审批状态整型值描述：0-未审批、1-审批通过、2-驳回。
     * @param ApprovalStatusDesc 订单审批状态整型值描述：0-未审批、1-审批通过、2-驳回。
     */
    public void setApprovalStatusDesc(String ApprovalStatusDesc) {
        this.ApprovalStatusDesc = ApprovalStatusDesc;
    }

    /**
     * Get 订单审批时间 
     * @return ApprovalTime 订单审批时间
     */
    public String getApprovalTime() {
        return this.ApprovalTime;
    }

    /**
     * Set 订单审批时间
     * @param ApprovalTime 订单审批时间
     */
    public void setApprovalTime(String ApprovalTime) {
        this.ApprovalTime = ApprovalTime;
    }

    /**
     * Get 按次收费加固资源，其关联的总任务数 
     * @return TimesTaskTotalCount 按次收费加固资源，其关联的总任务数
     */
    public Long getTimesTaskTotalCount() {
        return this.TimesTaskTotalCount;
    }

    /**
     * Set 按次收费加固资源，其关联的总任务数
     * @param TimesTaskTotalCount 按次收费加固资源，其关联的总任务数
     */
    public void setTimesTaskTotalCount(Long TimesTaskTotalCount) {
        this.TimesTaskTotalCount = TimesTaskTotalCount;
    }

    /**
     * Get 按次收费加固资源，其关联的任务成功数 
     * @return TimesTaskSuccessCount 按次收费加固资源，其关联的任务成功数
     */
    public Long getTimesTaskSuccessCount() {
        return this.TimesTaskSuccessCount;
    }

    /**
     * Set 按次收费加固资源，其关联的任务成功数
     * @param TimesTaskSuccessCount 按次收费加固资源，其关联的任务成功数
     */
    public void setTimesTaskSuccessCount(Long TimesTaskSuccessCount) {
        this.TimesTaskSuccessCount = TimesTaskSuccessCount;
    }

    /**
     * Get 按次收费加固资源，其关联的任务失败数 
     * @return TimesTaskFailCount 按次收费加固资源，其关联的任务失败数
     */
    public Long getTimesTaskFailCount() {
        return this.TimesTaskFailCount;
    }

    /**
     * Set 按次收费加固资源，其关联的任务失败数
     * @param TimesTaskFailCount 按次收费加固资源，其关联的任务失败数
     */
    public void setTimesTaskFailCount(Long TimesTaskFailCount) {
        this.TimesTaskFailCount = TimesTaskFailCount;
    }

    public Orders() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Orders(Orders source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.PlatformType != null) {
            this.PlatformType = new Long(source.PlatformType);
        }
        if (source.PlatformTypeDesc != null) {
            this.PlatformTypeDesc = new String(source.PlatformTypeDesc);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderTypeDesc != null) {
            this.OrderTypeDesc = new String(source.OrderTypeDesc);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.ResourceStatusDesc != null) {
            this.ResourceStatusDesc = new String(source.ResourceStatusDesc);
        }
        if (source.TestTimes != null) {
            this.TestTimes = new Long(source.TestTimes);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Approver != null) {
            this.Approver = new String(source.Approver);
        }
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.ApprovalStatusDesc != null) {
            this.ApprovalStatusDesc = new String(source.ApprovalStatusDesc);
        }
        if (source.ApprovalTime != null) {
            this.ApprovalTime = new String(source.ApprovalTime);
        }
        if (source.TimesTaskTotalCount != null) {
            this.TimesTaskTotalCount = new Long(source.TimesTaskTotalCount);
        }
        if (source.TimesTaskSuccessCount != null) {
            this.TimesTaskSuccessCount = new Long(source.TimesTaskSuccessCount);
        }
        if (source.TimesTaskFailCount != null) {
            this.TimesTaskFailCount = new Long(source.TimesTaskFailCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "PlatformTypeDesc", this.PlatformTypeDesc);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderTypeDesc", this.OrderTypeDesc);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "ResourceStatusDesc", this.ResourceStatusDesc);
        this.setParamSimple(map, prefix + "TestTimes", this.TestTimes);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Approver", this.Approver);
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "ApprovalStatusDesc", this.ApprovalStatusDesc);
        this.setParamSimple(map, prefix + "ApprovalTime", this.ApprovalTime);
        this.setParamSimple(map, prefix + "TimesTaskTotalCount", this.TimesTaskTotalCount);
        this.setParamSimple(map, prefix + "TimesTaskSuccessCount", this.TimesTaskSuccessCount);
        this.setParamSimple(map, prefix + "TimesTaskFailCount", this.TimesTaskFailCount);

    }
}

