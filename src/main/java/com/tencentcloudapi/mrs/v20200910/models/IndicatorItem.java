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
    * <p>英文缩写</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>标准缩写</p>
    */
    @SerializedName("Scode")
    @Expose
    private String Scode;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标准名</p>
    */
    @SerializedName("Sname")
    @Expose
    private String Sname;

    /**
    * <p>结果</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>参考范围</p>
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * <p>上下箭头</p>
    */
    @SerializedName("Arrow")
    @Expose
    private String Arrow;

    /**
    * <p>是否正常</p>
    */
    @SerializedName("Normal")
    @Expose
    private Boolean Normal;

    /**
    * <p>项目原文</p>
    */
    @SerializedName("ItemString")
    @Expose
    private String ItemString;

    /**
    * <p>指标项ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>指标项坐标位置</p>
    */
    @SerializedName("Coords")
    @Expose
    private Coordinate Coords;

    /**
    * <p>推测结果是否异常</p>
    */
    @SerializedName("InferNormal")
    @Expose
    private String InferNormal;

    /**
    * <p>标本</p>
    */
    @SerializedName("Sample")
    @Expose
    private String Sample;

    /**
    * <p>检测方法</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>检验指标项坐标信息</p>
    */
    @SerializedName("ItemCoords")
    @Expose
    private ItemCoordinate ItemCoords;

    /**
     * Get <p>英文缩写</p> 
     * @return Code <p>英文缩写</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>英文缩写</p>
     * @param Code <p>英文缩写</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>标准缩写</p> 
     * @return Scode <p>标准缩写</p>
     */
    public String getScode() {
        return this.Scode;
    }

    /**
     * Set <p>标准缩写</p>
     * @param Scode <p>标准缩写</p>
     */
    public void setScode(String Scode) {
        this.Scode = Scode;
    }

    /**
     * Get <p>项目名称</p> 
     * @return Name <p>项目名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>项目名称</p>
     * @param Name <p>项目名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标准名</p> 
     * @return Sname <p>标准名</p>
     */
    public String getSname() {
        return this.Sname;
    }

    /**
     * Set <p>标准名</p>
     * @param Sname <p>标准名</p>
     */
    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    /**
     * Get <p>结果</p> 
     * @return Result <p>结果</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>结果</p>
     * @param Result <p>结果</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>单位</p> 
     * @return Unit <p>单位</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>单位</p>
     * @param Unit <p>单位</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>参考范围</p> 
     * @return Range <p>参考范围</p>
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set <p>参考范围</p>
     * @param Range <p>参考范围</p>
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get <p>上下箭头</p> 
     * @return Arrow <p>上下箭头</p>
     */
    public String getArrow() {
        return this.Arrow;
    }

    /**
     * Set <p>上下箭头</p>
     * @param Arrow <p>上下箭头</p>
     */
    public void setArrow(String Arrow) {
        this.Arrow = Arrow;
    }

    /**
     * Get <p>是否正常</p> 
     * @return Normal <p>是否正常</p>
     */
    public Boolean getNormal() {
        return this.Normal;
    }

    /**
     * Set <p>是否正常</p>
     * @param Normal <p>是否正常</p>
     */
    public void setNormal(Boolean Normal) {
        this.Normal = Normal;
    }

    /**
     * Get <p>项目原文</p> 
     * @return ItemString <p>项目原文</p>
     */
    public String getItemString() {
        return this.ItemString;
    }

    /**
     * Set <p>项目原文</p>
     * @param ItemString <p>项目原文</p>
     */
    public void setItemString(String ItemString) {
        this.ItemString = ItemString;
    }

    /**
     * Get <p>指标项ID</p> 
     * @return Id <p>指标项ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>指标项ID</p>
     * @param Id <p>指标项ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>指标项坐标位置</p> 
     * @return Coords <p>指标项坐标位置</p>
     * @deprecated
     */
    @Deprecated
    public Coordinate getCoords() {
        return this.Coords;
    }

    /**
     * Set <p>指标项坐标位置</p>
     * @param Coords <p>指标项坐标位置</p>
     * @deprecated
     */
    @Deprecated
    public void setCoords(Coordinate Coords) {
        this.Coords = Coords;
    }

    /**
     * Get <p>推测结果是否异常</p> 
     * @return InferNormal <p>推测结果是否异常</p>
     */
    public String getInferNormal() {
        return this.InferNormal;
    }

    /**
     * Set <p>推测结果是否异常</p>
     * @param InferNormal <p>推测结果是否异常</p>
     */
    public void setInferNormal(String InferNormal) {
        this.InferNormal = InferNormal;
    }

    /**
     * Get <p>标本</p> 
     * @return Sample <p>标本</p>
     */
    public String getSample() {
        return this.Sample;
    }

    /**
     * Set <p>标本</p>
     * @param Sample <p>标本</p>
     */
    public void setSample(String Sample) {
        this.Sample = Sample;
    }

    /**
     * Get <p>检测方法</p> 
     * @return Method <p>检测方法</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>检测方法</p>
     * @param Method <p>检测方法</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>检验指标项坐标信息</p> 
     * @return ItemCoords <p>检验指标项坐标信息</p>
     */
    public ItemCoordinate getItemCoords() {
        return this.ItemCoords;
    }

    /**
     * Set <p>检验指标项坐标信息</p>
     * @param ItemCoords <p>检验指标项坐标信息</p>
     */
    public void setItemCoords(ItemCoordinate ItemCoords) {
        this.ItemCoords = ItemCoords;
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
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.ItemCoords != null) {
            this.ItemCoords = new ItemCoordinate(source.ItemCoords);
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
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamObj(map, prefix + "ItemCoords.", this.ItemCoords);

    }
}

