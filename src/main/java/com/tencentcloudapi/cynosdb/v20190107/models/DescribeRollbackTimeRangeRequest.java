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

public class DescribeRollbackTimeRangeRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 保险箱id
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 保险箱地域
    */
    @SerializedName("VaultRegion")
    @Expose
    private String VaultRegion;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 保险箱id 
     * @return VaultId 保险箱id
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 保险箱id
     * @param VaultId 保险箱id
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 保险箱地域 
     * @return VaultRegion 保险箱地域
     */
    public String getVaultRegion() {
        return this.VaultRegion;
    }

    /**
     * Set 保险箱地域
     * @param VaultRegion 保险箱地域
     */
    public void setVaultRegion(String VaultRegion) {
        this.VaultRegion = VaultRegion;
    }

    public DescribeRollbackTimeRangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRollbackTimeRangeRequest(DescribeRollbackTimeRangeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultRegion != null) {
            this.VaultRegion = new String(source.VaultRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultRegion", this.VaultRegion);

    }
}

