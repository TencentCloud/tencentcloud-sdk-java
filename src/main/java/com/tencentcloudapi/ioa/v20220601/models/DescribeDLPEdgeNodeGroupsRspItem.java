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
    * <p>自增id，数据库中唯一</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>节点分组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>节点分组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>包含边缘节点数量</p>
    */
    @SerializedName("EdgeCount")
    @Expose
    private Long EdgeCount;

    /**
    * <p>分组中英文</p>
    */
    @SerializedName("GroupNameI18n")
    @Expose
    private I18nString [] GroupNameI18n;

    /**
     * Get <p>自增id，数据库中唯一</p> 
     * @return Id <p>自增id，数据库中唯一</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>自增id，数据库中唯一</p>
     * @param Id <p>自增id，数据库中唯一</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>节点分组名称</p> 
     * @return GroupName <p>节点分组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>节点分组名称</p>
     * @param GroupName <p>节点分组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>节点分组id</p> 
     * @return GroupId <p>节点分组id</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>节点分组id</p>
     * @param GroupId <p>节点分组id</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>包含边缘节点数量</p> 
     * @return EdgeCount <p>包含边缘节点数量</p>
     */
    public Long getEdgeCount() {
        return this.EdgeCount;
    }

    /**
     * Set <p>包含边缘节点数量</p>
     * @param EdgeCount <p>包含边缘节点数量</p>
     */
    public void setEdgeCount(Long EdgeCount) {
        this.EdgeCount = EdgeCount;
    }

    /**
     * Get <p>分组中英文</p> 
     * @return GroupNameI18n <p>分组中英文</p>
     */
    public I18nString [] getGroupNameI18n() {
        return this.GroupNameI18n;
    }

    /**
     * Set <p>分组中英文</p>
     * @param GroupNameI18n <p>分组中英文</p>
     */
    public void setGroupNameI18n(I18nString [] GroupNameI18n) {
        this.GroupNameI18n = GroupNameI18n;
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
        if (source.GroupNameI18n != null) {
            this.GroupNameI18n = new I18nString[source.GroupNameI18n.length];
            for (int i = 0; i < source.GroupNameI18n.length; i++) {
                this.GroupNameI18n[i] = new I18nString(source.GroupNameI18n[i]);
            }
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
        this.setParamArrayObj(map, prefix + "GroupNameI18n.", this.GroupNameI18n);

    }
}

