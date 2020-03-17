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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionData extends AbstractModel{

    /**
    * 产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 固件版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 版本类型 1未发布 2测试发布 3正式发布 4禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PubStatus")
    @Expose
    private Long PubStatus;

    /**
    * 固件版本存储路径URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionUrl")
    @Expose
    private String VersionUrl;

    /**
    * 文件大小，byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件校验码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 指定的允许升级的旧版本，PubStatus=3时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldVersions")
    @Expose
    private String OldVersions;

    /**
    * 指定的允许升级的旧设备id，PubStatus=2时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tids")
    @Expose
    private String Tids;

    /**
    * 灰度值（0-100）,PubStatus=3时有效，表示n%的升级总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrayValue")
    @Expose
    private Long GrayValue;

    /**
    * 最近一次发布时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishTime")
    @Expose
    private Long PublishTime;

    /**
    * 此版本激活的设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveCount")
    @Expose
    private Long ActiveCount;

    /**
    * 此版本在线的设备总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineCount")
    @Expose
    private Long OnlineCount;

    /**
    * 上传固件文件的时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 发布记录的最后变更时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadTime")
    @Expose
    private Long UploadTime;

    /**
    * 该固件版本发布的变更次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTimes")
    @Expose
    private Long ModifyTimes;

    /**
     * Get 产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductId 产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 固件版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtaVersion 固件版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 固件版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtaVersion 固件版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 版本类型 1未发布 2测试发布 3正式发布 4禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PubStatus 版本类型 1未发布 2测试发布 3正式发布 4禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPubStatus() {
        return this.PubStatus;
    }

    /**
     * Set 版本类型 1未发布 2测试发布 3正式发布 4禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param PubStatus 版本类型 1未发布 2测试发布 3正式发布 4禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPubStatus(Long PubStatus) {
        this.PubStatus = PubStatus;
    }

    /**
     * Get 固件版本存储路径URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionUrl 固件版本存储路径URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionUrl() {
        return this.VersionUrl;
    }

    /**
     * Set 固件版本存储路径URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionUrl 固件版本存储路径URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionUrl(String VersionUrl) {
        this.VersionUrl = VersionUrl;
    }

    /**
     * Get 文件大小，byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小，byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小，byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件校验码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5 文件校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 文件校验码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 文件校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 指定的允许升级的旧版本，PubStatus=3时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldVersions 指定的允许升级的旧版本，PubStatus=3时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldVersions() {
        return this.OldVersions;
    }

    /**
     * Set 指定的允许升级的旧版本，PubStatus=3时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldVersions 指定的允许升级的旧版本，PubStatus=3时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldVersions(String OldVersions) {
        this.OldVersions = OldVersions;
    }

    /**
     * Get 指定的允许升级的旧设备id，PubStatus=2时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tids 指定的允许升级的旧设备id，PubStatus=2时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTids() {
        return this.Tids;
    }

    /**
     * Set 指定的允许升级的旧设备id，PubStatus=2时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tids 指定的允许升级的旧设备id，PubStatus=2时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTids(String Tids) {
        this.Tids = Tids;
    }

    /**
     * Get 灰度值（0-100）,PubStatus=3时有效，表示n%的升级总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrayValue 灰度值（0-100）,PubStatus=3时有效，表示n%的升级总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGrayValue() {
        return this.GrayValue;
    }

    /**
     * Set 灰度值（0-100）,PubStatus=3时有效，表示n%的升级总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrayValue 灰度值（0-100）,PubStatus=3时有效，表示n%的升级总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrayValue(Long GrayValue) {
        this.GrayValue = GrayValue;
    }

    /**
     * Get 最近一次发布时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishTime 最近一次发布时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 最近一次发布时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishTime 最近一次发布时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishTime(Long PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 此版本激活的设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveCount 此版本激活的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveCount() {
        return this.ActiveCount;
    }

    /**
     * Set 此版本激活的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveCount 此版本激活的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveCount(Long ActiveCount) {
        this.ActiveCount = ActiveCount;
    }

    /**
     * Get 此版本在线的设备总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineCount 此版本在线的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnlineCount() {
        return this.OnlineCount;
    }

    /**
     * Set 此版本在线的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineCount 此版本在线的设备总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineCount(Long OnlineCount) {
        this.OnlineCount = OnlineCount;
    }

    /**
     * Get 上传固件文件的时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 上传固件文件的时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 上传固件文件的时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 上传固件文件的时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 发布记录的最后变更时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadTime 发布记录的最后变更时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUploadTime() {
        return this.UploadTime;
    }

    /**
     * Set 发布记录的最后变更时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadTime 发布记录的最后变更时间，UNIX时间戳，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadTime(Long UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * Get 该固件版本发布的变更次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTimes 该固件版本发布的变更次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModifyTimes() {
        return this.ModifyTimes;
    }

    /**
     * Set 该固件版本发布的变更次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTimes 该固件版本发布的变更次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTimes(Long ModifyTimes) {
        this.ModifyTimes = ModifyTimes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "PubStatus", this.PubStatus);
        this.setParamSimple(map, prefix + "VersionUrl", this.VersionUrl);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "OldVersions", this.OldVersions);
        this.setParamSimple(map, prefix + "Tids", this.Tids);
        this.setParamSimple(map, prefix + "GrayValue", this.GrayValue);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "ActiveCount", this.ActiveCount);
        this.setParamSimple(map, prefix + "OnlineCount", this.OnlineCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamSimple(map, prefix + "ModifyTimes", this.ModifyTimes);

    }
}

