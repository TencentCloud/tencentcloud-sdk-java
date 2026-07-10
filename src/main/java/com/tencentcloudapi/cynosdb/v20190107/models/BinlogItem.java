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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogItem extends AbstractModel {

    /**
    * <p>Binlog文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件大小，单位：字节</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>事务最早时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>事务最晚时间</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Binlog文件ID</p>
    */
    @SerializedName("BinlogId")
    @Expose
    private Long BinlogId;

    /**
    * <p>binlog所跨地域</p>
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * <p>备份投递状态</p>
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * <p>保险箱信息</p>
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * <p>加密秘钥key</p>
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * <p>加密秘钥地域</p>
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
    * <p>备份的地域分布信息</p>
    */
    @SerializedName("ExistRegions")
    @Expose
    private BinlogRegionInfo [] ExistRegions;

    /**
     * Get <p>Binlog文件名称</p> 
     * @return FileName <p>Binlog文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Binlog文件名称</p>
     * @param FileName <p>Binlog文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件大小，单位：字节</p> 
     * @return FileSize <p>文件大小，单位：字节</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>文件大小，单位：字节</p>
     * @param FileSize <p>文件大小，单位：字节</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>事务最早时间</p> 
     * @return StartTime <p>事务最早时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>事务最早时间</p>
     * @param StartTime <p>事务最早时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>事务最晚时间</p> 
     * @return FinishTime <p>事务最晚时间</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>事务最晚时间</p>
     * @param FinishTime <p>事务最晚时间</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Binlog文件ID</p> 
     * @return BinlogId <p>Binlog文件ID</p>
     */
    public Long getBinlogId() {
        return this.BinlogId;
    }

    /**
     * Set <p>Binlog文件ID</p>
     * @param BinlogId <p>Binlog文件ID</p>
     */
    public void setBinlogId(Long BinlogId) {
        this.BinlogId = BinlogId;
    }

    /**
     * Get <p>binlog所跨地域</p> 
     * @return CrossRegions <p>binlog所跨地域</p>
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set <p>binlog所跨地域</p>
     * @param CrossRegions <p>binlog所跨地域</p>
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get <p>备份投递状态</p> 
     * @return CopyStatus <p>备份投递状态</p>
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set <p>备份投递状态</p>
     * @param CopyStatus <p>备份投递状态</p>
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get <p>保险箱信息</p> 
     * @return VaultInfos <p>保险箱信息</p>
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set <p>保险箱信息</p>
     * @param VaultInfos <p>保险箱信息</p>
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get <p>加密秘钥key</p> 
     * @return EncryptKeyId <p>加密秘钥key</p>
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set <p>加密秘钥key</p>
     * @param EncryptKeyId <p>加密秘钥key</p>
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get <p>加密秘钥地域</p> 
     * @return EncryptRegion <p>加密秘钥地域</p>
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set <p>加密秘钥地域</p>
     * @param EncryptRegion <p>加密秘钥地域</p>
     */
    public void setEncryptRegion(String EncryptRegion) {
        this.EncryptRegion = EncryptRegion;
    }

    /**
     * Get <p>备份的地域分布信息</p> 
     * @return ExistRegions <p>备份的地域分布信息</p>
     */
    public BinlogRegionInfo [] getExistRegions() {
        return this.ExistRegions;
    }

    /**
     * Set <p>备份的地域分布信息</p>
     * @param ExistRegions <p>备份的地域分布信息</p>
     */
    public void setExistRegions(BinlogRegionInfo [] ExistRegions) {
        this.ExistRegions = ExistRegions;
    }

    public BinlogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogItem(BinlogItem source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.BinlogId != null) {
            this.BinlogId = new Long(source.BinlogId);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.CopyStatus != null) {
            this.CopyStatus = new String(source.CopyStatus);
        }
        if (source.VaultInfos != null) {
            this.VaultInfos = new VaultInfo[source.VaultInfos.length];
            for (int i = 0; i < source.VaultInfos.length; i++) {
                this.VaultInfos[i] = new VaultInfo(source.VaultInfos[i]);
            }
        }
        if (source.EncryptKeyId != null) {
            this.EncryptKeyId = new String(source.EncryptKeyId);
        }
        if (source.EncryptRegion != null) {
            this.EncryptRegion = new String(source.EncryptRegion);
        }
        if (source.ExistRegions != null) {
            this.ExistRegions = new BinlogRegionInfo[source.ExistRegions.length];
            for (int i = 0; i < source.ExistRegions.length; i++) {
                this.ExistRegions[i] = new BinlogRegionInfo(source.ExistRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "BinlogId", this.BinlogId);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "CopyStatus", this.CopyStatus);
        this.setParamArrayObj(map, prefix + "VaultInfos.", this.VaultInfos);
        this.setParamSimple(map, prefix + "EncryptKeyId", this.EncryptKeyId);
        this.setParamSimple(map, prefix + "EncryptRegion", this.EncryptRegion);
        this.setParamArrayObj(map, prefix + "ExistRegions.", this.ExistRegions);

    }
}

