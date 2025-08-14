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

public class OwaspRuleType extends AbstractModel {

    /**
    * 类型ID
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 类型名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 类型描述

    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 类型分类
    */
    @SerializedName("Classification")
    @Expose
    private String Classification;

    /**
    * 规则类型的防护模式，0：观察、1：拦截
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 规则类型的防护等级，100：宽松、200：正常、300：严格、400：超严格
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 规则类型的开关状态，0：关闭、1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则类型下的所有规则总是
    */
    @SerializedName("TotalRule")
    @Expose
    private Long TotalRule;

    /**
    * 规则类型下的启用的规则总数
    */
    @SerializedName("ActiveRule")
    @Expose
    private Long ActiveRule;

    /**
     * Get 类型ID 
     * @return TypeId 类型ID
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 类型ID
     * @param TypeId 类型ID
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 类型名称 
     * @return TypeName 类型名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类型名称
     * @param TypeName 类型名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 类型描述
 
     * @return Description 类型描述

     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 类型描述

     * @param Description 类型描述

     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 类型分类 
     * @return Classification 类型分类
     */
    public String getClassification() {
        return this.Classification;
    }

    /**
     * Set 类型分类
     * @param Classification 类型分类
     */
    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    /**
     * Get 规则类型的防护模式，0：观察、1：拦截 
     * @return Action 规则类型的防护模式，0：观察、1：拦截
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 规则类型的防护模式，0：观察、1：拦截
     * @param Action 规则类型的防护模式，0：观察、1：拦截
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 规则类型的防护等级，100：宽松、200：正常、300：严格、400：超严格 
     * @return Level 规则类型的防护等级，100：宽松、200：正常、300：严格、400：超严格
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 规则类型的防护等级，100：宽松、200：正常、300：严格、400：超严格
     * @param Level 规则类型的防护等级，100：宽松、200：正常、300：严格、400：超严格
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 规则类型的开关状态，0：关闭、1：开启 
     * @return Status 规则类型的开关状态，0：关闭、1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则类型的开关状态，0：关闭、1：开启
     * @param Status 规则类型的开关状态，0：关闭、1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则类型下的所有规则总是 
     * @return TotalRule 规则类型下的所有规则总是
     */
    public Long getTotalRule() {
        return this.TotalRule;
    }

    /**
     * Set 规则类型下的所有规则总是
     * @param TotalRule 规则类型下的所有规则总是
     */
    public void setTotalRule(Long TotalRule) {
        this.TotalRule = TotalRule;
    }

    /**
     * Get 规则类型下的启用的规则总数 
     * @return ActiveRule 规则类型下的启用的规则总数
     */
    public Long getActiveRule() {
        return this.ActiveRule;
    }

    /**
     * Set 规则类型下的启用的规则总数
     * @param ActiveRule 规则类型下的启用的规则总数
     */
    public void setActiveRule(Long ActiveRule) {
        this.ActiveRule = ActiveRule;
    }

    public OwaspRuleType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwaspRuleType(OwaspRuleType source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Classification != null) {
            this.Classification = new String(source.Classification);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TotalRule != null) {
            this.TotalRule = new Long(source.TotalRule);
        }
        if (source.ActiveRule != null) {
            this.ActiveRule = new Long(source.ActiveRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Classification", this.Classification);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalRule", this.TotalRule);
        this.setParamSimple(map, prefix + "ActiveRule", this.ActiveRule);

    }
}

