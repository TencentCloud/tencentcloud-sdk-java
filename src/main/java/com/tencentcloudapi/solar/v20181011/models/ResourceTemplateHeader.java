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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceTemplateHeader extends AbstractModel{

    /**
    * 模板预览区内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 模板预览示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Example")
    @Expose
    private String Example;

    /**
    * 模板预览区域键数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyArray")
    @Expose
    private String KeyArray;

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get 模板预览区内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 模板预览区内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 模板预览区内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 模板预览区内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 模板预览示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Example 模板预览示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExample() {
        return this.Example;
    }

    /**
     * Set 模板预览示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Example 模板预览示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExample(String Example) {
        this.Example = Example;
    }

    /**
     * Get 模板预览区域键数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyArray 模板预览区域键数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyArray() {
        return this.KeyArray;
    }

    /**
     * Set 模板预览区域键数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyArray 模板预览区域键数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyArray(String KeyArray) {
        this.KeyArray = KeyArray;
    }

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 模板标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 模板标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 模板标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Example", this.Example);
        this.setParamSimple(map, prefix + "KeyArray", this.KeyArray);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

