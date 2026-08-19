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

public class ComplianceTermItem extends AbstractModel {

    /**
    * <p>条款ID</p>
    */
    @SerializedName("TermID")
    @Expose
    private Long TermID;

    /**
    * <p>条款描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>条款名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>关联规则数量</p>
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * <p>条款原理</p>
    */
    @SerializedName("Rationale")
    @Expose
    private String Rationale;

    /**
    * <p>编号</p>
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
     * Get <p>条款ID</p> 
     * @return TermID <p>条款ID</p>
     */
    public Long getTermID() {
        return this.TermID;
    }

    /**
     * Set <p>条款ID</p>
     * @param TermID <p>条款ID</p>
     */
    public void setTermID(Long TermID) {
        this.TermID = TermID;
    }

    /**
     * Get <p>条款描述</p> 
     * @return Description <p>条款描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>条款描述</p>
     * @param Description <p>条款描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>条款名称</p> 
     * @return Name <p>条款名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>条款名称</p>
     * @param Name <p>条款名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>关联规则数量</p> 
     * @return RuleCount <p>关联规则数量</p>
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set <p>关联规则数量</p>
     * @param RuleCount <p>关联规则数量</p>
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get <p>条款原理</p> 
     * @return Rationale <p>条款原理</p>
     */
    public String getRationale() {
        return this.Rationale;
    }

    /**
     * Set <p>条款原理</p>
     * @param Rationale <p>条款原理</p>
     */
    public void setRationale(String Rationale) {
        this.Rationale = Rationale;
    }

    /**
     * Get <p>编号</p> 
     * @return Sn <p>编号</p>
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set <p>编号</p>
     * @param Sn <p>编号</p>
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    public ComplianceTermItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceTermItem(ComplianceTermItem source) {
        if (source.TermID != null) {
            this.TermID = new Long(source.TermID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.Rationale != null) {
            this.Rationale = new String(source.Rationale);
        }
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermID", this.TermID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "Rationale", this.Rationale);
        this.setParamSimple(map, prefix + "Sn", this.Sn);

    }
}

