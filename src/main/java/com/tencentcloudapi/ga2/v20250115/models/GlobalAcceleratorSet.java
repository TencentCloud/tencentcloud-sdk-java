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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlobalAcceleratorSet extends AbstractModel {

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>全球加速实例名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>全球加速实例描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>全球加速实例创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>全球加速实例状态。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>全球加速实例付费类型。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>全球加速实例DdosId。</p>
    */
    @SerializedName("DdosId")
    @Expose
    private String DdosId;

    /**
    * <p>所属加速实例监听器个数。</p>
    */
    @SerializedName("ListenerCounts")
    @Expose
    private Long ListenerCounts;

    /**
    * <p>所属加速实例加速地域个数。</p>
    */
    @SerializedName("AcceleratorAreaCounts")
    @Expose
    private Long AcceleratorAreaCounts;

    /**
    * <p>全球加速实例状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>域名。</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>跨境类型；HighQuality（精品跨境）、Unicom（联通跨境）、NotAvailable（未开通）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossBorderType")
    @Expose
    private String CrossBorderType;

    /**
    * <p>标签信息。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>全球加速实例名称。</p> 
     * @return Name <p>全球加速实例名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>全球加速实例名称。</p>
     * @param Name <p>全球加速实例名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>全球加速实例描述。</p> 
     * @return Description <p>全球加速实例描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>全球加速实例描述。</p>
     * @param Description <p>全球加速实例描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>全球加速实例创建时间。</p> 
     * @return CreateTime <p>全球加速实例创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>全球加速实例创建时间。</p>
     * @param CreateTime <p>全球加速实例创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>全球加速实例状态。</p> 
     * @return State <p>全球加速实例状态。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>全球加速实例状态。</p>
     * @param State <p>全球加速实例状态。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>全球加速实例付费类型。</p> 
     * @return InstanceChargeType <p>全球加速实例付费类型。</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>全球加速实例付费类型。</p>
     * @param InstanceChargeType <p>全球加速实例付费类型。</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>全球加速实例DdosId。</p> 
     * @return DdosId <p>全球加速实例DdosId。</p>
     */
    public String getDdosId() {
        return this.DdosId;
    }

    /**
     * Set <p>全球加速实例DdosId。</p>
     * @param DdosId <p>全球加速实例DdosId。</p>
     */
    public void setDdosId(String DdosId) {
        this.DdosId = DdosId;
    }

    /**
     * Get <p>所属加速实例监听器个数。</p> 
     * @return ListenerCounts <p>所属加速实例监听器个数。</p>
     */
    public Long getListenerCounts() {
        return this.ListenerCounts;
    }

    /**
     * Set <p>所属加速实例监听器个数。</p>
     * @param ListenerCounts <p>所属加速实例监听器个数。</p>
     */
    public void setListenerCounts(Long ListenerCounts) {
        this.ListenerCounts = ListenerCounts;
    }

    /**
     * Get <p>所属加速实例加速地域个数。</p> 
     * @return AcceleratorAreaCounts <p>所属加速实例加速地域个数。</p>
     */
    public Long getAcceleratorAreaCounts() {
        return this.AcceleratorAreaCounts;
    }

    /**
     * Set <p>所属加速实例加速地域个数。</p>
     * @param AcceleratorAreaCounts <p>所属加速实例加速地域个数。</p>
     */
    public void setAcceleratorAreaCounts(Long AcceleratorAreaCounts) {
        this.AcceleratorAreaCounts = AcceleratorAreaCounts;
    }

    /**
     * Get <p>全球加速实例状态。</p> 
     * @return Status <p>全球加速实例状态。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>全球加速实例状态。</p>
     * @param Status <p>全球加速实例状态。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>域名。</p> 
     * @return Cname <p>域名。</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>域名。</p>
     * @param Cname <p>域名。</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>跨境类型；HighQuality（精品跨境）、Unicom（联通跨境）、NotAvailable（未开通）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossBorderType <p>跨境类型；HighQuality（精品跨境）、Unicom（联通跨境）、NotAvailable（未开通）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrossBorderType() {
        return this.CrossBorderType;
    }

    /**
     * Set <p>跨境类型；HighQuality（精品跨境）、Unicom（联通跨境）、NotAvailable（未开通）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossBorderType <p>跨境类型；HighQuality（精品跨境）、Unicom（联通跨境）、NotAvailable（未开通）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossBorderType(String CrossBorderType) {
        this.CrossBorderType = CrossBorderType;
    }

    /**
     * Get <p>标签信息。</p> 
     * @return TagSet <p>标签信息。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签信息。</p>
     * @param TagSet <p>标签信息。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public GlobalAcceleratorSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorSet(GlobalAcceleratorSet source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.DdosId != null) {
            this.DdosId = new String(source.DdosId);
        }
        if (source.ListenerCounts != null) {
            this.ListenerCounts = new Long(source.ListenerCounts);
        }
        if (source.AcceleratorAreaCounts != null) {
            this.AcceleratorAreaCounts = new Long(source.AcceleratorAreaCounts);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.CrossBorderType != null) {
            this.CrossBorderType = new String(source.CrossBorderType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "DdosId", this.DdosId);
        this.setParamSimple(map, prefix + "ListenerCounts", this.ListenerCounts);
        this.setParamSimple(map, prefix + "AcceleratorAreaCounts", this.AcceleratorAreaCounts);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "CrossBorderType", this.CrossBorderType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

