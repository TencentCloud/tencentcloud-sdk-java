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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTransparentDataEncryptionStatusResponse extends AbstractModel {

    /**
    * 表示是否开启了透明加密。 
- close：未开启。
- open：已开启。
    */
    @SerializedName("TransparentDataEncryptionStatus")
    @Expose
    private String TransparentDataEncryptionStatus;

    /**
    * 已绑定的密钥列表，如未绑定，返回null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyInfoList")
    @Expose
    private KMSInfoDetail [] KeyInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 表示是否开启了透明加密。 
- close：未开启。
- open：已开启。 
     * @return TransparentDataEncryptionStatus 表示是否开启了透明加密。 
- close：未开启。
- open：已开启。
     */
    public String getTransparentDataEncryptionStatus() {
        return this.TransparentDataEncryptionStatus;
    }

    /**
     * Set 表示是否开启了透明加密。 
- close：未开启。
- open：已开启。
     * @param TransparentDataEncryptionStatus 表示是否开启了透明加密。 
- close：未开启。
- open：已开启。
     */
    public void setTransparentDataEncryptionStatus(String TransparentDataEncryptionStatus) {
        this.TransparentDataEncryptionStatus = TransparentDataEncryptionStatus;
    }

    /**
     * Get 已绑定的密钥列表，如未绑定，返回null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyInfoList 已绑定的密钥列表，如未绑定，返回null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KMSInfoDetail [] getKeyInfoList() {
        return this.KeyInfoList;
    }

    /**
     * Set 已绑定的密钥列表，如未绑定，返回null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyInfoList 已绑定的密钥列表，如未绑定，返回null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyInfoList(KMSInfoDetail [] KeyInfoList) {
        this.KeyInfoList = KeyInfoList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTransparentDataEncryptionStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTransparentDataEncryptionStatusResponse(DescribeTransparentDataEncryptionStatusResponse source) {
        if (source.TransparentDataEncryptionStatus != null) {
            this.TransparentDataEncryptionStatus = new String(source.TransparentDataEncryptionStatus);
        }
        if (source.KeyInfoList != null) {
            this.KeyInfoList = new KMSInfoDetail[source.KeyInfoList.length];
            for (int i = 0; i < source.KeyInfoList.length; i++) {
                this.KeyInfoList[i] = new KMSInfoDetail(source.KeyInfoList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransparentDataEncryptionStatus", this.TransparentDataEncryptionStatus);
        this.setParamArrayObj(map, prefix + "KeyInfoList.", this.KeyInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

