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

public class PsaRegulation  extends AbstractModel{

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
    private Integer TagCount;

    /**
    * 关联实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * 故障实例数量
    */
    @SerializedName("RepairCount")
    @Expose
    private Integer RepairCount;

    /**
    * 故障实例上限
    */
    @SerializedName("RepairLimit")
    @Expose
    private Integer RepairLimit;

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
    private Integer [] TaskTypeIds;

    /**
     * 获取规则ID
     * @return PsaId 规则ID
     */
    public String getPsaId() {
        return this.PsaId;
    }

    /**
     * 设置规则ID
     * @param PsaId 规则ID
     */
    public void setPsaId(String PsaId) {
        this.PsaId = PsaId;
    }

    /**
     * 获取规则别名
     * @return PsaName 规则别名
     */
    public String getPsaName() {
        return this.PsaName;
    }

    /**
     * 设置规则别名
     * @param PsaName 规则别名
     */
    public void setPsaName(String PsaName) {
        this.PsaName = PsaName;
    }

    /**
     * 获取关联标签数量
     * @return TagCount 关联标签数量
     */
    public Integer getTagCount() {
        return this.TagCount;
    }

    /**
     * 设置关联标签数量
     * @param TagCount 关联标签数量
     */
    public void setTagCount(Integer TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * 获取关联实例数量
     * @return InstanceCount 关联实例数量
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置关联实例数量
     * @param InstanceCount 关联实例数量
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取故障实例数量
     * @return RepairCount 故障实例数量
     */
    public Integer getRepairCount() {
        return this.RepairCount;
    }

    /**
     * 设置故障实例数量
     * @param RepairCount 故障实例数量
     */
    public void setRepairCount(Integer RepairCount) {
        this.RepairCount = RepairCount;
    }

    /**
     * 获取故障实例上限
     * @return RepairLimit 故障实例上限
     */
    public Integer getRepairLimit() {
        return this.RepairLimit;
    }

    /**
     * 设置故障实例上限
     * @param RepairLimit 故障实例上限
     */
    public void setRepairLimit(Integer RepairLimit) {
        this.RepairLimit = RepairLimit;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取规则备注
     * @return PsaDescription 规则备注
     */
    public String getPsaDescription() {
        return this.PsaDescription;
    }

    /**
     * 设置规则备注
     * @param PsaDescription 规则备注
     */
    public void setPsaDescription(String PsaDescription) {
        this.PsaDescription = PsaDescription;
    }

    /**
     * 获取关联标签
     * @return Tags 关联标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置关联标签
     * @param Tags 关联标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取关联故障类型id
     * @return TaskTypeIds 关联故障类型id
     */
    public Integer [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * 设置关联故障类型id
     * @param TaskTypeIds 关联故障类型id
     */
    public void setTaskTypeIds(Integer [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    /**
     * 内部实现，用户禁止调用
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

