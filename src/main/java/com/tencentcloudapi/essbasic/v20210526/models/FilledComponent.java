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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilledComponent extends AbstractModel{

    /**
    * 控件Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 控件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 控件填写状态；0-未填写；1-已填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentFillStatus")
    @Expose
    private String ComponentFillStatus;

    /**
    * 控件填写内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get 控件Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentId 控件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 控件Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentId 控件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 控件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentName 控件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentName 控件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 控件填写状态；0-未填写；1-已填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentFillStatus 控件填写状态；0-未填写；1-已填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentFillStatus() {
        return this.ComponentFillStatus;
    }

    /**
     * Set 控件填写状态；0-未填写；1-已填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentFillStatus 控件填写状态；0-未填写；1-已填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentFillStatus(String ComponentFillStatus) {
        this.ComponentFillStatus = ComponentFillStatus;
    }

    /**
     * Get 控件填写内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentValue 控件填写内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件填写内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentValue 控件填写内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public FilledComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilledComponent(FilledComponent source) {
        if (source.ComponentId != null) {
            this.ComponentId = new String(source.ComponentId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ComponentFillStatus != null) {
            this.ComponentFillStatus = new String(source.ComponentFillStatus);
        }
        if (source.ComponentValue != null) {
            this.ComponentValue = new String(source.ComponentValue);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentId", this.ComponentId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentFillStatus", this.ComponentFillStatus);
        this.setParamSimple(map, prefix + "ComponentValue", this.ComponentValue);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

