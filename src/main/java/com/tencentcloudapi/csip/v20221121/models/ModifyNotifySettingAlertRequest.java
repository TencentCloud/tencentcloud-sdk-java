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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNotifySettingAlertRequest extends AbstractModel {

    /**
    * <p>通知配置</p>
    */
    @SerializedName("Settings")
    @Expose
    private NotifySetting [] Settings;

    /**
     * Get <p>通知配置</p> 
     * @return Settings <p>通知配置</p>
     */
    public NotifySetting [] getSettings() {
        return this.Settings;
    }

    /**
     * Set <p>通知配置</p>
     * @param Settings <p>通知配置</p>
     */
    public void setSettings(NotifySetting [] Settings) {
        this.Settings = Settings;
    }

    public ModifyNotifySettingAlertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotifySettingAlertRequest(ModifyNotifySettingAlertRequest source) {
        if (source.Settings != null) {
            this.Settings = new NotifySetting[source.Settings.length];
            for (int i = 0; i < source.Settings.length; i++) {
                this.Settings[i] = new NotifySetting(source.Settings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Settings.", this.Settings);

    }
}

