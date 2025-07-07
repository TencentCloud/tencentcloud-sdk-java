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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecResponse extends AbstractModel {

    /**
    * fe节点规格描述
    */
    @SerializedName("MasterSpec")
    @Expose
    private ResourceSpec [] MasterSpec;

    /**
    * be节点规格描述
    */
    @SerializedName("CoreSpec")
    @Expose
    private ResourceSpec [] CoreSpec;

    /**
    * 云盘列表
    */
    @SerializedName("AttachCBSSpec")
    @Expose
    private DiskSpec [] AttachCBSSpec;

    /**
    * cn节点列表
    */
    @SerializedName("CNSpec")
    @Expose
    private ResourceSpec [] CNSpec;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get fe节点规格描述 
     * @return MasterSpec fe节点规格描述
     */
    public ResourceSpec [] getMasterSpec() {
        return this.MasterSpec;
    }

    /**
     * Set fe节点规格描述
     * @param MasterSpec fe节点规格描述
     */
    public void setMasterSpec(ResourceSpec [] MasterSpec) {
        this.MasterSpec = MasterSpec;
    }

    /**
     * Get be节点规格描述 
     * @return CoreSpec be节点规格描述
     */
    public ResourceSpec [] getCoreSpec() {
        return this.CoreSpec;
    }

    /**
     * Set be节点规格描述
     * @param CoreSpec be节点规格描述
     */
    public void setCoreSpec(ResourceSpec [] CoreSpec) {
        this.CoreSpec = CoreSpec;
    }

    /**
     * Get 云盘列表 
     * @return AttachCBSSpec 云盘列表
     */
    public DiskSpec [] getAttachCBSSpec() {
        return this.AttachCBSSpec;
    }

    /**
     * Set 云盘列表
     * @param AttachCBSSpec 云盘列表
     */
    public void setAttachCBSSpec(DiskSpec [] AttachCBSSpec) {
        this.AttachCBSSpec = AttachCBSSpec;
    }

    /**
     * Get cn节点列表 
     * @return CNSpec cn节点列表
     */
    public ResourceSpec [] getCNSpec() {
        return this.CNSpec;
    }

    /**
     * Set cn节点列表
     * @param CNSpec cn节点列表
     */
    public void setCNSpec(ResourceSpec [] CNSpec) {
        this.CNSpec = CNSpec;
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

    public DescribeSpecResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecResponse(DescribeSpecResponse source) {
        if (source.MasterSpec != null) {
            this.MasterSpec = new ResourceSpec[source.MasterSpec.length];
            for (int i = 0; i < source.MasterSpec.length; i++) {
                this.MasterSpec[i] = new ResourceSpec(source.MasterSpec[i]);
            }
        }
        if (source.CoreSpec != null) {
            this.CoreSpec = new ResourceSpec[source.CoreSpec.length];
            for (int i = 0; i < source.CoreSpec.length; i++) {
                this.CoreSpec[i] = new ResourceSpec(source.CoreSpec[i]);
            }
        }
        if (source.AttachCBSSpec != null) {
            this.AttachCBSSpec = new DiskSpec[source.AttachCBSSpec.length];
            for (int i = 0; i < source.AttachCBSSpec.length; i++) {
                this.AttachCBSSpec[i] = new DiskSpec(source.AttachCBSSpec[i]);
            }
        }
        if (source.CNSpec != null) {
            this.CNSpec = new ResourceSpec[source.CNSpec.length];
            for (int i = 0; i < source.CNSpec.length; i++) {
                this.CNSpec[i] = new ResourceSpec(source.CNSpec[i]);
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
        this.setParamArrayObj(map, prefix + "MasterSpec.", this.MasterSpec);
        this.setParamArrayObj(map, prefix + "CoreSpec.", this.CoreSpec);
        this.setParamArrayObj(map, prefix + "AttachCBSSpec.", this.AttachCBSSpec);
        this.setParamArrayObj(map, prefix + "CNSpec.", this.CNSpec);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

