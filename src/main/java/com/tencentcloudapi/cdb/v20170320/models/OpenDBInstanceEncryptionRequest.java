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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenDBInstanceEncryptionRequest extends AbstractModel{

    /**
    * 云数据库实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户自定义密钥ID，CMK唯一标识符。该值为空时，将使用腾讯云自动生成的密钥KMS-CDB。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId不为空时，该参数必填。
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
     * Get 云数据库实例 ID。 
     * @return InstanceId 云数据库实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云数据库实例 ID。
     * @param InstanceId 云数据库实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户自定义密钥ID，CMK唯一标识符。该值为空时，将使用腾讯云自动生成的密钥KMS-CDB。 
     * @return KeyId 用户自定义密钥ID，CMK唯一标识符。该值为空时，将使用腾讯云自动生成的密钥KMS-CDB。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 用户自定义密钥ID，CMK唯一标识符。该值为空时，将使用腾讯云自动生成的密钥KMS-CDB。
     * @param KeyId 用户自定义密钥ID，CMK唯一标识符。该值为空时，将使用腾讯云自动生成的密钥KMS-CDB。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId不为空时，该参数必填。 
     * @return KeyRegion 用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId不为空时，该参数必填。
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set 用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId不为空时，该参数必填。
     * @param KeyRegion 用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId不为空时，该参数必填。
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    public OpenDBInstanceEncryptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenDBInstanceEncryptionRequest(OpenDBInstanceEncryptionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);

    }
}

