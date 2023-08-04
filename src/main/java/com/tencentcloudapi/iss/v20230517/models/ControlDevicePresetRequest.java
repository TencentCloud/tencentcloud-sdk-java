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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDevicePresetRequest extends AbstractModel{

    /**
    * 通道 ID（从通道查询接口DescribeDeviceChannel中获取）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 命令（goto:预置位调用；
set:预置位设置；
del:预置位删除）
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 预置位索引（只支持1-10的索引位置，超出报错）
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 通道 ID（从通道查询接口DescribeDeviceChannel中获取） 
     * @return ChannelId 通道 ID（从通道查询接口DescribeDeviceChannel中获取）
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID（从通道查询接口DescribeDeviceChannel中获取）
     * @param ChannelId 通道 ID（从通道查询接口DescribeDeviceChannel中获取）
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 命令（goto:预置位调用；
set:预置位设置；
del:预置位删除） 
     * @return Cmd 命令（goto:预置位调用；
set:预置位设置；
del:预置位删除）
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令（goto:预置位调用；
set:预置位设置；
del:预置位删除）
     * @param Cmd 命令（goto:预置位调用；
set:预置位设置；
del:预置位删除）
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get 预置位索引（只支持1-10的索引位置，超出报错） 
     * @return Index 预置位索引（只支持1-10的索引位置，超出报错）
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 预置位索引（只支持1-10的索引位置，超出报错）
     * @param Index 预置位索引（只支持1-10的索引位置，超出报错）
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public ControlDevicePresetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDevicePresetRequest(ControlDevicePresetRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

