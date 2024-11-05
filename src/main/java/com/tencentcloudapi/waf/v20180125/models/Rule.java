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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rule extends AbstractModel {

    /**
    * 规则id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 规则等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则防护的CVE编号
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * 规则的状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则修改的时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 门神规则新增/更新时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get 规则id 
     * @return Id 规则id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id
     * @param Id 规则id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则类型 
     * @return Type 规则类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 规则类型
     * @param Type 规则类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 规则等级 
     * @return Level 规则等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 规则等级
     * @param Level 规则等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get 规则防护的CVE编号 
     * @return CVE 规则防护的CVE编号
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set 规则防护的CVE编号
     * @param CVE 规则防护的CVE编号
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get 规则的状态 
     * @return Status 规则的状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则的状态
     * @param Status 规则的状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则修改的时间 
     * @return ModifyTime 规则修改的时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 规则修改的时间
     * @param ModifyTime 规则修改的时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 门神规则新增/更新时间 
     * @return AddTime 门神规则新增/更新时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 门神规则新增/更新时间
     * @param AddTime 门神规则新增/更新时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

