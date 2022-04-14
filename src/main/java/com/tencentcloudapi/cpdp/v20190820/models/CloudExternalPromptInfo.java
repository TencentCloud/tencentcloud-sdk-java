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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudExternalPromptInfo extends AbstractModel{

    /**
    * 优惠商品信息类型。
    */
    @SerializedName("ExternalPromptType")
    @Expose
    private String ExternalPromptType;

    /**
    * 优惠商品信息数据。
    */
    @SerializedName("ExternalPromptValue")
    @Expose
    private String ExternalPromptValue;

    /**
    * 优惠商品名称。
    */
    @SerializedName("ExternalPromptName")
    @Expose
    private String ExternalPromptName;

    /**
     * Get 优惠商品信息类型。 
     * @return ExternalPromptType 优惠商品信息类型。
     */
    public String getExternalPromptType() {
        return this.ExternalPromptType;
    }

    /**
     * Set 优惠商品信息类型。
     * @param ExternalPromptType 优惠商品信息类型。
     */
    public void setExternalPromptType(String ExternalPromptType) {
        this.ExternalPromptType = ExternalPromptType;
    }

    /**
     * Get 优惠商品信息数据。 
     * @return ExternalPromptValue 优惠商品信息数据。
     */
    public String getExternalPromptValue() {
        return this.ExternalPromptValue;
    }

    /**
     * Set 优惠商品信息数据。
     * @param ExternalPromptValue 优惠商品信息数据。
     */
    public void setExternalPromptValue(String ExternalPromptValue) {
        this.ExternalPromptValue = ExternalPromptValue;
    }

    /**
     * Get 优惠商品名称。 
     * @return ExternalPromptName 优惠商品名称。
     */
    public String getExternalPromptName() {
        return this.ExternalPromptName;
    }

    /**
     * Set 优惠商品名称。
     * @param ExternalPromptName 优惠商品名称。
     */
    public void setExternalPromptName(String ExternalPromptName) {
        this.ExternalPromptName = ExternalPromptName;
    }

    public CloudExternalPromptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudExternalPromptInfo(CloudExternalPromptInfo source) {
        if (source.ExternalPromptType != null) {
            this.ExternalPromptType = new String(source.ExternalPromptType);
        }
        if (source.ExternalPromptValue != null) {
            this.ExternalPromptValue = new String(source.ExternalPromptValue);
        }
        if (source.ExternalPromptName != null) {
            this.ExternalPromptName = new String(source.ExternalPromptName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalPromptType", this.ExternalPromptType);
        this.setParamSimple(map, prefix + "ExternalPromptValue", this.ExternalPromptValue);
        this.setParamSimple(map, prefix + "ExternalPromptName", this.ExternalPromptName);

    }
}

