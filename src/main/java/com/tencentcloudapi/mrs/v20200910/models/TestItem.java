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

public class TestItem extends AbstractModel{

    /**
    * 标准名称编号，利用该编号可以获取详细的指标含义和解释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 英文名称或简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 项目指标名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检验结果值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 正常结果范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * 指标单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Util")
    @Expose
    private String Util;

    /**
    * 是否正常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNormal")
    @Expose
    private Boolean IsNormal;

    /**
    * 是否超标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExceed")
    @Expose
    private Boolean IsExceed;

    /**
     * Get 标准名称编号，利用该编号可以获取详细的指标含义和解释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 标准名称编号，利用该编号可以获取详细的指标含义和解释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 标准名称编号，利用该编号可以获取详细的指标含义和解释
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 标准名称编号，利用该编号可以获取详细的指标含义和解释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 英文名称或简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 英文名称或简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 英文名称或简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 英文名称或简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 项目指标名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 项目指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目指标名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 项目指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检验结果值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 检验结果值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 检验结果值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 检验结果值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 正常结果范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Range 正常结果范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set 正常结果范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Range 正常结果范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get 指标单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Util 指标单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUtil() {
        return this.Util;
    }

    /**
     * Set 指标单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Util 指标单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUtil(String Util) {
        this.Util = Util;
    }

    /**
     * Get 是否正常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNormal 是否正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNormal() {
        return this.IsNormal;
    }

    /**
     * Set 是否正常
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNormal 是否正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNormal(Boolean IsNormal) {
        this.IsNormal = IsNormal;
    }

    /**
     * Get 是否超标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExceed 是否超标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExceed() {
        return this.IsExceed;
    }

    /**
     * Set 是否超标
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExceed 是否超标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExceed(Boolean IsExceed) {
        this.IsExceed = IsExceed;
    }

    public TestItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestItem(TestItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
        if (source.Util != null) {
            this.Util = new String(source.Util);
        }
        if (source.IsNormal != null) {
            this.IsNormal = new Boolean(source.IsNormal);
        }
        if (source.IsExceed != null) {
            this.IsExceed = new Boolean(source.IsExceed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Range", this.Range);
        this.setParamSimple(map, prefix + "Util", this.Util);
        this.setParamSimple(map, prefix + "IsNormal", this.IsNormal);
        this.setParamSimple(map, prefix + "IsExceed", this.IsExceed);

    }
}

