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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployCertificateRecordRetryRequest extends AbstractModel {

    /**
    * 待重试部署记录ID，通过DeployCertificateInstance获得
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * 待重试部署记录详情ID，通过DescribeHostDeployRecordDetail获得
    */
    @SerializedName("DeployRecordDetailId")
    @Expose
    private Long DeployRecordDetailId;

    /**
     * Get 待重试部署记录ID，通过DeployCertificateInstance获得 
     * @return DeployRecordId 待重试部署记录ID，通过DeployCertificateInstance获得
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 待重试部署记录ID，通过DeployCertificateInstance获得
     * @param DeployRecordId 待重试部署记录ID，通过DeployCertificateInstance获得
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get 待重试部署记录详情ID，通过DescribeHostDeployRecordDetail获得 
     * @return DeployRecordDetailId 待重试部署记录详情ID，通过DescribeHostDeployRecordDetail获得
     */
    public Long getDeployRecordDetailId() {
        return this.DeployRecordDetailId;
    }

    /**
     * Set 待重试部署记录详情ID，通过DescribeHostDeployRecordDetail获得
     * @param DeployRecordDetailId 待重试部署记录详情ID，通过DescribeHostDeployRecordDetail获得
     */
    public void setDeployRecordDetailId(Long DeployRecordDetailId) {
        this.DeployRecordDetailId = DeployRecordDetailId;
    }

    public DeployCertificateRecordRetryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployCertificateRecordRetryRequest(DeployCertificateRecordRetryRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployRecordDetailId != null) {
            this.DeployRecordDetailId = new Long(source.DeployRecordDetailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployRecordDetailId", this.DeployRecordDetailId);

    }
}

