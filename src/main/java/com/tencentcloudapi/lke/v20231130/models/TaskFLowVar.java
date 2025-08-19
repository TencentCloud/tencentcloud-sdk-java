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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFLowVar extends AbstractModel {

    /**
    * 变量ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VarId")
    @Expose
    private String VarId;

    /**
    * 变量名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VarName")
    @Expose
    private String VarName;

    /**
    * 变量描述（默认为"-"）
    */
    @SerializedName("VarDesc")
    @Expose
    private String VarDesc;

    /**
    * 变量类型 (STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)

    */
    @SerializedName("VarType")
    @Expose
    private String VarType;

    /**
    * 自定义变量默认值
    */
    @SerializedName("VarDefaultValue")
    @Expose
    private String VarDefaultValue;

    /**
    * 自定义变量文件默认名称
    */
    @SerializedName("VarDefaultFileName")
    @Expose
    private String VarDefaultFileName;

    /**
    * 变量类型
    */
    @SerializedName("VarModuleType")
    @Expose
    private Long VarModuleType;

    /**
     * Get 变量ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VarId 变量ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVarId() {
        return this.VarId;
    }

    /**
     * Set 变量ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VarId 变量ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVarId(String VarId) {
        this.VarId = VarId;
    }

    /**
     * Get 变量名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VarName 变量名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVarName() {
        return this.VarName;
    }

    /**
     * Set 变量名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VarName 变量名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVarName(String VarName) {
        this.VarName = VarName;
    }

    /**
     * Get 变量描述（默认为"-"） 
     * @return VarDesc 变量描述（默认为"-"）
     */
    public String getVarDesc() {
        return this.VarDesc;
    }

    /**
     * Set 变量描述（默认为"-"）
     * @param VarDesc 变量描述（默认为"-"）
     */
    public void setVarDesc(String VarDesc) {
        this.VarDesc = VarDesc;
    }

    /**
     * Get 变量类型 (STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)
 
     * @return VarType 变量类型 (STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)

     */
    public String getVarType() {
        return this.VarType;
    }

    /**
     * Set 变量类型 (STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)

     * @param VarType 变量类型 (STRING,INT,FLOAT,BOOL,OBJECT,ARRAY_STRING,ARRAY_INT,ARRAY_FLOAT,ARRAY_BOOL,ARRAY_OBJECT,FILE,DOCUMENT,IMAGE,AUDIO)

     */
    public void setVarType(String VarType) {
        this.VarType = VarType;
    }

    /**
     * Get 自定义变量默认值 
     * @return VarDefaultValue 自定义变量默认值
     */
    public String getVarDefaultValue() {
        return this.VarDefaultValue;
    }

    /**
     * Set 自定义变量默认值
     * @param VarDefaultValue 自定义变量默认值
     */
    public void setVarDefaultValue(String VarDefaultValue) {
        this.VarDefaultValue = VarDefaultValue;
    }

    /**
     * Get 自定义变量文件默认名称 
     * @return VarDefaultFileName 自定义变量文件默认名称
     */
    public String getVarDefaultFileName() {
        return this.VarDefaultFileName;
    }

    /**
     * Set 自定义变量文件默认名称
     * @param VarDefaultFileName 自定义变量文件默认名称
     */
    public void setVarDefaultFileName(String VarDefaultFileName) {
        this.VarDefaultFileName = VarDefaultFileName;
    }

    /**
     * Get 变量类型 
     * @return VarModuleType 变量类型
     */
    public Long getVarModuleType() {
        return this.VarModuleType;
    }

    /**
     * Set 变量类型
     * @param VarModuleType 变量类型
     */
    public void setVarModuleType(Long VarModuleType) {
        this.VarModuleType = VarModuleType;
    }

    public TaskFLowVar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFLowVar(TaskFLowVar source) {
        if (source.VarId != null) {
            this.VarId = new String(source.VarId);
        }
        if (source.VarName != null) {
            this.VarName = new String(source.VarName);
        }
        if (source.VarDesc != null) {
            this.VarDesc = new String(source.VarDesc);
        }
        if (source.VarType != null) {
            this.VarType = new String(source.VarType);
        }
        if (source.VarDefaultValue != null) {
            this.VarDefaultValue = new String(source.VarDefaultValue);
        }
        if (source.VarDefaultFileName != null) {
            this.VarDefaultFileName = new String(source.VarDefaultFileName);
        }
        if (source.VarModuleType != null) {
            this.VarModuleType = new Long(source.VarModuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VarId", this.VarId);
        this.setParamSimple(map, prefix + "VarName", this.VarName);
        this.setParamSimple(map, prefix + "VarDesc", this.VarDesc);
        this.setParamSimple(map, prefix + "VarType", this.VarType);
        this.setParamSimple(map, prefix + "VarDefaultValue", this.VarDefaultValue);
        this.setParamSimple(map, prefix + "VarDefaultFileName", this.VarDefaultFileName);
        this.setParamSimple(map, prefix + "VarModuleType", this.VarModuleType);

    }
}

