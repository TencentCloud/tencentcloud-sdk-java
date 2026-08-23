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

public class ImageVirus extends AbstractModel {

    /**
    * <p>木马路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>风险级别</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>类别</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>木马名</p>
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * <p>木马Tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>文件类型</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件md5</p>
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * <p>文件大小</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>首次检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstDetectedTime")
    @Expose
    private String FirstDetectedTime;

    /**
    * <p>最后检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestDetectedTime")
    @Expose
    private String LatestDetectedTime;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>检出平台</p>
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String CheckPlatform;

    /**
    * <p>影响镜像数</p>
    */
    @SerializedName("AffectImageCount")
    @Expose
    private Long AffectImageCount;

    /**
    * <p>镜像层id</p>
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * <p>木马记录id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>木马处置建议</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>木马描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>木马类型</p>
    */
    @SerializedName("VirusType")
    @Expose
    private String VirusType;

    /**
     * Get <p>木马路径</p> 
     * @return Path <p>木马路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>木马路径</p>
     * @param Path <p>木马路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>风险级别</p> 
     * @return RiskLevel <p>风险级别</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险级别</p>
     * @param RiskLevel <p>风险级别</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>类别</p> 
     * @return Category <p>类别</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>类别</p>
     * @param Category <p>类别</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>木马名</p> 
     * @return VirusName <p>木马名</p>
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set <p>木马名</p>
     * @param VirusName <p>木马名</p>
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get <p>木马Tag</p> 
     * @return Tags <p>木马Tag</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>木马Tag</p>
     * @param Tags <p>木马Tag</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>文件类型</p> 
     * @return FileType <p>文件类型</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型</p>
     * @param FileType <p>文件类型</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>文件名</p> 
     * @return FileName <p>文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名</p>
     * @param FileName <p>文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件md5</p> 
     * @return FileMd5 <p>文件md5</p>
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set <p>文件md5</p>
     * @param FileMd5 <p>文件md5</p>
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get <p>文件大小</p> 
     * @return FileSize <p>文件大小</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小</p>
     * @param FileSize <p>文件大小</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>首次检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstDetectedTime <p>首次检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstDetectedTime() {
        return this.FirstDetectedTime;
    }

    /**
     * Set <p>首次检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param FirstDetectedTime <p>首次检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstDetectedTime(String FirstDetectedTime) {
        this.FirstDetectedTime = FirstDetectedTime;
    }

    /**
     * Get <p>最后检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestDetectedTime <p>最后检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestDetectedTime() {
        return this.LatestDetectedTime;
    }

    /**
     * Set <p>最后检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LatestDetectedTime <p>最后检测时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestDetectedTime(String LatestDetectedTime) {
        this.LatestDetectedTime = LatestDetectedTime;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>所属账号名</p> 
     * @return OwnerAccountName <p>所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>所属账号名</p>
     * @param OwnerAccountName <p>所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>所属账号uin</p> 
     * @return OwnerUin <p>所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>所属账号uin</p>
     * @param OwnerUin <p>所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>所属账号appid</p> 
     * @return OwnerAppId <p>所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>所属账号appid</p>
     * @param OwnerAppId <p>所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>检出平台</p> 
     * @return CheckPlatform <p>检出平台</p>
     */
    public String getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set <p>检出平台</p>
     * @param CheckPlatform <p>检出平台</p>
     */
    public void setCheckPlatform(String CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get <p>影响镜像数</p> 
     * @return AffectImageCount <p>影响镜像数</p>
     */
    public Long getAffectImageCount() {
        return this.AffectImageCount;
    }

    /**
     * Set <p>影响镜像数</p>
     * @param AffectImageCount <p>影响镜像数</p>
     */
    public void setAffectImageCount(Long AffectImageCount) {
        this.AffectImageCount = AffectImageCount;
    }

    /**
     * Get <p>镜像层id</p> 
     * @return LayerId <p>镜像层id</p>
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set <p>镜像层id</p>
     * @param LayerId <p>镜像层id</p>
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get <p>木马记录id</p> 
     * @return Id <p>木马记录id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>木马记录id</p>
     * @param Id <p>木马记录id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>木马处置建议</p> 
     * @return Suggestion <p>木马处置建议</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>木马处置建议</p>
     * @param Suggestion <p>木马处置建议</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>木马描述</p> 
     * @return Description <p>木马描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>木马描述</p>
     * @param Description <p>木马描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>木马类型</p> 
     * @return VirusType <p>木马类型</p>
     */
    public String getVirusType() {
        return this.VirusType;
    }

    /**
     * Set <p>木马类型</p>
     * @param VirusType <p>木马类型</p>
     */
    public void setVirusType(String VirusType) {
        this.VirusType = VirusType;
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
            this.Tags = new String(source.Tags);
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
        if (source.FirstDetectedTime != null) {
            this.FirstDetectedTime = new String(source.FirstDetectedTime);
        }
        if (source.LatestDetectedTime != null) {
            this.LatestDetectedTime = new String(source.LatestDetectedTime);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String(source.CheckPlatform);
        }
        if (source.AffectImageCount != null) {
            this.AffectImageCount = new Long(source.AffectImageCount);
        }
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VirusType != null) {
            this.VirusType = new String(source.VirusType);
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
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FirstDetectedTime", this.FirstDetectedTime);
        this.setParamSimple(map, prefix + "LatestDetectedTime", this.LatestDetectedTime);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "CheckPlatform", this.CheckPlatform);
        this.setParamSimple(map, prefix + "AffectImageCount", this.AffectImageCount);
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VirusType", this.VirusType);

    }
}

