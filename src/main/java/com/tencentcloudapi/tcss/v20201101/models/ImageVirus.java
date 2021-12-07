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

public class ImageVirus extends AbstractModel{

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
    private String RiskLevel;

    /**
    * 分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

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
    * 解决方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件md5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

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
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
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
     * Get 解决方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Solution 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Solution 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件md5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMd5 文件md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件md5
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMd5 文件md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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

    public ImageVirus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVirus(ImageVirus source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
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
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);

    }
}

