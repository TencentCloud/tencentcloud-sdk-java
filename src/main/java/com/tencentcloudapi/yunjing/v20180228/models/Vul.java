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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vul  extends AbstractModel{

    /**
    * 漏洞种类ID
    */
    @SerializedName("VulId")
    @Expose
    private Integer VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞危害等级:
HIGH：高危
MIDDLE：中危
LOW：低危
NOTICE：提示
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * 最后扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 受影响机器数量
    */
    @SerializedName("ImpactedHostNum")
    @Expose
    private Integer ImpactedHostNum;

    /**
    * 漏洞状态
* UN_OPERATED : 待处理
* FIXED : 已修复
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
     * 获取漏洞种类ID
     * @return VulId 漏洞种类ID
     */
    public Integer getVulId() {
        return this.VulId;
    }

    /**
     * 设置漏洞种类ID
     * @param VulId 漏洞种类ID
     */
    public void setVulId(Integer VulId) {
        this.VulId = VulId;
    }

    /**
     * 获取漏洞名称
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * 设置漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * 获取漏洞危害等级:
HIGH：高危
MIDDLE：中危
LOW：低危
NOTICE：提示
     * @return VulLevel 漏洞危害等级:
HIGH：高危
MIDDLE：中危
LOW：低危
NOTICE：提示
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * 设置漏洞危害等级:
HIGH：高危
MIDDLE：中危
LOW：低危
NOTICE：提示
     * @param VulLevel 漏洞危害等级:
HIGH：高危
MIDDLE：中危
LOW：低危
NOTICE：提示
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * 获取最后扫描时间
     * @return LastScanTime 最后扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * 设置最后扫描时间
     * @param LastScanTime 最后扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * 获取受影响机器数量
     * @return ImpactedHostNum 受影响机器数量
     */
    public Integer getImpactedHostNum() {
        return this.ImpactedHostNum;
    }

    /**
     * 设置受影响机器数量
     * @param ImpactedHostNum 受影响机器数量
     */
    public void setImpactedHostNum(Integer ImpactedHostNum) {
        this.ImpactedHostNum = ImpactedHostNum;
    }

    /**
     * 获取漏洞状态
* UN_OPERATED : 待处理
* FIXED : 已修复
     * @return VulStatus 漏洞状态
* UN_OPERATED : 待处理
* FIXED : 已修复
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * 设置漏洞状态
* UN_OPERATED : 待处理
* FIXED : 已修复
     * @param VulStatus 漏洞状态
* UN_OPERATED : 待处理
* FIXED : 已修复
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "ImpactedHostNum", this.ImpactedHostNum);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);

    }
}

