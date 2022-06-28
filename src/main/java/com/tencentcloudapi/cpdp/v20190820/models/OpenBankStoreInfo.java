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

public class OpenBankStoreInfo extends AbstractModel{

    /**
    * 门店名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地区编码
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * 详细地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 门店编号
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 门店名称 
     * @return Name 门店名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 门店名称
     * @param Name 门店名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地区编码 
     * @return AreaCode 地区编码
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set 地区编码
     * @param AreaCode 地区编码
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get 详细地址 
     * @return Address 详细地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 详细地址
     * @param Address 详细地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 门店编号 
     * @return Id 门店编号
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 门店编号
     * @param Id 门店编号
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public OpenBankStoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankStoreInfo(OpenBankStoreInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

