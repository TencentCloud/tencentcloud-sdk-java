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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanDetailItem extends AbstractModel {

    /**
    * <p>用户ID，也可以为手机号</p>
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * <p>时间</p><p>参数格式：YYYYMMDDHHMMSS</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>省</p>
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * <p>市</p>
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * <p>区</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>品牌</p>
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * <p>品规</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>IP，可选，需符合IP格式</p>
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>码</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get <p>用户ID，也可以为手机号</p> 
     * @return Uid <p>用户ID，也可以为手机号</p>
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set <p>用户ID，也可以为手机号</p>
     * @param Uid <p>用户ID，也可以为手机号</p>
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>时间</p><p>参数格式：YYYYMMDDHHMMSS</p> 
     * @return Time <p>时间</p><p>参数格式：YYYYMMDDHHMMSS</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间</p><p>参数格式：YYYYMMDDHHMMSS</p>
     * @param Time <p>时间</p><p>参数格式：YYYYMMDDHHMMSS</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>省</p> 
     * @return ProvinceName <p>省</p>
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set <p>省</p>
     * @param ProvinceName <p>省</p>
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get <p>市</p> 
     * @return CityName <p>市</p>
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set <p>市</p>
     * @param CityName <p>市</p>
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get <p>区</p> 
     * @return RegionName <p>区</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>区</p>
     * @param RegionName <p>区</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>品牌</p> 
     * @return BrandName <p>品牌</p>
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set <p>品牌</p>
     * @param BrandName <p>品牌</p>
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get <p>品规</p> 
     * @return SpecName <p>品规</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>品规</p>
     * @param SpecName <p>品规</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>IP，可选，需符合IP格式</p> 
     * @return IP <p>IP，可选，需符合IP格式</p>
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>IP，可选，需符合IP格式</p>
     * @param IP <p>IP，可选，需符合IP格式</p>
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>码</p> 
     * @return Code <p>码</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>码</p>
     * @param Code <p>码</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public ScanDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanDetailItem(ScanDetailItem source) {
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.ProvinceName != null) {
            this.ProvinceName = new String(source.ProvinceName);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

