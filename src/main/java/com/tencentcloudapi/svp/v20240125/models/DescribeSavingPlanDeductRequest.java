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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSavingPlanDeductRequest extends AbstractModel {

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，最大值为200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 节省计划使用开始的查询结束时间
    */
    @SerializedName("StartEndDate")
    @Expose
    private String StartEndDate;

    /**
    * 节省计划使用开始的查询开始时间
    */
    @SerializedName("StartStartDate")
    @Expose
    private String StartStartDate;

    /**
    * 地域编码
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域编码
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 节省计划资源id
    */
    @SerializedName("SpId")
    @Expose
    private String SpId;

    /**
    * 抵扣查询结束时间，格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("DeductEndDate")
    @Expose
    private String DeductEndDate;

    /**
    * 抵扣查询开始时间，格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("DeductStartDate")
    @Expose
    private String DeductStartDate;

    /**
    * 节省计划使用结束的查询结束时间
    */
    @SerializedName("EndEndDate")
    @Expose
    private String EndEndDate;

    /**
    * 节省计划使用结束的查询开始时间
    */
    @SerializedName("EndStartDate")
    @Expose
    private String EndStartDate;

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，最大值为200 
     * @return Limit 每页数量，最大值为200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，最大值为200
     * @param Limit 每页数量，最大值为200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 节省计划使用开始的查询结束时间 
     * @return StartEndDate 节省计划使用开始的查询结束时间
     */
    public String getStartEndDate() {
        return this.StartEndDate;
    }

    /**
     * Set 节省计划使用开始的查询结束时间
     * @param StartEndDate 节省计划使用开始的查询结束时间
     */
    public void setStartEndDate(String StartEndDate) {
        this.StartEndDate = StartEndDate;
    }

    /**
     * Get 节省计划使用开始的查询开始时间 
     * @return StartStartDate 节省计划使用开始的查询开始时间
     */
    public String getStartStartDate() {
        return this.StartStartDate;
    }

    /**
     * Set 节省计划使用开始的查询开始时间
     * @param StartStartDate 节省计划使用开始的查询开始时间
     */
    public void setStartStartDate(String StartStartDate) {
        this.StartStartDate = StartStartDate;
    }

    /**
     * Get 地域编码 
     * @return RegionId 地域编码
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域编码
     * @param RegionId 地域编码
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域编码 
     * @return ZoneId 区域编码
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域编码
     * @param ZoneId 区域编码
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 节省计划资源id 
     * @return SpId 节省计划资源id
     */
    public String getSpId() {
        return this.SpId;
    }

    /**
     * Set 节省计划资源id
     * @param SpId 节省计划资源id
     */
    public void setSpId(String SpId) {
        this.SpId = SpId;
    }

    /**
     * Get 抵扣查询结束时间，格式：yyyy-MM-dd HH:mm:ss 
     * @return DeductEndDate 抵扣查询结束时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public String getDeductEndDate() {
        return this.DeductEndDate;
    }

    /**
     * Set 抵扣查询结束时间，格式：yyyy-MM-dd HH:mm:ss
     * @param DeductEndDate 抵扣查询结束时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public void setDeductEndDate(String DeductEndDate) {
        this.DeductEndDate = DeductEndDate;
    }

    /**
     * Get 抵扣查询开始时间，格式：yyyy-MM-dd HH:mm:ss 
     * @return DeductStartDate 抵扣查询开始时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public String getDeductStartDate() {
        return this.DeductStartDate;
    }

    /**
     * Set 抵扣查询开始时间，格式：yyyy-MM-dd HH:mm:ss
     * @param DeductStartDate 抵扣查询开始时间，格式：yyyy-MM-dd HH:mm:ss
     */
    public void setDeductStartDate(String DeductStartDate) {
        this.DeductStartDate = DeductStartDate;
    }

    /**
     * Get 节省计划使用结束的查询结束时间 
     * @return EndEndDate 节省计划使用结束的查询结束时间
     */
    public String getEndEndDate() {
        return this.EndEndDate;
    }

    /**
     * Set 节省计划使用结束的查询结束时间
     * @param EndEndDate 节省计划使用结束的查询结束时间
     */
    public void setEndEndDate(String EndEndDate) {
        this.EndEndDate = EndEndDate;
    }

    /**
     * Get 节省计划使用结束的查询开始时间 
     * @return EndStartDate 节省计划使用结束的查询开始时间
     */
    public String getEndStartDate() {
        return this.EndStartDate;
    }

    /**
     * Set 节省计划使用结束的查询开始时间
     * @param EndStartDate 节省计划使用结束的查询开始时间
     */
    public void setEndStartDate(String EndStartDate) {
        this.EndStartDate = EndStartDate;
    }

    public DescribeSavingPlanDeductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSavingPlanDeductRequest(DescribeSavingPlanDeductRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartEndDate != null) {
            this.StartEndDate = new String(source.StartEndDate);
        }
        if (source.StartStartDate != null) {
            this.StartStartDate = new String(source.StartStartDate);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.SpId != null) {
            this.SpId = new String(source.SpId);
        }
        if (source.DeductEndDate != null) {
            this.DeductEndDate = new String(source.DeductEndDate);
        }
        if (source.DeductStartDate != null) {
            this.DeductStartDate = new String(source.DeductStartDate);
        }
        if (source.EndEndDate != null) {
            this.EndEndDate = new String(source.EndEndDate);
        }
        if (source.EndStartDate != null) {
            this.EndStartDate = new String(source.EndStartDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartEndDate", this.StartEndDate);
        this.setParamSimple(map, prefix + "StartStartDate", this.StartStartDate);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SpId", this.SpId);
        this.setParamSimple(map, prefix + "DeductEndDate", this.DeductEndDate);
        this.setParamSimple(map, prefix + "DeductStartDate", this.DeductStartDate);
        this.setParamSimple(map, prefix + "EndEndDate", this.EndEndDate);
        this.setParamSimple(map, prefix + "EndStartDate", this.EndStartDate);

    }
}

