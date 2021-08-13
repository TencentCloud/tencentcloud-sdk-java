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

public class ModifyAssetScanRequest extends AbstractModel{

    /**
    * 扫描范围：1端口, 2端口+漏扫
    */
    @SerializedName("ScanRange")
    @Expose
    private Long ScanRange;

    /**
    * 扫描深度：'heavy', 'medium', 'light'
    */
    @SerializedName("ScanDeep")
    @Expose
    private String ScanDeep;

    /**
    * 扫描类型：1立即扫描 2 周期任务
    */
    @SerializedName("RangeType")
    @Expose
    private Long RangeType;

    /**
    * RangeType为2 是必须添加，定时任务时间
    */
    @SerializedName("ScanPeriod")
    @Expose
    private String ScanPeriod;

    /**
    * 立即扫描这个字段传过滤的扫描集合
    */
    @SerializedName("ScanFilterIp")
    @Expose
    private String [] ScanFilterIp;

    /**
    * 1全量2单个
    */
    @SerializedName("ScanType")
    @Expose
    private Long ScanType;

    /**
     * Get 扫描范围：1端口, 2端口+漏扫 
     * @return ScanRange 扫描范围：1端口, 2端口+漏扫
     */
    public Long getScanRange() {
        return this.ScanRange;
    }

    /**
     * Set 扫描范围：1端口, 2端口+漏扫
     * @param ScanRange 扫描范围：1端口, 2端口+漏扫
     */
    public void setScanRange(Long ScanRange) {
        this.ScanRange = ScanRange;
    }

    /**
     * Get 扫描深度：'heavy', 'medium', 'light' 
     * @return ScanDeep 扫描深度：'heavy', 'medium', 'light'
     */
    public String getScanDeep() {
        return this.ScanDeep;
    }

    /**
     * Set 扫描深度：'heavy', 'medium', 'light'
     * @param ScanDeep 扫描深度：'heavy', 'medium', 'light'
     */
    public void setScanDeep(String ScanDeep) {
        this.ScanDeep = ScanDeep;
    }

    /**
     * Get 扫描类型：1立即扫描 2 周期任务 
     * @return RangeType 扫描类型：1立即扫描 2 周期任务
     */
    public Long getRangeType() {
        return this.RangeType;
    }

    /**
     * Set 扫描类型：1立即扫描 2 周期任务
     * @param RangeType 扫描类型：1立即扫描 2 周期任务
     */
    public void setRangeType(Long RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get RangeType为2 是必须添加，定时任务时间 
     * @return ScanPeriod RangeType为2 是必须添加，定时任务时间
     */
    public String getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set RangeType为2 是必须添加，定时任务时间
     * @param ScanPeriod RangeType为2 是必须添加，定时任务时间
     */
    public void setScanPeriod(String ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get 立即扫描这个字段传过滤的扫描集合 
     * @return ScanFilterIp 立即扫描这个字段传过滤的扫描集合
     */
    public String [] getScanFilterIp() {
        return this.ScanFilterIp;
    }

    /**
     * Set 立即扫描这个字段传过滤的扫描集合
     * @param ScanFilterIp 立即扫描这个字段传过滤的扫描集合
     */
    public void setScanFilterIp(String [] ScanFilterIp) {
        this.ScanFilterIp = ScanFilterIp;
    }

    /**
     * Get 1全量2单个 
     * @return ScanType 1全量2单个
     */
    public Long getScanType() {
        return this.ScanType;
    }

    /**
     * Set 1全量2单个
     * @param ScanType 1全量2单个
     */
    public void setScanType(Long ScanType) {
        this.ScanType = ScanType;
    }

    public ModifyAssetScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetScanRequest(ModifyAssetScanRequest source) {
        if (source.ScanRange != null) {
            this.ScanRange = new Long(source.ScanRange);
        }
        if (source.ScanDeep != null) {
            this.ScanDeep = new String(source.ScanDeep);
        }
        if (source.RangeType != null) {
            this.RangeType = new Long(source.RangeType);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new String(source.ScanPeriod);
        }
        if (source.ScanFilterIp != null) {
            this.ScanFilterIp = new String[source.ScanFilterIp.length];
            for (int i = 0; i < source.ScanFilterIp.length; i++) {
                this.ScanFilterIp[i] = new String(source.ScanFilterIp[i]);
            }
        }
        if (source.ScanType != null) {
            this.ScanType = new Long(source.ScanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanRange", this.ScanRange);
        this.setParamSimple(map, prefix + "ScanDeep", this.ScanDeep);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamArraySimple(map, prefix + "ScanFilterIp.", this.ScanFilterIp);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);

    }
}

