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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenDBInstanceEncryptionRequest extends AbstractModel {

    /**
    * <p>云数据库实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户自定义密钥 ID，CMK 唯一标识符。该值为空时，将使用腾讯云自动生成的密钥 KMS-CDB。</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId 不为空时，该参数必填。</p>
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
     * Get <p>云数据库实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>云数据库实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云数据库实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>云数据库实例 ID。可通过 <a href="https://cloud.tencent.com/document/product/236/15872">DescribeDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户自定义密钥 ID，CMK 唯一标识符。该值为空时，将使用腾讯云自动生成的密钥 KMS-CDB。</p> 
     * @return KeyId <p>用户自定义密钥 ID，CMK 唯一标识符。该值为空时，将使用腾讯云自动生成的密钥 KMS-CDB。</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>用户自定义密钥 ID，CMK 唯一标识符。该值为空时，将使用腾讯云自动生成的密钥 KMS-CDB。</p>
     * @param KeyId <p>用户自定义密钥 ID，CMK 唯一标识符。该值为空时，将使用腾讯云自动生成的密钥 KMS-CDB。</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId 不为空时，该参数必填。</p> 
     * @return KeyRegion <p>用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId 不为空时，该参数必填。</p>
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set <p>用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId 不为空时，该参数必填。</p>
     * @param KeyRegion <p>用户自定义密钥的存储地域。如：ap-guangzhou 。KeyId 不为空时，该参数必填。</p>
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

