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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorItemV2 extends AbstractModel{

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Item")
    @Expose
    private BaseItem Item;

    /**
    * 英文编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private BaseItem Code;

    /**
    * 结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private BaseItem Result;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private BaseItem Unit;

    /**
    * 参考范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Range")
    @Expose
    private BaseItem Range;

    /**
    * 上下箭头
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Arrow")
    @Expose
    private BaseItem Arrow;

    /**
    * 检测方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private BaseItem Method;

    /**
    * 结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Normal")
    @Expose
    private Boolean Normal;

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 推测结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InferNormal")
    @Expose
    private String InferNormal;

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Item 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getItem() {
        return this.Item;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Item 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItem(BaseItem Item) {
        this.Item = Item;
    }

    /**
     * Get 英文编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 英文编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getCode() {
        return this.Code;
    }

    /**
     * Set 英文编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 英文编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(BaseItem Code) {
        this.Code = Code;
    }

    /**
     * Get 结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getResult() {
        return this.Result;
    }

    /**
     * Set 结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(BaseItem Result) {
        this.Result = Result;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(BaseItem Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 参考范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Range 参考范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getRange() {
        return this.Range;
    }

    /**
     * Set 参考范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Range 参考范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRange(BaseItem Range) {
        this.Range = Range;
    }

    /**
     * Get 上下箭头
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Arrow 上下箭头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getArrow() {
        return this.Arrow;
    }

    /**
     * Set 上下箭头
注意：此字段可能返回 null，表示取不到有效值。
     * @param Arrow 上下箭头
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArrow(BaseItem Arrow) {
        this.Arrow = Arrow;
    }

    /**
     * Get 检测方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 检测方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getMethod() {
        return this.Method;
    }

    /**
     * Set 检测方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 检测方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(BaseItem Method) {
        this.Method = Method;
    }

    /**
     * Get 结果是否异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Normal 结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNormal() {
        return this.Normal;
    }

    /**
     * Set 结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Normal 结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormal(Boolean Normal) {
        this.Normal = Normal;
    }

    /**
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order 序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order 序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 推测结果是否异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InferNormal 推测结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInferNormal() {
        return this.InferNormal;
    }

    /**
     * Set 推测结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param InferNormal 推测结果是否异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInferNormal(String InferNormal) {
        this.InferNormal = InferNormal;
    }

    public IndicatorItemV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorItemV2(IndicatorItemV2 source) {
        if (source.Item != null) {
            this.Item = new BaseItem(source.Item);
        }
        if (source.Code != null) {
            this.Code = new BaseItem(source.Code);
        }
        if (source.Result != null) {
            this.Result = new BaseItem(source.Result);
        }
        if (source.Unit != null) {
            this.Unit = new BaseItem(source.Unit);
        }
        if (source.Range != null) {
            this.Range = new BaseItem(source.Range);
        }
        if (source.Arrow != null) {
            this.Arrow = new BaseItem(source.Arrow);
        }
        if (source.Method != null) {
            this.Method = new BaseItem(source.Method);
        }
        if (source.Normal != null) {
            this.Normal = new Boolean(source.Normal);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InferNormal != null) {
            this.InferNormal = new String(source.InferNormal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamObj(map, prefix + "Unit.", this.Unit);
        this.setParamObj(map, prefix + "Range.", this.Range);
        this.setParamObj(map, prefix + "Arrow.", this.Arrow);
        this.setParamObj(map, prefix + "Method.", this.Method);
        this.setParamSimple(map, prefix + "Normal", this.Normal);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "InferNormal", this.InferNormal);

    }
}

