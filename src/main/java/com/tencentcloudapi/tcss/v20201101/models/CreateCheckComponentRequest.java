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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCheckComponentRequest extends AbstractModel{

    /**
    * 要安装的集群列表信息
    */
    @SerializedName("ClusterInfoList")
    @Expose
    private ClusterCreateComponentItem [] ClusterInfoList;

    /**
     * Get 要安装的集群列表信息 
     * @return ClusterInfoList 要安装的集群列表信息
     */
    public ClusterCreateComponentItem [] getClusterInfoList() {
        return this.ClusterInfoList;
    }

    /**
     * Set 要安装的集群列表信息
     * @param ClusterInfoList 要安装的集群列表信息
     */
    public void setClusterInfoList(ClusterCreateComponentItem [] ClusterInfoList) {
        this.ClusterInfoList = ClusterInfoList;
    }

    public CreateCheckComponentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCheckComponentRequest(CreateCheckComponentRequest source) {
        if (source.ClusterInfoList != null) {
            this.ClusterInfoList = new ClusterCreateComponentItem[source.ClusterInfoList.length];
            for (int i = 0; i < source.ClusterInfoList.length; i++) {
                this.ClusterInfoList[i] = new ClusterCreateComponentItem(source.ClusterInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClusterInfoList.", this.ClusterInfoList);

    }
}

