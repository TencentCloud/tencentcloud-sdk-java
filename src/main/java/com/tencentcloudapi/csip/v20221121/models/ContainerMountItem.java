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

public class ContainerMountItem extends AbstractModel {

    /**
    * <p>挂载类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>宿主机路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>容器内路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>挂载模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>是否可读写</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RW")
    @Expose
    private Boolean RW;

    /**
    * <p>传播方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Propagation")
    @Expose
    private String Propagation;

    /**
    * <p>挂载名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>驱动名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
     * Get <p>挂载类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>挂载类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>挂载类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>挂载类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>宿主机路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source <p>宿主机路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>宿主机路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source <p>宿主机路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>容器内路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destination <p>容器内路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>容器内路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destination <p>容器内路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>挂载模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode <p>挂载模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>挂载模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode <p>挂载模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>是否可读写</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RW <p>是否可读写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRW() {
        return this.RW;
    }

    /**
     * Set <p>是否可读写</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RW <p>是否可读写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRW(Boolean RW) {
        this.RW = RW;
    }

    /**
     * Get <p>传播方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Propagation <p>传播方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPropagation() {
        return this.Propagation;
    }

    /**
     * Set <p>传播方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Propagation <p>传播方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropagation(String Propagation) {
        this.Propagation = Propagation;
    }

    /**
     * Get <p>挂载名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>挂载名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>挂载名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>挂载名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>驱动名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Driver <p>驱动名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set <p>驱动名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Driver <p>驱动名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public ContainerMountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerMountItem(ContainerMountItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RW != null) {
            this.RW = new Boolean(source.RW);
        }
        if (source.Propagation != null) {
            this.Propagation = new String(source.Propagation);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Driver != null) {
            this.Driver = new String(source.Driver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "RW", this.RW);
        this.setParamSimple(map, prefix + "Propagation", this.Propagation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Driver", this.Driver);

    }
}

