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

public class DescribeClusterReleasesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 每页数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * helm Release 安装的namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * helm Release 的名字
    */
    @SerializedName("ReleaseName")
    @Expose
    private String ReleaseName;

    /**
    * helm Chart 的名字
    */
    @SerializedName("ChartName")
    @Expose
    private String ChartName;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 每页数量限制 
     * @return Limit 每页数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量限制
     * @param Limit 每页数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页偏移量 
     * @return Offset 页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移量
     * @param Offset 页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get helm Release 安装的namespace 
     * @return Namespace helm Release 安装的namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set helm Release 安装的namespace
     * @param Namespace helm Release 安装的namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get helm Release 的名字 
     * @return ReleaseName helm Release 的名字
     */
    public String getReleaseName() {
        return this.ReleaseName;
    }

    /**
     * Set helm Release 的名字
     * @param ReleaseName helm Release 的名字
     */
    public void setReleaseName(String ReleaseName) {
        this.ReleaseName = ReleaseName;
    }

    /**
     * Get helm Chart 的名字 
     * @return ChartName helm Chart 的名字
     */
    public String getChartName() {
        return this.ChartName;
    }

    /**
     * Set helm Chart 的名字
     * @param ChartName helm Chart 的名字
     */
    public void setChartName(String ChartName) {
        this.ChartName = ChartName;
    }

    public DescribeClusterReleasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterReleasesRequest(DescribeClusterReleasesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ReleaseName != null) {
            this.ReleaseName = new String(source.ReleaseName);
        }
        if (source.ChartName != null) {
            this.ChartName = new String(source.ChartName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ReleaseName", this.ReleaseName);
        this.setParamSimple(map, prefix + "ChartName", this.ChartName);

    }
}

