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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelGrade extends AbstractModel {

    /**
    * 内容审核结果客户定制标签码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 内容审核结果客户定制一级标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade1")
    @Expose
    private String Grade1;

    /**
    * 内容审核结果客户定制二级标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade2")
    @Expose
    private String Grade2;

    /**
    * 内容审核结果客户定制三级标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade3")
    @Expose
    private String Grade3;

    /**
     * Get 内容审核结果客户定制标签码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 内容审核结果客户定制标签码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 内容审核结果客户定制标签码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 内容审核结果客户定制标签码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 内容审核结果客户定制一级标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade1 内容审核结果客户定制一级标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrade1() {
        return this.Grade1;
    }

    /**
     * Set 内容审核结果客户定制一级标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade1 内容审核结果客户定制一级标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade1(String Grade1) {
        this.Grade1 = Grade1;
    }

    /**
     * Get 内容审核结果客户定制二级标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade2 内容审核结果客户定制二级标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrade2() {
        return this.Grade2;
    }

    /**
     * Set 内容审核结果客户定制二级标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade2 内容审核结果客户定制二级标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade2(String Grade2) {
        this.Grade2 = Grade2;
    }

    /**
     * Get 内容审核结果客户定制三级标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade3 内容审核结果客户定制三级标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrade3() {
        return this.Grade3;
    }

    /**
     * Set 内容审核结果客户定制三级标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade3 内容审核结果客户定制三级标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade3(String Grade3) {
        this.Grade3 = Grade3;
    }

    public LabelGrade() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelGrade(LabelGrade source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Grade1 != null) {
            this.Grade1 = new String(source.Grade1);
        }
        if (source.Grade2 != null) {
            this.Grade2 = new String(source.Grade2);
        }
        if (source.Grade3 != null) {
            this.Grade3 = new String(source.Grade3);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Grade1", this.Grade1);
        this.setParamSimple(map, prefix + "Grade2", this.Grade2);
        this.setParamSimple(map, prefix + "Grade3", this.Grade3);

    }
}

