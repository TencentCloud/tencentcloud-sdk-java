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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCfsPGroupResponse extends AbstractModel {

    /**
    * 权限组ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * 权限组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述信息
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权限组ID 
     * @return PGroupId 权限组ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组ID
     * @param PGroupId 权限组ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get 权限组名称 
     * @return Name 权限组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权限组名称
     * @param Name 权限组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述信息 
     * @return DescInfo 描述信息
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * Set 描述信息
     * @param DescInfo 描述信息
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
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

    public UpdateCfsPGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCfsPGroupResponse(UpdateCfsPGroupResponse source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DescInfo != null) {
            this.DescInfo = new String(source.DescInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

