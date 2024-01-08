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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDosageDetailListRequest extends AbstractModel {

    /**
    * 用量起始时间，如：2023-02-01
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 用量截止时间，如：2023-02-28
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 产品编码，已支持查询的产品如下：
p_ccc（云联络中心）
p_rav（实时音视频）
p_pstn（号码保护）
p_smh（智能媒资托管）
p_coding_devops（CODING DevOps）
p_dsa（全球IP应用加速）
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 数据偏移量（从0开始）
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次数据量（最大3000）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 用量统计类型：用量明细的数据统计汇总周期类型，包括minute-按5分钟汇总、hour-按小时汇总、day-按天汇总、month-按月汇总、comm-其他，默认查询所有类型明细，目前各产品已支持的统计类型如下：
p_ccc（云联络中心）：comm、day
p_rav（实时音视频）：minute、day
p_pstn（号码保护）：comm
p_smh（智能媒资托管）：day
p_coding_devops（CODING DevOps）：comm、day
p_dsa（全球IP应用加速）：minute
    */
    @SerializedName("DosageType")
    @Expose
    private String DosageType;

    /**
     * Get 用量起始时间，如：2023-02-01 
     * @return StartTime 用量起始时间，如：2023-02-01
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 用量起始时间，如：2023-02-01
     * @param StartTime 用量起始时间，如：2023-02-01
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 用量截止时间，如：2023-02-28 
     * @return EndTime 用量截止时间，如：2023-02-28
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 用量截止时间，如：2023-02-28
     * @param EndTime 用量截止时间，如：2023-02-28
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 产品编码，已支持查询的产品如下：
p_ccc（云联络中心）
p_rav（实时音视频）
p_pstn（号码保护）
p_smh（智能媒资托管）
p_coding_devops（CODING DevOps）
p_dsa（全球IP应用加速） 
     * @return ProductCode 产品编码，已支持查询的产品如下：
p_ccc（云联络中心）
p_rav（实时音视频）
p_pstn（号码保护）
p_smh（智能媒资托管）
p_coding_devops（CODING DevOps）
p_dsa（全球IP应用加速）
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品编码，已支持查询的产品如下：
p_ccc（云联络中心）
p_rav（实时音视频）
p_pstn（号码保护）
p_smh（智能媒资托管）
p_coding_devops（CODING DevOps）
p_dsa（全球IP应用加速）
     * @param ProductCode 产品编码，已支持查询的产品如下：
p_ccc（云联络中心）
p_rav（实时音视频）
p_pstn（号码保护）
p_smh（智能媒资托管）
p_coding_devops（CODING DevOps）
p_dsa（全球IP应用加速）
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 数据偏移量（从0开始） 
     * @return Offset 数据偏移量（从0开始）
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量（从0开始）
     * @param Offset 数据偏移量（从0开始）
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次数据量（最大3000） 
     * @return Limit 单次数据量（最大3000）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次数据量（最大3000）
     * @param Limit 单次数据量（最大3000）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 用量统计类型：用量明细的数据统计汇总周期类型，包括minute-按5分钟汇总、hour-按小时汇总、day-按天汇总、month-按月汇总、comm-其他，默认查询所有类型明细，目前各产品已支持的统计类型如下：
p_ccc（云联络中心）：comm、day
p_rav（实时音视频）：minute、day
p_pstn（号码保护）：comm
p_smh（智能媒资托管）：day
p_coding_devops（CODING DevOps）：comm、day
p_dsa（全球IP应用加速）：minute 
     * @return DosageType 用量统计类型：用量明细的数据统计汇总周期类型，包括minute-按5分钟汇总、hour-按小时汇总、day-按天汇总、month-按月汇总、comm-其他，默认查询所有类型明细，目前各产品已支持的统计类型如下：
p_ccc（云联络中心）：comm、day
p_rav（实时音视频）：minute、day
p_pstn（号码保护）：comm
p_smh（智能媒资托管）：day
p_coding_devops（CODING DevOps）：comm、day
p_dsa（全球IP应用加速）：minute
     */
    public String getDosageType() {
        return this.DosageType;
    }

    /**
     * Set 用量统计类型：用量明细的数据统计汇总周期类型，包括minute-按5分钟汇总、hour-按小时汇总、day-按天汇总、month-按月汇总、comm-其他，默认查询所有类型明细，目前各产品已支持的统计类型如下：
p_ccc（云联络中心）：comm、day
p_rav（实时音视频）：minute、day
p_pstn（号码保护）：comm
p_smh（智能媒资托管）：day
p_coding_devops（CODING DevOps）：comm、day
p_dsa（全球IP应用加速）：minute
     * @param DosageType 用量统计类型：用量明细的数据统计汇总周期类型，包括minute-按5分钟汇总、hour-按小时汇总、day-按天汇总、month-按月汇总、comm-其他，默认查询所有类型明细，目前各产品已支持的统计类型如下：
p_ccc（云联络中心）：comm、day
p_rav（实时音视频）：minute、day
p_pstn（号码保护）：comm
p_smh（智能媒资托管）：day
p_coding_devops（CODING DevOps）：comm、day
p_dsa（全球IP应用加速）：minute
     */
    public void setDosageType(String DosageType) {
        this.DosageType = DosageType;
    }

    public DescribeDosageDetailListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDosageDetailListRequest(DescribeDosageDetailListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DosageType != null) {
            this.DosageType = new String(source.DosageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DosageType", this.DosageType);

    }
}

