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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentInstallCommandResponse extends AbstractModel{

    /**
    * linux系统安装命令
    */
    @SerializedName("LinuxCommand")
    @Expose
    private String LinuxCommand;

    /**
    * windows系统安装命令（windows2008及以上）
    */
    @SerializedName("WindowsCommand")
    @Expose
    private String WindowsCommand;

    /**
    * windows系统安装命令第一步（windows2003）
    */
    @SerializedName("WindowsStepOne")
    @Expose
    private String WindowsStepOne;

    /**
    * windows系统安装命令第二步（windows2003）
    */
    @SerializedName("WindowsStepTwo")
    @Expose
    private String WindowsStepTwo;

    /**
    * windows版agent下载链接
    */
    @SerializedName("WindowsDownloadUrl")
    @Expose
    private String WindowsDownloadUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get linux系统安装命令 
     * @return LinuxCommand linux系统安装命令
     */
    public String getLinuxCommand() {
        return this.LinuxCommand;
    }

    /**
     * Set linux系统安装命令
     * @param LinuxCommand linux系统安装命令
     */
    public void setLinuxCommand(String LinuxCommand) {
        this.LinuxCommand = LinuxCommand;
    }

    /**
     * Get windows系统安装命令（windows2008及以上） 
     * @return WindowsCommand windows系统安装命令（windows2008及以上）
     */
    public String getWindowsCommand() {
        return this.WindowsCommand;
    }

    /**
     * Set windows系统安装命令（windows2008及以上）
     * @param WindowsCommand windows系统安装命令（windows2008及以上）
     */
    public void setWindowsCommand(String WindowsCommand) {
        this.WindowsCommand = WindowsCommand;
    }

    /**
     * Get windows系统安装命令第一步（windows2003） 
     * @return WindowsStepOne windows系统安装命令第一步（windows2003）
     */
    public String getWindowsStepOne() {
        return this.WindowsStepOne;
    }

    /**
     * Set windows系统安装命令第一步（windows2003）
     * @param WindowsStepOne windows系统安装命令第一步（windows2003）
     */
    public void setWindowsStepOne(String WindowsStepOne) {
        this.WindowsStepOne = WindowsStepOne;
    }

    /**
     * Get windows系统安装命令第二步（windows2003） 
     * @return WindowsStepTwo windows系统安装命令第二步（windows2003）
     */
    public String getWindowsStepTwo() {
        return this.WindowsStepTwo;
    }

    /**
     * Set windows系统安装命令第二步（windows2003）
     * @param WindowsStepTwo windows系统安装命令第二步（windows2003）
     */
    public void setWindowsStepTwo(String WindowsStepTwo) {
        this.WindowsStepTwo = WindowsStepTwo;
    }

    /**
     * Get windows版agent下载链接 
     * @return WindowsDownloadUrl windows版agent下载链接
     */
    public String getWindowsDownloadUrl() {
        return this.WindowsDownloadUrl;
    }

    /**
     * Set windows版agent下载链接
     * @param WindowsDownloadUrl windows版agent下载链接
     */
    public void setWindowsDownloadUrl(String WindowsDownloadUrl) {
        this.WindowsDownloadUrl = WindowsDownloadUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAgentInstallCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentInstallCommandResponse(DescribeAgentInstallCommandResponse source) {
        if (source.LinuxCommand != null) {
            this.LinuxCommand = new String(source.LinuxCommand);
        }
        if (source.WindowsCommand != null) {
            this.WindowsCommand = new String(source.WindowsCommand);
        }
        if (source.WindowsStepOne != null) {
            this.WindowsStepOne = new String(source.WindowsStepOne);
        }
        if (source.WindowsStepTwo != null) {
            this.WindowsStepTwo = new String(source.WindowsStepTwo);
        }
        if (source.WindowsDownloadUrl != null) {
            this.WindowsDownloadUrl = new String(source.WindowsDownloadUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinuxCommand", this.LinuxCommand);
        this.setParamSimple(map, prefix + "WindowsCommand", this.WindowsCommand);
        this.setParamSimple(map, prefix + "WindowsStepOne", this.WindowsStepOne);
        this.setParamSimple(map, prefix + "WindowsStepTwo", this.WindowsStepTwo);
        this.setParamSimple(map, prefix + "WindowsDownloadUrl", this.WindowsDownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

