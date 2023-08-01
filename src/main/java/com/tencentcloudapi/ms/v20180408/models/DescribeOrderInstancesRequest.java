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

public class DescribeOrderInstancesRequest extends AbstractModel{

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页展示数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 按某个字段排序，目前仅支持CreateTime排序。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 升序（asc）还是降序（desc），默认：desc。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * （条件过滤字段）平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * （条件过滤字段）订单采购类型 1-免费试用 2-按年收费 3-按次收费
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * （条件过滤字段）订单审批状态：
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * （条件过滤字段）资源状态：
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * （条件过滤字段）订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * （条件过滤字段）资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * （条件过滤字段）包名，查询android加固订单时使用
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页展示数量 
     * @return PageSize 每页展示数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页展示数量
     * @param PageSize 每页展示数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 按某个字段排序，目前仅支持CreateTime排序。 
     * @return OrderField 按某个字段排序，目前仅支持CreateTime排序。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 按某个字段排序，目前仅支持CreateTime排序。
     * @param OrderField 按某个字段排序，目前仅支持CreateTime排序。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 升序（asc）还是降序（desc），默认：desc。 
     * @return OrderDirection 升序（asc）还是降序（desc），默认：desc。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 升序（asc）还是降序（desc），默认：desc。
     * @param OrderDirection 升序（asc）还是降序（desc），默认：desc。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get （条件过滤字段）平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固 
     * @return PlatformType （条件过滤字段）平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set （条件过滤字段）平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     * @param PlatformType （条件过滤字段）平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get （条件过滤字段）订单采购类型 1-免费试用 2-按年收费 3-按次收费 
     * @return OrderType （条件过滤字段）订单采购类型 1-免费试用 2-按年收费 3-按次收费
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set （条件过滤字段）订单采购类型 1-免费试用 2-按年收费 3-按次收费
     * @param OrderType （条件过滤字段）订单采购类型 1-免费试用 2-按年收费 3-按次收费
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get （条件过滤字段）订单审批状态： 
     * @return ApprovalStatus （条件过滤字段）订单审批状态：
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set （条件过滤字段）订单审批状态：
     * @param ApprovalStatus （条件过滤字段）订单审批状态：
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get （条件过滤字段）资源状态： 
     * @return ResourceStatus （条件过滤字段）资源状态：
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set （条件过滤字段）资源状态：
     * @param ResourceStatus （条件过滤字段）资源状态：
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get （条件过滤字段）订单ID 
     * @return OrderId （条件过滤字段）订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set （条件过滤字段）订单ID
     * @param OrderId （条件过滤字段）订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get （条件过滤字段）资源ID 
     * @return ResourceId （条件过滤字段）资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set （条件过滤字段）资源ID
     * @param ResourceId （条件过滤字段）资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get （条件过滤字段）包名，查询android加固订单时使用 
     * @return AppPkgName （条件过滤字段）包名，查询android加固订单时使用
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set （条件过滤字段）包名，查询android加固订单时使用
     * @param AppPkgName （条件过滤字段）包名，查询android加固订单时使用
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    public DescribeOrderInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrderInstancesRequest(DescribeOrderInstancesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.PlatformType != null) {
            this.PlatformType = new Long(source.PlatformType);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);

    }
}

