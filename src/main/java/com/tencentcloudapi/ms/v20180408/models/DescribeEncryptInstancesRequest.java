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

public class DescribeEncryptInstancesRequest extends AbstractModel{

    /**
    * 多记录查询时使用，页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 多记录每页展示数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 多记录查询时排序使用  仅支持CreateTime 任务创建时间排序
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
    * (条件过滤字段) 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * (条件过滤字段) 订单采购类型 1-免费试用 2-按年收费 3-按次收费
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * (条件过滤字段) 1-在线加固 或 2-输出工具加固
    */
    @SerializedName("EncryptOpType")
    @Expose
    private Long EncryptOpType;

    /**
    * (条件过滤字段) 单记录查询时使用，结果ID该字段非空时，结构会根据结果ID进行单记录查询，符合查询条件时，只返回一条记录。
    */
    @SerializedName("ResultId")
    @Expose
    private String ResultId;

    /**
    * (条件过滤字段) 查询与订单Id关联的任务
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * (条件过滤字段) 查询与资源Id关联的任务
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * (条件过滤字段) 应用类型：android-apk; android-aab;
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * （条件过滤字段）应用的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * 加固结果，
0：正在排队；
1：加固成功；
2：加固中；
3：加固失败；
5：重试；
多记录查询时，根据查询结果进行检索使用。
    */
    @SerializedName("EncryptState")
    @Expose
    private Long [] EncryptState;

    /**
     * Get 多记录查询时使用，页码 
     * @return PageNumber 多记录查询时使用，页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 多记录查询时使用，页码
     * @param PageNumber 多记录查询时使用，页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 多记录每页展示数量 
     * @return PageSize 多记录每页展示数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 多记录每页展示数量
     * @param PageSize 多记录每页展示数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 多记录查询时排序使用  仅支持CreateTime 任务创建时间排序 
     * @return OrderField 多记录查询时排序使用  仅支持CreateTime 任务创建时间排序
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 多记录查询时排序使用  仅支持CreateTime 任务创建时间排序
     * @param OrderField 多记录查询时排序使用  仅支持CreateTime 任务创建时间排序
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
     * Get (条件过滤字段) 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固 
     * @return PlatformType (条件过滤字段) 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set (条件过滤字段) 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     * @param PlatformType (条件过滤字段) 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get (条件过滤字段) 订单采购类型 1-免费试用 2-按年收费 3-按次收费 
     * @return OrderType (条件过滤字段) 订单采购类型 1-免费试用 2-按年收费 3-按次收费
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set (条件过滤字段) 订单采购类型 1-免费试用 2-按年收费 3-按次收费
     * @param OrderType (条件过滤字段) 订单采购类型 1-免费试用 2-按年收费 3-按次收费
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get (条件过滤字段) 1-在线加固 或 2-输出工具加固 
     * @return EncryptOpType (条件过滤字段) 1-在线加固 或 2-输出工具加固
     */
    public Long getEncryptOpType() {
        return this.EncryptOpType;
    }

    /**
     * Set (条件过滤字段) 1-在线加固 或 2-输出工具加固
     * @param EncryptOpType (条件过滤字段) 1-在线加固 或 2-输出工具加固
     */
    public void setEncryptOpType(Long EncryptOpType) {
        this.EncryptOpType = EncryptOpType;
    }

    /**
     * Get (条件过滤字段) 单记录查询时使用，结果ID该字段非空时，结构会根据结果ID进行单记录查询，符合查询条件时，只返回一条记录。 
     * @return ResultId (条件过滤字段) 单记录查询时使用，结果ID该字段非空时，结构会根据结果ID进行单记录查询，符合查询条件时，只返回一条记录。
     */
    public String getResultId() {
        return this.ResultId;
    }

    /**
     * Set (条件过滤字段) 单记录查询时使用，结果ID该字段非空时，结构会根据结果ID进行单记录查询，符合查询条件时，只返回一条记录。
     * @param ResultId (条件过滤字段) 单记录查询时使用，结果ID该字段非空时，结构会根据结果ID进行单记录查询，符合查询条件时，只返回一条记录。
     */
    public void setResultId(String ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get (条件过滤字段) 查询与订单Id关联的任务 
     * @return OrderId (条件过滤字段) 查询与订单Id关联的任务
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set (条件过滤字段) 查询与订单Id关联的任务
     * @param OrderId (条件过滤字段) 查询与订单Id关联的任务
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get (条件过滤字段) 查询与资源Id关联的任务 
     * @return ResourceId (条件过滤字段) 查询与资源Id关联的任务
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set (条件过滤字段) 查询与资源Id关联的任务
     * @param ResourceId (条件过滤字段) 查询与资源Id关联的任务
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get (条件过滤字段) 应用类型：android-apk; android-aab; 
     * @return AppType (条件过滤字段) 应用类型：android-apk; android-aab;
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set (条件过滤字段) 应用类型：android-apk; android-aab;
     * @param AppType (条件过滤字段) 应用类型：android-apk; android-aab;
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get （条件过滤字段）应用的包名 
     * @return AppPkgName （条件过滤字段）应用的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set （条件过滤字段）应用的包名
     * @param AppPkgName （条件过滤字段）应用的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get 加固结果，
0：正在排队；
1：加固成功；
2：加固中；
3：加固失败；
5：重试；
多记录查询时，根据查询结果进行检索使用。 
     * @return EncryptState 加固结果，
0：正在排队；
1：加固成功；
2：加固中；
3：加固失败；
5：重试；
多记录查询时，根据查询结果进行检索使用。
     */
    public Long [] getEncryptState() {
        return this.EncryptState;
    }

    /**
     * Set 加固结果，
0：正在排队；
1：加固成功；
2：加固中；
3：加固失败；
5：重试；
多记录查询时，根据查询结果进行检索使用。
     * @param EncryptState 加固结果，
0：正在排队；
1：加固成功；
2：加固中；
3：加固失败；
5：重试；
多记录查询时，根据查询结果进行检索使用。
     */
    public void setEncryptState(Long [] EncryptState) {
        this.EncryptState = EncryptState;
    }

    public DescribeEncryptInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEncryptInstancesRequest(DescribeEncryptInstancesRequest source) {
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
        if (source.EncryptOpType != null) {
            this.EncryptOpType = new Long(source.EncryptOpType);
        }
        if (source.ResultId != null) {
            this.ResultId = new String(source.ResultId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
        if (source.EncryptState != null) {
            this.EncryptState = new Long[source.EncryptState.length];
            for (int i = 0; i < source.EncryptState.length; i++) {
                this.EncryptState[i] = new Long(source.EncryptState[i]);
            }
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
        this.setParamSimple(map, prefix + "EncryptOpType", this.EncryptOpType);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamArraySimple(map, prefix + "EncryptState.", this.EncryptState);

    }
}

