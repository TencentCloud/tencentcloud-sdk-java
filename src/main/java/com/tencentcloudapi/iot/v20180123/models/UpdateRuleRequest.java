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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRuleRequest extends AbstractModel {

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private RuleQuery Query;

    /**
    * 转发动作列表
    */
    @SerializedName("Actions")
    @Expose
    private Action [] Actions;

    /**
    * 数据类型（0：文本，1：二进制）
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 查询 
     * @return Query 查询
     */
    public RuleQuery getQuery() {
        return this.Query;
    }

    /**
     * Set 查询
     * @param Query 查询
     */
    public void setQuery(RuleQuery Query) {
        this.Query = Query;
    }

    /**
     * Get 转发动作列表 
     * @return Actions 转发动作列表
     */
    public Action [] getActions() {
        return this.Actions;
    }

    /**
     * Set 转发动作列表
     * @param Actions 转发动作列表
     */
    public void setActions(Action [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 数据类型（0：文本，1：二进制） 
     * @return DataType 数据类型（0：文本，1：二进制）
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型（0：文本，1：二进制）
     * @param DataType 数据类型（0：文本，1：二进制）
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    public UpdateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRuleRequest(UpdateRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Query != null) {
            this.Query = new RuleQuery(source.Query);
        }
        if (source.Actions != null) {
            this.Actions = new Action[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Action(source.Actions[i]);
            }
        }
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Query.", this.Query);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

