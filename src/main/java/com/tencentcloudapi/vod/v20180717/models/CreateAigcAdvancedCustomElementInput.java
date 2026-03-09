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

public class CreateAigcAdvancedCustomElementInput extends AbstractModel {

    /**
    * <p>主体名称。</p>
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * <p>主体描述。</p>
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * <p>主体参考方式。</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>主体音色。</p>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * <p>主体参考视频。</p>
    */
    @SerializedName("ElementVideoList")
    @Expose
    private String ElementVideoList;

    /**
    * <p>主体参考图。</p>
    */
    @SerializedName("ElementImageList")
    @Expose
    private String ElementImageList;

    /**
    * <p>主体配置标签。</p>
    */
    @SerializedName("TagList")
    @Expose
    private String TagList;

    /**
     * Get <p>主体名称。</p> 
     * @return ElementName <p>主体名称。</p>
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set <p>主体名称。</p>
     * @param ElementName <p>主体名称。</p>
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get <p>主体描述。</p> 
     * @return ElementDescription <p>主体描述。</p>
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set <p>主体描述。</p>
     * @param ElementDescription <p>主体描述。</p>
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get <p>主体参考方式。</p> 
     * @return ReferenceType <p>主体参考方式。</p>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>主体参考方式。</p>
     * @param ReferenceType <p>主体参考方式。</p>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>主体音色。</p> 
     * @return ElementVoiceId <p>主体音色。</p>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>主体音色。</p>
     * @param ElementVoiceId <p>主体音色。</p>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get <p>主体参考视频。</p> 
     * @return ElementVideoList <p>主体参考视频。</p>
     */
    public String getElementVideoList() {
        return this.ElementVideoList;
    }

    /**
     * Set <p>主体参考视频。</p>
     * @param ElementVideoList <p>主体参考视频。</p>
     */
    public void setElementVideoList(String ElementVideoList) {
        this.ElementVideoList = ElementVideoList;
    }

    /**
     * Get <p>主体参考图。</p> 
     * @return ElementImageList <p>主体参考图。</p>
     */
    public String getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>主体参考图。</p>
     * @param ElementImageList <p>主体参考图。</p>
     */
    public void setElementImageList(String ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>主体配置标签。</p> 
     * @return TagList <p>主体配置标签。</p>
     */
    public String getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>主体配置标签。</p>
     * @param TagList <p>主体配置标签。</p>
     */
    public void setTagList(String TagList) {
        this.TagList = TagList;
    }

    public CreateAigcAdvancedCustomElementInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementInput(CreateAigcAdvancedCustomElementInput source) {
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ElementDescription != null) {
            this.ElementDescription = new String(source.ElementDescription);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ElementVoiceId != null) {
            this.ElementVoiceId = new String(source.ElementVoiceId);
        }
        if (source.ElementVideoList != null) {
            this.ElementVideoList = new String(source.ElementVideoList);
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new String(source.ElementImageList);
        }
        if (source.TagList != null) {
            this.TagList = new String(source.TagList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);
        this.setParamSimple(map, prefix + "ElementVideoList", this.ElementVideoList);
        this.setParamSimple(map, prefix + "ElementImageList", this.ElementImageList);
        this.setParamSimple(map, prefix + "TagList", this.TagList);

    }
}

