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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePvListRequest extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>查询结束时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>查询开始时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>对PV指标的查询维度。获取day：d，   获取min则不填。</p>
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
     * Get <p>ID</p> 
     * @return ProjectId <p>ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>ID</p>
     * @param ProjectId <p>ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>查询结束时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p> 
     * @return EndTime <p>查询结束时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
     * @param EndTime <p>查询结束时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>查询开始时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p> 
     * @return StartTime <p>查询开始时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
     * @param StartTime <p>查询开始时间（必填）。</p><p>参数格式：日维度继续支持 YYYYMMDD，也支持带时区的 RFC3339。</p><p>入参限制：仅 Dimension=d 支持 RFC3339，须等于北京时间 00:00:00。</p><p>等价日期的查询结果和返回字段一致。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>对PV指标的查询维度。获取day：d，   获取min则不填。</p> 
     * @return Dimension <p>对PV指标的查询维度。获取day：d，   获取min则不填。</p>
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set <p>对PV指标的查询维度。获取day：d，   获取min则不填。</p>
     * @param Dimension <p>对PV指标的查询维度。获取day：d，   获取min则不填。</p>
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    public DescribePvListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePvListRequest(DescribePvListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);

    }
}

