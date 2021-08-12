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

public class UrlRedirect extends AbstractModel{

    /**
    * 访问URL重写配置开关
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 访问URL重写规则，当Switch为on时必填，规则数量最大为10个。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathRules")
    @Expose
    private UrlRedirectRule [] PathRules;

    /**
     * Get 访问URL重写配置开关
on：开启
off：关闭 
     * @return Switch 访问URL重写配置开关
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 访问URL重写配置开关
on：开启
off：关闭
     * @param Switch 访问URL重写配置开关
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 访问URL重写规则，当Switch为on时必填，规则数量最大为10个。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathRules 访问URL重写规则，当Switch为on时必填，规则数量最大为10个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UrlRedirectRule [] getPathRules() {
        return this.PathRules;
    }

    /**
     * Set 访问URL重写规则，当Switch为on时必填，规则数量最大为10个。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathRules 访问URL重写规则，当Switch为on时必填，规则数量最大为10个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathRules(UrlRedirectRule [] PathRules) {
        this.PathRules = PathRules;
    }

    public UrlRedirect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlRedirect(UrlRedirect source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.PathRules != null) {
            this.PathRules = new UrlRedirectRule[source.PathRules.length];
            for (int i = 0; i < source.PathRules.length; i++) {
                this.PathRules[i] = new UrlRedirectRule(source.PathRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "PathRules.", this.PathRules);

    }
}

