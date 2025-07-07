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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesAttributeResponse extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 定期备份状态 enable-开启，disable-关闭
    */
    @SerializedName("RegularBackupEnable")
    @Expose
    private String RegularBackupEnable;

    /**
    * 定期备份保留天数 [90 - 3650]天
    */
    @SerializedName("RegularBackupSaveDays")
    @Expose
    private Long RegularBackupSaveDays;

    /**
    * 定期备份策略 years-每年，quarters-每季度，months-每月
    */
    @SerializedName("RegularBackupStrategy")
    @Expose
    private String RegularBackupStrategy;

    /**
    * 定期备份保留个数
    */
    @SerializedName("RegularBackupCounts")
    @Expose
    private Long RegularBackupCounts;

    /**
    * 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
    */
    @SerializedName("RegularBackupStartTime")
    @Expose
    private String RegularBackupStartTime;

    /**
    * 阻塞进程阈值，单位毫秒
    */
    @SerializedName("BlockedThreshold")
    @Expose
    private Long BlockedThreshold;

    /**
    * 慢SQL、阻塞、死锁扩展事件文件保留时长
    */
    @SerializedName("EventSaveDays")
    @Expose
    private Long EventSaveDays;

    /**
    * TDE透明数据加密配置
    */
    @SerializedName("TDEConfig")
    @Expose
    private TDEConfigAttribute TDEConfig;

    /**
    * SSL加密
    */
    @SerializedName("SSLConfig")
    @Expose
    private SSLConfig SSLConfig;

    /**
    * 双节点备机只读信息
    */
    @SerializedName("DrReadableInfo")
    @Expose
    private DrReadableInfo DrReadableInfo;

    /**
    * 等待回收的IP列表
    */
    @SerializedName("OldVipList")
    @Expose
    private OldVip [] OldVipList;

    /**
    * 操作日志采集状态，enable-采集中，disable-不可用，renew_doing-配置开启或关闭中
    */
    @SerializedName("XEventStatus")
    @Expose
    private String XEventStatus;

    /**
    * 多节点备机只读信息
    */
    @SerializedName("MultiDrReadableInfo")
    @Expose
    private DrReadableInfo [] MultiDrReadableInfo;

    /**
    * 是否开启磁盘加密，1-开启，0-未开启
    */
    @SerializedName("IsDiskEncryptFlag")
    @Expose
    private Long IsDiskEncryptFlag;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 定期备份状态 enable-开启，disable-关闭 
     * @return RegularBackupEnable 定期备份状态 enable-开启，disable-关闭
     */
    public String getRegularBackupEnable() {
        return this.RegularBackupEnable;
    }

    /**
     * Set 定期备份状态 enable-开启，disable-关闭
     * @param RegularBackupEnable 定期备份状态 enable-开启，disable-关闭
     */
    public void setRegularBackupEnable(String RegularBackupEnable) {
        this.RegularBackupEnable = RegularBackupEnable;
    }

    /**
     * Get 定期备份保留天数 [90 - 3650]天 
     * @return RegularBackupSaveDays 定期备份保留天数 [90 - 3650]天
     */
    public Long getRegularBackupSaveDays() {
        return this.RegularBackupSaveDays;
    }

    /**
     * Set 定期备份保留天数 [90 - 3650]天
     * @param RegularBackupSaveDays 定期备份保留天数 [90 - 3650]天
     */
    public void setRegularBackupSaveDays(Long RegularBackupSaveDays) {
        this.RegularBackupSaveDays = RegularBackupSaveDays;
    }

    /**
     * Get 定期备份策略 years-每年，quarters-每季度，months-每月 
     * @return RegularBackupStrategy 定期备份策略 years-每年，quarters-每季度，months-每月
     */
    public String getRegularBackupStrategy() {
        return this.RegularBackupStrategy;
    }

    /**
     * Set 定期备份策略 years-每年，quarters-每季度，months-每月
     * @param RegularBackupStrategy 定期备份策略 years-每年，quarters-每季度，months-每月
     */
    public void setRegularBackupStrategy(String RegularBackupStrategy) {
        this.RegularBackupStrategy = RegularBackupStrategy;
    }

    /**
     * Get 定期备份保留个数 
     * @return RegularBackupCounts 定期备份保留个数
     */
    public Long getRegularBackupCounts() {
        return this.RegularBackupCounts;
    }

    /**
     * Set 定期备份保留个数
     * @param RegularBackupCounts 定期备份保留个数
     */
    public void setRegularBackupCounts(Long RegularBackupCounts) {
        this.RegularBackupCounts = RegularBackupCounts;
    }

    /**
     * Get 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期 
     * @return RegularBackupStartTime 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     */
    public String getRegularBackupStartTime() {
        return this.RegularBackupStartTime;
    }

    /**
     * Set 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     * @param RegularBackupStartTime 定期备份开始日期，格式-YYYY-MM-DD 默认当前日期
     */
    public void setRegularBackupStartTime(String RegularBackupStartTime) {
        this.RegularBackupStartTime = RegularBackupStartTime;
    }

    /**
     * Get 阻塞进程阈值，单位毫秒 
     * @return BlockedThreshold 阻塞进程阈值，单位毫秒
     */
    public Long getBlockedThreshold() {
        return this.BlockedThreshold;
    }

    /**
     * Set 阻塞进程阈值，单位毫秒
     * @param BlockedThreshold 阻塞进程阈值，单位毫秒
     */
    public void setBlockedThreshold(Long BlockedThreshold) {
        this.BlockedThreshold = BlockedThreshold;
    }

    /**
     * Get 慢SQL、阻塞、死锁扩展事件文件保留时长 
     * @return EventSaveDays 慢SQL、阻塞、死锁扩展事件文件保留时长
     */
    public Long getEventSaveDays() {
        return this.EventSaveDays;
    }

    /**
     * Set 慢SQL、阻塞、死锁扩展事件文件保留时长
     * @param EventSaveDays 慢SQL、阻塞、死锁扩展事件文件保留时长
     */
    public void setEventSaveDays(Long EventSaveDays) {
        this.EventSaveDays = EventSaveDays;
    }

    /**
     * Get TDE透明数据加密配置 
     * @return TDEConfig TDE透明数据加密配置
     */
    public TDEConfigAttribute getTDEConfig() {
        return this.TDEConfig;
    }

    /**
     * Set TDE透明数据加密配置
     * @param TDEConfig TDE透明数据加密配置
     */
    public void setTDEConfig(TDEConfigAttribute TDEConfig) {
        this.TDEConfig = TDEConfig;
    }

    /**
     * Get SSL加密 
     * @return SSLConfig SSL加密
     */
    public SSLConfig getSSLConfig() {
        return this.SSLConfig;
    }

    /**
     * Set SSL加密
     * @param SSLConfig SSL加密
     */
    public void setSSLConfig(SSLConfig SSLConfig) {
        this.SSLConfig = SSLConfig;
    }

    /**
     * Get 双节点备机只读信息 
     * @return DrReadableInfo 双节点备机只读信息
     */
    public DrReadableInfo getDrReadableInfo() {
        return this.DrReadableInfo;
    }

    /**
     * Set 双节点备机只读信息
     * @param DrReadableInfo 双节点备机只读信息
     */
    public void setDrReadableInfo(DrReadableInfo DrReadableInfo) {
        this.DrReadableInfo = DrReadableInfo;
    }

    /**
     * Get 等待回收的IP列表 
     * @return OldVipList 等待回收的IP列表
     */
    public OldVip [] getOldVipList() {
        return this.OldVipList;
    }

    /**
     * Set 等待回收的IP列表
     * @param OldVipList 等待回收的IP列表
     */
    public void setOldVipList(OldVip [] OldVipList) {
        this.OldVipList = OldVipList;
    }

    /**
     * Get 操作日志采集状态，enable-采集中，disable-不可用，renew_doing-配置开启或关闭中 
     * @return XEventStatus 操作日志采集状态，enable-采集中，disable-不可用，renew_doing-配置开启或关闭中
     */
    public String getXEventStatus() {
        return this.XEventStatus;
    }

    /**
     * Set 操作日志采集状态，enable-采集中，disable-不可用，renew_doing-配置开启或关闭中
     * @param XEventStatus 操作日志采集状态，enable-采集中，disable-不可用，renew_doing-配置开启或关闭中
     */
    public void setXEventStatus(String XEventStatus) {
        this.XEventStatus = XEventStatus;
    }

    /**
     * Get 多节点备机只读信息 
     * @return MultiDrReadableInfo 多节点备机只读信息
     */
    public DrReadableInfo [] getMultiDrReadableInfo() {
        return this.MultiDrReadableInfo;
    }

    /**
     * Set 多节点备机只读信息
     * @param MultiDrReadableInfo 多节点备机只读信息
     */
    public void setMultiDrReadableInfo(DrReadableInfo [] MultiDrReadableInfo) {
        this.MultiDrReadableInfo = MultiDrReadableInfo;
    }

    /**
     * Get 是否开启磁盘加密，1-开启，0-未开启 
     * @return IsDiskEncryptFlag 是否开启磁盘加密，1-开启，0-未开启
     */
    public Long getIsDiskEncryptFlag() {
        return this.IsDiskEncryptFlag;
    }

    /**
     * Set 是否开启磁盘加密，1-开启，0-未开启
     * @param IsDiskEncryptFlag 是否开启磁盘加密，1-开启，0-未开启
     */
    public void setIsDiskEncryptFlag(Long IsDiskEncryptFlag) {
        this.IsDiskEncryptFlag = IsDiskEncryptFlag;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstancesAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesAttributeResponse(DescribeDBInstancesAttributeResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RegularBackupEnable != null) {
            this.RegularBackupEnable = new String(source.RegularBackupEnable);
        }
        if (source.RegularBackupSaveDays != null) {
            this.RegularBackupSaveDays = new Long(source.RegularBackupSaveDays);
        }
        if (source.RegularBackupStrategy != null) {
            this.RegularBackupStrategy = new String(source.RegularBackupStrategy);
        }
        if (source.RegularBackupCounts != null) {
            this.RegularBackupCounts = new Long(source.RegularBackupCounts);
        }
        if (source.RegularBackupStartTime != null) {
            this.RegularBackupStartTime = new String(source.RegularBackupStartTime);
        }
        if (source.BlockedThreshold != null) {
            this.BlockedThreshold = new Long(source.BlockedThreshold);
        }
        if (source.EventSaveDays != null) {
            this.EventSaveDays = new Long(source.EventSaveDays);
        }
        if (source.TDEConfig != null) {
            this.TDEConfig = new TDEConfigAttribute(source.TDEConfig);
        }
        if (source.SSLConfig != null) {
            this.SSLConfig = new SSLConfig(source.SSLConfig);
        }
        if (source.DrReadableInfo != null) {
            this.DrReadableInfo = new DrReadableInfo(source.DrReadableInfo);
        }
        if (source.OldVipList != null) {
            this.OldVipList = new OldVip[source.OldVipList.length];
            for (int i = 0; i < source.OldVipList.length; i++) {
                this.OldVipList[i] = new OldVip(source.OldVipList[i]);
            }
        }
        if (source.XEventStatus != null) {
            this.XEventStatus = new String(source.XEventStatus);
        }
        if (source.MultiDrReadableInfo != null) {
            this.MultiDrReadableInfo = new DrReadableInfo[source.MultiDrReadableInfo.length];
            for (int i = 0; i < source.MultiDrReadableInfo.length; i++) {
                this.MultiDrReadableInfo[i] = new DrReadableInfo(source.MultiDrReadableInfo[i]);
            }
        }
        if (source.IsDiskEncryptFlag != null) {
            this.IsDiskEncryptFlag = new Long(source.IsDiskEncryptFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RegularBackupEnable", this.RegularBackupEnable);
        this.setParamSimple(map, prefix + "RegularBackupSaveDays", this.RegularBackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupStrategy", this.RegularBackupStrategy);
        this.setParamSimple(map, prefix + "RegularBackupCounts", this.RegularBackupCounts);
        this.setParamSimple(map, prefix + "RegularBackupStartTime", this.RegularBackupStartTime);
        this.setParamSimple(map, prefix + "BlockedThreshold", this.BlockedThreshold);
        this.setParamSimple(map, prefix + "EventSaveDays", this.EventSaveDays);
        this.setParamObj(map, prefix + "TDEConfig.", this.TDEConfig);
        this.setParamObj(map, prefix + "SSLConfig.", this.SSLConfig);
        this.setParamObj(map, prefix + "DrReadableInfo.", this.DrReadableInfo);
        this.setParamArrayObj(map, prefix + "OldVipList.", this.OldVipList);
        this.setParamSimple(map, prefix + "XEventStatus", this.XEventStatus);
        this.setParamArrayObj(map, prefix + "MultiDrReadableInfo.", this.MultiDrReadableInfo);
        this.setParamSimple(map, prefix + "IsDiskEncryptFlag", this.IsDiskEncryptFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

