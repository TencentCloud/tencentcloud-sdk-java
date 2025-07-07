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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomizedConfigRequest extends AbstractModel {

    /**
    * 配置名字
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置ID
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * 配置内容
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
     * Get 配置名字 
     * @return ConfigName 配置名字
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置名字
     * @param ConfigName 配置名字
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置ID 
     * @return UconfigId 配置ID
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set 配置ID
     * @param UconfigId 配置ID
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get 配置内容 
     * @return ConfigContent 配置内容
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set 配置内容
     * @param ConfigContent 配置内容
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    public ModifyCustomizedConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomizedConfigRequest(ModifyCustomizedConfigRequest source) {
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);

    }
}

