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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHBaseTableRequestMetricRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Hbase表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Hbase的RegionServer服务
    */
    @SerializedName("RegionServer")
    @Expose
    private String RegionServer;

    /**
    * 获取监控的数据粒度
    */
    @SerializedName("Downsample")
    @Expose
    private String Downsample;

    /**
    * 查询监控数据起始时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询监控数据结束时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Hbase表名 
     * @return TableName Hbase表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Hbase表名
     * @param TableName Hbase表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Hbase的RegionServer服务 
     * @return RegionServer Hbase的RegionServer服务
     */
    public String getRegionServer() {
        return this.RegionServer;
    }

    /**
     * Set Hbase的RegionServer服务
     * @param RegionServer Hbase的RegionServer服务
     */
    public void setRegionServer(String RegionServer) {
        this.RegionServer = RegionServer;
    }

    /**
     * Get 获取监控的数据粒度 
     * @return Downsample 获取监控的数据粒度
     */
    public String getDownsample() {
        return this.Downsample;
    }

    /**
     * Set 获取监控的数据粒度
     * @param Downsample 获取监控的数据粒度
     */
    public void setDownsample(String Downsample) {
        this.Downsample = Downsample;
    }

    /**
     * Get 查询监控数据起始时间戳 
     * @return StartTime 查询监控数据起始时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询监控数据起始时间戳
     * @param StartTime 查询监控数据起始时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询监控数据结束时间戳 
     * @return EndTime 查询监控数据结束时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询监控数据结束时间戳
     * @param EndTime 查询监控数据结束时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeHBaseTableRequestMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHBaseTableRequestMetricRequest(DescribeHBaseTableRequestMetricRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.RegionServer != null) {
            this.RegionServer = new String(source.RegionServer);
        }
        if (source.Downsample != null) {
            this.Downsample = new String(source.Downsample);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "RegionServer", this.RegionServer);
        this.setParamSimple(map, prefix + "Downsample", this.Downsample);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

