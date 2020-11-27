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

public class CheckInstancesUpgradeAbleRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点列表，空为全部节点
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 升级类型
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点列表，空为全部节点 
     * @return InstanceIds 节点列表，空为全部节点
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 节点列表，空为全部节点
     * @param InstanceIds 节点列表，空为全部节点
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 升级类型 
     * @return UpgradeType 升级类型
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 升级类型
     * @param UpgradeType 升级类型
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤 
     * @return Filter 过滤
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤
     * @param Filter 过滤
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);

    }
}

