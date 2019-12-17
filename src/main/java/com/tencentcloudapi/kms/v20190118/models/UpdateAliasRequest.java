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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAliasRequest extends AbstractModel{

    /**
    * 新的别名，1-60个字符或数字的组合
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * CMK的全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * Get 新的别名，1-60个字符或数字的组合 
     * @return Alias 新的别名，1-60个字符或数字的组合
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 新的别名，1-60个字符或数字的组合
     * @param Alias 新的别名，1-60个字符或数字的组合
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get CMK的全局唯一标识符 
     * @return KeyId CMK的全局唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的全局唯一标识符
     * @param KeyId CMK的全局唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

