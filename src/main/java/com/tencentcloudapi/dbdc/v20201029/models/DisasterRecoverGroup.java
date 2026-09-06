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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisasterRecoverGroup extends AbstractModel {

    /**
    * <p>置放群组ID</p>
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * <p>置放群组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>置放群组状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Available： 正常可使用</li><li>CreateFailed： 创建失败</li><li>Deleting： 删除中</li><li>Modifying： 变更中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>置放群组内最大容纳节点数</p>
    */
    @SerializedName("NodeQuotaTotal")
    @Expose
    private Long NodeQuotaTotal;

    /**
    * <p>置放群组内当前节点数</p>
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * <p>亲和度</p><p>取值范围：[1, 10]</p>
    */
    @SerializedName("Affinity")
    @Expose
    private Long Affinity;

    /**
    * <p>置放群组策略</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul>
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>置放群组内 DB Custom 节点数量</p>
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
     * Get <p>置放群组ID</p> 
     * @return DisasterRecoverGroupId <p>置放群组ID</p>
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set <p>置放群组ID</p>
     * @param DisasterRecoverGroupId <p>置放群组ID</p>
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get <p>置放群组名称</p> 
     * @return Name <p>置放群组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>置放群组名称</p>
     * @param Name <p>置放群组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul> 
     * @return Type <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul>
     * @param Type <p>置放群组类型</p><p>枚举值：</p><ul><li>HOST： 物理机</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>置放群组状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Available： 正常可使用</li><li>CreateFailed： 创建失败</li><li>Deleting： 删除中</li><li>Modifying： 变更中</li></ul> 
     * @return Status <p>置放群组状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Available： 正常可使用</li><li>CreateFailed： 创建失败</li><li>Deleting： 删除中</li><li>Modifying： 变更中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>置放群组状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Available： 正常可使用</li><li>CreateFailed： 创建失败</li><li>Deleting： 删除中</li><li>Modifying： 变更中</li></ul>
     * @param Status <p>置放群组状态</p><p>枚举值：</p><ul><li>Creating： 创建中</li><li>Available： 正常可使用</li><li>CreateFailed： 创建失败</li><li>Deleting： 删除中</li><li>Modifying： 变更中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>置放群组内最大容纳节点数</p> 
     * @return NodeQuotaTotal <p>置放群组内最大容纳节点数</p>
     */
    public Long getNodeQuotaTotal() {
        return this.NodeQuotaTotal;
    }

    /**
     * Set <p>置放群组内最大容纳节点数</p>
     * @param NodeQuotaTotal <p>置放群组内最大容纳节点数</p>
     */
    public void setNodeQuotaTotal(Long NodeQuotaTotal) {
        this.NodeQuotaTotal = NodeQuotaTotal;
    }

    /**
     * Get <p>置放群组内当前节点数</p> 
     * @return CurrentNum <p>置放群组内当前节点数</p>
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set <p>置放群组内当前节点数</p>
     * @param CurrentNum <p>置放群组内当前节点数</p>
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get <p>亲和度</p><p>取值范围：[1, 10]</p> 
     * @return Affinity <p>亲和度</p><p>取值范围：[1, 10]</p>
     */
    public Long getAffinity() {
        return this.Affinity;
    }

    /**
     * Set <p>亲和度</p><p>取值范围：[1, 10]</p>
     * @param Affinity <p>亲和度</p><p>取值范围：[1, 10]</p>
     */
    public void setAffinity(Long Affinity) {
        this.Affinity = Affinity;
    }

    /**
     * Get <p>置放群组策略</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul> 
     * @return Strategy <p>置放群组策略</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul>
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set <p>置放群组策略</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul>
     * @param Strategy <p>置放群组策略</p><p>枚举值：</p><ul><li>SPREAD： 分散置放群组</li></ul>
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>置放群组内 DB Custom 节点数量</p> 
     * @return NodeIds <p>置放群组内 DB Custom 节点数量</p>
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set <p>置放群组内 DB Custom 节点数量</p>
     * @param NodeIds <p>置放群组内 DB Custom 节点数量</p>
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    public DisasterRecoverGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisasterRecoverGroup(DisasterRecoverGroup source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NodeQuotaTotal != null) {
            this.NodeQuotaTotal = new Long(source.NodeQuotaTotal);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.Affinity != null) {
            this.Affinity = new Long(source.Affinity);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeQuotaTotal", this.NodeQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "Affinity", this.Affinity);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);

    }
}

