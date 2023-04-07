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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Pod extends AbstractModel{

    /**
    * pod名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * pod的唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 服务付费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * pod的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * pod的IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * pod的创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 容器列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Containers")
    @Expose
    private Container Containers;

    /**
    * 容器列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerInfos")
    @Expose
    private Container [] ContainerInfos;

    /**
     * Get pod名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name pod名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set pod名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name pod名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get pod的唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uid pod的唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set pod的唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uid pod的唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 服务付费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 服务付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 服务付费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 服务付费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get pod的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phase pod的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set pod的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phase pod的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get pod的IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get pod的创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime pod的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set pod的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime pod的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 容器列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Containers 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Containers 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainers(Container Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 容器列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerInfos 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container [] getContainerInfos() {
        return this.ContainerInfos;
    }

    /**
     * Set 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerInfos 容器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerInfos(Container [] ContainerInfos) {
        this.ContainerInfos = ContainerInfos;
    }

    public Pod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Pod(Pod source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Containers != null) {
            this.Containers = new Container(source.Containers);
        }
        if (source.ContainerInfos != null) {
            this.ContainerInfos = new Container[source.ContainerInfos.length];
            for (int i = 0; i < source.ContainerInfos.length; i++) {
                this.ContainerInfos[i] = new Container(source.ContainerInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Containers.", this.Containers);
        this.setParamArrayObj(map, prefix + "ContainerInfos.", this.ContainerInfos);

    }
}

