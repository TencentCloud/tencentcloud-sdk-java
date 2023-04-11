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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PPTErrSlide extends AbstractModel{

    /**
    * 异常元素存在的页面，由页面类型+页码组成，页码类型包括：幻灯片、幻灯片母版、幻灯片布局等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Page")
    @Expose
    private String Page;

    /**
    * 错误元素列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errs")
    @Expose
    private PPTErr [] Errs;

    /**
     * Get 异常元素存在的页面，由页面类型+页码组成，页码类型包括：幻灯片、幻灯片母版、幻灯片布局等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Page 异常元素存在的页面，由页面类型+页码组成，页码类型包括：幻灯片、幻灯片母版、幻灯片布局等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPage() {
        return this.Page;
    }

    /**
     * Set 异常元素存在的页面，由页面类型+页码组成，页码类型包括：幻灯片、幻灯片母版、幻灯片布局等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Page 异常元素存在的页面，由页面类型+页码组成，页码类型包括：幻灯片、幻灯片母版、幻灯片布局等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPage(String Page) {
        this.Page = Page;
    }

    /**
     * Get 错误元素列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errs 错误元素列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PPTErr [] getErrs() {
        return this.Errs;
    }

    /**
     * Set 错误元素列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errs 错误元素列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrs(PPTErr [] Errs) {
        this.Errs = Errs;
    }

    public PPTErrSlide() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PPTErrSlide(PPTErrSlide source) {
        if (source.Page != null) {
            this.Page = new String(source.Page);
        }
        if (source.Errs != null) {
            this.Errs = new PPTErr[source.Errs.length];
            for (int i = 0; i < source.Errs.length; i++) {
                this.Errs[i] = new PPTErr(source.Errs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamArrayObj(map, prefix + "Errs.", this.Errs);

    }
}

