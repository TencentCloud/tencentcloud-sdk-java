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

public class ImageRegistryScanSubTaskInfo extends AbstractModel {

    /**
    * <p>任务子id</p>
    */
    @SerializedName("SubTaskId")
    @Expose
    private Long SubTaskId;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

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
    * <p>任务状态</p><p>枚举值：</p><ul><li>FINISHED： 扫描完成</li><li>SCANNING： 扫描中</li><li>CANCELLED： 已取消</li><li>SCAN_EXCEPTION： 扫描异常</li></ul>
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * <p>解决方案</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>定时任务所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>定时任务所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>定时任务所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>是否最新镜像</p>
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * <p>镜像仓库类型</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
     * Get <p>任务子id</p> 
     * @return SubTaskId <p>任务子id</p>
     */
    public Long getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set <p>任务子id</p>
     * @param SubTaskId <p>任务子id</p>
     */
    public void setSubTaskId(Long SubTaskId) {
        this.SubTaskId = SubTaskId;
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
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>FINISHED： 扫描完成</li><li>SCANNING： 扫描中</li><li>CANCELLED： 已取消</li><li>SCAN_EXCEPTION： 扫描异常</li></ul> 
     * @return ScanStatus <p>任务状态</p><p>枚举值：</p><ul><li>FINISHED： 扫描完成</li><li>SCANNING： 扫描中</li><li>CANCELLED： 已取消</li><li>SCAN_EXCEPTION： 扫描异常</li></ul>
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>FINISHED： 扫描完成</li><li>SCANNING： 扫描中</li><li>CANCELLED： 已取消</li><li>SCAN_EXCEPTION： 扫描异常</li></ul>
     * @param ScanStatus <p>任务状态</p><p>枚举值：</p><ul><li>FINISHED： 扫描完成</li><li>SCANNING： 扫描中</li><li>CANCELLED： 已取消</li><li>SCAN_EXCEPTION： 扫描异常</li></ul>
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get <p>失败原因</p> 
     * @return FailedReason <p>失败原因</p>
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set <p>失败原因</p>
     * @param FailedReason <p>失败原因</p>
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get <p>解决方案</p> 
     * @return Solution <p>解决方案</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>解决方案</p>
     * @param Solution <p>解决方案</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>定时任务所属账号名</p> 
     * @return OwnerAccountName <p>定时任务所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>定时任务所属账号名</p>
     * @param OwnerAccountName <p>定时任务所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>定时任务所属账号uin</p> 
     * @return OwnerUin <p>定时任务所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>定时任务所属账号uin</p>
     * @param OwnerUin <p>定时任务所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>定时任务所属账号appid</p> 
     * @return OwnerAppId <p>定时任务所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>定时任务所属账号appid</p>
     * @param OwnerAppId <p>定时任务所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>是否最新镜像</p> 
     * @return IsLatestImage <p>是否最新镜像</p>
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set <p>是否最新镜像</p>
     * @param IsLatestImage <p>是否最新镜像</p>
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return ImageRepoAddress <p>镜像地址</p>
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set <p>镜像地址</p>
     * @param ImageRepoAddress <p>镜像地址</p>
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
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

    public ImageRegistryScanSubTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryScanSubTaskInfo(ImageRegistryScanSubTaskInfo source) {
        if (source.SubTaskId != null) {
            this.SubTaskId = new Long(source.SubTaskId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
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
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);

    }
}

