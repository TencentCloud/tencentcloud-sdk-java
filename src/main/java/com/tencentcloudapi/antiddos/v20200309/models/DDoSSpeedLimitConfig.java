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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSSpeedLimitConfig extends AbstractModel{

    /**
    * 限速模式，取值[
1(基于源IP限速)
2(基于目的端口限速)
]
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 限速值，每种类型的限速值最多支持1个；该字段数组至少有一种限速值
    */
    @SerializedName("SpeedValues")
    @Expose
    private SpeedValue [] SpeedValues;

    /**
    * 此字段已弃用，请填写新字段DstPortList。
    */
    @SerializedName("DstPortScopes")
    @Expose
    private PortSegment [] DstPortScopes;

    /**
    * 配置ID，配置添加成功后生成；添加新限制配置时不用填写此字段，修改或删除限速配置时需要填写配置ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * IP protocol numbers, 取值[
ALL(所有协议)
TCP(tcp协议)
UDP(udp协议)
SMP(smp协议)
1;2-100(自定义协议号范围,最多8个)
]
注意：当自定义协议号范围时，只能填写协议号，多个范围;分隔；当填写ALL时不能再填写其他协议或协议号。
    */
    @SerializedName("ProtocolList")
    @Expose
    private String ProtocolList;

    /**
    * 端口范围列表，最多8个，多个;分隔，范围表示用-；此端口范围必须填写；填写样式1:0-65535，样式2:80;443;1000-2000
    */
    @SerializedName("DstPortList")
    @Expose
    private String DstPortList;

    /**
     * Get 限速模式，取值[
1(基于源IP限速)
2(基于目的端口限速)
] 
     * @return Mode 限速模式，取值[
1(基于源IP限速)
2(基于目的端口限速)
]
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 限速模式，取值[
1(基于源IP限速)
2(基于目的端口限速)
]
     * @param Mode 限速模式，取值[
1(基于源IP限速)
2(基于目的端口限速)
]
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 限速值，每种类型的限速值最多支持1个；该字段数组至少有一种限速值 
     * @return SpeedValues 限速值，每种类型的限速值最多支持1个；该字段数组至少有一种限速值
     */
    public SpeedValue [] getSpeedValues() {
        return this.SpeedValues;
    }

    /**
     * Set 限速值，每种类型的限速值最多支持1个；该字段数组至少有一种限速值
     * @param SpeedValues 限速值，每种类型的限速值最多支持1个；该字段数组至少有一种限速值
     */
    public void setSpeedValues(SpeedValue [] SpeedValues) {
        this.SpeedValues = SpeedValues;
    }

    /**
     * Get 此字段已弃用，请填写新字段DstPortList。 
     * @return DstPortScopes 此字段已弃用，请填写新字段DstPortList。
     */
    public PortSegment [] getDstPortScopes() {
        return this.DstPortScopes;
    }

    /**
     * Set 此字段已弃用，请填写新字段DstPortList。
     * @param DstPortScopes 此字段已弃用，请填写新字段DstPortList。
     */
    public void setDstPortScopes(PortSegment [] DstPortScopes) {
        this.DstPortScopes = DstPortScopes;
    }

    /**
     * Get 配置ID，配置添加成功后生成；添加新限制配置时不用填写此字段，修改或删除限速配置时需要填写配置ID 
     * @return Id 配置ID，配置添加成功后生成；添加新限制配置时不用填写此字段，修改或删除限速配置时需要填写配置ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置ID，配置添加成功后生成；添加新限制配置时不用填写此字段，修改或删除限速配置时需要填写配置ID
     * @param Id 配置ID，配置添加成功后生成；添加新限制配置时不用填写此字段，修改或删除限速配置时需要填写配置ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get IP protocol numbers, 取值[
ALL(所有协议)
TCP(tcp协议)
UDP(udp协议)
SMP(smp协议)
1;2-100(自定义协议号范围,最多8个)
]
注意：当自定义协议号范围时，只能填写协议号，多个范围;分隔；当填写ALL时不能再填写其他协议或协议号。 
     * @return ProtocolList IP protocol numbers, 取值[
ALL(所有协议)
TCP(tcp协议)
UDP(udp协议)
SMP(smp协议)
1;2-100(自定义协议号范围,最多8个)
]
注意：当自定义协议号范围时，只能填写协议号，多个范围;分隔；当填写ALL时不能再填写其他协议或协议号。
     */
    public String getProtocolList() {
        return this.ProtocolList;
    }

    /**
     * Set IP protocol numbers, 取值[
ALL(所有协议)
TCP(tcp协议)
UDP(udp协议)
SMP(smp协议)
1;2-100(自定义协议号范围,最多8个)
]
注意：当自定义协议号范围时，只能填写协议号，多个范围;分隔；当填写ALL时不能再填写其他协议或协议号。
     * @param ProtocolList IP protocol numbers, 取值[
ALL(所有协议)
TCP(tcp协议)
UDP(udp协议)
SMP(smp协议)
1;2-100(自定义协议号范围,最多8个)
]
注意：当自定义协议号范围时，只能填写协议号，多个范围;分隔；当填写ALL时不能再填写其他协议或协议号。
     */
    public void setProtocolList(String ProtocolList) {
        this.ProtocolList = ProtocolList;
    }

    /**
     * Get 端口范围列表，最多8个，多个;分隔，范围表示用-；此端口范围必须填写；填写样式1:0-65535，样式2:80;443;1000-2000 
     * @return DstPortList 端口范围列表，最多8个，多个;分隔，范围表示用-；此端口范围必须填写；填写样式1:0-65535，样式2:80;443;1000-2000
     */
    public String getDstPortList() {
        return this.DstPortList;
    }

    /**
     * Set 端口范围列表，最多8个，多个;分隔，范围表示用-；此端口范围必须填写；填写样式1:0-65535，样式2:80;443;1000-2000
     * @param DstPortList 端口范围列表，最多8个，多个;分隔，范围表示用-；此端口范围必须填写；填写样式1:0-65535，样式2:80;443;1000-2000
     */
    public void setDstPortList(String DstPortList) {
        this.DstPortList = DstPortList;
    }

    public DDoSSpeedLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSSpeedLimitConfig(DDoSSpeedLimitConfig source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.SpeedValues != null) {
            this.SpeedValues = new SpeedValue[source.SpeedValues.length];
            for (int i = 0; i < source.SpeedValues.length; i++) {
                this.SpeedValues[i] = new SpeedValue(source.SpeedValues[i]);
            }
        }
        if (source.DstPortScopes != null) {
            this.DstPortScopes = new PortSegment[source.DstPortScopes.length];
            for (int i = 0; i < source.DstPortScopes.length; i++) {
                this.DstPortScopes[i] = new PortSegment(source.DstPortScopes[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProtocolList != null) {
            this.ProtocolList = new String(source.ProtocolList);
        }
        if (source.DstPortList != null) {
            this.DstPortList = new String(source.DstPortList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "SpeedValues.", this.SpeedValues);
        this.setParamArrayObj(map, prefix + "DstPortScopes.", this.DstPortScopes);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProtocolList", this.ProtocolList);
        this.setParamSimple(map, prefix + "DstPortList", this.DstPortList);

    }
}

