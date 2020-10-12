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
package com.tencentcloudapi.tcex.v20200727.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeServiceRequest extends AbstractModel{

    /**
    * 待调用的服务ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 要调用服务的状态：0表示调试版本，1表示上线版本
    */
    @SerializedName("ServiceStatus")
    @Expose
    private Long ServiceStatus;

    /**
    * 用于测试的文档的URL。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 用于测试的文本，当此值不为空时，调用内容以此参数的值为准。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
     * Get 待调用的服务ID。 
     * @return ServiceId 待调用的服务ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待调用的服务ID。
     * @param ServiceId 待调用的服务ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 要调用服务的状态：0表示调试版本，1表示上线版本 
     * @return ServiceStatus 要调用服务的状态：0表示调试版本，1表示上线版本
     */
    public Long getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set 要调用服务的状态：0表示调试版本，1表示上线版本
     * @param ServiceStatus 要调用服务的状态：0表示调试版本，1表示上线版本
     */
    public void setServiceStatus(Long ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get 用于测试的文档的URL。 
     * @return FileUrl 用于测试的文档的URL。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 用于测试的文档的URL。
     * @param FileUrl 用于测试的文档的URL。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 用于测试的文本，当此值不为空时，调用内容以此参数的值为准。 
     * @return Input 用于测试的文本，当此值不为空时，调用内容以此参数的值为准。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 用于测试的文本，当此值不为空时，调用内容以此参数的值为准。
     * @param Input 用于测试的文本，当此值不为空时，调用内容以此参数的值为准。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "Input", this.Input);

    }
}

