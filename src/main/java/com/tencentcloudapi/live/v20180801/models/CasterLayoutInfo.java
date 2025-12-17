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
    * <p>布局Index。</p>取值范围：[1, 1000]
    */
    @SerializedName("LayoutIndex")
    @Expose
    private Long LayoutIndex;

    /**
    * <p>布局模板Id。有效值[1，20，21，31，32，41]当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。</p>
    */
    @SerializedName("LayoutTemplateId")
    @Expose
    private Long LayoutTemplateId;

    /**
    * <p>布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。</p>
    */
    @SerializedName("InputIndexList")
    @Expose
    private String InputIndexList;

    /**
    * <p>详细的布局参数列表。</p>
    */
    @SerializedName("LayoutParams")
    @Expose
    private CasterLayoutParam [] LayoutParams;

    /**
    * <p>布局输出的宽度，单位为像素。默认为1280像素。注：该值仅在画中画布局，且未设置PgmWidth时生效。</p>
    */
    @SerializedName("LayoutWidth")
    @Expose
    private Long LayoutWidth;

    /**
    * <p>布局输出的高度，单位为像素。注：该参数仅在画中画布局，且未设置PgmHeight时生效。</p>
    */
    @SerializedName("LayoutHeight")
    @Expose
    private Long LayoutHeight;

    /**
     * Get <p>布局Index。</p>取值范围：[1, 1000] 
     * @return LayoutIndex <p>布局Index。</p>取值范围：[1, 1000]
     */
    public Long getLayoutIndex() {
        return this.LayoutIndex;
    }

    /**
     * Set <p>布局Index。</p>取值范围：[1, 1000]
     * @param LayoutIndex <p>布局Index。</p>取值范围：[1, 1000]
     */
    public void setLayoutIndex(Long LayoutIndex) {
        this.LayoutIndex = LayoutIndex;
    }

    /**
     * Get <p>布局模板Id。有效值[1，20，21，31，32，41]当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。</p> 
     * @return LayoutTemplateId <p>布局模板Id。有效值[1，20，21，31，32，41]当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。</p>
     */
    public Long getLayoutTemplateId() {
        return this.LayoutTemplateId;
    }

    /**
     * Set <p>布局模板Id。有效值[1，20，21，31，32，41]当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。</p>
     * @param LayoutTemplateId <p>布局模板Id。有效值[1，20，21，31，32，41]当使用布局模板时，无需LayoutParams参数，导播台将使用模板布局参数。</p>
     */
    public void setLayoutTemplateId(Long LayoutTemplateId) {
        this.LayoutTemplateId = LayoutTemplateId;
    }

    /**
     * Get <p>布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。</p> 
     * @return InputIndexList <p>布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。</p>
     */
    public String getInputIndexList() {
        return this.InputIndexList;
    }

    /**
     * Set <p>布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。</p>
     * @param InputIndexList <p>布局绑定的输入列表。按布局LayerId从小到大，按顺序排列。已有两个画面的布局为例，输入1对应LayerId为1，输入2对应的LayerId为2，该字段应该填入"1|2"。</p>
     */
    public void setInputIndexList(String InputIndexList) {
        this.InputIndexList = InputIndexList;
    }

    /**
     * Get <p>详细的布局参数列表。</p> 
     * @return LayoutParams <p>详细的布局参数列表。</p>
     */
    public CasterLayoutParam [] getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set <p>详细的布局参数列表。</p>
     * @param LayoutParams <p>详细的布局参数列表。</p>
     */
    public void setLayoutParams(CasterLayoutParam [] LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get <p>布局输出的宽度，单位为像素。默认为1280像素。注：该值仅在画中画布局，且未设置PgmWidth时生效。</p> 
     * @return LayoutWidth <p>布局输出的宽度，单位为像素。默认为1280像素。注：该值仅在画中画布局，且未设置PgmWidth时生效。</p>
     */
    public Long getLayoutWidth() {
        return this.LayoutWidth;
    }

    /**
     * Set <p>布局输出的宽度，单位为像素。默认为1280像素。注：该值仅在画中画布局，且未设置PgmWidth时生效。</p>
     * @param LayoutWidth <p>布局输出的宽度，单位为像素。默认为1280像素。注：该值仅在画中画布局，且未设置PgmWidth时生效。</p>
     */
    public void setLayoutWidth(Long LayoutWidth) {
        this.LayoutWidth = LayoutWidth;
    }

    /**
     * Get <p>布局输出的高度，单位为像素。注：该参数仅在画中画布局，且未设置PgmHeight时生效。</p> 
     * @return LayoutHeight <p>布局输出的高度，单位为像素。注：该参数仅在画中画布局，且未设置PgmHeight时生效。</p>
     */
    public Long getLayoutHeight() {
        return this.LayoutHeight;
    }

    /**
     * Set <p>布局输出的高度，单位为像素。注：该参数仅在画中画布局，且未设置PgmHeight时生效。</p>
     * @param LayoutHeight <p>布局输出的高度，单位为像素。注：该参数仅在画中画布局，且未设置PgmHeight时生效。</p>
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

