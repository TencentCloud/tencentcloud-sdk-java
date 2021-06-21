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

public class ProtocolBlockConfig extends AbstractModel{

    /**
    * TCP封禁，取值[0(封禁关)，1(封禁开)]
    */
    @SerializedName("DropTcp")
    @Expose
    private Long DropTcp;

    /**
    * UDP封禁，取值[0(封禁关)，1(封禁开)]
    */
    @SerializedName("DropUdp")
    @Expose
    private Long DropUdp;

    /**
    * ICMP封禁，取值[0(封禁关)，1(封禁开)]
    */
    @SerializedName("DropIcmp")
    @Expose
    private Long DropIcmp;

    /**
    * 其他协议封禁，取值[0(封禁关)，1(封禁开)]
    */
    @SerializedName("DropOther")
    @Expose
    private Long DropOther;

    /**
    * 异常空连接防护，取值[0(防护关)，1(防护开)]
    */
    @SerializedName("CheckExceptNullConnect")
    @Expose
    private Long CheckExceptNullConnect;

    /**
     * Get TCP封禁，取值[0(封禁关)，1(封禁开)] 
     * @return DropTcp TCP封禁，取值[0(封禁关)，1(封禁开)]
     */
    public Long getDropTcp() {
        return this.DropTcp;
    }

    /**
     * Set TCP封禁，取值[0(封禁关)，1(封禁开)]
     * @param DropTcp TCP封禁，取值[0(封禁关)，1(封禁开)]
     */
    public void setDropTcp(Long DropTcp) {
        this.DropTcp = DropTcp;
    }

    /**
     * Get UDP封禁，取值[0(封禁关)，1(封禁开)] 
     * @return DropUdp UDP封禁，取值[0(封禁关)，1(封禁开)]
     */
    public Long getDropUdp() {
        return this.DropUdp;
    }

    /**
     * Set UDP封禁，取值[0(封禁关)，1(封禁开)]
     * @param DropUdp UDP封禁，取值[0(封禁关)，1(封禁开)]
     */
    public void setDropUdp(Long DropUdp) {
        this.DropUdp = DropUdp;
    }

    /**
     * Get ICMP封禁，取值[0(封禁关)，1(封禁开)] 
     * @return DropIcmp ICMP封禁，取值[0(封禁关)，1(封禁开)]
     */
    public Long getDropIcmp() {
        return this.DropIcmp;
    }

    /**
     * Set ICMP封禁，取值[0(封禁关)，1(封禁开)]
     * @param DropIcmp ICMP封禁，取值[0(封禁关)，1(封禁开)]
     */
    public void setDropIcmp(Long DropIcmp) {
        this.DropIcmp = DropIcmp;
    }

    /**
     * Get 其他协议封禁，取值[0(封禁关)，1(封禁开)] 
     * @return DropOther 其他协议封禁，取值[0(封禁关)，1(封禁开)]
     */
    public Long getDropOther() {
        return this.DropOther;
    }

    /**
     * Set 其他协议封禁，取值[0(封禁关)，1(封禁开)]
     * @param DropOther 其他协议封禁，取值[0(封禁关)，1(封禁开)]
     */
    public void setDropOther(Long DropOther) {
        this.DropOther = DropOther;
    }

    /**
     * Get 异常空连接防护，取值[0(防护关)，1(防护开)] 
     * @return CheckExceptNullConnect 异常空连接防护，取值[0(防护关)，1(防护开)]
     */
    public Long getCheckExceptNullConnect() {
        return this.CheckExceptNullConnect;
    }

    /**
     * Set 异常空连接防护，取值[0(防护关)，1(防护开)]
     * @param CheckExceptNullConnect 异常空连接防护，取值[0(防护关)，1(防护开)]
     */
    public void setCheckExceptNullConnect(Long CheckExceptNullConnect) {
        this.CheckExceptNullConnect = CheckExceptNullConnect;
    }

    public ProtocolBlockConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtocolBlockConfig(ProtocolBlockConfig source) {
        if (source.DropTcp != null) {
            this.DropTcp = new Long(source.DropTcp);
        }
        if (source.DropUdp != null) {
            this.DropUdp = new Long(source.DropUdp);
        }
        if (source.DropIcmp != null) {
            this.DropIcmp = new Long(source.DropIcmp);
        }
        if (source.DropOther != null) {
            this.DropOther = new Long(source.DropOther);
        }
        if (source.CheckExceptNullConnect != null) {
            this.CheckExceptNullConnect = new Long(source.CheckExceptNullConnect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DropTcp", this.DropTcp);
        this.setParamSimple(map, prefix + "DropUdp", this.DropUdp);
        this.setParamSimple(map, prefix + "DropIcmp", this.DropIcmp);
        this.setParamSimple(map, prefix + "DropOther", this.DropOther);
        this.setParamSimple(map, prefix + "CheckExceptNullConnect", this.CheckExceptNullConnect);

    }
}

