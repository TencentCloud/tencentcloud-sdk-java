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

public class CreateOrderInstanceRequest extends AbstractModel{

    /**
    * 平台类型枚举值：1-android加固  ；2-ios源码混淆 ； 3-sdk加固 ； 4-applet小程序加固
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * 订单采购类型 1-免费试用 ；2-按年收费 ；3-按次收费
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 代表应用包名列表，值为单个包名（例如：“a.b.xxx”）或多个包名用逗号隔开(例如：“a.b.xxx,b.c.xxx”)。
当android按年收费加固或android免费试用加固时，该字段要求非空，即PlatformType=1 并且 OrderType=2时，AppPkgNameList必传值。

    */
    @SerializedName("AppPkgNameList")
    @Expose
    private String AppPkgNameList;

    /**
     * Get 平台类型枚举值：1-android加固  ；2-ios源码混淆 ； 3-sdk加固 ； 4-applet小程序加固 
     * @return PlatformType 平台类型枚举值：1-android加固  ；2-ios源码混淆 ； 3-sdk加固 ； 4-applet小程序加固
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 平台类型枚举值：1-android加固  ；2-ios源码混淆 ； 3-sdk加固 ； 4-applet小程序加固
     * @param PlatformType 平台类型枚举值：1-android加固  ；2-ios源码混淆 ； 3-sdk加固 ； 4-applet小程序加固
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 订单采购类型 1-免费试用 ；2-按年收费 ；3-按次收费 
     * @return OrderType 订单采购类型 1-免费试用 ；2-按年收费 ；3-按次收费
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单采购类型 1-免费试用 ；2-按年收费 ；3-按次收费
     * @param OrderType 订单采购类型 1-免费试用 ；2-按年收费 ；3-按次收费
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 代表应用包名列表，值为单个包名（例如：“a.b.xxx”）或多个包名用逗号隔开(例如：“a.b.xxx,b.c.xxx”)。
当android按年收费加固或android免费试用加固时，该字段要求非空，即PlatformType=1 并且 OrderType=2时，AppPkgNameList必传值。
 
     * @return AppPkgNameList 代表应用包名列表，值为单个包名（例如：“a.b.xxx”）或多个包名用逗号隔开(例如：“a.b.xxx,b.c.xxx”)。
当android按年收费加固或android免费试用加固时，该字段要求非空，即PlatformType=1 并且 OrderType=2时，AppPkgNameList必传值。

     */
    public String getAppPkgNameList() {
        return this.AppPkgNameList;
    }

    /**
     * Set 代表应用包名列表，值为单个包名（例如：“a.b.xxx”）或多个包名用逗号隔开(例如：“a.b.xxx,b.c.xxx”)。
当android按年收费加固或android免费试用加固时，该字段要求非空，即PlatformType=1 并且 OrderType=2时，AppPkgNameList必传值。

     * @param AppPkgNameList 代表应用包名列表，值为单个包名（例如：“a.b.xxx”）或多个包名用逗号隔开(例如：“a.b.xxx,b.c.xxx”)。
当android按年收费加固或android免费试用加固时，该字段要求非空，即PlatformType=1 并且 OrderType=2时，AppPkgNameList必传值。

     */
    public void setAppPkgNameList(String AppPkgNameList) {
        this.AppPkgNameList = AppPkgNameList;
    }

    public CreateOrderInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrderInstanceRequest(CreateOrderInstanceRequest source) {
        if (source.PlatformType != null) {
            this.PlatformType = new Long(source.PlatformType);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.AppPkgNameList != null) {
            this.AppPkgNameList = new String(source.AppPkgNameList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "AppPkgNameList", this.AppPkgNameList);

    }
}

