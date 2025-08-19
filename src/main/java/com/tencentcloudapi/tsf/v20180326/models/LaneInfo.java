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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaneInfo extends AbstractModel {

    /**
    * 泳道ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
    * 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneName")
    @Expose
    private String LaneName;

    /**
    * 泳道备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 泳道部署组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneGroupList")
    @Expose
    private LaneGroup [] LaneGroupList;

    /**
    * 是否入口应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Entrance")
    @Expose
    private Boolean Entrance;

    /**
    * 泳道已经关联部署组的命名空间列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceIdList")
    @Expose
    private String [] NamespaceIdList;

    /**
    * 泳道部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaneGroupId")
    @Expose
    private String LaneGroupId;

    /**
    * 是否禁用删除。
true：禁用
false：取消禁用
    */
    @SerializedName("DeleteDisabled")
    @Expose
    private Boolean DeleteDisabled;

    /**
    * 禁用原因
    */
    @SerializedName("DeleteDisabledReason")
    @Expose
    private String DeleteDisabledReason;

    /**
     * Get 泳道ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneId 泳道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set 泳道ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneId 泳道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    /**
     * Get 泳道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneName 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneName() {
        return this.LaneName;
    }

    /**
     * Set 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneName 泳道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneName(String LaneName) {
        this.LaneName = LaneName;
    }

    /**
     * Get 泳道备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 泳道备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 泳道备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 泳道备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 泳道部署组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneGroupList 泳道部署组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LaneGroup [] getLaneGroupList() {
        return this.LaneGroupList;
    }

    /**
     * Set 泳道部署组
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneGroupList 泳道部署组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneGroupList(LaneGroup [] LaneGroupList) {
        this.LaneGroupList = LaneGroupList;
    }

    /**
     * Get 是否入口应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Entrance 是否入口应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEntrance() {
        return this.Entrance;
    }

    /**
     * Set 是否入口应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Entrance 是否入口应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntrance(Boolean Entrance) {
        this.Entrance = Entrance;
    }

    /**
     * Get 泳道已经关联部署组的命名空间列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceIdList 泳道已经关联部署组的命名空间列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNamespaceIdList() {
        return this.NamespaceIdList;
    }

    /**
     * Set 泳道已经关联部署组的命名空间列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceIdList 泳道已经关联部署组的命名空间列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceIdList(String [] NamespaceIdList) {
        this.NamespaceIdList = NamespaceIdList;
    }

    /**
     * Get 泳道部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaneGroupId 泳道部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaneGroupId() {
        return this.LaneGroupId;
    }

    /**
     * Set 泳道部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaneGroupId 泳道部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaneGroupId(String LaneGroupId) {
        this.LaneGroupId = LaneGroupId;
    }

    /**
     * Get 是否禁用删除。
true：禁用
false：取消禁用 
     * @return DeleteDisabled 是否禁用删除。
true：禁用
false：取消禁用
     */
    public Boolean getDeleteDisabled() {
        return this.DeleteDisabled;
    }

    /**
     * Set 是否禁用删除。
true：禁用
false：取消禁用
     * @param DeleteDisabled 是否禁用删除。
true：禁用
false：取消禁用
     */
    public void setDeleteDisabled(Boolean DeleteDisabled) {
        this.DeleteDisabled = DeleteDisabled;
    }

    /**
     * Get 禁用原因 
     * @return DeleteDisabledReason 禁用原因
     */
    public String getDeleteDisabledReason() {
        return this.DeleteDisabledReason;
    }

    /**
     * Set 禁用原因
     * @param DeleteDisabledReason 禁用原因
     */
    public void setDeleteDisabledReason(String DeleteDisabledReason) {
        this.DeleteDisabledReason = DeleteDisabledReason;
    }

    public LaneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaneInfo(LaneInfo source) {
        if (source.LaneId != null) {
            this.LaneId = new String(source.LaneId);
        }
        if (source.LaneName != null) {
            this.LaneName = new String(source.LaneName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LaneGroupList != null) {
            this.LaneGroupList = new LaneGroup[source.LaneGroupList.length];
            for (int i = 0; i < source.LaneGroupList.length; i++) {
                this.LaneGroupList[i] = new LaneGroup(source.LaneGroupList[i]);
            }
        }
        if (source.Entrance != null) {
            this.Entrance = new Boolean(source.Entrance);
        }
        if (source.NamespaceIdList != null) {
            this.NamespaceIdList = new String[source.NamespaceIdList.length];
            for (int i = 0; i < source.NamespaceIdList.length; i++) {
                this.NamespaceIdList[i] = new String(source.NamespaceIdList[i]);
            }
        }
        if (source.LaneGroupId != null) {
            this.LaneGroupId = new String(source.LaneGroupId);
        }
        if (source.DeleteDisabled != null) {
            this.DeleteDisabled = new Boolean(source.DeleteDisabled);
        }
        if (source.DeleteDisabledReason != null) {
            this.DeleteDisabledReason = new String(source.DeleteDisabledReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);
        this.setParamSimple(map, prefix + "LaneName", this.LaneName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "LaneGroupList.", this.LaneGroupList);
        this.setParamSimple(map, prefix + "Entrance", this.Entrance);
        this.setParamArraySimple(map, prefix + "NamespaceIdList.", this.NamespaceIdList);
        this.setParamSimple(map, prefix + "LaneGroupId", this.LaneGroupId);
        this.setParamSimple(map, prefix + "DeleteDisabled", this.DeleteDisabled);
        this.setParamSimple(map, prefix + "DeleteDisabledReason", this.DeleteDisabledReason);

    }
}

