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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupSetOption extends AbstractModel {

    /**
    * <p>存储加密方式。取值：<br>&quot;UnEncrypted&quot; - 非加密存储;<br>&quot;SSE-COS&quot; - 内置加密存储;<br>&quot;SSE-KMS&quot; - KMS 加密存储。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get <p>存储加密方式。取值：<br>&quot;UnEncrypted&quot; - 非加密存储;<br>&quot;SSE-COS&quot; - 内置加密存储;<br>&quot;SSE-KMS&quot; - KMS 加密存储。</p> 
     * @return Encryption <p>存储加密方式。取值：<br>&quot;UnEncrypted&quot; - 非加密存储;<br>&quot;SSE-COS&quot; - 内置加密存储;<br>&quot;SSE-KMS&quot; - KMS 加密存储。</p>
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>存储加密方式。取值：<br>&quot;UnEncrypted&quot; - 非加密存储;<br>&quot;SSE-COS&quot; - 内置加密存储;<br>&quot;SSE-KMS&quot; - KMS 加密存储。</p>
     * @param Encryption <p>存储加密方式。取值：<br>&quot;UnEncrypted&quot; - 非加密存储;<br>&quot;SSE-COS&quot; - 内置加密存储;<br>&quot;SSE-KMS&quot; - KMS 加密存储。</p>
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    public BackupSetOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSetOption(BackupSetOption source) {
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);

    }
}

