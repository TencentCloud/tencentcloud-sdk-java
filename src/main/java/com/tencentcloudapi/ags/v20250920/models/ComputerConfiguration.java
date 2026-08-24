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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputerConfiguration extends AbstractModel {

    /**
    * <p>waa沙箱工具配置</p>
    */
    @SerializedName("WAAConfiguration")
    @Expose
    private WAAConfiguration WAAConfiguration;

    /**
     * Get <p>waa沙箱工具配置</p> 
     * @return WAAConfiguration <p>waa沙箱工具配置</p>
     */
    public WAAConfiguration getWAAConfiguration() {
        return this.WAAConfiguration;
    }

    /**
     * Set <p>waa沙箱工具配置</p>
     * @param WAAConfiguration <p>waa沙箱工具配置</p>
     */
    public void setWAAConfiguration(WAAConfiguration WAAConfiguration) {
        this.WAAConfiguration = WAAConfiguration;
    }

    public ComputerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputerConfiguration(ComputerConfiguration source) {
        if (source.WAAConfiguration != null) {
            this.WAAConfiguration = new WAAConfiguration(source.WAAConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WAAConfiguration.", this.WAAConfiguration);

    }
}

