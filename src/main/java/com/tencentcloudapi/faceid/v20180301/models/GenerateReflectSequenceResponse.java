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

public class GenerateReflectSequenceResponse extends AbstractModel{

    /**
    * 光线序列的资源链接，下载后透传给SDK即可开始核身。
    */
    @SerializedName("ReflectSequenceUrl")
    @Expose
    private String ReflectSequenceUrl;

    /**
    * 光线序列的资源MD5值，用于校验改序列是否被篡改。
    */
    @SerializedName("ReflectSequenceMd5")
    @Expose
    private String ReflectSequenceMd5;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 光线序列的资源链接，下载后透传给SDK即可开始核身。 
     * @return ReflectSequenceUrl 光线序列的资源链接，下载后透传给SDK即可开始核身。
     */
    public String getReflectSequenceUrl() {
        return this.ReflectSequenceUrl;
    }

    /**
     * Set 光线序列的资源链接，下载后透传给SDK即可开始核身。
     * @param ReflectSequenceUrl 光线序列的资源链接，下载后透传给SDK即可开始核身。
     */
    public void setReflectSequenceUrl(String ReflectSequenceUrl) {
        this.ReflectSequenceUrl = ReflectSequenceUrl;
    }

    /**
     * Get 光线序列的资源MD5值，用于校验改序列是否被篡改。 
     * @return ReflectSequenceMd5 光线序列的资源MD5值，用于校验改序列是否被篡改。
     */
    public String getReflectSequenceMd5() {
        return this.ReflectSequenceMd5;
    }

    /**
     * Set 光线序列的资源MD5值，用于校验改序列是否被篡改。
     * @param ReflectSequenceMd5 光线序列的资源MD5值，用于校验改序列是否被篡改。
     */
    public void setReflectSequenceMd5(String ReflectSequenceMd5) {
        this.ReflectSequenceMd5 = ReflectSequenceMd5;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GenerateReflectSequenceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateReflectSequenceResponse(GenerateReflectSequenceResponse source) {
        if (source.ReflectSequenceUrl != null) {
            this.ReflectSequenceUrl = new String(source.ReflectSequenceUrl);
        }
        if (source.ReflectSequenceMd5 != null) {
            this.ReflectSequenceMd5 = new String(source.ReflectSequenceMd5);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReflectSequenceUrl", this.ReflectSequenceUrl);
        this.setParamSimple(map, prefix + "ReflectSequenceMd5", this.ReflectSequenceMd5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

