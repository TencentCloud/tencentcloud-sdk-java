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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignComponentConfig extends AbstractModel {

    /**
    * <p>签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。</p><ul><li>false 展示签署日期（默认）</li><li>true 不展示签署日期<br><img src="https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png" alt="image">。</li></ul>
    */
    @SerializedName("HideDate")
    @Expose
    private Boolean HideDate;

    /**
    * <p>【仅 SignBeanTag=1 时有效】 签署方自行添加签署印章类控件（SIGN_SEAL、SIGN_PAGING_SEAL、SIGN_LEGAL_PERSON_SEAL）时，「盖章区适配签署方印章尺寸」开关的控制策略</p><p>枚举值：</p><ul><li>0： 默认关闭，可开启。与现网一致</li><li>1： 关闭且置灰——按控件默认的4.2cm尺寸盖章，签署方无法开启开关</li><li>2： 默认开启且可修改——默认按印章实际尺寸盖章，签署方可手动关闭</li><li>3： 开启且置灰——强制按印章实际尺寸盖章，签署方不可修改</li></ul><p>默认值：0</p>
    */
    @SerializedName("AddSignComponentUseSealSize")
    @Expose
    private Long AddSignComponentUseSealSize;

    /**
     * Get <p>签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。</p><ul><li>false 展示签署日期（默认）</li><li>true 不展示签署日期<br><img src="https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png" alt="image">。</li></ul> 
     * @return HideDate <p>签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。</p><ul><li>false 展示签署日期（默认）</li><li>true 不展示签署日期<br><img src="https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png" alt="image">。</li></ul>
     */
    public Boolean getHideDate() {
        return this.HideDate;
    }

    /**
     * Set <p>签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。</p><ul><li>false 展示签署日期（默认）</li><li>true 不展示签署日期<br><img src="https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png" alt="image">。</li></ul>
     * @param HideDate <p>签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。</p><ul><li>false 展示签署日期（默认）</li><li>true 不展示签署日期<br><img src="https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png" alt="image">。</li></ul>
     */
    public void setHideDate(Boolean HideDate) {
        this.HideDate = HideDate;
    }

    /**
     * Get <p>【仅 SignBeanTag=1 时有效】 签署方自行添加签署印章类控件（SIGN_SEAL、SIGN_PAGING_SEAL、SIGN_LEGAL_PERSON_SEAL）时，「盖章区适配签署方印章尺寸」开关的控制策略</p><p>枚举值：</p><ul><li>0： 默认关闭，可开启。与现网一致</li><li>1： 关闭且置灰——按控件默认的4.2cm尺寸盖章，签署方无法开启开关</li><li>2： 默认开启且可修改——默认按印章实际尺寸盖章，签署方可手动关闭</li><li>3： 开启且置灰——强制按印章实际尺寸盖章，签署方不可修改</li></ul><p>默认值：0</p> 
     * @return AddSignComponentUseSealSize <p>【仅 SignBeanTag=1 时有效】 签署方自行添加签署印章类控件（SIGN_SEAL、SIGN_PAGING_SEAL、SIGN_LEGAL_PERSON_SEAL）时，「盖章区适配签署方印章尺寸」开关的控制策略</p><p>枚举值：</p><ul><li>0： 默认关闭，可开启。与现网一致</li><li>1： 关闭且置灰——按控件默认的4.2cm尺寸盖章，签署方无法开启开关</li><li>2： 默认开启且可修改——默认按印章实际尺寸盖章，签署方可手动关闭</li><li>3： 开启且置灰——强制按印章实际尺寸盖章，签署方不可修改</li></ul><p>默认值：0</p>
     */
    public Long getAddSignComponentUseSealSize() {
        return this.AddSignComponentUseSealSize;
    }

    /**
     * Set <p>【仅 SignBeanTag=1 时有效】 签署方自行添加签署印章类控件（SIGN_SEAL、SIGN_PAGING_SEAL、SIGN_LEGAL_PERSON_SEAL）时，「盖章区适配签署方印章尺寸」开关的控制策略</p><p>枚举值：</p><ul><li>0： 默认关闭，可开启。与现网一致</li><li>1： 关闭且置灰——按控件默认的4.2cm尺寸盖章，签署方无法开启开关</li><li>2： 默认开启且可修改——默认按印章实际尺寸盖章，签署方可手动关闭</li><li>3： 开启且置灰——强制按印章实际尺寸盖章，签署方不可修改</li></ul><p>默认值：0</p>
     * @param AddSignComponentUseSealSize <p>【仅 SignBeanTag=1 时有效】 签署方自行添加签署印章类控件（SIGN_SEAL、SIGN_PAGING_SEAL、SIGN_LEGAL_PERSON_SEAL）时，「盖章区适配签署方印章尺寸」开关的控制策略</p><p>枚举值：</p><ul><li>0： 默认关闭，可开启。与现网一致</li><li>1： 关闭且置灰——按控件默认的4.2cm尺寸盖章，签署方无法开启开关</li><li>2： 默认开启且可修改——默认按印章实际尺寸盖章，签署方可手动关闭</li><li>3： 开启且置灰——强制按印章实际尺寸盖章，签署方不可修改</li></ul><p>默认值：0</p>
     */
    public void setAddSignComponentUseSealSize(Long AddSignComponentUseSealSize) {
        this.AddSignComponentUseSealSize = AddSignComponentUseSealSize;
    }

    public SignComponentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignComponentConfig(SignComponentConfig source) {
        if (source.HideDate != null) {
            this.HideDate = new Boolean(source.HideDate);
        }
        if (source.AddSignComponentUseSealSize != null) {
            this.AddSignComponentUseSealSize = new Long(source.AddSignComponentUseSealSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HideDate", this.HideDate);
        this.setParamSimple(map, prefix + "AddSignComponentUseSealSize", this.AddSignComponentUseSealSize);

    }
}

