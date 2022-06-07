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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageToObjectResponse extends AbstractModel{

    /**
    * 报告结构化结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Template")
    @Expose
    private Template Template;

    /**
    * 多级分类结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextTypeList")
    @Expose
    private TextType [] TextTypeList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 报告结构化结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Template 报告结构化结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Template getTemplate() {
        return this.Template;
    }

    /**
     * Set 报告结构化结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Template 报告结构化结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplate(Template Template) {
        this.Template = Template;
    }

    /**
     * Get 多级分类结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextTypeList 多级分类结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextType [] getTextTypeList() {
        return this.TextTypeList;
    }

    /**
     * Set 多级分类结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextTypeList 多级分类结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextTypeList(TextType [] TextTypeList) {
        this.TextTypeList = TextTypeList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ImageToObjectResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageToObjectResponse(ImageToObjectResponse source) {
        if (source.Template != null) {
            this.Template = new Template(source.Template);
        }
        if (source.TextTypeList != null) {
            this.TextTypeList = new TextType[source.TextTypeList.length];
            for (int i = 0; i < source.TextTypeList.length; i++) {
                this.TextTypeList[i] = new TextType(source.TextTypeList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamArrayObj(map, prefix + "TextTypeList.", this.TextTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

