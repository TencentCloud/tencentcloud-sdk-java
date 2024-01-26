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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterInfoDsDto extends AbstractModel {

    /**
    * 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 参数key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 参数类型project_self_constant,
project_self_data_variable,   project_self_run_variable,
    project_system,   workflow_self_constant,   workflow_self_data_variable,
workflow_self_run_variable,
workflow_system,
task
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * 参数归属
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamBelong")
    @Expose
    private String ParamBelong;

    /**
    * 参数周期运行值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDefine")
    @Expose
    private String ParamDefine;

    /**
    * 参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
    * 参数责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamOwner")
    @Expose
    private String ParamOwner;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 导入结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 参数调试运行值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDefineTest")
    @Expose
    private String ParamDefineTest;

    /**
    * 参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDescription")
    @Expose
    private String ParamDescription;

    /**
     * Get 唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 参数key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamKey 参数key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 参数key
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamKey 参数key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 参数类型project_self_constant,
project_self_data_variable,   project_self_run_variable,
    project_system,   workflow_self_constant,   workflow_self_data_variable,
workflow_self_run_variable,
workflow_system,
task
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamType 参数类型project_self_constant,
project_self_data_variable,   project_self_run_variable,
    project_system,   workflow_self_constant,   workflow_self_data_variable,
workflow_self_run_variable,
workflow_system,
task
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型project_self_constant,
project_self_data_variable,   project_self_run_variable,
    project_system,   workflow_self_constant,   workflow_self_data_variable,
workflow_self_run_variable,
workflow_system,
task
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamType 参数类型project_self_constant,
project_self_data_variable,   project_self_run_variable,
    project_system,   workflow_self_constant,   workflow_self_data_variable,
workflow_self_run_variable,
workflow_system,
task
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get 参数归属
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamBelong 参数归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamBelong() {
        return this.ParamBelong;
    }

    /**
     * Set 参数归属
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamBelong 参数归属
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamBelong(String ParamBelong) {
        this.ParamBelong = ParamBelong;
    }

    /**
     * Get 参数周期运行值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDefine 参数周期运行值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDefine() {
        return this.ParamDefine;
    }

    /**
     * Set 参数周期运行值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDefine 参数周期运行值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDefine(String ParamDefine) {
        this.ParamDefine = ParamDefine;
    }

    /**
     * Get 参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamValue 参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set 参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamValue 参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    /**
     * Get 参数责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamOwner 参数责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamOwner() {
        return this.ParamOwner;
    }

    /**
     * Set 参数责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamOwner 参数责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamOwner(String ParamOwner) {
        this.ParamOwner = ParamOwner;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 导入结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 导入结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 导入结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 导入结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 参数调试运行值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDefineTest 参数调试运行值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDefineTest() {
        return this.ParamDefineTest;
    }

    /**
     * Set 参数调试运行值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDefineTest 参数调试运行值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDefineTest(String ParamDefineTest) {
        this.ParamDefineTest = ParamDefineTest;
    }

    /**
     * Get 参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDescription 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDescription() {
        return this.ParamDescription;
    }

    /**
     * Set 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDescription 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDescription(String ParamDescription) {
        this.ParamDescription = ParamDescription;
    }

    public ParameterInfoDsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterInfoDsDto(ParameterInfoDsDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.ParamBelong != null) {
            this.ParamBelong = new String(source.ParamBelong);
        }
        if (source.ParamDefine != null) {
            this.ParamDefine = new String(source.ParamDefine);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
        if (source.ParamOwner != null) {
            this.ParamOwner = new String(source.ParamOwner);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.ParamDefineTest != null) {
            this.ParamDefineTest = new String(source.ParamDefineTest);
        }
        if (source.ParamDescription != null) {
            this.ParamDescription = new String(source.ParamDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "ParamBelong", this.ParamBelong);
        this.setParamSimple(map, prefix + "ParamDefine", this.ParamDefine);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);
        this.setParamSimple(map, prefix + "ParamOwner", this.ParamOwner);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "ParamDefineTest", this.ParamDefineTest);
        this.setParamSimple(map, prefix + "ParamDescription", this.ParamDescription);

    }
}

