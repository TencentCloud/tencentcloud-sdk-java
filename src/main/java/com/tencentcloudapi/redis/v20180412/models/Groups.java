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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Groups extends AbstractModel{

    /**
    * 用户AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 地域ID 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 复制组信息
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 复制组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 复制组状态，37："绑定复制组中"，38："复制组重连中"，51："解绑复制组中"，52："复制组实例切主中"，53："角色变更中"
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 复制组数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 复制组实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instances")
    @Expose
    private Instances [] Instances;

    /**
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get 地域ID 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本 
     * @return RegionId 地域ID 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     * @param RegionId 地域ID 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 复制组信息 
     * @return GroupId 复制组信息
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 复制组信息
     * @param GroupId 复制组信息
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 复制组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 复制组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 复制组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 复制组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 复制组状态，37："绑定复制组中"，38："复制组重连中"，51："解绑复制组中"，52："复制组实例切主中"，53："角色变更中" 
     * @return Status 复制组状态，37："绑定复制组中"，38："复制组重连中"，51："解绑复制组中"，52："复制组实例切主中"，53："角色变更中"
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 复制组状态，37："绑定复制组中"，38："复制组重连中"，51："解绑复制组中"，52："复制组实例切主中"，53："角色变更中"
     * @param Status 复制组状态，37："绑定复制组中"，38："复制组重连中"，51："解绑复制组中"，52："复制组实例切主中"，53："角色变更中"
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 复制组数量 
     * @return InstanceCount 复制组数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 复制组数量
     * @param InstanceCount 复制组数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 复制组实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instances 复制组实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Instances [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 复制组实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instances 复制组实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstances(Instances [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Groups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Groups(Groups source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Instances != null) {
            this.Instances = new Instances[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new Instances(source.Instances[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

