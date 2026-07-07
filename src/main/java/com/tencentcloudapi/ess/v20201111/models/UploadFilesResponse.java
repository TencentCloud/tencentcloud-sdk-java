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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFilesResponse extends AbstractModel {

    /**
    * <p>文件资源ID数组，每个文件资源ID为32位字符串。<br>建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。<br>注:<code>有效期一个小时（超过一小时后系统不定期清理，会有部分时间差）, 有效期内此文件id可以反复使用, 超过有效期无法使用</code></p>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>上传成功文件数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>文件过期时间的时间戳</p><p>单位：秒</p><p>默认值：当前上传时间的一小时内有效</p>
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>文件资源ID数组，每个文件资源ID为32位字符串。<br>建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。<br>注:<code>有效期一个小时（超过一小时后系统不定期清理，会有部分时间差）, 有效期内此文件id可以反复使用, 超过有效期无法使用</code></p> 
     * @return FileIds <p>文件资源ID数组，每个文件资源ID为32位字符串。<br>建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。<br>注:<code>有效期一个小时（超过一小时后系统不定期清理，会有部分时间差）, 有效期内此文件id可以反复使用, 超过有效期无法使用</code></p>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>文件资源ID数组，每个文件资源ID为32位字符串。<br>建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。<br>注:<code>有效期一个小时（超过一小时后系统不定期清理，会有部分时间差）, 有效期内此文件id可以反复使用, 超过有效期无法使用</code></p>
     * @param FileIds <p>文件资源ID数组，每个文件资源ID为32位字符串。<br>建议开发者保存此资源ID，后续创建合同或创建合同流程需此资源ID。<br>注:<code>有效期一个小时（超过一小时后系统不定期清理，会有部分时间差）, 有效期内此文件id可以反复使用, 超过有效期无法使用</code></p>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>上传成功文件数量</p> 
     * @return TotalCount <p>上传成功文件数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>上传成功文件数量</p>
     * @param TotalCount <p>上传成功文件数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>文件过期时间的时间戳</p><p>单位：秒</p><p>默认值：当前上传时间的一小时内有效</p> 
     * @return Deadline <p>文件过期时间的时间戳</p><p>单位：秒</p><p>默认值：当前上传时间的一小时内有效</p>
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>文件过期时间的时间戳</p><p>单位：秒</p><p>默认值：当前上传时间的一小时内有效</p>
     * @param Deadline <p>文件过期时间的时间戳</p><p>单位：秒</p><p>默认值：当前上传时间的一小时内有效</p>
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
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

    public UploadFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesResponse(UploadFilesResponse source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

