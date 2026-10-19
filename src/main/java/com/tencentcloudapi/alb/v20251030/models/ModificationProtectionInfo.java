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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModificationProtectionInfo extends AbstractModel {

    /**
    * <p>是否开启修改保护。开启后，可防止实例被意外修改或删除。</p><ul><li>true：开启修改保护</li><li>false：关闭修改保护</li></ul>
    */
    @SerializedName("ModificationProtectionEnabled")
    @Expose
    private Boolean ModificationProtectionEnabled;

    /**
    * <p>1238716123</p>
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * <p>开启修改保护的原因说明。<br>长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>是否开启修改保护。开启后，可防止实例被意外修改或删除。</p><ul><li>true：开启修改保护</li><li>false：关闭修改保护</li></ul> 
     * @return ModificationProtectionEnabled <p>是否开启修改保护。开启后，可防止实例被意外修改或删除。</p><ul><li>true：开启修改保护</li><li>false：关闭修改保护</li></ul>
     */
    public Boolean getModificationProtectionEnabled() {
        return this.ModificationProtectionEnabled;
    }

    /**
     * Set <p>是否开启修改保护。开启后，可防止实例被意外修改或删除。</p><ul><li>true：开启修改保护</li><li>false：关闭修改保护</li></ul>
     * @param ModificationProtectionEnabled <p>是否开启修改保护。开启后，可防止实例被意外修改或删除。</p><ul><li>true：开启修改保护</li><li>false：关闭修改保护</li></ul>
     */
    public void setModificationProtectionEnabled(Boolean ModificationProtectionEnabled) {
        this.ModificationProtectionEnabled = ModificationProtectionEnabled;
    }

    /**
     * Get <p>1238716123</p> 
     * @return OperatorUin <p>1238716123</p>
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set <p>1238716123</p>
     * @param OperatorUin <p>1238716123</p>
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get <p>开启修改保护的原因说明。<br>长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p> 
     * @return Reason <p>开启修改保护的原因说明。<br>长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>开启修改保护的原因说明。<br>长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
     * @param Reason <p>开启修改保护的原因说明。<br>长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ModificationProtectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModificationProtectionInfo(ModificationProtectionInfo source) {
        if (source.ModificationProtectionEnabled != null) {
            this.ModificationProtectionEnabled = new Boolean(source.ModificationProtectionEnabled);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModificationProtectionEnabled", this.ModificationProtectionEnabled);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

