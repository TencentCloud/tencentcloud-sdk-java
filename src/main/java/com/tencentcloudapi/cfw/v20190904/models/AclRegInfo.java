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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclRegInfo extends AbstractModel {

    /**
    * 地域KEY
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 上级地域信息
    */
    @SerializedName("Parent")
    @Expose
    private String Parent;

    /**
    * 中文拼音首字母
    */
    @SerializedName("ZhKey")
    @Expose
    private String ZhKey;

    /**
    * 英文首字母
    */
    @SerializedName("EnKey")
    @Expose
    private String EnKey;

    /**
    * 是否为地区
    */
    @SerializedName("Area")
    @Expose
    private Long Area;

    /**
    * 是否为省份、城市
    */
    @SerializedName("IsCity")
    @Expose
    private Long IsCity;

    /**
    * 序号
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 是否支持旁路
    */
    @SerializedName("ForBypass")
    @Expose
    private Long ForBypass;

    /**
    * 是否支持串行
    */
    @SerializedName("ForSerial")
    @Expose
    private Long ForSerial;

    /**
    * 是否支持NAT
    */
    @SerializedName("ForNat")
    @Expose
    private Long ForNat;

    /**
     * Get 地域KEY 
     * @return RegionCode 地域KEY
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域KEY
     * @param RegionCode 地域KEY
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 上级地域信息 
     * @return Parent 上级地域信息
     */
    public String getParent() {
        return this.Parent;
    }

    /**
     * Set 上级地域信息
     * @param Parent 上级地域信息
     */
    public void setParent(String Parent) {
        this.Parent = Parent;
    }

    /**
     * Get 中文拼音首字母 
     * @return ZhKey 中文拼音首字母
     */
    public String getZhKey() {
        return this.ZhKey;
    }

    /**
     * Set 中文拼音首字母
     * @param ZhKey 中文拼音首字母
     */
    public void setZhKey(String ZhKey) {
        this.ZhKey = ZhKey;
    }

    /**
     * Get 英文首字母 
     * @return EnKey 英文首字母
     */
    public String getEnKey() {
        return this.EnKey;
    }

    /**
     * Set 英文首字母
     * @param EnKey 英文首字母
     */
    public void setEnKey(String EnKey) {
        this.EnKey = EnKey;
    }

    /**
     * Get 是否为地区 
     * @return Area 是否为地区
     */
    public Long getArea() {
        return this.Area;
    }

    /**
     * Set 是否为地区
     * @param Area 是否为地区
     */
    public void setArea(Long Area) {
        this.Area = Area;
    }

    /**
     * Get 是否为省份、城市 
     * @return IsCity 是否为省份、城市
     */
    public Long getIsCity() {
        return this.IsCity;
    }

    /**
     * Set 是否为省份、城市
     * @param IsCity 是否为省份、城市
     */
    public void setIsCity(Long IsCity) {
        this.IsCity = IsCity;
    }

    /**
     * Get 序号 
     * @return Num 序号
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 序号
     * @param Num 序号
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 是否支持旁路 
     * @return ForBypass 是否支持旁路
     */
    public Long getForBypass() {
        return this.ForBypass;
    }

    /**
     * Set 是否支持旁路
     * @param ForBypass 是否支持旁路
     */
    public void setForBypass(Long ForBypass) {
        this.ForBypass = ForBypass;
    }

    /**
     * Get 是否支持串行 
     * @return ForSerial 是否支持串行
     */
    public Long getForSerial() {
        return this.ForSerial;
    }

    /**
     * Set 是否支持串行
     * @param ForSerial 是否支持串行
     */
    public void setForSerial(Long ForSerial) {
        this.ForSerial = ForSerial;
    }

    /**
     * Get 是否支持NAT 
     * @return ForNat 是否支持NAT
     */
    public Long getForNat() {
        return this.ForNat;
    }

    /**
     * Set 是否支持NAT
     * @param ForNat 是否支持NAT
     */
    public void setForNat(Long ForNat) {
        this.ForNat = ForNat;
    }

    public AclRegInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclRegInfo(AclRegInfo source) {
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Parent != null) {
            this.Parent = new String(source.Parent);
        }
        if (source.ZhKey != null) {
            this.ZhKey = new String(source.ZhKey);
        }
        if (source.EnKey != null) {
            this.EnKey = new String(source.EnKey);
        }
        if (source.Area != null) {
            this.Area = new Long(source.Area);
        }
        if (source.IsCity != null) {
            this.IsCity = new Long(source.IsCity);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.ForBypass != null) {
            this.ForBypass = new Long(source.ForBypass);
        }
        if (source.ForSerial != null) {
            this.ForSerial = new Long(source.ForSerial);
        }
        if (source.ForNat != null) {
            this.ForNat = new Long(source.ForNat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Parent", this.Parent);
        this.setParamSimple(map, prefix + "ZhKey", this.ZhKey);
        this.setParamSimple(map, prefix + "EnKey", this.EnKey);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsCity", this.IsCity);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "ForBypass", this.ForBypass);
        this.setParamSimple(map, prefix + "ForSerial", this.ForSerial);
        this.setParamSimple(map, prefix + "ForNat", this.ForNat);

    }
}

