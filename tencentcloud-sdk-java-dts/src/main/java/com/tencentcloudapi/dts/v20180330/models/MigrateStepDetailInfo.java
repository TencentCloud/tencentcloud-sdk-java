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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateStepDetailInfo extends AbstractModel{

    /**
    * 步骤序列
    */
    @SerializedName("StepNo")
    @Expose
    private Long StepNo;

    /**
    * 步骤展现名称
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 步骤英文标识
    */
    @SerializedName("StepId")
    @Expose
    private String StepId;

    /**
    * 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 步骤序列 
     * @return StepNo 步骤序列
     */
    public Long getStepNo() {
        return this.StepNo;
    }

    /**
     * Set 步骤序列
     * @param StepNo 步骤序列
     */
    public void setStepNo(Long StepNo) {
        this.StepNo = StepNo;
    }

    /**
     * Get 步骤展现名称 
     * @return StepName 步骤展现名称
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤展现名称
     * @param StepName 步骤展现名称
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 步骤英文标识 
     * @return StepId 步骤英文标识
     */
    public String getStepId() {
        return this.StepId;
    }

    /**
     * Set 步骤英文标识
     * @param StepId 步骤英文标识
     */
    public void setStepId(String StepId) {
        this.StepId = StepId;
    }

    /**
     * Get 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行 
     * @return Status 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     * @param Status 步骤状态:0-默认值,1-成功,2-失败,3-执行中,4-未执行
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 当前步骤开始的时间，格式为"yyyy-mm-dd hh:mm:ss"，该字段不存在或者为空是无意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepNo", this.StepNo);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "StepId", this.StepId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

