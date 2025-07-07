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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorItem extends AbstractModel {

    /**
    * 英文缩写
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 标准缩写
    */
    @SerializedName("Scode")
    @Expose
    private String Scode;

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标准名
    */
    @SerializedName("Sname")
    @Expose
    private String Sname;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 参考范围
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * 上下箭头
    */
    @SerializedName("Arrow")
    @Expose
    private String Arrow;

    /**
    * 是否正常
    */
    @SerializedName("Normal")
    @Expose
    private Boolean Normal;

    /**
    * 项目原文
    */
    @SerializedName("ItemString")
    @Expose
    private String ItemString;

    /**
    * 指标项ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 指标项坐标位置
    */
    @SerializedName("Coords")
    @Expose
    private Coordinate Coords;

    /**
    * 推测结果是否异常
    */
    @SerializedName("InferNormal")
    @Expose
    private String InferNormal;

    /**
    * 标本
    */
    @SerializedName("Sample")
    @Expose
    private String Sample;

    /**
     * Get 英文缩写 
     * @return Code 英文缩写
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 英文缩写
     * @param Code 英文缩写
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 标准缩写 
     * @return Scode 标准缩写
     */
    public String getScode() {
        return this.Scode;
    }

    /**
     * Set 标准缩写
     * @param Scode 标准缩写
     */
    public void setScode(String Scode) {
        this.Scode = Scode;
    }

    /**
     * Get 项目名称 
     * @return Name 项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
     * @param Name 项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标准名 
     * @return Sname 标准名
     */
    public String getSname() {
        return this.Sname;
    }

    /**
     * Set 标准名
     * @param Sname 标准名
     */
    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 参考范围 
     * @return Range 参考范围
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set 参考范围
     * @param Range 参考范围
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get 上下箭头 
     * @return Arrow 上下箭头
     */
    public String getArrow() {
        return this.Arrow;
    }

    /**
     * Set 上下箭头
     * @param Arrow 上下箭头
     */
    public void setArrow(String Arrow) {
        this.Arrow = Arrow;
    }

    /**
     * Get 是否正常 
     * @return Normal 是否正常
     */
    public Boolean getNormal() {
        return this.Normal;
    }

    /**
     * Set 是否正常
     * @param Normal 是否正常
     */
    public void setNormal(Boolean Normal) {
        this.Normal = Normal;
    }

    /**
     * Get 项目原文 
     * @return ItemString 项目原文
     */
    public String getItemString() {
        return this.ItemString;
    }

    /**
     * Set 项目原文
     * @param ItemString 项目原文
     */
    public void setItemString(String ItemString) {
        this.ItemString = ItemString;
    }

    /**
     * Get 指标项ID 
     * @return Id 指标项ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 指标项ID
     * @param Id 指标项ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 指标项坐标位置 
     * @return Coords 指标项坐标位置
     */
    public Coordinate getCoords() {
        return this.Coords;
    }

    /**
     * Set 指标项坐标位置
     * @param Coords 指标项坐标位置
     */
    public void setCoords(Coordinate Coords) {
        this.Coords = Coords;
    }

    /**
     * Get 推测结果是否异常 
     * @return InferNormal 推测结果是否异常
     */
    public String getInferNormal() {
        return this.InferNormal;
    }

    /**
     * Set 推测结果是否异常
     * @param InferNormal 推测结果是否异常
     */
    public void setInferNormal(String InferNormal) {
        this.InferNormal = InferNormal;
    }

    /**
     * Get 标本 
     * @return Sample 标本
     */
    public String getSample() {
        return this.Sample;
    }

    /**
     * Set 标本
     * @param Sample 标本
     */
    public void setSample(String Sample) {
        this.Sample = Sample;
    }

    public IndicatorItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorItem(IndicatorItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Scode != null) {
            this.Scode = new String(source.Scode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sname != null) {
            this.Sname = new String(source.Sname);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
        if (source.Arrow != null) {
            this.Arrow = new String(source.Arrow);
        }
        if (source.Normal != null) {
            this.Normal = new Boolean(source.Normal);
        }
        if (source.ItemString != null) {
            this.ItemString = new String(source.ItemString);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Coords != null) {
            this.Coords = new Coordinate(source.Coords);
        }
        if (source.InferNormal != null) {
            this.InferNormal = new String(source.InferNormal);
        }
        if (source.Sample != null) {
            this.Sample = new String(source.Sample);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Scode", this.Scode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sname", this.Sname);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Range", this.Range);
        this.setParamSimple(map, prefix + "Arrow", this.Arrow);
        this.setParamSimple(map, prefix + "Normal", this.Normal);
        this.setParamSimple(map, prefix + "ItemString", this.ItemString);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Coords.", this.Coords);
        this.setParamSimple(map, prefix + "InferNormal", this.InferNormal);
        this.setParamSimple(map, prefix + "Sample", this.Sample);

    }
}

