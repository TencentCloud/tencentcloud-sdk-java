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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstanceADBResponse extends AbstractModel {

    /**
    * 连接私钥，需要保存为文件形式，例如 private_key.pem
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 连接地址
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 连接端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 连接参考命令
    */
    @SerializedName("ConnectCommand")
    @Expose
    private String ConnectCommand;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 连接私钥，需要保存为文件形式，例如 private_key.pem 
     * @return PrivateKey 连接私钥，需要保存为文件形式，例如 private_key.pem
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 连接私钥，需要保存为文件形式，例如 private_key.pem
     * @param PrivateKey 连接私钥，需要保存为文件形式，例如 private_key.pem
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 用户名称 
     * @return UserName 用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
     * @param UserName 用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 连接地址 
     * @return HostName 连接地址
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 连接地址
     * @param HostName 连接地址
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 连接端口 
     * @return Port 连接端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 连接端口
     * @param Port 连接端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 连接参考命令 
     * @return ConnectCommand 连接参考命令
     */
    public String getConnectCommand() {
        return this.ConnectCommand;
    }

    /**
     * Set 连接参考命令
     * @param ConnectCommand 连接参考命令
     */
    public void setConnectCommand(String ConnectCommand) {
        this.ConnectCommand = ConnectCommand;
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

    public CreateAndroidInstanceADBResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstanceADBResponse(CreateAndroidInstanceADBResponse source) {
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ConnectCommand != null) {
            this.ConnectCommand = new String(source.ConnectCommand);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ConnectCommand", this.ConnectCommand);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

