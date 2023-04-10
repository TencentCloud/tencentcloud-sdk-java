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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseFileSignRequest extends AbstractModel{

    /**
    * 超时时间，不填默认是 5 分钟
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * bucket类型，不填默认web，2:app
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
     * Get 超时时间，不填默认是 5 分钟 
     * @return Timeout 超时时间，不填默认是 5 分钟
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间，不填默认是 5 分钟
     * @param Timeout 超时时间，不填默认是 5 分钟
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get bucket类型，不填默认web，2:app 
     * @return FileType bucket类型，不填默认web，2:app
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set bucket类型，不填默认web，2:app
     * @param FileType bucket类型，不填默认web，2:app
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    public DescribeReleaseFileSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseFileSignRequest(DescribeReleaseFileSignRequest source) {
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

