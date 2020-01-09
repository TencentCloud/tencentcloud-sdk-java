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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProvinceDetail extends AbstractModel{

    /**
    * 可用率
    */
    @SerializedName("AvgAvailRatio")
    @Expose
    private Float AvgAvailRatio;

    /**
    * 省份名称
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * 省份英文名称
    */
    @SerializedName("Mapkey")
    @Expose
    private String Mapkey;

    /**
    * 统计时间点
    */
    @SerializedName("TimeStamp")
    @Expose
    private String TimeStamp;

    /**
    * 分运营商可用率
    */
    @SerializedName("IspDetail")
    @Expose
    private IspDetail [] IspDetail;

    /**
    * 平均耗时，单位毫秒
    */
    @SerializedName("AvgTime")
    @Expose
    private Float AvgTime;

    /**
    * 省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
     * Get 可用率 
     * @return AvgAvailRatio 可用率
     */
    public Float getAvgAvailRatio() {
        return this.AvgAvailRatio;
    }

    /**
     * Set 可用率
     * @param AvgAvailRatio 可用率
     */
    public void setAvgAvailRatio(Float AvgAvailRatio) {
        this.AvgAvailRatio = AvgAvailRatio;
    }

    /**
     * Get 省份名称 
     * @return ProvinceName 省份名称
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set 省份名称
     * @param ProvinceName 省份名称
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get 省份英文名称 
     * @return Mapkey 省份英文名称
     */
    public String getMapkey() {
        return this.Mapkey;
    }

    /**
     * Set 省份英文名称
     * @param Mapkey 省份英文名称
     */
    public void setMapkey(String Mapkey) {
        this.Mapkey = Mapkey;
    }

    /**
     * Get 统计时间点 
     * @return TimeStamp 统计时间点
     */
    public String getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set 统计时间点
     * @param TimeStamp 统计时间点
     */
    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    /**
     * Get 分运营商可用率 
     * @return IspDetail 分运营商可用率
     */
    public IspDetail [] getIspDetail() {
        return this.IspDetail;
    }

    /**
     * Set 分运营商可用率
     * @param IspDetail 分运营商可用率
     */
    public void setIspDetail(IspDetail [] IspDetail) {
        this.IspDetail = IspDetail;
    }

    /**
     * Get 平均耗时，单位毫秒 
     * @return AvgTime 平均耗时，单位毫秒
     */
    public Float getAvgTime() {
        return this.AvgTime;
    }

    /**
     * Set 平均耗时，单位毫秒
     * @param AvgTime 平均耗时，单位毫秒
     */
    public void setAvgTime(Float AvgTime) {
        this.AvgTime = AvgTime;
    }

    /**
     * Get 省份 
     * @return Province 省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
     * @param Province 省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvgAvailRatio", this.AvgAvailRatio);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "Mapkey", this.Mapkey);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);
        this.setParamArrayObj(map, prefix + "IspDetail.", this.IspDetail);
        this.setParamSimple(map, prefix + "AvgTime", this.AvgTime);
        this.setParamSimple(map, prefix + "Province", this.Province);

    }
}

