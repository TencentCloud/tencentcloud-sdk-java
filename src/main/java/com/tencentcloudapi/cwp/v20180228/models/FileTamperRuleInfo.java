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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileTamperRuleInfo extends AbstractModel {

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则类型 0 ：系统规则  1：用户规则
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * 影响主机数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 状态 0: 启用 1: 已关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则id，系统的规则时为0。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 是否是全局的 0：否 ，1：是
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 子规则写条目数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteRuleCount")
    @Expose
    private Long WriteRuleCount;

    /**
    * 子规则读条目数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadRuleCount")
    @Expose
    private Long ReadRuleCount;

    /**
    * 子规则读写条目数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadWriteRuleCount")
    @Expose
    private Long ReadWriteRuleCount;

    /**
    * 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileAction")
    @Expose
    private String FileAction;

    /**
    * 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddWhiteType")
    @Expose
    private String AddWhiteType;

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则类型 0 ：系统规则  1：用户规则 
     * @return RuleCategory 规则类型 0 ：系统规则  1：用户规则
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set 规则类型 0 ：系统规则  1：用户规则
     * @param RuleCategory 规则类型 0 ：系统规则  1：用户规则
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get 影响主机数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostCount 影响主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 影响主机数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostCount 影响主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 状态 0: 启用 1: 已关闭 
     * @return Status 状态 0: 启用 1: 已关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 启用 1: 已关闭
     * @param Status 状态 0: 启用 1: 已关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则id，系统的规则时为0。 
     * @return Id 规则id，系统的规则时为0。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id，系统的规则时为0。
     * @param Id 规则id，系统的规则时为0。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 是否是全局的 0：否 ，1：是 
     * @return IsGlobal 是否是全局的 0：否 ，1：是
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否是全局的 0：否 ，1：是
     * @param IsGlobal 是否是全局的 0：否 ，1：是
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 风险等级 0：无， 1: 高危， 2:中危， 3: 低危 
     * @return Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     * @param Level 风险等级 0：无， 1: 高危， 2:中危， 3: 低危
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 子规则写条目数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteRuleCount 子规则写条目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWriteRuleCount() {
        return this.WriteRuleCount;
    }

    /**
     * Set 子规则写条目数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteRuleCount 子规则写条目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteRuleCount(Long WriteRuleCount) {
        this.WriteRuleCount = WriteRuleCount;
    }

    /**
     * Get 子规则读条目数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadRuleCount 子规则读条目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadRuleCount() {
        return this.ReadRuleCount;
    }

    /**
     * Set 子规则读条目数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadRuleCount 子规则读条目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadRuleCount(Long ReadRuleCount) {
        this.ReadRuleCount = ReadRuleCount;
    }

    /**
     * Get 子规则读写条目数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadWriteRuleCount 子规则读写条目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadWriteRuleCount() {
        return this.ReadWriteRuleCount;
    }

    /**
     * Set 子规则读写条目数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadWriteRuleCount 子规则读写条目数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadWriteRuleCount(Long ReadWriteRuleCount) {
        this.ReadWriteRuleCount = ReadWriteRuleCount;
    }

    /**
     * Get 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileAction 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileAction() {
        return this.FileAction;
    }

    /**
     * Set 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileAction 监控行为
<li>read 读取文件</li>
<li>write 修改文件</li>
<li>read-write 读取修改文件</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileAction(String FileAction) {
        this.FileAction = FileAction;
    }

    /**
     * Get 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddWhiteType 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddWhiteType() {
        return this.AddWhiteType;
    }

    /**
     * Set 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddWhiteType 加白处理类型
<li>cur 仅对当前加白</li>
<li>all 所有符合条件加白</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddWhiteType(String AddWhiteType) {
        this.AddWhiteType = AddWhiteType;
    }

    public FileTamperRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileTamperRuleInfo(FileTamperRuleInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.WriteRuleCount != null) {
            this.WriteRuleCount = new Long(source.WriteRuleCount);
        }
        if (source.ReadRuleCount != null) {
            this.ReadRuleCount = new Long(source.ReadRuleCount);
        }
        if (source.ReadWriteRuleCount != null) {
            this.ReadWriteRuleCount = new Long(source.ReadWriteRuleCount);
        }
        if (source.FileAction != null) {
            this.FileAction = new String(source.FileAction);
        }
        if (source.AddWhiteType != null) {
            this.AddWhiteType = new String(source.AddWhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "WriteRuleCount", this.WriteRuleCount);
        this.setParamSimple(map, prefix + "ReadRuleCount", this.ReadRuleCount);
        this.setParamSimple(map, prefix + "ReadWriteRuleCount", this.ReadWriteRuleCount);
        this.setParamSimple(map, prefix + "FileAction", this.FileAction);
        this.setParamSimple(map, prefix + "AddWhiteType", this.AddWhiteType);

    }
}

