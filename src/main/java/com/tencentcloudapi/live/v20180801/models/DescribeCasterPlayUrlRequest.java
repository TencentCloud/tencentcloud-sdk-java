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

public class DescribeCasterPlayUrlRequest extends AbstractModel {

    /**
    * 导播台ID
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 请求播放url的类型。
取值范围[1，2，3]
1：获取输入源的播放url
2：获取pvw的播放url
3：获取pgm的播放url
    */
    @SerializedName("PlayUrlType")
    @Expose
    private Long PlayUrlType;

    /**
    * 仅在PlayUrlType为1时生效，此时该参数表示请求的输入源Index。
注：对应的输入源必须存在。
    */
    @SerializedName("PlayUrlIndex")
    @Expose
    private Long PlayUrlIndex;

    /**
     * Get 导播台ID 
     * @return CasterId 导播台ID
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 导播台ID
     * @param CasterId 导播台ID
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 请求播放url的类型。
取值范围[1，2，3]
1：获取输入源的播放url
2：获取pvw的播放url
3：获取pgm的播放url 
     * @return PlayUrlType 请求播放url的类型。
取值范围[1，2，3]
1：获取输入源的播放url
2：获取pvw的播放url
3：获取pgm的播放url
     */
    public Long getPlayUrlType() {
        return this.PlayUrlType;
    }

    /**
     * Set 请求播放url的类型。
取值范围[1，2，3]
1：获取输入源的播放url
2：获取pvw的播放url
3：获取pgm的播放url
     * @param PlayUrlType 请求播放url的类型。
取值范围[1，2，3]
1：获取输入源的播放url
2：获取pvw的播放url
3：获取pgm的播放url
     */
    public void setPlayUrlType(Long PlayUrlType) {
        this.PlayUrlType = PlayUrlType;
    }

    /**
     * Get 仅在PlayUrlType为1时生效，此时该参数表示请求的输入源Index。
注：对应的输入源必须存在。 
     * @return PlayUrlIndex 仅在PlayUrlType为1时生效，此时该参数表示请求的输入源Index。
注：对应的输入源必须存在。
     */
    public Long getPlayUrlIndex() {
        return this.PlayUrlIndex;
    }

    /**
     * Set 仅在PlayUrlType为1时生效，此时该参数表示请求的输入源Index。
注：对应的输入源必须存在。
     * @param PlayUrlIndex 仅在PlayUrlType为1时生效，此时该参数表示请求的输入源Index。
注：对应的输入源必须存在。
     */
    public void setPlayUrlIndex(Long PlayUrlIndex) {
        this.PlayUrlIndex = PlayUrlIndex;
    }

    public DescribeCasterPlayUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCasterPlayUrlRequest(DescribeCasterPlayUrlRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.PlayUrlType != null) {
            this.PlayUrlType = new Long(source.PlayUrlType);
        }
        if (source.PlayUrlIndex != null) {
            this.PlayUrlIndex = new Long(source.PlayUrlIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "PlayUrlType", this.PlayUrlType);
        this.setParamSimple(map, prefix + "PlayUrlIndex", this.PlayUrlIndex);

    }
}

