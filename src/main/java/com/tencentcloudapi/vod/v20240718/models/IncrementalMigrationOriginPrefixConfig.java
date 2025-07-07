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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationOriginPrefixConfig extends AbstractModel {

    /**
    * 源站地址前缀，如填充 `test/`，则回源地址为 `http(s)://<回源域名>/test/<文件名>`。
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
     * Get 源站地址前缀，如填充 `test/`，则回源地址为 `http(s)://<回源域名>/test/<文件名>`。 
     * @return Prefix 源站地址前缀，如填充 `test/`，则回源地址为 `http(s)://<回源域名>/test/<文件名>`。
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 源站地址前缀，如填充 `test/`，则回源地址为 `http(s)://<回源域名>/test/<文件名>`。
     * @param Prefix 源站地址前缀，如填充 `test/`，则回源地址为 `http(s)://<回源域名>/test/<文件名>`。
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    public IncrementalMigrationOriginPrefixConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationOriginPrefixConfig(IncrementalMigrationOriginPrefixConfig source) {
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);

    }
}

