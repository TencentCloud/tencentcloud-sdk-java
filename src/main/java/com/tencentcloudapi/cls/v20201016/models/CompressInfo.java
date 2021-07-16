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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompressInfo extends AbstractModel{

    /**
    * 压缩格式，支持gzip、lzop和none不压缩
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 压缩格式，支持gzip、lzop和none不压缩 
     * @return Format 压缩格式，支持gzip、lzop和none不压缩
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 压缩格式，支持gzip、lzop和none不压缩
     * @param Format 压缩格式，支持gzip、lzop和none不压缩
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CompressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompressInfo(CompressInfo source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

