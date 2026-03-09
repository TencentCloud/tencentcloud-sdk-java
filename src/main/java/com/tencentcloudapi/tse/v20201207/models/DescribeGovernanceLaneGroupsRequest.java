/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGovernanceLaneGroupsRequest extends AbstractModel {

    /**
    * 引擎实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 泳道名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 泳道ID
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * 是否展示泳道规则列表
    */
    @SerializedName("Brief")
    @Expose
    private Boolean Brief;

    /**
     * Get 引擎实例ID 
     * @return InstanceId 引擎实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 引擎实例ID
     * @param InstanceId 引擎实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页查询偏移量 
     * @return Offset 分页查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量
     * @param Offset 分页查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页条数 
     * @return Limit 分页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页条数
     * @param Limit 分页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 泳道名称 
     * @return Name 泳道名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 泳道名称
     * @param Name 泳道名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 泳道ID 
     * @return GroupID 泳道ID
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set 泳道ID
     * @param GroupID 泳道ID
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get 是否展示泳道规则列表 
     * @return Brief 是否展示泳道规则列表
     */
    public Boolean getBrief() {
        return this.Brief;
    }

    /**
     * Set 是否展示泳道规则列表
     * @param Brief 是否展示泳道规则列表
     */
    public void setBrief(Boolean Brief) {
        this.Brief = Brief;
    }

    public DescribeGovernanceLaneGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceLaneGroupsRequest(DescribeGovernanceLaneGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.Brief != null) {
            this.Brief = new Boolean(source.Brief);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "Brief", this.Brief);

    }
}

