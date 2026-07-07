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

public class CreateDspmIdentifyRuleRequest extends AbstractModel {

    /**
    * <p>数据项名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>数据项描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据项启用状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>结构化规则</p>
    */
    @SerializedName("StructuredRule")
    @Expose
    private String StructuredRule;

    /**
    * <p>非结构化规则</p>
    */
    @SerializedName("UnStructuredRule")
    @Expose
    private String UnStructuredRule;

    /**
     * Get <p>数据项名称</p> 
     * @return Name <p>数据项名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据项名称</p>
     * @param Name <p>数据项名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>数据项描述</p> 
     * @return Description <p>数据项描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据项描述</p>
     * @param Description <p>数据项描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据项启用状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul> 
     * @return Status <p>数据项启用状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据项启用状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
     * @param Status <p>数据项启用状态</p><p>枚举值：</p><ul><li>0： 未启用</li><li>1： 启用</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>结构化规则</p> 
     * @return StructuredRule <p>结构化规则</p>
     */
    public String getStructuredRule() {
        return this.StructuredRule;
    }

    /**
     * Set <p>结构化规则</p>
     * @param StructuredRule <p>结构化规则</p>
     */
    public void setStructuredRule(String StructuredRule) {
        this.StructuredRule = StructuredRule;
    }

    /**
     * Get <p>非结构化规则</p> 
     * @return UnStructuredRule <p>非结构化规则</p>
     */
    public String getUnStructuredRule() {
        return this.UnStructuredRule;
    }

    /**
     * Set <p>非结构化规则</p>
     * @param UnStructuredRule <p>非结构化规则</p>
     */
    public void setUnStructuredRule(String UnStructuredRule) {
        this.UnStructuredRule = UnStructuredRule;
    }

    public CreateDspmIdentifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmIdentifyRuleRequest(CreateDspmIdentifyRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StructuredRule != null) {
            this.StructuredRule = new String(source.StructuredRule);
        }
        if (source.UnStructuredRule != null) {
            this.UnStructuredRule = new String(source.UnStructuredRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StructuredRule", this.StructuredRule);
        this.setParamSimple(map, prefix + "UnStructuredRule", this.UnStructuredRule);

    }
}

