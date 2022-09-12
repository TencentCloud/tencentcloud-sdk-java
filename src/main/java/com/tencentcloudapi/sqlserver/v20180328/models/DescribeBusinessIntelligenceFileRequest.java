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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBusinessIntelligenceFileRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 迁移任务状态集合,1-初始化待部署 2-部署中 3-部署成功 4-部署失败
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * 文件类型 FLAT-平面文件，SSIS商业智能服务项目文件
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 分页，页大小，范围1-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页,页数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，可选值file_name,create_time,start_time
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，desc,asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 迁移任务状态集合,1-初始化待部署 2-部署中 3-部署成功 4-部署失败 
     * @return StatusSet 迁移任务状态集合,1-初始化待部署 2-部署中 3-部署成功 4-部署失败
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set 迁移任务状态集合,1-初始化待部署 2-部署中 3-部署成功 4-部署失败
     * @param StatusSet 迁移任务状态集合,1-初始化待部署 2-部署中 3-部署成功 4-部署失败
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get 文件类型 FLAT-平面文件，SSIS商业智能服务项目文件 
     * @return FileType 文件类型 FLAT-平面文件，SSIS商业智能服务项目文件
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型 FLAT-平面文件，SSIS商业智能服务项目文件
     * @param FileType 文件类型 FLAT-平面文件，SSIS商业智能服务项目文件
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 分页，页大小，范围1-100 
     * @return Limit 分页，页大小，范围1-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，页大小，范围1-100
     * @param Limit 分页，页大小，范围1-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页,页数，默认0 
     * @return Offset 分页,页数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页,页数，默认0
     * @param Offset 分页,页数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，可选值file_name,create_time,start_time 
     * @return OrderBy 排序字段，可选值file_name,create_time,start_time
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可选值file_name,create_time,start_time
     * @param OrderBy 排序字段，可选值file_name,create_time,start_time
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，desc,asc 
     * @return OrderByType 排序方式，desc,asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，desc,asc
     * @param OrderByType 排序方式，desc,asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBusinessIntelligenceFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBusinessIntelligenceFileRequest(DescribeBusinessIntelligenceFileRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.StatusSet != null) {
            this.StatusSet = new Long[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new Long(source.StatusSet[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

