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

public class DescribeClusterInspectionResultsOverviewRequest extends AbstractModel{

    /**
    * Array of String	目标集群列表，为空查询用户所有集群

    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 聚合字段信息，概览结果按照 GroupBy 信息聚合后返回，可选参数：
catalogue.first：按一级分类聚合
catalogue.second：按二级分类聚合
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
     * Get Array of String	目标集群列表，为空查询用户所有集群
 
     * @return ClusterIds Array of String	目标集群列表，为空查询用户所有集群

     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set Array of String	目标集群列表，为空查询用户所有集群

     * @param ClusterIds Array of String	目标集群列表，为空查询用户所有集群

     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 聚合字段信息，概览结果按照 GroupBy 信息聚合后返回，可选参数：
catalogue.first：按一级分类聚合
catalogue.second：按二级分类聚合 
     * @return GroupBy 聚合字段信息，概览结果按照 GroupBy 信息聚合后返回，可选参数：
catalogue.first：按一级分类聚合
catalogue.second：按二级分类聚合
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合字段信息，概览结果按照 GroupBy 信息聚合后返回，可选参数：
catalogue.first：按一级分类聚合
catalogue.second：按二级分类聚合
     * @param GroupBy 聚合字段信息，概览结果按照 GroupBy 信息聚合后返回，可选参数：
catalogue.first：按一级分类聚合
catalogue.second：按二级分类聚合
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    public DescribeClusterInspectionResultsOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInspectionResultsOverviewRequest(DescribeClusterInspectionResultsOverviewRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);

    }
}

