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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterLevelChangeRecordsRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 开始时间
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 结束时间
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条数，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 开始时间 
     * @return StartAt 开始时间
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 开始时间
     * @param StartAt 开始时间
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 结束时间 
     * @return EndAt 结束时间
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 结束时间
     * @param EndAt 结束时间
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大输出条数，默认20 
     * @return Limit 最大输出条数，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条数，默认20
     * @param Limit 最大输出条数，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeClusterLevelChangeRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterLevelChangeRecordsRequest(DescribeClusterLevelChangeRecordsRequest source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

