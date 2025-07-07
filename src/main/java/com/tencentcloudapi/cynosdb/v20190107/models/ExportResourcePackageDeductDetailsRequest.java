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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportResourcePackageDeductDetailsRequest extends AbstractModel {

    /**
    * 需要导出的资源包ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 使用资源包容量的cynos集群ID
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 排序字段，目前支持：createTime（资源包被抵扣时间），successDeductSpec（资源包抵扣量）
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型，支持ASC、DESC、asc、desc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 单次最大导出数据行数，目前最大支持2000行
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 偏移量页数
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 导出数据格式，目前仅支持csv格式，留作扩展
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get 需要导出的资源包ID 
     * @return PackageId 需要导出的资源包ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 需要导出的资源包ID
     * @param PackageId 需要导出的资源包ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 使用资源包容量的cynos集群ID 
     * @return ClusterIds 使用资源包容量的cynos集群ID
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 使用资源包容量的cynos集群ID
     * @param ClusterIds 使用资源包容量的cynos集群ID
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 排序字段，目前支持：createTime（资源包被抵扣时间），successDeductSpec（资源包抵扣量） 
     * @return OrderBy 排序字段，目前支持：createTime（资源包被抵扣时间），successDeductSpec（资源包抵扣量）
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，目前支持：createTime（资源包被抵扣时间），successDeductSpec（资源包抵扣量）
     * @param OrderBy 排序字段，目前支持：createTime（资源包被抵扣时间），successDeductSpec（资源包抵扣量）
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型，支持ASC、DESC、asc、desc 
     * @return OrderByType 排序类型，支持ASC、DESC、asc、desc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型，支持ASC、DESC、asc、desc
     * @param OrderByType 排序类型，支持ASC、DESC、asc、desc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 单次最大导出数据行数，目前最大支持2000行 
     * @return Limit 单次最大导出数据行数，目前最大支持2000行
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次最大导出数据行数，目前最大支持2000行
     * @param Limit 单次最大导出数据行数，目前最大支持2000行
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量页数 
     * @return Offset 偏移量页数
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量页数
     * @param Offset 偏移量页数
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 导出数据格式，目前仅支持csv格式，留作扩展 
     * @return FileType 导出数据格式，目前仅支持csv格式，留作扩展
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 导出数据格式，目前仅支持csv格式，留作扩展
     * @param FileType 导出数据格式，目前仅支持csv格式，留作扩展
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public ExportResourcePackageDeductDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportResourcePackageDeductDetailsRequest(ExportResourcePackageDeductDetailsRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

