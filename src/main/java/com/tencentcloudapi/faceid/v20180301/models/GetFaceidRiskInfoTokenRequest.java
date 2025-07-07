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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceidRiskInfoTokenRequest extends AbstractModel {

    /**
    * SDK中生成的Meta字符串。
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * 透传参数 1000长度字符串。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get SDK中生成的Meta字符串。 
     * @return Meta SDK中生成的Meta字符串。
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set SDK中生成的Meta字符串。
     * @param Meta SDK中生成的Meta字符串。
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get 透传参数 1000长度字符串。 
     * @return Extra 透传参数 1000长度字符串。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传参数 1000长度字符串。
     * @param Extra 透传参数 1000长度字符串。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public GetFaceidRiskInfoTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceidRiskInfoTokenRequest(GetFaceidRiskInfoTokenRequest source) {
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Meta", this.Meta);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

