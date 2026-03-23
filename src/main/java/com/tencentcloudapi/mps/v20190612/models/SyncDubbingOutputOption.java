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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDubbingOutputOption extends AbstractModel {

    /**
    * <p>合成结果输出类型</p><p>枚举值：</p><ul><li>data： 音频base64编码</li><li>url： 音频url，有效期24小时</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>合成结果输出类型</p><p>枚举值：</p><ul><li>data： 音频base64编码</li><li>url： 音频url，有效期24小时</li></ul> 
     * @return Type <p>合成结果输出类型</p><p>枚举值：</p><ul><li>data： 音频base64编码</li><li>url： 音频url，有效期24小时</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>合成结果输出类型</p><p>枚举值：</p><ul><li>data： 音频base64编码</li><li>url： 音频url，有效期24小时</li></ul>
     * @param Type <p>合成结果输出类型</p><p>枚举值：</p><ul><li>data： 音频base64编码</li><li>url： 音频url，有效期24小时</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SyncDubbingOutputOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDubbingOutputOption(SyncDubbingOutputOption source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

