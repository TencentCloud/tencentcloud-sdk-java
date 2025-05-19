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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DigitalHumanConfig extends AbstractModel {

    /**
    * 数智人资产key
    */
    @SerializedName("AssetKey")
    @Expose
    private String AssetKey;

    /**
    * 数智人名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 图像
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
     * Get 数智人资产key 
     * @return AssetKey 数智人资产key
     */
    public String getAssetKey() {
        return this.AssetKey;
    }

    /**
     * Set 数智人资产key
     * @param AssetKey 数智人资产key
     */
    public void setAssetKey(String AssetKey) {
        this.AssetKey = AssetKey;
    }

    /**
     * Get 数智人名称 
     * @return Name 数智人名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数智人名称
     * @param Name 数智人名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 图像 
     * @return Avatar 图像
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 图像
     * @param Avatar 图像
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public DigitalHumanConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DigitalHumanConfig(DigitalHumanConfig source) {
        if (source.AssetKey != null) {
            this.AssetKey = new String(source.AssetKey);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetKey", this.AssetKey);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);

    }
}

