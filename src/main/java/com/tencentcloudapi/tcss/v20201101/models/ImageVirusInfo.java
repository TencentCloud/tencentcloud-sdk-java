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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageVirusInfo extends AbstractModel{

    /**
    * 路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 修护建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * 文件md5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get 路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 病毒名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusName 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusName 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 修护建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Solution 修护建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 修护建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Solution 修护建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstScanTime 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstScanTime 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get 文件md5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5 文件md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 文件md5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 文件md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public ImageVirusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVirusInfo(ImageVirusInfo source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

