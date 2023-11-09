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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilledComponent extends AbstractModel {

    /**
    * 填写控件ID
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
    * 此填写控件的填写状态
 **0** : 此填写控件**未填写**
**1** : 此填写控件**已填写**
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
    * 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。

注: `链接不是永久链接,  默认有效期5分钟后, 到期后链接失效`
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get 填写控件ID 
     * @return ComponentId 填写控件ID
     */
    public String getComponentId() {
        return this.ComponentId;
    }

    /**
     * Set 填写控件ID
     * @param ComponentId 填写控件ID
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
     * Get 此填写控件的填写状态
 **0** : 此填写控件**未填写**
**1** : 此填写控件**已填写** 
     * @return ComponentFillStatus 此填写控件的填写状态
 **0** : 此填写控件**未填写**
**1** : 此填写控件**已填写**
     */
    public String getComponentFillStatus() {
        return this.ComponentFillStatus;
    }

    /**
     * Set 此填写控件的填写状态
 **0** : 此填写控件**未填写**
**1** : 此填写控件**已填写**
     * @param ComponentFillStatus 此填写控件的填写状态
 **0** : 此填写控件**未填写**
**1** : 此填写控件**已填写**
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
     * Get 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。

注: `链接不是永久链接,  默认有效期5分钟后, 到期后链接失效` 
     * @return ImageUrl 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。

注: `链接不是永久链接,  默认有效期5分钟后, 到期后链接失效`
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。

注: `链接不是永久链接,  默认有效期5分钟后, 到期后链接失效`
     * @param ImageUrl 图片填充控件下载链接，如果是图片填充控件时，这里返回图片的下载链接。

注: `链接不是永久链接,  默认有效期5分钟后, 到期后链接失效`
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

