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

public class ListClusterInspectionResultsRequest extends AbstractModel{

    /**
    * 目标集群列表，为空查询用户所有集群

    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 隐藏的字段信息，为了减少无效的字段返回，隐藏字段不会在返回值中返回。可选值：results

    */
    @SerializedName("Hide")
    @Expose
    private String [] Hide;

    /**
    * 指定查询结果的报告名称，默认查询最新的每个集群只查询最新的一条
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 目标集群列表，为空查询用户所有集群
 
     * @return ClusterIds 目标集群列表，为空查询用户所有集群

     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 目标集群列表，为空查询用户所有集群

     * @param ClusterIds 目标集群列表，为空查询用户所有集群

     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 隐藏的字段信息，为了减少无效的字段返回，隐藏字段不会在返回值中返回。可选值：results
 
     * @return Hide 隐藏的字段信息，为了减少无效的字段返回，隐藏字段不会在返回值中返回。可选值：results

     */
    public String [] getHide() {
        return this.Hide;
    }

    /**
     * Set 隐藏的字段信息，为了减少无效的字段返回，隐藏字段不会在返回值中返回。可选值：results

     * @param Hide 隐藏的字段信息，为了减少无效的字段返回，隐藏字段不会在返回值中返回。可选值：results

     */
    public void setHide(String [] Hide) {
        this.Hide = Hide;
    }

    /**
     * Get 指定查询结果的报告名称，默认查询最新的每个集群只查询最新的一条 
     * @return Name 指定查询结果的报告名称，默认查询最新的每个集群只查询最新的一条
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指定查询结果的报告名称，默认查询最新的每个集群只查询最新的一条
     * @param Name 指定查询结果的报告名称，默认查询最新的每个集群只查询最新的一条
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ListClusterInspectionResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListClusterInspectionResultsRequest(ListClusterInspectionResultsRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.Hide != null) {
            this.Hide = new String[source.Hide.length];
            for (int i = 0; i < source.Hide.length; i++) {
                this.Hide[i] = new String(source.Hide[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "Hide.", this.Hide);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

