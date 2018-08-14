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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShopInfo  extends AbstractModel{

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 门店名称
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 客户门店编码
    */
    @SerializedName("ShopCode")
    @Expose
    private String ShopCode;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 公司名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
     * 获取公司ID
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取门店ID
     * @return ShopId 门店ID
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置门店ID
     * @param ShopId 门店ID
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取门店名称
     * @return ShopName 门店名称
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * 设置门店名称
     * @param ShopName 门店名称
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * 获取客户门店编码
     * @return ShopCode 客户门店编码
     */
    public String getShopCode() {
        return this.ShopCode;
    }

    /**
     * 设置客户门店编码
     * @param ShopCode 客户门店编码
     */
    public void setShopCode(String ShopCode) {
        this.ShopCode = ShopCode;
    }

    /**
     * 获取省
     * @return Province 省
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * 设置省
     * @param Province 省
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * 获取市
     * @return City 市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * 设置市
     * @param City 市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * 获取公司名称
     * @return CompanyName 公司名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * 设置公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "ShopCode", this.ShopCode);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);

    }
}

