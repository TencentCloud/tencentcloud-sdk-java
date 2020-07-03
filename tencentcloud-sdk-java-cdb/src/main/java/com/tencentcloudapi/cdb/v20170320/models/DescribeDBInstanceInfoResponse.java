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

public class DescribeDBInstanceInfoResponse extends AbstractModel{

    /**
    * 实例 ID 。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 是否开通加密，YES 已开通，NO 未开通。
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * 加密使用的密钥 ID 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例 ID 。 
     * @return InstanceId 实例 ID 。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。
     * @param InstanceId 实例 ID 。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 是否开通加密，YES 已开通，NO 未开通。 
     * @return Encryption 是否开通加密，YES 已开通，NO 未开通。
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 是否开通加密，YES 已开通，NO 未开通。
     * @param Encryption 是否开通加密，YES 已开通，NO 未开通。
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 加密使用的密钥 ID 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId 加密使用的密钥 ID 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 加密使用的密钥 ID 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId 加密使用的密钥 ID 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyRegion 密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set 密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyRegion 密钥所在地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

