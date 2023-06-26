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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesAttributeResponse extends AbstractModel{

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

