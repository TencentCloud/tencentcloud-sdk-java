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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSkillScanResponse extends AbstractModel {

    /**
    * 文件的 SHA256 Hash，用于轮询 DescribeSkillScanResult 接口
参数格式：sha256:<64位hex>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * 本次请求实际绑定的引擎版本号。调用方应保存并在后续 DescribeSkillScanResult 时显式传入
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * 任务状态，固定为 SCANNING，表示任务已接收
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 可读的操作结果描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件的 SHA256 Hash，用于轮询 DescribeSkillScanResult 接口
参数格式：sha256:<64位hex> 
     * @return ContentHash 文件的 SHA256 Hash，用于轮询 DescribeSkillScanResult 接口
参数格式：sha256:<64位hex>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set 文件的 SHA256 Hash，用于轮询 DescribeSkillScanResult 接口
参数格式：sha256:<64位hex>
     * @param ContentHash 文件的 SHA256 Hash，用于轮询 DescribeSkillScanResult 接口
参数格式：sha256:<64位hex>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get 本次请求实际绑定的引擎版本号。调用方应保存并在后续 DescribeSkillScanResult 时显式传入 
     * @return EngineVersion 本次请求实际绑定的引擎版本号。调用方应保存并在后续 DescribeSkillScanResult 时显式传入
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 本次请求实际绑定的引擎版本号。调用方应保存并在后续 DescribeSkillScanResult 时显式传入
     * @param EngineVersion 本次请求实际绑定的引擎版本号。调用方应保存并在后续 DescribeSkillScanResult 时显式传入
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 任务状态，固定为 SCANNING，表示任务已接收 
     * @return Status 任务状态，固定为 SCANNING，表示任务已接收
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，固定为 SCANNING，表示任务已接收
     * @param Status 任务状态，固定为 SCANNING，表示任务已接收
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 可读的操作结果描述 
     * @return Message 可读的操作结果描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 可读的操作结果描述
     * @param Message 可读的操作结果描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public CreateSkillScanResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSkillScanResponse(CreateSkillScanResponse source) {
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

