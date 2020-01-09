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

public class GetDailyAvailRatioResponse extends AbstractModel{

    /**
    * 整体平均可用率
    */
    @SerializedName("AvgAvailRatio")
    @Expose
    private Float AvgAvailRatio;

    /**
    * 各省份最低可用率
    */
    @SerializedName("LowestAvailRatio")
    @Expose
    private Float LowestAvailRatio;

    /**
    * 可用率最低的省份
    */
    @SerializedName("LowestProvince")
    @Expose
    private String LowestProvince;

    /**
    * 分省份的可用率数据
    */
    @SerializedName("ProvinceData")
    @Expose
    private ProvinceDetail [] ProvinceData;

    /**
    * 国内平均耗时，单位毫秒
    */
    @SerializedName("AvgTime")
    @Expose
    private Float AvgTime;

    /**
    * 国外平均可用率
    */
    @SerializedName("AvgAvailRatio2")
    @Expose
    private Float AvgAvailRatio2;

    /**
    * 国外平均耗时，单位毫秒
    */
    @SerializedName("AvgTime2")
    @Expose
    private Float AvgTime2;

    /**
    * 国外最低可用率
    */
    @SerializedName("LowestAvailRatio2")
    @Expose
    private Float LowestAvailRatio2;

    /**
    * 国外可用率最低的区域
    */
    @SerializedName("LowestProvince2")
    @Expose
    private String LowestProvince2;

    /**
    * 国外分区域的可用率数据
    */
    @SerializedName("ProvinceData2")
    @Expose
    private ProvinceDetail [] ProvinceData2;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 整体平均可用率 
     * @return AvgAvailRatio 整体平均可用率
     */
    public Float getAvgAvailRatio() {
        return this.AvgAvailRatio;
    }

    /**
     * Set 整体平均可用率
     * @param AvgAvailRatio 整体平均可用率
     */
    public void setAvgAvailRatio(Float AvgAvailRatio) {
        this.AvgAvailRatio = AvgAvailRatio;
    }

    /**
     * Get 各省份最低可用率 
     * @return LowestAvailRatio 各省份最低可用率
     */
    public Float getLowestAvailRatio() {
        return this.LowestAvailRatio;
    }

    /**
     * Set 各省份最低可用率
     * @param LowestAvailRatio 各省份最低可用率
     */
    public void setLowestAvailRatio(Float LowestAvailRatio) {
        this.LowestAvailRatio = LowestAvailRatio;
    }

    /**
     * Get 可用率最低的省份 
     * @return LowestProvince 可用率最低的省份
     */
    public String getLowestProvince() {
        return this.LowestProvince;
    }

    /**
     * Set 可用率最低的省份
     * @param LowestProvince 可用率最低的省份
     */
    public void setLowestProvince(String LowestProvince) {
        this.LowestProvince = LowestProvince;
    }

    /**
     * Get 分省份的可用率数据 
     * @return ProvinceData 分省份的可用率数据
     */
    public ProvinceDetail [] getProvinceData() {
        return this.ProvinceData;
    }

    /**
     * Set 分省份的可用率数据
     * @param ProvinceData 分省份的可用率数据
     */
    public void setProvinceData(ProvinceDetail [] ProvinceData) {
        this.ProvinceData = ProvinceData;
    }

    /**
     * Get 国内平均耗时，单位毫秒 
     * @return AvgTime 国内平均耗时，单位毫秒
     */
    public Float getAvgTime() {
        return this.AvgTime;
    }

    /**
     * Set 国内平均耗时，单位毫秒
     * @param AvgTime 国内平均耗时，单位毫秒
     */
    public void setAvgTime(Float AvgTime) {
        this.AvgTime = AvgTime;
    }

    /**
     * Get 国外平均可用率 
     * @return AvgAvailRatio2 国外平均可用率
     */
    public Float getAvgAvailRatio2() {
        return this.AvgAvailRatio2;
    }

    /**
     * Set 国外平均可用率
     * @param AvgAvailRatio2 国外平均可用率
     */
    public void setAvgAvailRatio2(Float AvgAvailRatio2) {
        this.AvgAvailRatio2 = AvgAvailRatio2;
    }

    /**
     * Get 国外平均耗时，单位毫秒 
     * @return AvgTime2 国外平均耗时，单位毫秒
     */
    public Float getAvgTime2() {
        return this.AvgTime2;
    }

    /**
     * Set 国外平均耗时，单位毫秒
     * @param AvgTime2 国外平均耗时，单位毫秒
     */
    public void setAvgTime2(Float AvgTime2) {
        this.AvgTime2 = AvgTime2;
    }

    /**
     * Get 国外最低可用率 
     * @return LowestAvailRatio2 国外最低可用率
     */
    public Float getLowestAvailRatio2() {
        return this.LowestAvailRatio2;
    }

    /**
     * Set 国外最低可用率
     * @param LowestAvailRatio2 国外最低可用率
     */
    public void setLowestAvailRatio2(Float LowestAvailRatio2) {
        this.LowestAvailRatio2 = LowestAvailRatio2;
    }

    /**
     * Get 国外可用率最低的区域 
     * @return LowestProvince2 国外可用率最低的区域
     */
    public String getLowestProvince2() {
        return this.LowestProvince2;
    }

    /**
     * Set 国外可用率最低的区域
     * @param LowestProvince2 国外可用率最低的区域
     */
    public void setLowestProvince2(String LowestProvince2) {
        this.LowestProvince2 = LowestProvince2;
    }

    /**
     * Get 国外分区域的可用率数据 
     * @return ProvinceData2 国外分区域的可用率数据
     */
    public ProvinceDetail [] getProvinceData2() {
        return this.ProvinceData2;
    }

    /**
     * Set 国外分区域的可用率数据
     * @param ProvinceData2 国外分区域的可用率数据
     */
    public void setProvinceData2(ProvinceDetail [] ProvinceData2) {
        this.ProvinceData2 = ProvinceData2;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvgAvailRatio", this.AvgAvailRatio);
        this.setParamSimple(map, prefix + "LowestAvailRatio", this.LowestAvailRatio);
        this.setParamSimple(map, prefix + "LowestProvince", this.LowestProvince);
        this.setParamArrayObj(map, prefix + "ProvinceData.", this.ProvinceData);
        this.setParamSimple(map, prefix + "AvgTime", this.AvgTime);
        this.setParamSimple(map, prefix + "AvgAvailRatio2", this.AvgAvailRatio2);
        this.setParamSimple(map, prefix + "AvgTime2", this.AvgTime2);
        this.setParamSimple(map, prefix + "LowestAvailRatio2", this.LowestAvailRatio2);
        this.setParamSimple(map, prefix + "LowestProvince2", this.LowestProvince2);
        this.setParamArrayObj(map, prefix + "ProvinceData2.", this.ProvinceData2);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

