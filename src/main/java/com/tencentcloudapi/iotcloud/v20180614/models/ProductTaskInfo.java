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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductTaskInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务类型 0-批量创建设备类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 任务状态 0-创建中 1-待执行 2-执行中 3-执行失败 4-子任务部分失败 5-执行成功
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 任务参数类型 cosfile-文件输入 random-随机生成
    */
    @SerializedName("ParametersType")
    @Expose
    private String ParametersType;

    /**
    * 任务参数
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 任务执行结果类型 cosfile-文件输出 errmsg-错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 子任务总个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchCount")
    @Expose
    private Long BatchCount;

    /**
    * 子任务已执行个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchOffset")
    @Expose
    private Long BatchOffset;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompleteTime")
    @Expose
    private Long CompleteTime;

    /**
     * Get 任务ID 
     * @return Id 任务ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务ID
     * @param Id 任务ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务类型 0-批量创建设备类型 
     * @return Type 任务类型 0-批量创建设备类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 任务类型 0-批量创建设备类型
     * @param Type 任务类型 0-批量创建设备类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 任务状态 0-创建中 1-待执行 2-执行中 3-执行失败 4-子任务部分失败 5-执行成功 
     * @return State 任务状态 0-创建中 1-待执行 2-执行中 3-执行失败 4-子任务部分失败 5-执行成功
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态 0-创建中 1-待执行 2-执行中 3-执行失败 4-子任务部分失败 5-执行成功
     * @param State 任务状态 0-创建中 1-待执行 2-执行中 3-执行失败 4-子任务部分失败 5-执行成功
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 任务参数类型 cosfile-文件输入 random-随机生成 
     * @return ParametersType 任务参数类型 cosfile-文件输入 random-随机生成
     */
    public String getParametersType() {
        return this.ParametersType;
    }

    /**
     * Set 任务参数类型 cosfile-文件输入 random-随机生成
     * @param ParametersType 任务参数类型 cosfile-文件输入 random-随机生成
     */
    public void setParametersType(String ParametersType) {
        this.ParametersType = ParametersType;
    }

    /**
     * Get 任务参数 
     * @return Parameters 任务参数
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 任务参数
     * @param Parameters 任务参数
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 任务执行结果类型 cosfile-文件输出 errmsg-错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultType 任务执行结果类型 cosfile-文件输出 errmsg-错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set 任务执行结果类型 cosfile-文件输出 errmsg-错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultType 任务执行结果类型 cosfile-文件输出 errmsg-错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 子任务总个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchCount 子任务总个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchCount() {
        return this.BatchCount;
    }

    /**
     * Set 子任务总个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchCount 子任务总个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchCount(Long BatchCount) {
        this.BatchCount = BatchCount;
    }

    /**
     * Get 子任务已执行个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchOffset 子任务已执行个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchOffset() {
        return this.BatchOffset;
    }

    /**
     * Set 子任务已执行个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchOffset 子任务已执行个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchOffset(Long BatchOffset) {
        this.BatchOffset = BatchOffset;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务更新时间 
     * @return UpdateTime 任务更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 任务更新时间
     * @param UpdateTime 任务更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompleteTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompleteTime() {
        return this.CompleteTime;
    }

    /**
     * Set 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompleteTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleteTime(Long CompleteTime) {
        this.CompleteTime = CompleteTime;
    }

    public ProductTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductTaskInfo(ProductTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.ParametersType != null) {
            this.ParametersType = new String(source.ParametersType);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.BatchCount != null) {
            this.BatchCount = new Long(source.BatchCount);
        }
        if (source.BatchOffset != null) {
            this.BatchOffset = new Long(source.BatchOffset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.CompleteTime != null) {
            this.CompleteTime = new Long(source.CompleteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ParametersType", this.ParametersType);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "BatchCount", this.BatchCount);
        this.setParamSimple(map, prefix + "BatchOffset", this.BatchOffset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CompleteTime", this.CompleteTime);

    }
}

