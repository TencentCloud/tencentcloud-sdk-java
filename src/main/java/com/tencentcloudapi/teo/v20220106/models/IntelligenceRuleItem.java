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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceRuleItem extends AbstractModel{

    /**
    * 智能分析标签。
1. evil_bot 恶意
2. suspect_bot 疑似恶意
3. good_bot 好的
4. normal 正常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 触发智能分析标签对应的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 监控
4. alg Javascript挑战
5. captcha 数字验证码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 智能分析标签。
1. evil_bot 恶意
2. suspect_bot 疑似恶意
3. good_bot 好的
4. normal 正常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 智能分析标签。
1. evil_bot 恶意
2. suspect_bot 疑似恶意
3. good_bot 好的
4. normal 正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 智能分析标签。
1. evil_bot 恶意
2. suspect_bot 疑似恶意
3. good_bot 好的
4. normal 正常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 智能分析标签。
1. evil_bot 恶意
2. suspect_bot 疑似恶意
3. good_bot 好的
4. normal 正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 触发智能分析标签对应的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 监控
4. alg Javascript挑战
5. captcha 数字验证码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 触发智能分析标签对应的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 监控
4. alg Javascript挑战
5. captcha 数字验证码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 触发智能分析标签对应的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 监控
4. alg Javascript挑战
5. captcha 数字验证码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 触发智能分析标签对应的处置方式。
1. drop 拦截
2. trans 放行
3. monitor 监控
4. alg Javascript挑战
5. captcha 数字验证码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public IntelligenceRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRuleItem(IntelligenceRuleItem source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

