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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAttributeLabelRequest extends AbstractModel {

    /**
    * 知识库ID
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 属性ID
    */
    @SerializedName("AttributeId")
    @Expose
    private String AttributeId;

    /**
    * 属性标识，最大40个英文字符，如style
    */
    @SerializedName("AttributeKey")
    @Expose
    private String AttributeKey;

    /**
    * 属性名称，最大80个英文字符，如风格
    */
    @SerializedName("AttributeName")
    @Expose
    private String AttributeName;

    /**
    * 属性标签
    */
    @SerializedName("Labels")
    @Expose
    private AttributeLabelItem [] Labels;

    /**
     * Get 知识库ID 
     * @return KnowledgeBaseId 知识库ID
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库ID
     * @param KnowledgeBaseId 知识库ID
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 属性ID 
     * @return AttributeId 属性ID
     */
    public String getAttributeId() {
        return this.AttributeId;
    }

    /**
     * Set 属性ID
     * @param AttributeId 属性ID
     */
    public void setAttributeId(String AttributeId) {
        this.AttributeId = AttributeId;
    }

    /**
     * Get 属性标识，最大40个英文字符，如style 
     * @return AttributeKey 属性标识，最大40个英文字符，如style
     */
    public String getAttributeKey() {
        return this.AttributeKey;
    }

    /**
     * Set 属性标识，最大40个英文字符，如style
     * @param AttributeKey 属性标识，最大40个英文字符，如style
     */
    public void setAttributeKey(String AttributeKey) {
        this.AttributeKey = AttributeKey;
    }

    /**
     * Get 属性名称，最大80个英文字符，如风格 
     * @return AttributeName 属性名称，最大80个英文字符，如风格
     */
    public String getAttributeName() {
        return this.AttributeName;
    }

    /**
     * Set 属性名称，最大80个英文字符，如风格
     * @param AttributeName 属性名称，最大80个英文字符，如风格
     */
    public void setAttributeName(String AttributeName) {
        this.AttributeName = AttributeName;
    }

    /**
     * Get 属性标签 
     * @return Labels 属性标签
     */
    public AttributeLabelItem [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 属性标签
     * @param Labels 属性标签
     */
    public void setLabels(AttributeLabelItem [] Labels) {
        this.Labels = Labels;
    }

    public ModifyAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAttributeLabelRequest(ModifyAttributeLabelRequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.AttributeId != null) {
            this.AttributeId = new String(source.AttributeId);
        }
        if (source.AttributeKey != null) {
            this.AttributeKey = new String(source.AttributeKey);
        }
        if (source.AttributeName != null) {
            this.AttributeName = new String(source.AttributeName);
        }
        if (source.Labels != null) {
            this.Labels = new AttributeLabelItem[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AttributeLabelItem(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "AttributeId", this.AttributeId);
        this.setParamSimple(map, prefix + "AttributeKey", this.AttributeKey);
        this.setParamSimple(map, prefix + "AttributeName", this.AttributeName);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

