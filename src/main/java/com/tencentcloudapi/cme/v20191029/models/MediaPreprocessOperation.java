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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaPreprocessOperation extends AbstractModel{

    /**
    * 预处理操作的类型，取值范围：
<li>ImageTextMask：图片文字遮罩。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 预处理操作参数。
当 Type 取值 ImageTextMask 时，参数为要保留的文字。
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
     * Get 预处理操作的类型，取值范围：
<li>ImageTextMask：图片文字遮罩。</li> 
     * @return Type 预处理操作的类型，取值范围：
<li>ImageTextMask：图片文字遮罩。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 预处理操作的类型，取值范围：
<li>ImageTextMask：图片文字遮罩。</li>
     * @param Type 预处理操作的类型，取值范围：
<li>ImageTextMask：图片文字遮罩。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 预处理操作参数。
当 Type 取值 ImageTextMask 时，参数为要保留的文字。 
     * @return Args 预处理操作参数。
当 Type 取值 ImageTextMask 时，参数为要保留的文字。
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set 预处理操作参数。
当 Type 取值 ImageTextMask 时，参数为要保留的文字。
     * @param Args 预处理操作参数。
当 Type 取值 ImageTextMask 时，参数为要保留的文字。
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    public MediaPreprocessOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaPreprocessOperation(MediaPreprocessOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);

    }
}

