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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterGlobalEncryptionRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 开启或关闭全局加密
    */
    @SerializedName("IsOpenGlobalEncryption")
    @Expose
    private Boolean IsOpenGlobalEncryption;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 开启或关闭全局加密 
     * @return IsOpenGlobalEncryption 开启或关闭全局加密
     */
    public Boolean getIsOpenGlobalEncryption() {
        return this.IsOpenGlobalEncryption;
    }

    /**
     * Set 开启或关闭全局加密
     * @param IsOpenGlobalEncryption 开启或关闭全局加密
     */
    public void setIsOpenGlobalEncryption(Boolean IsOpenGlobalEncryption) {
        this.IsOpenGlobalEncryption = IsOpenGlobalEncryption;
    }

    public ModifyClusterGlobalEncryptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterGlobalEncryptionRequest(ModifyClusterGlobalEncryptionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.IsOpenGlobalEncryption != null) {
            this.IsOpenGlobalEncryption = new Boolean(source.IsOpenGlobalEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "IsOpenGlobalEncryption", this.IsOpenGlobalEncryption);

    }
}

