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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SocComplianceItem extends AbstractModel{

    /**
    * 唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardItem")
    @Expose
    private String StandardItem;

    /**
    * 结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 产品字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProStr")
    @Expose
    private String ProStr;

    /**
    * 产品数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Production")
    @Expose
    private SocProductionItem [] Production;

    /**
    * 配置项数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckItems")
    @Expose
    private SocCheckItem [] CheckItems;

    /**
     * Get 唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Item 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Item 唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardItem 分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandardItem() {
        return this.StandardItem;
    }

    /**
     * Set 分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardItem 分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardItem(String StandardItem) {
        this.StandardItem = StandardItem;
    }

    /**
     * Get 结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 产品字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProStr 产品字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProStr() {
        return this.ProStr;
    }

    /**
     * Set 产品字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProStr 产品字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProStr(String ProStr) {
        this.ProStr = ProStr;
    }

    /**
     * Get 产品数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Production 产品数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SocProductionItem [] getProduction() {
        return this.Production;
    }

    /**
     * Set 产品数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Production 产品数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduction(SocProductionItem [] Production) {
        this.Production = Production;
    }

    /**
     * Get 配置项数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckItems 配置项数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SocCheckItem [] getCheckItems() {
        return this.CheckItems;
    }

    /**
     * Set 配置项数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckItems 配置项数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckItems(SocCheckItem [] CheckItems) {
        this.CheckItems = CheckItems;
    }

    public SocComplianceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SocComplianceItem(SocComplianceItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StandardItem != null) {
            this.StandardItem = new String(source.StandardItem);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.ProStr != null) {
            this.ProStr = new String(source.ProStr);
        }
        if (source.Production != null) {
            this.Production = new SocProductionItem[source.Production.length];
            for (int i = 0; i < source.Production.length; i++) {
                this.Production[i] = new SocProductionItem(source.Production[i]);
            }
        }
        if (source.CheckItems != null) {
            this.CheckItems = new SocCheckItem[source.CheckItems.length];
            for (int i = 0; i < source.CheckItems.length; i++) {
                this.CheckItems[i] = new SocCheckItem(source.CheckItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StandardItem", this.StandardItem);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "ProStr", this.ProStr);
        this.setParamArrayObj(map, prefix + "Production.", this.Production);
        this.setParamArrayObj(map, prefix + "CheckItems.", this.CheckItems);

    }
}

