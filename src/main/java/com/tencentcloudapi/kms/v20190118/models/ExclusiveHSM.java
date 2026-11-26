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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExclusiveHSM extends AbstractModel {

    /**
    * <p>独享集群Id</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>独享集群名称</p>
    */
    @SerializedName("HsmClusterName")
    @Expose
    private String HsmClusterName;

    /**
    * <p>根密钥的使用量</p><p>单位：个</p>
    */
    @SerializedName("CmkUserCount")
    @Expose
    private Long CmkUserCount;

    /**
    * <p>根密钥的额度</p><p>单位：个</p>
    */
    @SerializedName("CmkLimit")
    @Expose
    private Long CmkLimit;

    /**
     * Get <p>独享集群Id</p> 
     * @return HsmClusterId <p>独享集群Id</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>独享集群Id</p>
     * @param HsmClusterId <p>独享集群Id</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>独享集群名称</p> 
     * @return HsmClusterName <p>独享集群名称</p>
     */
    public String getHsmClusterName() {
        return this.HsmClusterName;
    }

    /**
     * Set <p>独享集群名称</p>
     * @param HsmClusterName <p>独享集群名称</p>
     */
    public void setHsmClusterName(String HsmClusterName) {
        this.HsmClusterName = HsmClusterName;
    }

    /**
     * Get <p>根密钥的使用量</p><p>单位：个</p> 
     * @return CmkUserCount <p>根密钥的使用量</p><p>单位：个</p>
     */
    public Long getCmkUserCount() {
        return this.CmkUserCount;
    }

    /**
     * Set <p>根密钥的使用量</p><p>单位：个</p>
     * @param CmkUserCount <p>根密钥的使用量</p><p>单位：个</p>
     */
    public void setCmkUserCount(Long CmkUserCount) {
        this.CmkUserCount = CmkUserCount;
    }

    /**
     * Get <p>根密钥的额度</p><p>单位：个</p> 
     * @return CmkLimit <p>根密钥的额度</p><p>单位：个</p>
     */
    public Long getCmkLimit() {
        return this.CmkLimit;
    }

    /**
     * Set <p>根密钥的额度</p><p>单位：个</p>
     * @param CmkLimit <p>根密钥的额度</p><p>单位：个</p>
     */
    public void setCmkLimit(Long CmkLimit) {
        this.CmkLimit = CmkLimit;
    }

    public ExclusiveHSM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExclusiveHSM(ExclusiveHSM source) {
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.HsmClusterName != null) {
            this.HsmClusterName = new String(source.HsmClusterName);
        }
        if (source.CmkUserCount != null) {
            this.CmkUserCount = new Long(source.CmkUserCount);
        }
        if (source.CmkLimit != null) {
            this.CmkLimit = new Long(source.CmkLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "HsmClusterName", this.HsmClusterName);
        this.setParamSimple(map, prefix + "CmkUserCount", this.CmkUserCount);
        this.setParamSimple(map, prefix + "CmkLimit", this.CmkLimit);

    }
}

