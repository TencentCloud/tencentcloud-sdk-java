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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SandboxContent extends AbstractModel {

    /**
    * 沙盒的URL地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 沙盒通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayUrl")
    @Expose
    private String DisplayUrl;

    /**
    * 沙盒输出内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 沙盒的URL地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 沙盒的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 沙盒的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 沙盒的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 沙盒通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayUrl 沙盒通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayUrl() {
        return this.DisplayUrl;
    }

    /**
     * Set 沙盒通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayUrl 沙盒通过浏览器打开的URL地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayUrl(String DisplayUrl) {
        this.DisplayUrl = DisplayUrl;
    }

    /**
     * Get 沙盒输出内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 沙盒输出内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 沙盒输出内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 沙盒输出内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public SandboxContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SandboxContent(SandboxContent source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.DisplayUrl != null) {
            this.DisplayUrl = new String(source.DisplayUrl);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "DisplayUrl", this.DisplayUrl);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

