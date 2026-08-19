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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CWPOrderList extends AbstractModel {

    /**
    * <p>所属产品 p_</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>子产品 sp_</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>计费项四层 sv_</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * <p>资源购买量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * <p>资源用量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * <p>云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private Tags [] TagList;

    /**
    * <p>订单状态 1 正常 2隔离 3销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>订单的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>订单的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>资源别名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>自动续费标签 0 默认不自动续费(大客户特权会自动续费的) 1 自动续费 2 手动设置不自动续费(大客户特权不会自动续费)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>计费模式 0 后付费 1 预付费(包年包月)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>地域ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * <p>可用区ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneID")
    @Expose
    private Long ZoneID;

    /**
    * <p>当前子订单号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * <p>订单额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraParam")
    @Expose
    private CWPOrderExtraParam ExtraParam;

    /**
     * Get <p>所属产品 p_</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode <p>所属产品 p_</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>所属产品 p_</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode <p>所属产品 p_</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>子产品 sp_</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubProductCode <p>子产品 sp_</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>子产品 sp_</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubProductCode <p>子产品 sp_</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>计费项四层 sv_</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InquireKey <p>计费项四层 sv_</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set <p>计费项四层 sv_</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InquireKey <p>计费项四层 sv_</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get <p>资源购买量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InquireNum <p>资源购买量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set <p>资源购买量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InquireNum <p>资源购买量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get <p>资源用量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedNum <p>资源用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set <p>资源用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedNum <p>资源用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get <p>云标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList <p>云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tags [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList <p>云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(Tags [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>订单状态 1 正常 2隔离 3销毁</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>订单状态 1 正常 2隔离 3销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订单状态 1 正常 2隔离 3销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>订单状态 1 正常 2隔离 3销毁</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>订单的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime <p>订单的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>订单的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime <p>订单的开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>订单的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>订单的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>订单的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>订单的结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectID <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectID <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>资源别名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias <p>资源别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>资源别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias <p>资源别名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>自动续费标签 0 默认不自动续费(大客户特权会自动续费的) 1 自动续费 2 手动设置不自动续费(大客户特权不会自动续费)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag <p>自动续费标签 0 默认不自动续费(大客户特权会自动续费的) 1 自动续费 2 手动设置不自动续费(大客户特权不会自动续费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标签 0 默认不自动续费(大客户特权会自动续费的) 1 自动续费 2 手动设置不自动续费(大客户特权不会自动续费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag <p>自动续费标签 0 默认不自动续费(大客户特权会自动续费的) 1 自动续费 2 手动设置不自动续费(大客户特权不会自动续费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType <p>资源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>计费模式 0 后付费 1 预付费(包年包月)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode <p>计费模式 0 后付费 1 预付费(包年包月)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式 0 后付费 1 预付费(包年包月)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode <p>计费模式 0 后付费 1 预付费(包年包月)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>地域ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionID <p>地域ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set <p>地域ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionID <p>地域ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get <p>可用区ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneID <p>可用区ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set <p>可用区ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneID <p>可用区ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneID(Long ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get <p>当前子订单号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName <p>当前子订单号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set <p>当前子订单号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName <p>当前子订单号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get <p>订单额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraParam <p>订单额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CWPOrderExtraParam getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set <p>订单额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraParam <p>订单额外参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraParam(CWPOrderExtraParam ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    public CWPOrderList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CWPOrderList(CWPOrderList source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.TagList != null) {
            this.TagList = new Tags[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tags(source.TagList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.ZoneID != null) {
            this.ZoneID = new Long(source.ZoneID);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new CWPOrderExtraParam(source.ExtraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "ZoneID", this.ZoneID);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamObj(map, prefix + "ExtraParam.", this.ExtraParam);

    }
}

