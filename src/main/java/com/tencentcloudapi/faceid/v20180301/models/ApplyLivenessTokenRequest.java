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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyLivenessTokenRequest extends AbstractModel{

    /**
    * 枚举值，取值范围：1、2、3、4
各个含义如下
1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
     * Get 枚举值，取值范围：1、2、3、4
各个含义如下
1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认） 
     * @return SecureLevel 枚举值，取值范围：1、2、3、4
各个含义如下
1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set 枚举值，取值范围：1、2、3、4
各个含义如下
1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
     * @param SecureLevel 枚举值，取值范围：1、2、3、4
各个含义如下
1-静默
2-眨眼
3-光线
4-眨眼+光线 （默认）
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    public ApplyLivenessTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyLivenessTokenRequest(ApplyLivenessTokenRequest source) {
        if (source.SecureLevel != null) {
            this.SecureLevel = new String(source.SecureLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecureLevel", this.SecureLevel);

    }
}

