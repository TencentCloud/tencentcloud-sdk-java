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

public class DescribeClusterInstallCommandResponse extends AbstractModel {

    /**
    * <p>接入命令</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>接入文件下载地址</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>接入文件内容</p>
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>接入命令</p> 
     * @return Command <p>接入命令</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>接入命令</p>
     * @param Command <p>接入命令</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>接入文件下载地址</p> 
     * @return URL <p>接入文件下载地址</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>接入文件下载地址</p>
     * @param URL <p>接入文件下载地址</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>接入文件内容</p> 
     * @return FileContent <p>接入文件内容</p>
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set <p>接入文件内容</p>
     * @param FileContent <p>接入文件内容</p>
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
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

    public DescribeClusterInstallCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstallCommandResponse(DescribeClusterInstallCommandResponse source) {
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

