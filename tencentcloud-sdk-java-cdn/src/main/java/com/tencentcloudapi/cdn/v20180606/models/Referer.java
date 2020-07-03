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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Referer extends AbstractModel{

    /**
    * referer 黑白名单配置开关
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * referer 黑白名单配置规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefererRules")
    @Expose
    private RefererRule [] RefererRules;

    /**
     * Get referer 黑白名单配置开关
on：开启
off：关闭 
     * @return Switch referer 黑白名单配置开关
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set referer 黑白名单配置开关
on：开启
off：关闭
     * @param Switch referer 黑白名单配置开关
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get referer 黑白名单配置规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefererRules referer 黑白名单配置规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RefererRule [] getRefererRules() {
        return this.RefererRules;
    }

    /**
     * Set referer 黑白名单配置规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefererRules referer 黑白名单配置规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefererRules(RefererRule [] RefererRules) {
        this.RefererRules = RefererRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RefererRules.", this.RefererRules);

    }
}

