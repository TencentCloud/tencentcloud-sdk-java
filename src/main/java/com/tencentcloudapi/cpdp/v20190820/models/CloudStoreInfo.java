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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStoreInfo extends AbstractModel{

    /**
    * 门店ID。
    */
    @SerializedName("StoreId")
    @Expose
    private String StoreId;

    /**
    * 门店名称。
    */
    @SerializedName("StoreName")
    @Expose
    private String StoreName;

    /**
    * 门店地址。
    */
    @SerializedName("StoreAddress")
    @Expose
    private String StoreAddress;

    /**
    * 门店地区代码。
    */
    @SerializedName("StoreAreaCode")
    @Expose
    private String StoreAreaCode;

    /**
    * 设备ID。
wechat_ecommerce渠道 - h5支付方式，此字段必填。
    */
    @SerializedName("StoreDeviceId")
    @Expose
    private String StoreDeviceId;

    /**
     * Get 门店ID。 
     * @return StoreId 门店ID。
     */
    public String getStoreId() {
        return this.StoreId;
    }

    /**
     * Set 门店ID。
     * @param StoreId 门店ID。
     */
    public void setStoreId(String StoreId) {
        this.StoreId = StoreId;
    }

    /**
     * Get 门店名称。 
     * @return StoreName 门店名称。
     */
    public String getStoreName() {
        return this.StoreName;
    }

    /**
     * Set 门店名称。
     * @param StoreName 门店名称。
     */
    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    /**
     * Get 门店地址。 
     * @return StoreAddress 门店地址。
     */
    public String getStoreAddress() {
        return this.StoreAddress;
    }

    /**
     * Set 门店地址。
     * @param StoreAddress 门店地址。
     */
    public void setStoreAddress(String StoreAddress) {
        this.StoreAddress = StoreAddress;
    }

    /**
     * Get 门店地区代码。 
     * @return StoreAreaCode 门店地区代码。
     */
    public String getStoreAreaCode() {
        return this.StoreAreaCode;
    }

    /**
     * Set 门店地区代码。
     * @param StoreAreaCode 门店地区代码。
     */
    public void setStoreAreaCode(String StoreAreaCode) {
        this.StoreAreaCode = StoreAreaCode;
    }

    /**
     * Get 设备ID。
wechat_ecommerce渠道 - h5支付方式，此字段必填。 
     * @return StoreDeviceId 设备ID。
wechat_ecommerce渠道 - h5支付方式，此字段必填。
     */
    public String getStoreDeviceId() {
        return this.StoreDeviceId;
    }

    /**
     * Set 设备ID。
wechat_ecommerce渠道 - h5支付方式，此字段必填。
     * @param StoreDeviceId 设备ID。
wechat_ecommerce渠道 - h5支付方式，此字段必填。
     */
    public void setStoreDeviceId(String StoreDeviceId) {
        this.StoreDeviceId = StoreDeviceId;
    }

    public CloudStoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStoreInfo(CloudStoreInfo source) {
        if (source.StoreId != null) {
            this.StoreId = new String(source.StoreId);
        }
        if (source.StoreName != null) {
            this.StoreName = new String(source.StoreName);
        }
        if (source.StoreAddress != null) {
            this.StoreAddress = new String(source.StoreAddress);
        }
        if (source.StoreAreaCode != null) {
            this.StoreAreaCode = new String(source.StoreAreaCode);
        }
        if (source.StoreDeviceId != null) {
            this.StoreDeviceId = new String(source.StoreDeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreId", this.StoreId);
        this.setParamSimple(map, prefix + "StoreName", this.StoreName);
        this.setParamSimple(map, prefix + "StoreAddress", this.StoreAddress);
        this.setParamSimple(map, prefix + "StoreAreaCode", this.StoreAreaCode);
        this.setParamSimple(map, prefix + "StoreDeviceId", this.StoreDeviceId);

    }
}

