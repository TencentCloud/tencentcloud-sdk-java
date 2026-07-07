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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiModalityAttachments extends AbstractModel {

    /**
    * <p>base64 url编码的文件内容</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * <p>附件类型</p><p>枚举值：</p><ul><li>image： 图像</li><li>pdf： pdf（文件）</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>base64 url编码的文件内容</p> 
     * @return Data <p>base64 url编码的文件内容</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>base64 url编码的文件内容</p>
     * @param Data <p>base64 url编码的文件内容</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get <p>附件类型</p><p>枚举值：</p><ul><li>image： 图像</li><li>pdf： pdf（文件）</li></ul> 
     * @return Type <p>附件类型</p><p>枚举值：</p><ul><li>image： 图像</li><li>pdf： pdf（文件）</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>附件类型</p><p>枚举值：</p><ul><li>image： 图像</li><li>pdf： pdf（文件）</li></ul>
     * @param Type <p>附件类型</p><p>枚举值：</p><ul><li>image： 图像</li><li>pdf： pdf（文件）</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public MultiModalityAttachments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiModalityAttachments(MultiModalityAttachments source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

