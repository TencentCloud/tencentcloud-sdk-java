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

public class DescribeDspmAuditFilterStrategy extends AbstractModel {

    /**
    * <p>策略ID</p>
    */
    @SerializedName("AuditFilterStrategyId")
    @Expose
    private Long AuditFilterStrategyId;

    /**
    * <p>策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>规则内容</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>云账号ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>用户标识</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>账号昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
     * Get <p>策略ID</p> 
     * @return AuditFilterStrategyId <p>策略ID</p>
     */
    public Long getAuditFilterStrategyId() {
        return this.AuditFilterStrategyId;
    }

    /**
     * Set <p>策略ID</p>
     * @param AuditFilterStrategyId <p>策略ID</p>
     */
    public void setAuditFilterStrategyId(Long AuditFilterStrategyId) {
        this.AuditFilterStrategyId = AuditFilterStrategyId;
    }

    /**
     * Get <p>策略名</p> 
     * @return Name <p>策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名</p>
     * @param Name <p>策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规则内容</p> 
     * @return Rule <p>规则内容</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>规则内容</p>
     * @param Rule <p>规则内容</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul> 
     * @return IsEnabled <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     * @param IsEnabled <p>是否启用</p><p>枚举值：</p><ul><li>0： 禁用</li><li>1： 启用</li></ul>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：2026-07-16T11:44:45+08</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>参数格式：2026-07-16T11:44:45+08</p> 
     * @return ModifyTime <p>更新时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>更新时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
     * @param ModifyTime <p>更新时间</p><p>参数格式：2026-07-16T11:44:45+08</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>云账号ID</p> 
     * @return AppId <p>云账号ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>云账号ID</p>
     * @param AppId <p>云账号ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>用户标识</p> 
     * @return Uin <p>用户标识</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户标识</p>
     * @param Uin <p>用户标识</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>账号昵称</p> 
     * @return NickName <p>账号昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称</p>
     * @param NickName <p>账号昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public DescribeDspmAuditFilterStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAuditFilterStrategy(DescribeDspmAuditFilterStrategy source) {
        if (source.AuditFilterStrategyId != null) {
            this.AuditFilterStrategyId = new Long(source.AuditFilterStrategyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditFilterStrategyId", this.AuditFilterStrategyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

