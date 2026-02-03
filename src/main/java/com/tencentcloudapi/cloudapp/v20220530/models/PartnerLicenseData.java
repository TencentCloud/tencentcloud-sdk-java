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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartnerLicenseData extends AbstractModel {

    /**
    * <p>License 文本内容。可传入密钥、证书等文本型 License 内容，二进制内容请进行 base64 编码</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>License 的额外信息，JSON 字符串格式</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get <p>License 文本内容。可传入密钥、证书等文本型 License 内容，二进制内容请进行 base64 编码</p> 
     * @return Text <p>License 文本内容。可传入密钥、证书等文本型 License 内容，二进制内容请进行 base64 编码</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>License 文本内容。可传入密钥、证书等文本型 License 内容，二进制内容请进行 base64 编码</p>
     * @param Text <p>License 文本内容。可传入密钥、证书等文本型 License 内容，二进制内容请进行 base64 编码</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>License 的额外信息，JSON 字符串格式</p> 
     * @return ExtraData <p>License 的额外信息，JSON 字符串格式</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>License 的额外信息，JSON 字符串格式</p>
     * @param ExtraData <p>License 的额外信息，JSON 字符串格式</p>
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    public PartnerLicenseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartnerLicenseData(PartnerLicenseData source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);

    }
}

