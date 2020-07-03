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

public class NetworkHistoryInfo extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 集团id
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺id
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 店铺省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 店铺城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 店铺名称
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 网络信息
    */
    @SerializedName("Infos")
    @Expose
    private NetworkInfo [] Infos;

    /**
     * Get 总数 
     * @return Count 总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 总数
     * @param Count 总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 集团id 
     * @return CompanyId 集团id
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团id
     * @param CompanyId 集团id
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 店铺id 
     * @return ShopId 店铺id
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺id
     * @param ShopId 店铺id
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 店铺省份 
     * @return Province 店铺省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 店铺省份
     * @param Province 店铺省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 店铺城市 
     * @return City 店铺城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 店铺城市
     * @param City 店铺城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 店铺名称 
     * @return ShopName 店铺名称
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 店铺名称
     * @param ShopName 店铺名称
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * Get 网络信息 
     * @return Infos 网络信息
     */
    public NetworkInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 网络信息
     * @param Infos 网络信息
     */
    public void setInfos(NetworkInfo [] Infos) {
        this.Infos = Infos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

