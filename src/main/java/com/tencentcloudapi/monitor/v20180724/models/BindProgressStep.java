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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindProgressStep extends AbstractModel {

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedMsg")
    @Expose
    private String FailedMsg;

    /**
    * 状态
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 任务进程
"prepare_env"   // 准备环境,安装instance EKS
"check_target"  // 检查target是否为running
"install_crd"   // 安装需要测crd
"install_rbac"  // 安装rbac
"install_agent" // 安装agent
"install_cr"    // 安装prometheus CR
"install_basic" // 安装基础采集信息，标记target状态为normal
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndAt 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndAt 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedMsg() {
        return this.FailedMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedMsg(String FailedMsg) {
        this.FailedMsg = FailedMsg;
    }

    /**
     * Get 状态 
     * @return LifeState 状态
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 状态
     * @param LifeState 状态
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartAt 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartAt 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 任务进程
"prepare_env"   // 准备环境,安装instance EKS
"check_target"  // 检查target是否为running
"install_crd"   // 安装需要测crd
"install_rbac"  // 安装rbac
"install_agent" // 安装agent
"install_cr"    // 安装prometheus CR
"install_basic" // 安装基础采集信息，标记target状态为normal 
     * @return Step 任务进程
"prepare_env"   // 准备环境,安装instance EKS
"check_target"  // 检查target是否为running
"install_crd"   // 安装需要测crd
"install_rbac"  // 安装rbac
"install_agent" // 安装agent
"install_cr"    // 安装prometheus CR
"install_basic" // 安装基础采集信息，标记target状态为normal
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set 任务进程
"prepare_env"   // 准备环境,安装instance EKS
"check_target"  // 检查target是否为running
"install_crd"   // 安装需要测crd
"install_rbac"  // 安装rbac
"install_agent" // 安装agent
"install_cr"    // 安装prometheus CR
"install_basic" // 安装基础采集信息，标记target状态为normal
     * @param Step 任务进程
"prepare_env"   // 准备环境,安装instance EKS
"check_target"  // 检查target是否为running
"install_crd"   // 安装需要测crd
"install_rbac"  // 安装rbac
"install_agent" // 安装agent
"install_cr"    // 安装prometheus CR
"install_basic" // 安装基础采集信息，标记target状态为normal
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    public BindProgressStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindProgressStep(BindProgressStep source) {
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.FailedMsg != null) {
            this.FailedMsg = new String(source.FailedMsg);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "FailedMsg", this.FailedMsg);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

