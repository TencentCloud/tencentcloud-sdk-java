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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrossBackupStatisticalRequest extends AbstractModel {

    /**
    * 分页,页数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页，页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 实例ID列表
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 实例名称列表
    */
    @SerializedName("InstanceNameSet")
    @Expose
    private String [] InstanceNameSet;

    /**
    * 跨地域备份状态，enable-开启，disable-关闭
    */
    @SerializedName("CrossBackupStatus")
    @Expose
    private String CrossBackupStatus;

    /**
    * 跨地域备份目标地域
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * 排序字段，默认default-按照备份空间降序排序，data-按照数据备份排序，log-按照日志备份
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序规则（desc-降序，asc-升序），默认desc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 分页,页数 
     * @return Offset 分页,页数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页,页数
     * @param Offset 分页,页数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页，页大小 
     * @return Limit 分页，页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，页大小
     * @param Limit 分页，页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 实例ID列表 
     * @return InstanceIdSet 实例ID列表
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 实例ID列表
     * @param InstanceIdSet 实例ID列表
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 实例名称列表 
     * @return InstanceNameSet 实例名称列表
     */
    public String [] getInstanceNameSet() {
        return this.InstanceNameSet;
    }

    /**
     * Set 实例名称列表
     * @param InstanceNameSet 实例名称列表
     */
    public void setInstanceNameSet(String [] InstanceNameSet) {
        this.InstanceNameSet = InstanceNameSet;
    }

    /**
     * Get 跨地域备份状态，enable-开启，disable-关闭 
     * @return CrossBackupStatus 跨地域备份状态，enable-开启，disable-关闭
     */
    public String getCrossBackupStatus() {
        return this.CrossBackupStatus;
    }

    /**
     * Set 跨地域备份状态，enable-开启，disable-关闭
     * @param CrossBackupStatus 跨地域备份状态，enable-开启，disable-关闭
     */
    public void setCrossBackupStatus(String CrossBackupStatus) {
        this.CrossBackupStatus = CrossBackupStatus;
    }

    /**
     * Get 跨地域备份目标地域 
     * @return CrossRegion 跨地域备份目标地域
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set 跨地域备份目标地域
     * @param CrossRegion 跨地域备份目标地域
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get 排序字段，默认default-按照备份空间降序排序，data-按照数据备份排序，log-按照日志备份 
     * @return OrderBy 排序字段，默认default-按照备份空间降序排序，data-按照数据备份排序，log-按照日志备份
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，默认default-按照备份空间降序排序，data-按照数据备份排序，log-按照日志备份
     * @param OrderBy 排序字段，默认default-按照备份空间降序排序，data-按照数据备份排序，log-按照日志备份
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序规则（desc-降序，asc-升序），默认desc 
     * @return OrderByType 排序规则（desc-降序，asc-升序），默认desc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序规则（desc-降序，asc-升序），默认desc
     * @param OrderByType 排序规则（desc-降序，asc-升序），默认desc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeCrossBackupStatisticalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBackupStatisticalRequest(DescribeCrossBackupStatisticalRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.InstanceNameSet != null) {
            this.InstanceNameSet = new String[source.InstanceNameSet.length];
            for (int i = 0; i < source.InstanceNameSet.length; i++) {
                this.InstanceNameSet[i] = new String(source.InstanceNameSet[i]);
            }
        }
        if (source.CrossBackupStatus != null) {
            this.CrossBackupStatus = new String(source.CrossBackupStatus);
        }
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamArraySimple(map, prefix + "InstanceNameSet.", this.InstanceNameSet);
        this.setParamSimple(map, prefix + "CrossBackupStatus", this.CrossBackupStatus);
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

