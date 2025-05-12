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

public class InOutputUCBRuleEntry extends AbstractModel {

    /**
    * 键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 操作符
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private UCBEntryValue Value;

    /**
    * 可选的补充操作符
    */
    @SerializedName("OpOp")
    @Expose
    private String OpOp;

    /**
    * 可选的补充参数
    */
    @SerializedName("OpArg")
    @Expose
    private String [] OpArg;

    /**
    * 可选的补充值
    */
    @SerializedName("OpValue")
    @Expose
    private Float OpValue;

    /**
    * Header参数值时使用
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区域选择
    */
    @SerializedName("Areas")
    @Expose
    private Area [] Areas;

    /**
    * 语言环境
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * 参数匹配
    */
    @SerializedName("ParamCompareList")
    @Expose
    private ParamCompareList [] ParamCompareList;

    /**
     * Get 键 
     * @return Key 键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键
     * @param Key 键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 操作符 
     * @return Op 操作符
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 操作符
     * @param Op 操作符
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public UCBEntryValue getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(UCBEntryValue Value) {
        this.Value = Value;
    }

    /**
     * Get 可选的补充操作符 
     * @return OpOp 可选的补充操作符
     */
    public String getOpOp() {
        return this.OpOp;
    }

    /**
     * Set 可选的补充操作符
     * @param OpOp 可选的补充操作符
     */
    public void setOpOp(String OpOp) {
        this.OpOp = OpOp;
    }

    /**
     * Get 可选的补充参数 
     * @return OpArg 可选的补充参数
     */
    public String [] getOpArg() {
        return this.OpArg;
    }

    /**
     * Set 可选的补充参数
     * @param OpArg 可选的补充参数
     */
    public void setOpArg(String [] OpArg) {
        this.OpArg = OpArg;
    }

    /**
     * Get 可选的补充值 
     * @return OpValue 可选的补充值
     */
    public Float getOpValue() {
        return this.OpValue;
    }

    /**
     * Set 可选的补充值
     * @param OpValue 可选的补充值
     */
    public void setOpValue(Float OpValue) {
        this.OpValue = OpValue;
    }

    /**
     * Get Header参数值时使用 
     * @return Name Header参数值时使用
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Header参数值时使用
     * @param Name Header参数值时使用
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区域选择 
     * @return Areas 区域选择
     */
    public Area [] getAreas() {
        return this.Areas;
    }

    /**
     * Set 区域选择
     * @param Areas 区域选择
     */
    public void setAreas(Area [] Areas) {
        this.Areas = Areas;
    }

    /**
     * Get 语言环境 
     * @return Lang 语言环境
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set 语言环境
     * @param Lang 语言环境
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get 参数匹配 
     * @return ParamCompareList 参数匹配
     */
    public ParamCompareList [] getParamCompareList() {
        return this.ParamCompareList;
    }

    /**
     * Set 参数匹配
     * @param ParamCompareList 参数匹配
     */
    public void setParamCompareList(ParamCompareList [] ParamCompareList) {
        this.ParamCompareList = ParamCompareList;
    }

    public InOutputUCBRuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InOutputUCBRuleEntry(InOutputUCBRuleEntry source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Value != null) {
            this.Value = new UCBEntryValue(source.Value);
        }
        if (source.OpOp != null) {
            this.OpOp = new String(source.OpOp);
        }
        if (source.OpArg != null) {
            this.OpArg = new String[source.OpArg.length];
            for (int i = 0; i < source.OpArg.length; i++) {
                this.OpArg[i] = new String(source.OpArg[i]);
            }
        }
        if (source.OpValue != null) {
            this.OpValue = new Float(source.OpValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Areas != null) {
            this.Areas = new Area[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new Area(source.Areas[i]);
            }
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.ParamCompareList != null) {
            this.ParamCompareList = new ParamCompareList[source.ParamCompareList.length];
            for (int i = 0; i < source.ParamCompareList.length; i++) {
                this.ParamCompareList[i] = new ParamCompareList(source.ParamCompareList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamObj(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "OpOp", this.OpOp);
        this.setParamArraySimple(map, prefix + "OpArg.", this.OpArg);
        this.setParamSimple(map, prefix + "OpValue", this.OpValue);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Areas.", this.Areas);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamArrayObj(map, prefix + "ParamCompareList.", this.ParamCompareList);

    }
}

