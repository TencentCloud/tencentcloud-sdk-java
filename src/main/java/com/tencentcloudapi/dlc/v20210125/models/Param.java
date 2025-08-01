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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Param extends AbstractModel {

    /**
    * 参数key，例如：
    */
    @SerializedName("ConfigItem")
    @Expose
    private String ConfigItem;

    /**
    * 参数值
    */
    @SerializedName("ConfigValue")
    @Expose
    private String ConfigValue;

    /**
    * 下发操作，支持：ADD、DELETE、MODIFY
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * Get 参数key，例如： 
     * @return ConfigItem 参数key，例如：
     */
    public String getConfigItem() {
        return this.ConfigItem;
    }

    /**
     * Set 参数key，例如：
     * @param ConfigItem 参数key，例如：
     */
    public void setConfigItem(String ConfigItem) {
        this.ConfigItem = ConfigItem;
    }

    /**
     * Get 参数值 
     * @return ConfigValue 参数值
     */
    public String getConfigValue() {
        return this.ConfigValue;
    }

    /**
     * Set 参数值
     * @param ConfigValue 参数值
     */
    public void setConfigValue(String ConfigValue) {
        this.ConfigValue = ConfigValue;
    }

    /**
     * Get 下发操作，支持：ADD、DELETE、MODIFY 
     * @return Operate 下发操作，支持：ADD、DELETE、MODIFY
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 下发操作，支持：ADD、DELETE、MODIFY
     * @param Operate 下发操作，支持：ADD、DELETE、MODIFY
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    public Param() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Param(Param source) {
        if (source.ConfigItem != null) {
            this.ConfigItem = new String(source.ConfigItem);
        }
        if (source.ConfigValue != null) {
            this.ConfigValue = new String(source.ConfigValue);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigItem", this.ConfigItem);
        this.setParamSimple(map, prefix + "ConfigValue", this.ConfigValue);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

