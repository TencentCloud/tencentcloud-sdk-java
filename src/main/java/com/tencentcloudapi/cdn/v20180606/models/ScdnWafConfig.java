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

public class ScdnWafConfig extends AbstractModel{

    /**
    * on|off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * intercept|observe，默认intercept
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 重定向的错误页面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPage")
    @Expose
    private ScdnErrorPage ErrorPage;

    /**
    * webshell拦截开关，on|off，默认off
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebShellSwitch")
    @Expose
    private String WebShellSwitch;

    /**
    * 类型拦截规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private ScdnWafRule [] Rules;

    /**
     * Get on|off 
     * @return Switch on|off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set on|off
     * @param Switch on|off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get intercept|observe，默认intercept
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode intercept|observe，默认intercept
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set intercept|observe，默认intercept
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode intercept|observe，默认intercept
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 重定向的错误页面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPage 重定向的错误页面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 重定向的错误页面
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPage 重定向的错误页面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPage(ScdnErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get webshell拦截开关，on|off，默认off
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebShellSwitch webshell拦截开关，on|off，默认off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebShellSwitch() {
        return this.WebShellSwitch;
    }

    /**
     * Set webshell拦截开关，on|off，默认off
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebShellSwitch webshell拦截开关，on|off，默认off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebShellSwitch(String WebShellSwitch) {
        this.WebShellSwitch = WebShellSwitch;
    }

    /**
     * Get 类型拦截规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 类型拦截规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnWafRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 类型拦截规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 类型拦截规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(ScdnWafRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);
        this.setParamSimple(map, prefix + "WebShellSwitch", this.WebShellSwitch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

