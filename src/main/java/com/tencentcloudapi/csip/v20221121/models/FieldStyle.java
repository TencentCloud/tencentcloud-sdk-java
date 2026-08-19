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

public class FieldStyle extends AbstractModel {

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>是否支持复制</p>
    */
    @SerializedName("Copy")
    @Expose
    private Boolean Copy;

    /**
    * <p>颜色</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>跳转url</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否支持复制</p> 
     * @return Copy <p>是否支持复制</p>
     */
    public Boolean getCopy() {
        return this.Copy;
    }

    /**
     * Set <p>是否支持复制</p>
     * @param Copy <p>是否支持复制</p>
     */
    public void setCopy(Boolean Copy) {
        this.Copy = Copy;
    }

    /**
     * Get <p>颜色</p> 
     * @return Color <p>颜色</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>颜色</p>
     * @param Color <p>颜色</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>跳转url</p> 
     * @return URL <p>跳转url</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>跳转url</p>
     * @param URL <p>跳转url</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    public FieldStyle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldStyle(FieldStyle source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Copy != null) {
            this.Copy = new Boolean(source.Copy);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Copy", this.Copy);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "URL", this.URL);

    }
}

