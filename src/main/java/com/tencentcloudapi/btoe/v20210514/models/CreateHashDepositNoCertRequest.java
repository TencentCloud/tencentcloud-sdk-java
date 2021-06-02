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
package com.tencentcloudapi.btoe.v20210514.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHashDepositNoCertRequest extends AbstractModel{

    /**
    * 数据hash
    */
    @SerializedName("EvidenceHash")
    @Expose
    private String EvidenceHash;

    /**
    * 该字段为透传字段，方便调用方做业务处理， 长度最大不超过64
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 业务扩展信息
    */
    @SerializedName("EvidenceInfo")
    @Expose
    private String EvidenceInfo;

    /**
     * Get 数据hash 
     * @return EvidenceHash 数据hash
     */
    public String getEvidenceHash() {
        return this.EvidenceHash;
    }

    /**
     * Set 数据hash
     * @param EvidenceHash 数据hash
     */
    public void setEvidenceHash(String EvidenceHash) {
        this.EvidenceHash = EvidenceHash;
    }

    /**
     * Get 该字段为透传字段，方便调用方做业务处理， 长度最大不超过64 
     * @return BusinessId 该字段为透传字段，方便调用方做业务处理， 长度最大不超过64
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 该字段为透传字段，方便调用方做业务处理， 长度最大不超过64
     * @param BusinessId 该字段为透传字段，方便调用方做业务处理， 长度最大不超过64
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 业务扩展信息 
     * @return EvidenceInfo 业务扩展信息
     */
    public String getEvidenceInfo() {
        return this.EvidenceInfo;
    }

    /**
     * Set 业务扩展信息
     * @param EvidenceInfo 业务扩展信息
     */
    public void setEvidenceInfo(String EvidenceInfo) {
        this.EvidenceInfo = EvidenceInfo;
    }

    public CreateHashDepositNoCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHashDepositNoCertRequest(CreateHashDepositNoCertRequest source) {
        if (source.EvidenceHash != null) {
            this.EvidenceHash = new String(source.EvidenceHash);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.EvidenceInfo != null) {
            this.EvidenceInfo = new String(source.EvidenceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvidenceHash", this.EvidenceHash);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "EvidenceInfo", this.EvidenceInfo);

    }
}

