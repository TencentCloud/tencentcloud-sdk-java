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

public class ControlDevicePTZRequest extends AbstractModel{

    /**
    * 通道 ID（从通道查询接口DescribeDeviceChannel中获取）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 命令类型（上:up,下:down,左:left,右:right
上左:leftup,上右:rightup,下左:leftdown,下右:rightdown
放大:zoomin,缩小:zoomout
聚焦远:focusfar,聚焦近:focusnear
光圈放大:irisin,光圈缩小:irisout）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 命令描述（速度值范围1-8）
    */
    @SerializedName("Speed")
    @Expose
    private Long Speed;

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
     * Get 命令类型（上:up,下:down,左:left,右:right
上左:leftup,上右:rightup,下左:leftdown,下右:rightdown
放大:zoomin,缩小:zoomout
聚焦远:focusfar,聚焦近:focusnear
光圈放大:irisin,光圈缩小:irisout） 
     * @return Type 命令类型（上:up,下:down,左:left,右:right
上左:leftup,上右:rightup,下左:leftdown,下右:rightdown
放大:zoomin,缩小:zoomout
聚焦远:focusfar,聚焦近:focusnear
光圈放大:irisin,光圈缩小:irisout）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 命令类型（上:up,下:down,左:left,右:right
上左:leftup,上右:rightup,下左:leftdown,下右:rightdown
放大:zoomin,缩小:zoomout
聚焦远:focusfar,聚焦近:focusnear
光圈放大:irisin,光圈缩小:irisout）
     * @param Type 命令类型（上:up,下:down,左:left,右:right
上左:leftup,上右:rightup,下左:leftdown,下右:rightdown
放大:zoomin,缩小:zoomout
聚焦远:focusfar,聚焦近:focusnear
光圈放大:irisin,光圈缩小:irisout）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 命令描述（速度值范围1-8） 
     * @return Speed 命令描述（速度值范围1-8）
     */
    public Long getSpeed() {
        return this.Speed;
    }

    /**
     * Set 命令描述（速度值范围1-8）
     * @param Speed 命令描述（速度值范围1-8）
     */
    public void setSpeed(Long Speed) {
        this.Speed = Speed;
    }

    public ControlDevicePTZRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDevicePTZRequest(ControlDevicePTZRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Speed != null) {
            this.Speed = new Long(source.Speed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Speed", this.Speed);

    }
}

