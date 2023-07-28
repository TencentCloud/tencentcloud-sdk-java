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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseDetail extends AbstractModel{

    /**
    * 授权ID
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * 授权类型,0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 授权状态 0 未使用,1 部分使用, 2 已用完, 3 不可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * 总授权数
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
    * 已使用授权数
    */
    @SerializedName("UsedLicenseCnt")
    @Expose
    private Long UsedLicenseCnt;

    /**
    * 订单状态 1 正常 2隔离, 3销毁
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * 截止日期
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 订单资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 0 初始化,1 自动续费,2 不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 任务ID ,默认0 ,查询绑定进度用
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 购买时间
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * 是否试用订单.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 资源别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 平台标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 冻结数,当为0时 为未冻结,非0 则表示冻结授权数额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreezeNum")
    @Expose
    private Long FreezeNum;

    /**
     * Get 授权ID 
     * @return LicenseId 授权ID
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set 授权ID
     * @param LicenseId 授权ID
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get 授权类型,0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月 
     * @return LicenseType 授权类型,0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型,0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
     * @param LicenseType 授权类型,0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 授权状态 0 未使用,1 部分使用, 2 已用完, 3 不可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseStatus 授权状态 0 未使用,1 部分使用, 2 已用完, 3 不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set 授权状态 0 未使用,1 部分使用, 2 已用完, 3 不可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseStatus 授权状态 0 未使用,1 部分使用, 2 已用完, 3 不可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get 总授权数 
     * @return LicenseCnt 总授权数
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set 总授权数
     * @param LicenseCnt 总授权数
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    /**
     * Get 已使用授权数 
     * @return UsedLicenseCnt 已使用授权数
     */
    public Long getUsedLicenseCnt() {
        return this.UsedLicenseCnt;
    }

    /**
     * Set 已使用授权数
     * @param UsedLicenseCnt 已使用授权数
     */
    public void setUsedLicenseCnt(Long UsedLicenseCnt) {
        this.UsedLicenseCnt = UsedLicenseCnt;
    }

    /**
     * Get 订单状态 1 正常 2隔离, 3销毁 
     * @return OrderStatus 订单状态 1 正常 2隔离, 3销毁
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set 订单状态 1 正常 2隔离, 3销毁
     * @param OrderStatus 订单状态 1 正常 2隔离, 3销毁
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get 截止日期 
     * @return Deadline 截止日期
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 截止日期
     * @param Deadline 截止日期
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 订单资源ID 
     * @return ResourceId 订单资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 订单资源ID
     * @param ResourceId 订单资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 0 初始化,1 自动续费,2 不自动续费 
     * @return AutoRenewFlag 0 初始化,1 自动续费,2 不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 0 初始化,1 自动续费,2 不自动续费
     * @param AutoRenewFlag 0 初始化,1 自动续费,2 不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID ,默认0 ,查询绑定进度用 
     * @return TaskId 任务ID ,默认0 ,查询绑定进度用
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID ,默认0 ,查询绑定进度用
     * @param TaskId 任务ID ,默认0 ,查询绑定进度用
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 购买时间 
     * @return BuyTime 购买时间
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间
     * @param BuyTime 购买时间
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 是否试用订单. 
     * @return SourceType 是否试用订单.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 是否试用订单.
     * @param SourceType 是否试用订单.
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 资源别名 
     * @return Alias 资源别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 资源别名
     * @param Alias 资源别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 平台标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 平台标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 平台标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 平台标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 冻结数,当为0时 为未冻结,非0 则表示冻结授权数额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreezeNum 冻结数,当为0时 为未冻结,非0 则表示冻结授权数额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFreezeNum() {
        return this.FreezeNum;
    }

    /**
     * Set 冻结数,当为0时 为未冻结,非0 则表示冻结授权数额
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreezeNum 冻结数,当为0时 为未冻结,非0 则表示冻结授权数额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreezeNum(Long FreezeNum) {
        this.FreezeNum = FreezeNum;
    }

    public LicenseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseDetail(LicenseDetail source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new Long(source.LicenseStatus);
        }
        if (source.LicenseCnt != null) {
            this.LicenseCnt = new Long(source.LicenseCnt);
        }
        if (source.UsedLicenseCnt != null) {
            this.UsedLicenseCnt = new Long(source.UsedLicenseCnt);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.FreezeNum != null) {
            this.FreezeNum = new Long(source.FreezeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "LicenseCnt", this.LicenseCnt);
        this.setParamSimple(map, prefix + "UsedLicenseCnt", this.UsedLicenseCnt);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "FreezeNum", this.FreezeNum);

    }
}

