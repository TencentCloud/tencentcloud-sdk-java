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

public class DeletionProtectionConfig extends AbstractModel {

    /**
    * 是否开启删除保护。开启后，可防止实例被意外删除。
- true：开启删除保护
- false：关闭删除保护
    */
    @SerializedName("DeletionProtectionEnabled")
    @Expose
    private Boolean DeletionProtectionEnabled;

    /**
    * 开启修改保护的原因说明。
长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 是否开启删除保护。开启后，可防止实例被意外删除。
- true：开启删除保护
- false：关闭删除保护 
     * @return DeletionProtectionEnabled 是否开启删除保护。开启后，可防止实例被意外删除。
- true：开启删除保护
- false：关闭删除保护
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.DeletionProtectionEnabled;
    }

    /**
     * Set 是否开启删除保护。开启后，可防止实例被意外删除。
- true：开启删除保护
- false：关闭删除保护
     * @param DeletionProtectionEnabled 是否开启删除保护。开启后，可防止实例被意外删除。
- true：开启删除保护
- false：关闭删除保护
     */
    public void setDeletionProtectionEnabled(Boolean DeletionProtectionEnabled) {
        this.DeletionProtectionEnabled = DeletionProtectionEnabled;
    }

    /**
     * Get 开启修改保护的原因说明。
长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。 
     * @return Reason 开启修改保护的原因说明。
长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 开启修改保护的原因说明。
长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
     * @param Reason 开启修改保护的原因说明。
长度为 1~255 个字符，必须是中文和无害字符串中的字符， 可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）、下划线（_）。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public DeletionProtectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletionProtectionConfig(DeletionProtectionConfig source) {
        if (source.DeletionProtectionEnabled != null) {
            this.DeletionProtectionEnabled = new Boolean(source.DeletionProtectionEnabled);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeletionProtectionEnabled", this.DeletionProtectionEnabled);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

