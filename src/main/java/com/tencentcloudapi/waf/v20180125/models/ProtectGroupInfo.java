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

public class ProtectGroupInfo extends AbstractModel {

    /**
    * 防护对象组ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 防护对象组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 防护对象组备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 防护对象组中绑定的域名详情
    */
    @SerializedName("Domains")
    @Expose
    private ProtectGroupDomainInfo [] Domains;

    /**
    * 关联的批量规则数
    */
    @SerializedName("RuleNum")
    @Expose
    private Long RuleNum;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 防护对象组ID 
     * @return ID 防护对象组ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 防护对象组ID
     * @param ID 防护对象组ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 防护对象组名称 
     * @return Name 防护对象组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 防护对象组名称
     * @param Name 防护对象组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 防护对象组备注 
     * @return Remark 防护对象组备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 防护对象组备注
     * @param Remark 防护对象组备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 防护对象组中绑定的域名详情 
     * @return Domains 防护对象组中绑定的域名详情
     */
    public ProtectGroupDomainInfo [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 防护对象组中绑定的域名详情
     * @param Domains 防护对象组中绑定的域名详情
     */
    public void setDomains(ProtectGroupDomainInfo [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 关联的批量规则数 
     * @return RuleNum 关联的批量规则数
     */
    public Long getRuleNum() {
        return this.RuleNum;
    }

    /**
     * Set 关联的批量规则数
     * @param RuleNum 关联的批量规则数
     */
    public void setRuleNum(Long RuleNum) {
        this.RuleNum = RuleNum;
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
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProtectGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectGroupInfo(ProtectGroupInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Domains != null) {
            this.Domains = new ProtectGroupDomainInfo[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new ProtectGroupDomainInfo(source.Domains[i]);
            }
        }
        if (source.RuleNum != null) {
            this.RuleNum = new Long(source.RuleNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "RuleNum", this.RuleNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

