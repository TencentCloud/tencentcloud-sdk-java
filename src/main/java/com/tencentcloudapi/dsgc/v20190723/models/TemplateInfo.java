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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateInfo extends AbstractModel {

    /**
    * 模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
     * Get 模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateName 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateName 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    public TemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateInfo(TemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);

    }
}

