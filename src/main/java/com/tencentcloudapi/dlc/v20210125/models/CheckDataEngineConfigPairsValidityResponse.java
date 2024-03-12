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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDataEngineConfigPairsValidityResponse extends AbstractModel {

    /**
    * 参数有效性：ture:有效，false:至少存在一个无效参数；
    */
    @SerializedName("IsAvailable")
    @Expose
    private Boolean IsAvailable;

    /**
    * 无效参数集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnavailableConfig")
    @Expose
    private String [] UnavailableConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 参数有效性：ture:有效，false:至少存在一个无效参数； 
     * @return IsAvailable 参数有效性：ture:有效，false:至少存在一个无效参数；
     */
    public Boolean getIsAvailable() {
        return this.IsAvailable;
    }

    /**
     * Set 参数有效性：ture:有效，false:至少存在一个无效参数；
     * @param IsAvailable 参数有效性：ture:有效，false:至少存在一个无效参数；
     */
    public void setIsAvailable(Boolean IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

    /**
     * Get 无效参数集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnavailableConfig 无效参数集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUnavailableConfig() {
        return this.UnavailableConfig;
    }

    /**
     * Set 无效参数集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnavailableConfig 无效参数集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnavailableConfig(String [] UnavailableConfig) {
        this.UnavailableConfig = UnavailableConfig;
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

    public CheckDataEngineConfigPairsValidityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDataEngineConfigPairsValidityResponse(CheckDataEngineConfigPairsValidityResponse source) {
        if (source.IsAvailable != null) {
            this.IsAvailable = new Boolean(source.IsAvailable);
        }
        if (source.UnavailableConfig != null) {
            this.UnavailableConfig = new String[source.UnavailableConfig.length];
            for (int i = 0; i < source.UnavailableConfig.length; i++) {
                this.UnavailableConfig[i] = new String(source.UnavailableConfig[i]);
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
        this.setParamSimple(map, prefix + "IsAvailable", this.IsAvailable);
        this.setParamArraySimple(map, prefix + "UnavailableConfig.", this.UnavailableConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

