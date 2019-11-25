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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintPolicy  extends AbstractModel{

    /**
    * TCP端口段，例如["2000-3000","3500-4000"]
    */
    @SerializedName("TcpPortList")
    @Expose
    private String [] TcpPortList;

    /**
    * UDP端口段，例如["2000-3000","3500-4000"]
    */
    @SerializedName("UdpPortList")
    @Expose
    private String [] UdpPortList;

    /**
    * 水印偏移量，取值范围[0, 100)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 是否自动剥离，取值[0（不自动剥离），1（自动剥离）]
    */
    @SerializedName("RemoveSwitch")
    @Expose
    private Long RemoveSwitch;

    /**
    * 是否开启，取值[0（没有开启），1（已开启）]
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
     * 获取TCP端口段，例如["2000-3000","3500-4000"]
     * @return TcpPortList TCP端口段，例如["2000-3000","3500-4000"]
     */
    public String [] getTcpPortList() {
        return this.TcpPortList;
    }

    /**
     * 设置TCP端口段，例如["2000-3000","3500-4000"]
     * @param TcpPortList TCP端口段，例如["2000-3000","3500-4000"]
     */
    public void setTcpPortList(String [] TcpPortList) {
        this.TcpPortList = TcpPortList;
    }

    /**
     * 获取UDP端口段，例如["2000-3000","3500-4000"]
     * @return UdpPortList UDP端口段，例如["2000-3000","3500-4000"]
     */
    public String [] getUdpPortList() {
        return this.UdpPortList;
    }

    /**
     * 设置UDP端口段，例如["2000-3000","3500-4000"]
     * @param UdpPortList UDP端口段，例如["2000-3000","3500-4000"]
     */
    public void setUdpPortList(String [] UdpPortList) {
        this.UdpPortList = UdpPortList;
    }

    /**
     * 获取水印偏移量，取值范围[0, 100)
     * @return Offset 水印偏移量，取值范围[0, 100)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置水印偏移量，取值范围[0, 100)
     * @param Offset 水印偏移量，取值范围[0, 100)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取是否自动剥离，取值[0（不自动剥离），1（自动剥离）]
     * @return RemoveSwitch 是否自动剥离，取值[0（不自动剥离），1（自动剥离）]
     */
    public Long getRemoveSwitch() {
        return this.RemoveSwitch;
    }

    /**
     * 设置是否自动剥离，取值[0（不自动剥离），1（自动剥离）]
     * @param RemoveSwitch 是否自动剥离，取值[0（不自动剥离），1（自动剥离）]
     */
    public void setRemoveSwitch(Long RemoveSwitch) {
        this.RemoveSwitch = RemoveSwitch;
    }

    /**
     * 获取是否开启，取值[0（没有开启），1（已开启）]
     * @return OpenStatus 是否开启，取值[0（没有开启），1（已开启）]
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * 设置是否开启，取值[0（没有开启），1（已开启）]
     * @param OpenStatus 是否开启，取值[0（没有开启），1（已开启）]
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TcpPortList.", this.TcpPortList);
        this.setParamArraySimple(map, prefix + "UdpPortList.", this.UdpPortList);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RemoveSwitch", this.RemoveSwitch);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);

    }
}

