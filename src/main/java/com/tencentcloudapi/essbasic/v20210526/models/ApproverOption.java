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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverOption extends AbstractModel{

    /**
    * 是否隐藏一键签署 默认false-不隐藏true-隐藏
    */
    @SerializedName("HideOneKeySign")
    @Expose
    private Boolean HideOneKeySign;

    /**
    * 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）</li>
</ul>
    */
    @SerializedName("FillType")
    @Expose
    private Long FillType;

    /**
     * Get 是否隐藏一键签署 默认false-不隐藏true-隐藏 
     * @return HideOneKeySign 是否隐藏一键签署 默认false-不隐藏true-隐藏
     */
    public Boolean getHideOneKeySign() {
        return this.HideOneKeySign;
    }

    /**
     * Set 是否隐藏一键签署 默认false-不隐藏true-隐藏
     * @param HideOneKeySign 是否隐藏一键签署 默认false-不隐藏true-隐藏
     */
    public void setHideOneKeySign(Boolean HideOneKeySign) {
        this.HideOneKeySign = HideOneKeySign;
    }

    /**
     * Get 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）</li>
</ul> 
     * @return FillType 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）</li>
</ul>
     */
    public Long getFillType() {
        return this.FillType;
    }

    /**
     * Set 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）</li>
</ul>
     * @param FillType 签署人信息补充类型，默认无需补充。

<ul><li> **1** : ( 动态签署人（可发起合同后再补充签署人信息）</li>
</ul>
     */
    public void setFillType(Long FillType) {
        this.FillType = FillType;
    }

    public ApproverOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverOption(ApproverOption source) {
        if (source.HideOneKeySign != null) {
            this.HideOneKeySign = new Boolean(source.HideOneKeySign);
        }
        if (source.FillType != null) {
            this.FillType = new Long(source.FillType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HideOneKeySign", this.HideOneKeySign);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

