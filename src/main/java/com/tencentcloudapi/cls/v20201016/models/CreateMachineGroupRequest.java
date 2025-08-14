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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMachineGroupRequest extends AbstractModel {

    /**
    * 机器组名字。
输入限制：
- 最大支持255个字符，不能为空字符串
- 不能包含字符'|'
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 创建机器组类型。取值如下：
- Type：ip，Values中为ip字符串列表创建机器组
- Type：label，Values中为标签字符串列表创建机器组
    */
    @SerializedName("MachineGroupType")
    @Expose
    private MachineGroupTypeInfo MachineGroupType;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的机器组。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否开启机器组自动更新。默认false
    */
    @SerializedName("AutoUpdate")
    @Expose
    private Boolean AutoUpdate;

    /**
    * 升级开始时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
    */
    @SerializedName("UpdateStartTime")
    @Expose
    private String UpdateStartTime;

    /**
    * 升级结束时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
    */
    @SerializedName("UpdateEndTime")
    @Expose
    private String UpdateEndTime;

    /**
    * 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费。默认false
    */
    @SerializedName("ServiceLogging")
    @Expose
    private Boolean ServiceLogging;

    /**
    * 机器组中机器离线清理时间。单位：天

- 大于0时生效。
    */
    @SerializedName("DelayCleanupTime")
    @Expose
    private Long DelayCleanupTime;

    /**
    * 机器组元数据信息列表
    */
    @SerializedName("MetaTags")
    @Expose
    private MetaTagInfo [] MetaTags;

    /**
    * 系统类型，取值如下：
- 0：Linux （默认值）
- 1：Windows
    */
    @SerializedName("OSType")
    @Expose
    private Long OSType;

    /**
     * Get 机器组名字。
输入限制：
- 最大支持255个字符，不能为空字符串
- 不能包含字符'|' 
     * @return GroupName 机器组名字。
输入限制：
- 最大支持255个字符，不能为空字符串
- 不能包含字符'|'
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 机器组名字。
输入限制：
- 最大支持255个字符，不能为空字符串
- 不能包含字符'|'
     * @param GroupName 机器组名字。
输入限制：
- 最大支持255个字符，不能为空字符串
- 不能包含字符'|'
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 创建机器组类型。取值如下：
- Type：ip，Values中为ip字符串列表创建机器组
- Type：label，Values中为标签字符串列表创建机器组 
     * @return MachineGroupType 创建机器组类型。取值如下：
- Type：ip，Values中为ip字符串列表创建机器组
- Type：label，Values中为标签字符串列表创建机器组
     */
    public MachineGroupTypeInfo getMachineGroupType() {
        return this.MachineGroupType;
    }

    /**
     * Set 创建机器组类型。取值如下：
- Type：ip，Values中为ip字符串列表创建机器组
- Type：label，Values中为标签字符串列表创建机器组
     * @param MachineGroupType 创建机器组类型。取值如下：
- Type：ip，Values中为ip字符串列表创建机器组
- Type：label，Values中为标签字符串列表创建机器组
     */
    public void setMachineGroupType(MachineGroupTypeInfo MachineGroupType) {
        this.MachineGroupType = MachineGroupType;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的机器组。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的机器组。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的机器组。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的机器组。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启机器组自动更新。默认false 
     * @return AutoUpdate 是否开启机器组自动更新。默认false
     */
    public Boolean getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set 是否开启机器组自动更新。默认false
     * @param AutoUpdate 是否开启机器组自动更新。默认false
     */
    public void setAutoUpdate(Boolean AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get 升级开始时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss 
     * @return UpdateStartTime 升级开始时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
     */
    public String getUpdateStartTime() {
        return this.UpdateStartTime;
    }

    /**
     * Set 升级开始时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
     * @param UpdateStartTime 升级开始时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
     */
    public void setUpdateStartTime(String UpdateStartTime) {
        this.UpdateStartTime = UpdateStartTime;
    }

    /**
     * Get 升级结束时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss 
     * @return UpdateEndTime 升级结束时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
     */
    public String getUpdateEndTime() {
        return this.UpdateEndTime;
    }

    /**
     * Set 升级结束时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
     * @param UpdateEndTime 升级结束时间，建议业务低峰期升级LogListener
时间格式：HH:mm:ss
     */
    public void setUpdateEndTime(String UpdateEndTime) {
        this.UpdateEndTime = UpdateEndTime;
    }

    /**
     * Get 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费。默认false 
     * @return ServiceLogging 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费。默认false
     */
    public Boolean getServiceLogging() {
        return this.ServiceLogging;
    }

    /**
     * Set 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费。默认false
     * @param ServiceLogging 是否开启服务日志，用于记录因Loglistener 服务自身产生的log，开启后，会创建内部日志集cls_service_logging和日志主题loglistener_status,loglistener_alarm,loglistener_business，不产生计费。默认false
     */
    public void setServiceLogging(Boolean ServiceLogging) {
        this.ServiceLogging = ServiceLogging;
    }

    /**
     * Get 机器组中机器离线清理时间。单位：天

- 大于0时生效。 
     * @return DelayCleanupTime 机器组中机器离线清理时间。单位：天

- 大于0时生效。
     */
    public Long getDelayCleanupTime() {
        return this.DelayCleanupTime;
    }

    /**
     * Set 机器组中机器离线清理时间。单位：天

- 大于0时生效。
     * @param DelayCleanupTime 机器组中机器离线清理时间。单位：天

- 大于0时生效。
     */
    public void setDelayCleanupTime(Long DelayCleanupTime) {
        this.DelayCleanupTime = DelayCleanupTime;
    }

    /**
     * Get 机器组元数据信息列表 
     * @return MetaTags 机器组元数据信息列表
     */
    public MetaTagInfo [] getMetaTags() {
        return this.MetaTags;
    }

    /**
     * Set 机器组元数据信息列表
     * @param MetaTags 机器组元数据信息列表
     */
    public void setMetaTags(MetaTagInfo [] MetaTags) {
        this.MetaTags = MetaTags;
    }

    /**
     * Get 系统类型，取值如下：
- 0：Linux （默认值）
- 1：Windows 
     * @return OSType 系统类型，取值如下：
- 0：Linux （默认值）
- 1：Windows
     */
    public Long getOSType() {
        return this.OSType;
    }

    /**
     * Set 系统类型，取值如下：
- 0：Linux （默认值）
- 1：Windows
     * @param OSType 系统类型，取值如下：
- 0：Linux （默认值）
- 1：Windows
     */
    public void setOSType(Long OSType) {
        this.OSType = OSType;
    }

    public CreateMachineGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMachineGroupRequest(CreateMachineGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.MachineGroupType != null) {
            this.MachineGroupType = new MachineGroupTypeInfo(source.MachineGroupType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new Boolean(source.AutoUpdate);
        }
        if (source.UpdateStartTime != null) {
            this.UpdateStartTime = new String(source.UpdateStartTime);
        }
        if (source.UpdateEndTime != null) {
            this.UpdateEndTime = new String(source.UpdateEndTime);
        }
        if (source.ServiceLogging != null) {
            this.ServiceLogging = new Boolean(source.ServiceLogging);
        }
        if (source.DelayCleanupTime != null) {
            this.DelayCleanupTime = new Long(source.DelayCleanupTime);
        }
        if (source.MetaTags != null) {
            this.MetaTags = new MetaTagInfo[source.MetaTags.length];
            for (int i = 0; i < source.MetaTags.length; i++) {
                this.MetaTags[i] = new MetaTagInfo(source.MetaTags[i]);
            }
        }
        if (source.OSType != null) {
            this.OSType = new Long(source.OSType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamObj(map, prefix + "MachineGroupType.", this.MachineGroupType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "UpdateStartTime", this.UpdateStartTime);
        this.setParamSimple(map, prefix + "UpdateEndTime", this.UpdateEndTime);
        this.setParamSimple(map, prefix + "ServiceLogging", this.ServiceLogging);
        this.setParamSimple(map, prefix + "DelayCleanupTime", this.DelayCleanupTime);
        this.setParamArrayObj(map, prefix + "MetaTags.", this.MetaTags);
        this.setParamSimple(map, prefix + "OSType", this.OSType);

    }
}

