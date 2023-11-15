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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageProfile extends AbstractModel {

    /**
    * 应用类型
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 模型Id
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 设备类型
    */
    @SerializedName("PoiCode")
    @Expose
    private String PoiCode;

    /**
     * Get 应用类型 
     * @return AppType 应用类型
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型
     * @param AppType 应用类型
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 模型Id 
     * @return ModelId 模型Id
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型Id
     * @param ModelId 模型Id
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 设备类型 
     * @return PoiCode 设备类型
     */
    public String getPoiCode() {
        return this.PoiCode;
    }

    /**
     * Set 设备类型
     * @param PoiCode 设备类型
     */
    public void setPoiCode(String PoiCode) {
        this.PoiCode = PoiCode;
    }

    public MessageProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageProfile(MessageProfile source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.PoiCode != null) {
            this.PoiCode = new String(source.PoiCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "PoiCode", this.PoiCode);

    }
}

