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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicDeviceStatusResponse extends AbstractModel{

    /**
    * 返回资源及状态，状态码：
1 - 封堵状态
2 - 正常状态
3 - 攻击状态
    */
    @SerializedName("Data")
    @Expose
    private KeyValue [] Data;

    /**
    * 域名化资产的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLBData")
    @Expose
    private KeyValue [] CLBData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回资源及状态，状态码：
1 - 封堵状态
2 - 正常状态
3 - 攻击状态 
     * @return Data 返回资源及状态，状态码：
1 - 封堵状态
2 - 正常状态
3 - 攻击状态
     */
    public KeyValue [] getData() {
        return this.Data;
    }

    /**
     * Set 返回资源及状态，状态码：
1 - 封堵状态
2 - 正常状态
3 - 攻击状态
     * @param Data 返回资源及状态，状态码：
1 - 封堵状态
2 - 正常状态
3 - 攻击状态
     */
    public void setData(KeyValue [] Data) {
        this.Data = Data;
    }

    /**
     * Get 域名化资产的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLBData 域名化资产的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValue [] getCLBData() {
        return this.CLBData;
    }

    /**
     * Set 域名化资产的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLBData 域名化资产的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLBData(KeyValue [] CLBData) {
        this.CLBData = CLBData;
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

    public DescribeBasicDeviceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicDeviceStatusResponse(DescribeBasicDeviceStatusResponse source) {
        if (source.Data != null) {
            this.Data = new KeyValue[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new KeyValue(source.Data[i]);
            }
        }
        if (source.CLBData != null) {
            this.CLBData = new KeyValue[source.CLBData.length];
            for (int i = 0; i < source.CLBData.length; i++) {
                this.CLBData[i] = new KeyValue(source.CLBData[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "CLBData.", this.CLBData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

