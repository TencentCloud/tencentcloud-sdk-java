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

public class ImageAssetInfo extends AbstractModel {

    /**
    * <p>镜像仓库地址</p>
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * <p>镜像摘要</p>
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * <p>镜像仓库类型</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * <p>镜像名</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像tag</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>镜像大小</p>
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * <p>最后扫描时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>扫描状态</p><p>枚举值：</p><ul><li>INIT： 未扫描</li><li>SCANNING： 扫描中</li><li>FINISH： 扫描成功</li><li>TIMEOUT： 扫描超时</li><li>FAILED： 扫描失败</li><li>STOPPING： 终止中</li><li>CANCELLED： 扫描已取消</li><li>CREATING： 扫描任务创建中</li><li>LICENSE_NOT_ENOUGH： 授权不足</li></ul>
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * <p>漏洞数</p>
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * <p>木马数</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>敏感信息数</p>
    */
    @SerializedName("SensitiveCnt")
    @Expose
    private Long SensitiveCnt;

    /**
    * <p>镜像操作系统</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>所属仓库实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>所属镜像仓库实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>是否授权</p>
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * <p>镜像仓库所在region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>镜像创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * <p>是否是最新镜像</p>
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * <p>低风险漏洞数</p>
    */
    @SerializedName("LowLevelVulCnt")
    @Expose
    private Long LowLevelVulCnt;

    /**
    * <p>中风险漏洞数</p>
    */
    @SerializedName("MediumLevelVulCnt")
    @Expose
    private Long MediumLevelVulCnt;

    /**
    * <p>高风险漏洞数</p>
    */
    @SerializedName("HighLevelVulCnt")
    @Expose
    private Long HighLevelVulCnt;

    /**
    * <p>严重风险漏洞数</p>
    */
    @SerializedName("CriticalLevelVulCnt")
    @Expose
    private Long CriticalLevelVulCnt;

    /**
    * <p>所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>低危木马数</p>
    */
    @SerializedName("LowLevelVirusCnt")
    @Expose
    private Long LowLevelVirusCnt;

    /**
    * <p>中危木马数</p>
    */
    @SerializedName("MediumLevelVirusCnt")
    @Expose
    private Long MediumLevelVirusCnt;

    /**
    * <p>高危木马数</p>
    */
    @SerializedName("HighLevelVirusCnt")
    @Expose
    private Long HighLevelVirusCnt;

    /**
    * <p>严重木马数</p>
    */
    @SerializedName("CriticalLevelVirusCnt")
    @Expose
    private Long CriticalLevelVirusCnt;

    /**
    * <p>应急漏洞数</p>
    */
    @SerializedName("EmergencyVulCnt")
    @Expose
    private Long EmergencyVulCnt;

    /**
    * <p>低危敏感信息数</p>
    */
    @SerializedName("LowLevelSensitiveCnt")
    @Expose
    private Long LowLevelSensitiveCnt;

    /**
    * <p>中危敏感信息数</p>
    */
    @SerializedName("MediumLevelSensitiveCnt")
    @Expose
    private Long MediumLevelSensitiveCnt;

    /**
    * <p>高危敏感信息数</p>
    */
    @SerializedName("HighLevelSensitiveCnt")
    @Expose
    private Long HighLevelSensitiveCnt;

    /**
    * <p>严重敏感信息数</p>
    */
    @SerializedName("CriticalLevelSensitiveCnt")
    @Expose
    private Long CriticalLevelSensitiveCnt;

    /**
    * <p>风险数</p>
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * <p>扫描失败原因</p>
    */
    @SerializedName("ScanFailReason")
    @Expose
    private String ScanFailReason;

    /**
    * <p>扫描失败解决方案</p>
    */
    @SerializedName("ScanSolution")
    @Expose
    private String ScanSolution;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>最近扫描任务Id</p>
    */
    @SerializedName("ScanTaskId")
    @Expose
    private Long ScanTaskId;

    /**
     * Get <p>镜像仓库地址</p> 
     * @return ImageRepoAddress <p>镜像仓库地址</p>
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set <p>镜像仓库地址</p>
     * @param ImageRepoAddress <p>镜像仓库地址</p>
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get <p>镜像摘要</p> 
     * @return ImageDigest <p>镜像摘要</p>
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set <p>镜像摘要</p>
     * @param ImageDigest <p>镜像摘要</p>
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get <p>镜像仓库类型</p> 
     * @return RegistryType <p>镜像仓库类型</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>镜像仓库类型</p>
     * @param RegistryType <p>镜像仓库类型</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get <p>镜像名</p> 
     * @return ImageName <p>镜像名</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名</p>
     * @param ImageName <p>镜像名</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像tag</p> 
     * @return ImageTag <p>镜像tag</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>镜像tag</p>
     * @param ImageTag <p>镜像tag</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>镜像大小</p> 
     * @return ImageSize <p>镜像大小</p>
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set <p>镜像大小</p>
     * @param ImageSize <p>镜像大小</p>
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get <p>最后扫描时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestScanTime <p>最后扫描时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最后扫描时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LatestScanTime <p>最后扫描时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>扫描状态</p><p>枚举值：</p><ul><li>INIT： 未扫描</li><li>SCANNING： 扫描中</li><li>FINISH： 扫描成功</li><li>TIMEOUT： 扫描超时</li><li>FAILED： 扫描失败</li><li>STOPPING： 终止中</li><li>CANCELLED： 扫描已取消</li><li>CREATING： 扫描任务创建中</li><li>LICENSE_NOT_ENOUGH： 授权不足</li></ul> 
     * @return ScanStatus <p>扫描状态</p><p>枚举值：</p><ul><li>INIT： 未扫描</li><li>SCANNING： 扫描中</li><li>FINISH： 扫描成功</li><li>TIMEOUT： 扫描超时</li><li>FAILED： 扫描失败</li><li>STOPPING： 终止中</li><li>CANCELLED： 扫描已取消</li><li>CREATING： 扫描任务创建中</li><li>LICENSE_NOT_ENOUGH： 授权不足</li></ul>
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set <p>扫描状态</p><p>枚举值：</p><ul><li>INIT： 未扫描</li><li>SCANNING： 扫描中</li><li>FINISH： 扫描成功</li><li>TIMEOUT： 扫描超时</li><li>FAILED： 扫描失败</li><li>STOPPING： 终止中</li><li>CANCELLED： 扫描已取消</li><li>CREATING： 扫描任务创建中</li><li>LICENSE_NOT_ENOUGH： 授权不足</li></ul>
     * @param ScanStatus <p>扫描状态</p><p>枚举值：</p><ul><li>INIT： 未扫描</li><li>SCANNING： 扫描中</li><li>FINISH： 扫描成功</li><li>TIMEOUT： 扫描超时</li><li>FAILED： 扫描失败</li><li>STOPPING： 终止中</li><li>CANCELLED： 扫描已取消</li><li>CREATING： 扫描任务创建中</li><li>LICENSE_NOT_ENOUGH： 授权不足</li></ul>
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get <p>漏洞数</p> 
     * @return VulCnt <p>漏洞数</p>
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set <p>漏洞数</p>
     * @param VulCnt <p>漏洞数</p>
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get <p>木马数</p> 
     * @return VirusCnt <p>木马数</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>木马数</p>
     * @param VirusCnt <p>木马数</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>敏感信息数</p> 
     * @return SensitiveCnt <p>敏感信息数</p>
     */
    public Long getSensitiveCnt() {
        return this.SensitiveCnt;
    }

    /**
     * Set <p>敏感信息数</p>
     * @param SensitiveCnt <p>敏感信息数</p>
     */
    public void setSensitiveCnt(Long SensitiveCnt) {
        this.SensitiveCnt = SensitiveCnt;
    }

    /**
     * Get <p>镜像操作系统</p> 
     * @return OsName <p>镜像操作系统</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>镜像操作系统</p>
     * @param OsName <p>镜像操作系统</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>所属仓库实例id</p> 
     * @return InstanceId <p>所属仓库实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>所属仓库实例id</p>
     * @param InstanceId <p>所属仓库实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>所属镜像仓库实例名</p> 
     * @return InstanceName <p>所属镜像仓库实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>所属镜像仓库实例名</p>
     * @param InstanceName <p>所属镜像仓库实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>是否授权</p> 
     * @return IsAuthorized <p>是否授权</p>
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set <p>是否授权</p>
     * @param IsAuthorized <p>是否授权</p>
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get <p>镜像仓库所在region</p> 
     * @return RegistryRegion <p>镜像仓库所在region</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>镜像仓库所在region</p>
     * @param RegistryRegion <p>镜像仓库所在region</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>id</p> 
     * @return Id <p>id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>id</p>
     * @param Id <p>id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get <p>镜像创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return ImageCreateTime <p>镜像创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set <p>镜像创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param ImageCreateTime <p>镜像创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get <p>是否是最新镜像</p> 
     * @return IsLatestImage <p>是否是最新镜像</p>
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set <p>是否是最新镜像</p>
     * @param IsLatestImage <p>是否是最新镜像</p>
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get <p>低风险漏洞数</p> 
     * @return LowLevelVulCnt <p>低风险漏洞数</p>
     */
    public Long getLowLevelVulCnt() {
        return this.LowLevelVulCnt;
    }

    /**
     * Set <p>低风险漏洞数</p>
     * @param LowLevelVulCnt <p>低风险漏洞数</p>
     */
    public void setLowLevelVulCnt(Long LowLevelVulCnt) {
        this.LowLevelVulCnt = LowLevelVulCnt;
    }

    /**
     * Get <p>中风险漏洞数</p> 
     * @return MediumLevelVulCnt <p>中风险漏洞数</p>
     */
    public Long getMediumLevelVulCnt() {
        return this.MediumLevelVulCnt;
    }

    /**
     * Set <p>中风险漏洞数</p>
     * @param MediumLevelVulCnt <p>中风险漏洞数</p>
     */
    public void setMediumLevelVulCnt(Long MediumLevelVulCnt) {
        this.MediumLevelVulCnt = MediumLevelVulCnt;
    }

    /**
     * Get <p>高风险漏洞数</p> 
     * @return HighLevelVulCnt <p>高风险漏洞数</p>
     */
    public Long getHighLevelVulCnt() {
        return this.HighLevelVulCnt;
    }

    /**
     * Set <p>高风险漏洞数</p>
     * @param HighLevelVulCnt <p>高风险漏洞数</p>
     */
    public void setHighLevelVulCnt(Long HighLevelVulCnt) {
        this.HighLevelVulCnt = HighLevelVulCnt;
    }

    /**
     * Get <p>严重风险漏洞数</p> 
     * @return CriticalLevelVulCnt <p>严重风险漏洞数</p>
     */
    public Long getCriticalLevelVulCnt() {
        return this.CriticalLevelVulCnt;
    }

    /**
     * Set <p>严重风险漏洞数</p>
     * @param CriticalLevelVulCnt <p>严重风险漏洞数</p>
     */
    public void setCriticalLevelVulCnt(Long CriticalLevelVulCnt) {
        this.CriticalLevelVulCnt = CriticalLevelVulCnt;
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
     * Get <p>低危木马数</p> 
     * @return LowLevelVirusCnt <p>低危木马数</p>
     */
    public Long getLowLevelVirusCnt() {
        return this.LowLevelVirusCnt;
    }

    /**
     * Set <p>低危木马数</p>
     * @param LowLevelVirusCnt <p>低危木马数</p>
     */
    public void setLowLevelVirusCnt(Long LowLevelVirusCnt) {
        this.LowLevelVirusCnt = LowLevelVirusCnt;
    }

    /**
     * Get <p>中危木马数</p> 
     * @return MediumLevelVirusCnt <p>中危木马数</p>
     */
    public Long getMediumLevelVirusCnt() {
        return this.MediumLevelVirusCnt;
    }

    /**
     * Set <p>中危木马数</p>
     * @param MediumLevelVirusCnt <p>中危木马数</p>
     */
    public void setMediumLevelVirusCnt(Long MediumLevelVirusCnt) {
        this.MediumLevelVirusCnt = MediumLevelVirusCnt;
    }

    /**
     * Get <p>高危木马数</p> 
     * @return HighLevelVirusCnt <p>高危木马数</p>
     */
    public Long getHighLevelVirusCnt() {
        return this.HighLevelVirusCnt;
    }

    /**
     * Set <p>高危木马数</p>
     * @param HighLevelVirusCnt <p>高危木马数</p>
     */
    public void setHighLevelVirusCnt(Long HighLevelVirusCnt) {
        this.HighLevelVirusCnt = HighLevelVirusCnt;
    }

    /**
     * Get <p>严重木马数</p> 
     * @return CriticalLevelVirusCnt <p>严重木马数</p>
     */
    public Long getCriticalLevelVirusCnt() {
        return this.CriticalLevelVirusCnt;
    }

    /**
     * Set <p>严重木马数</p>
     * @param CriticalLevelVirusCnt <p>严重木马数</p>
     */
    public void setCriticalLevelVirusCnt(Long CriticalLevelVirusCnt) {
        this.CriticalLevelVirusCnt = CriticalLevelVirusCnt;
    }

    /**
     * Get <p>应急漏洞数</p> 
     * @return EmergencyVulCnt <p>应急漏洞数</p>
     */
    public Long getEmergencyVulCnt() {
        return this.EmergencyVulCnt;
    }

    /**
     * Set <p>应急漏洞数</p>
     * @param EmergencyVulCnt <p>应急漏洞数</p>
     */
    public void setEmergencyVulCnt(Long EmergencyVulCnt) {
        this.EmergencyVulCnt = EmergencyVulCnt;
    }

    /**
     * Get <p>低危敏感信息数</p> 
     * @return LowLevelSensitiveCnt <p>低危敏感信息数</p>
     */
    public Long getLowLevelSensitiveCnt() {
        return this.LowLevelSensitiveCnt;
    }

    /**
     * Set <p>低危敏感信息数</p>
     * @param LowLevelSensitiveCnt <p>低危敏感信息数</p>
     */
    public void setLowLevelSensitiveCnt(Long LowLevelSensitiveCnt) {
        this.LowLevelSensitiveCnt = LowLevelSensitiveCnt;
    }

    /**
     * Get <p>中危敏感信息数</p> 
     * @return MediumLevelSensitiveCnt <p>中危敏感信息数</p>
     */
    public Long getMediumLevelSensitiveCnt() {
        return this.MediumLevelSensitiveCnt;
    }

    /**
     * Set <p>中危敏感信息数</p>
     * @param MediumLevelSensitiveCnt <p>中危敏感信息数</p>
     */
    public void setMediumLevelSensitiveCnt(Long MediumLevelSensitiveCnt) {
        this.MediumLevelSensitiveCnt = MediumLevelSensitiveCnt;
    }

    /**
     * Get <p>高危敏感信息数</p> 
     * @return HighLevelSensitiveCnt <p>高危敏感信息数</p>
     */
    public Long getHighLevelSensitiveCnt() {
        return this.HighLevelSensitiveCnt;
    }

    /**
     * Set <p>高危敏感信息数</p>
     * @param HighLevelSensitiveCnt <p>高危敏感信息数</p>
     */
    public void setHighLevelSensitiveCnt(Long HighLevelSensitiveCnt) {
        this.HighLevelSensitiveCnt = HighLevelSensitiveCnt;
    }

    /**
     * Get <p>严重敏感信息数</p> 
     * @return CriticalLevelSensitiveCnt <p>严重敏感信息数</p>
     */
    public Long getCriticalLevelSensitiveCnt() {
        return this.CriticalLevelSensitiveCnt;
    }

    /**
     * Set <p>严重敏感信息数</p>
     * @param CriticalLevelSensitiveCnt <p>严重敏感信息数</p>
     */
    public void setCriticalLevelSensitiveCnt(Long CriticalLevelSensitiveCnt) {
        this.CriticalLevelSensitiveCnt = CriticalLevelSensitiveCnt;
    }

    /**
     * Get <p>风险数</p> 
     * @return RiskCnt <p>风险数</p>
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set <p>风险数</p>
     * @param RiskCnt <p>风险数</p>
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get <p>扫描失败原因</p> 
     * @return ScanFailReason <p>扫描失败原因</p>
     */
    public String getScanFailReason() {
        return this.ScanFailReason;
    }

    /**
     * Set <p>扫描失败原因</p>
     * @param ScanFailReason <p>扫描失败原因</p>
     */
    public void setScanFailReason(String ScanFailReason) {
        this.ScanFailReason = ScanFailReason;
    }

    /**
     * Get <p>扫描失败解决方案</p> 
     * @return ScanSolution <p>扫描失败解决方案</p>
     */
    public String getScanSolution() {
        return this.ScanSolution;
    }

    /**
     * Set <p>扫描失败解决方案</p>
     * @param ScanSolution <p>扫描失败解决方案</p>
     */
    public void setScanSolution(String ScanSolution) {
        this.ScanSolution = ScanSolution;
    }

    /**
     * Get <p>地域信息</p> 
     * @return RegionInfo <p>地域信息</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>地域信息</p>
     * @param RegionInfo <p>地域信息</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>最近扫描任务Id</p> 
     * @return ScanTaskId <p>最近扫描任务Id</p>
     */
    public Long getScanTaskId() {
        return this.ScanTaskId;
    }

    /**
     * Set <p>最近扫描任务Id</p>
     * @param ScanTaskId <p>最近扫描任务Id</p>
     */
    public void setScanTaskId(Long ScanTaskId) {
        this.ScanTaskId = ScanTaskId;
    }

    public ImageAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAssetInfo(ImageAssetInfo source) {
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.SensitiveCnt != null) {
            this.SensitiveCnt = new Long(source.SensitiveCnt);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.LowLevelVulCnt != null) {
            this.LowLevelVulCnt = new Long(source.LowLevelVulCnt);
        }
        if (source.MediumLevelVulCnt != null) {
            this.MediumLevelVulCnt = new Long(source.MediumLevelVulCnt);
        }
        if (source.HighLevelVulCnt != null) {
            this.HighLevelVulCnt = new Long(source.HighLevelVulCnt);
        }
        if (source.CriticalLevelVulCnt != null) {
            this.CriticalLevelVulCnt = new Long(source.CriticalLevelVulCnt);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.LowLevelVirusCnt != null) {
            this.LowLevelVirusCnt = new Long(source.LowLevelVirusCnt);
        }
        if (source.MediumLevelVirusCnt != null) {
            this.MediumLevelVirusCnt = new Long(source.MediumLevelVirusCnt);
        }
        if (source.HighLevelVirusCnt != null) {
            this.HighLevelVirusCnt = new Long(source.HighLevelVirusCnt);
        }
        if (source.CriticalLevelVirusCnt != null) {
            this.CriticalLevelVirusCnt = new Long(source.CriticalLevelVirusCnt);
        }
        if (source.EmergencyVulCnt != null) {
            this.EmergencyVulCnt = new Long(source.EmergencyVulCnt);
        }
        if (source.LowLevelSensitiveCnt != null) {
            this.LowLevelSensitiveCnt = new Long(source.LowLevelSensitiveCnt);
        }
        if (source.MediumLevelSensitiveCnt != null) {
            this.MediumLevelSensitiveCnt = new Long(source.MediumLevelSensitiveCnt);
        }
        if (source.HighLevelSensitiveCnt != null) {
            this.HighLevelSensitiveCnt = new Long(source.HighLevelSensitiveCnt);
        }
        if (source.CriticalLevelSensitiveCnt != null) {
            this.CriticalLevelSensitiveCnt = new Long(source.CriticalLevelSensitiveCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.ScanFailReason != null) {
            this.ScanFailReason = new String(source.ScanFailReason);
        }
        if (source.ScanSolution != null) {
            this.ScanSolution = new String(source.ScanSolution);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.ScanTaskId != null) {
            this.ScanTaskId = new Long(source.ScanTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "SensitiveCnt", this.SensitiveCnt);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "LowLevelVulCnt", this.LowLevelVulCnt);
        this.setParamSimple(map, prefix + "MediumLevelVulCnt", this.MediumLevelVulCnt);
        this.setParamSimple(map, prefix + "HighLevelVulCnt", this.HighLevelVulCnt);
        this.setParamSimple(map, prefix + "CriticalLevelVulCnt", this.CriticalLevelVulCnt);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "LowLevelVirusCnt", this.LowLevelVirusCnt);
        this.setParamSimple(map, prefix + "MediumLevelVirusCnt", this.MediumLevelVirusCnt);
        this.setParamSimple(map, prefix + "HighLevelVirusCnt", this.HighLevelVirusCnt);
        this.setParamSimple(map, prefix + "CriticalLevelVirusCnt", this.CriticalLevelVirusCnt);
        this.setParamSimple(map, prefix + "EmergencyVulCnt", this.EmergencyVulCnt);
        this.setParamSimple(map, prefix + "LowLevelSensitiveCnt", this.LowLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "MediumLevelSensitiveCnt", this.MediumLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "HighLevelSensitiveCnt", this.HighLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "CriticalLevelSensitiveCnt", this.CriticalLevelSensitiveCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "ScanFailReason", this.ScanFailReason);
        this.setParamSimple(map, prefix + "ScanSolution", this.ScanSolution);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "ScanTaskId", this.ScanTaskId);

    }
}

