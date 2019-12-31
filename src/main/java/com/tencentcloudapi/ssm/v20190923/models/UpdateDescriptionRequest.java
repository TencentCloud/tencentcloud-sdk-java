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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDescriptionRequest extends AbstractModel{

    /**
    * 指定需要更新描述信息的凭据名。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 新的描述信息，最大长度2048个字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 指定需要更新描述信息的凭据名。 
     * @return SecretName 指定需要更新描述信息的凭据名。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 指定需要更新描述信息的凭据名。
     * @param SecretName 指定需要更新描述信息的凭据名。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 新的描述信息，最大长度2048个字节。 
     * @return Description 新的描述信息，最大长度2048个字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 新的描述信息，最大长度2048个字节。
     * @param Description 新的描述信息，最大长度2048个字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

