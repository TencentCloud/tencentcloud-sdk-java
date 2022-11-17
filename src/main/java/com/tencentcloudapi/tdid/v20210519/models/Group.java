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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Group extends AbstractModel{

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 所属机构节点数量
    */
    @SerializedName("NodeCountOfAgency")
    @Expose
    private Long NodeCountOfAgency;

    /**
    * 群组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参与角色，盟主或非盟主
    */
    @SerializedName("RoleType")
    @Expose
    private Long RoleType;

    /**
    * 链id
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 所属机构节点数量 
     * @return NodeCountOfAgency 所属机构节点数量
     */
    public Long getNodeCountOfAgency() {
        return this.NodeCountOfAgency;
    }

    /**
     * Set 所属机构节点数量
     * @param NodeCountOfAgency 所属机构节点数量
     */
    public void setNodeCountOfAgency(Long NodeCountOfAgency) {
        this.NodeCountOfAgency = NodeCountOfAgency;
    }

    /**
     * Get 群组描述 
     * @return Description 群组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 群组描述
     * @param Description 群组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 参与角色，盟主或非盟主 
     * @return RoleType 参与角色，盟主或非盟主
     */
    public Long getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 参与角色，盟主或非盟主
     * @param RoleType 参与角色，盟主或非盟主
     */
    public void setRoleType(Long RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 链id 
     * @return ChainId 链id
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set 链id
     * @param ChainId 链id
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    public Group() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Group(Group source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NodeCountOfAgency != null) {
            this.NodeCountOfAgency = new Long(source.NodeCountOfAgency);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleType != null) {
            this.RoleType = new Long(source.RoleType);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "NodeCountOfAgency", this.NodeCountOfAgency);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);

    }
}

