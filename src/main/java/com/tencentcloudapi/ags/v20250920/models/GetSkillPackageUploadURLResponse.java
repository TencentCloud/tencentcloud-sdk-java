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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSkillPackageUploadURLResponse extends AbstractModel {

    /**
    * <p>Version 详情（Revision 不变）。</p>
    */
    @SerializedName("Version")
    @Expose
    private CloudRecordVersion Version;

    /**
    * <p>新的 COS PUT 预签名 URL。</p>
    */
    @SerializedName("UploadURL")
    @Expose
    private String UploadURL;

    /**
    * <p>重试后的内容状态。</p>
    */
    @SerializedName("ContentStatus")
    @Expose
    private String ContentStatus;

    /**
    * <p>UploadURL 过期时间。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Version 详情（Revision 不变）。</p> 
     * @return Version <p>Version 详情（Revision 不变）。</p>
     */
    public CloudRecordVersion getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Version 详情（Revision 不变）。</p>
     * @param Version <p>Version 详情（Revision 不变）。</p>
     */
    public void setVersion(CloudRecordVersion Version) {
        this.Version = Version;
    }

    /**
     * Get <p>新的 COS PUT 预签名 URL。</p> 
     * @return UploadURL <p>新的 COS PUT 预签名 URL。</p>
     */
    public String getUploadURL() {
        return this.UploadURL;
    }

    /**
     * Set <p>新的 COS PUT 预签名 URL。</p>
     * @param UploadURL <p>新的 COS PUT 预签名 URL。</p>
     */
    public void setUploadURL(String UploadURL) {
        this.UploadURL = UploadURL;
    }

    /**
     * Get <p>重试后的内容状态。</p> 
     * @return ContentStatus <p>重试后的内容状态。</p>
     */
    public String getContentStatus() {
        return this.ContentStatus;
    }

    /**
     * Set <p>重试后的内容状态。</p>
     * @param ContentStatus <p>重试后的内容状态。</p>
     */
    public void setContentStatus(String ContentStatus) {
        this.ContentStatus = ContentStatus;
    }

    /**
     * Get <p>UploadURL 过期时间。</p> 
     * @return ExpireTime <p>UploadURL 过期时间。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>UploadURL 过期时间。</p>
     * @param ExpireTime <p>UploadURL 过期时间。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
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

    public GetSkillPackageUploadURLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSkillPackageUploadURLResponse(GetSkillPackageUploadURLResponse source) {
        if (source.Version != null) {
            this.Version = new CloudRecordVersion(source.Version);
        }
        if (source.UploadURL != null) {
            this.UploadURL = new String(source.UploadURL);
        }
        if (source.ContentStatus != null) {
            this.ContentStatus = new String(source.ContentStatus);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "UploadURL", this.UploadURL);
        this.setParamSimple(map, prefix + "ContentStatus", this.ContentStatus);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

