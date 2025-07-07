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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessWhiteListRuleRequest extends AbstractModel {

    /**
    * ip 10.10.10.1或者网段10.10.10.0/24，最小长度4字节，最大长度40字节。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 备注信息，最小长度0字符，最大长度40字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get ip 10.10.10.1或者网段10.10.10.0/24，最小长度4字节，最大长度40字节。 
     * @return Source ip 10.10.10.1或者网段10.10.10.0/24，最小长度4字节，最大长度40字节。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set ip 10.10.10.1或者网段10.10.10.0/24，最小长度4字节，最大长度40字节。
     * @param Source ip 10.10.10.1或者网段10.10.10.0/24，最小长度4字节，最大长度40字节。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 备注信息，最小长度0字符，最大长度40字符。 
     * @return Remark 备注信息，最小长度0字符，最大长度40字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，最小长度0字符，最大长度40字符。
     * @param Remark 备注信息，最小长度0字符，最大长度40字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateAccessWhiteListRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessWhiteListRuleRequest(CreateAccessWhiteListRuleRequest source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

