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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfoResult  extends AbstractModel{

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCnt")
    @Expose
    private Integer TotalCnt;

    /**
    * 集群信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterList")
    @Expose
    private ClusterInstanceInfo [] ClusterList;

    /**
     * 获取数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return TotalCnt 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * 设置数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCnt 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCnt(Integer TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * 获取集群信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterList 集群信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClusterInstanceInfo [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * 设置集群信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterList 集群信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterList(ClusterInstanceInfo [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);

    }
}

