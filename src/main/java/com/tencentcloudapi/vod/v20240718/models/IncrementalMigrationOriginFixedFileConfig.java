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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationOriginFixedFileConfig extends AbstractModel {

    /**
    * 固定文件路径；如填充 `example/test.png`，则回源地址为： `http(s)://<回源域名>/example/test.png`。
    */
    @SerializedName("FixedFilePath")
    @Expose
    private String FixedFilePath;

    /**
     * Get 固定文件路径；如填充 `example/test.png`，则回源地址为： `http(s)://<回源域名>/example/test.png`。 
     * @return FixedFilePath 固定文件路径；如填充 `example/test.png`，则回源地址为： `http(s)://<回源域名>/example/test.png`。
     */
    public String getFixedFilePath() {
        return this.FixedFilePath;
    }

    /**
     * Set 固定文件路径；如填充 `example/test.png`，则回源地址为： `http(s)://<回源域名>/example/test.png`。
     * @param FixedFilePath 固定文件路径；如填充 `example/test.png`，则回源地址为： `http(s)://<回源域名>/example/test.png`。
     */
    public void setFixedFilePath(String FixedFilePath) {
        this.FixedFilePath = FixedFilePath;
    }

    public IncrementalMigrationOriginFixedFileConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationOriginFixedFileConfig(IncrementalMigrationOriginFixedFileConfig source) {
        if (source.FixedFilePath != null) {
            this.FixedFilePath = new String(source.FixedFilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixedFilePath", this.FixedFilePath);

    }
}

