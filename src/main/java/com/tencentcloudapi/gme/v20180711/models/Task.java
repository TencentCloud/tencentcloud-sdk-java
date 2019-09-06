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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task  extends AbstractModel{

    /**
    * 数据的唯一ID
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 数据文件的url，为 urlencode 编码，流式则为拉流地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * gme实时语音房间id，通过gme实时语音进行语音分析时输入
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * gme实时语音用户id，通过gme实时语音进行语音分析时输入
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * 获取数据的唯一ID
     * @return DataId 数据的唯一ID
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * 设置数据的唯一ID
     * @param DataId 数据的唯一ID
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * 获取数据文件的url，为 urlencode 编码，流式则为拉流地址
     * @return Url 数据文件的url，为 urlencode 编码，流式则为拉流地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置数据文件的url，为 urlencode 编码，流式则为拉流地址
     * @param Url 数据文件的url，为 urlencode 编码，流式则为拉流地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取gme实时语音房间id，通过gme实时语音进行语音分析时输入
     * @return RoomId gme实时语音房间id，通过gme实时语音进行语音分析时输入
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * 设置gme实时语音房间id，通过gme实时语音进行语音分析时输入
     * @param RoomId gme实时语音房间id，通过gme实时语音进行语音分析时输入
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * 获取gme实时语音用户id，通过gme实时语音进行语音分析时输入
     * @return OpenId gme实时语音用户id，通过gme实时语音进行语音分析时输入
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * 设置gme实时语音用户id，通过gme实时语音进行语音分析时输入
     * @param OpenId gme实时语音用户id，通过gme实时语音进行语音分析时输入
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

