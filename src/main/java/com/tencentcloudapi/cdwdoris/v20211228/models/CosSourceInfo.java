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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosSourceInfo extends AbstractModel {

    /**
    * cos认证中的Id
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * cos认证中的key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * cos认证中的路径
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
     * Get cos认证中的Id 
     * @return SecretId cos认证中的Id
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set cos认证中的Id
     * @param SecretId cos认证中的Id
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get cos认证中的key 
     * @return SecretKey cos认证中的key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set cos认证中的key
     * @param SecretKey cos认证中的key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get cos认证中的路径 
     * @return CosPath cos认证中的路径
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set cos认证中的路径
     * @param CosPath cos认证中的路径
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    public CosSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosSourceInfo(CosSourceInfo source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);

    }
}

