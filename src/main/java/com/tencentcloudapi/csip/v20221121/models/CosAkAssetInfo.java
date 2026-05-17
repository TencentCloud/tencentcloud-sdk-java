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

public class CosAkAssetInfo extends AbstractModel {

    /**
    * appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * ak id
    */
    @SerializedName("AkId")
    @Expose
    private String AkId;

    /**
    * ak名称
    */
    @SerializedName("AkName")
    @Expose
    private String AkName;

    /**
    * ak备注
    */
    @SerializedName("AkRemark")
    @Expose
    private String AkRemark;

    /**
    * ak所属uin
    */
    @SerializedName("AkOwnerUin")
    @Expose
    private String AkOwnerUin;

    /**
    * ak类型 1 主 2 子
    */
    @SerializedName("AkOwnerType")
    @Expose
    private Long AkOwnerType;

    /**
    * ak所属账号名
    */
    @SerializedName("AkOwnerName")
    @Expose
    private String AkOwnerName;

    /**
    * ak主账号名
    */
    @SerializedName("AkMainOwnerName")
    @Expose
    private String AkMainOwnerName;

    /**
    * ak关联桶集合
    */
    @SerializedName("AkRelBucketSet")
    @Expose
    private String [] AkRelBucketSet;

    /**
    * ak关联告警集合
    */
    @SerializedName("AkRelAlarmSet")
    @Expose
    private CosRiskInfo [] AkRelAlarmSet;

    /**
    * Ak关联ip数
    */
    @SerializedName("AkRelIpCount")
    @Expose
    private Long AkRelIpCount;

    /**
    * ak状态 0 禁用 1 启用
    */
    @SerializedName("AkStatus")
    @Expose
    private Long AkStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private Long CreateTimestamp;

    /**
    * 最后访问时间
    */
    @SerializedName("LastAccessTimestamp")
    @Expose
    private Long LastAccessTimestamp;

    /**
     * Get appid 
     * @return AppId appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
     * @param AppId appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get ak id 
     * @return AkId ak id
     */
    public String getAkId() {
        return this.AkId;
    }

    /**
     * Set ak id
     * @param AkId ak id
     */
    public void setAkId(String AkId) {
        this.AkId = AkId;
    }

    /**
     * Get ak名称 
     * @return AkName ak名称
     */
    public String getAkName() {
        return this.AkName;
    }

    /**
     * Set ak名称
     * @param AkName ak名称
     */
    public void setAkName(String AkName) {
        this.AkName = AkName;
    }

    /**
     * Get ak备注 
     * @return AkRemark ak备注
     */
    public String getAkRemark() {
        return this.AkRemark;
    }

    /**
     * Set ak备注
     * @param AkRemark ak备注
     */
    public void setAkRemark(String AkRemark) {
        this.AkRemark = AkRemark;
    }

    /**
     * Get ak所属uin 
     * @return AkOwnerUin ak所属uin
     */
    public String getAkOwnerUin() {
        return this.AkOwnerUin;
    }

    /**
     * Set ak所属uin
     * @param AkOwnerUin ak所属uin
     */
    public void setAkOwnerUin(String AkOwnerUin) {
        this.AkOwnerUin = AkOwnerUin;
    }

    /**
     * Get ak类型 1 主 2 子 
     * @return AkOwnerType ak类型 1 主 2 子
     */
    public Long getAkOwnerType() {
        return this.AkOwnerType;
    }

    /**
     * Set ak类型 1 主 2 子
     * @param AkOwnerType ak类型 1 主 2 子
     */
    public void setAkOwnerType(Long AkOwnerType) {
        this.AkOwnerType = AkOwnerType;
    }

    /**
     * Get ak所属账号名 
     * @return AkOwnerName ak所属账号名
     */
    public String getAkOwnerName() {
        return this.AkOwnerName;
    }

    /**
     * Set ak所属账号名
     * @param AkOwnerName ak所属账号名
     */
    public void setAkOwnerName(String AkOwnerName) {
        this.AkOwnerName = AkOwnerName;
    }

    /**
     * Get ak主账号名 
     * @return AkMainOwnerName ak主账号名
     */
    public String getAkMainOwnerName() {
        return this.AkMainOwnerName;
    }

    /**
     * Set ak主账号名
     * @param AkMainOwnerName ak主账号名
     */
    public void setAkMainOwnerName(String AkMainOwnerName) {
        this.AkMainOwnerName = AkMainOwnerName;
    }

    /**
     * Get ak关联桶集合 
     * @return AkRelBucketSet ak关联桶集合
     */
    public String [] getAkRelBucketSet() {
        return this.AkRelBucketSet;
    }

    /**
     * Set ak关联桶集合
     * @param AkRelBucketSet ak关联桶集合
     */
    public void setAkRelBucketSet(String [] AkRelBucketSet) {
        this.AkRelBucketSet = AkRelBucketSet;
    }

    /**
     * Get ak关联告警集合 
     * @return AkRelAlarmSet ak关联告警集合
     */
    public CosRiskInfo [] getAkRelAlarmSet() {
        return this.AkRelAlarmSet;
    }

    /**
     * Set ak关联告警集合
     * @param AkRelAlarmSet ak关联告警集合
     */
    public void setAkRelAlarmSet(CosRiskInfo [] AkRelAlarmSet) {
        this.AkRelAlarmSet = AkRelAlarmSet;
    }

    /**
     * Get Ak关联ip数 
     * @return AkRelIpCount Ak关联ip数
     */
    public Long getAkRelIpCount() {
        return this.AkRelIpCount;
    }

    /**
     * Set Ak关联ip数
     * @param AkRelIpCount Ak关联ip数
     */
    public void setAkRelIpCount(Long AkRelIpCount) {
        this.AkRelIpCount = AkRelIpCount;
    }

    /**
     * Get ak状态 0 禁用 1 启用 
     * @return AkStatus ak状态 0 禁用 1 启用
     */
    public Long getAkStatus() {
        return this.AkStatus;
    }

    /**
     * Set ak状态 0 禁用 1 启用
     * @param AkStatus ak状态 0 禁用 1 启用
     */
    public void setAkStatus(Long AkStatus) {
        this.AkStatus = AkStatus;
    }

    /**
     * Get 创建时间 
     * @return CreateTimestamp 创建时间
     */
    public Long getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set 创建时间
     * @param CreateTimestamp 创建时间
     */
    public void setCreateTimestamp(Long CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get 最后访问时间 
     * @return LastAccessTimestamp 最后访问时间
     */
    public Long getLastAccessTimestamp() {
        return this.LastAccessTimestamp;
    }

    /**
     * Set 最后访问时间
     * @param LastAccessTimestamp 最后访问时间
     */
    public void setLastAccessTimestamp(Long LastAccessTimestamp) {
        this.LastAccessTimestamp = LastAccessTimestamp;
    }

    public CosAkAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAkAssetInfo(CosAkAssetInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AkId != null) {
            this.AkId = new String(source.AkId);
        }
        if (source.AkName != null) {
            this.AkName = new String(source.AkName);
        }
        if (source.AkRemark != null) {
            this.AkRemark = new String(source.AkRemark);
        }
        if (source.AkOwnerUin != null) {
            this.AkOwnerUin = new String(source.AkOwnerUin);
        }
        if (source.AkOwnerType != null) {
            this.AkOwnerType = new Long(source.AkOwnerType);
        }
        if (source.AkOwnerName != null) {
            this.AkOwnerName = new String(source.AkOwnerName);
        }
        if (source.AkMainOwnerName != null) {
            this.AkMainOwnerName = new String(source.AkMainOwnerName);
        }
        if (source.AkRelBucketSet != null) {
            this.AkRelBucketSet = new String[source.AkRelBucketSet.length];
            for (int i = 0; i < source.AkRelBucketSet.length; i++) {
                this.AkRelBucketSet[i] = new String(source.AkRelBucketSet[i]);
            }
        }
        if (source.AkRelAlarmSet != null) {
            this.AkRelAlarmSet = new CosRiskInfo[source.AkRelAlarmSet.length];
            for (int i = 0; i < source.AkRelAlarmSet.length; i++) {
                this.AkRelAlarmSet[i] = new CosRiskInfo(source.AkRelAlarmSet[i]);
            }
        }
        if (source.AkRelIpCount != null) {
            this.AkRelIpCount = new Long(source.AkRelIpCount);
        }
        if (source.AkStatus != null) {
            this.AkStatus = new Long(source.AkStatus);
        }
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new Long(source.CreateTimestamp);
        }
        if (source.LastAccessTimestamp != null) {
            this.LastAccessTimestamp = new Long(source.LastAccessTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AkId", this.AkId);
        this.setParamSimple(map, prefix + "AkName", this.AkName);
        this.setParamSimple(map, prefix + "AkRemark", this.AkRemark);
        this.setParamSimple(map, prefix + "AkOwnerUin", this.AkOwnerUin);
        this.setParamSimple(map, prefix + "AkOwnerType", this.AkOwnerType);
        this.setParamSimple(map, prefix + "AkOwnerName", this.AkOwnerName);
        this.setParamSimple(map, prefix + "AkMainOwnerName", this.AkMainOwnerName);
        this.setParamArraySimple(map, prefix + "AkRelBucketSet.", this.AkRelBucketSet);
        this.setParamArrayObj(map, prefix + "AkRelAlarmSet.", this.AkRelAlarmSet);
        this.setParamSimple(map, prefix + "AkRelIpCount", this.AkRelIpCount);
        this.setParamSimple(map, prefix + "AkStatus", this.AkStatus);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "LastAccessTimestamp", this.LastAccessTimestamp);

    }
}

