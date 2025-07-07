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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuCloudVod extends AbstractModel {

    /**
    * 腾讯云点播相关参数。	
    */
    @SerializedName("McuTencentVod")
    @Expose
    private McuTencentVod McuTencentVod;

    /**
     * Get 腾讯云点播相关参数。	 
     * @return McuTencentVod 腾讯云点播相关参数。	
     */
    public McuTencentVod getMcuTencentVod() {
        return this.McuTencentVod;
    }

    /**
     * Set 腾讯云点播相关参数。	
     * @param McuTencentVod 腾讯云点播相关参数。	
     */
    public void setMcuTencentVod(McuTencentVod McuTencentVod) {
        this.McuTencentVod = McuTencentVod;
    }

    public McuCloudVod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuCloudVod(McuCloudVod source) {
        if (source.McuTencentVod != null) {
            this.McuTencentVod = new McuTencentVod(source.McuTencentVod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "McuTencentVod.", this.McuTencentVod);

    }
}

