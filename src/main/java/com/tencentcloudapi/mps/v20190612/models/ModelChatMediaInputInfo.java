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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelChatMediaInputInfo extends AbstractModel {

    /**
    * <p>输入类型</p><p>枚举值：</p><ul><li>URL： Url输入</li><li>DATA： Base64输入</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>URL输入配置</p>
    */
    @SerializedName("UrlInputInfo")
    @Expose
    private ModelChatUrlInputInfo UrlInputInfo;

    /**
    * <p>Base64输入配置</p>
    */
    @SerializedName("DataInputInfo")
    @Expose
    private ModelChatDataInputInfo DataInputInfo;

    /**
     * Get <p>输入类型</p><p>枚举值：</p><ul><li>URL： Url输入</li><li>DATA： Base64输入</li></ul> 
     * @return Type <p>输入类型</p><p>枚举值：</p><ul><li>URL： Url输入</li><li>DATA： Base64输入</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输入类型</p><p>枚举值：</p><ul><li>URL： Url输入</li><li>DATA： Base64输入</li></ul>
     * @param Type <p>输入类型</p><p>枚举值：</p><ul><li>URL： Url输入</li><li>DATA： Base64输入</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>URL输入配置</p> 
     * @return UrlInputInfo <p>URL输入配置</p>
     */
    public ModelChatUrlInputInfo getUrlInputInfo() {
        return this.UrlInputInfo;
    }

    /**
     * Set <p>URL输入配置</p>
     * @param UrlInputInfo <p>URL输入配置</p>
     */
    public void setUrlInputInfo(ModelChatUrlInputInfo UrlInputInfo) {
        this.UrlInputInfo = UrlInputInfo;
    }

    /**
     * Get <p>Base64输入配置</p> 
     * @return DataInputInfo <p>Base64输入配置</p>
     */
    public ModelChatDataInputInfo getDataInputInfo() {
        return this.DataInputInfo;
    }

    /**
     * Set <p>Base64输入配置</p>
     * @param DataInputInfo <p>Base64输入配置</p>
     */
    public void setDataInputInfo(ModelChatDataInputInfo DataInputInfo) {
        this.DataInputInfo = DataInputInfo;
    }

    public ModelChatMediaInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatMediaInputInfo(ModelChatMediaInputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UrlInputInfo != null) {
            this.UrlInputInfo = new ModelChatUrlInputInfo(source.UrlInputInfo);
        }
        if (source.DataInputInfo != null) {
            this.DataInputInfo = new ModelChatDataInputInfo(source.DataInputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "UrlInputInfo.", this.UrlInputInfo);
        this.setParamObj(map, prefix + "DataInputInfo.", this.DataInputInfo);

    }
}

