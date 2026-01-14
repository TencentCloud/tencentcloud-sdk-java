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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcCustomElementRequest extends AbstractModel {

    /**
    * 主体名称。不能超过20个字符
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * 主体描述。

不能超过100个字符。
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * 主体正面参考图。
支持传入图片URL（确保可访问）
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
    */
    @SerializedName("ElementFrontalImage")
    @Expose
    private String ElementFrontalImage;

    /**
    * 主体其他参考列表  可通过上传多张、不同角度的主体参考图来定义主体外观 至少上传1张参考图，至多上传3张参考图。
    */
    @SerializedName("ElementReferList")
    @Expose
    private ElementReferInfo [] ElementReferList;

    /**
     * Get 主体名称。不能超过20个字符 
     * @return ElementName 主体名称。不能超过20个字符
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set 主体名称。不能超过20个字符
     * @param ElementName 主体名称。不能超过20个字符
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get 主体描述。

不能超过100个字符。 
     * @return ElementDescription 主体描述。

不能超过100个字符。
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set 主体描述。

不能超过100个字符。
     * @param ElementDescription 主体描述。

不能超过100个字符。
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get 主体正面参考图。
支持传入图片URL（确保可访问）
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。 
     * @return ElementFrontalImage 主体正面参考图。
支持传入图片URL（确保可访问）
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
     */
    public String getElementFrontalImage() {
        return this.ElementFrontalImage;
    }

    /**
     * Set 主体正面参考图。
支持传入图片URL（确保可访问）
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
     * @param ElementFrontalImage 主体正面参考图。
支持传入图片URL（确保可访问）
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
     */
    public void setElementFrontalImage(String ElementFrontalImage) {
        this.ElementFrontalImage = ElementFrontalImage;
    }

    /**
     * Get 主体其他参考列表  可通过上传多张、不同角度的主体参考图来定义主体外观 至少上传1张参考图，至多上传3张参考图。 
     * @return ElementReferList 主体其他参考列表  可通过上传多张、不同角度的主体参考图来定义主体外观 至少上传1张参考图，至多上传3张参考图。
     */
    public ElementReferInfo [] getElementReferList() {
        return this.ElementReferList;
    }

    /**
     * Set 主体其他参考列表  可通过上传多张、不同角度的主体参考图来定义主体外观 至少上传1张参考图，至多上传3张参考图。
     * @param ElementReferList 主体其他参考列表  可通过上传多张、不同角度的主体参考图来定义主体外观 至少上传1张参考图，至多上传3张参考图。
     */
    public void setElementReferList(ElementReferInfo [] ElementReferList) {
        this.ElementReferList = ElementReferList;
    }

    public CreateAigcCustomElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcCustomElementRequest(CreateAigcCustomElementRequest source) {
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ElementDescription != null) {
            this.ElementDescription = new String(source.ElementDescription);
        }
        if (source.ElementFrontalImage != null) {
            this.ElementFrontalImage = new String(source.ElementFrontalImage);
        }
        if (source.ElementReferList != null) {
            this.ElementReferList = new ElementReferInfo[source.ElementReferList.length];
            for (int i = 0; i < source.ElementReferList.length; i++) {
                this.ElementReferList[i] = new ElementReferInfo(source.ElementReferList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ElementFrontalImage", this.ElementFrontalImage);
        this.setParamArrayObj(map, prefix + "ElementReferList.", this.ElementReferList);

    }
}

