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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterConfigsHistoryRequest extends AbstractModel {

    /**
    * 集群id名称
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页参数，第一页为0，第二页为10
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，分页步长，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 配置修改历史的时间范围开始
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 配置修改历史的时间范围结束
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 需要查询的配置文件名称数组，如果为空则查询全部历史记录。目前支持的配置文件名称有：
apache_hdfs_broker.conf、be.conf、fe.conf、core-site.xml、hdfs-site.xml、odbcinst.ini
    */
    @SerializedName("ConfigFileNames")
    @Expose
    private String [] ConfigFileNames;

    /**
    * 需要查询的计算组列表
    */
    @SerializedName("ComputeGroupIds")
    @Expose
    private String [] ComputeGroupIds;

    /**
     * Get 集群id名称 
     * @return InstanceId 集群id名称
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id名称
     * @param InstanceId 集群id名称
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页参数，第一页为0，第二页为10 
     * @return Offset 分页参数，第一页为0，第二页为10
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，第一页为0，第二页为10
     * @param Offset 分页参数，第一页为0，第二页为10
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，分页步长，默认为10 
     * @return Limit 分页参数，分页步长，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，分页步长，默认为10
     * @param Limit 分页参数，分页步长，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 配置修改历史的时间范围开始 
     * @return StartTime 配置修改历史的时间范围开始
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 配置修改历史的时间范围开始
     * @param StartTime 配置修改历史的时间范围开始
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 配置修改历史的时间范围结束 
     * @return EndTime 配置修改历史的时间范围结束
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 配置修改历史的时间范围结束
     * @param EndTime 配置修改历史的时间范围结束
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 需要查询的配置文件名称数组，如果为空则查询全部历史记录。目前支持的配置文件名称有：
apache_hdfs_broker.conf、be.conf、fe.conf、core-site.xml、hdfs-site.xml、odbcinst.ini 
     * @return ConfigFileNames 需要查询的配置文件名称数组，如果为空则查询全部历史记录。目前支持的配置文件名称有：
apache_hdfs_broker.conf、be.conf、fe.conf、core-site.xml、hdfs-site.xml、odbcinst.ini
     */
    public String [] getConfigFileNames() {
        return this.ConfigFileNames;
    }

    /**
     * Set 需要查询的配置文件名称数组，如果为空则查询全部历史记录。目前支持的配置文件名称有：
apache_hdfs_broker.conf、be.conf、fe.conf、core-site.xml、hdfs-site.xml、odbcinst.ini
     * @param ConfigFileNames 需要查询的配置文件名称数组，如果为空则查询全部历史记录。目前支持的配置文件名称有：
apache_hdfs_broker.conf、be.conf、fe.conf、core-site.xml、hdfs-site.xml、odbcinst.ini
     */
    public void setConfigFileNames(String [] ConfigFileNames) {
        this.ConfigFileNames = ConfigFileNames;
    }

    /**
     * Get 需要查询的计算组列表 
     * @return ComputeGroupIds 需要查询的计算组列表
     */
    public String [] getComputeGroupIds() {
        return this.ComputeGroupIds;
    }

    /**
     * Set 需要查询的计算组列表
     * @param ComputeGroupIds 需要查询的计算组列表
     */
    public void setComputeGroupIds(String [] ComputeGroupIds) {
        this.ComputeGroupIds = ComputeGroupIds;
    }

    public DescribeClusterConfigsHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterConfigsHistoryRequest(DescribeClusterConfigsHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ConfigFileNames != null) {
            this.ConfigFileNames = new String[source.ConfigFileNames.length];
            for (int i = 0; i < source.ConfigFileNames.length; i++) {
                this.ConfigFileNames[i] = new String(source.ConfigFileNames[i]);
            }
        }
        if (source.ComputeGroupIds != null) {
            this.ComputeGroupIds = new String[source.ComputeGroupIds.length];
            for (int i = 0; i < source.ComputeGroupIds.length; i++) {
                this.ComputeGroupIds[i] = new String(source.ComputeGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "ConfigFileNames.", this.ConfigFileNames);
        this.setParamArraySimple(map, prefix + "ComputeGroupIds.", this.ComputeGroupIds);

    }
}

