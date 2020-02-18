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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PsaRegulation extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("PsaId")
    @Expose
    private String PsaId;

    /**
    * 规则别名
    */
    @SerializedName("PsaName")
    @Expose
    private String PsaName;

    /**
    * 关联标签数量
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
    * 关联实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 故障实例数量
    */
    @SerializedName("RepairCount")
    @Expose
    private Long RepairCount;

    /**
    * 故障实例上限
    */
    @SerializedName("RepairLimit")
    @Expose
    private Long RepairLimit;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则备注
    */
    @SerializedName("PsaDescription")
    @Expose
    private String PsaDescription;

    /**
    * 关联标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 关联故障类型id
    */
    @SerializedName("TaskTypeIds")
    @Expose
    private Long [] TaskTypeIds;

    /**
     * Get 规则ID 
     * @return PsaId 规则ID
     */
    public String getPsaId() {
        return this.PsaId;
    }

    /**
     * Set 规则ID
     * @param PsaId 规则ID
     */
    public void setPsaId(String PsaId) {
        this.PsaId = PsaId;
    }

    /**
     * Get 规则别名 
     * @return PsaName 规则别名
     */
    public String getPsaName() {
        return this.PsaName;
    }

    /**
     * Set 规则别名
     * @param PsaName 规则别名
     */
    public void setPsaName(String PsaName) {
        this.PsaName = PsaName;
    }

    /**
     * Get 关联标签数量 
     * @return TagCount 关联标签数量
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set 关联标签数量
     * @param TagCount 关联标签数量
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Get 关联实例数量 
     * @return InstanceCount 关联实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 关联实例数量
     * @param InstanceCount 关联实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 故障实例数量 
     * @return RepairCount 故障实例数量
     */
    public Long getRepairCount() {
        return this.RepairCount;
    }

    /**
     * Set 故障实例数量
     * @param RepairCount 故障实例数量
     */
    public void setRepairCount(Long RepairCount) {
        this.RepairCount = RepairCount;
    }

    /**
     * Get 故障实例上限 
     * @return RepairLimit 故障实例上限
     */
    public Long getRepairLimit() {
        return this.RepairLimit;
    }

    /**
     * Set 故障实例上限
     * @param RepairLimit 故障实例上限
     */
    public void setRepairLimit(Long RepairLimit) {
        this.RepairLimit = RepairLimit;
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
     * Get 规则备注 
     * @return PsaDescription 规则备注
     */
    public String getPsaDescription() {
        return this.PsaDescription;
    }

    /**
     * Set 规则备注
     * @param PsaDescription 规则备注
     */
    public void setPsaDescription(String PsaDescription) {
        this.PsaDescription = PsaDescription;
    }

    /**
     * Get 关联标签 
     * @return Tags 关联标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 关联标签
     * @param Tags 关联标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 关联故障类型id 
     * @return TaskTypeIds 关联故障类型id
     */
    public Long [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * Set 关联故障类型id
     * @param TaskTypeIds 关联故障类型id
     */
    public void setTaskTypeIds(Long [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PsaId", this.PsaId);
        this.setParamSimple(map, prefix + "PsaName", this.PsaName);
        this.setParamSimple(map, prefix + "TagCount", this.TagCount);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RepairCount", this.RepairCount);
        this.setParamSimple(map, prefix + "RepairLimit", this.RepairLimit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PsaDescription", this.PsaDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "TaskTypeIds.", this.TaskTypeIds);

    }
}

