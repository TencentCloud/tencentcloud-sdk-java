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

public class DescribeDorisMetricFilesRequest extends AbstractModel {

    /**
    * 接口类型
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 展示监控指标入参
    */
    @SerializedName("DescribeMetricsFileReq")
    @Expose
    private DescribeMetricsFileReq DescribeMetricsFileReq;

    /**
    * 点关注功能入参
    */
    @SerializedName("ModifyMetricFileReq")
    @Expose
    private ModifyMetricFileStruct ModifyMetricFileReq;

    /**
    * 监控指标关注功能入参
    */
    @SerializedName("ModifyAttentionMetricFileReq")
    @Expose
    private ModifyMetricFileStructNew ModifyAttentionMetricFileReq;

    /**
     * Get 接口类型 
     * @return ApiType 接口类型
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set 接口类型
     * @param ApiType 接口类型
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 展示监控指标入参 
     * @return DescribeMetricsFileReq 展示监控指标入参
     */
    public DescribeMetricsFileReq getDescribeMetricsFileReq() {
        return this.DescribeMetricsFileReq;
    }

    /**
     * Set 展示监控指标入参
     * @param DescribeMetricsFileReq 展示监控指标入参
     */
    public void setDescribeMetricsFileReq(DescribeMetricsFileReq DescribeMetricsFileReq) {
        this.DescribeMetricsFileReq = DescribeMetricsFileReq;
    }

    /**
     * Get 点关注功能入参 
     * @return ModifyMetricFileReq 点关注功能入参
     */
    public ModifyMetricFileStruct getModifyMetricFileReq() {
        return this.ModifyMetricFileReq;
    }

    /**
     * Set 点关注功能入参
     * @param ModifyMetricFileReq 点关注功能入参
     */
    public void setModifyMetricFileReq(ModifyMetricFileStruct ModifyMetricFileReq) {
        this.ModifyMetricFileReq = ModifyMetricFileReq;
    }

    /**
     * Get 监控指标关注功能入参 
     * @return ModifyAttentionMetricFileReq 监控指标关注功能入参
     */
    public ModifyMetricFileStructNew getModifyAttentionMetricFileReq() {
        return this.ModifyAttentionMetricFileReq;
    }

    /**
     * Set 监控指标关注功能入参
     * @param ModifyAttentionMetricFileReq 监控指标关注功能入参
     */
    public void setModifyAttentionMetricFileReq(ModifyMetricFileStructNew ModifyAttentionMetricFileReq) {
        this.ModifyAttentionMetricFileReq = ModifyAttentionMetricFileReq;
    }

    public DescribeDorisMetricFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDorisMetricFilesRequest(DescribeDorisMetricFilesRequest source) {
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DescribeMetricsFileReq != null) {
            this.DescribeMetricsFileReq = new DescribeMetricsFileReq(source.DescribeMetricsFileReq);
        }
        if (source.ModifyMetricFileReq != null) {
            this.ModifyMetricFileReq = new ModifyMetricFileStruct(source.ModifyMetricFileReq);
        }
        if (source.ModifyAttentionMetricFileReq != null) {
            this.ModifyAttentionMetricFileReq = new ModifyMetricFileStructNew(source.ModifyAttentionMetricFileReq);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "DescribeMetricsFileReq.", this.DescribeMetricsFileReq);
        this.setParamObj(map, prefix + "ModifyMetricFileReq.", this.ModifyMetricFileReq);
        this.setParamObj(map, prefix + "ModifyAttentionMetricFileReq.", this.ModifyAttentionMetricFileReq);

    }
}

