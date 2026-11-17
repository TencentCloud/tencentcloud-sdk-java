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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectedResourceOverview extends AbstractModel {

    /**
    * <p>受保护资源总数</p>
    */
    @SerializedName("TotalProtectedCount")
    @Expose
    private Long TotalProtectedCount;

    /**
    * <p>总资源数</p>
    */
    @SerializedName("TotalResourceCount")
    @Expose
    private Long TotalResourceCount;

    /**
    * <p>CVM整机备份受保护统计</p>
    */
    @SerializedName("Cvm")
    @Expose
    private ResourceProtectStat Cvm;

    /**
    * <p>CVM文件备份受保护统计</p>
    */
    @SerializedName("CFS")
    @Expose
    private ResourceProtectStat CFS;

    /**
    * <p>CFS文件备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSAgent")
    @Expose
    private ResourceProtectStat CFSAgent;

    /**
    * <p>COS备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSAgent")
    @Expose
    private ResourceProtectStat COSAgent;

    /**
    * <p>非腾讯云虚拟机备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalCVMAgent")
    @Expose
    private ResourceProtectStat LocalCVMAgent;

    /**
    * <p>非腾讯云文件存储备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalCFSAgent")
    @Expose
    private ResourceProtectStat LocalCFSAgent;

    /**
     * Get <p>受保护资源总数</p> 
     * @return TotalProtectedCount <p>受保护资源总数</p>
     */
    public Long getTotalProtectedCount() {
        return this.TotalProtectedCount;
    }

    /**
     * Set <p>受保护资源总数</p>
     * @param TotalProtectedCount <p>受保护资源总数</p>
     */
    public void setTotalProtectedCount(Long TotalProtectedCount) {
        this.TotalProtectedCount = TotalProtectedCount;
    }

    /**
     * Get <p>总资源数</p> 
     * @return TotalResourceCount <p>总资源数</p>
     */
    public Long getTotalResourceCount() {
        return this.TotalResourceCount;
    }

    /**
     * Set <p>总资源数</p>
     * @param TotalResourceCount <p>总资源数</p>
     */
    public void setTotalResourceCount(Long TotalResourceCount) {
        this.TotalResourceCount = TotalResourceCount;
    }

    /**
     * Get <p>CVM整机备份受保护统计</p> 
     * @return Cvm <p>CVM整机备份受保护统计</p>
     */
    public ResourceProtectStat getCvm() {
        return this.Cvm;
    }

    /**
     * Set <p>CVM整机备份受保护统计</p>
     * @param Cvm <p>CVM整机备份受保护统计</p>
     */
    public void setCvm(ResourceProtectStat Cvm) {
        this.Cvm = Cvm;
    }

    /**
     * Get <p>CVM文件备份受保护统计</p> 
     * @return CFS <p>CVM文件备份受保护统计</p>
     */
    public ResourceProtectStat getCFS() {
        return this.CFS;
    }

    /**
     * Set <p>CVM文件备份受保护统计</p>
     * @param CFS <p>CVM文件备份受保护统计</p>
     */
    public void setCFS(ResourceProtectStat CFS) {
        this.CFS = CFS;
    }

    /**
     * Get <p>CFS文件备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSAgent <p>CFS文件备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceProtectStat getCFSAgent() {
        return this.CFSAgent;
    }

    /**
     * Set <p>CFS文件备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSAgent <p>CFS文件备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSAgent(ResourceProtectStat CFSAgent) {
        this.CFSAgent = CFSAgent;
    }

    /**
     * Get <p>COS备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSAgent <p>COS备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceProtectStat getCOSAgent() {
        return this.COSAgent;
    }

    /**
     * Set <p>COS备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSAgent <p>COS备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSAgent(ResourceProtectStat COSAgent) {
        this.COSAgent = COSAgent;
    }

    /**
     * Get <p>非腾讯云虚拟机备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalCVMAgent <p>非腾讯云虚拟机备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceProtectStat getLocalCVMAgent() {
        return this.LocalCVMAgent;
    }

    /**
     * Set <p>非腾讯云虚拟机备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalCVMAgent <p>非腾讯云虚拟机备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalCVMAgent(ResourceProtectStat LocalCVMAgent) {
        this.LocalCVMAgent = LocalCVMAgent;
    }

    /**
     * Get <p>非腾讯云文件存储备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalCFSAgent <p>非腾讯云文件存储备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceProtectStat getLocalCFSAgent() {
        return this.LocalCFSAgent;
    }

    /**
     * Set <p>非腾讯云文件存储备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalCFSAgent <p>非腾讯云文件存储备份受保护统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalCFSAgent(ResourceProtectStat LocalCFSAgent) {
        this.LocalCFSAgent = LocalCFSAgent;
    }

    public ProtectedResourceOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectedResourceOverview(ProtectedResourceOverview source) {
        if (source.TotalProtectedCount != null) {
            this.TotalProtectedCount = new Long(source.TotalProtectedCount);
        }
        if (source.TotalResourceCount != null) {
            this.TotalResourceCount = new Long(source.TotalResourceCount);
        }
        if (source.Cvm != null) {
            this.Cvm = new ResourceProtectStat(source.Cvm);
        }
        if (source.CFS != null) {
            this.CFS = new ResourceProtectStat(source.CFS);
        }
        if (source.CFSAgent != null) {
            this.CFSAgent = new ResourceProtectStat(source.CFSAgent);
        }
        if (source.COSAgent != null) {
            this.COSAgent = new ResourceProtectStat(source.COSAgent);
        }
        if (source.LocalCVMAgent != null) {
            this.LocalCVMAgent = new ResourceProtectStat(source.LocalCVMAgent);
        }
        if (source.LocalCFSAgent != null) {
            this.LocalCFSAgent = new ResourceProtectStat(source.LocalCFSAgent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalProtectedCount", this.TotalProtectedCount);
        this.setParamSimple(map, prefix + "TotalResourceCount", this.TotalResourceCount);
        this.setParamObj(map, prefix + "Cvm.", this.Cvm);
        this.setParamObj(map, prefix + "CFS.", this.CFS);
        this.setParamObj(map, prefix + "CFSAgent.", this.CFSAgent);
        this.setParamObj(map, prefix + "COSAgent.", this.COSAgent);
        this.setParamObj(map, prefix + "LocalCVMAgent.", this.LocalCVMAgent);
        this.setParamObj(map, prefix + "LocalCFSAgent.", this.LocalCFSAgent);

    }
}

