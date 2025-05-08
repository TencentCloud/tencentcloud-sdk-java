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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyMetadata extends AbstractModel {

    /**
    * 作为密钥更容易辨识，更容易被人看懂的别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * CMK的全局唯一标识
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get 作为密钥更容易辨识，更容易被人看懂的别名 
     * @return Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 作为密钥更容易辨识，更容易被人看懂的别名
     * @param Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get CMK的全局唯一标识 
     * @return KeyId CMK的全局唯一标识
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的全局唯一标识
     * @param KeyId CMK的全局唯一标识
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public KeyMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyMetadata(KeyMetadata source) {
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

