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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataAssetMapping extends AbstractModel{

    /**
    * 资产主IP地址(公网IP)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIp")
    @Expose
    private String AssetIp;

    /**
    * 资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产ID(各模块间通用)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instid")
    @Expose
    private String Instid;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产可用区(英文)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetRegionEn")
    @Expose
    private String AssetRegionEn;

    /**
    * 资产可用区(中文)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetRegionCn")
    @Expose
    private String AssetRegionCn;

    /**
    * 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetNetwork")
    @Expose
    private String AssetNetwork;

    /**
    * 资产运行状态(英文)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetStatusEn")
    @Expose
    private String AssetStatusEn;

    /**
    * 资产运行状态(中文)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetStatusCn")
    @Expose
    private String AssetStatusCn;

    /**
    * 是否白名单：“True”为白名单不测绘，默认“False”正常测绘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWhite")
    @Expose
    private String IsWhite;

    /**
    * 资产测绘状态(“unstart”未开始/“running”测绘中/“finish”已完成/“abandoned”任务中止)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 资产标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 资产组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private String [] Group;

    /**
    * 端口和服务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 组件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 资产实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetInstanceType")
    @Expose
    private String AssetInstanceType;

    /**
    * 资产是否是内网类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIntranet")
    @Expose
    private Long IsIntranet;

    /**
     * Get 资产主IP地址(公网IP)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetIp 资产主IP地址(公网IP)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetIp() {
        return this.AssetIp;
    }

    /**
     * Set 资产主IP地址(公网IP)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetIp 资产主IP地址(公网IP)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetIp(String AssetIp) {
        this.AssetIp = AssetIp;
    }

    /**
     * Get 资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产ID(各模块间通用)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instid 资产ID(各模块间通用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstid() {
        return this.Instid;
    }

    /**
     * Set 资产ID(各模块间通用)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instid 资产ID(各模块间通用)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstid(String Instid) {
        this.Instid = Instid;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 资产可用区(英文)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetRegionEn 资产可用区(英文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetRegionEn() {
        return this.AssetRegionEn;
    }

    /**
     * Set 资产可用区(英文)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetRegionEn 资产可用区(英文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetRegionEn(String AssetRegionEn) {
        this.AssetRegionEn = AssetRegionEn;
    }

    /**
     * Get 资产可用区(中文)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetRegionCn 资产可用区(中文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetRegionCn() {
        return this.AssetRegionCn;
    }

    /**
     * Set 资产可用区(中文)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetRegionCn 资产可用区(中文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetRegionCn(String AssetRegionCn) {
        this.AssetRegionCn = AssetRegionCn;
    }

    /**
     * Get 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetNetwork 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetNetwork() {
        return this.AssetNetwork;
    }

    /**
     * Set 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetNetwork 资产所属网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetNetwork(String AssetNetwork) {
        this.AssetNetwork = AssetNetwork;
    }

    /**
     * Get 资产运行状态(英文)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetStatusEn 资产运行状态(英文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetStatusEn() {
        return this.AssetStatusEn;
    }

    /**
     * Set 资产运行状态(英文)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetStatusEn 资产运行状态(英文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetStatusEn(String AssetStatusEn) {
        this.AssetStatusEn = AssetStatusEn;
    }

    /**
     * Get 资产运行状态(中文)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetStatusCn 资产运行状态(中文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetStatusCn() {
        return this.AssetStatusCn;
    }

    /**
     * Set 资产运行状态(中文)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetStatusCn 资产运行状态(中文)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetStatusCn(String AssetStatusCn) {
        this.AssetStatusCn = AssetStatusCn;
    }

    /**
     * Get 是否白名单：“True”为白名单不测绘，默认“False”正常测绘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWhite 是否白名单：“True”为白名单不测绘，默认“False”正常测绘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsWhite() {
        return this.IsWhite;
    }

    /**
     * Set 是否白名单：“True”为白名单不测绘，默认“False”正常测绘
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWhite 是否白名单：“True”为白名单不测绘，默认“False”正常测绘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWhite(String IsWhite) {
        this.IsWhite = IsWhite;
    }

    /**
     * Get 资产测绘状态(“unstart”未开始/“running”测绘中/“finish”已完成/“abandoned”任务中止)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资产测绘状态(“unstart”未开始/“running”测绘中/“finish”已完成/“abandoned”任务中止)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资产测绘状态(“unstart”未开始/“running”测绘中/“finish”已完成/“abandoned”任务中止)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资产测绘状态(“unstart”未开始/“running”测绘中/“finish”已完成/“abandoned”任务中止)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 资产标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 资产标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 资产标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 资产标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 资产组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group 资产组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGroup() {
        return this.Group;
    }

    /**
     * Set 资产组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group 资产组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(String [] Group) {
        this.Group = Group;
    }

    /**
     * Get 端口和服务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口和服务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口和服务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口和服务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 组件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Component 组件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Component 组件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 资产实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetInstanceType 资产实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetInstanceType() {
        return this.AssetInstanceType;
    }

    /**
     * Set 资产实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetInstanceType 资产实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetInstanceType(String AssetInstanceType) {
        this.AssetInstanceType = AssetInstanceType;
    }

    /**
     * Get 资产是否是内网类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIntranet 资产是否是内网类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsIntranet() {
        return this.IsIntranet;
    }

    /**
     * Set 资产是否是内网类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIntranet 资产是否是内网类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIntranet(Long IsIntranet) {
        this.IsIntranet = IsIntranet;
    }

    public DataAssetMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataAssetMapping(DataAssetMapping source) {
        if (source.AssetIp != null) {
            this.AssetIp = new String(source.AssetIp);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.Instid != null) {
            this.Instid = new String(source.Instid);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetRegionEn != null) {
            this.AssetRegionEn = new String(source.AssetRegionEn);
        }
        if (source.AssetRegionCn != null) {
            this.AssetRegionCn = new String(source.AssetRegionCn);
        }
        if (source.AssetNetwork != null) {
            this.AssetNetwork = new String(source.AssetNetwork);
        }
        if (source.AssetStatusEn != null) {
            this.AssetStatusEn = new String(source.AssetStatusEn);
        }
        if (source.AssetStatusCn != null) {
            this.AssetStatusCn = new String(source.AssetStatusCn);
        }
        if (source.IsWhite != null) {
            this.IsWhite = new String(source.IsWhite);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.Group != null) {
            this.Group = new String[source.Group.length];
            for (int i = 0; i < source.Group.length; i++) {
                this.Group[i] = new String(source.Group[i]);
            }
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.AssetInstanceType != null) {
            this.AssetInstanceType = new String(source.AssetInstanceType);
        }
        if (source.IsIntranet != null) {
            this.IsIntranet = new Long(source.IsIntranet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetIp", this.AssetIp);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "Instid", this.Instid);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetRegionEn", this.AssetRegionEn);
        this.setParamSimple(map, prefix + "AssetRegionCn", this.AssetRegionCn);
        this.setParamSimple(map, prefix + "AssetNetwork", this.AssetNetwork);
        this.setParamSimple(map, prefix + "AssetStatusEn", this.AssetStatusEn);
        this.setParamSimple(map, prefix + "AssetStatusCn", this.AssetStatusCn);
        this.setParamSimple(map, prefix + "IsWhite", this.IsWhite);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamArraySimple(map, prefix + "Group.", this.Group);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "AssetInstanceType", this.AssetInstanceType);
        this.setParamSimple(map, prefix + "IsIntranet", this.IsIntranet);

    }
}

