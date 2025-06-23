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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateCertificateRecordRetryRequest extends AbstractModel {

    /**
    * 待重试部署记录ID,通过UpdateCertificateInstance得到部署记录ID。 本参数不传的话，则DeployRecordDetailId必传
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * 待重试部署记录详情ID,通过DescribeHostUpdateRecordDetail接口获得， 本参数不传的话， 则DeployRecordId必传
    */
    @SerializedName("DeployRecordDetailId")
    @Expose
    private Long DeployRecordDetailId;

    /**
     * Get 待重试部署记录ID,通过UpdateCertificateInstance得到部署记录ID。 本参数不传的话，则DeployRecordDetailId必传 
     * @return DeployRecordId 待重试部署记录ID,通过UpdateCertificateInstance得到部署记录ID。 本参数不传的话，则DeployRecordDetailId必传
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 待重试部署记录ID,通过UpdateCertificateInstance得到部署记录ID。 本参数不传的话，则DeployRecordDetailId必传
     * @param DeployRecordId 待重试部署记录ID,通过UpdateCertificateInstance得到部署记录ID。 本参数不传的话，则DeployRecordDetailId必传
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get 待重试部署记录详情ID,通过DescribeHostUpdateRecordDetail接口获得， 本参数不传的话， 则DeployRecordId必传 
     * @return DeployRecordDetailId 待重试部署记录详情ID,通过DescribeHostUpdateRecordDetail接口获得， 本参数不传的话， 则DeployRecordId必传
     */
    public Long getDeployRecordDetailId() {
        return this.DeployRecordDetailId;
    }

    /**
     * Set 待重试部署记录详情ID,通过DescribeHostUpdateRecordDetail接口获得， 本参数不传的话， 则DeployRecordId必传
     * @param DeployRecordDetailId 待重试部署记录详情ID,通过DescribeHostUpdateRecordDetail接口获得， 本参数不传的话， 则DeployRecordId必传
     */
    public void setDeployRecordDetailId(Long DeployRecordDetailId) {
        this.DeployRecordDetailId = DeployRecordDetailId;
    }

    public UploadUpdateCertificateRecordRetryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateRecordRetryRequest(UploadUpdateCertificateRecordRetryRequest source) {
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

