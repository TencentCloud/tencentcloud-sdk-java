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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIsolateTableRequest extends AbstractModel {

    /**
    * <p>操作动作，仅接受精确值 edit 或 delete。ButtonAction 为 edit 时修改该资产所有匹配隔离记录的有效期，需传 StartTime 和 EndTime；ButtonAction 为 delete 时解除该资产的全部匹配隔离，StartTime 和 EndTime 可省略。</p>
    */
    @SerializedName("ButtonAction")
    @Expose
    private String ButtonAction;

    /**
    * <p>必填的资产实例 ID。调用 DescribeCfwRules，传 RuleType=intrusion_prevention、ListType=isolate 和目标 InstanceId，并使用完全匹配的 rules[].instance_id。edit 或 delete 作用于该实例的全部隔离记录。</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>隔离结束时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得早于 StartTime；除永久隔离值 3000-01-01 00:00:00 外，必须晚于当前时间。ButtonAction 为 delete 时可省略。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>隔离起始时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得晚于 EndTime；该时间将应用于该实例的全部匹配隔离记录。ButtonAction 为 delete 时可省略。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get <p>操作动作，仅接受精确值 edit 或 delete。ButtonAction 为 edit 时修改该资产所有匹配隔离记录的有效期，需传 StartTime 和 EndTime；ButtonAction 为 delete 时解除该资产的全部匹配隔离，StartTime 和 EndTime 可省略。</p> 
     * @return ButtonAction <p>操作动作，仅接受精确值 edit 或 delete。ButtonAction 为 edit 时修改该资产所有匹配隔离记录的有效期，需传 StartTime 和 EndTime；ButtonAction 为 delete 时解除该资产的全部匹配隔离，StartTime 和 EndTime 可省略。</p>
     */
    public String getButtonAction() {
        return this.ButtonAction;
    }

    /**
     * Set <p>操作动作，仅接受精确值 edit 或 delete。ButtonAction 为 edit 时修改该资产所有匹配隔离记录的有效期，需传 StartTime 和 EndTime；ButtonAction 为 delete 时解除该资产的全部匹配隔离，StartTime 和 EndTime 可省略。</p>
     * @param ButtonAction <p>操作动作，仅接受精确值 edit 或 delete。ButtonAction 为 edit 时修改该资产所有匹配隔离记录的有效期，需传 StartTime 和 EndTime；ButtonAction 为 delete 时解除该资产的全部匹配隔离，StartTime 和 EndTime 可省略。</p>
     */
    public void setButtonAction(String ButtonAction) {
        this.ButtonAction = ButtonAction;
    }

    /**
     * Get <p>必填的资产实例 ID。调用 DescribeCfwRules，传 RuleType=intrusion_prevention、ListType=isolate 和目标 InstanceId，并使用完全匹配的 rules[].instance_id。edit 或 delete 作用于该实例的全部隔离记录。</p> 
     * @return InstanceID <p>必填的资产实例 ID。调用 DescribeCfwRules，传 RuleType=intrusion_prevention、ListType=isolate 和目标 InstanceId，并使用完全匹配的 rules[].instance_id。edit 或 delete 作用于该实例的全部隔离记录。</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>必填的资产实例 ID。调用 DescribeCfwRules，传 RuleType=intrusion_prevention、ListType=isolate 和目标 InstanceId，并使用完全匹配的 rules[].instance_id。edit 或 delete 作用于该实例的全部隔离记录。</p>
     * @param InstanceID <p>必填的资产实例 ID。调用 DescribeCfwRules，传 RuleType=intrusion_prevention、ListType=isolate 和目标 InstanceId，并使用完全匹配的 rules[].instance_id。edit 或 delete 作用于该实例的全部隔离记录。</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>隔离结束时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得早于 StartTime；除永久隔离值 3000-01-01 00:00:00 外，必须晚于当前时间。ButtonAction 为 delete 时可省略。</p> 
     * @return EndTime <p>隔离结束时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得早于 StartTime；除永久隔离值 3000-01-01 00:00:00 外，必须晚于当前时间。ButtonAction 为 delete 时可省略。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>隔离结束时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得早于 StartTime；除永久隔离值 3000-01-01 00:00:00 外，必须晚于当前时间。ButtonAction 为 delete 时可省略。</p>
     * @param EndTime <p>隔离结束时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得早于 StartTime；除永久隔离值 3000-01-01 00:00:00 外，必须晚于当前时间。ButtonAction 为 delete 时可省略。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>隔离起始时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得晚于 EndTime；该时间将应用于该实例的全部匹配隔离记录。ButtonAction 为 delete 时可省略。</p> 
     * @return StartTime <p>隔离起始时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得晚于 EndTime；该时间将应用于该实例的全部匹配隔离记录。ButtonAction 为 delete 时可省略。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>隔离起始时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得晚于 EndTime；该时间将应用于该实例的全部匹配隔离记录。ButtonAction 为 delete 时可省略。</p>
     * @param StartTime <p>隔离起始时间。ButtonAction 为 edit 时必填，格式为 YYYY-MM-DD HH:MM:SS，且不得晚于 EndTime；该时间将应用于该实例的全部匹配隔离记录。ButtonAction 为 delete 时可省略。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public ModifyIsolateTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIsolateTableRequest(ModifyIsolateTableRequest source) {
        if (source.ButtonAction != null) {
            this.ButtonAction = new String(source.ButtonAction);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ButtonAction", this.ButtonAction);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

