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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CasterLayoutInfo extends AbstractModel {

    /**
    * 布局Index。
    */
    @SerializedName("LayoutIndex")
    @Expose
    private Long LayoutIndex;

    /**
    * 布局模板Id。
有效值[1，20，21，31，32，41]
当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。

    */
    @SerializedName("LayoutTemplateId")
    @Expose
    private Long LayoutTemplateId;

    /**
    * 布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。
已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。
    */
    @SerializedName("InputIndexList")
    @Expose
    private String InputIndexList;

    /**
    * 详细的布局参数列表。
    */
    @SerializedName("LayoutParams")
    @Expose
    private CasterLayoutParam [] LayoutParams;

    /**
    * 布局输出的宽度，单位为像素。
默认为1280像素。
注：该值仅在画中画布局，且未设置PgmWidth时生效。
    */
    @SerializedName("LayoutWidth")
    @Expose
    private Long LayoutWidth;

    /**
    * 布局输出的高度，单位为像素。
注：该参数仅在画中画布局，且未设置PgmHeight时生效。
    */
    @SerializedName("LayoutHeight")
    @Expose
    private Long LayoutHeight;

    /**
     * Get 布局Index。 
     * @return LayoutIndex 布局Index。
     */
    public Long getLayoutIndex() {
        return this.LayoutIndex;
    }

    /**
     * Set 布局Index。
     * @param LayoutIndex 布局Index。
     */
    public void setLayoutIndex(Long LayoutIndex) {
        this.LayoutIndex = LayoutIndex;
    }

    /**
     * Get 布局模板Id。
有效值[1，20，21，31，32，41]
当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。
 
     * @return LayoutTemplateId 布局模板Id。
有效值[1，20，21，31，32，41]
当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。

     */
    public Long getLayoutTemplateId() {
        return this.LayoutTemplateId;
    }

    /**
     * Set 布局模板Id。
有效值[1，20，21，31，32，41]
当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。

     * @param LayoutTemplateId 布局模板Id。
有效值[1，20，21，31，32，41]
当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。

     */
    public void setLayoutTemplateId(Long LayoutTemplateId) {
        this.LayoutTemplateId = LayoutTemplateId;
    }

    /**
     * Get 布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。
已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。 
     * @return InputIndexList 布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。
已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。
     */
    public String getInputIndexList() {
        return this.InputIndexList;
    }

    /**
     * Set 布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。
已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。
     * @param InputIndexList 布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。
已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。
     */
    public void setInputIndexList(String InputIndexList) {
        this.InputIndexList = InputIndexList;
    }

    /**
     * Get 详细的布局参数列表。 
     * @return LayoutParams 详细的布局参数列表。
     */
    public CasterLayoutParam [] getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set 详细的布局参数列表。
     * @param LayoutParams 详细的布局参数列表。
     */
    public void setLayoutParams(CasterLayoutParam [] LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get 布局输出的宽度，单位为像素。
默认为1280像素。
注：该值仅在画中画布局，且未设置PgmWidth时生效。 
     * @return LayoutWidth 布局输出的宽度，单位为像素。
默认为1280像素。
注：该值仅在画中画布局，且未设置PgmWidth时生效。
     */
    public Long getLayoutWidth() {
        return this.LayoutWidth;
    }

    /**
     * Set 布局输出的宽度，单位为像素。
默认为1280像素。
注：该值仅在画中画布局，且未设置PgmWidth时生效。
     * @param LayoutWidth 布局输出的宽度，单位为像素。
默认为1280像素。
注：该值仅在画中画布局，且未设置PgmWidth时生效。
     */
    public void setLayoutWidth(Long LayoutWidth) {
        this.LayoutWidth = LayoutWidth;
    }

    /**
     * Get 布局输出的高度，单位为像素。
注：该参数仅在画中画布局，且未设置PgmHeight时生效。 
     * @return LayoutHeight 布局输出的高度，单位为像素。
注：该参数仅在画中画布局，且未设置PgmHeight时生效。
     */
    public Long getLayoutHeight() {
        return this.LayoutHeight;
    }

    /**
     * Set 布局输出的高度，单位为像素。
注：该参数仅在画中画布局，且未设置PgmHeight时生效。
     * @param LayoutHeight 布局输出的高度，单位为像素。
注：该参数仅在画中画布局，且未设置PgmHeight时生效。
     */
    public void setLayoutHeight(Long LayoutHeight) {
        this.LayoutHeight = LayoutHeight;
    }

    public CasterLayoutInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterLayoutInfo(CasterLayoutInfo source) {
        if (source.LayoutIndex != null) {
            this.LayoutIndex = new Long(source.LayoutIndex);
        }
        if (source.LayoutTemplateId != null) {
            this.LayoutTemplateId = new Long(source.LayoutTemplateId);
        }
        if (source.InputIndexList != null) {
            this.InputIndexList = new String(source.InputIndexList);
        }
        if (source.LayoutParams != null) {
            this.LayoutParams = new CasterLayoutParam[source.LayoutParams.length];
            for (int i = 0; i < source.LayoutParams.length; i++) {
                this.LayoutParams[i] = new CasterLayoutParam(source.LayoutParams[i]);
            }
        }
        if (source.LayoutWidth != null) {
            this.LayoutWidth = new Long(source.LayoutWidth);
        }
        if (source.LayoutHeight != null) {
            this.LayoutHeight = new Long(source.LayoutHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayoutIndex", this.LayoutIndex);
        this.setParamSimple(map, prefix + "LayoutTemplateId", this.LayoutTemplateId);
        this.setParamSimple(map, prefix + "InputIndexList", this.InputIndexList);
        this.setParamArrayObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamSimple(map, prefix + "LayoutWidth", this.LayoutWidth);
        this.setParamSimple(map, prefix + "LayoutHeight", this.LayoutHeight);

    }
}

