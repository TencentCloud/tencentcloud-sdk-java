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
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfoType extends AbstractModel{

    /**
    * 判定渠道
    */
    @SerializedName("DetectId")
    @Expose
    private String DetectId;

    /**
    * 检测优先级
    */
    @SerializedName("DetectPriority")
    @Expose
    private String DetectPriority;

    /**
    * 引擎优先级
    */
    @SerializedName("EnginePriority")
    @Expose
    private String EnginePriority;

    /**
    * 样本是否存在
    */
    @SerializedName("FileExist")
    @Expose
    private String FileExist;

    /**
    * 文件上传
    */
    @SerializedName("FileForceUpload")
    @Expose
    private String FileForceUpload;

    /**
    * 文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 文件上传时间
    */
    @SerializedName("FileupTime")
    @Expose
    private String FileupTime;

    /**
    * 病毒文件全名
    */
    @SerializedName("FullVirusName")
    @Expose
    private String FullVirusName;

    /**
    * IDC位置
    */
    @SerializedName("IdcPosition")
    @Expose
    private String IdcPosition;

    /**
    * 文件md5值
    */
    @SerializedName("Md5Type")
    @Expose
    private String Md5Type;

    /**
    * PE结构是否存在
    */
    @SerializedName("PeExist")
    @Expose
    private String PeExist;

    /**
    * PE结构上传
    */
    @SerializedName("PeForceUpload")
    @Expose
    private String PeForceUpload;

    /**
    * 安全性等级
    */
    @SerializedName("SafeLevel")
    @Expose
    private String SafeLevel;

    /**
    * 扫描时间
    */
    @SerializedName("ScanModiTime")
    @Expose
    private String ScanModiTime;

    /**
    * 子判定渠道
    */
    @SerializedName("SubdetectId")
    @Expose
    private String SubdetectId;

    /**
    * 病毒名
    */
    @SerializedName("UserDefName")
    @Expose
    private String UserDefName;

    /**
    * 病毒类型
    */
    @SerializedName("VirusType")
    @Expose
    private String VirusType;

    /**
    * 白名单分数
    */
    @SerializedName("WhiteScore")
    @Expose
    private String WhiteScore;

    /**
     * Get 判定渠道 
     * @return DetectId 判定渠道
     */
    public String getDetectId() {
        return this.DetectId;
    }

    /**
     * Set 判定渠道
     * @param DetectId 判定渠道
     */
    public void setDetectId(String DetectId) {
        this.DetectId = DetectId;
    }

    /**
     * Get 检测优先级 
     * @return DetectPriority 检测优先级
     */
    public String getDetectPriority() {
        return this.DetectPriority;
    }

    /**
     * Set 检测优先级
     * @param DetectPriority 检测优先级
     */
    public void setDetectPriority(String DetectPriority) {
        this.DetectPriority = DetectPriority;
    }

    /**
     * Get 引擎优先级 
     * @return EnginePriority 引擎优先级
     */
    public String getEnginePriority() {
        return this.EnginePriority;
    }

    /**
     * Set 引擎优先级
     * @param EnginePriority 引擎优先级
     */
    public void setEnginePriority(String EnginePriority) {
        this.EnginePriority = EnginePriority;
    }

    /**
     * Get 样本是否存在 
     * @return FileExist 样本是否存在
     */
    public String getFileExist() {
        return this.FileExist;
    }

    /**
     * Set 样本是否存在
     * @param FileExist 样本是否存在
     */
    public void setFileExist(String FileExist) {
        this.FileExist = FileExist;
    }

    /**
     * Get 文件上传 
     * @return FileForceUpload 文件上传
     */
    public String getFileForceUpload() {
        return this.FileForceUpload;
    }

    /**
     * Set 文件上传
     * @param FileForceUpload 文件上传
     */
    public void setFileForceUpload(String FileForceUpload) {
        this.FileForceUpload = FileForceUpload;
    }

    /**
     * Get 文件大小 
     * @return FileSize 文件大小
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件上传时间 
     * @return FileupTime 文件上传时间
     */
    public String getFileupTime() {
        return this.FileupTime;
    }

    /**
     * Set 文件上传时间
     * @param FileupTime 文件上传时间
     */
    public void setFileupTime(String FileupTime) {
        this.FileupTime = FileupTime;
    }

    /**
     * Get 病毒文件全名 
     * @return FullVirusName 病毒文件全名
     */
    public String getFullVirusName() {
        return this.FullVirusName;
    }

    /**
     * Set 病毒文件全名
     * @param FullVirusName 病毒文件全名
     */
    public void setFullVirusName(String FullVirusName) {
        this.FullVirusName = FullVirusName;
    }

    /**
     * Get IDC位置 
     * @return IdcPosition IDC位置
     */
    public String getIdcPosition() {
        return this.IdcPosition;
    }

    /**
     * Set IDC位置
     * @param IdcPosition IDC位置
     */
    public void setIdcPosition(String IdcPosition) {
        this.IdcPosition = IdcPosition;
    }

    /**
     * Get 文件md5值 
     * @return Md5Type 文件md5值
     */
    public String getMd5Type() {
        return this.Md5Type;
    }

    /**
     * Set 文件md5值
     * @param Md5Type 文件md5值
     */
    public void setMd5Type(String Md5Type) {
        this.Md5Type = Md5Type;
    }

    /**
     * Get PE结构是否存在 
     * @return PeExist PE结构是否存在
     */
    public String getPeExist() {
        return this.PeExist;
    }

    /**
     * Set PE结构是否存在
     * @param PeExist PE结构是否存在
     */
    public void setPeExist(String PeExist) {
        this.PeExist = PeExist;
    }

    /**
     * Get PE结构上传 
     * @return PeForceUpload PE结构上传
     */
    public String getPeForceUpload() {
        return this.PeForceUpload;
    }

    /**
     * Set PE结构上传
     * @param PeForceUpload PE结构上传
     */
    public void setPeForceUpload(String PeForceUpload) {
        this.PeForceUpload = PeForceUpload;
    }

    /**
     * Get 安全性等级 
     * @return SafeLevel 安全性等级
     */
    public String getSafeLevel() {
        return this.SafeLevel;
    }

    /**
     * Set 安全性等级
     * @param SafeLevel 安全性等级
     */
    public void setSafeLevel(String SafeLevel) {
        this.SafeLevel = SafeLevel;
    }

    /**
     * Get 扫描时间 
     * @return ScanModiTime 扫描时间
     */
    public String getScanModiTime() {
        return this.ScanModiTime;
    }

    /**
     * Set 扫描时间
     * @param ScanModiTime 扫描时间
     */
    public void setScanModiTime(String ScanModiTime) {
        this.ScanModiTime = ScanModiTime;
    }

    /**
     * Get 子判定渠道 
     * @return SubdetectId 子判定渠道
     */
    public String getSubdetectId() {
        return this.SubdetectId;
    }

    /**
     * Set 子判定渠道
     * @param SubdetectId 子判定渠道
     */
    public void setSubdetectId(String SubdetectId) {
        this.SubdetectId = SubdetectId;
    }

    /**
     * Get 病毒名 
     * @return UserDefName 病毒名
     */
    public String getUserDefName() {
        return this.UserDefName;
    }

    /**
     * Set 病毒名
     * @param UserDefName 病毒名
     */
    public void setUserDefName(String UserDefName) {
        this.UserDefName = UserDefName;
    }

    /**
     * Get 病毒类型 
     * @return VirusType 病毒类型
     */
    public String getVirusType() {
        return this.VirusType;
    }

    /**
     * Set 病毒类型
     * @param VirusType 病毒类型
     */
    public void setVirusType(String VirusType) {
        this.VirusType = VirusType;
    }

    /**
     * Get 白名单分数 
     * @return WhiteScore 白名单分数
     */
    public String getWhiteScore() {
        return this.WhiteScore;
    }

    /**
     * Set 白名单分数
     * @param WhiteScore 白名单分数
     */
    public void setWhiteScore(String WhiteScore) {
        this.WhiteScore = WhiteScore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectId", this.DetectId);
        this.setParamSimple(map, prefix + "DetectPriority", this.DetectPriority);
        this.setParamSimple(map, prefix + "EnginePriority", this.EnginePriority);
        this.setParamSimple(map, prefix + "FileExist", this.FileExist);
        this.setParamSimple(map, prefix + "FileForceUpload", this.FileForceUpload);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileupTime", this.FileupTime);
        this.setParamSimple(map, prefix + "FullVirusName", this.FullVirusName);
        this.setParamSimple(map, prefix + "IdcPosition", this.IdcPosition);
        this.setParamSimple(map, prefix + "Md5Type", this.Md5Type);
        this.setParamSimple(map, prefix + "PeExist", this.PeExist);
        this.setParamSimple(map, prefix + "PeForceUpload", this.PeForceUpload);
        this.setParamSimple(map, prefix + "SafeLevel", this.SafeLevel);
        this.setParamSimple(map, prefix + "ScanModiTime", this.ScanModiTime);
        this.setParamSimple(map, prefix + "SubdetectId", this.SubdetectId);
        this.setParamSimple(map, prefix + "UserDefName", this.UserDefName);
        this.setParamSimple(map, prefix + "VirusType", this.VirusType);
        this.setParamSimple(map, prefix + "WhiteScore", this.WhiteScore);

    }
}

