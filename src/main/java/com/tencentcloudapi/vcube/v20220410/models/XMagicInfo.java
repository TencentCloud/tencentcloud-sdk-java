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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XMagicInfo extends AbstractModel {

    /**
    * 优图Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户公司名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * https://cos.xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyPermit")
    @Expose
    private String CompanyPermit;

    /**
    * 用户公司行业类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyType")
    @Expose
    private String CompanyType;

    /**
    * 优图套餐类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Plan")
    @Expose
    private String Plan;

    /**
    * 测试版还是正式版 test | formal
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * 0: 预申请，需要补充申请信息
   1: 审批通过，xmagic已签发，正在生效中
    2: 提交完申请资料后待运营审核状态
    3: 申请被驳回，需要重新修改申请资料
    4: 应用包名被修改后触发xmagic审批，当前xmagic已暂停生效
    5: 应用修改包名后，审批未通过状态，可以重新修改应用PB，状态会回到4
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 测试license是否已经升级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Update")
    @Expose
    private Boolean Update;

    /**
    * 优图生效开始时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 优图生效结束时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 续期次数， LicenseType=test时有此字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewalCount")
    @Expose
    private Long RenewalCount;

    /**
    * 历次审批的回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reply")
    @Expose
    private String [] Reply;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 用户更新信息的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 返回还剩多少秒过期，过期后返回0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestTime")
    @Expose
    private Long RestTime;

    /**
    * single: 原子能力,combined:套餐
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagicType")
    @Expose
    private String XMagicType;

    /**
    * 优图模块名称，自动中英文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 优图资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resource")
    @Expose
    private RenewResource Resource;

    /**
    * 是否是马甲包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVest")
    @Expose
    private Boolean IsVest;

    /**
     * Get 优图Id 
     * @return Id 优图Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 优图Id
     * @param Id 优图Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户公司名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyName 用户公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 用户公司名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyName 用户公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get https://cos.xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyPermit https://cos.xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyPermit() {
        return this.CompanyPermit;
    }

    /**
     * Set https://cos.xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyPermit https://cos.xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyPermit(String CompanyPermit) {
        this.CompanyPermit = CompanyPermit;
    }

    /**
     * Get 用户公司行业类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyType 用户公司行业类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 用户公司行业类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyType 用户公司行业类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyType(String CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get 优图套餐类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Plan 优图套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlan() {
        return this.Plan;
    }

    /**
     * Set 优图套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Plan 优图套餐类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlan(String Plan) {
        this.Plan = Plan;
    }

    /**
     * Get 测试版还是正式版 test | formal 
     * @return LicenseType 测试版还是正式版 test | formal
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 测试版还是正式版 test | formal
     * @param LicenseType 测试版还是正式版 test | formal
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 0: 预申请，需要补充申请信息
   1: 审批通过，xmagic已签发，正在生效中
    2: 提交完申请资料后待运营审核状态
    3: 申请被驳回，需要重新修改申请资料
    4: 应用包名被修改后触发xmagic审批，当前xmagic已暂停生效
    5: 应用修改包名后，审批未通过状态，可以重新修改应用PB，状态会回到4 
     * @return Status 0: 预申请，需要补充申请信息
   1: 审批通过，xmagic已签发，正在生效中
    2: 提交完申请资料后待运营审核状态
    3: 申请被驳回，需要重新修改申请资料
    4: 应用包名被修改后触发xmagic审批，当前xmagic已暂停生效
    5: 应用修改包名后，审批未通过状态，可以重新修改应用PB，状态会回到4
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: 预申请，需要补充申请信息
   1: 审批通过，xmagic已签发，正在生效中
    2: 提交完申请资料后待运营审核状态
    3: 申请被驳回，需要重新修改申请资料
    4: 应用包名被修改后触发xmagic审批，当前xmagic已暂停生效
    5: 应用修改包名后，审批未通过状态，可以重新修改应用PB，状态会回到4
     * @param Status 0: 预申请，需要补充申请信息
   1: 审批通过，xmagic已签发，正在生效中
    2: 提交完申请资料后待运营审核状态
    3: 申请被驳回，需要重新修改申请资料
    4: 应用包名被修改后触发xmagic审批，当前xmagic已暂停生效
    5: 应用修改包名后，审批未通过状态，可以重新修改应用PB，状态会回到4
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 测试license是否已经升级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Update 测试license是否已经升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUpdate() {
        return this.Update;
    }

    /**
     * Set 测试license是否已经升级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Update 测试license是否已经升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdate(Boolean Update) {
        this.Update = Update;
    }

    /**
     * Get 优图生效开始时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 优图生效开始时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 优图生效开始时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 优图生效开始时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 优图生效结束时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 优图生效结束时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 优图生效结束时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 优图生效结束时间 Status为1的时候
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 续期次数， LicenseType=test时有此字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewalCount 续期次数， LicenseType=test时有此字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewalCount() {
        return this.RenewalCount;
    }

    /**
     * Set 续期次数， LicenseType=test时有此字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewalCount 续期次数， LicenseType=test时有此字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewalCount(Long RenewalCount) {
        this.RenewalCount = RenewalCount;
    }

    /**
     * Get 历次审批的回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reply 历次审批的回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReply() {
        return this.Reply;
    }

    /**
     * Set 历次审批的回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reply 历次审批的回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReply(String [] Reply) {
        this.Reply = Reply;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 修改时间 
     * @return UpdatedAt 修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 修改时间
     * @param UpdatedAt 修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 用户更新信息的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 用户更新信息的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 用户更新信息的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 用户更新信息的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expired 是否过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 是否过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expired 是否过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 返回还剩多少秒过期，过期后返回0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestTime 返回还剩多少秒过期，过期后返回0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestTime() {
        return this.RestTime;
    }

    /**
     * Set 返回还剩多少秒过期，过期后返回0
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestTime 返回还剩多少秒过期，过期后返回0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestTime(Long RestTime) {
        this.RestTime = RestTime;
    }

    /**
     * Get single: 原子能力,combined:套餐
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagicType single: 原子能力,combined:套餐
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getXMagicType() {
        return this.XMagicType;
    }

    /**
     * Set single: 原子能力,combined:套餐
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagicType single: 原子能力,combined:套餐
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagicType(String XMagicType) {
        this.XMagicType = XMagicType;
    }

    /**
     * Get 优图模块名称，自动中英文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 优图模块名称，自动中英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 优图模块名称，自动中英文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 优图模块名称，自动中英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 优图资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resource 优图资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RenewResource getResource() {
        return this.Resource;
    }

    /**
     * Set 优图资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resource 优图资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResource(RenewResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 是否是马甲包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVest 是否是马甲包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVest() {
        return this.IsVest;
    }

    /**
     * Set 是否是马甲包
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVest 是否是马甲包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVest(Boolean IsVest) {
        this.IsVest = IsVest;
    }

    public XMagicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XMagicInfo(XMagicInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyPermit != null) {
            this.CompanyPermit = new String(source.CompanyPermit);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new String(source.CompanyType);
        }
        if (source.Plan != null) {
            this.Plan = new String(source.Plan);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Update != null) {
            this.Update = new Boolean(source.Update);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RenewalCount != null) {
            this.RenewalCount = new Long(source.RenewalCount);
        }
        if (source.Reply != null) {
            this.Reply = new String[source.Reply.length];
            for (int i = 0; i < source.Reply.length; i++) {
                this.Reply[i] = new String(source.Reply[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.RestTime != null) {
            this.RestTime = new Long(source.RestTime);
        }
        if (source.XMagicType != null) {
            this.XMagicType = new String(source.XMagicType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Resource != null) {
            this.Resource = new RenewResource(source.Resource);
        }
        if (source.IsVest != null) {
            this.IsVest = new Boolean(source.IsVest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyPermit", this.CompanyPermit);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Update", this.Update);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RenewalCount", this.RenewalCount);
        this.setParamArraySimple(map, prefix + "Reply.", this.Reply);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "RestTime", this.RestTime);
        this.setParamSimple(map, prefix + "XMagicType", this.XMagicType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "IsVest", this.IsVest);

    }
}

