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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenInstanceInfo extends AbstractModel{

    /**
    * 统计标示 0：全部、1：当前天、2：昨天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountTag")
    @Expose
    private Long CountTag;

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 运行中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningNum")
    @Expose
    private Long RunningNum;

    /**
    * 等待运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitRunningNum")
    @Expose
    private Long WaitRunningNum;

    /**
    * 等待上游
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyNum")
    @Expose
    private Long DependencyNum;

    /**
    * 等待事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitEventNum")
    @Expose
    private String WaitEventNum;

    /**
    * 正在终止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppingNum")
    @Expose
    private Long StoppingNum;

    /**
    * 成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SucceedNum")
    @Expose
    private Long SucceedNum;

    /**
    * 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedNum")
    @Expose
    private Long FailedNum;

    /**
     * Get 统计标示 0：全部、1：当前天、2：昨天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountTag 统计标示 0：全部、1：当前天、2：昨天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountTag() {
        return this.CountTag;
    }

    /**
     * Set 统计标示 0：全部、1：当前天、2：昨天
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountTag 统计标示 0：全部、1：当前天、2：昨天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountTag(Long CountTag) {
        this.CountTag = CountTag;
    }

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 运行中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningNum 运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningNum() {
        return this.RunningNum;
    }

    /**
     * Set 运行中
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningNum 运行中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningNum(Long RunningNum) {
        this.RunningNum = RunningNum;
    }

    /**
     * Get 等待运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitRunningNum 等待运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitRunningNum() {
        return this.WaitRunningNum;
    }

    /**
     * Set 等待运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitRunningNum 等待运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitRunningNum(Long WaitRunningNum) {
        this.WaitRunningNum = WaitRunningNum;
    }

    /**
     * Get 等待上游
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyNum 等待上游
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDependencyNum() {
        return this.DependencyNum;
    }

    /**
     * Set 等待上游
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyNum 等待上游
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyNum(Long DependencyNum) {
        this.DependencyNum = DependencyNum;
    }

    /**
     * Get 等待事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitEventNum 等待事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaitEventNum() {
        return this.WaitEventNum;
    }

    /**
     * Set 等待事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitEventNum 等待事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitEventNum(String WaitEventNum) {
        this.WaitEventNum = WaitEventNum;
    }

    /**
     * Get 正在终止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppingNum 正在终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStoppingNum() {
        return this.StoppingNum;
    }

    /**
     * Set 正在终止
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppingNum 正在终止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppingNum(Long StoppingNum) {
        this.StoppingNum = StoppingNum;
    }

    /**
     * Get 成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SucceedNum 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSucceedNum() {
        return this.SucceedNum;
    }

    /**
     * Set 成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param SucceedNum 成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSucceedNum(Long SucceedNum) {
        this.SucceedNum = SucceedNum;
    }

    /**
     * Get 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedNum 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedNum() {
        return this.FailedNum;
    }

    /**
     * Set 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedNum 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedNum(Long FailedNum) {
        this.FailedNum = FailedNum;
    }

    public ScreenInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenInstanceInfo(ScreenInstanceInfo source) {
        if (source.CountTag != null) {
            this.CountTag = new Long(source.CountTag);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RunningNum != null) {
            this.RunningNum = new Long(source.RunningNum);
        }
        if (source.WaitRunningNum != null) {
            this.WaitRunningNum = new Long(source.WaitRunningNum);
        }
        if (source.DependencyNum != null) {
            this.DependencyNum = new Long(source.DependencyNum);
        }
        if (source.WaitEventNum != null) {
            this.WaitEventNum = new String(source.WaitEventNum);
        }
        if (source.StoppingNum != null) {
            this.StoppingNum = new Long(source.StoppingNum);
        }
        if (source.SucceedNum != null) {
            this.SucceedNum = new Long(source.SucceedNum);
        }
        if (source.FailedNum != null) {
            this.FailedNum = new Long(source.FailedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountTag", this.CountTag);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RunningNum", this.RunningNum);
        this.setParamSimple(map, prefix + "WaitRunningNum", this.WaitRunningNum);
        this.setParamSimple(map, prefix + "DependencyNum", this.DependencyNum);
        this.setParamSimple(map, prefix + "WaitEventNum", this.WaitEventNum);
        this.setParamSimple(map, prefix + "StoppingNum", this.StoppingNum);
        this.setParamSimple(map, prefix + "SucceedNum", this.SucceedNum);
        this.setParamSimple(map, prefix + "FailedNum", this.FailedNum);

    }
}

