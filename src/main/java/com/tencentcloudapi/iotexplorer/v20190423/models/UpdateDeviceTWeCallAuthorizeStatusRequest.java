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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDeviceTWeCallAuthorizeStatusRequest extends AbstractModel {

    /**
    * TweCall授权状态：0未授权，1已授权
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 微信用户的openId
    */
    @SerializedName("WechatOpenId")
    @Expose
    private String WechatOpenId;

    /**
     * Get TweCall授权状态：0未授权，1已授权 
     * @return Status TweCall授权状态：0未授权，1已授权
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set TweCall授权状态：0未授权，1已授权
     * @param Status TweCall授权状态：0未授权，1已授权
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 微信用户的openId 
     * @return WechatOpenId 微信用户的openId
     */
    public String getWechatOpenId() {
        return this.WechatOpenId;
    }

    /**
     * Set 微信用户的openId
     * @param WechatOpenId 微信用户的openId
     */
    public void setWechatOpenId(String WechatOpenId) {
        this.WechatOpenId = WechatOpenId;
    }

    public UpdateDeviceTWeCallAuthorizeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceTWeCallAuthorizeStatusRequest(UpdateDeviceTWeCallAuthorizeStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.WechatOpenId != null) {
            this.WechatOpenId = new String(source.WechatOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "WechatOpenId", this.WechatOpenId);

    }
}

