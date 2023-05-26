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
package com.tencentcloudapi.memcached.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceListInfo extends AbstractModel{

    /**
    * 实例修改时间
    */
    @SerializedName("ModTimeStamp")
    @Expose
    private String ModTimeStamp;

    /**
    * 实例隔离时间
    */
    @SerializedName("IsolateTimeStamp")
    @Expose
    private String IsolateTimeStamp;

    /**
    * 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 仓库ID
    */
    @SerializedName("SetId")
    @Expose
    private Long SetId;

    /**
    * 实例当前状态，0：发货中；1：运行中；2：创建失败；4：销毁中；5：隔离中；6：下线中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例内置ID
    */
    @SerializedName("CmemId")
    @Expose
    private Long CmemId;

    /**
    * 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例描述信息
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * 过期策略
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * vpc网络下子网id 如：46315
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例创建时间
    */
    @SerializedName("AddTimeStamp")
    @Expose
    private String AddTimeStamp;

    /**
    * 区域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 计费模式：0-按量计费，1-包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * vpc网络id 如：75101
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例截止时间
    */
    @SerializedName("DeadlineTimeStamp")
    @Expose
    private String DeadlineTimeStamp;

    /**
    * vpc网络id 如：vpc-fk33jsf43kgv
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 实例vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vpc网络下子网id 如：subnet-fd3j6l35mm0
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 用户AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例端口号
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get 实例修改时间 
     * @return ModTimeStamp 实例修改时间
     */
    public String getModTimeStamp() {
        return this.ModTimeStamp;
    }

    /**
     * Set 实例修改时间
     * @param ModTimeStamp 实例修改时间
     */
    public void setModTimeStamp(String ModTimeStamp) {
        this.ModTimeStamp = ModTimeStamp;
    }

    /**
     * Get 实例隔离时间 
     * @return IsolateTimeStamp 实例隔离时间
     */
    public String getIsolateTimeStamp() {
        return this.IsolateTimeStamp;
    }

    /**
     * Set 实例隔离时间
     * @param IsolateTimeStamp 实例隔离时间
     */
    public void setIsolateTimeStamp(String IsolateTimeStamp) {
        this.IsolateTimeStamp = IsolateTimeStamp;
    }

    /**
     * Get 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费 
     * @return AutoRenewFlag 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     * @param AutoRenewFlag 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 仓库ID 
     * @return SetId 仓库ID
     */
    public Long getSetId() {
        return this.SetId;
    }

    /**
     * Set 仓库ID
     * @param SetId 仓库ID
     */
    public void setSetId(Long SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 实例当前状态，0：发货中；1：运行中；2：创建失败；4：销毁中；5：隔离中；6：下线中 
     * @return Status 实例当前状态，0：发货中；1：运行中；2：创建失败；4：销毁中；5：隔离中；6：下线中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例当前状态，0：发货中；1：运行中；2：创建失败；4：销毁中；5：隔离中；6：下线中
     * @param Status 实例当前状态，0：发货中；1：运行中；2：创建失败；4：销毁中；5：隔离中；6：下线中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例内置ID 
     * @return CmemId 实例内置ID
     */
    public Long getCmemId() {
        return this.CmemId;
    }

    /**
     * Set 实例内置ID
     * @param CmemId 实例内置ID
     */
    public void setCmemId(Long CmemId) {
        this.CmemId = CmemId;
    }

    /**
     * Get 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

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
     * Get 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本 
     * @return RegionId 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     * @param RegionId 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例描述信息 
     * @return InstanceDesc 实例描述信息
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set 实例描述信息
     * @param InstanceDesc 实例描述信息
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get 过期策略 
     * @return Expire 过期策略
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 过期策略
     * @param Expire 过期策略
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get vpc网络下子网id 如：46315 
     * @return SubnetId vpc网络下子网id 如：46315
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc网络下子网id 如：46315
     * @param SubnetId vpc网络下子网id 如：46315
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例创建时间 
     * @return AddTimeStamp 实例创建时间
     */
    public String getAddTimeStamp() {
        return this.AddTimeStamp;
    }

    /**
     * Set 实例创建时间
     * @param AddTimeStamp 实例创建时间
     */
    public void setAddTimeStamp(String AddTimeStamp) {
        this.AddTimeStamp = AddTimeStamp;
    }

    /**
     * Get 区域ID 
     * @return ZoneId 区域ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域ID
     * @param ZoneId 区域ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 计费模式：0-按量计费，1-包年包月 
     * @return PayMode 计费模式：0-按量计费，1-包年包月
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式：0-按量计费，1-包年包月
     * @param PayMode 计费模式：0-按量计费，1-包年包月
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get vpc网络id 如：75101 
     * @return VpcId vpc网络id 如：75101
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc网络id 如：75101
     * @param VpcId vpc网络id 如：75101
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例截止时间 
     * @return DeadlineTimeStamp 实例截止时间
     */
    public String getDeadlineTimeStamp() {
        return this.DeadlineTimeStamp;
    }

    /**
     * Set 实例截止时间
     * @param DeadlineTimeStamp 实例截止时间
     */
    public void setDeadlineTimeStamp(String DeadlineTimeStamp) {
        this.DeadlineTimeStamp = DeadlineTimeStamp;
    }

    /**
     * Get vpc网络id 如：vpc-fk33jsf43kgv 
     * @return UniqVpcId vpc网络id 如：vpc-fk33jsf43kgv
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc网络id 如：vpc-fk33jsf43kgv
     * @param UniqVpcId vpc网络id 如：vpc-fk33jsf43kgv
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 实例vip 
     * @return Vip 实例vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例vip
     * @param Vip 实例vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vpc网络下子网id 如：subnet-fd3j6l35mm0 
     * @return UniqSubnetId vpc网络下子网id 如：subnet-fd3j6l35mm0
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set vpc网络下子网id 如：subnet-fd3j6l35mm0
     * @param UniqSubnetId vpc网络下子网id 如：subnet-fd3j6l35mm0
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 用户AppID 
     * @return AppId 用户AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppID
     * @param AppId 用户AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例端口号 
     * @return Vport 实例端口号
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例端口号
     * @param Vport 实例端口号
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public InstanceListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceListInfo(InstanceListInfo source) {
        if (source.ModTimeStamp != null) {
            this.ModTimeStamp = new String(source.ModTimeStamp);
        }
        if (source.IsolateTimeStamp != null) {
            this.IsolateTimeStamp = new String(source.IsolateTimeStamp);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SetId != null) {
            this.SetId = new Long(source.SetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CmemId != null) {
            this.CmemId = new Long(source.CmemId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AddTimeStamp != null) {
            this.AddTimeStamp = new String(source.AddTimeStamp);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DeadlineTimeStamp != null) {
            this.DeadlineTimeStamp = new String(source.DeadlineTimeStamp);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTimeStamp", this.ModTimeStamp);
        this.setParamSimple(map, prefix + "IsolateTimeStamp", this.IsolateTimeStamp);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CmemId", this.CmemId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AddTimeStamp", this.AddTimeStamp);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "DeadlineTimeStamp", this.DeadlineTimeStamp);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

