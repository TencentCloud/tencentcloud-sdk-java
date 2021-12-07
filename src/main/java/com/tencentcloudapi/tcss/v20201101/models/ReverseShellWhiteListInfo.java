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

public class ReverseShellWhiteListInfo extends AbstractModel{

    /**
    * 目标IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * 目标进程
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 镜像id数组，为空代表全部
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 白名单id，如果新建则id为空
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 目标IP 
     * @return DstIp 目标IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标IP
     * @param DstIp 目标IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目标端口 
     * @return DstPort 目标端口
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 目标进程 
     * @return ProcessName 目标进程
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 目标进程
     * @param ProcessName 目标进程
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 镜像id数组，为空代表全部 
     * @return ImageIds 镜像id数组，为空代表全部
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像id数组，为空代表全部
     * @param ImageIds 镜像id数组，为空代表全部
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 白名单id，如果新建则id为空 
     * @return Id 白名单id，如果新建则id为空
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 白名单id，如果新建则id为空
     * @param Id 白名单id，如果新建则id为空
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public ReverseShellWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellWhiteListInfo(ReverseShellWhiteListInfo source) {
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

