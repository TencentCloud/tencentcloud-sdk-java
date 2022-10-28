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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceNodePropertyRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点ID。
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
    * 节点角色。可选值包括：
<ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
    */
    @SerializedName("Roles")
    @Expose
    private String [] Roles;

    /**
    * 该参数指定节点是否为Hidden节点，默认为false。
    */
    @SerializedName("OnlyHidden")
    @Expose
    private Boolean OnlyHidden;

    /**
    * 该参数指定选举新主节点的优先级。其取值范围为[0,100]，数值越高，优先级越高。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 该参数指定节点投票权。
<ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
    */
    @SerializedName("Votes")
    @Expose
    private Long Votes;

    /**
    * 节点标签。
    */
    @SerializedName("Tags")
    @Expose
    private NodeTag [] Tags;

    /**
     * Get 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。 
     * @return InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点ID。 
     * @return NodeIds 节点ID。
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set 节点ID。
     * @param NodeIds 节点ID。
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    /**
     * Get 节点角色。可选值包括：
<ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul> 
     * @return Roles 节点角色。可选值包括：
<ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
     */
    public String [] getRoles() {
        return this.Roles;
    }

    /**
     * Set 节点角色。可选值包括：
<ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
     * @param Roles 节点角色。可选值包括：
<ul><li>PRIMARY：主节点。</li><li>SECONDARY：从节点。</li><li>READONLY：只读节点。</li><li>ARBITER：仲裁节点。</li></ul>
     */
    public void setRoles(String [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 该参数指定节点是否为Hidden节点，默认为false。 
     * @return OnlyHidden 该参数指定节点是否为Hidden节点，默认为false。
     */
    public Boolean getOnlyHidden() {
        return this.OnlyHidden;
    }

    /**
     * Set 该参数指定节点是否为Hidden节点，默认为false。
     * @param OnlyHidden 该参数指定节点是否为Hidden节点，默认为false。
     */
    public void setOnlyHidden(Boolean OnlyHidden) {
        this.OnlyHidden = OnlyHidden;
    }

    /**
     * Get 该参数指定选举新主节点的优先级。其取值范围为[0,100]，数值越高，优先级越高。 
     * @return Priority 该参数指定选举新主节点的优先级。其取值范围为[0,100]，数值越高，优先级越高。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 该参数指定选举新主节点的优先级。其取值范围为[0,100]，数值越高，优先级越高。
     * @param Priority 该参数指定选举新主节点的优先级。其取值范围为[0,100]，数值越高，优先级越高。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 该参数指定节点投票权。
<ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul> 
     * @return Votes 该参数指定节点投票权。
<ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
     */
    public Long getVotes() {
        return this.Votes;
    }

    /**
     * Set 该参数指定节点投票权。
<ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
     * @param Votes 该参数指定节点投票权。
<ul><li>1：具有投票权。</li><li>0：无投票权。</li></ul>
     */
    public void setVotes(Long Votes) {
        this.Votes = Votes;
    }

    /**
     * Get 节点标签。 
     * @return Tags 节点标签。
     */
    public NodeTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 节点标签。
     * @param Tags 节点标签。
     */
    public void setTags(NodeTag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeDBInstanceNodePropertyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceNodePropertyRequest(DescribeDBInstanceNodePropertyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
        if (source.Roles != null) {
            this.Roles = new String[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new String(source.Roles[i]);
            }
        }
        if (source.OnlyHidden != null) {
            this.OnlyHidden = new Boolean(source.OnlyHidden);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Votes != null) {
            this.Votes = new Long(source.Votes);
        }
        if (source.Tags != null) {
            this.Tags = new NodeTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new NodeTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);
        this.setParamArraySimple(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "OnlyHidden", this.OnlyHidden);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Votes", this.Votes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

