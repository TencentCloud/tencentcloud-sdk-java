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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilledComponent extends AbstractModel {

    /**
    * 控件Id
    */
    @SerializedName("ComponentId")
    @Expose
    private String ComponentId;

    /**
    * 控件名称
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 控件填写状态；0-未填写；1-已填写
    */
    @SerializedName("ComponentFillStatus")
    @Expose
    private String ComponentFillStatus;

    /**
    * 控件填写内容
    */
    @SerializedName("ComponentValue")
    @Expose
    private String ComponentValue;

    /**
    * 控件所属参与方Id
    */
    @SerializedName("ComponentRecipientId")
    @Expose
    private String ComponentRecipientId;

    /**
    * 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get 控件Id 
     * @return ComponentId 控件Id
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 控件Id
     * @param ComponentId 控件Id
     */
    public void setComponentId(String ComponentId) {
        this.ComponentId = ComponentId;
    }

    /**
     * Get 控件名称 
     * @return ComponentName 控件名称
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 控件名称
     * @param ComponentName 控件名称
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 控件填写状态；0-未填写；1-已填写 
     * @return ComponentFillStatus 控件填写状态；0-未填写；1-已填写
     */
    public String getComponentFillStatus() {
        return this.ComponentFillStatus;
    }

    /**
     * Set 控件填写状态；0-未填写；1-已填写
     * @param ComponentFillStatus 控件填写状态；0-未填写；1-已填写
     */
    public void setComponentFillStatus(String ComponentFillStatus) {
        this.ComponentFillStatus = ComponentFillStatus;
    }

    /**
     * Get 控件填写内容 
     * @return ComponentValue 控件填写内容
     */
    public String getComponentValue() {
        return this.ComponentValue;
    }

    /**
     * Set 控件填写内容
     * @param ComponentValue 控件填写内容
     */
    public void setComponentValue(String ComponentValue) {
        this.ComponentValue = ComponentValue;
    }

    /**
     * Get 控件所属参与方Id 
     * @return ComponentRecipientId 控件所属参与方Id
     */
    public String getComponentRecipientId() {
        return this.ComponentRecipientId;
    }

    /**
     * Set 控件所属参与方Id
     * @param ComponentRecipientId 控件所属参与方Id
     */
    public void setComponentRecipientId(String ComponentRecipientId) {
        this.ComponentRecipientId = ComponentRecipientId;
    }

    /**
     * Get 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。 
     * @return ImageUrl 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
     * @param ImageUrl 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。
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
        if (source.ComponentRecipientId != null) {
            this.ComponentRecipientId = new String(source.ComponentRecipientId);
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
        this.setParamSimple(map, prefix + "ComponentRecipientId", this.ComponentRecipientId);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

