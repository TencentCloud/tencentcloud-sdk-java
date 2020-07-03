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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPerformanceRequest extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始日期，格式yyyy-mm-dd
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期，格式yyyy-mm-dd
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 拉取的指标名，支持的值为：long_query,select_total,update_total,insert_total,delete_total,mem_hit_rate,disk_iops,conn_active,is_master_switched,slave_delay
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始日期，格式yyyy-mm-dd 
     * @return StartTime 开始日期，格式yyyy-mm-dd
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始日期，格式yyyy-mm-dd
     * @param StartTime 开始日期，格式yyyy-mm-dd
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期，格式yyyy-mm-dd 
     * @return EndTime 结束日期，格式yyyy-mm-dd
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期，格式yyyy-mm-dd
     * @param EndTime 结束日期，格式yyyy-mm-dd
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 拉取的指标名，支持的值为：long_query,select_total,update_total,insert_total,delete_total,mem_hit_rate,disk_iops,conn_active,is_master_switched,slave_delay 
     * @return MetricName 拉取的指标名，支持的值为：long_query,select_total,update_total,insert_total,delete_total,mem_hit_rate,disk_iops,conn_active,is_master_switched,slave_delay
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 拉取的指标名，支持的值为：long_query,select_total,update_total,insert_total,delete_total,mem_hit_rate,disk_iops,conn_active,is_master_switched,slave_delay
     * @param MetricName 拉取的指标名，支持的值为：long_query,select_total,update_total,insert_total,delete_total,mem_hit_rate,disk_iops,conn_active,is_master_switched,slave_delay
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);

    }
}

