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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanResultInfo extends AbstractModel{

    /**
    * 暴漏漏洞数量
    */
    @SerializedName("LeakNum")
    @Expose
    private Long LeakNum;

    /**
    * 防护ip数量
    */
    @SerializedName("IPNum")
    @Expose
    private Long IPNum;

    /**
    * 暴漏端口数量
    */
    @SerializedName("PortNum")
    @Expose
    private Long PortNum;

    /**
    * 是否开启防护
    */
    @SerializedName("IPStatus")
    @Expose
    private Boolean IPStatus;

    /**
    * 是否拦截攻击
    */
    @SerializedName("IdpStatus")
    @Expose
    private Boolean IdpStatus;

    /**
    * 是否禁封端口
    */
    @SerializedName("BanStatus")
    @Expose
    private Boolean BanStatus;

    /**
     * Get 暴漏漏洞数量 
     * @return LeakNum 暴漏漏洞数量
     */
    public Long getLeakNum() {
        return this.LeakNum;
    }

    /**
     * Set 暴漏漏洞数量
     * @param LeakNum 暴漏漏洞数量
     */
    public void setLeakNum(Long LeakNum) {
        this.LeakNum = LeakNum;
    }

    /**
     * Get 防护ip数量 
     * @return IPNum 防护ip数量
     */
    public Long getIPNum() {
        return this.IPNum;
    }

    /**
     * Set 防护ip数量
     * @param IPNum 防护ip数量
     */
    public void setIPNum(Long IPNum) {
        this.IPNum = IPNum;
    }

    /**
     * Get 暴漏端口数量 
     * @return PortNum 暴漏端口数量
     */
    public Long getPortNum() {
        return this.PortNum;
    }

    /**
     * Set 暴漏端口数量
     * @param PortNum 暴漏端口数量
     */
    public void setPortNum(Long PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get 是否开启防护 
     * @return IPStatus 是否开启防护
     */
    public Boolean getIPStatus() {
        return this.IPStatus;
    }

    /**
     * Set 是否开启防护
     * @param IPStatus 是否开启防护
     */
    public void setIPStatus(Boolean IPStatus) {
        this.IPStatus = IPStatus;
    }

    /**
     * Get 是否拦截攻击 
     * @return IdpStatus 是否拦截攻击
     */
    public Boolean getIdpStatus() {
        return this.IdpStatus;
    }

    /**
     * Set 是否拦截攻击
     * @param IdpStatus 是否拦截攻击
     */
    public void setIdpStatus(Boolean IdpStatus) {
        this.IdpStatus = IdpStatus;
    }

    /**
     * Get 是否禁封端口 
     * @return BanStatus 是否禁封端口
     */
    public Boolean getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 是否禁封端口
     * @param BanStatus 是否禁封端口
     */
    public void setBanStatus(Boolean BanStatus) {
        this.BanStatus = BanStatus;
    }

    public ScanResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanResultInfo(ScanResultInfo source) {
        if (source.LeakNum != null) {
            this.LeakNum = new Long(source.LeakNum);
        }
        if (source.IPNum != null) {
            this.IPNum = new Long(source.IPNum);
        }
        if (source.PortNum != null) {
            this.PortNum = new Long(source.PortNum);
        }
        if (source.IPStatus != null) {
            this.IPStatus = new Boolean(source.IPStatus);
        }
        if (source.IdpStatus != null) {
            this.IdpStatus = new Boolean(source.IdpStatus);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new Boolean(source.BanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeakNum", this.LeakNum);
        this.setParamSimple(map, prefix + "IPNum", this.IPNum);
        this.setParamSimple(map, prefix + "PortNum", this.PortNum);
        this.setParamSimple(map, prefix + "IPStatus", this.IPStatus);
        this.setParamSimple(map, prefix + "IdpStatus", this.IdpStatus);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);

    }
}

