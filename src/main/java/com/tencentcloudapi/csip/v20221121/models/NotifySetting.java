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

public class NotifySetting extends AbstractModel {

    /**
    * <p>通知模块</p><p>枚举值：</p><ul><li>AkSk： 云API风险治理</li><li>Alert： 告警中心</li><li>Agent： 客户端</li></ul>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>通知设置模式</p><p>枚举值：</p><ul><li>0： 标准模式</li><li>1： 高级模式</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>通知状态</p><p>枚举值：</p><ul><li>0： 通知关闭</li><li>1： 通知开启</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>资产范围</p><p>枚举值：</p><ul><li>1： 全部主机</li><li>2： 自选主机</li><li>3： 按标签选择</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>通知选项</p><p>枚举值：</p><ul><li>CRITICAL： 告警等级：严重</li><li>HIGH： 告警等级：高危</li><li>MEDIUM： 告警等级：中危</li><li>LOW： 告警等级：低危</li><li>INFO： 告警等级：提醒</li><li>AGENT_UNINSTALL： 客户端卸载</li><li>AGENT_OFFLINE： 客户端离线</li></ul>
    */
    @SerializedName("Option")
    @Expose
    private String [] Option;

    /**
    * <p>通知模块（二级模块）</p>
    */
    @SerializedName("SubModule")
    @Expose
    private String SubModule;

    /**
    * <p>处置状态等</p>
    */
    @SerializedName("Item")
    @Expose
    private String [] Item;

    /**
     * Get <p>通知模块</p><p>枚举值：</p><ul><li>AkSk： 云API风险治理</li><li>Alert： 告警中心</li><li>Agent： 客户端</li></ul> 
     * @return Module <p>通知模块</p><p>枚举值：</p><ul><li>AkSk： 云API风险治理</li><li>Alert： 告警中心</li><li>Agent： 客户端</li></ul>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>通知模块</p><p>枚举值：</p><ul><li>AkSk： 云API风险治理</li><li>Alert： 告警中心</li><li>Agent： 客户端</li></ul>
     * @param Module <p>通知模块</p><p>枚举值：</p><ul><li>AkSk： 云API风险治理</li><li>Alert： 告警中心</li><li>Agent： 客户端</li></ul>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>通知设置模式</p><p>枚举值：</p><ul><li>0： 标准模式</li><li>1： 高级模式</li></ul> 
     * @return Mode <p>通知设置模式</p><p>枚举值：</p><ul><li>0： 标准模式</li><li>1： 高级模式</li></ul>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>通知设置模式</p><p>枚举值：</p><ul><li>0： 标准模式</li><li>1： 高级模式</li></ul>
     * @param Mode <p>通知设置模式</p><p>枚举值：</p><ul><li>0： 标准模式</li><li>1： 高级模式</li></ul>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>通知状态</p><p>枚举值：</p><ul><li>0： 通知关闭</li><li>1： 通知开启</li></ul> 
     * @return Status <p>通知状态</p><p>枚举值：</p><ul><li>0： 通知关闭</li><li>1： 通知开启</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>通知状态</p><p>枚举值：</p><ul><li>0： 通知关闭</li><li>1： 通知开启</li></ul>
     * @param Status <p>通知状态</p><p>枚举值：</p><ul><li>0： 通知关闭</li><li>1： 通知开启</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>通知开始时间</p><p>参数格式：hh:mm:ss</p> 
     * @return BeginTime <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
     * @param BeginTime <p>通知开始时间</p><p>参数格式：hh:mm:ss</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>通知结束时间</p><p>参数格式：hh:mm:ss</p> 
     * @return EndTime <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
     * @param EndTime <p>通知结束时间</p><p>参数格式：hh:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>资产范围</p><p>枚举值：</p><ul><li>1： 全部主机</li><li>2： 自选主机</li><li>3： 按标签选择</li></ul> 
     * @return AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>1： 全部主机</li><li>2： 自选主机</li><li>3： 按标签选择</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>资产范围</p><p>枚举值：</p><ul><li>1： 全部主机</li><li>2： 自选主机</li><li>3： 按标签选择</li></ul>
     * @param AssetRange <p>资产范围</p><p>枚举值：</p><ul><li>1： 全部主机</li><li>2： 自选主机</li><li>3： 按标签选择</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>通知选项</p><p>枚举值：</p><ul><li>CRITICAL： 告警等级：严重</li><li>HIGH： 告警等级：高危</li><li>MEDIUM： 告警等级：中危</li><li>LOW： 告警等级：低危</li><li>INFO： 告警等级：提醒</li><li>AGENT_UNINSTALL： 客户端卸载</li><li>AGENT_OFFLINE： 客户端离线</li></ul> 
     * @return Option <p>通知选项</p><p>枚举值：</p><ul><li>CRITICAL： 告警等级：严重</li><li>HIGH： 告警等级：高危</li><li>MEDIUM： 告警等级：中危</li><li>LOW： 告警等级：低危</li><li>INFO： 告警等级：提醒</li><li>AGENT_UNINSTALL： 客户端卸载</li><li>AGENT_OFFLINE： 客户端离线</li></ul>
     */
    public String [] getOption() {
        return this.Option;
    }

    /**
     * Set <p>通知选项</p><p>枚举值：</p><ul><li>CRITICAL： 告警等级：严重</li><li>HIGH： 告警等级：高危</li><li>MEDIUM： 告警等级：中危</li><li>LOW： 告警等级：低危</li><li>INFO： 告警等级：提醒</li><li>AGENT_UNINSTALL： 客户端卸载</li><li>AGENT_OFFLINE： 客户端离线</li></ul>
     * @param Option <p>通知选项</p><p>枚举值：</p><ul><li>CRITICAL： 告警等级：严重</li><li>HIGH： 告警等级：高危</li><li>MEDIUM： 告警等级：中危</li><li>LOW： 告警等级：低危</li><li>INFO： 告警等级：提醒</li><li>AGENT_UNINSTALL： 客户端卸载</li><li>AGENT_OFFLINE： 客户端离线</li></ul>
     */
    public void setOption(String [] Option) {
        this.Option = Option;
    }

    /**
     * Get <p>通知模块（二级模块）</p> 
     * @return SubModule <p>通知模块（二级模块）</p>
     */
    public String getSubModule() {
        return this.SubModule;
    }

    /**
     * Set <p>通知模块（二级模块）</p>
     * @param SubModule <p>通知模块（二级模块）</p>
     */
    public void setSubModule(String SubModule) {
        this.SubModule = SubModule;
    }

    /**
     * Get <p>处置状态等</p> 
     * @return Item <p>处置状态等</p>
     */
    public String [] getItem() {
        return this.Item;
    }

    /**
     * Set <p>处置状态等</p>
     * @param Item <p>处置状态等</p>
     */
    public void setItem(String [] Item) {
        this.Item = Item;
    }

    public NotifySetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifySetting(NotifySetting source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.Option != null) {
            this.Option = new String[source.Option.length];
            for (int i = 0; i < source.Option.length; i++) {
                this.Option[i] = new String(source.Option[i]);
            }
        }
        if (source.SubModule != null) {
            this.SubModule = new String(source.SubModule);
        }
        if (source.Item != null) {
            this.Item = new String[source.Item.length];
            for (int i = 0; i < source.Item.length; i++) {
                this.Item[i] = new String(source.Item[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "Option.", this.Option);
        this.setParamSimple(map, prefix + "SubModule", this.SubModule);
        this.setParamArraySimple(map, prefix + "Item.", this.Item);

    }
}

