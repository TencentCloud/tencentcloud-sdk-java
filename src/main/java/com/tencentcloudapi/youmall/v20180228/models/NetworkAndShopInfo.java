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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAndShopInfo extends AbstractModel {

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
    * 店铺名
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 上传带宽，单位Mb/s，-1：未知
    */
    @SerializedName("Upload")
    @Expose
    private Float Upload;

    /**
    * 下载带宽，单位Mb/s，-1：未知
    */
    @SerializedName("Download")
    @Expose
    private Float Download;

    /**
    * 最小延迟，单位ms，-1：未知
    */
    @SerializedName("MinRtt")
    @Expose
    private Float MinRtt;

    /**
    * 平均延迟，单位ms，-1：未知
    */
    @SerializedName("AvgRtt")
    @Expose
    private Float AvgRtt;

    /**
    * 最大延迟，单位ms，-1：未知
    */
    @SerializedName("MaxRtt")
    @Expose
    private Float MaxRtt;

    /**
    * 平均偏差延迟，单位ms，-1：未知
    */
    @SerializedName("MdevRtt")
    @Expose
    private Float MdevRtt;

    /**
    * 丢包率百分比，-1：未知
    */
    @SerializedName("Loss")
    @Expose
    private Float Loss;

    /**
    * 更新时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 上报网络状态设备
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

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
     * Get 店铺名 
     * @return ShopName 店铺名
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 店铺名
     * @param ShopName 店铺名
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * Get 上传带宽，单位Mb/s，-1：未知 
     * @return Upload 上传带宽，单位Mb/s，-1：未知
     */
    public Float getUpload() {
        return this.Upload;
    }

    /**
     * Set 上传带宽，单位Mb/s，-1：未知
     * @param Upload 上传带宽，单位Mb/s，-1：未知
     */
    public void setUpload(Float Upload) {
        this.Upload = Upload;
    }

    /**
     * Get 下载带宽，单位Mb/s，-1：未知 
     * @return Download 下载带宽，单位Mb/s，-1：未知
     */
    public Float getDownload() {
        return this.Download;
    }

    /**
     * Set 下载带宽，单位Mb/s，-1：未知
     * @param Download 下载带宽，单位Mb/s，-1：未知
     */
    public void setDownload(Float Download) {
        this.Download = Download;
    }

    /**
     * Get 最小延迟，单位ms，-1：未知 
     * @return MinRtt 最小延迟，单位ms，-1：未知
     */
    public Float getMinRtt() {
        return this.MinRtt;
    }

    /**
     * Set 最小延迟，单位ms，-1：未知
     * @param MinRtt 最小延迟，单位ms，-1：未知
     */
    public void setMinRtt(Float MinRtt) {
        this.MinRtt = MinRtt;
    }

    /**
     * Get 平均延迟，单位ms，-1：未知 
     * @return AvgRtt 平均延迟，单位ms，-1：未知
     */
    public Float getAvgRtt() {
        return this.AvgRtt;
    }

    /**
     * Set 平均延迟，单位ms，-1：未知
     * @param AvgRtt 平均延迟，单位ms，-1：未知
     */
    public void setAvgRtt(Float AvgRtt) {
        this.AvgRtt = AvgRtt;
    }

    /**
     * Get 最大延迟，单位ms，-1：未知 
     * @return MaxRtt 最大延迟，单位ms，-1：未知
     */
    public Float getMaxRtt() {
        return this.MaxRtt;
    }

    /**
     * Set 最大延迟，单位ms，-1：未知
     * @param MaxRtt 最大延迟，单位ms，-1：未知
     */
    public void setMaxRtt(Float MaxRtt) {
        this.MaxRtt = MaxRtt;
    }

    /**
     * Get 平均偏差延迟，单位ms，-1：未知 
     * @return MdevRtt 平均偏差延迟，单位ms，-1：未知
     */
    public Float getMdevRtt() {
        return this.MdevRtt;
    }

    /**
     * Set 平均偏差延迟，单位ms，-1：未知
     * @param MdevRtt 平均偏差延迟，单位ms，-1：未知
     */
    public void setMdevRtt(Float MdevRtt) {
        this.MdevRtt = MdevRtt;
    }

    /**
     * Get 丢包率百分比，-1：未知 
     * @return Loss 丢包率百分比，-1：未知
     */
    public Float getLoss() {
        return this.Loss;
    }

    /**
     * Set 丢包率百分比，-1：未知
     * @param Loss 丢包率百分比，-1：未知
     */
    public void setLoss(Float Loss) {
        this.Loss = Loss;
    }

    /**
     * Get 更新时间戳 
     * @return UpdateTime 更新时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳
     * @param UpdateTime 更新时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 上报网络状态设备 
     * @return Mac 上报网络状态设备
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set 上报网络状态设备
     * @param Mac 上报网络状态设备
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    public NetworkAndShopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAndShopInfo(NetworkAndShopInfo source) {
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
        }
        if (source.Upload != null) {
            this.Upload = new Float(source.Upload);
        }
        if (source.Download != null) {
            this.Download = new Float(source.Download);
        }
        if (source.MinRtt != null) {
            this.MinRtt = new Float(source.MinRtt);
        }
        if (source.AvgRtt != null) {
            this.AvgRtt = new Float(source.AvgRtt);
        }
        if (source.MaxRtt != null) {
            this.MaxRtt = new Float(source.MaxRtt);
        }
        if (source.MdevRtt != null) {
            this.MdevRtt = new Float(source.MdevRtt);
        }
        if (source.Loss != null) {
            this.Loss = new Float(source.Loss);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "Upload", this.Upload);
        this.setParamSimple(map, prefix + "Download", this.Download);
        this.setParamSimple(map, prefix + "MinRtt", this.MinRtt);
        this.setParamSimple(map, prefix + "AvgRtt", this.AvgRtt);
        this.setParamSimple(map, prefix + "MaxRtt", this.MaxRtt);
        this.setParamSimple(map, prefix + "MdevRtt", this.MdevRtt);
        this.setParamSimple(map, prefix + "Loss", this.Loss);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Mac", this.Mac);

    }
}

