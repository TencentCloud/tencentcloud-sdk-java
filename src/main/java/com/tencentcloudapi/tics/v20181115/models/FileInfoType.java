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

public class FileInfoType  extends AbstractModel{

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
     * 获取判定渠道
     * @return DetectId 判定渠道
     */
    public String getDetectId() {
        return this.DetectId;
    }

    /**
     * 设置判定渠道
     * @param DetectId 判定渠道
     */
    public void setDetectId(String DetectId) {
        this.DetectId = DetectId;
    }

    /**
     * 获取检测优先级
     * @return DetectPriority 检测优先级
     */
    public String getDetectPriority() {
        return this.DetectPriority;
    }

    /**
     * 设置检测优先级
     * @param DetectPriority 检测优先级
     */
    public void setDetectPriority(String DetectPriority) {
        this.DetectPriority = DetectPriority;
    }

    /**
     * 获取引擎优先级
     * @return EnginePriority 引擎优先级
     */
    public String getEnginePriority() {
        return this.EnginePriority;
    }

    /**
     * 设置引擎优先级
     * @param EnginePriority 引擎优先级
     */
    public void setEnginePriority(String EnginePriority) {
        this.EnginePriority = EnginePriority;
    }

    /**
     * 获取样本是否存在
     * @return FileExist 样本是否存在
     */
    public String getFileExist() {
        return this.FileExist;
    }

    /**
     * 设置样本是否存在
     * @param FileExist 样本是否存在
     */
    public void setFileExist(String FileExist) {
        this.FileExist = FileExist;
    }

    /**
     * 获取文件上传
     * @return FileForceUpload 文件上传
     */
    public String getFileForceUpload() {
        return this.FileForceUpload;
    }

    /**
     * 设置文件上传
     * @param FileForceUpload 文件上传
     */
    public void setFileForceUpload(String FileForceUpload) {
        this.FileForceUpload = FileForceUpload;
    }

    /**
     * 获取文件大小
     * @return FileSize 文件大小
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * 设置文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * 获取文件上传时间
     * @return FileupTime 文件上传时间
     */
    public String getFileupTime() {
        return this.FileupTime;
    }

    /**
     * 设置文件上传时间
     * @param FileupTime 文件上传时间
     */
    public void setFileupTime(String FileupTime) {
        this.FileupTime = FileupTime;
    }

    /**
     * 获取病毒文件全名
     * @return FullVirusName 病毒文件全名
     */
    public String getFullVirusName() {
        return this.FullVirusName;
    }

    /**
     * 设置病毒文件全名
     * @param FullVirusName 病毒文件全名
     */
    public void setFullVirusName(String FullVirusName) {
        this.FullVirusName = FullVirusName;
    }

    /**
     * 获取IDC位置
     * @return IdcPosition IDC位置
     */
    public String getIdcPosition() {
        return this.IdcPosition;
    }

    /**
     * 设置IDC位置
     * @param IdcPosition IDC位置
     */
    public void setIdcPosition(String IdcPosition) {
        this.IdcPosition = IdcPosition;
    }

    /**
     * 获取文件md5值
     * @return Md5Type 文件md5值
     */
    public String getMd5Type() {
        return this.Md5Type;
    }

    /**
     * 设置文件md5值
     * @param Md5Type 文件md5值
     */
    public void setMd5Type(String Md5Type) {
        this.Md5Type = Md5Type;
    }

    /**
     * 获取PE结构是否存在
     * @return PeExist PE结构是否存在
     */
    public String getPeExist() {
        return this.PeExist;
    }

    /**
     * 设置PE结构是否存在
     * @param PeExist PE结构是否存在
     */
    public void setPeExist(String PeExist) {
        this.PeExist = PeExist;
    }

    /**
     * 获取PE结构上传
     * @return PeForceUpload PE结构上传
     */
    public String getPeForceUpload() {
        return this.PeForceUpload;
    }

    /**
     * 设置PE结构上传
     * @param PeForceUpload PE结构上传
     */
    public void setPeForceUpload(String PeForceUpload) {
        this.PeForceUpload = PeForceUpload;
    }

    /**
     * 获取安全性等级
     * @return SafeLevel 安全性等级
     */
    public String getSafeLevel() {
        return this.SafeLevel;
    }

    /**
     * 设置安全性等级
     * @param SafeLevel 安全性等级
     */
    public void setSafeLevel(String SafeLevel) {
        this.SafeLevel = SafeLevel;
    }

    /**
     * 获取扫描时间
     * @return ScanModiTime 扫描时间
     */
    public String getScanModiTime() {
        return this.ScanModiTime;
    }

    /**
     * 设置扫描时间
     * @param ScanModiTime 扫描时间
     */
    public void setScanModiTime(String ScanModiTime) {
        this.ScanModiTime = ScanModiTime;
    }

    /**
     * 获取子判定渠道
     * @return SubdetectId 子判定渠道
     */
    public String getSubdetectId() {
        return this.SubdetectId;
    }

    /**
     * 设置子判定渠道
     * @param SubdetectId 子判定渠道
     */
    public void setSubdetectId(String SubdetectId) {
        this.SubdetectId = SubdetectId;
    }

    /**
     * 获取病毒名
     * @return UserDefName 病毒名
     */
    public String getUserDefName() {
        return this.UserDefName;
    }

    /**
     * 设置病毒名
     * @param UserDefName 病毒名
     */
    public void setUserDefName(String UserDefName) {
        this.UserDefName = UserDefName;
    }

    /**
     * 获取病毒类型
     * @return VirusType 病毒类型
     */
    public String getVirusType() {
        return this.VirusType;
    }

    /**
     * 设置病毒类型
     * @param VirusType 病毒类型
     */
    public void setVirusType(String VirusType) {
        this.VirusType = VirusType;
    }

    /**
     * 获取白名单分数
     * @return WhiteScore 白名单分数
     */
    public String getWhiteScore() {
        return this.WhiteScore;
    }

    /**
     * 设置白名单分数
     * @param WhiteScore 白名单分数
     */
    public void setWhiteScore(String WhiteScore) {
        this.WhiteScore = WhiteScore;
    }

    /**
     * 内部实现，用户禁止调用
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

