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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwaspRule extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则开关，0：关闭、1：开启、2：只观察
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则的防护等级，100：宽松、200：正常、300：严格、400：超严格
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 威胁等级，0：未知，100：低危，200：中危，300：高危，400：危急
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * CVE ID
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * 规则所属的类型ID
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 是否被锁定
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则开关，0：关闭、1：开启、2：只观察 
     * @return Status 规则开关，0：关闭、1：开启、2：只观察
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关，0：关闭、1：开启、2：只观察
     * @param Status 规则开关，0：关闭、1：开启、2：只观察
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则的防护等级，100：宽松、200：正常、300：严格、400：超严格 
     * @return Level 规则的防护等级，100：宽松、200：正常、300：严格、400：超严格
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 规则的防护等级，100：宽松、200：正常、300：严格、400：超严格
     * @param Level 规则的防护等级，100：宽松、200：正常、300：严格、400：超严格
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 威胁等级，0：未知，100：低危，200：中危，300：高危，400：危急 
     * @return VulLevel 威胁等级，0：未知，100：低危，200：中危，300：高危，400：危急
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set 威胁等级，0：未知，100：低危，200：中危，300：高危，400：危急
     * @param VulLevel 威胁等级，0：未知，100：低危，200：中危，300：高危，400：危急
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get CVE ID 
     * @return CveID CVE ID
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set CVE ID
     * @param CveID CVE ID
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get 规则所属的类型ID 
     * @return TypeId 规则所属的类型ID
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 规则所属的类型ID
     * @param TypeId 规则所属的类型ID
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
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
     * Get 是否被锁定 
     * @return Locked 是否被锁定
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 是否被锁定
     * @param Locked 是否被锁定
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它 
     * @return Reason 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
     * @param Reason 修改原因
0：无(兼容记录为空)
1：业务自身特性误报避免
2：规则误报上报
3：核心业务规则灰度
4：其它
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public OwaspRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwaspRule(OwaspRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

