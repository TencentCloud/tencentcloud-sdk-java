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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceClassRequest extends AbstractModel{

    /**
    * 是否仅查询在售标准机型配置信息。取值0：查询所有机型；1：查询在售机型。默认为1
    */
    @SerializedName("OnSale")
    @Expose
    private Long OnSale;

    /**
    * 是否返回价格信息。取值0：不返回价格信息，接口返回速度更快；1：返回价格信息。默认为1
    */
    @SerializedName("NeedPriceInfo")
    @Expose
    private Long NeedPriceInfo;

    /**
     * Get 是否仅查询在售标准机型配置信息。取值0：查询所有机型；1：查询在售机型。默认为1 
     * @return OnSale 是否仅查询在售标准机型配置信息。取值0：查询所有机型；1：查询在售机型。默认为1
     */
    public Long getOnSale() {
        return this.OnSale;
    }

    /**
     * Set 是否仅查询在售标准机型配置信息。取值0：查询所有机型；1：查询在售机型。默认为1
     * @param OnSale 是否仅查询在售标准机型配置信息。取值0：查询所有机型；1：查询在售机型。默认为1
     */
    public void setOnSale(Long OnSale) {
        this.OnSale = OnSale;
    }

    /**
     * Get 是否返回价格信息。取值0：不返回价格信息，接口返回速度更快；1：返回价格信息。默认为1 
     * @return NeedPriceInfo 是否返回价格信息。取值0：不返回价格信息，接口返回速度更快；1：返回价格信息。默认为1
     */
    public Long getNeedPriceInfo() {
        return this.NeedPriceInfo;
    }

    /**
     * Set 是否返回价格信息。取值0：不返回价格信息，接口返回速度更快；1：返回价格信息。默认为1
     * @param NeedPriceInfo 是否返回价格信息。取值0：不返回价格信息，接口返回速度更快；1：返回价格信息。默认为1
     */
    public void setNeedPriceInfo(Long NeedPriceInfo) {
        this.NeedPriceInfo = NeedPriceInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OnSale", this.OnSale);
        this.setParamSimple(map, prefix + "NeedPriceInfo", this.NeedPriceInfo);

    }
}

