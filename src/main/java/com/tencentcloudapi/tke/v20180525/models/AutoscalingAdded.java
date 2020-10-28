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

public class AutoscalingAdded extends AbstractModel{

    /**
    * 正在加入中的节点数量
    */
    @SerializedName("Joining")
    @Expose
    private Long Joining;

    /**
    * 初始化中的节点数量
    */
    @SerializedName("Initializing")
    @Expose
    private Long Initializing;

    /**
    * 正常的节点数量
    */
    @SerializedName("Normal")
    @Expose
    private Long Normal;

    /**
    * 节点总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 正在加入中的节点数量 
     * @return Joining 正在加入中的节点数量
     */
    public Long getJoining() {
        return this.Joining;
    }

    /**
     * Set 正在加入中的节点数量
     * @param Joining 正在加入中的节点数量
     */
    public void setJoining(Long Joining) {
        this.Joining = Joining;
    }

    /**
     * Get 初始化中的节点数量 
     * @return Initializing 初始化中的节点数量
     */
    public Long getInitializing() {
        return this.Initializing;
    }

    /**
     * Set 初始化中的节点数量
     * @param Initializing 初始化中的节点数量
     */
    public void setInitializing(Long Initializing) {
        this.Initializing = Initializing;
    }

    /**
     * Get 正常的节点数量 
     * @return Normal 正常的节点数量
     */
    public Long getNormal() {
        return this.Normal;
    }

    /**
     * Set 正常的节点数量
     * @param Normal 正常的节点数量
     */
    public void setNormal(Long Normal) {
        this.Normal = Normal;
    }

    /**
     * Get 节点总数 
     * @return Total 节点总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 节点总数
     * @param Total 节点总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Joining", this.Joining);
        this.setParamSimple(map, prefix + "Initializing", this.Initializing);
        this.setParamSimple(map, prefix + "Normal", this.Normal);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

