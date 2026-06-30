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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DifferenceDetails extends AbstractModel {

    /**
    * 校验结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 源库gtid set
    */
    @SerializedName("SrcGtidSets")
    @Expose
    private String SrcGtidSets;

    /**
    * 目标库gtid set
    */
    @SerializedName("DstGtidSets")
    @Expose
    private String DstGtidSets;

    /**
    * 源库差异的gtid set
    */
    @SerializedName("DiffSrc")
    @Expose
    private String DiffSrc;

    /**
    * 源库中不一致的表
    */
    @SerializedName("DiffSrcTables")
    @Expose
    private String [] DiffSrcTables;

    /**
    * 目标库差异的gtid set
    */
    @SerializedName("DiffDst")
    @Expose
    private String DiffDst;

    /**
    * 校验结束时间
    */
    @SerializedName("CompareTimestamp")
    @Expose
    private String CompareTimestamp;

    /**
    * 同步范围内的不一致表
    */
    @SerializedName("DiffSrcTablesNeedSync")
    @Expose
    private String [] DiffSrcTablesNeedSync;

    /**
    * 同步范围内是否存在不一致的表
    */
    @SerializedName("DiffSrcIsNeedSync")
    @Expose
    private Boolean DiffSrcIsNeedSync;

    /**
     * Get 校验结果 
     * @return Result 校验结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 校验结果
     * @param Result 校验结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 源库gtid set 
     * @return SrcGtidSets 源库gtid set
     */
    public String getSrcGtidSets() {
        return this.SrcGtidSets;
    }

    /**
     * Set 源库gtid set
     * @param SrcGtidSets 源库gtid set
     */
    public void setSrcGtidSets(String SrcGtidSets) {
        this.SrcGtidSets = SrcGtidSets;
    }

    /**
     * Get 目标库gtid set 
     * @return DstGtidSets 目标库gtid set
     */
    public String getDstGtidSets() {
        return this.DstGtidSets;
    }

    /**
     * Set 目标库gtid set
     * @param DstGtidSets 目标库gtid set
     */
    public void setDstGtidSets(String DstGtidSets) {
        this.DstGtidSets = DstGtidSets;
    }

    /**
     * Get 源库差异的gtid set 
     * @return DiffSrc 源库差异的gtid set
     */
    public String getDiffSrc() {
        return this.DiffSrc;
    }

    /**
     * Set 源库差异的gtid set
     * @param DiffSrc 源库差异的gtid set
     */
    public void setDiffSrc(String DiffSrc) {
        this.DiffSrc = DiffSrc;
    }

    /**
     * Get 源库中不一致的表 
     * @return DiffSrcTables 源库中不一致的表
     */
    public String [] getDiffSrcTables() {
        return this.DiffSrcTables;
    }

    /**
     * Set 源库中不一致的表
     * @param DiffSrcTables 源库中不一致的表
     */
    public void setDiffSrcTables(String [] DiffSrcTables) {
        this.DiffSrcTables = DiffSrcTables;
    }

    /**
     * Get 目标库差异的gtid set 
     * @return DiffDst 目标库差异的gtid set
     */
    public String getDiffDst() {
        return this.DiffDst;
    }

    /**
     * Set 目标库差异的gtid set
     * @param DiffDst 目标库差异的gtid set
     */
    public void setDiffDst(String DiffDst) {
        this.DiffDst = DiffDst;
    }

    /**
     * Get 校验结束时间 
     * @return CompareTimestamp 校验结束时间
     */
    public String getCompareTimestamp() {
        return this.CompareTimestamp;
    }

    /**
     * Set 校验结束时间
     * @param CompareTimestamp 校验结束时间
     */
    public void setCompareTimestamp(String CompareTimestamp) {
        this.CompareTimestamp = CompareTimestamp;
    }

    /**
     * Get 同步范围内的不一致表 
     * @return DiffSrcTablesNeedSync 同步范围内的不一致表
     */
    public String [] getDiffSrcTablesNeedSync() {
        return this.DiffSrcTablesNeedSync;
    }

    /**
     * Set 同步范围内的不一致表
     * @param DiffSrcTablesNeedSync 同步范围内的不一致表
     */
    public void setDiffSrcTablesNeedSync(String [] DiffSrcTablesNeedSync) {
        this.DiffSrcTablesNeedSync = DiffSrcTablesNeedSync;
    }

    /**
     * Get 同步范围内是否存在不一致的表 
     * @return DiffSrcIsNeedSync 同步范围内是否存在不一致的表
     */
    public Boolean getDiffSrcIsNeedSync() {
        return this.DiffSrcIsNeedSync;
    }

    /**
     * Set 同步范围内是否存在不一致的表
     * @param DiffSrcIsNeedSync 同步范围内是否存在不一致的表
     */
    public void setDiffSrcIsNeedSync(Boolean DiffSrcIsNeedSync) {
        this.DiffSrcIsNeedSync = DiffSrcIsNeedSync;
    }

    public DifferenceDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceDetails(DifferenceDetails source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.SrcGtidSets != null) {
            this.SrcGtidSets = new String(source.SrcGtidSets);
        }
        if (source.DstGtidSets != null) {
            this.DstGtidSets = new String(source.DstGtidSets);
        }
        if (source.DiffSrc != null) {
            this.DiffSrc = new String(source.DiffSrc);
        }
        if (source.DiffSrcTables != null) {
            this.DiffSrcTables = new String[source.DiffSrcTables.length];
            for (int i = 0; i < source.DiffSrcTables.length; i++) {
                this.DiffSrcTables[i] = new String(source.DiffSrcTables[i]);
            }
        }
        if (source.DiffDst != null) {
            this.DiffDst = new String(source.DiffDst);
        }
        if (source.CompareTimestamp != null) {
            this.CompareTimestamp = new String(source.CompareTimestamp);
        }
        if (source.DiffSrcTablesNeedSync != null) {
            this.DiffSrcTablesNeedSync = new String[source.DiffSrcTablesNeedSync.length];
            for (int i = 0; i < source.DiffSrcTablesNeedSync.length; i++) {
                this.DiffSrcTablesNeedSync[i] = new String(source.DiffSrcTablesNeedSync[i]);
            }
        }
        if (source.DiffSrcIsNeedSync != null) {
            this.DiffSrcIsNeedSync = new Boolean(source.DiffSrcIsNeedSync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "SrcGtidSets", this.SrcGtidSets);
        this.setParamSimple(map, prefix + "DstGtidSets", this.DstGtidSets);
        this.setParamSimple(map, prefix + "DiffSrc", this.DiffSrc);
        this.setParamArraySimple(map, prefix + "DiffSrcTables.", this.DiffSrcTables);
        this.setParamSimple(map, prefix + "DiffDst", this.DiffDst);
        this.setParamSimple(map, prefix + "CompareTimestamp", this.CompareTimestamp);
        this.setParamArraySimple(map, prefix + "DiffSrcTablesNeedSync.", this.DiffSrcTablesNeedSync);
        this.setParamSimple(map, prefix + "DiffSrcIsNeedSync", this.DiffSrcIsNeedSync);

    }
}

