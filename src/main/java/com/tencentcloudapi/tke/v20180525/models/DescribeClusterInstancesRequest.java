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

public class DescribeClusterInstancesRequest  extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 最大输出条数，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 需要获取的节点实例Id列表(默认为空，表示拉取集群下所有节点实例)
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * 获取集群ID
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取偏移量,默认0
     * @return Offset 偏移量,默认0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取最大输出条数，默认20
     * @return Limit 最大输出条数，默认20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置最大输出条数，默认20
     * @param Limit 最大输出条数，默认20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取需要获取的节点实例Id列表(默认为空，表示拉取集群下所有节点实例)
     * @return InstanceIds 需要获取的节点实例Id列表(默认为空，表示拉取集群下所有节点实例)
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置需要获取的节点实例Id列表(默认为空，表示拉取集群下所有节点实例)
     * @param InstanceIds 需要获取的节点实例Id列表(默认为空，表示拉取集群下所有节点实例)
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

