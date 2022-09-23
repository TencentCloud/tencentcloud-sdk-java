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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproveOpinion extends AbstractModel{

    /**
    * 方式 1:输入文字反馈  2:预设选项
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 审批意见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
     * Get 方式 1:输入文字反馈  2:预设选项 
     * @return Type 方式 1:输入文字反馈  2:预设选项
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 方式 1:输入文字反馈  2:预设选项
     * @param Type 方式 1:输入文字反馈  2:预设选项
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 审批意见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 审批意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set 审批意见
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 审批意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    public ApproveOpinion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveOpinion(ApproveOpinion source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);

    }
}

