/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulFixStatusItem extends AbstractModel {

    /**
    * 漏洞ID（KB补丁修复任务时为空）
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * KB补丁ID（漏洞修复任务时为空）
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * 漏洞名称或KB补丁名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 该漏洞的修复状态
枚举值：
0：修复中
1：全部成功
2：部分失败
3：全部失败
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * 该漏洞/KB补丁关联的主机总数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 该漏洞/KB补丁修复成功的主机数
    */
    @SerializedName("SuccessHostCount")
    @Expose
    private Long SuccessHostCount;

    /**
    * 该漏洞/KB补丁修复失败的主机数
    */
    @SerializedName("FailHostCount")
    @Expose
    private Long FailHostCount;

    /**
     * Get 漏洞ID（KB补丁修复任务时为空） 
     * @return VulId 漏洞ID（KB补丁修复任务时为空）
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞ID（KB补丁修复任务时为空）
     * @param VulId 漏洞ID（KB补丁修复任务时为空）
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get KB补丁ID（漏洞修复任务时为空） 
     * @return KBId KB补丁ID（漏洞修复任务时为空）
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set KB补丁ID（漏洞修复任务时为空）
     * @param KBId KB补丁ID（漏洞修复任务时为空）
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get 漏洞名称或KB补丁名称 
     * @return VulName 漏洞名称或KB补丁名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称或KB补丁名称
     * @param VulName 漏洞名称或KB补丁名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 该漏洞的修复状态
枚举值：
0：修复中
1：全部成功
2：部分失败
3：全部失败 
     * @return FixStatus 该漏洞的修复状态
枚举值：
0：修复中
1：全部成功
2：部分失败
3：全部失败
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set 该漏洞的修复状态
枚举值：
0：修复中
1：全部成功
2：部分失败
3：全部失败
     * @param FixStatus 该漏洞的修复状态
枚举值：
0：修复中
1：全部成功
2：部分失败
3：全部失败
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get 该漏洞/KB补丁关联的主机总数 
     * @return HostCount 该漏洞/KB补丁关联的主机总数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 该漏洞/KB补丁关联的主机总数
     * @param HostCount 该漏洞/KB补丁关联的主机总数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 该漏洞/KB补丁修复成功的主机数 
     * @return SuccessHostCount 该漏洞/KB补丁修复成功的主机数
     */
    public Long getSuccessHostCount() {
        return this.SuccessHostCount;
    }

    /**
     * Set 该漏洞/KB补丁修复成功的主机数
     * @param SuccessHostCount 该漏洞/KB补丁修复成功的主机数
     */
    public void setSuccessHostCount(Long SuccessHostCount) {
        this.SuccessHostCount = SuccessHostCount;
    }

    /**
     * Get 该漏洞/KB补丁修复失败的主机数 
     * @return FailHostCount 该漏洞/KB补丁修复失败的主机数
     */
    public Long getFailHostCount() {
        return this.FailHostCount;
    }

    /**
     * Set 该漏洞/KB补丁修复失败的主机数
     * @param FailHostCount 该漏洞/KB补丁修复失败的主机数
     */
    public void setFailHostCount(Long FailHostCount) {
        this.FailHostCount = FailHostCount;
    }

    public VulFixStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusItem(VulFixStatusItem source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.SuccessHostCount != null) {
            this.SuccessHostCount = new Long(source.SuccessHostCount);
        }
        if (source.FailHostCount != null) {
            this.FailHostCount = new Long(source.FailHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "SuccessHostCount", this.SuccessHostCount);
        this.setParamSimple(map, prefix + "FailHostCount", this.FailHostCount);

    }
}

