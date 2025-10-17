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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLPEdgeNodeGroupsRspItem extends AbstractModel {

    /**
    * 自增id，数据库中唯一
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 节点分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 节点分组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 包含边缘节点数量
    */
    @SerializedName("EdgeCount")
    @Expose
    private Long EdgeCount;

    /**
     * Get 自增id，数据库中唯一 
     * @return Id 自增id，数据库中唯一
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自增id，数据库中唯一
     * @param Id 自增id，数据库中唯一
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 节点分组名称 
     * @return GroupName 节点分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 节点分组名称
     * @param GroupName 节点分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 节点分组id 
     * @return GroupId 节点分组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 节点分组id
     * @param GroupId 节点分组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 包含边缘节点数量 
     * @return EdgeCount 包含边缘节点数量
     */
    public Long getEdgeCount() {
        return this.EdgeCount;
    }

    /**
     * Set 包含边缘节点数量
     * @param EdgeCount 包含边缘节点数量
     */
    public void setEdgeCount(Long EdgeCount) {
        this.EdgeCount = EdgeCount;
    }

    public DescribeDLPEdgeNodeGroupsRspItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLPEdgeNodeGroupsRspItem(DescribeDLPEdgeNodeGroupsRspItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EdgeCount != null) {
            this.EdgeCount = new Long(source.EdgeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EdgeCount", this.EdgeCount);

    }
}

