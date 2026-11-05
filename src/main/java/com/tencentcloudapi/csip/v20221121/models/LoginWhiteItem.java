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

public class LoginWhiteItem extends AbstractModel {

    /**
    * <p>白名单类型：Custom-自定义白名单 Learn-自学习白名单</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>规则所属账号 AppId，多账号场景下用于区分与后续编辑定位</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>登录源IP（逗号分隔）；自学习白名单恒为空</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>登录用户名（逗号分隔）；自学习白名单恒为空</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>登录时段起始 HH:MM；自学习白名单恒为空</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>登录时段结束 HH:MM；自学习白名单恒为空</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>常用登录地列表</p>
    */
    @SerializedName("Places")
    @Expose
    private LoginWhitePlace [] Places;

    /**
    * <p>常用登录地展示文案（逗号分隔），供列表直接展示</p>
    */
    @SerializedName("Locations")
    @Expose
    private String Locations;

    /**
    * <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>生效主机 QUUID 列表（与 InstanceIDs 一一对应）</p>
    */
    @SerializedName("QUUIDS")
    @Expose
    private String [] QUUIDS;

    /**
    * <p>生效主机实例ID列表（与 QUUIDS 一一对应）</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>剔除主机 QUUID 列表</p>
    */
    @SerializedName("ExcludeQUUIDS")
    @Expose
    private String [] ExcludeQUUIDS;

    /**
    * <p>剔除主机实例ID列表</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
    * <p>生效标签详情列表</p>
    */
    @SerializedName("TagItems")
    @Expose
    private EDRRuleTagItem [] TagItems;

    /**
    * <p>主机数：自定义为指定主机数（Scope=1 时为 0，前端展示全部主机）；自学习为组内去重主机数</p>
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>创建时间，格式 2006-01-02 15:04:05</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近修改时间，格式 2006-01-02 15:04:05</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get <p>白名单类型：Custom-自定义白名单 Learn-自学习白名单</p> 
     * @return Type <p>白名单类型：Custom-自定义白名单 Learn-自学习白名单</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>白名单类型：Custom-自定义白名单 Learn-自学习白名单</p>
     * @param Type <p>白名单类型：Custom-自定义白名单 Learn-自学习白名单</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>规则所属账号 AppId，多账号场景下用于区分与后续编辑定位</p> 
     * @return AppId <p>规则所属账号 AppId，多账号场景下用于区分与后续编辑定位</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>规则所属账号 AppId，多账号场景下用于区分与后续编辑定位</p>
     * @param AppId <p>规则所属账号 AppId，多账号场景下用于区分与后续编辑定位</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>规则ID；自学习为规则组ID（组内最小行ID）</p> 
     * @return Id <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
     * @param Id <p>规则ID；自学习为规则组ID（组内最小行ID）</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>登录源IP（逗号分隔）；自学习白名单恒为空</p> 
     * @return SrcIp <p>登录源IP（逗号分隔）；自学习白名单恒为空</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>登录源IP（逗号分隔）；自学习白名单恒为空</p>
     * @param SrcIp <p>登录源IP（逗号分隔）；自学习白名单恒为空</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>登录用户名（逗号分隔）；自学习白名单恒为空</p> 
     * @return UserName <p>登录用户名（逗号分隔）；自学习白名单恒为空</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>登录用户名（逗号分隔）；自学习白名单恒为空</p>
     * @param UserName <p>登录用户名（逗号分隔）；自学习白名单恒为空</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>登录时段起始 HH:MM；自学习白名单恒为空</p> 
     * @return StartTime <p>登录时段起始 HH:MM；自学习白名单恒为空</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>登录时段起始 HH:MM；自学习白名单恒为空</p>
     * @param StartTime <p>登录时段起始 HH:MM；自学习白名单恒为空</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>登录时段结束 HH:MM；自学习白名单恒为空</p> 
     * @return EndTime <p>登录时段结束 HH:MM；自学习白名单恒为空</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>登录时段结束 HH:MM；自学习白名单恒为空</p>
     * @param EndTime <p>登录时段结束 HH:MM；自学习白名单恒为空</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>常用登录地列表</p> 
     * @return Places <p>常用登录地列表</p>
     */
    public LoginWhitePlace [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>常用登录地列表</p>
     * @param Places <p>常用登录地列表</p>
     */
    public void setPlaces(LoginWhitePlace [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>常用登录地展示文案（逗号分隔），供列表直接展示</p> 
     * @return Locations <p>常用登录地展示文案（逗号分隔），供列表直接展示</p>
     */
    public String getLocations() {
        return this.Locations;
    }

    /**
     * Set <p>常用登录地展示文案（逗号分隔），供列表直接展示</p>
     * @param Locations <p>常用登录地展示文案（逗号分隔），供列表直接展示</p>
     */
    public void setLocations(String Locations) {
        this.Locations = Locations;
    }

    /**
     * Get <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p> 
     * @return Scope <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
     * @param Scope <p>生效资产范围：0-指定主机（主机或标签命中） 1-全部主机</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>生效主机 QUUID 列表（与 InstanceIDs 一一对应）</p> 
     * @return QUUIDS <p>生效主机 QUUID 列表（与 InstanceIDs 一一对应）</p>
     */
    public String [] getQUUIDS() {
        return this.QUUIDS;
    }

    /**
     * Set <p>生效主机 QUUID 列表（与 InstanceIDs 一一对应）</p>
     * @param QUUIDS <p>生效主机 QUUID 列表（与 InstanceIDs 一一对应）</p>
     */
    public void setQUUIDS(String [] QUUIDS) {
        this.QUUIDS = QUUIDS;
    }

    /**
     * Get <p>生效主机实例ID列表（与 QUUIDS 一一对应）</p> 
     * @return InstanceIDs <p>生效主机实例ID列表（与 QUUIDS 一一对应）</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>生效主机实例ID列表（与 QUUIDS 一一对应）</p>
     * @param InstanceIDs <p>生效主机实例ID列表（与 QUUIDS 一一对应）</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>剔除主机 QUUID 列表</p> 
     * @return ExcludeQUUIDS <p>剔除主机 QUUID 列表</p>
     */
    public String [] getExcludeQUUIDS() {
        return this.ExcludeQUUIDS;
    }

    /**
     * Set <p>剔除主机 QUUID 列表</p>
     * @param ExcludeQUUIDS <p>剔除主机 QUUID 列表</p>
     */
    public void setExcludeQUUIDS(String [] ExcludeQUUIDS) {
        this.ExcludeQUUIDS = ExcludeQUUIDS;
    }

    /**
     * Get <p>剔除主机实例ID列表</p> 
     * @return ExcludeInstanceIDs <p>剔除主机实例ID列表</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>剔除主机实例ID列表</p>
     * @param ExcludeInstanceIDs <p>剔除主机实例ID列表</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
    }

    /**
     * Get <p>生效标签详情列表</p> 
     * @return TagItems <p>生效标签详情列表</p>
     */
    public EDRRuleTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>生效标签详情列表</p>
     * @param TagItems <p>生效标签详情列表</p>
     */
    public void setTagItems(EDRRuleTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>主机数：自定义为指定主机数（Scope=1 时为 0，前端展示全部主机）；自学习为组内去重主机数</p> 
     * @return HostCount <p>主机数：自定义为指定主机数（Scope=1 时为 0，前端展示全部主机）；自学习为组内去重主机数</p>
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set <p>主机数：自定义为指定主机数（Scope=1 时为 0，前端展示全部主机）；自学习为组内去重主机数</p>
     * @param HostCount <p>主机数：自定义为指定主机数（Scope=1 时为 0，前端展示全部主机）；自学习为组内去重主机数</p>
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>创建时间，格式 2006-01-02 15:04:05</p> 
     * @return CreateTime <p>创建时间，格式 2006-01-02 15:04:05</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，格式 2006-01-02 15:04:05</p>
     * @param CreateTime <p>创建时间，格式 2006-01-02 15:04:05</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近修改时间，格式 2006-01-02 15:04:05</p> 
     * @return ModifyTime <p>最近修改时间，格式 2006-01-02 15:04:05</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>最近修改时间，格式 2006-01-02 15:04:05</p>
     * @param ModifyTime <p>最近修改时间，格式 2006-01-02 15:04:05</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public LoginWhiteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteItem(LoginWhiteItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Places != null) {
            this.Places = new LoginWhitePlace[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new LoginWhitePlace(source.Places[i]);
            }
        }
        if (source.Locations != null) {
            this.Locations = new String(source.Locations);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.QUUIDS != null) {
            this.QUUIDS = new String[source.QUUIDS.length];
            for (int i = 0; i < source.QUUIDS.length; i++) {
                this.QUUIDS[i] = new String(source.QUUIDS[i]);
            }
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeQUUIDS != null) {
            this.ExcludeQUUIDS = new String[source.ExcludeQUUIDS.length];
            for (int i = 0; i < source.ExcludeQUUIDS.length; i++) {
                this.ExcludeQUUIDS[i] = new String(source.ExcludeQUUIDS[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
        if (source.TagItems != null) {
            this.TagItems = new EDRRuleTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new EDRRuleTagItem(source.TagItems[i]);
            }
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "Locations", this.Locations);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "QUUIDS.", this.QUUIDS);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeQUUIDS.", this.ExcludeQUUIDS);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

