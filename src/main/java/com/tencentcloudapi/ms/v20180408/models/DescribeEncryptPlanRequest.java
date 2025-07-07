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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEncryptPlanRequest extends AbstractModel {

    /**
    * 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * 订单采购类型 1-免费试用 2-按年收费 3-按次收费
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 1-在线加固；2-输出工具
    */
    @SerializedName("EncryptOpType")
    @Expose
    private Long EncryptOpType;

    /**
    * 本次加固使用的资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * （条件过滤字段）加固查询时，根据包名查询
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * （条件过滤字段）加固查询时，根据应用格式查询，枚举值：“apk”、“aab”
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
     * Get 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固 
     * @return PlatformType 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     * @param PlatformType 平台类型  1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 订单采购类型 1-免费试用 2-按年收费 3-按次收费 
     * @return OrderType 订单采购类型 1-免费试用 2-按年收费 3-按次收费
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单采购类型 1-免费试用 2-按年收费 3-按次收费
     * @param OrderType 订单采购类型 1-免费试用 2-按年收费 3-按次收费
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 1-在线加固；2-输出工具 
     * @return EncryptOpType 1-在线加固；2-输出工具
     */
    public Long getEncryptOpType() {
        return this.EncryptOpType;
    }

    /**
     * Set 1-在线加固；2-输出工具
     * @param EncryptOpType 1-在线加固；2-输出工具
     */
    public void setEncryptOpType(Long EncryptOpType) {
        this.EncryptOpType = EncryptOpType;
    }

    /**
     * Get 本次加固使用的资源id 
     * @return ResourceId 本次加固使用的资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 本次加固使用的资源id
     * @param ResourceId 本次加固使用的资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get （条件过滤字段）加固查询时，根据包名查询 
     * @return AppPkgName （条件过滤字段）加固查询时，根据包名查询
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set （条件过滤字段）加固查询时，根据包名查询
     * @param AppPkgName （条件过滤字段）加固查询时，根据包名查询
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get （条件过滤字段）加固查询时，根据应用格式查询，枚举值：“apk”、“aab” 
     * @return AppType （条件过滤字段）加固查询时，根据应用格式查询，枚举值：“apk”、“aab”
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set （条件过滤字段）加固查询时，根据应用格式查询，枚举值：“apk”、“aab”
     * @param AppType （条件过滤字段）加固查询时，根据应用格式查询，枚举值：“apk”、“aab”
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    public DescribeEncryptPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEncryptPlanRequest(DescribeEncryptPlanRequest source) {
        if (source.PlatformType != null) {
            this.PlatformType = new Long(source.PlatformType);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.EncryptOpType != null) {
            this.EncryptOpType = new Long(source.EncryptOpType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "EncryptOpType", this.EncryptOpType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppType", this.AppType);

    }
}

