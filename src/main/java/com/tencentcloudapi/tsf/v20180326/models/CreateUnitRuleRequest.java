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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUnitRuleRequest extends AbstractModel{

    /**
    * 网关实体ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则项列表
    */
    @SerializedName("UnitRuleItemList")
    @Expose
    private UnitRuleItem [] UnitRuleItemList;

    /**
     * Get 网关实体ID 
     * @return GatewayInstanceId 网关实体ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
     * @param GatewayInstanceId 网关实体ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 规则项列表 
     * @return UnitRuleItemList 规则项列表
     */
    public UnitRuleItem [] getUnitRuleItemList() {
        return this.UnitRuleItemList;
    }

    /**
     * Set 规则项列表
     * @param UnitRuleItemList 规则项列表
     */
    public void setUnitRuleItemList(UnitRuleItem [] UnitRuleItemList) {
        this.UnitRuleItemList = UnitRuleItemList;
    }

    public CreateUnitRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUnitRuleRequest(CreateUnitRuleRequest source) {
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UnitRuleItemList != null) {
            this.UnitRuleItemList = new UnitRuleItem[source.UnitRuleItemList.length];
            for (int i = 0; i < source.UnitRuleItemList.length; i++) {
                this.UnitRuleItemList[i] = new UnitRuleItem(source.UnitRuleItemList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "UnitRuleItemList.", this.UnitRuleItemList);

    }
}

