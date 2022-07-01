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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostListRequest extends AbstractModel{

    /**
    * 独享集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分配状态过滤，0-可分配，1-禁止分配
    */
    @SerializedName("AssignStatus")
    @Expose
    private Long [] AssignStatus;

    /**
     * Get 独享集群实例Id 
     * @return InstanceId 独享集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享集群实例Id
     * @param InstanceId 独享集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页返回数量 
     * @return Limit 分页返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回数量
     * @param Limit 分页返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分配状态过滤，0-可分配，1-禁止分配 
     * @return AssignStatus 分配状态过滤，0-可分配，1-禁止分配
     */
    public Long [] getAssignStatus() {
        return this.AssignStatus;
    }

    /**
     * Set 分配状态过滤，0-可分配，1-禁止分配
     * @param AssignStatus 分配状态过滤，0-可分配，1-禁止分配
     */
    public void setAssignStatus(Long [] AssignStatus) {
        this.AssignStatus = AssignStatus;
    }

    public DescribeHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostListRequest(DescribeHostListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AssignStatus != null) {
            this.AssignStatus = new Long[source.AssignStatus.length];
            for (int i = 0; i < source.AssignStatus.length; i++) {
                this.AssignStatus[i] = new Long(source.AssignStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "AssignStatus.", this.AssignStatus);

    }
}

