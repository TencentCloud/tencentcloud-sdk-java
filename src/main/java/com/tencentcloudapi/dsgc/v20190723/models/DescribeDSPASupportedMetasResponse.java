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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPASupportedMetasResponse extends AbstractModel {

    /**
    * 支持的元数据类型
    */
    @SerializedName("Metas")
    @Expose
    private DSPAMetaType [] Metas;

    /**
    * 最大支持每批次同步数量
    */
    @SerializedName("MaxDBInstanceLimit")
    @Expose
    private Long MaxDBInstanceLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持的元数据类型 
     * @return Metas 支持的元数据类型
     */
    public DSPAMetaType [] getMetas() {
        return this.Metas;
    }

    /**
     * Set 支持的元数据类型
     * @param Metas 支持的元数据类型
     */
    public void setMetas(DSPAMetaType [] Metas) {
        this.Metas = Metas;
    }

    /**
     * Get 最大支持每批次同步数量 
     * @return MaxDBInstanceLimit 最大支持每批次同步数量
     */
    public Long getMaxDBInstanceLimit() {
        return this.MaxDBInstanceLimit;
    }

    /**
     * Set 最大支持每批次同步数量
     * @param MaxDBInstanceLimit 最大支持每批次同步数量
     */
    public void setMaxDBInstanceLimit(Long MaxDBInstanceLimit) {
        this.MaxDBInstanceLimit = MaxDBInstanceLimit;
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

    public DescribeDSPASupportedMetasResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPASupportedMetasResponse(DescribeDSPASupportedMetasResponse source) {
        if (source.Metas != null) {
            this.Metas = new DSPAMetaType[source.Metas.length];
            for (int i = 0; i < source.Metas.length; i++) {
                this.Metas[i] = new DSPAMetaType(source.Metas[i]);
            }
        }
        if (source.MaxDBInstanceLimit != null) {
            this.MaxDBInstanceLimit = new Long(source.MaxDBInstanceLimit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Metas.", this.Metas);
        this.setParamSimple(map, prefix + "MaxDBInstanceLimit", this.MaxDBInstanceLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

