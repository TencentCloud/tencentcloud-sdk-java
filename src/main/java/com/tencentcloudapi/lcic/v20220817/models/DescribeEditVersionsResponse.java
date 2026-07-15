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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEditVersionsResponse extends AbstractModel {

    /**
    * <p>课堂ID</p>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>当前课堂最新的版本号</p>
    */
    @SerializedName("LatestVersionNo")
    @Expose
    private Long LatestVersionNo;

    /**
    * <p>当前课堂设置的主版本号</p>
    */
    @SerializedName("MainVersion")
    @Expose
    private Long MainVersion;

    /**
    * <p>当前课堂所有版本信息</p>
    */
    @SerializedName("Versions")
    @Expose
    private EditVersions [] Versions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>课堂ID</p> 
     * @return ClassId <p>课堂ID</p>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>课堂ID</p>
     * @param ClassId <p>课堂ID</p>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>当前课堂最新的版本号</p> 
     * @return LatestVersionNo <p>当前课堂最新的版本号</p>
     */
    public Long getLatestVersionNo() {
        return this.LatestVersionNo;
    }

    /**
     * Set <p>当前课堂最新的版本号</p>
     * @param LatestVersionNo <p>当前课堂最新的版本号</p>
     */
    public void setLatestVersionNo(Long LatestVersionNo) {
        this.LatestVersionNo = LatestVersionNo;
    }

    /**
     * Get <p>当前课堂设置的主版本号</p> 
     * @return MainVersion <p>当前课堂设置的主版本号</p>
     */
    public Long getMainVersion() {
        return this.MainVersion;
    }

    /**
     * Set <p>当前课堂设置的主版本号</p>
     * @param MainVersion <p>当前课堂设置的主版本号</p>
     */
    public void setMainVersion(Long MainVersion) {
        this.MainVersion = MainVersion;
    }

    /**
     * Get <p>当前课堂所有版本信息</p> 
     * @return Versions <p>当前课堂所有版本信息</p>
     */
    public EditVersions [] getVersions() {
        return this.Versions;
    }

    /**
     * Set <p>当前课堂所有版本信息</p>
     * @param Versions <p>当前课堂所有版本信息</p>
     */
    public void setVersions(EditVersions [] Versions) {
        this.Versions = Versions;
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

    public DescribeEditVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEditVersionsResponse(DescribeEditVersionsResponse source) {
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.LatestVersionNo != null) {
            this.LatestVersionNo = new Long(source.LatestVersionNo);
        }
        if (source.MainVersion != null) {
            this.MainVersion = new Long(source.MainVersion);
        }
        if (source.Versions != null) {
            this.Versions = new EditVersions[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new EditVersions(source.Versions[i]);
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
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "LatestVersionNo", this.LatestVersionNo);
        this.setParamSimple(map, prefix + "MainVersion", this.MainVersion);
        this.setParamArrayObj(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

