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

public class BotConfig extends AbstractModel{

    /**
    * bot开关
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 预置规则
    */
    @SerializedName("ManagedRule")
    @Expose
    private BotManagedRule ManagedRule;

    /**
    * 保留
    */
    @SerializedName("UaBotRule")
    @Expose
    private BotManagedRule UaBotRule;

    /**
    * 保留
    */
    @SerializedName("IspBotRule")
    @Expose
    private BotManagedRule IspBotRule;

    /**
    * 用户画像规则
    */
    @SerializedName("PortraitRule")
    @Expose
    private BotPortraitRule PortraitRule;

    /**
     * Get bot开关 
     * @return Switch bot开关
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set bot开关
     * @param Switch bot开关
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 预置规则 
     * @return ManagedRule 预置规则
     */
    public BotManagedRule getManagedRule() {
        return this.ManagedRule;
    }

    /**
     * Set 预置规则
     * @param ManagedRule 预置规则
     */
    public void setManagedRule(BotManagedRule ManagedRule) {
        this.ManagedRule = ManagedRule;
    }

    /**
     * Get 保留 
     * @return UaBotRule 保留
     */
    public BotManagedRule getUaBotRule() {
        return this.UaBotRule;
    }

    /**
     * Set 保留
     * @param UaBotRule 保留
     */
    public void setUaBotRule(BotManagedRule UaBotRule) {
        this.UaBotRule = UaBotRule;
    }

    /**
     * Get 保留 
     * @return IspBotRule 保留
     */
    public BotManagedRule getIspBotRule() {
        return this.IspBotRule;
    }

    /**
     * Set 保留
     * @param IspBotRule 保留
     */
    public void setIspBotRule(BotManagedRule IspBotRule) {
        this.IspBotRule = IspBotRule;
    }

    /**
     * Get 用户画像规则 
     * @return PortraitRule 用户画像规则
     */
    public BotPortraitRule getPortraitRule() {
        return this.PortraitRule;
    }

    /**
     * Set 用户画像规则
     * @param PortraitRule 用户画像规则
     */
    public void setPortraitRule(BotPortraitRule PortraitRule) {
        this.PortraitRule = PortraitRule;
    }

    public BotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotConfig(BotConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ManagedRule != null) {
            this.ManagedRule = new BotManagedRule(source.ManagedRule);
        }
        if (source.UaBotRule != null) {
            this.UaBotRule = new BotManagedRule(source.UaBotRule);
        }
        if (source.IspBotRule != null) {
            this.IspBotRule = new BotManagedRule(source.IspBotRule);
        }
        if (source.PortraitRule != null) {
            this.PortraitRule = new BotPortraitRule(source.PortraitRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "ManagedRule.", this.ManagedRule);
        this.setParamObj(map, prefix + "UaBotRule.", this.UaBotRule);
        this.setParamObj(map, prefix + "IspBotRule.", this.IspBotRule);
        this.setParamObj(map, prefix + "PortraitRule.", this.PortraitRule);

    }
}

