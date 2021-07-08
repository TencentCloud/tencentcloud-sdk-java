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

public class TLogInfo extends AbstractModel{

    /**
    * 失陷主机
    */
    @SerializedName("OutNum")
    @Expose
    private Long OutNum;

    /**
    * 待处置告警
    */
    @SerializedName("HandleNum")
    @Expose
    private Long HandleNum;

    /**
    * 漏洞攻击
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * 网络探测
    */
    @SerializedName("NetworkNum")
    @Expose
    private Long NetworkNum;

    /**
    * 封禁列表
    */
    @SerializedName("BanNum")
    @Expose
    private Long BanNum;

    /**
    * 暴力破解
    */
    @SerializedName("BruteForceNum")
    @Expose
    private Long BruteForceNum;

    /**
     * Get 失陷主机 
     * @return OutNum 失陷主机
     */
    public Long getOutNum() {
        return this.OutNum;
    }

    /**
     * Set 失陷主机
     * @param OutNum 失陷主机
     */
    public void setOutNum(Long OutNum) {
        this.OutNum = OutNum;
    }

    /**
     * Get 待处置告警 
     * @return HandleNum 待处置告警
     */
    public Long getHandleNum() {
        return this.HandleNum;
    }

    /**
     * Set 待处置告警
     * @param HandleNum 待处置告警
     */
    public void setHandleNum(Long HandleNum) {
        this.HandleNum = HandleNum;
    }

    /**
     * Get 漏洞攻击 
     * @return VulNum 漏洞攻击
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞攻击
     * @param VulNum 漏洞攻击
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get 网络探测 
     * @return NetworkNum 网络探测
     */
    public Long getNetworkNum() {
        return this.NetworkNum;
    }

    /**
     * Set 网络探测
     * @param NetworkNum 网络探测
     */
    public void setNetworkNum(Long NetworkNum) {
        this.NetworkNum = NetworkNum;
    }

    /**
     * Get 封禁列表 
     * @return BanNum 封禁列表
     */
    public Long getBanNum() {
        return this.BanNum;
    }

    /**
     * Set 封禁列表
     * @param BanNum 封禁列表
     */
    public void setBanNum(Long BanNum) {
        this.BanNum = BanNum;
    }

    /**
     * Get 暴力破解 
     * @return BruteForceNum 暴力破解
     */
    public Long getBruteForceNum() {
        return this.BruteForceNum;
    }

    /**
     * Set 暴力破解
     * @param BruteForceNum 暴力破解
     */
    public void setBruteForceNum(Long BruteForceNum) {
        this.BruteForceNum = BruteForceNum;
    }

    public TLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TLogInfo(TLogInfo source) {
        if (source.OutNum != null) {
            this.OutNum = new Long(source.OutNum);
        }
        if (source.HandleNum != null) {
            this.HandleNum = new Long(source.HandleNum);
        }
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.NetworkNum != null) {
            this.NetworkNum = new Long(source.NetworkNum);
        }
        if (source.BanNum != null) {
            this.BanNum = new Long(source.BanNum);
        }
        if (source.BruteForceNum != null) {
            this.BruteForceNum = new Long(source.BruteForceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutNum", this.OutNum);
        this.setParamSimple(map, prefix + "HandleNum", this.HandleNum);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "NetworkNum", this.NetworkNum);
        this.setParamSimple(map, prefix + "BanNum", this.BanNum);
        this.setParamSimple(map, prefix + "BruteForceNum", this.BruteForceNum);

    }
}

