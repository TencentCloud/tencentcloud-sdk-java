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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAssetImageRegistryRegistryDetailResponse extends AbstractModel{

    /**
    * 连接错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckErr")
    @Expose
    private String HealthCheckErr;

    /**
    * 名称错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameRepeatErr")
    @Expose
    private String NameRepeatErr;

    /**
    * 仓库唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private Long RegistryId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 连接错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckErr 连接错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCheckErr() {
        return this.HealthCheckErr;
    }

    /**
     * Set 连接错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckErr 连接错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckErr(String HealthCheckErr) {
        this.HealthCheckErr = HealthCheckErr;
    }

    /**
     * Get 名称错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameRepeatErr 名称错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameRepeatErr() {
        return this.NameRepeatErr;
    }

    /**
     * Set 名称错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameRepeatErr 名称错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameRepeatErr(String NameRepeatErr) {
        this.NameRepeatErr = NameRepeatErr;
    }

    /**
     * Get 仓库唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId 仓库唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 仓库唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId 仓库唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(Long RegistryId) {
        this.RegistryId = RegistryId;
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

    public UpdateAssetImageRegistryRegistryDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAssetImageRegistryRegistryDetailResponse(UpdateAssetImageRegistryRegistryDetailResponse source) {
        if (source.HealthCheckErr != null) {
            this.HealthCheckErr = new String(source.HealthCheckErr);
        }
        if (source.NameRepeatErr != null) {
            this.NameRepeatErr = new String(source.NameRepeatErr);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new Long(source.RegistryId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckErr", this.HealthCheckErr);
        this.setParamSimple(map, prefix + "NameRepeatErr", this.NameRepeatErr);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

