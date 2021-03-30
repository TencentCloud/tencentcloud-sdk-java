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

public class UrlSignatureAuthPolicy extends AbstractModel{

    /**
    * [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)中用于生成签名的密钥。
    */
    @SerializedName("EncryptedKey")
    @Expose
    private String EncryptedKey;

    /**
     * Get [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li> 
     * @return Status [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
     * @param Status [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)设置状态，可选值：
<li>Enabled: 启用；</li>
<li>Disabled: 禁用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)中用于生成签名的密钥。 
     * @return EncryptedKey [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)中用于生成签名的密钥。
     */
    public String getEncryptedKey() {
        return this.EncryptedKey;
    }

    /**
     * Set [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)中用于生成签名的密钥。
     * @param EncryptedKey [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)中用于生成签名的密钥。
     */
    public void setEncryptedKey(String EncryptedKey) {
        this.EncryptedKey = EncryptedKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EncryptedKey", this.EncryptedKey);

    }
}

