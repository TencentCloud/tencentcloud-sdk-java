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

public class ScdnBotConfig extends AbstractModel{

    /**
    * Scdn bot配置开关，取值有：
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Bot cookie策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotCookie")
    @Expose
    private BotCookie [] BotCookie;

    /**
    * Bot Js策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotJavaScript")
    @Expose
    private BotJavaScript [] BotJavaScript;

    /**
     * Get Scdn bot配置开关，取值有：
on：开启
off：关闭 
     * @return Switch Scdn bot配置开关，取值有：
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Scdn bot配置开关，取值有：
on：开启
off：关闭
     * @param Switch Scdn bot配置开关，取值有：
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Bot cookie策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotCookie Bot cookie策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotCookie [] getBotCookie() {
        return this.BotCookie;
    }

    /**
     * Set Bot cookie策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotCookie Bot cookie策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotCookie(BotCookie [] BotCookie) {
        this.BotCookie = BotCookie;
    }

    /**
     * Get Bot Js策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotJavaScript Bot Js策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotJavaScript [] getBotJavaScript() {
        return this.BotJavaScript;
    }

    /**
     * Set Bot Js策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotJavaScript Bot Js策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotJavaScript(BotJavaScript [] BotJavaScript) {
        this.BotJavaScript = BotJavaScript;
    }

    public ScdnBotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnBotConfig(ScdnBotConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BotCookie != null) {
            this.BotCookie = new BotCookie[source.BotCookie.length];
            for (int i = 0; i < source.BotCookie.length; i++) {
                this.BotCookie[i] = new BotCookie(source.BotCookie[i]);
            }
        }
        if (source.BotJavaScript != null) {
            this.BotJavaScript = new BotJavaScript[source.BotJavaScript.length];
            for (int i = 0; i < source.BotJavaScript.length; i++) {
                this.BotJavaScript[i] = new BotJavaScript(source.BotJavaScript[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "BotCookie.", this.BotCookie);
        this.setParamArrayObj(map, prefix + "BotJavaScript.", this.BotJavaScript);

    }
}

