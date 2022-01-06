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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlChannelLocalRecordRequest extends AbstractModel{

    /**
    * 设备唯一标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道唯一标识
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 流Id，流的唯一标识
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 控制参数，转义的json字符串

目前支持的command：
"Command": "{"Action":"PAUSE"}" 暂停
"Command": "{"Action":"PLAY"}" 暂停恢复
"Command": "{"Action":"PLAY","Offset":"15"}" 基于文件起始时间点的位置偏移，单位秒
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
     * Get 设备唯一标识 
     * @return DeviceId 设备唯一标识
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
     * @param DeviceId 设备唯一标识
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 通道唯一标识 
     * @return ChannelId 通道唯一标识
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道唯一标识
     * @param ChannelId 通道唯一标识
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 流Id，流的唯一标识 
     * @return StreamId 流Id，流的唯一标识
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流Id，流的唯一标识
     * @param StreamId 流Id，流的唯一标识
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 控制参数，转义的json字符串

目前支持的command：
"Command": "{"Action":"PAUSE"}" 暂停
"Command": "{"Action":"PLAY"}" 暂停恢复
"Command": "{"Action":"PLAY","Offset":"15"}" 基于文件起始时间点的位置偏移，单位秒 
     * @return Command 控制参数，转义的json字符串

目前支持的command：
"Command": "{"Action":"PAUSE"}" 暂停
"Command": "{"Action":"PLAY"}" 暂停恢复
"Command": "{"Action":"PLAY","Offset":"15"}" 基于文件起始时间点的位置偏移，单位秒
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 控制参数，转义的json字符串

目前支持的command：
"Command": "{"Action":"PAUSE"}" 暂停
"Command": "{"Action":"PLAY"}" 暂停恢复
"Command": "{"Action":"PLAY","Offset":"15"}" 基于文件起始时间点的位置偏移，单位秒
     * @param Command 控制参数，转义的json字符串

目前支持的command：
"Command": "{"Action":"PAUSE"}" 暂停
"Command": "{"Action":"PLAY"}" 暂停恢复
"Command": "{"Action":"PLAY","Offset":"15"}" 基于文件起始时间点的位置偏移，单位秒
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    public ControlChannelLocalRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlChannelLocalRecordRequest(ControlChannelLocalRecordRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Command", this.Command);

    }
}

