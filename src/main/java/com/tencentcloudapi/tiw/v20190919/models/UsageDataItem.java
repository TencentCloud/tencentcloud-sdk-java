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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDataItem extends AbstractModel{

    /**
    * 日期，格式为YYYY-MM-DD
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 白板应用SDKAppID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 互动白板子产品，请求参数传入的一致
- sp_tiw_board: 互动白板时长
- sp_tiw_dt: 动态转码页数
- sp_tiw_st: 静态转码页数
- sp_tiw_ric: 实时录制时长
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * 用量值
- 静态转码、动态转码单位为页
- 白板时长、实时录制时长单位为分钟
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get 日期，格式为YYYY-MM-DD 
     * @return Time 日期，格式为YYYY-MM-DD
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日期，格式为YYYY-MM-DD
     * @param Time 日期，格式为YYYY-MM-DD
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 白板应用SDKAppID 
     * @return SdkAppId 白板应用SDKAppID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 白板应用SDKAppID
     * @param SdkAppId 白板应用SDKAppID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 互动白板子产品，请求参数传入的一致
- sp_tiw_board: 互动白板时长
- sp_tiw_dt: 动态转码页数
- sp_tiw_st: 静态转码页数
- sp_tiw_ric: 实时录制时长 
     * @return SubProduct 互动白板子产品，请求参数传入的一致
- sp_tiw_board: 互动白板时长
- sp_tiw_dt: 动态转码页数
- sp_tiw_st: 静态转码页数
- sp_tiw_ric: 实时录制时长
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set 互动白板子产品，请求参数传入的一致
- sp_tiw_board: 互动白板时长
- sp_tiw_dt: 动态转码页数
- sp_tiw_st: 静态转码页数
- sp_tiw_ric: 实时录制时长
     * @param SubProduct 互动白板子产品，请求参数传入的一致
- sp_tiw_board: 互动白板时长
- sp_tiw_dt: 动态转码页数
- sp_tiw_st: 静态转码页数
- sp_tiw_ric: 实时录制时长
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get 用量值
- 静态转码、动态转码单位为页
- 白板时长、实时录制时长单位为分钟 
     * @return Value 用量值
- 静态转码、动态转码单位为页
- 白板时长、实时录制时长单位为分钟
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 用量值
- 静态转码、动态转码单位为页
- 白板时长、实时录制时长单位为分钟
     * @param Value 用量值
- 静态转码、动态转码单位为页
- 白板时长、实时录制时长单位为分钟
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public UsageDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDataItem(UsageDataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

