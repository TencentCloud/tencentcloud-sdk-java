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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneItem extends AbstractModel {

    /**
    * 场景名称
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * logo地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * 主页地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HomeUrl")
    @Expose
    private String HomeUrl;

    /**
    * 自定义的js
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JSUrl")
    @Expose
    private String JSUrl;

    /**
    * 自定义的css
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CSSUrl")
    @Expose
    private String CSSUrl;

    /**
     * Get 场景名称 
     * @return Scene 场景名称
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景名称
     * @param Scene 场景名称
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get logo地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogoUrl logo地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set logo地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogoUrl logo地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get 主页地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HomeUrl 主页地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHomeUrl() {
        return this.HomeUrl;
    }

    /**
     * Set 主页地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HomeUrl 主页地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHomeUrl(String HomeUrl) {
        this.HomeUrl = HomeUrl;
    }

    /**
     * Get 自定义的js
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JSUrl 自定义的js
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJSUrl() {
        return this.JSUrl;
    }

    /**
     * Set 自定义的js
注意：此字段可能返回 null，表示取不到有效值。
     * @param JSUrl 自定义的js
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJSUrl(String JSUrl) {
        this.JSUrl = JSUrl;
    }

    /**
     * Get 自定义的css
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CSSUrl 自定义的css
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCSSUrl() {
        return this.CSSUrl;
    }

    /**
     * Set 自定义的css
注意：此字段可能返回 null，表示取不到有效值。
     * @param CSSUrl 自定义的css
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCSSUrl(String CSSUrl) {
        this.CSSUrl = CSSUrl;
    }

    public SceneItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneItem(SceneItem source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.LogoUrl != null) {
            this.LogoUrl = new String(source.LogoUrl);
        }
        if (source.HomeUrl != null) {
            this.HomeUrl = new String(source.HomeUrl);
        }
        if (source.JSUrl != null) {
            this.JSUrl = new String(source.JSUrl);
        }
        if (source.CSSUrl != null) {
            this.CSSUrl = new String(source.CSSUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "LogoUrl", this.LogoUrl);
        this.setParamSimple(map, prefix + "HomeUrl", this.HomeUrl);
        this.setParamSimple(map, prefix + "JSUrl", this.JSUrl);
        this.setParamSimple(map, prefix + "CSSUrl", this.CSSUrl);

    }
}

