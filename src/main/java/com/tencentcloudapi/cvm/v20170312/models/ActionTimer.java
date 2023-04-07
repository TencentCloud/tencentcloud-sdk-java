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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionTimer extends AbstractModel{

    /**
    * 定时器动作，目前仅支持销毁一个值：TerminateInstances。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * 扩展数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
     * Get 定时器动作，目前仅支持销毁一个值：TerminateInstances。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimerAction 定时器动作，目前仅支持销毁一个值：TerminateInstances。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set 定时器动作，目前仅支持销毁一个值：TerminateInstances。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimerAction 定时器动作，目前仅支持销毁一个值：TerminateInstances。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionTime 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionTime 执行时间，按照ISO8601标准表示，并且使用UTC时间。格式为 YYYY-MM-DDThh:mm:ssZ。例如 2018-05-29T11:26:40Z，执行时间必须大于当前时间5分钟。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get 扩展数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Externals 扩展数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set 扩展数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Externals 扩展数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    public ActionTimer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionTimer(ActionTimer source) {
        if (source.TimerAction != null) {
            this.TimerAction = new String(source.TimerAction);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.Externals != null) {
            this.Externals = new Externals(source.Externals);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamObj(map, prefix + "Externals.", this.Externals);

    }
}

