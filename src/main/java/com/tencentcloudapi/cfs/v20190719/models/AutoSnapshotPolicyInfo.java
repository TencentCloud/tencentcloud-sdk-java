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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSnapshotPolicyInfo extends AbstractModel{

    /**
    * 快照策略ID
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 快照策略ID
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 快照策略创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 关联的文件系统个数
    */
    @SerializedName("FileSystemNums")
    @Expose
    private Long FileSystemNums;

    /**
    * 快照定期备份在一星期哪一天
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * 快照定期备份在一天的哪一小时
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * 是否激活定期快照功能
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

    /**
    * 下一次触发快照时间
    */
    @SerializedName("NextActiveTime")
    @Expose
    private String NextActiveTime;

    /**
    * 快照策略状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 帐号ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 保留时间
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * 地域
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 文件系统信息
    */
    @SerializedName("FileSystems")
    @Expose
    private FileSystemByPolicy [] FileSystems;

    /**
     * Get 快照策略ID 
     * @return AutoSnapshotPolicyId 快照策略ID
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 快照策略ID
     * @param AutoSnapshotPolicyId 快照策略ID
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get 快照策略ID 
     * @return PolicyName 快照策略ID
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 快照策略ID
     * @param PolicyName 快照策略ID
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 快照策略创建时间 
     * @return CreationTime 快照策略创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 快照策略创建时间
     * @param CreationTime 快照策略创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 关联的文件系统个数 
     * @return FileSystemNums 关联的文件系统个数
     */
    public Long getFileSystemNums() {
        return this.FileSystemNums;
    }

    /**
     * Set 关联的文件系统个数
     * @param FileSystemNums 关联的文件系统个数
     */
    public void setFileSystemNums(Long FileSystemNums) {
        this.FileSystemNums = FileSystemNums;
    }

    /**
     * Get 快照定期备份在一星期哪一天 
     * @return DayOfWeek 快照定期备份在一星期哪一天
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 快照定期备份在一星期哪一天
     * @param DayOfWeek 快照定期备份在一星期哪一天
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get 快照定期备份在一天的哪一小时 
     * @return Hour 快照定期备份在一天的哪一小时
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set 快照定期备份在一天的哪一小时
     * @param Hour 快照定期备份在一天的哪一小时
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get 是否激活定期快照功能 
     * @return IsActivated 是否激活定期快照功能
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 是否激活定期快照功能
     * @param IsActivated 是否激活定期快照功能
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 下一次触发快照时间 
     * @return NextActiveTime 下一次触发快照时间
     */
    public String getNextActiveTime() {
        return this.NextActiveTime;
    }

    /**
     * Set 下一次触发快照时间
     * @param NextActiveTime 下一次触发快照时间
     */
    public void setNextActiveTime(String NextActiveTime) {
        this.NextActiveTime = NextActiveTime;
    }

    /**
     * Get 快照策略状态 
     * @return Status 快照策略状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 快照策略状态
     * @param Status 快照策略状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 帐号ID 
     * @return AppId 帐号ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 帐号ID
     * @param AppId 帐号ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 保留时间 
     * @return AliveDays 保留时间
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set 保留时间
     * @param AliveDays 保留时间
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get 地域 
     * @return RegionName 地域
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域
     * @param RegionName 地域
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 文件系统信息 
     * @return FileSystems 文件系统信息
     */
    public FileSystemByPolicy [] getFileSystems() {
        return this.FileSystems;
    }

    /**
     * Set 文件系统信息
     * @param FileSystems 文件系统信息
     */
    public void setFileSystems(FileSystemByPolicy [] FileSystems) {
        this.FileSystems = FileSystems;
    }

    public AutoSnapshotPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSnapshotPolicyInfo(AutoSnapshotPolicyInfo source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.FileSystemNums != null) {
            this.FileSystemNums = new Long(source.FileSystemNums);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Long(source.IsActivated);
        }
        if (source.NextActiveTime != null) {
            this.NextActiveTime = new String(source.NextActiveTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.FileSystems != null) {
            this.FileSystems = new FileSystemByPolicy[source.FileSystems.length];
            for (int i = 0; i < source.FileSystems.length; i++) {
                this.FileSystems[i] = new FileSystemByPolicy(source.FileSystems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "FileSystemNums", this.FileSystemNums);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "NextActiveTime", this.NextActiveTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "FileSystems.", this.FileSystems);

    }
}

