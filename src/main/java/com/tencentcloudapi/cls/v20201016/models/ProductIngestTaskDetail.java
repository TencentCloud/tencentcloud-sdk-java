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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductIngestTaskDetail extends AbstractModel {

    /**
    * <p>接入任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>接入任务信息</p>
    */
    @SerializedName("ProductIngestTaskItem")
    @Expose
    private ProductIngestTaskItem ProductIngestTaskItem;

    /**
    * <p>接入实例选择方式</p><p>枚举值：</p><ul><li>0： 全部实例</li><li>1： 按标签筛选</li><li>2： 手动选择</li></ul>
    */
    @SerializedName("SelectionMode")
    @Expose
    private Long SelectionMode;

    /**
    * <p>所选实例id列表</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>所选接入实例所处范围标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>eBPF 采集规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EBPFCollectRule")
    @Expose
    private EBPFCollectRule EBPFCollectRule;

    /**
     * Get <p>接入任务id</p> 
     * @return TaskId <p>接入任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>接入任务id</p>
     * @param TaskId <p>接入任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>接入任务信息</p> 
     * @return ProductIngestTaskItem <p>接入任务信息</p>
     */
    public ProductIngestTaskItem getProductIngestTaskItem() {
        return this.ProductIngestTaskItem;
    }

    /**
     * Set <p>接入任务信息</p>
     * @param ProductIngestTaskItem <p>接入任务信息</p>
     */
    public void setProductIngestTaskItem(ProductIngestTaskItem ProductIngestTaskItem) {
        this.ProductIngestTaskItem = ProductIngestTaskItem;
    }

    /**
     * Get <p>接入实例选择方式</p><p>枚举值：</p><ul><li>0： 全部实例</li><li>1： 按标签筛选</li><li>2： 手动选择</li></ul> 
     * @return SelectionMode <p>接入实例选择方式</p><p>枚举值：</p><ul><li>0： 全部实例</li><li>1： 按标签筛选</li><li>2： 手动选择</li></ul>
     */
    public Long getSelectionMode() {
        return this.SelectionMode;
    }

    /**
     * Set <p>接入实例选择方式</p><p>枚举值：</p><ul><li>0： 全部实例</li><li>1： 按标签筛选</li><li>2： 手动选择</li></ul>
     * @param SelectionMode <p>接入实例选择方式</p><p>枚举值：</p><ul><li>0： 全部实例</li><li>1： 按标签筛选</li><li>2： 手动选择</li></ul>
     */
    public void setSelectionMode(Long SelectionMode) {
        this.SelectionMode = SelectionMode;
    }

    /**
     * Get <p>所选实例id列表</p> 
     * @return InstanceIds <p>所选实例id列表</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>所选实例id列表</p>
     * @param InstanceIds <p>所选实例id列表</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>所选接入实例所处范围标签</p> 
     * @return Tags <p>所选接入实例所处范围标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>所选接入实例所处范围标签</p>
     * @param Tags <p>所选接入实例所处范围标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>eBPF 采集规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EBPFCollectRule <p>eBPF 采集规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EBPFCollectRule getEBPFCollectRule() {
        return this.EBPFCollectRule;
    }

    /**
     * Set <p>eBPF 采集规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EBPFCollectRule <p>eBPF 采集规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEBPFCollectRule(EBPFCollectRule EBPFCollectRule) {
        this.EBPFCollectRule = EBPFCollectRule;
    }

    public ProductIngestTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductIngestTaskDetail(ProductIngestTaskDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProductIngestTaskItem != null) {
            this.ProductIngestTaskItem = new ProductIngestTaskItem(source.ProductIngestTaskItem);
        }
        if (source.SelectionMode != null) {
            this.SelectionMode = new Long(source.SelectionMode);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EBPFCollectRule != null) {
            this.EBPFCollectRule = new EBPFCollectRule(source.EBPFCollectRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "ProductIngestTaskItem.", this.ProductIngestTaskItem);
        this.setParamSimple(map, prefix + "SelectionMode", this.SelectionMode);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "EBPFCollectRule.", this.EBPFCollectRule);

    }
}

