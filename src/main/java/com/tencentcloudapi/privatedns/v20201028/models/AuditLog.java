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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLog extends AbstractModel{

    /**
    * 日志类型
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 日志表名
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 日志总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 日志列表
    */
    @SerializedName("DataSet")
    @Expose
    private AuditLogInfo [] DataSet;

    /**
     * Get 日志类型 
     * @return Resource 日志类型
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 日志类型
     * @param Resource 日志类型
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 日志表名 
     * @return Metric 日志表名
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 日志表名
     * @param Metric 日志表名
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 日志总数 
     * @return TotalCount 日志总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 日志总数
     * @param TotalCount 日志总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 日志列表 
     * @return DataSet 日志列表
     */
    public AuditLogInfo [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 日志列表
     * @param DataSet 日志列表
     */
    public void setDataSet(AuditLogInfo [] DataSet) {
        this.DataSet = DataSet;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataSet != null) {
            this.DataSet = new AuditLogInfo[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new AuditLogInfo(source.DataSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);

    }
}

