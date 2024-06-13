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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueUnitItem extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Item")
    @Expose
    private PhysicalBaseItem Item;

    /**
    * 数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private PhysicalBaseItem Result;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private PhysicalBaseItem Unit;

    /**
    * 数据在原PDF文件中的第几页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Item 项目原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PhysicalBaseItem getItem() {
        return this.Item;
    }

    /**
     * Set 项目原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Item 项目原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItem(PhysicalBaseItem Item) {
        this.Item = Item;
    }

    /**
     * Get 数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PhysicalBaseItem getResult() {
        return this.Result;
    }

    /**
     * Set 数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(PhysicalBaseItem Result) {
        this.Result = Result;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PhysicalBaseItem getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(PhysicalBaseItem Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 数据在原PDF文件中的第几页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Page 数据在原PDF文件中的第几页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
注意：此字段可能返回 null，表示取不到有效值。
     * @param Page 数据在原PDF文件中的第几页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public ValueUnitItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueUnitItem(ValueUnitItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Item != null) {
            this.Item = new PhysicalBaseItem(source.Item);
        }
        if (source.Result != null) {
            this.Result = new PhysicalBaseItem(source.Result);
        }
        if (source.Unit != null) {
            this.Unit = new PhysicalBaseItem(source.Unit);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamObj(map, prefix + "Unit.", this.Unit);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

