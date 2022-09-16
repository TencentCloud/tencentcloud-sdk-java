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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractTraceWatermarkTaskOutput extends AbstractModel{

    /**
    * 播放者的 ID，以十六进制表示，共6位，该参数用于 [溯源水印](https://cloud.tencent.com/document/product/266/75789) 使用场景。
    */
    @SerializedName("Uv")
    @Expose
    private String Uv;

    /**
    * 该字段已废弃。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
     * Get 播放者的 ID，以十六进制表示，共6位，该参数用于 [溯源水印](https://cloud.tencent.com/document/product/266/75789) 使用场景。 
     * @return Uv 播放者的 ID，以十六进制表示，共6位，该参数用于 [溯源水印](https://cloud.tencent.com/document/product/266/75789) 使用场景。
     */
    public String getUv() {
        return this.Uv;
    }

    /**
     * Set 播放者的 ID，以十六进制表示，共6位，该参数用于 [溯源水印](https://cloud.tencent.com/document/product/266/75789) 使用场景。
     * @param Uv 播放者的 ID，以十六进制表示，共6位，该参数用于 [溯源水印](https://cloud.tencent.com/document/product/266/75789) 使用场景。
     */
    public void setUv(String Uv) {
        this.Uv = Uv;
    }

    /**
     * Get 该字段已废弃。 
     * @return Uid 该字段已废弃。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 该字段已废弃。
     * @param Uid 该字段已废弃。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public ExtractTraceWatermarkTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractTraceWatermarkTaskOutput(ExtractTraceWatermarkTaskOutput source) {
        if (source.Uv != null) {
            this.Uv = new String(source.Uv);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uv", this.Uv);
        this.setParamSimple(map, prefix + "Uid", this.Uid);

    }
}

