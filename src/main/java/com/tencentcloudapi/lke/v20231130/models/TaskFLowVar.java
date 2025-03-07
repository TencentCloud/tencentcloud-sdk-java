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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VarId", this.VarId);
        this.setParamSimple(map, prefix + "VarName", this.VarName);
        this.setParamSimple(map, prefix + "VarDesc", this.VarDesc);
        this.setParamSimple(map, prefix + "VarType", this.VarType);

    }
}

