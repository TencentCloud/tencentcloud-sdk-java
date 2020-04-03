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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCertificateProjectResponse extends AbstractModel{

    /**
    * 修改所属项目成功的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessCertificates")
    @Expose
    private String [] SuccessCertificates;

    /**
    * 修改所属项目失败的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailCertificates")
    @Expose
    private String [] FailCertificates;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 修改所属项目成功的证书集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessCertificates 修改所属项目成功的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuccessCertificates() {
        return this.SuccessCertificates;
    }

    /**
     * Set 修改所属项目成功的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessCertificates 修改所属项目成功的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessCertificates(String [] SuccessCertificates) {
        this.SuccessCertificates = SuccessCertificates;
    }

    /**
     * Get 修改所属项目失败的证书集合。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailCertificates 修改所属项目失败的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailCertificates() {
        return this.FailCertificates;
    }

    /**
     * Set 修改所属项目失败的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailCertificates 修改所属项目失败的证书集合。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailCertificates(String [] FailCertificates) {
        this.FailCertificates = FailCertificates;
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
        this.setParamArraySimple(map, prefix + "SuccessCertificates.", this.SuccessCertificates);
        this.setParamArraySimple(map, prefix + "FailCertificates.", this.FailCertificates);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

