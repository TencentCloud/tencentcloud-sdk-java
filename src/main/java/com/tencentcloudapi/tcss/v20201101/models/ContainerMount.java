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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerMount extends AbstractModel{

    /**
    * 挂载类型 bind
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 宿主机路径
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 容器内路径
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * 模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 读写权限
    */
    @SerializedName("RW")
    @Expose
    private Boolean RW;

    /**
    * 传播类型
    */
    @SerializedName("Propagation")
    @Expose
    private String Propagation;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 驱动
    */
    @SerializedName("Driver")
    @Expose
    private String Driver;

    /**
     * Get 挂载类型 bind 
     * @return Type 挂载类型 bind
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 挂载类型 bind
     * @param Type 挂载类型 bind
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 宿主机路径 
     * @return Source 宿主机路径
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 宿主机路径
     * @param Source 宿主机路径
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 容器内路径 
     * @return Destination 容器内路径
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set 容器内路径
     * @param Destination 容器内路径
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get 模式 
     * @return Mode 模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模式
     * @param Mode 模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 读写权限 
     * @return RW 读写权限
     */
    public Boolean getRW() {
        return this.RW;
    }

    /**
     * Set 读写权限
     * @param RW 读写权限
     */
    public void setRW(Boolean RW) {
        this.RW = RW;
    }

    /**
     * Get 传播类型 
     * @return Propagation 传播类型
     */
    public String getPropagation() {
        return this.Propagation;
    }

    /**
     * Set 传播类型
     * @param Propagation 传播类型
     */
    public void setPropagation(String Propagation) {
        this.Propagation = Propagation;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 驱动 
     * @return Driver 驱动
     */
    public String getDriver() {
        return this.Driver;
    }

    /**
     * Set 驱动
     * @param Driver 驱动
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public ContainerMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerMount(ContainerMount source) {
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

